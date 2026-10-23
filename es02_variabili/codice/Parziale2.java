class Parziale2 {
  public static void main(String[] args) {
    String[] a = {"qqr", "ddyy", "", "v", "gggg"};
    int r = 2;
    int i = 0, j = 0, k = 0;
    boolean p = true;
    String s = "x";
    for (i = 0; i < a.length; i++) {
      j = 0;
      k = 0;
      p = true;
      while (j < a[i].length() - 1 && p) {
        if (a[i].charAt(j) == a[i].charAt(j + 1)) {
          k++;
          if (k >= r) {
            p = !p;
            s = a[i] + s;
          }
        }
        j++;
      }
    }
    System.out.println("i=" + i + " j=" + j + " k=" + k + " p=" + p + " s=" + s);
  }
}
