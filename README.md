# Latte Compiler
### Michał Filipiuk 385423


#### Building
Run `make` in project root

#### Running
Run `./latc_llvm` and pass the path to the code as the program argument.  
E.g.`./latc_llvm input.lat` and the compiled file will be named `input.bc`.

### Implemented optimizations
1. Global common subexpression elimination
    ```
    int main ()
    {
      int a = readInt ();
      printInt (a + 20);
      int b;
      if (a > 0)
      {
        printInt (a + 20);
        b = a + 10;
        printInt (b);
      }
      printInt (a + 10);
      return 0;
    }
    ```
2. Using registers and phi instructions
3. Precalculating constant expressions on booleans, integers and strings  
    ```
    int main ()
    {
      int a = 2 + 2 * 2;
      printInt (a);
      return 0;
    }
    ```
4. Unwrapping if body if condition is always true or false
    ```
    int main ()
    {
      int a = readInt ();
      if (true && (false || true) || a > 10)
      {
        printInt (1);
      }
      else
      {
        printInt (2);
      }
      return 0;
    }
    ```
5. Only used strings are declared
    ```
    int main ()
    {
      string ala = "ala", space = " ", ma = "ma", kota = "kota";
      printString (ala + space + ma + space + kota);
      return 0;
    }
    ```
6. Only used functions are declared
    ```
    int main ()
    {
      readInt ();
      return 0;
    }
    void a ()
    {
      printInt (1);
    }
    ```