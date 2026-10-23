class Parziale1 {
  static void esegui(char[] c, String s, int v) {
    char[] a = c;
    int i = 0, j = 0, k = 0;
    boolean[] b = new boolean[a.length];
    for (i = 0; i < a.length; i++) {
      j = 0;
      k = 0;
      while (j < s.length() && !b[i]) {
        if (a[i] != s.charAt(j)) {
          k++;
          if (k > v) {
            b[i] = true;
          }
        }
        j++;
      }
    }
    System.out.println("i=" + i + " j=" + j + " k=" + k + " b=" + java.util.Arrays.toString(b));
  }

  public static void main(String[] args) {
    esegui(new char[] {'a', 'w', 'g', 'y'}, "wyygww", 3);
    esegui(new char[] {'h', 'z', 'k'}, "kzhhh", 2);
  }
}
