import scala.io.Source
import scala.collection.mutable.Set
import scala.collection.mutable.Map
import IniFileParser._

object Main { 
	
	def main(args: Array[String]) { 
		println("Ini File Parser V 0.1")
		if (args.length > 0){
			if(args.length > 1){	
				val env:String = args(0)
				val envMap = Map[Int, String]()	
				val propsMap = Map[Int, String]()	
				val cache = Set[String]()	
				
				for(line <- Source.fromFile(args(0)).getLines){
					if(!line.isEmpty()){
						cache += line
					}
				}
				println(cache)
			}else{
				Console.err.println("Please provide environment");
			}
		}else{
			Console.err.println("Please enter filename");
		}
	} 
}
