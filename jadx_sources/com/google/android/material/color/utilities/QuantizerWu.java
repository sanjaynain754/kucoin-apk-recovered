package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    public static final class Box {

        /* JADX INFO: renamed from: b0 */
        int f11773b0;

        /* JADX INFO: renamed from: b1 */
        int f11774b1;

        /* JADX INFO: renamed from: g0 */
        int f11775g0;

        /* JADX INFO: renamed from: g1 */
        int f11776g1;

        /* JADX INFO: renamed from: r0 */
        int f11777r0;

        /* JADX INFO: renamed from: r1 */
        int f11778r1;
        int vol;

        private Box() {
            this.f11777r0 = 0;
            this.f11778r1 = 0;
            this.f11775g0 = 0;
            this.f11776g1 = 0;
            this.f11773b0 = 0;
            this.f11774b1 = 0;
            this.vol = 0;
        }
    }

    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    public static final class CreateBoxesResult {
        int resultCount;

        public CreateBoxesResult(int i11, int i12) {
            this.resultCount = i12;
        }
    }

    public static final class MaximizeResult {
        int cutLocation;
        double maximum;

        public MaximizeResult(int i11, double d11) {
            this.cutLocation = i11;
            this.maximum = d11;
        }
    }

    public static int getIndex(int i11, int i12, int i13) {
        return (i11 << 10) + (i11 << 6) + i11 + (i12 << 5) + i12 + i13;
    }

    public static int volume(Box box, int[] iArr) {
        return ((((((iArr[getIndex(box.f11778r1, box.f11776g1, box.f11774b1)] - iArr[getIndex(box.f11778r1, box.f11776g1, box.f11773b0)]) - iArr[getIndex(box.f11778r1, box.f11775g0, box.f11774b1)]) + iArr[getIndex(box.f11778r1, box.f11775g0, box.f11773b0)]) - iArr[getIndex(box.f11777r0, box.f11776g1, box.f11774b1)]) + iArr[getIndex(box.f11777r0, box.f11776g1, box.f11773b0)]) + iArr[getIndex(box.f11777r0, box.f11775g0, box.f11774b1)]) - iArr[getIndex(box.f11777r0, box.f11775g0, box.f11773b0)];
    }

    public CreateBoxesResult createBoxes(int i11) {
        int i12;
        this.cubes = new Box[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            this.cubes[i13] = new Box();
        }
        double[] dArr = new double[i11];
        Box box = this.cubes[0];
        box.f11778r1 = 32;
        box.f11776g1 = 32;
        box.f11774b1 = 32;
        int i14 = 0;
        int i15 = 1;
        while (i15 < i11) {
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i14], boxArr[i15]).booleanValue()) {
                Box box2 = this.cubes[i14];
                dArr[i14] = box2.vol > 1 ? variance(box2) : 0.0d;
                Box box3 = this.cubes[i15];
                dArr[i15] = box3.vol > 1 ? variance(box3) : 0.0d;
            } else {
                dArr[i14] = 0.0d;
                i15--;
            }
            double d11 = dArr[0];
            int i16 = 0;
            for (int i17 = 1; i17 <= i15; i17++) {
                double d12 = dArr[i17];
                if (d12 > d11) {
                    i16 = i17;
                    d11 = d12;
                }
            }
            if (d11 <= 0.0d) {
                i12 = i15 + 1;
                return new CreateBoxesResult(i11, i12);
            }
            i15++;
            i14 = i16;
        }
        i12 = i11;
        return new CreateBoxesResult(i11, i12);
    }

    public void createMoments() {
        int i11 = 1;
        while (true) {
            int i12 = 33;
            if (i11 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i13 = 1;
            while (i13 < i12) {
                int i14 = 0;
                int i15 = 0;
                double d11 = 0.0d;
                int i16 = 1;
                int i17 = 0;
                int i18 = 0;
                while (i16 < i12) {
                    int index = getIndex(i11, i13, i16);
                    i14 += this.weights[index];
                    i17 += this.momentsR[index];
                    i18 += this.momentsG[index];
                    i15 += this.momentsB[index];
                    d11 += this.moments[index];
                    iArr[i16] = iArr[i16] + i14;
                    iArr2[i16] = iArr2[i16] + i17;
                    iArr3[i16] = iArr3[i16] + i18;
                    iArr4[i16] = iArr4[i16] + i15;
                    dArr[i16] = dArr[i16] + d11;
                    int index2 = getIndex(i11 - 1, i13, i16);
                    int i19 = i16;
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i19];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i19];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i19];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i19];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i19];
                    i16 = i19 + 1;
                    i12 = 33;
                }
                i13++;
                i12 = 33;
            }
            i11++;
        }
    }

    public List<Integer> createResult(int i11) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i11; i12++) {
            Box box = this.cubes[i12];
            int iVolume = volume(box, this.weights);
            if (iVolume > 0) {
                int iVolume2 = volume(box, this.momentsR) / iVolume;
                int iVolume3 = volume(box, this.momentsG) / iVolume;
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / iVolume) & 255) | ((iVolume2 & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((iVolume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    public Boolean cut(Box box, Box box2) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int iVolume4 = volume(box, this.weights);
        Direction direction = Direction.RED;
        MaximizeResult maximizeResultMaximize = maximize(box, direction, box.f11777r0 + 1, box.f11778r1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction2 = Direction.GREEN;
        MaximizeResult maximizeResultMaximize2 = maximize(box, direction2, box.f11775g0 + 1, box.f11776g1, iVolume, iVolume2, iVolume3, iVolume4);
        Direction direction3 = Direction.BLUE;
        MaximizeResult maximizeResultMaximize3 = maximize(box, direction3, box.f11773b0 + 1, box.f11774b1, iVolume, iVolume2, iVolume3, iVolume4);
        double d11 = maximizeResultMaximize.maximum;
        double d12 = maximizeResultMaximize2.maximum;
        double d13 = maximizeResultMaximize3.maximum;
        if (d11 < d12 || d11 < d13) {
            if (d12 >= d11 && d12 >= d13) {
                direction3 = direction2;
            }
        } else {
            if (maximizeResultMaximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
            direction3 = direction;
        }
        box2.f11778r1 = box.f11778r1;
        box2.f11776g1 = box.f11776g1;
        box2.f11774b1 = box.f11774b1;
        int iOrdinal = direction3.ordinal();
        if (iOrdinal == 0) {
            int i11 = maximizeResultMaximize.cutLocation;
            box.f11778r1 = i11;
            box2.f11777r0 = i11;
            box2.f11775g0 = box.f11775g0;
            box2.f11773b0 = box.f11773b0;
        } else if (iOrdinal == 1) {
            int i12 = maximizeResultMaximize2.cutLocation;
            box.f11776g1 = i12;
            box2.f11777r0 = box.f11777r0;
            box2.f11775g0 = i12;
            box2.f11773b0 = box.f11773b0;
        } else if (iOrdinal == 2) {
            int i13 = maximizeResultMaximize3.cutLocation;
            box.f11774b1 = i13;
            box2.f11777r0 = box.f11777r0;
            box2.f11775g0 = box.f11775g0;
            box2.f11773b0 = i13;
        }
        box.vol = (box.f11778r1 - box.f11777r0) * (box.f11776g1 - box.f11775g0) * (box.f11774b1 - box.f11773b0);
        box2.vol = (box2.f11778r1 - box2.f11777r0) * (box2.f11776g1 - box2.f11775g0) * (box2.f11774b1 - box2.f11773b0);
        return Boolean.TRUE;
    }

    public MaximizeResult maximize(Box box, Direction direction, int i11, int i12, int i13, int i14, int i15, int i16) {
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        int iBottom = bottom(box2, direction, quantizerWu.momentsR);
        int iBottom2 = bottom(box2, direction, quantizerWu.momentsG);
        int iBottom3 = bottom(box2, direction, quantizerWu.momentsB);
        int iBottom4 = bottom(box2, direction, quantizerWu.weights);
        int i17 = -1;
        double d11 = 0.0d;
        int i18 = i11;
        while (i18 < i12) {
            int pVar = top(box2, direction, i18, quantizerWu.momentsR) + iBottom;
            int pVar2 = top(box2, direction, i18, quantizerWu.momentsG) + iBottom2;
            int pVar3 = top(box2, direction, i18, quantizerWu.momentsB) + iBottom3;
            int pVar4 = top(box2, direction, i18, quantizerWu.weights) + iBottom4;
            if (pVar4 != 0) {
                double d12 = ((double) (((pVar * pVar) + (pVar2 * pVar2)) + (pVar3 * pVar3))) / ((double) pVar4);
                int i19 = i13 - pVar;
                int i21 = i14 - pVar2;
                int i22 = i15 - pVar3;
                int i23 = i16 - pVar4;
                if (i23 != 0) {
                    double d13 = d12 + (((double) (((i19 * i19) + (i21 * i21)) + (i22 * i22))) / ((double) i23));
                    if (d13 > d11) {
                        d11 = d13;
                        i17 = i18;
                    }
                }
            }
            i18++;
            quantizerWu = this;
            box2 = box;
        }
        return new MaximizeResult(i17, d11);
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public QuantizerResult quantize(int[] iArr, int i11) {
        constructHistogram(new QuantizerMap().quantize(iArr, i11).colorToCount);
        createMoments();
        List<Integer> listCreateResult = createResult(createBoxes(i11).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listCreateResult) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    public double variance(Box box) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        return (((((((this.moments[getIndex(box.f11778r1, box.f11776g1, box.f11774b1)] - this.moments[getIndex(box.f11778r1, box.f11776g1, box.f11773b0)]) - this.moments[getIndex(box.f11778r1, box.f11775g0, box.f11774b1)]) + this.moments[getIndex(box.f11778r1, box.f11775g0, box.f11773b0)]) - this.moments[getIndex(box.f11777r0, box.f11776g1, box.f11774b1)]) + this.moments[getIndex(box.f11777r0, box.f11776g1, box.f11773b0)]) + this.moments[getIndex(box.f11777r0, box.f11775g0, box.f11774b1)]) - this.moments[getIndex(box.f11777r0, box.f11775g0, box.f11773b0)]) - (((double) (((iVolume * iVolume) + (iVolume2 * iVolume2)) + (iVolume3 * iVolume3))) / ((double) volume(box, this.weights)));
    }

    public static int bottom(Box box, Direction direction, int[] iArr) {
        int i11;
        int i12;
        int iOrdinal = direction.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i11 = (-iArr[getIndex(box.f11778r1, box.f11776g1, box.f11773b0)]) + iArr[getIndex(box.f11778r1, box.f11775g0, box.f11773b0)] + iArr[getIndex(box.f11777r0, box.f11776g1, box.f11773b0)];
                    i12 = iArr[getIndex(box.f11777r0, box.f11775g0, box.f11773b0)];
                } else {
                    throw new IllegalArgumentException("unexpected direction " + direction);
                }
            } else {
                i11 = (-iArr[getIndex(box.f11778r1, box.f11775g0, box.f11774b1)]) + iArr[getIndex(box.f11778r1, box.f11775g0, box.f11773b0)] + iArr[getIndex(box.f11777r0, box.f11775g0, box.f11774b1)];
                i12 = iArr[getIndex(box.f11777r0, box.f11775g0, box.f11773b0)];
            }
        } else {
            i11 = (-iArr[getIndex(box.f11777r0, box.f11776g1, box.f11774b1)]) + iArr[getIndex(box.f11777r0, box.f11776g1, box.f11773b0)] + iArr[getIndex(box.f11777r0, box.f11775g0, box.f11774b1)];
            i12 = iArr[getIndex(box.f11777r0, box.f11775g0, box.f11773b0)];
        }
        return i11 - i12;
    }

    public static int top(Box box, Direction direction, int i11, int[] iArr) {
        int i12;
        int i13;
        int iOrdinal = direction.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i12 = (iArr[getIndex(box.f11778r1, box.f11776g1, i11)] - iArr[getIndex(box.f11778r1, box.f11775g0, i11)]) - iArr[getIndex(box.f11777r0, box.f11776g1, i11)];
                    i13 = iArr[getIndex(box.f11777r0, box.f11775g0, i11)];
                } else {
                    throw new IllegalArgumentException("unexpected direction " + direction);
                }
            } else {
                i12 = (iArr[getIndex(box.f11778r1, i11, box.f11774b1)] - iArr[getIndex(box.f11778r1, i11, box.f11773b0)]) - iArr[getIndex(box.f11777r0, i11, box.f11774b1)];
                i13 = iArr[getIndex(box.f11777r0, i11, box.f11773b0)];
            }
        } else {
            i12 = (iArr[getIndex(i11, box.f11776g1, box.f11774b1)] - iArr[getIndex(i11, box.f11776g1, box.f11773b0)]) - iArr[getIndex(i11, box.f11775g0, box.f11774b1)];
            i13 = iArr[getIndex(i11, box.f11775g0, box.f11773b0)];
        }
        return i12 + i13;
    }

    public void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int index = getIndex((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + iIntValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = iArr2[index] + (iRedFromArgb * iIntValue2);
            int[] iArr3 = this.momentsG;
            iArr3[index] = iArr3[index] + (iGreenFromArgb * iIntValue2);
            int[] iArr4 = this.momentsB;
            iArr4[index] = iArr4[index] + (iBlueFromArgb * iIntValue2);
            double[] dArr = this.moments;
            dArr[index] = dArr[index] + ((double) (iIntValue2 * ((iRedFromArgb * iRedFromArgb) + (iGreenFromArgb * iGreenFromArgb) + (iBlueFromArgb * iBlueFromArgb))));
        }
    }
}
