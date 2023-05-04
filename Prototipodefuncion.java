
package prototipodefuncion;

/**
 *
 * @author Usuario
 */
public class Prototipodefuncion {

/* Prototipo */
int addition(int, int);
/* Función principal */
int main() 
{
    int i, j;

    i = 10;
    j = 20;
    /* Invocación de la función */
    i += addition(i, j);
}
/* Definición de la función */
int addition(int a, int b) 
{
    return (a + b);
    }
}