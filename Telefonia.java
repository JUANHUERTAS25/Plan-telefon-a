public class Telefonia {
    //-----------
    //Atributos
    //----------
    private String numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private static int precioMinuto = 200;
    private int precio;

    //----------
    //Métodos
    //----------

    //Constructor por defecto
    public Telefonia()
    {
        numeroCelular = "3143843604";
        cantidadMinutos = 10;
        operador = "movilujo";
    }

    //Constructor común u ordinario
    public Telefonia(String numCelular, String operador, int cantidadMinutos)
    {
        this.numeroCelular = numCelular;
        this.cantidadMinutos = cantidadMinutos;
        this.operador = operador;
        this.precio = 0;
    
    }

    //Constructor de copia
    public Telefonia(Telefonia t)
    {
        numeroCelular = t.getNumeroCelular();
        operador = t.getOperador();
        cantidadMinutos = t.getCantidadMinutos();
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getCantidadMinutos() {
        return cantidadMinutos;
    }
    
    public void setCantidadMinutos(int cantidadMinutos) {
        this.cantidadMinutos = cantidadMinutos;
    }

    public void precio()
    {
        if(operador.equals("movilujo"))
        {
            precio = cantidadMinutos * precioMinuto;
            precio = (50*precio)/100; 
        }
        else
        {
            precio = cantidadMinutos * precioMinuto;
        }
    }
    

    public String toString()
    {
        return numeroCelular + "," + operador + "," + cantidadMinutos + "," + precio;
    }
    
    //Método ejecutable
    public static void main(String[] args) 
    {
        Telefonia t1 = new Telefonia();
        t1.precio();
        System.out.println("Objeto 1: " + t1.toString());
        Telefonia t2 = new Telefonia("3152252395","movistar",10);
        t2.precio();
        System.out.println("Objeto 2: " + t2.toString());
        Telefonia t3 = new Telefonia(t2);
        t3.precio();
        System.out.println("Objeto 3: " + t3.toString());
        Telefonia t4 = new Telefonia("3252342508","movilujo",5);
        t4.precio();
        System.out.println("Objeto 4: " + t4.toString());        
    }
}
