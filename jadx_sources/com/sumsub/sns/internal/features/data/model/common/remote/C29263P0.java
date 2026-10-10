package com.sumsub.sns.internal.features.data.model.common.remote;

import com.sumsub.sns.internal.features.data.model.common.C29704v;
import com.sumsub.sns.internal.features.data.model.common.remote.response.ConfirmationType;
import java.util.List;
import kotlinx.serialization.internal.C41813f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.P0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29263P0 {

    @NotNull
    public static final C29258O0 Companion = new C29258O0();

    /* JADX INFO: renamed from: f */
    public static final Lazy[] f59252f;

    /* JADX INFO: renamed from: a */
    public final String f59253a;

    /* JADX INFO: renamed from: b */
    public final String f59254b;

    /* JADX INFO: renamed from: c */
    public final ConfirmationType f59255c;

    /* JADX INFO: renamed from: d */
    public final List f59256d;

    /* JADX INFO: renamed from: e */
    public final String f59257e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29263P0)) {
            return false;
        }
        C29263P0 c29263p0 = (C29263P0) obj;
        return Intrinsics.areEqual(this.f59253a, c29263p0.f59253a) && Intrinsics.areEqual(this.f59254b, c29263p0.f59254b) && this.f59255c == c29263p0.f59255c && Intrinsics.areEqual(this.f59256d, c29263p0.f59256d) && Intrinsics.areEqual(this.f59257e, c29263p0.f59257e);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59252f = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.x4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConfirmationType.Companion.serializer();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.y4
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29263P0.m69819b();
            }
        }), null};
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69819b() {
        return new C41813f(C29704v.f59768a);
    }

    public final int hashCode() {
        String str = this.f59253a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59254b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConfirmationType confirmationType = this.f59255c;
        int iHashCode3 = (iHashCode2 + (confirmationType == null ? 0 : confirmationType.hashCode())) * 31;
        List list = this.f59256d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f59257e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteApplicantDataSource(sourceId=" + this.f59253a + ", docType=" + this.f59254b + ", confirmationType=" + this.f59255c + ", fields=" + this.f59256d + ", idDocSetType=" + this.f59257e + ")";
    }

    public /* synthetic */ C29263P0(int i11, String str, String str2, ConfirmationType confirmationType, List list, String str3) {
        if ((i11 & 1) == 0) {
            this.f59253a = null;
        } else {
            this.f59253a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59254b = null;
        } else {
            this.f59254b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59255c = null;
        } else {
            this.f59255c = confirmationType;
        }
        if ((i11 & 8) == 0) {
            this.f59256d = null;
        } else {
            this.f59256d = list;
        }
        if ((i11 & 16) == 0) {
            this.f59257e = null;
        } else {
            this.f59257e = str3;
        }
    }
}
