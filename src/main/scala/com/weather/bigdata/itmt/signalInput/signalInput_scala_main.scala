package com.weather.bigdata.itmt.signalInput

import org.apache.log4j.Logger

trait signalInput_scala_main {
  private val log:Logger=Logger.getRootLogger
  final def main(args:Array[String]): Unit ={
    val className:String=args(0)
    val signalMsg:String=args(1)
    val splitFile:String=args(2)
    this.log.info("hello signalInput_mainClass")
    try{
      this.log.info("className="+className)
      //      val jarFile="file:D:/WorkSpcae/IDEA/jar1/target/jar1-1.0-SNAPSHOT.jar"
      //      val url1 :URL= new URL(jarFile)
      //      val myClassLoader1:URLClassLoader  = new URLClassLoader(Array( url1 ), Thread.currentThread().getContextClassLoader())
      //      val clazz=myClassLoader1.loadClass(className)

      val clazz=Class.forName(className)
      val thego:signalInput_scala=clazz.newInstance().asInstanceOf[signalInput_scala]

      val flag=thego.strategy(signalMsg,splitFile)
      if(flag){
        thego.truedone(signalMsg,splitFile)
      }else{
        thego.falsedone(signalMsg,splitFile)
      }
    }catch{
      case e:Exception=>{
        this.log.error(e)
        e.printStackTrace()
      }
    }
  }
}
