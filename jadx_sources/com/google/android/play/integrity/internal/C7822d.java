package com.google.android.play.integrity.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.d */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C7822d {
    /* JADX INFO: renamed from: a */
    public static final List m13310a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC7824f abstractC7824f = (AbstractC7824f) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC7824f.mo13312a());
            bundle.putLong("event_timestamp", abstractC7824f.mo13313b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final void m13311b(int i11, List list) {
        list.add(AbstractC7824f.m13314c(i11, System.currentTimeMillis()));
    }
}
