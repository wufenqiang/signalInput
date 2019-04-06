package com.weather.bigdata.itmt.signalInput

trait signalInput_scala {
  def strategy (signalJson: String, splitFile: String): Boolean
  def truedone(signalJson: String, splitFile: String):Unit
  def falsedone(signalJson: String, splitFile: String):Unit
}
