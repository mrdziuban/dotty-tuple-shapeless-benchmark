# Scala 2 `HList` vs. Scala 3 `Tuple` benchmark

See [`Bench.scala`](src/main/scala/example/Bench.scala) for the code. The results are:

|Tuple length|Scala 2 ops/sec|Scala 3 ops/sec|Result|
|---|---|---|---|
|Bench.tuple1|1,536,141,511.438|1,194,554,983.211|Scala 3 was 0.29x slower|
|Bench.tuple2|709,112,815.234|798,294,669.806|Scala 3 was 0.11x faster|
|Bench.tuple3|460,209,368.433|701,381,213.794|Scala 3 was 0.34x faster|
|Bench.tuple4|328,424,029.071|546,218,115.091|Scala 3 was 0.4x faster|
|Bench.tuple5|253,139,474.58|484,040,221.724|Scala 3 was 0.48x faster|
|Bench.tuple6|201,026,722.629|407,247,858.274|Scala 3 was 0.51x faster|
|Bench.tuple7|165,422,664.28|360,111,558.067|Scala 3 was 0.54x faster|
|Bench.tuple8|140,456,939.221|314,849,098.938|Scala 3 was 0.55x faster|
|Bench.tuple9|120,872,916.614|1,758,126.206|Scala 3 was 67.75x slower|
|Bench.tuple10|104,107,528.805|1,028,006.489|Scala 3 was 100.27x slower|
|Bench.tuple11|93,116,521.068|658,178.961|Scala 3 was 140.48x slower|
|Bench.tuple12|84,214,086.013|416,804.282|Scala 3 was 201.05x slower|
|Bench.tuple13|76,133,902.01|260,802.297|Scala 3 was 290.92x slower|
|Bench.tuple14|69,767,359.268|222,614.79|Scala 3 was 312.4x slower|
|Bench.tuple15|45,176,759.525|183,346.896|Scala 3 was 245.4x slower|
|Bench.tuple16|39,987,684.907|103,203.102|Scala 3 was 386.47x slower|
|Bench.tuple17|36,045,565.112|44,686.053|Scala 3 was 805.64x slower|
|Bench.tuple18|33,312,208.672|41,188.012|Scala 3 was 807.78x slower|
|Bench.tuple19|30,735,169.775|26,175.637|Scala 3 was 1173.19x slower|
|Bench.tuple20|28,497,256.741|28,377.668|Scala 3 was 1003.21x slower|
