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
				// tokenize
				st = new StringTokenizer(section, ":")
				if(st.countTokens() > 2){
					words :String = "";
					while (st.hasMoreTokens()){
						words[idx]=st.nextToken(); idx++;
					}
					words
				}
					
			}else{
				// it is most probably top level section i.e production
				"Top level environment"
			}	
		}
}

