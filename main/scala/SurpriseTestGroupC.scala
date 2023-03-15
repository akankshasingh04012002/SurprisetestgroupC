object SurpriseTestGroupC extends App{
  //square a list of integers and display count of even and odd values in the list
  def Test(n: Int): Int = {
    val num = (1, 2, 3, 4, 5)
    val evenCount = 0
    val oddCount = 0
val result = num*2

      if (result % 2 == 0) {
        evenCount += 1
        println(evenCount)
      } else {
        oddCount += 1
        println(oddCount)
      }

  }

}


