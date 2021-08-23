public class ContainerWithMostWater11 {
  static int[] heights = new int[] {7134,1221,3111,4332,4207,5476,8907,10,1726,3522,6891,3925,9942,1290,8132,8721,5464,708,9812,8571,4668,1663,1342,2870,3431,4902,9036,2359,5532,4737,9412,9431,1111,7957,6701,8943,4251,786,9020,3573,2905,61,8942,598,6476,3389,8126,2777,7268,9816,8239,8430,2948,9731,2717,5494,9288,1227,8002,3913,9346,4429,3605,7762,2119,2699,9257,5462,7633,4655,7348,1612,217,2911,5608,6984,8395,9560,1130,60,7264,2628,3088,8017,666,1795,1310,7841,7755,537,9699,7945,2022,2865,8059,1462,5272,8182,711,6092,2191,8658,1843,3364,3940,710,2425,3210,2161,3495,7829,5712,2869,5783,7152,1385,796,5079,9484,8242,1604,3786,2253,2824,1936,1750,8010,9584,2779,3856,5241,7949,6168,6021,8106,1450,8416,5220,7678,976,4528,856,2743,8657,1005,198,6205,8451,6052,1537,2909,6577,8167,8894,7233,8260,5553,2838,3348,6213,2161,7667,8170,9645,1025,8514,7926,8299,4274,2244,7261,194,4758,3880,2898,3189,1552,3114,3665,7794,2178,6541,9415,6400,2955,6716,6402,9664,636,5421,9661,8779,9409,2169,6322,3801,1227,8974,436,7461,7340,6706,9297,2824,9702,7584,7434,2931,7380,353,3022,3255,8171,4160,5149,2046,5641,8664,3686,5179,7183,9943,1476,365,4837,5468,5937,9547,4664,8037,4617,6602,9048,63,4574,8928,3744,6615,5646,6871,3676,5367,9496,6745,6312,9267,1036,8527,9525,7929,4842,3872,3333,2263,7672,8277,1232,2593,6032,8886,51,1860,2027,5777,7869,2711,243,3586,8640,5676,2650,3260,5706,2211,1137,4997,440,173,5611,9604,6249,8022,2426,649,7612,2785,942,3716,5772,4400,5019,5150,4868,5700,1174,3787,8056,4051,3866,5097,3564,7526,5570,5351,3932,4971,2524,4480,3802,4309,1656,6222,6398,9295,6819,4262,2009,5312,2388,9637,2028,5791,1322,6799,7600,282,4888,315,1078,826,7689,2726,1358,1658,556,9007,3985,3189,7423,573,9839,7684,1608,5055,596,3033,4174,7167,8614,7058,6307,9810,6723,8584,8822,8853,231,3005,989,5727,7483,1371,6676,5346,5996,3568,10000,9318,5198,877,5384,6529,4204,2971,1627,2438,1057,7316,1594,9016,1716,756,2784,597,9499,7764,7132,178,8264,56,887,3939,5854,8732,5106,7731,884,5586,1656,9556,5853,4783,7181,6575,7545,7071,1725,3183,6399,2252,2299,475,5730,2892,5815,4184,3134,7562,3388,8553,51,10,7277,6386,5494,641,202,5264,1435,9223,7326,7059,9505,210,6729,7081,9094,4600,8618,6618,3013,7210,1580,4334,1255,2200,8185,6783,237,3960,4803,7657,8438,2316,4420,4728,6014,9416,7469,5676,8807,4914,3172,7112,6133,4210,2954,1094,907,6773,8236,5286,6106,5615,6906,1502,7765,9548,5825,1186,2206,6485,2972,551,8724,7389,1902,6747,9745,9815,2605,4530,8064,9222,5880,7791,7428,4698,7107,9397,7555,288,2551,6371,4906,5715,3993,520,5856,9308,3528,7115,1196,1937,9164,9003,2354,8964,3266,1936,2056,598,5467,5698,5215,4556,482,8480,8891,5322,7268,7926,4864,3518,5403,9338,6588,2184,5492,8037,9022,5219,344,3036,8140,364,3141,1976,3429,2560,9900,7830,6332,6373,6877,5250,2106,4908,5206,2670,977,4930,8826,5772,6087,8738,7654,7145,5757,6035,1415,1806,2632,8685,2512,2272,4016,9355,632,2089,6347,1046,2288,2313,7029,2808,705,9081,5874,298,1373,5117,8680,9291,1614,6408,7241,1963,3498,1116,5634,3962,7000,4113,6987,8670,8560,6895,1115,764,6944,468,853};
  public static void main(String[] args) {
    System.out.println(maxArea(heights));
  }

  private static int maxArea(int[] height) {
    int maxArea = Integer.MIN_VALUE;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
      int hRight = height[right], hLeft = height[left];
      int area = Math.min(hLeft, hRight) * (right - left);
      maxArea = Math.max(area, maxArea);
      if(hLeft < hRight) {
        left ++;
      } else {
        right --;
      }
    }
    return maxArea;
  }
}