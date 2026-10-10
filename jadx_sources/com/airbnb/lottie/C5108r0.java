package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p484o1.C42928j;

/* JADX INFO: renamed from: com.airbnb.lottie.r0 */
/* JADX INFO: compiled from: PerformanceTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class C5108r0 {

    /* JADX INFO: renamed from: a */
    public boolean f6215a = false;

    /* JADX INFO: renamed from: b */
    public final Set<b> f6216b = new ArraySet();

    /* JADX INFO: renamed from: c */
    public final Map<String, C42928j> f6217c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Comparator<Pair<String, Float>> f6218d = new a();

    /* JADX INFO: renamed from: com.airbnb.lottie.r0$a */
    /* JADX INFO: compiled from: PerformanceTracker.java */
    public class a implements Comparator<Pair<String, Float>> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = pair.second.floatValue();
            float fFloatValue2 = pair2.second.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.r0$b */
    /* JADX INFO: compiled from: PerformanceTracker.java */
    /* JADX INFO: loaded from: classes34.dex */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m5902a(float f11);
    }

    /* JADX INFO: renamed from: a */
    public void m5899a(String str, float f11) {
        if (this.f6215a) {
            C42928j c42928j = this.f6217c.get(str);
            if (c42928j == null) {
                c42928j = new C42928j();
                this.f6217c.put(str, c42928j);
            }
            c42928j.m94186a(f11);
            if (str.equals("__container")) {
                Iterator<b> it = this.f6216b.iterator();
                while (it.hasNext()) {
                    it.next().m5902a(f11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5900b(boolean z11) {
        this.f6215a = z11;
    }
}
