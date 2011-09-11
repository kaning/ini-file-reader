object IniFileParser {
	
	def isEnvSection (text :String) =
		if(text.startsWith("[") && text.endsWith("]")) {
			 true
		}else{
			 false
		}
	
	
	def getEnvSection (section : String, env : String) =
		if (isEnvSection(section) && section.contains(env)){
			if(section.contains(":")){
				section
			}else{
				// it is most probably top level section i.e production
				"Top level environment"
			}	
		}
	
}

