package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    public static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i11) {
        double[][] dArr;
        char c11 = 1;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr2 = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i12 = 0;
        for (int i13 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i13));
            if (num == null) {
                dArr2[i12] = pointProviderLab.fromInt(i13);
                iArr3[i12] = i13;
                i12++;
                linkedHashMap.put(Integer.valueOf(i13), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i13), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr4 = new int[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            iArr4[i14] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i14]))).intValue();
        }
        int iMin = Math.min(i11, i12);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr3 = new double[iMin][];
        int i15 = 0;
        for (int i16 = 0; i16 < iArr2.length; i16++) {
            dArr3[i16] = pointProviderLab.fromInt(iArr2[i16]);
            i15++;
        }
        int i17 = iMin - i15;
        if (i17 > 0) {
            for (int i18 = 0; i18 < i17; i18++) {
            }
        }
        int[] iArr5 = new int[i12];
        for (int i19 = 0; i19 < i12; i19++) {
            iArr5[i19] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i21 = 0; i21 < iMin; i21++) {
            iArr6[i21] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i22 = 0; i22 < iMin; i22++) {
            distanceArr[i22] = new Distance[iMin];
            for (int i23 = 0; i23 < iMin; i23++) {
                distanceArr[i22][i23] = new Distance();
            }
        }
        int[] iArr7 = new int[iMin];
        int i24 = 0;
        while (true) {
            if (i24 >= 10) {
                dArr = dArr3;
                break;
            }
            int i25 = 0;
            while (i25 < iMin) {
                int i26 = i25 + 1;
                int i27 = i26;
                while (i27 < iMin) {
                    char c12 = c11;
                    int[] iArr8 = iArr4;
                    double dDistance = pointProviderLab.distance(dArr3[i25], dArr3[i27]);
                    Distance distance = distanceArr[i27][i25];
                    distance.distance = dDistance;
                    distance.index = i25;
                    Distance distance2 = distanceArr[i25][i27];
                    distance2.distance = dDistance;
                    distance2.index = i27;
                    i27++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    c11 = c12;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                char c13 = c11;
                Arrays.sort(distanceArr[i25]);
                for (int i28 = 0; i28 < iMin; i28++) {
                    iArr6[i25][i28] = distanceArr[i25][i28].index;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i25 = i26;
                c11 = c13;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            char c14 = c11;
            int i29 = 0;
            int i31 = 0;
            while (i29 < i12) {
                double[] dArr4 = dArr2[i29];
                int i32 = iArr12[i29];
                double dDistance2 = pointProviderLab.distance(dArr4, dArr3[i32]);
                int i33 = i29;
                double d11 = dDistance2;
                int i34 = -1;
                int i35 = 0;
                while (i35 < iMin) {
                    int i36 = i31;
                    double[][] dArr5 = dArr2;
                    double[][] dArr6 = dArr3;
                    if (distanceArr[i32][i35].distance < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr4, dArr6[i35]);
                        if (dDistance3 < d11) {
                            d11 = dDistance3;
                            i34 = i35;
                        }
                    }
                    i35++;
                    dArr2 = dArr5;
                    i31 = i36;
                    dArr3 = dArr6;
                }
                int i37 = i31;
                double[][] dArr7 = dArr2;
                double[][] dArr8 = dArr3;
                if (i34 == -1 || Math.abs(Math.sqrt(d11) - Math.sqrt(dDistance2)) <= 3.0d) {
                    i31 = i37;
                } else {
                    i31 = i37 + 1;
                    iArr12[i33] = i34;
                }
                i29 = i33 + 1;
                dArr2 = dArr7;
                dArr3 = dArr8;
            }
            double[][] dArr9 = dArr2;
            dArr = dArr3;
            if (i31 == 0 && i24 != 0) {
                break;
            }
            double[] dArr10 = new double[iMin];
            double[] dArr11 = new double[iMin];
            double[] dArr12 = new double[iMin];
            char c15 = 0;
            Arrays.fill(iArr7, 0);
            int i38 = 0;
            while (i38 < i12) {
                int i39 = iArr12[i38];
                double[] dArr13 = dArr9[i38];
                int i41 = iArr11[i38];
                iArr7[i39] = iArr7[i39] + i41;
                double d12 = i41;
                dArr10[i39] = dArr10[i39] + (dArr13[c15] * d12);
                dArr11[i39] = dArr11[i39] + (dArr13[c14] * d12);
                dArr12[i39] = dArr12[i39] + (dArr13[2] * d12);
                i38++;
                distanceArr = distanceArr;
                c15 = 0;
            }
            Distance[][] distanceArr2 = distanceArr;
            for (int i42 = 0; i42 < iMin; i42++) {
                int i43 = iArr7[i42];
                if (i43 == 0) {
                    dArr[i42] = new double[]{0.0d, 0.0d, 0.0d};
                } else {
                    double d13 = i43;
                    double d14 = dArr10[i42] / d13;
                    double d15 = dArr11[i42] / d13;
                    double d16 = dArr12[i42] / d13;
                    double[] dArr14 = dArr[i42];
                    dArr14[0] = d14;
                    dArr14[c14] = d15;
                    dArr14[2] = d16;
                }
            }
            i24++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            distanceArr = distanceArr2;
            c11 = c14;
            dArr2 = dArr9;
            dArr3 = dArr;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i44 = 0; i44 < iMin; i44++) {
            int i45 = iArr7[i44];
            if (i45 != 0) {
                int i46 = pointProviderLab.toInt(dArr[i44]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i46))) {
                    linkedHashMap2.put(Integer.valueOf(i46), Integer.valueOf(i45));
                }
            }
        }
        return linkedHashMap2;
    }

    private QuantizerWsmeans() {
    }
}
