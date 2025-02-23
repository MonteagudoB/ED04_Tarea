package cuentas;



/**
 * Esta clase simula una cuenta bancaria, incluye métodos de ingreso y retirada de la cuenta
 * @author borja mf
 * @version 1
 * @since 1
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * Constructor por defecto
 */
    public CCuenta()
    {
    }
/**
 * Constructor con todas las variables de clase
 * @param nom Nombre propietario de la cuenta
 * @param cue Cadena caracteres de cuenta bancaria
 * @param sal Saldo cuenta bancaria
 * @param tipo Tipo interés de la cuenta bancaria
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * Getter estado de la cuenta
 * @return Saldo
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Método void que ingresa saldo en el Saldo de la cuenta
 * @param cantidad Cantidad ingresada
 * @throws Exception Excepción en caso de ingreso de una cantidad negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método void que retira saldo del Saldo de la cuenta 
 * @param cantidad Cantidad retirada
 * @throws Exception Excepción en caso que no haya saldo o retire una cantidad negativa
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * Getter de tipo de interés
 * @return Devuelve el tipo de interés
 */
	private double getTipoInterés() {
		return tipoInterés;
	}
/**
 * Setter de tipo de interés
 * @param tipoInterés Tipo de interés pasado por parámetro
 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
/**
 * Getter de saldo
 * @return Devuelve el saldo actual
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * Setter que establece el saldo de la cuenta
 * @param saldo  Saldo establecido para la cuenta
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Getter de cuenta
 * @return Devuelve el IBAN de la cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * Setter de cuenta
 * @param cuenta Establece por parámetro el IBAN de la cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Getter de nombre
 * @return Devuelve el nombre del propietario de la cuenta
 */
	private String getNombre() {
		return nombre;
	}
/**
 * Setter de nombre
 * @param nombre Establece el nombre del propietario por parámetro
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
