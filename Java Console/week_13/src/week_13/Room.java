package week_13;

public class Room extends Job {
	int area;
	float unit_price;
	int time;
	
	Room(int area, float unit_price, int time, float hourly_rate)
	{
		super(hourly_rate);
		this.area = area;
		this.unit_price = unit_price;
		this.time = time;
	}
	
	
	@Override
	float calculate_cost()
	{
		float cost = this.time * hourly_rate;
		cost += this.area * this.unit_price;
		return cost;
	}
}
