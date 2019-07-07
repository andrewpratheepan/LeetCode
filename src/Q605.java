public class Q605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flower = 0;
        int planted = 0;
        while (flower < flowerbed.length) {
            if (flowerbed[flower] == 0 &&
                    (flower == 0 || flowerbed[flower - 1] == 0) && //start or before not 1
                    (flower == flowerbed.length - 1 || flowerbed[flower + 1] == 0)) //end or after not 1
                {
                flowerbed[flower++] = 1;
                planted++;
            }
            flower++;
            if(planted>=n) return true;
        }
        return false;
    }
}
