package com.sumsub.sns.internal.features.data.model.common.remote.response;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41891v0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;
import ug0.C45236a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.A1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29457A1 {

    @NotNull
    public static final C29631z1 Companion = new C29631z1();

    /* JADX INFO: renamed from: f */
    public static final Lazy[] f59449f;

    /* JADX INFO: renamed from: a */
    public final C29487K1 f59450a;

    /* JADX INFO: renamed from: b */
    public final String f59451b;

    /* JADX INFO: renamed from: c */
    public final String f59452c;

    /* JADX INFO: renamed from: d */
    public final List f59453d;

    /* JADX INFO: renamed from: e */
    public final Map f59454e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29457A1)) {
            return false;
        }
        C29457A1 c29457a1 = (C29457A1) obj;
        return Intrinsics.areEqual(this.f59450a, c29457a1.f59450a) && Intrinsics.areEqual(this.f59451b, c29457a1.f59451b) && Intrinsics.areEqual(this.f59452c, c29457a1.f59452c) && Intrinsics.areEqual(this.f59453d, c29457a1.f59453d) && Intrinsics.areEqual(this.f59454e, c29457a1.f59454e);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59449f = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.d2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29457A1.m69862a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.e2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29457A1.m69863b();
            }
        })};
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69862a() {
        return new C41813f(C41891v0.f92041a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69863b() {
        return new C41790a1(C41891v0.f92041a, C45236a.m99969u(C29481I1.f59488a));
    }

    public final int hashCode() {
        C29487K1 c29487k1 = this.f59450a;
        int iHashCode = (c29487k1 == null ? 0 : c29487k1.hashCode()) * 31;
        String str = this.f59451b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59452c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f59453d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f59454e;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteRequiredDoc(reviewResult=" + this.f59450a + ", country=" + this.f59451b + ", identity=" + this.f59452c + ", imageIds=" + this.f59453d + ", imageReviewResults=" + this.f59454e + ")";
    }

    public /* synthetic */ C29457A1(int i11, C29487K1 c29487k1, String str, String str2, List list, Map map) {
        if ((i11 & 1) == 0) {
            this.f59450a = null;
        } else {
            this.f59450a = c29487k1;
        }
        if ((i11 & 2) == 0) {
            this.f59451b = null;
        } else {
            this.f59451b = str;
        }
        if ((i11 & 4) == 0) {
            this.f59452c = null;
        } else {
            this.f59452c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f59453d = null;
        } else {
            this.f59453d = list;
        }
        if ((i11 & 16) == 0) {
            this.f59454e = null;
        } else {
            this.f59454e = map;
        }
    }
}
