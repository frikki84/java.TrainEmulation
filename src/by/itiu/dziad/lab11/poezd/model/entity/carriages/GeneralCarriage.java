package by.itiu.dziad.lab11.poezd.model.entity.carriages;

public class GeneralCarriage extends Carriage {
	public static final int SEATS_NUMBER_IN_GENERAL_CARRIAGE = 81;
	public static final double MIN_ADULT_PASSAGER_ONE_ZONE_COST_IN_RUB = 1.5;

	private int seatsNumber;

	public GeneralCarriage() {
		seatsNumber = SEATS_NUMBER_IN_GENERAL_CARRIAGE;
		super.setAdultPassagerOneZoneCost(MIN_ADULT_PASSAGER_ONE_ZONE_COST_IN_RUB);

	}

	public GeneralCarriage(double adultPassagerOneZoneCost) {
		seatsNumber = SEATS_NUMBER_IN_GENERAL_CARRIAGE;

		if (adultPassagerOneZoneCost > MIN_ADULT_PASSAGER_ONE_ZONE_COST_IN_RUB) {
			super.setAdultPassagerOneZoneCost(adultPassagerOneZoneCost);
		} else {
			super.setAdultPassagerOneZoneCost(MIN_ADULT_PASSAGER_ONE_ZONE_COST_IN_RUB);
		}
	}

	public GeneralCarriage(GeneralCarriage carriage) {
		this.seatsNumber = carriage.seatsNumber;
		super.setAdultPassagerOneZoneCost(carriage.getAdultPassagerOneZoneCost());

	}

	public int getSeatsNumber() {
		return seatsNumber;
	}

	public void setSeatsNumber(int seatsNumber) {
		if (seatsNumber < SEATS_NUMBER_IN_GENERAL_CARRIAGE) {
			this.seatsNumber = seatsNumber;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + seatsNumber;
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
		GeneralCarriage other = (GeneralCarriage) obj;
		if (seatsNumber != other.seatsNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GeneralCarriage [seatsNumber=" + seatsNumber + ", adultPassagerOneZoneCost="
				+ super.getAdultPassagerOneZoneCost() + "]\n";
	}

}
