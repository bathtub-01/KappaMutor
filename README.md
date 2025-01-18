KappaMutor
=======================

This repository contains the [Chisel](https://www.chisel-lang.org/) implementation of the KappaMutor processor.

KappaMutor is special-purpose processor for non-strict functional languages. It is part of the [HAFLANG](https://haflang.github.io/) project.

KappaMutor implements [structured combinator](https://ieeexplore.ieee.org/abstract/document/9857579) graph reduction. The architecture design is inspired by the [Reduceron processor](https://mn416.github.io/reduceron-project/).

With an [accompanied compiler](https://github.com/bathtub-01/MicroHs) which is extended from [MicroHs](https://github.com/augustss/MicroHs), KappaMutor supports Haskell as its input language.

## Dependencies

To build this project, you should have [sbt](https://www.scala-sbt.org/) and [Chisel](https://www.chisel-lang.org/docs/installation) dependencies installed.

You also need an [espresso](https://www.chisel-lang.org/api/latest/chisel3/util/experimental/decode/EspressoMinimizer$.html) executable in your system path.

## Usage

To generate the SystemVerilog file of the processor, simply run `sbt "runMain mutator.DataPath"`. The generated file will be placed under `./sv-gen/`. You can change the parameters of the processor by configuring `./src/main/scala/common/SystemConfig.scala`.

To run the test with Chisel's simulation framework, run `sbt 'testOnly mutator.AllBenchmarks'`. This will run our compiled Haskell benchmark programs (under `./src/main/scala/benchmarks/`) on KappaMutor. Simulation logs will be generated at `./simu-out/`.

## License

This project is released under the [GPL-2.0](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html) license.
