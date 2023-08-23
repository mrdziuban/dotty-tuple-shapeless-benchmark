# Scala 2 `HList` vs. Scala 3 `Tuple` benchmark

See [`Bench.scala`](src/main/scala/example/Bench.scala) for the code.

To run the benchmarks, clone this repo, `cd` into it, and run:

```bash
sbt '; +clean; +compile; +Jmh/run -i 5 -wi 5 -f1 -t1 .*'
```

With openjdk 17.0.8, the results are:

|Tuple length|Scala 2 ops/sec|Scala 3 ops/sec|Result|
|---|---|---|---|
|Bench.tuple1|1,708,686,946.139|1,265,625,955.239|0.35 slower|
|Bench.tuple2|904,069,646.12|994,750,255.74|0.09 faster|
|Bench.tuple3|618,423,441.023|734,906,755.379|0.16 faster|
|Bench.tuple4|467,023,943.944|566,609,027.541|0.18 faster|
|Bench.tuple5|367,271,606.603|468,779,249.954|0.22 faster|
|Bench.tuple6|294,544,201.748|13,998,683.856|20.04 slower|
|Bench.tuple7|187,921,981.767|4,277,711.389|42.93 slower|
|Bench.tuple8|165,280,897.911|3,502,807.182|46.19 slower|
|Bench.tuple9|144,285,876.226|1,306,077.683|109.47 slower|
|Bench.tuple10|126,815,462.085|726,719.421|173.5 slower|
|Bench.tuple11|122,486,549.773|480,679.855|253.82 slower|
|Bench.tuple12|106,524,206.166|342,765.202|309.78 slower|
|Bench.tuple13|97,749,408.818|271,655.336|358.83 slower|
|Bench.tuple14|89,301,860.032|57,993.935|1538.85 slower|
|Bench.tuple15|78,402,881.366|47,096.577|1663.73 slower|
|Bench.tuple16|73,760,091.85|39,051.46|1887.79 slower|
|Bench.tuple17|50,770,952.422|32,255.351|1573.03 slower|
|Bench.tuple18|23,069,814.687|27,314.013|843.61 slower|
|Bench.tuple19|12,504,174.656|23,235.298|537.15 slower|
|Bench.tuple20|11,406,337.782|19,964.454|570.33 slower|
