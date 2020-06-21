public class DiggyRobot{
	public static void main(String args[]){
		int x,y,NORTH = 1,EAST = 2,SOUTH = 3,WEST = 4,add_1 = 1,add_2 = 1,add_3 = -1,add_4 = -1,directionNum = 0;
		String direction[] = [" ","NORTH","EAST", "SOUTH","WEST"];
		String presDir,path;
		pathInput = args[4];
		try {
    			x = Integer.parseInt(args[1]));
			y = Integer.parseInt(args[2]));
		}(NumberFormatException e) {
    			System.out.println("Please Enter Valid Co-ordinates");
		}
		presDir = args[3];
		if(presDir != 'NORTH' && presDir != 'EAST' && presDir != 'SOUTH' && presDir != 'WEST'){
			System.out.println("Please Enter Valid Direction");
		}
		char[] ch = new char[pathInput.length()]; 
  
        	for (int i = 0; i < pathInput.length(); i++) { 
            		ch[i] = pathInput.charAt(i); 
        	} 
		for(int i = 0; i < ch.length; $i++ ){
			switch(ch[i]){
						case 'R':
							if(strcmp(presDir,'WEST')){
								directionNum = WEST;
							} else {
								directionNum++;
							}
							break;
                				case 'L':
                        				if(strcmp(presDir,'NORTH')){
                                				directionNum = NORTH;
                        				} else {
                                				directionNum--;
                        				}
                        				break;
                				case 'W':
							if( !(directionNum % 2) ){
								x += (ch[i+1] * "add_"+directionNum);
							} else {
								y += (ch[i+1] * "add_"+directionNum);
							}
							i++;
                       		 			break;
						case default:
							System.out.println("Wrong Input");
							break;

			}
		}
		System.out.println(x+" "+y+" "+direction[presDir]+"\n";
	}
}
