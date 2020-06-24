public class DiggyRobot{
	public static void main(String args[]){
		final int NORTH = 1,EAST = 2,SOUTH = 3,WEST = 4;
		int x=0,y=0,directionNum = 0;
		int multiplierVal[] = {0,1,1,-1,-1};
		String direction[] = {" ","NORTH","EAST", "SOUTH","WEST"};
		String presDir,pathInput;
		pathInput = args[3];
		try{
    		x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
		}catch(NumberFormatException e) {
    			System.out.println("Please Enter Valid Co-ordinates");
		}
		presDir = args[2];
		if(presDir.equals("NORTH")){
		  directionNum = 1;  
		}else if(presDir.equals("EAST")){
		     directionNum = 2;
		}else if(presDir.equals("SOUTH")){
		     directionNum = 3;
		}else if(presDir.equals("WEST")){
		     directionNum = 4;
		}
		
		if(presDir.equals("NORTH") || presDir.equals("EAST") || presDir.equals("SOUTH") || presDir.equals("WEST")){
		
		}else{
		    	System.out.println("Please Enter Valid Direction");
		}
		char[] ch = new char[pathInput.length()]; 
  
        	for (int i = 0; i < pathInput.length(); i++) { 
            		ch[i] = pathInput.charAt(i); 
        	} 
		for(int i = 0; i < ch.length; i++ ){
			switch(ch[i]){
						case 'R':
							if(presDir.equals("WEST")){
								directionNum = WEST;
							}else {
								directionNum++;
							}
							break;
                		case 'L':
            				if(presDir.equals("NORTH")){
                    				directionNum = NORTH;
            				} else {
                    				directionNum--;
            				}
            				break;
                		case 'W':
                		    int multiplier = multiplierVal[directionNum];
							if(directionNum % 2 == 1){
							    y = (ch[i+1] * multiplier);
							} else {
							    x = (ch[i+1] * multiplier);
								
							}
							i++;
                       		 			break;
						default:
							System.out.println("Wrong Input");
							break;

			}
		}
		System.out.println(x+" "+y+" "+direction[directionNum]+"\n");
	}
}
