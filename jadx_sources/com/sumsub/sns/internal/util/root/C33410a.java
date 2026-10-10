package com.sumsub.sns.internal.util.root;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import fb0.C37423b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.root.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33410a {

    /* JADX INFO: renamed from: a */
    public final Lazy f68113a;

    /* JADX INFO: renamed from: a */
    public static final C33411b m71696a(Context context) {
        C37423b c37423b = new C37423b(context);
        return new C33411b(c37423b.m84192j(), c37423b.m84190h(), c37423b.m84184b(CmcdConfiguration.KEY_STARTUP), c37423b.m84185c(), c37423b.m84187e(), c37423b.m84194l(), c37423b.m84189g(), c37423b.m84188f(), c37423b.m84186d());
    }

    public C33410a(final Context context) {
        this.f68113a = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.util.root.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33410a.m71696a(context);
            }
        });
    }
}
