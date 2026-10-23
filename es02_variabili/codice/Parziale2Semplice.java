class Parziale2Semplice {
  public static void main(String[] args) {
    String t = "ddyy";
    int r = 2;
    int j = 0, k = 0;
    boolean p = true;
    String s = "x";
    while (j < t.length() - 1 && p) {
      if (t.charAt(j) == t.charAt(j + 1)) {
        k++;
        if (k >= r) {
          p = !p;
          s = t + s;
        }
      }
      j++;
    }
    System.out.println("j=" + j + " k=" + k + " p=" + p + " s=" + s);
  }
}
