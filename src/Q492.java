public class Q492 {
    public int[] constructRectangle(int area) {
        int [] array = new int[2];
        int itt = (int) Math.ceil(Math.sqrt(area));
        while (itt >=1){
            if (area%itt == 0){
                break;
            }
            itt--;
        }
        array[0] = (area/itt) > itt ? area/itt:itt;
        array[1] = (area/itt) < itt ? area/itt:itt;
        return array;
    }
}
