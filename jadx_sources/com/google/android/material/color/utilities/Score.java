package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Score {
    private static final int BLUE_500 = -12417548;
    private static final double CUTOFF_CHROMA = 5.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final int MAX_COLOR_COUNT = 4;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    public static class ScoredComparator implements Comparator<ScoredHCT> {
        @Override // java.util.Comparator
        public int compare(ScoredHCT scoredHCT, ScoredHCT scoredHCT2) {
            return Double.compare(scoredHCT2.score, scoredHCT.score);
        }
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
        return score(map, 4, BLUE_500, true);
    }

    public static class ScoredHCT {
        public final Hct hct;
        public final double score;

        public ScoredHCT(Hct hct, double d11) {
            this.hct = hct;
            this.score = d11;
        }
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i11) {
        return score(map, i11, BLUE_500, true);
    }

    private Score() {
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i11, int i12) {
        return score(map, i11, i12, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i11, int i12, boolean z11) {
        ArrayList<Hct> arrayList = new ArrayList();
        int[] iArr = new int[TXVodDownloadDataSource.QUALITY_360P];
        double d11 = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Hct hctFromInt = Hct.fromInt(entry.getKey().intValue());
            arrayList.add(hctFromInt);
            int iFloor = (int) Math.floor(hctFromInt.getHue());
            int iIntValue = entry.getValue().intValue();
            iArr[iFloor] = iArr[iFloor] + iIntValue;
            d11 += (double) iIntValue;
        }
        double[] dArr = new double[TXVodDownloadDataSource.QUALITY_360P];
        for (int i13 = 0; i13 < 360; i13++) {
            double d12 = ((double) iArr[i13]) / d11;
            for (int i14 = i13 - 14; i14 < i13 + 16; i14++) {
                int iSanitizeDegreesInt = MathUtils.sanitizeDegreesInt(i14);
                dArr[iSanitizeDegreesInt] = dArr[iSanitizeDegreesInt] + d12;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Hct hct : arrayList) {
            double d13 = dArr[MathUtils.sanitizeDegreesInt((int) Math.round(hct.getHue()))];
            if (!z11 || (hct.getChroma() >= CUTOFF_CHROMA && d13 > CUTOFF_EXCITED_PROPORTION)) {
                arrayList2.add(new ScoredHCT(hct, (d13 * 100.0d * WEIGHT_PROPORTION) + ((hct.getChroma() - TARGET_CHROMA) * (hct.getChroma() < TARGET_CHROMA ? WEIGHT_CHROMA_BELOW : WEIGHT_CHROMA_ABOVE))));
            }
        }
        Collections.sort(arrayList2, new ScoredComparator());
        ArrayList arrayList3 = new ArrayList();
        for (int i15 = 90; i15 >= 15; i15--) {
            arrayList3.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Hct hct2 = ((ScoredHCT) it.next()).hct;
                Iterator it2 = arrayList3.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList3.add(hct2);
                        break;
                    }
                } while (MathUtils.differenceDegrees(hct2.getHue(), ((Hct) it2.next()).getHue()) >= i15);
                if (arrayList3.size() >= i11) {
                    break;
                }
            }
            if (arrayList3.size() >= i11) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i12));
            return arrayList4;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((Hct) it3.next()).toInt()));
        }
        return arrayList4;
    }
}
