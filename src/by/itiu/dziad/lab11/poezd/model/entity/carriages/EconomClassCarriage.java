package by.itiu.dziad.lab11.poezd.model.entity.carriages;

public class EconomClassCarriage extends GeneralCarriage {
	public static final int SEATS_NUMBER_IN_ECONOM_CLASS_CARRIAGE = 54;
	public static final double ADULT_PASSAGER_ONE_ZONE_COST_IN_ECONOM_CLASS = 2.0;
	public static final double LINENS_COST_IN_ECONOM_CLASS = 2.;

	private double linensCost;

	public EconomClassCarriage() {
		super.setSeatsNumber(SEATS_NUMBER_IN_ECONOM_CLASS_CARRIAGE);
		super.setAdultPassagerOneZoneCost(ADULT_PASSAGER_ONE_ZONE_COST_IN_ECONOM_CLASS);
		linensCost = LINENS_COST_IN_ECONOM_CLASS;
	}

	public EconomClassCarriage(double linensCost) {
		super.setSeatsNumber(SEATS_NUMBER_IN_ECONOM_CLASS_CARRIAGE);
		super.setAdultPassagerOneZoneCost(ADULT_PASSAGER_ONE_ZONE_COST_IN_ECONOM_CLASS);
		this.linensCost = linensCost;
	}

	public EconomClassCarriage(double adultPassagerOneZoneCost, double linensCost) {
		super.setSeatsNumber(SEATS_NUMBER_IN_ECONOM_CLASS_CARRIAGE);
		if (adultPassagerOneZoneCost > super.getAdultPassagerOneZoneCost()) {
			super.setAdultPassagerOneZoneCost(adultPassagerOneZoneCost);
		}
		if (linensCost > LINENS_COST_IN_ECONOM_CLASS) {
			this.linensCost = LINENS_COST_IN_ECONOM_CLASS;
		}
	}

	public EconomClassCarriage(EconomClassCarriage carriage) {
		super.setSeatsNumber(carriage.getSeatsNumber());
		super.setAdultPassagerOneZoneCost(carriage.getAdultPassagerOneZoneCost());
		this.linensCost = carriage.linensCost;
	}

	public double getLinensCost() {
		return linensCost;
	}

	public void setLinensCost(double linensCost) {
		if (linensCost > LINENS_COST_IN_ECONOM_CLASS) {
			this.linensCost = linensCost;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(linensCost);
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
		EconomClassCarriage other = (EconomClassCarriage) obj;
		if (Double.doubleToLongBits(linensCost) != Double.doubleToLongBits(other.linensCost))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EconomClassCarriage [seatsNumber=" + super.getSeatsNumber() + ", adultPassagerOneZoneCost="
				+ super.getAdultPassagerOneZoneCost() + ", linensCost = " + linensCost + "]\n";
	}

}
