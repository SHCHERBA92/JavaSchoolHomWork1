package Sortirivka;

public class Sortirovka {
    //private int number;
    private int[] mass;

    public Sortirovka(int[] mass) {
      //  this.number = number;
        this.mass = mass;
    }

    public Sortirovka() {
    }

    public int[] sortirovkaPuzirkomToUp()
    {


        int tempValue = 0;
        int i ;

        for ( i = 1; i < this.mass.length; )
        {
            if (this.mass[i-1] > this.mass[i])
            {
                tempValue = this.mass[i];
                this.mass[i] = this.mass[i-1];
                this.mass[i-1] = tempValue;
                i = 1;
            }
            else
            {
                i++;
            }
        }
        return this.mass;
    }

    public int[] fasterSortirovkaPuzirkomToUp()
    {
        int tempValue = 0;
        int i ;
        boolean flag;
        do
        {
            for ( i = 1 , flag = false; i < this.mass.length; i++)
            {
                if (this.mass[i-1] > this.mass[i])
                {
                    tempValue = this.mass[i];
                    this.mass[i] = this.mass[i-1];
                    this.mass[i-1] = tempValue;
                    flag = true;
                }

            }
        }while (flag);

        return this.mass;
    }

    public int[] sortirovkaPuzirkomToDown()
    {
        int tempValue = 0;
        int i ;

        for ( i = 1; i < this.mass.length; )
        {
            if (this.mass[i-1] < this.mass[i])
            {
                tempValue = this.mass[i];
                this.mass[i] = this.mass[i-1];
                this.mass[i-1] = tempValue;
                i = 1;
            }
            else
            {
                i++;
            }
        }
        return this.mass;
    }

    public int[] fasterSortirovkaPuzirkomToDown()
    {
        int tempValue = 0;
        int i ;
        boolean flag;
        do
        {
            for ( i = 1 , flag = false; i < this.mass.length; i++)
            {
                if (this.mass[i-1] < this.mass[i])
                {
                    tempValue = this.mass[i];
                    this.mass[i] = this.mass[i-1];
                    this.mass[i-1] = tempValue;
                    flag = true;
                }

            }
        }while (flag);

        return this.mass;
    }

}
