package com.sumsub.sentry;

import java.util.List;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27903X {

    @NotNull
    public static final C27901W Companion = new C27901W();

    /* JADX INFO: renamed from: e */
    public static final Lazy[] f56987e;

    /* JADX INFO: renamed from: a */
    public final String f56988a;

    /* JADX INFO: renamed from: b */
    public final String f56989b;

    /* JADX INFO: renamed from: c */
    public final List f56990c;

    /* JADX INFO: renamed from: d */
    public final List f56991d;

    public /* synthetic */ C27903X(int i11, String str, String str2, List list, List list2) {
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C27899V.f56985a.getDescriptor());
        }
        this.f56988a = str;
        this.f56989b = str2;
        if ((i11 & 4) == 0) {
            this.f56990c = null;
        } else {
            this.f56990c = list;
        }
        if ((i11 & 8) == 0) {
            this.f56991d = null;
        } else {
            this.f56991d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27903X)) {
            return false;
        }
        C27903X c27903x = (C27903X) obj;
        return Intrinsics.areEqual(this.f56988a, c27903x.f56988a) && Intrinsics.areEqual(this.f56989b, c27903x.f56989b) && Intrinsics.areEqual(this.f56990c, c27903x.f56990c) && Intrinsics.areEqual(this.f56991d, c27903x.f56991d);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f56987e = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.y1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27903X.m68984a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sentry.z1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C27903X.m68985b();
            }
        })};
    }

    public C27903X() {
        this.f56988a = "SumSub";
        this.f56989b = "1.46.0";
        this.f56990c = null;
        this.f56991d = null;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m68984a() {
        return new C41813f(C28019z0.f57174a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m68985b() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        int iM68983a = AbstractC27897U.m68983a(this.f56989b, this.f56988a.hashCode() * 31, 31);
        List list = this.f56990c;
        int iHashCode = (iM68983a + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f56991d;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "SdkVersion(name=" + this.f56988a + ", version=" + this.f56989b + ", packages=" + this.f56990c + ", integrations=" + this.f56991d + ")";
    }
}
