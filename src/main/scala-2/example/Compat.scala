package example

object compat {
  type Tuple = shapeless.HList
  type EmptyTuple = shapeless.HNil
  val EmptyTuple: EmptyTuple = shapeless.HNil
  type *:[+H, +T <: Tuple] = shapeless.::[H, T]

  final class TupleOps[T <: Tuple](private val t: T) extends AnyVal {
    final def *:[H](h: H): shapeless.::[H, T] = new shapeless.::[H, T](h, t)
  }

  implicit def toTupleOps[T <: Tuple](t: T): TupleOps[T] = new TupleOps(t)
}
