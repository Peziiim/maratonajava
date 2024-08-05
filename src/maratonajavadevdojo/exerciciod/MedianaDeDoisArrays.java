package maratonajavadevdojo.exerciciod;


public class MedianaDeDoisArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3 = 0;
        int nums4 = 0;
        int length = nums1.length + nums2.length;

        for (int nums : nums1) {

            if (nums < nums3) {
                nums3 = nums;

            } else {
                continue;
            }
        }

        for (int nums : nums2) {
            if (nums < nums4) {
                nums4 = nums;
            } else {
                continue;
            }

        }
        return (nums3 + nums4) / 2;
    }
}

