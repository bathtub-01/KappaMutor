.PHONY: test run help

# Default target
help:
	@echo "Usage:"
	@echo "  make test <TestClassName>  - Run specific test class"
	@echo "  make run <MainClass>       - Run specific main class"
	@echo ""
	@echo "Examples:"
	@echo "  make test gcd.GCDSpec      - Runs: sbt --mem 8000 'testOnly gcd.GCDSpec -- -DemitVcd=1'"
	@echo "  make run gcd.GCD           - Runs: sbt --mem 8000 'runMain gcd.GCD'"

# Test target that takes the test class as an argument
test-vcd:
	@if [ "$(filter-out test-vcd,$(MAKECMDGOALS))" = "" ]; then \
		echo "Error: Please specify a test class name"; \
		echo "Usage: make test-vcd <TestClassName>"; \
		echo "Example: make test-vcd gcd.GCDSpec"; \
		exit 1; \
	fi
	sbt --mem 16000 'testOnly $(filter-out test-vcd,$(MAKECMDGOALS)) -- -DemitVcd=1 -DfirtoolOpts=-disable-all-randomization'
	
test:
	@if [ "$(filter-out test,$(MAKECMDGOALS))" = "" ]; then \
		echo "Error: Please specify a test class name"; \
		echo "Usage: make test <TestClassName>"; \
		echo "Example: make test gcd.GCDSpec"; \
		exit 1; \
	fi
	sbt --mem 16000 'testOnly $(filter-out test,$(MAKECMDGOALS)) -- -DfirtoolOpts=-disable-all-randomization "-DchiselOpts=--warn-conf any:s"'

# Run target that takes the main class as an argument
run:
	@if [ "$(filter-out run,$(MAKECMDGOALS))" = "" ]; then \
		echo "Error: Please specify a main class name"; \
		echo "Usage: make run <MainClassName>"; \
		echo "Example: make run gcd.GCD"; \
		exit 1; \
	fi
	sbt --mem 16000 'runMain $(filter-out run,$(MAKECMDGOALS))'

# This prevents make from treating the test class name as a target
%:
	@:
	
clean-sv:
