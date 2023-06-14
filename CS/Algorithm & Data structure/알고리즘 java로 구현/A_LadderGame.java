package algo;

import java.util.Arrays;

public class A_LadderGame {

  private int numOfEntry;
  private String[] inputArray = new String[numOfEntry];
  private String[] outputArray= new String[numOfEntry];
  private int[] floorInfo;

  public A_LadderGame(int numOfEntry) {
    if (numOfEntry < 2) throw new IllegalArgumentException("참가자수는 2이상이어야 합니다.");
    this.numOfEntry = numOfEntry;
  }

  public void setInputArray(String[] inputArray) {
    if (inputArray.length != numOfEntry) throw new IllegalArgumentException("참가자 수만큼 넣어주세요");
    this.inputArray = inputArray;
  }

  public void setOutputArray(String[] outputArray) {
    if (outputArray.length != numOfEntry) throw new IllegalArgumentException("참가자 수만큼 넣어주세요");
    this.outputArray = outputArray;
  }

  public void setFloorInfo(int[] floorInfo) {
    for (int i : floorInfo) {
      if (i > numOfEntry-2 || i<0) throw new IllegalArgumentException("사다리 범위에서 벗어났습니다.");
    }
    this.floorInfo = floorInfo;
  }

  public void setRandomFloor(int maxFloor){
    int[] randomFloor = new int[maxFloor];
    for (int i = 0; i < randomFloor.length; i++) {
      randomFloor[i] = (int) (Math.random() * (numOfEntry-2));
    }
    this.floorInfo = randomFloor;
  }

  public String[][] doGame(){
    String tmp;
    String[] tmpArray = inputArray;

    for (int i = 0; i < floorInfo.length; i++) {
      int floor = floorInfo[i];
      tmp = tmpArray[floor];
      tmpArray[floor] = tmpArray[floor+1];
      tmpArray[floor+1] = tmp;
    }

    String[][] result = new String[numOfEntry][2];
    for (int i = 0; i < result.length; i++) {
      result[i][0] = tmpArray[i];
      result[i][1] = outputArray[i];
    }
    return result;
  }

  public static void main(String[] args) {
    A_LadderGame ladderGame = new A_LadderGame(4);
    String[] inputArray = {"A", "B", "C", "D"};
    String[] outputArray = {"서울", "대전", "대구", "부산"};
    int[] floorInfo = {0, 2, 1, 1, 2, 1, 1};
    ladderGame.setInputArray(inputArray);
    ladderGame.setOutputArray(outputArray);
    ladderGame.setFloorInfo(floorInfo);

    String[][] result1 = ladderGame.doGame();

    System.out.println("-----------------------");
    System.out.println("첫 게임 결과는");
    for (String[] strings : result1) {
      System.out.println(Arrays.toString(strings));
    }
    System.out.println("-----------------------");

    ladderGame.setRandomFloor(10);
    String[][] result2 = ladderGame.doGame();

    System.out.println("-----------------------");
    System.out.println("두번째 랜덤게임 결과는");
    for (String[] strings : result2) {
      System.out.println(Arrays.toString(strings));
    }
    System.out.println("-----------------------");
  }

}
