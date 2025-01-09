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

To generate the SystemVerilog file of the processor, simply run `sbt "runMain mutator.DataPath"`. You can change the parameters of the processor by configuring `./src/main/scala/common/SystemConfig.scala`.

To run the test with Chisel's simulation framework, run `sbt 'testOnly mutator.DataPathWave'`. This will run a compiled Haskell program on KappaMutor. A simulation log will be printed.

## License

