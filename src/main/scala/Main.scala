import scala.io.Source
import scala.collection.mutable.Map

object QuickTickets { 
	def main(args: Array[String]) { 
		println("Quick tickets V 0.1")
		val initLines = Map[Int, String]()
		var counter:Int = 0
		if (args.length > 0){
			for(line <- Source.fromFile(args(0)).getLines){
				initLines += (counter -> line)
				counter + 1
			}
			println(initLines(0))
		}else{
			Console.err.println("Please enter filename");
		}
	} 
}
