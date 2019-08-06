package by.itiu.dziad.lab11.poezd.model.entity.carriages;

public class Carriage {
	public static final int MIN_COST_FOR_ONE_ZONE = 0;

	private double adultPassagerOneZoneCost;

	public Carriage() {
		adultPassagerOneZoneCost = MIN_COST_FOR_ONE_ZONE;
	}

	public Carriage(double adultPassagerOneZoneCost) {
		if (adultPassagerOneZoneCost > MIN_COST_FOR_ONE_ZONE) {
			this.adultPassagerOneZoneCost = adultPassagerOneZoneCost;
		} else {
			adultPassagerOneZoneCost = MIN_COST_FOR_ONE_ZONE;
		}
	}

	public Carriage(Carriage carriage) {
		this.adultPassagerOneZoneCost = carriage.adultPassagerOneZoneCost;
	}

	public double getAdultPassagerOneZoneCost() {
		return adultPassagerOneZoneCost;
	}

	public void setAdultPassagerOneZoneCost(double adultPassagerOneZoneCost) {
		if (adultPassagerOneZoneCost > MIN_COST_FOR_ONE_ZONE) {
			this.adultPassagerOneZoneCost = adultPassagerOneZoneCost;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(adultPassagerOneZoneCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carriage other = (Carriage) obj;
		if (Double.doubleToLongBits(adultPassagerOneZoneCost) != Double
				.doubleToLongBits(other.adultPassagerOneZoneCost))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Carriage [adultPassagerOneZoneCost = " + adultPassagerOneZoneCost + "]";
	}
	

}
