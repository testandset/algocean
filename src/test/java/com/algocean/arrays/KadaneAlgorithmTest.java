package com.algocean.arrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class KadaneAlgorithmTest {

	@Parameters(name = "{index} - Expected {0}")
	public static Collection<Object[]> testData() {

		// List of (expectedResult, List)
		return Arrays.asList(new Object[][] {
				{ 176, Arrays.asList(new Integer[]{97, 0, -461, -125, -404, -59, -322, -495, -288, -341, -449, -313, -192, -214, -389, -202, -183, -72, -416, -455, -187, -242, -416, 39, -198, -338, -465, -248, -25, -398, -97, -461, -214, -423, -407, -77, -190, -67, -178, -410, -160, 72, -350, -31, -85, -247, -319, -462, -303, -48, -354, -110, 17, 60, 19, 80, -218, -28, -426, -366, -140, 50})},
				{ 220, Arrays.asList(new Integer[]{-418, -186, 30, -103, -58, 17, -155, -294, -428, 53, -198, 36, -219, -34, -278, -7, 63, -258, -144, -325, -100, -35, -315, 57, -263, 66, -59, -347, -142, -390, -101, -460, -357, -149, -20, -96, 71, -96, -430, -92, -483, -244, 16, -234, -327, -390, -48, -291, -98, -67, -54, -274, -19, -207, -442, -382, -167, -103, -14, -409, 94, -16, -32, -12, -46, -80, -93, -499, -240, -117, -168, 94, -62, -414, -32, -272, -282, -99, -45, -363, -101, -239, 52, -484, -315, -459, 52, -14, -286, -147, -274, -231, -116, -408, -46, -133, -415, -157, -141, -119, -113, -498, -241, 62, -68, -428, -246, -52, -494, -422, -360, -477, 21, -386, -151, -92, -137, -401, -114, -249, 25, -322, -313, -199, 32, -488, 5, -416, -328, -91, 48, -414, -388, -367, 73, -16, -233, -100, -368, 79, -235, -110, -345, -329, 27, 37, -380, -296, -390, -92, -140, -110, -113, -204, -299, -101, -491, -19, -487, -16, -219, 68, -237, -156, -314, -494, -166, -422, 62, -164, -83, -162, 44, -450, -154, -399, 12, -61, -433, -48, -228, -31, -145, -4, 95, -141, 72, -21, -14, 66, -149, -347, -238, 71, -82, -89, -463, -397, -457, -312, -6, -196, -326, -117, -443, -10, 14, -194, -48, -383, -124, 90, 58, -309, -419, -453, -221, 92, -107, -366, 24, -395, 22, 100, 98, -107, -391, -457, -197, 21, -208, 25, -320, -479, -406, -496, 20, -481, -473, 71, -255, -102, 68, -457, -148, -220, 61, -449, -354, -124, -312, 2, 64, 73, 34, -238, -94, -299, -307, -348, -140, -271, -490, -389, 65, -193, 47, -108, -20, -234, -483, 89, -182, -483, -178, -367, -364, 37, -47, -97, -202, -55, -429, -234, -107, 70, -446, -462, -179, -119, -210, 66, -239, -58, -435, -343, 4, -119, 28, -124, 13, 74, -452, -362, 26, -149, -480, -168, -402, -238, 96, 90, -167, -213, -202, -458, -225, -358, 24, -488, -209, -302, -161, -383, -39, -466, -384, -166, -236, -238, -38, -375, -492, -218, -352, 47, 10, 37, -268, -268, -248, 91, -425, -375, -374, 31, 0, 42, 21, -178, 41, -49, -337, 10, -395, -472, -432, -198, -411, -48, 55, 67, -382, 13, -499, 30, -98, 92, -34, -410, -488, -408, -257, -153, -301, -338, -247, -241, -97, -197, -212, -1, -240, -391, -460, 88, -71, 49, -111, -309, 19, -427, -213, -28, 44, -27, 85, -322, -157, -338, -383, -473, -316, -315, -458, -319, 23, -97, -303, -128, -238, -239, -303, -19, -258, -183, -133, -407, -486, 49, -381, -393, 52, -289, -403, -438, 39, -288, -497, -197, 32, -146, -284, -460, -409, -431, 78, -77, -313, 79, -293, -12, -281, -74, -304, -96, -123, -413, -198, -306, -39, -495, -276, -466, 18, -360, -347, -441, -326, -290, 93, -230, -86, -74, 11, -226, -362, -276, -372, 79, -285, -191, -60, -214, -105, 38, -474, -149, -82, -256, 58, -446, 3, 99, -308, -287, 62, -192, -39, -106, -396, -196, -307, 14, -90, -150, -447, -110, -13, -262, 74, -78, -262, -337, -499, -58, -359, -461, -438, -318, -22, -413, 18, -374, -206, -317, -308, -345, -495, 15, -326, -112, 81, -455, -125, 38, -3, 6, 12, -357, -122, -132, 40, -248, 61, -180, -87, -273, -334, -228, -77, -165, -404, -375, 64, 18, -36, -44, -244, -54, -171, -340, -26, -489, -317, 56, -233, 9, 4, -221, -337, -147, -465, -237, -372, -326, 90, -183, -250, -256, -338, -104, -155, -475, -200, -269, -367, -13, -147, -236, -218, -64, -290, 64, 83, -316, -98, -378, 71, -125, -346, -238, -252, -304, -44, -452, -420, -38, -291, -103, -259, -66, -84, 54, -288, -470, 56, -178, 18, -125, -156, -345, -252, -464, 13, -306, 57, -473, -278, -445, -35, -283, -116, -300, -242, -499, -424, -200, 3, -317, -264, -293, -33, -95, -285, -396, -344, -167, -256, -254, -51, -489, -161, 37, -28, -302, 61, -28, -177, 85, -42, 5, -451, -375, -140, -400, 81, 69, -169, -136, -249, 42, -41, -482, 42, -42, -17, -119, 59, -446, -423, -190, -396, 0, -157, -341, -248, -325, -51, -445, -470, -422, -464, -185, -228, -123, -182, -471, -391, -84, -191, -308, -316, -121, -382, -402, -426, 18, 92, -489, -351, -11, -174, 88, 40, -189, -394, -70, -359, -48, -235, 74, 64, -423, -151, -16, 4, 90, -24, -368, -287, 81, -69, 88, -469, 85, -235, -143, -52, 37, -215, -41, -383, -8, -441, -158, -404, -367, -164, -260, 67, -196, -401, -405, 92, -263, -353, 62, -422, -500, -183, -464, -426, -341, -345, 36, -500, -371, 73, -339, -207, -282, -174, 54, -76, -126, 42, -251, 75, -86, -49, -324, 69, -388, -472, -336, -27, -212, -197, 73, -68, -241, -82, -161, -72, 39, -279, -316, -230, 82, 45, -233, -47, -396, -444, -68, 26, 70, -216, -438, -331, -295, -437, -389, -324, -372, -357, -121, -5, -479, -416, -135, 31, -279, -333, -479, 85, -294, -272, -384, -251, -176, -172, -77, -428, -54, 58, -422, -199, -258, -270, -114, -132, -135, 99, -342, -76, 55, 37, -110, -462, -17, -245, -131, -67, -414, -184, -460, -49, -427, -412, -19, -266, -200, -259, -433, -500, -487, -248, -288, 73, -166, 80, -21, 69, -4, -498, -447, 5, -438, -345, -303, -28, -203, -236, -305, -255, -353, -122, -346, -219, -405, -226, 36, -141, -30, -297, -358, -306, -147, -364, 13, -299, -90, -293, -107, -114, -475, 58, -67, 72, -90, 49, -113, -159, -301, 38, -383, -57, 7, -487, -276, -266, -48, -281, -52, 66, -60, -238, -443, -445, -304, 32, -407, -79, -110, -418, -44, -287, 100, -111, -67, -416, 60, 79, -86, -15, -65, -440, -296, -449, 44, -492, -256, -296, -18, -80, -131, 89, -79, -123, -120, -490, 11, 13, -395, -69, -447, -148, -481, -229, -368, -431, 32, -285, -105, 67, -169, -423, -238, -265, -6, 52, 34, -130, 12, -418})},
				{ 6, Arrays.asList(new Integer[]{1, 2, 3})},
				{ -500, Arrays.asList(new Integer[]{-500})},
				{ -1, Arrays.asList(new Integer[]{-500, -1})},
				{ 0, Arrays.asList(new Integer[]{})}
		});
	}
	
	@Parameter
	public int result;
	
	@Parameter(1)
	public List<Integer> list;

	
	@Test
	public void findMaximumSubSequenceSumTest() {
		assertEquals(result, KadaneAlgorithm.findMaximumSubSequenceSum(list));
	}


}