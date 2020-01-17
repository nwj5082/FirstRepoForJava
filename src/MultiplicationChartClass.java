public class MultiplicationChartClass implements MultiplicationChartInterface{
    private Integer num;

    public MultiplicationChartClass(int x)
    {
        num = x;
    }

    @Override
    public void displayChart() {
        System.out.print(" X |");
        for(int i = 0; i < num; i++)
        {
            System.out.format("%4s", i+1);
        }
        System.out.print("\n---|");
        for(int i = 0; i < num; i++)
        {
            System.out.print("----");
        }
        for(int i = 0; i < num; i++)
        {
            System.out.format("\n%2s",(i+1));
            System.out.print(" |");
            for(int j = 0; j < num; j++)
            {
                System.out.format("%4s", ((i+1) * (j+1)));
            }
        }
    }
}
