package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class QuantizerCelebi {
    public static Map<Integer, Integer> quantize(int[] iArr, int i11) {
        Set<Integer> setKeySet = new QuantizerWu().quantize(iArr, i11).colorToCount.keySet();
        int[] iArr2 = new int[setKeySet.size()];
        Iterator<Integer> it = setKeySet.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            iArr2[i12] = it.next().intValue();
            i12++;
        }
        return QuantizerWsmeans.quantize(iArr, iArr2, i11);
    }

    private QuantizerCelebi() {
    }
}
