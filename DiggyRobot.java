public class DiggyRobot{
	public static void main(String args[]){
		int x=0,y=0,NORTH = 1,EAST = 2,SOUTH = 3,WEST = 4,add_1 = 1,add_2 = 1,add_3 = -1,add_4 = -1,directionNum = 0;
		int multiplierVal[] = {0,1,1,-1,-1};
		String direction[] = {" ","NORTH","EAST", "SOUTH","WEST"};
		String presDir,path,pathInput;
		pathInput = args[3];
		try{
    		x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
		}catch(NumberFormatException e) {
    			System.out.println("Please Enter Valid Co-ordinates");
		}
		presDir = args[2];
		
		if(presDir != "NORTH" || presDir != "EAST" || presDir != "SOUTH" || presDir != "WEST"){
			System.out.println("Please Enter Valid Direction");
		}
		char[] ch = new char[pathInput.length()]; 
  
        	for (int i = 0; i < pathInput.length(); i++) { 
            		ch[i] = pathInput.charAt(i); 
        	} 
		for(int i = 0; i < ch.length; i++ ){
			switch(ch[i]){
						case 'R':
							if(presDir == "WEST"){
								directionNum = WEST;
							}else {
								directionNum++;
							}
							break;
                		case 'L':
            				if(presDir == "NORTH"){
                    				directionNum = NORTH;
            				} else {
                    				directionNum--;
            				}
            				break;
                		case 'W':
                		    int multiplier = multiplierVal[directionNum];
							if(directionNum % 2 == 1){
							    y += (ch[i+1] * multiplier);
							} else {
							    x += (ch[i+1] * multiplier);
								
							}
							i++;
                       		 			break;
						default:
							System.out.println("Wrong Input");
							break;

			}
		}
		int position=0;
		if(presDir == "NORTH"){
		  position = 1;  
		}else if(presDir == "EAST"){
		     position = 2;
		}else if(presDir == "SOUTH"){
		     position = 3;
		}else if(presDir == "WEST"){
		     position = 4;
		}
		System.out.println(x+" "+y+" "+direction[position]+"\n");
	}
}
