import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int [] cards = {8,6,3,7,2,5,1,4,9,10,11};
        solution(cards);
    }
    public static int solution(int[] cards) {
      int length = cards.length;
      int box1 = 0;
      int box2 = 0;
      int boxCheck = 0;

    for (int i = 0; i < length; i++) {
        if (cards[i] == 0) {
            continue;
        }
        boxCheck = openBox(cards, i);

        if (box1 < boxCheck) {
            box2 = box1;
            box1 = boxCheck;
        }else if (box2 < boxCheck) {
            box2 = boxCheck;
        }
    }

      if (box1 == length) {
          return 0;
      } else {
          return box1 * box2;
      }
  }

  private static int openBox(int[] cards, int index) {
      if (cards[index] == 0) {
          return 0;
      }
      int nextIndex = cards[index] - 1;
      cards[index] = 0;

      return openBox(cards, nextIndex) + 1;
  }
}