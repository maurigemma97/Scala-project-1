import java.io.File
import java.io.PrintWriter
import scala.io.Source
object Write{
	def main(args: Array[String]):Unit = {
		val writer = new PrintWriter(new File("mytext.txt"))
		writer.write("This is" + "\n")
		writer.write("for" + "\n")
		writer.write("task one" + "\n")
		writer.close()
		Source.fromFile("mytext.txt").foreach{x => print(x)}
	}
}
