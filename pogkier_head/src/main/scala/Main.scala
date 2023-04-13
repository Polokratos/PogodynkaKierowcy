@main def main: Unit = 
  println("Hello world!")
  println(msg)
  
  val r = requests.get("https://api.github.com/events")


def msg = "I was compiled by Scala 3. :)"
