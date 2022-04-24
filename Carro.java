//TED de Interface - Met. Av. Prog


public class Carro implements InterfaceCarro {
	  double startSpeed;
	  double endSpeed;
	  double radius;
	  EnumDirecao direction;
	  boolean signalOn;
	  
	    @Override
	    public int turn(EnumDirecao direction, double radius, double startSpeed, double endSpeed) {
	    	return 0;     
	    };

	    @Override
	    public int changeLanes(EnumDirecao direction, double startSpeed, double endSpeed) {
	    	          // M�todo
	    };
	    
	    @Override
	    public int signalTurn(EnumDirecao direction, boolean signalOn) {
	    			// M�todo
	    };
	        
	    @Override
	    public int getRadarFront(double distanceToCar, double speedOfCar) {

	                // M�todo
	    };
	    @Override
	    public int getRadarRear(double distanceToCar, double speedOfCar) {
	    	        // M�todo 
	    }

		
	    
	    
	    
	    
	    

		
	               
	
	