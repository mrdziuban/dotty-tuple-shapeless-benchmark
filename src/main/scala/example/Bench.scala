package example

import compat._
import org.openjdk.jmh.annotations._

@State(Scope.Benchmark)
class Tuples {
  final val t1 = 1 *: EmptyTuple
  final val t2 = 1 *: 2 *: EmptyTuple
  final val t3 = 1 *: 2 *: 3 *: EmptyTuple
  final val t4 = 1 *: 2 *: 3 *: 4 *: EmptyTuple
  final val t5 = 1 *: 2 *: 3 *: 4 *: 5 *: EmptyTuple
  final val t6 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: EmptyTuple
  final val t7 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: EmptyTuple
  final val t8 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: EmptyTuple
  final val t9 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: EmptyTuple
  final val t10 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: EmptyTuple
  final val t11 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: EmptyTuple
  final val t12 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: EmptyTuple
  final val t13 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: EmptyTuple
  final val t14 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: EmptyTuple
  final val t15 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: EmptyTuple
  final val t16 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: EmptyTuple
  final val t17 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: EmptyTuple
  final val t18 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: EmptyTuple
  final val t19 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: EmptyTuple
  final val t20 = 1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: EmptyTuple
}

class Bench {
  @Benchmark
  def tuple1(t: Tuples): Unit = {
    t.t1.head
  }

  @Benchmark
  def tuple2(t: Tuples): Unit = {
    t.t2.head + t.t2.tail.head
  }

  @Benchmark
  def tuple3(t: Tuples): Unit = {
    t.t3.head + t.t3.tail.head + t.t3.tail.tail.head
  }

  @Benchmark
  def tuple4(t: Tuples): Unit = {
    t.t4.head + t.t4.tail.head + t.t4.tail.tail.head + t.t4.tail.tail.tail.head
  }

  @Benchmark
  def tuple5(t: Tuples): Unit = {
    t.t5.head + t.t5.tail.head + t.t5.tail.tail.head + t.t5.tail.tail.tail.head + t.t5.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple6(t: Tuples): Unit = {
    t.t6.head + t.t6.tail.head + t.t6.tail.tail.head + t.t6.tail.tail.tail.head + t.t6.tail.tail.tail.tail.head + t.t6.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple7(t: Tuples): Unit = {
    t.t7.head + t.t7.tail.head + t.t7.tail.tail.head + t.t7.tail.tail.tail.head + t.t7.tail.tail.tail.tail.head + t.t7.tail.tail.tail.tail.tail.head + t.t7.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple8(t: Tuples): Unit = {
    t.t8.head + t.t8.tail.head + t.t8.tail.tail.head + t.t8.tail.tail.tail.head + t.t8.tail.tail.tail.tail.head + t.t8.tail.tail.tail.tail.tail.head + t.t8.tail.tail.tail.tail.tail.tail.head + t.t8.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple9(t: Tuples): Unit = {
    t.t9.head + t.t9.tail.head + t.t9.tail.tail.head + t.t9.tail.tail.tail.head + t.t9.tail.tail.tail.tail.head + t.t9.tail.tail.tail.tail.tail.head + t.t9.tail.tail.tail.tail.tail.tail.head + t.t9.tail.tail.tail.tail.tail.tail.tail.head + t.t9.tail.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple10(t: Tuples): Unit = {
    t.t10.head + t.t10.tail.head + t.t10.tail.tail.head + t.t10.tail.tail.tail.head + t.t10.tail.tail.tail.tail.head + t.t10.tail.tail.tail.tail.tail.head + t.t10.tail.tail.tail.tail.tail.tail.head + t.t10.tail.tail.tail.tail.tail.tail.tail.head + t.t10.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t10.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple11(t: Tuples): Unit = {
    t.t11.head + t.t11.tail.head + t.t11.tail.tail.head + t.t11.tail.tail.tail.head + t.t11.tail.tail.tail.tail.head + t.t11.tail.tail.tail.tail.tail.head + t.t11.tail.tail.tail.tail.tail.tail.head + t.t11.tail.tail.tail.tail.tail.tail.tail.head + t.t11.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t11.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t11.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple12(t: Tuples): Unit = {
    t.t12.head + t.t12.tail.head + t.t12.tail.tail.head + t.t12.tail.tail.tail.head + t.t12.tail.tail.tail.tail.head + t.t12.tail.tail.tail.tail.tail.head + t.t12.tail.tail.tail.tail.tail.tail.head + t.t12.tail.tail.tail.tail.tail.tail.tail.head + t.t12.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t12.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t12.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t12.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple13(t: Tuples): Unit = {
    t.t13.head + t.t13.tail.head + t.t13.tail.tail.head + t.t13.tail.tail.tail.head + t.t13.tail.tail.tail.tail.head + t.t13.tail.tail.tail.tail.tail.head + t.t13.tail.tail.tail.tail.tail.tail.head + t.t13.tail.tail.tail.tail.tail.tail.tail.head + t.t13.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t13.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t13.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t13.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t13.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple14(t: Tuples): Unit = {
    t.t14.head + t.t14.tail.head + t.t14.tail.tail.head + t.t14.tail.tail.tail.head + t.t14.tail.tail.tail.tail.head + t.t14.tail.tail.tail.tail.tail.head + t.t14.tail.tail.tail.tail.tail.tail.head + t.t14.tail.tail.tail.tail.tail.tail.tail.head + t.t14.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t14.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t14.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t14.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t14.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t14.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple15(t: Tuples): Unit = {
    t.t15.head + t.t15.tail.head + t.t15.tail.tail.head + t.t15.tail.tail.tail.head + t.t15.tail.tail.tail.tail.head + t.t15.tail.tail.tail.tail.tail.head + t.t15.tail.tail.tail.tail.tail.tail.head + t.t15.tail.tail.tail.tail.tail.tail.tail.head + t.t15.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t15.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t15.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t15.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t15.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t15.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t15.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple16(t: Tuples): Unit = {
    t.t16.head + t.t16.tail.head + t.t16.tail.tail.head + t.t16.tail.tail.tail.head + t.t16.tail.tail.tail.tail.head + t.t16.tail.tail.tail.tail.tail.head + t.t16.tail.tail.tail.tail.tail.tail.head + t.t16.tail.tail.tail.tail.tail.tail.tail.head + t.t16.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t16.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t16.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t16.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t16.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t16.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t16.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t16.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple17(t: Tuples): Unit = {
    t.t17.head + t.t17.tail.head + t.t17.tail.tail.head + t.t17.tail.tail.tail.head + t.t17.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t17.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple18(t: Tuples): Unit = {
    t.t18.head + t.t18.tail.head + t.t18.tail.tail.head + t.t18.tail.tail.tail.head + t.t18.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t18.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple19(t: Tuples): Unit = {
    t.t19.head + t.t19.tail.head + t.t19.tail.tail.head + t.t19.tail.tail.tail.head + t.t19.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t19.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  }

  @Benchmark
  def tuple20(t: Tuples): Unit = {
    t.t20.head + t.t20.tail.head + t.t20.tail.tail.head + t.t20.tail.tail.tail.head + t.t20.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head + t.t20.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.tail.head
  }
}
