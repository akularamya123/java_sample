class colorSwitch
{
	public static void main(String args[])
	{
		char color='r';
		switch(color)
		{
			case 'r':System.out.println("red");	break;
			case 'b': System.out.println("blue");	break;
			case 'g': System.out.println("Green");	break;
			case 'y': System.out.println("yellow");	break;
			case 'w': System.out.println("white");	break;
			default: System.out.println("No color selected");
		}
	}
}