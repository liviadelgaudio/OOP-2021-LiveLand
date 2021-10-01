package view.model.activity;

public class ViewActivityImpl implements ViewActivity {
	
	private int capacity;
	private int minPrice;
	private int maxPrice;
	private ActivityType activityType;
	
	//costruttore valido per giostre, sia per bambini che per adulti
	public ViewActivityImpl(int capacity, ActivityType activityType) {
		this.capacity = capacity;
//		this.minPrice = 0;
//		this.maxPrice = 0;
		this.activityType = activityType;
	}
	
	//costruttore valido per shop e risto
	public ViewActivityImpl(int minPrice, int maxPrice, ActivityType activityType) {
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.activityType = activityType;
	}

	@Override
	public int getCapacity() {
		return this.capacity;
	}

	@Override
	public int getMinPrice() {
		return this.minPrice;
	}

	@Override
	public int getMaxPrice() {
		return this.maxPrice;
	}

	@Override
	public ActivityType getActivityType() {
		return this.activityType;
	}

}
