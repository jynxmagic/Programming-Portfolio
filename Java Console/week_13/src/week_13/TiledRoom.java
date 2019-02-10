package week_13;

public class TiledRoom extends Room {
	int grouting;

	TiledRoom(int area, float unit_price, int time, float hourly_rate)
	{
		super(area, unit_price, time, (hourly_rate * 1.5f));
		this.grouting = area;
	}
	
	@Override
	float calculate_cost()
	{
		float cost = this.time * hourly_rate;
		cost += this.area * this.unit_price;
		cost += grouting;
		return cost;
	}
}