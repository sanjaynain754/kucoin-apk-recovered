package com.sumsub.sns.internal.p125ff.core;

import com.sumsub.sns.internal.core.common.C28468k0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ff.core.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33050a {

    /* JADX INFO: renamed from: a */
    public final String f67494a;

    /* JADX INFO: renamed from: b */
    public final String f67495b;

    /* JADX INFO: renamed from: c */
    public final boolean f67496c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f67497d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final AtomicReference f67498e = new AtomicReference();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f67499f = new AtomicReference();

    /* JADX INFO: renamed from: g */
    public final C33052c f67500g;

    /* JADX INFO: renamed from: a */
    public static void m71433a(C33050a c33050a, boolean z11) {
        AtomicReference atomicReference = c33050a.f67498e;
        FeatureFlagValueType featureFlagValueType = FeatureFlagValueType.DEFAULT;
        atomicReference.set(new C33052c(z11, null));
    }

    /* JADX INFO: renamed from: b */
    public final C33052c m71435b() {
        C33052c c33052c;
        C33052c c33052c2 = (C33052c) this.f67499f.get();
        if (c33052c2 != null) {
            return c33052c2;
        }
        C33052c c33052c3 = (C33052c) this.f67498e.get();
        if (c33052c3 != null) {
            return c33052c3;
        }
        return (this.f67496c || (c33052c = (C33052c) this.f67497d.get()) == null) ? this.f67500g : c33052c;
    }

    public C33050a(String str, String str2, boolean z11, String str3) {
        this.f67494a = str;
        this.f67495b = str2;
        this.f67496c = z11;
        FeatureFlagValueType featureFlagValueType = FeatureFlagValueType.DEFAULT;
        this.f67500g = new C33052c(false, str3);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m71434a() {
        C28468k0 c28468k0 = C28468k0.f57983a;
        return m71435b().f67503a;
    }
}
