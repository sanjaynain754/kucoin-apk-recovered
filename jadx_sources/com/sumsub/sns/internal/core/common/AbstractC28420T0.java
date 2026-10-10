package com.sumsub.sns.internal.core.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.CharsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.T0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28420T0 {
    /* JADX INFO: renamed from: a */
    public static final byte[] m69302a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalStateException("Must have an even length");
        }
        List<String> listChunked = StringsKt.chunked(str, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listChunked, 10));
        Iterator<T> it = listChunked.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt.checkRadix(16))));
        }
        return CollectionsKt.toByteArray(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static final String m69301a(List list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(((String) list.get(0)).toLowerCase(Locale.ROOT));
        Iterator<Integer> it = RangesKt.until(1, list.size()).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            String strValueOf = String.valueOf(((String) list.get(iNextInt)).charAt(0));
            Locale locale = Locale.ROOT;
            sb2.append(strValueOf.toUpperCase(locale));
            sb2.append(((String) list.get(iNextInt)).substring(1).toLowerCase(locale));
        }
        return sb2.toString();
    }
}
