public class TV {
	private String color;
	private boolean power;
	private int channel;
	
	public void power() {
		if(power == true) {
			power = false;
		} else {
			power = true;
		}
	}
	
	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}	
}