package com.kubi.sdk;

import androidx.exifinterface.media.ExifInterface;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.sdk.t2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BaseAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\u00028\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u00028\u0001X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/KV;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "first", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "setFirst", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getSecond", "setSecond", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KV<K, V> {

    /* JADX INFO: renamed from: a */
    public K f47981a;

    /* JADX INFO: renamed from: b */
    public V f47982b;

    /* JADX INFO: renamed from: a */
    public final K m58210a() {
        return this.f47981a;
    }

    /* JADX INFO: renamed from: b */
    public final V m58211b() {
        return this.f47982b;
    }

    /* JADX INFO: renamed from: c */
    public final void m58212c(K k11) {
        this.f47981a = k11;
    }

    /* JADX INFO: renamed from: d */
    public final void m58213d(V v11) {
        this.f47982b = v11;
    }

    public KV(K k11, V v11) {
        this.f47981a = k11;
        this.f47982b = v11;
    }
}
