package by.itiu.dziad.lab11.poezd.model.entity.carriages;

public class SleepingCarriage extends EconomClassCarriage {
	public static final int SEATS_NUMBER_IN_SLEEPING_CARRIAGE = 18;
	public static final double ADULT_PASSAGER_ONE_ZONE_COST_IN_SLEEPING_CARRIAGE = 3.2;
	public static final double LINENS_COST_IN_SLEEPING_CARRIAGE = 2.6;
	public static final double MIN_DINNER_COST = 5.1;

	private double dinnerCost;

	public SleepingCarriage() {
		super.setSeatsNumber(SEATS_NUMBER_IN_SLEEPING_CARRIAGE);
		super.setAdultPassagerOneZoneCost(ADULT_PASSAGER_ONE_ZONE_COST_IN_SLEEPING_CARRIAGE);
		super.setLinensCost(LINENS_COST_IN_SLEEPING_CARRIAGE);
		dinnerCost = MIN_DINNER_COST;
	}

	public SleepingCarriage(double dinnerCost) {
		super.setSeatsNumber(SEATS_NUMBER_IN_SLEEPING_CARRIAGE);
		super.setAdultPassagerOneZoneCost(ADULT_PASSAGER_ONE_ZONE_COST_IN_SLEEPING_CARRIAGE);
		super.setLinensCost(LINENS_COST_IN_SLEEPING_CARRIAGE);

		if (dinnerCost > MIN_DINNER_COST) {
			this.dinnerCost = dinnerCost;
		}
	}

	public SleepingCarriage(double linensCost, double dinnerCost) {
		super.setSeatsNumber(SEATS_NUMBER_IN_SLEEPING_CARRIAGE);
		super.setAdultPassagerOneZoneCost(ADULT_PASSAGER_ONE_ZONE_COST_IN_SLEEPING_CARRIAGE);

		if (linensCost > super.getLinensCost()) {
			super.setLinensCost(linensCost);
		}

		if (dinnerCost > MIN_DINNER_COST) {
			this.dinnerCost = dinnerCost;
		}
	}

	public SleepingCarriage(double adultPassagerOneZoneCost, double linensCost, double dinnerCost) {
		super.setSeatsNumber(SEATS_NUMBER_IN_SLEEPING_CARRIAGE);
		if (adultPassagerOneZoneCost > super.getAdultPassagerOneZoneCost()) {
			super.setAdultPassagerOneZoneCost(adultPassagerOneZoneCost);
		}

		if (linensCost > super.getLinensCost()) {
			super.setLinensCost(linensCost);
		}

		if (dinnerCost > MIN_DINNER_COST) {
			this.dinnerCost = dinnerCost;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(dinnerCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SleepingCarriage other = (SleepingCarriage) obj;
		if (Double.doubleToLongBits(dinnerCost) != Double.doubleToLongBits(other.dinnerCost))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SleepingCarriage [seatsNumber=" + super.getSeatsNumber() + ", adultPassagerOneZoneCost="
				+ super.getAdultPassagerOneZoneCost() + ", linensCost = " + super.getLinensCost() + ", dinnerCost = "
				+ dinnerCost + "]\n";
	}

}
