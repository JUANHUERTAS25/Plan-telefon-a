public class Telefonia {
    //-----------
    //Atributos
    //----------
    private String numeroCelular;
    private String operador;
    private int cantidadMinutos;
    private int precioMinuto;
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
        precioMinuto = 200;
    }

    //Constructor común u ordinario
    public Telefonia(String numCelular, String operador, int cantidadMinutos, int precioMinuto)
    {
        this.numeroCelular = numCelular;
        this.cantidadMinutos = cantidadMinutos;
        this.operador = operador;
        this.precioMinuto = precioMinuto;
        this.precio = 0;
    
    }

    //Constructor de copia
    public Telefonia(Telefonia t)
    {
        numeroCelular = t.getNumeroCelular();
        operador = t.getOperador();
        cantidadMinutos = t.getCantidadMinutos();
        precioMinuto = t.getPrecioMinuto();
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

    public int getPrecioMinuto() {
        return precioMinuto;
    }

    public void setPrecioMinuto(int precioMinuto) {
        this.precioMinuto = precioMinuto;
    }

    public void precio()
    {
        precio = cantidadMinutos * precioMinuto;
        if(operador.equals("movilujo"))
        {
            precio = cantidadMinutos * precioMinuto;
            precio = (50*precio)/100; 
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
        Telefonia t2 = new Telefonia("3152252395","movistar",10,200);
        t2.precio();
        System.out.println("Objeto 2: " + t2.toString());
        Telefonia t3 = new Telefonia(t2);
        t3.precio();
        System.out.println("Objeto 3: " + t3.toString());
        Telefonia t4 = new Telefonia("3252342508","movilujo",5,100);
        t4.precio();
        System.out.println("Objeto 4: " + t4.toString());        
    }
}
