package Tests;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;

import Vorlesung1.*;
import Vorlesung2.*;
import Vorlesung3.*;



@DisplayName("AuD Algorithms")
class Tests {

    @Nested
    class Vorlesung1 {

        @Nested
        class Vorlesung1_prim {

            @Test
            public void prim42() {
                assertEquals(Arrays.toString(new Prim(42).get()), "[2, 3, 5, 7, 8, 9, 11, 12, 13, 15, 17, 19, 20, 21, 23, 25, 27, 28, 29, 31, 32, 33, 35, 36, 37, 39, 41]");
            }

            @Test
            public void prim69() {
                assertEquals(Arrays.toString(new Prim(69).get()), "[2, 3, 5, 7, 8, 9, 11, 12, 13, 15, 17, 19, 20, 21, 23, 25, 27, 28, 29, 31, 32, 33, 35, 36, 37, 39, 41, 43, 44, 45, 47, 48, 49, 51, 52, 53, 55, 57, 59, 60, 61, 63, 65, 67, 68]");
            }

            @Test
            public void prim1337() {
                assertEquals(Arrays.toString(new Prim(1337).get()), "[2, 3, 5, 7, 8, 9, 11, 12, 13, 15, 17, 19, 20, 21, 23, 25, 27, 28, 29, 31, 32, 33, 35, 36, 37, 39, 41, 43, 44, 45, 47, 48, 49, 51, 52, 53, 55, 57, 59, 60, 61, 63, 65, 67, 68, 69, 71, 73, 75, 76, 77, 79, 80, 81, 83, 84, 85, 87, 89, 91, 92, 93, 95, 97, 99, 100, 101, 103, 105, 107, 108, 109, 111, 112, 113, 115, 116, 117, 119, 121, 123, 124, 125, 127, 128, 129, 131, 132, 133, 135, 137, 139, 140, 141, 143, 144, 145, 147, 148, 149, 151, 153, 155, 156, 157, 159, 161, 163, 164, 165, 167, 169, 171, 172, 173, 175, 176, 177, 179, 180, 181, 183, 185, 187, 188, 189, 191, 192, 193, 195, 196, 197, 199, 201, 203, 204, 205, 207, 208, 209, 211, 212, 213, 215, 217, 219, 220, 221, 223, 225, 227, 228, 229, 231, 233, 235, 236, 237, 239, 240, 241, 243, 244, 245, 247, 249, 251, 252, 253, 255, 257, 259, 260, 261, 263, 265, 267, 268, 269, 271, 272, 273, 275, 276, 277, 279, 281, 283, 284, 285, 287, 289, 291, 292, 293, 295, 297, 299, 300, 301, 303, 304, 305, 307, 308, 309, 311, 313, 315, 316, 317, 319, 320, 321, 323, 324, 325, 327, 329, 331, 332, 333, 335, 336, 337, 339, 340, 341, 343, 345, 347, 348, 349, 351, 353, 355, 356, 357, 359, 361, 363, 364, 365, 367, 368, 369, 371, 372, 373, 375, 377, 379, 380, 381, 383, 385, 387, 388, 389, 391, 393, 395, 396, 397, 399, 400, 401, 403, 404, 405, 407, 409, 411, 412, 413, 415, 417, 419, 420, 421, 423, 425, 427, 428, 429, 431, 432, 433, 435, 436, 437, 439, 441, 443, 444, 445, 447, 448, 449, 451, 452, 453, 455, 457, 459, 460, 461, 463, 464, 465, 467, 468, 469, 471, 473, 475, 476, 477, 479, 481, 483, 484, 485, 487, 489, 491, 492, 493, 495, 496, 497, 499, 500, 501, 503, 505, 507, 508, 509, 511, 512, 513, 515, 516, 517, 519, 521, 523, 524, 525, 527, 528, 529, 531, 532, 533, 535, 537, 539, 540, 541, 543, 545, 547, 548, 549, 551, 553, 555, 556, 557, 559, 560, 561, 563, 564, 565, 567, 569, 571, 572, 573, 575, 576, 577, 579, 580, 581, 583, 585, 587, 588, 589, 591, 592, 593, 595, 596, 597, 599, 601, 603, 604, 605, 607, 609, 611, 612, 613, 615, 617, 619, 620, 621, 623, 624, 625, 627, 628, 629, 631, 633, 635, 636, 637, 639, 641, 643, 644, 645, 647, 649, 651, 652, 653, 655, 656, 657, 659, 660, 661, 663, 665, 667, 668, 669, 671, 673, 675, 676, 677, 679, 681, 683, 684, 685, 687, 688, 689, 691, 692, 693, 695, 697, 699, 700, 701, 703, 704, 705, 707, 708, 709, 711, 713, 715, 716, 717, 719, 720, 721, 723, 724, 725, 727, 729, 731, 732, 733, 735, 737, 739, 740, 741, 743, 745, 747, 748, 749, 751, 752, 753, 755, 756, 757, 759, 761, 763, 764, 765, 767, 768, 769, 771, 772, 773, 775, 777, 779, 780, 781, 783, 784, 785, 787, 788, 789, 791, 793, 795, 796, 797, 799, 801, 803, 804, 805, 807, 809, 811, 812, 813, 815, 816, 817, 819, 820, 821, 823, 825, 827, 828, 829, 831, 832, 833, 835, 836, 837, 839, 841, 843, 844, 845, 847, 848, 849, 851, 852, 853, 855, 857, 859, 860, 861, 863, 865, 867, 868, 869, 871, 873, 875, 876, 877, 879, 880, 881, 883, 884, 885, 887, 889, 891, 892, 893, 895, 897, 899, 900, 901, 903, 905, 907, 908, 909, 911, 912, 913, 915, 916, 917, 919, 921, 923, 924, 925, 927, 929, 931, 932, 933, 935, 937, 939, 940, 941, 943, 944, 945, 947, 948, 949, 951, 953, 955, 956, 957, 959, 960, 961, 963, 964, 965, 967, 969, 971, 972, 973, 975, 976, 977, 979, 980, 981, 983, 985, 987, 988, 989, 991, 993, 995, 996, 997, 999, 1001, 1003, 1004, 1005, 1007, 1008, 1009, 1011, 1012, 1013, 1015, 1017, 1019, 1020, 1021, 1023, 1025, 1027, 1028, 1029, 1031, 1033, 1035, 1036, 1037, 1039, 1040, 1041, 1043, 1044, 1045, 1047, 1049, 1051, 1052, 1053, 1055, 1057, 1059, 1060, 1061, 1063, 1065, 1067, 1068, 1069, 1071, 1072, 1073, 1075, 1076, 1077, 1079, 1081, 1083, 1084, 1085, 1087, 1088, 1089, 1091, 1092, 1093, 1095, 1097, 1099, 1100, 1101, 1103, 1104, 1105, 1107, 1108, 1109, 1111, 1113, 1115, 1116, 1117, 1119, 1121, 1123, 1124, 1125, 1127, 1129, 1131, 1132, 1133, 1135, 1136, 1137, 1139, 1140, 1141, 1143, 1145, 1147, 1148, 1149, 1151, 1153, 1155, 1156, 1157, 1159, 1161, 1163, 1164, 1165, 1167, 1168, 1169, 1171, 1172, 1173, 1175, 1177, 1179, 1180, 1181, 1183, 1185, 1187, 1188, 1189, 1191, 1193, 1195, 1196, 1197, 1199, 1200, 1201, 1203, 1204, 1205, 1207, 1209, 1211, 1212, 1213, 1215, 1216, 1217, 1219, 1220, 1221, 1223, 1225, 1227, 1228, 1229, 1231, 1232, 1233, 1235, 1236, 1237, 1239, 1241, 1243, 1244, 1245, 1247, 1249, 1251, 1252, 1253, 1255, 1257, 1259, 1260, 1261, 1263, 1264, 1265, 1267, 1268, 1269, 1271, 1273, 1275, 1276, 1277, 1279, 1280, 1281, 1283, 1284, 1285, 1287, 1289, 1291, 1292, 1293, 1295, 1296, 1297, 1299, 1300, 1301, 1303, 1305, 1307, 1308, 1309, 1311, 1313, 1315, 1316, 1317, 1319, 1321, 1323, 1324, 1325, 1327, 1328, 1329, 1331, 1332, 1333, 1335]");
            }

        }

        @Nested
        class Vorlesung1_sum {
            @Test
            public void sum42(){
                assertEquals(new Summe(42).get(),903);
            }
            @Test
            public void sum69(){
                assertEquals(new Summe(69).get(),2415);
            }
            @Test
            public void sum1337(){
                assertEquals(new Summe(1337).get(),894453);
            }
        }

        @Test
        public void InsertionSort(){
            int[] inp = new int[]{59,22,27,8,42,18,29,34,1,44,15,17,16,7,36,11,53,9,26,12,24,21,4,41,51,37,52,49,48,25,23,38,47,30,14,55,3,54,19,33,58,35,32,39,46,2,56,20,5,50,45,57,40,28,0,31,10,6,13,43};
            String inpcheck = Arrays.toString(new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59});
            assertEquals(Arrays.toString(new InsertionSort(inp).get()),inpcheck);
        }
    }

    @Nested
    class Vorlesung2 {
        @Test
        public void BubbleSort(){
            assertEquals(Arrays.toString(new BubbleSort(new int[]{5,2,4,6,1,3}).get()),"[1, 2, 3, 4, 5, 6]");
        }
    }
    @Nested
    class Vorlesung3 {
        @Nested
        class Vorlesung3_MergeSort{
            @Test
            public void MergeSortShort(){
                int[] A = new int[]{1,5,4,2,6,0,3};
                String comp = "[0, 1, 2, 3, 4, 5, 6]";
                assertEquals(Arrays.toString(new MergeSort(A,0,A.length-1).get()),comp);
            }
            @Test
            public void MergeSortLong(){
                int[] A = new int[]{59,22,27,8,42,18,29,34,1,44,15,17,16,7,36,11,53,9,26,12,24,21,4,41,51,37,52,49,48,25,23,38,47,30,14,55,3,54,19,33,58,35,32,39,46,2,56,20,5,50,45,57,40,28,0,31,10,6,13,43};
                String comp = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59]";
                assertEquals(Arrays.toString(new MergeSort(A,0,A.length-1).get()),comp);
            }
        }

        @Test
        public void MaxSort(){
            int[] A = new int[]{1,5,4,2,6,0,3};
            String comp = "[0, 1, 2, 3, 4, 5, 6]";
            assertEquals(comp,Arrays.toString(new MaxSort(A).get()));
        }

        @Test
        public void MinSort(){
            int[] A = new int[]{1,5,4,2,6,0,3};
            int[] B = new int[]{0,1,2,3,4,5,6};
            String comp = "[0, 1, 2, 3, 4, 5, 6]";
            assertEquals(comp,Arrays.toString(new MinSort(A).get()));
        }
        @Test
        public void SelectionSort(){
            int[] A = new int[]{1,5,4,2,6,0,3};
            int[] B = new int[]{0,1,2,3,4,5,6};
            String comp = "[0, 1, 2, 3, 4, 5, 6]";
            A = new int[]{6,4,1,8,3};
            comp = "[1, 3, 4, 6, 8]";
            assertEquals(comp,Arrays.toString(new SelectionSort(A).get()));

        }
        @Test
        public void QuickSort(){
            int[] A = new int[]{1,5,4,2,6,0,3};
            int[] B = new int[]{0,1,2,3,4,5,6};
            String comp = "[0, 1, 2, 3, 4, 5, 6]";
            assertEquals(comp,Arrays.toString(new QuickSort(A,0,A.length-1).get()));

        }
        @Test
        public void RandomizedQuickSort(){
            int[] A = new int[]{1,5,4,2,6,0,3};
            int[] B = new int[]{0,1,2,3,4,5,6};
            String comp = "[0, 1, 2, 3, 4, 5, 6]";
            assertEquals(comp,Arrays.toString(new RandomizedQuickSort(A,0,A.length-1).get()));

        }
    }
}
