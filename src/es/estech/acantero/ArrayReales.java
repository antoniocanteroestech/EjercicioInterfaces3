package es.estech.acantero;

import java.util.Arrays;

public class ArrayReales implements Estadisticas {
    double[] data;

    public ArrayReales(double[] data) {
        this.data = data;
    }

    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ArrayReales{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    @Override
    public double minimo() {
        double minimo = this.data[0];
        for (int i = 1; i < this.data.length; i++){
            if (this.data[i] < minimo) minimo = this.data[i];
        }

        return minimo;
    }

    @Override
    public double maximo() {
        double[] copyData = data;
        Arrays.sort(copyData);
        return copyData[copyData.length-1];
    }

    @Override
    public double sumatorio() {
        return 0;
    }
}
