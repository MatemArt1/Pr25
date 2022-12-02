public class Like25 {
    public class Kata{
        public static int findSquares(int x, int y) {
            int result = 0;
            while (x != 0 && y != 0) {
                result += x * y;
                x--;
                y--;
            }
            return result;
        }
    }
}
