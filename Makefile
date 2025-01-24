.PHONY: sv-clean test-clean simu-clean simu only

sv-clean:
	rm -f ./sv-gen/*

test-clean:
	rm -f -r ./test-gen/*
	
simu-clean:
	rm -f ./simu-out/*
	
simu: simu-out/results.csv

simu-out/results.csv: simu-out/comb-count.csv simu-out/app-count.csv simu-out/running-cycle.csv simu-out/heap-alloc.csv
	cd ./simu-out/ ; \
	join -t ',' -1 1 -2 1 comb-count.csv app-count.csv > combined1.csv ; \
	join -t ',' -1 1 -2 1 combined1.csv running-cycle.csv > combined2.csv ; \
	join -t ',' -1 1 -2 1 combined2.csv heap-alloc.csv > results ; \
	rm ./*.csv ; \
	mv ./results ./results.csv

simu-out/comb-count.csv simu-out/app-count.csv simu-out/running-cycle.csv simu-out/heap-alloc.csv:
	mkdir simu-out/ -p
	rm -f ./simu-out/*
	sbt --mem 4096 'testOnly benchmarks.AllBenchmarks'

only: 
	sbt --mem 4096 'testOnly mutator.DataPathWave'
