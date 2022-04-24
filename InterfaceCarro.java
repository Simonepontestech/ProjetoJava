
public interface InterfaceCarro {
	  int turn(EnumDirecao direction, double radius, double startSpeed, double endSpeed);
	  int changeLanes(EnumDirecao direction, double startSpeed, double endSpeed);
	  int signalTurn(EnumDirecao direction, boolean signalOn);
	  int getRadarFront(double distanceToCar, double speedOfCar);
	  int getRadarRear(double distanceToCar, double speedOfCar);
}
