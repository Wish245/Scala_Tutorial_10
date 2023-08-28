object TemperatureConverter {
  def calculateAverage(temperatures: List[Double]): Double = {
  val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
  val totalFahrenheit = fahrenheitTemperatures.reduce((temp1, temp2) => temp1 + temp2)
  val averageFahrenheit = totalFahrenheit / fahrenheitTemperatures.length
  averageFahrenheit
}

  def main(args: Array[String]): Unit = {
    val temperaturesCelsius = List(0.0,10.0,20.0,30.0)
    val averageFahrenheit = calculateAverage(temperaturesCelsius)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
}
}