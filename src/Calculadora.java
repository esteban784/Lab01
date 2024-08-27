
class Calculadora {
    public float num1,num2,resultado;
  
  public void suma(){
      resultado=num1+num2;
  
  }
   public void resta(){
      resultado=num1-num2;
  
  }
    public void multiplicacion(){
      resultado=num1*num2;
  
  }
     public void divicion(){
      resultado=num1/num2;
  
  }
    public void sen(){
    resultado = (float) Math.sin(num1);

  
  }
    public void cos(){
      resultado= (float) Math.cos(num1);
  
  }
    public void tan(){
      resultado=(float) Math.tan(num1);

  
  }
   public void raizEnesima(float indice) {
        resultado = (float) Math.pow(num1, 1.0 / indice);
    }
   public void potenciaEnesima(float exponente) {
    resultado = (float) Math.pow(num1, exponente);
  
  }
    public void iva(float monto, float porcentajeIVA) {
        resultado = monto * (porcentajeIVA / 100);
    }
 
}
    
  


