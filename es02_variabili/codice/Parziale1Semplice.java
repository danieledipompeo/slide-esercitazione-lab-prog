class Parziale1Semplice {
  public static void main(String[] args) {
    char c = 'a';
    String s = "wyygww";
    int v = 3;
    int j = 0, k = 0;
    boolean b = false;
    while (j < s.length() && !b) {
      if (c != s.charAt(j)) {
        k++;
        if (k > v) {
          b = true;
        }
      }
      j++;
    }
    System.out.println("j=" + j + " k=" + k + " b=" + b);
  }
}
