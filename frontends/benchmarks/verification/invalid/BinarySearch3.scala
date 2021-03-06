import stainless.lang._

object BinarySearch3 {

  def search(arr: Array[Int], x: Int, lo: Int, hi: Int): Boolean = {
    require(0 <= lo && lo <= hi+1 && hi < arr.length)
    if (lo <= hi) {
      val i = (lo + hi) / 2
      val y = arr(i)
      if (x == y) true
      else if (x < y) search(arr, x, lo, i-1)
      else search(arr, x, i+1, hi)
    } else {
      false
    }
  }
}
