package com.sumsub.sns.internal.features.data.model.common.remote;

import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import java.util.List;
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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.j1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29390j1 {

    @NotNull
    public static final C29382i1 Companion = new C29382i1();

    /* JADX INFO: renamed from: g */
    public static final Lazy[] f59398g;

    /* JADX INFO: renamed from: a */
    public final Integer f59399a;

    /* JADX INFO: renamed from: b */
    public final String f59400b;

    /* JADX INFO: renamed from: c */
    public final String f59401c;

    /* JADX INFO: renamed from: d */
    public final IdentitySide f59402d;

    /* JADX INFO: renamed from: e */
    public final List f59403e;

    /* JADX INFO: renamed from: f */
    public final C29655v0 f59404f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29390j1)) {
            return false;
        }
        C29390j1 c29390j1 = (C29390j1) obj;
        return Intrinsics.areEqual(this.f59399a, c29390j1.f59399a) && Intrinsics.areEqual(this.f59400b, c29390j1.f59400b) && Intrinsics.areEqual(this.f59401c, c29390j1.f59401c) && this.f59402d == c29390j1.f59402d && Intrinsics.areEqual(this.f59403e, c29390j1.f59403e) && Intrinsics.areEqual(this.f59404f, c29390j1.f59404f);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59398g = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.c6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IdentitySide.Companion.serializer();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.d6
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29390j1.m69856b();
            }
        }), null};
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69856b() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        Integer num = this.f59399a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f59400b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59401c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IdentitySide identitySide = this.f59402d;
        int iHashCode4 = (iHashCode3 + (identitySide == null ? 0 : identitySide.hashCode())) * 31;
        List list = this.f59403e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        C29655v0 c29655v0 = this.f59404f;
        return iHashCode5 + (c29655v0 != null ? c29655v0.hashCode() : 0);
    }

    public final String toString() {
        return "Uploaded(imageId=" + this.f59399a + ", country=" + this.f59400b + ", idDocType=" + this.f59401c + ", idDocSubType=" + this.f59402d + ", errors=" + this.f59403e + ", nfcSessionInfo=" + this.f59404f + ")";
    }

    public /* synthetic */ C29390j1(int i11, Integer num, String str, String str2, IdentitySide identitySide, List list, C29655v0 c29655v0) {
        if ((i11 & 1) == 0) {
            this.f59399a = null;
        } else {
            this.f59399a = num;
        }
        if ((i11 & 2) == 0) {
            this.f59400b = null;
        } else {
            this.f59400b = str;
        }
        if ((i11 & 4) == 0) {
            this.f59401c = null;
        } else {
            this.f59401c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f59402d = null;
        } else {
            this.f59402d = identitySide;
        }
        if ((i11 & 16) == 0) {
            this.f59403e = null;
        } else {
            this.f59403e = list;
        }
        if ((i11 & 32) == 0) {
            this.f59404f = null;
        } else {
            this.f59404f = c29655v0;
        }
    }
}
