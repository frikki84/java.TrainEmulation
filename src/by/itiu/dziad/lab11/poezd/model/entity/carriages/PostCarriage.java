package by.itiu.dziad.lab11.poezd.model.entity.carriages;

public class PostCarriage extends GeneralCarriage {
	public static final int SEATS_NUMBER_IN_POST_CARRIAGE = 0;
	public static final double MIN_POST_CARRIAGE_CAPACITY = 20;
	public static final double MIN_COST_FOR_ONE_ZONE_PER_1_TONN_POST_CARRIAGE = 7;

	private double postCarriageCapacity;

	public PostCarriage() {
		postCarriageCapacity = MIN_POST_CARRIAGE_CAPACITY;
		super.setSeatsNumber(SEATS_NUMBER_IN_POST_CARRIAGE);
		super.setAdultPassagerOneZoneCost(MIN_COST_FOR_ONE_ZONE_PER_1_TONN_POST_CARRIAGE);
	}

	public PostCarriage(double postCarriageCapacity) {
		if (postCarriageCapacity > MIN_POST_CARRIAGE_CAPACITY) {
			this.postCarriageCapacity = postCarriageCapacity;
		} else {
			this.postCarriageCapacity = MIN_POST_CARRIAGE_CAPACITY;
		}
		super.setSeatsNumber(SEATS_NUMBER_IN_POST_CARRIAGE);
		super.setAdultPassagerOneZoneCost(MIN_COST_FOR_ONE_ZONE_PER_1_TONN_POST_CARRIAGE);
	}

	public PostCarriage(double postCarriageCapacity, double adultPassagerOneZoneCost) {
		if (postCarriageCapacity > MIN_POST_CARRIAGE_CAPACITY) {
			this.postCarriageCapacity = postCarriageCapacity;
		} else {
			this.postCarriageCapacity = MIN_POST_CARRIAGE_CAPACITY;
		}

		if (adultPassagerOneZoneCost > MIN_COST_FOR_ONE_ZONE_PER_1_TONN_POST_CARRIAGE) {
			super.setAdultPassagerOneZoneCost(adultPassagerOneZoneCost);
		} else {
			super.setAdultPassagerOneZoneCost(MIN_COST_FOR_ONE_ZONE_PER_1_TONN_POST_CARRIAGE);
		}

		super.setSeatsNumber(SEATS_NUMBER_IN_POST_CARRIAGE);

	}

	public PostCarriage(PostCarriage carriage) {
		this.postCarriageCapacity = carriage.postCarriageCapacity;
		super.setAdultPassagerOneZoneCost(carriage.getAdultPassagerOneZoneCost());
		super.setSeatsNumber(carriage.getSeatsNumber());
	}

	public double getPostCarriageCapacity() {
		return postCarriageCapacity;
	}

	public void setPostCarriageCapacity(double postCarriageCapacity) {
		if (postCarriageCapacity > MIN_POST_CARRIAGE_CAPACITY) {
			this.postCarriageCapacity = postCarriageCapacity;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(postCarriageCapacity);
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
		PostCarriage other = (PostCarriage) obj;
		if (Double.doubleToLongBits(postCarriageCapacity) != Double.doubleToLongBits(other.postCarriageCapacity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PostCarriage [seatsNumber=" + super.getSeatsNumber() +", adultPassagerOneZoneCost=" + super.getAdultPassagerOneZoneCost()
				+ ", postCarriageCapacity = " + postCarriageCapacity + "]\n";
	}

}
