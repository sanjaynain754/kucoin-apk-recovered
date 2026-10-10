package com.sumsub.sns.internal.features.data.model.esign;

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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.esign.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29763f {

    @NotNull
    public static final C29761e Companion = new C29761e();

    /* JADX INFO: renamed from: f */
    public static final Lazy[] f59835f;

    /* JADX INFO: renamed from: a */
    public final String f59836a;

    /* JADX INFO: renamed from: b */
    public final String f59837b;

    /* JADX INFO: renamed from: c */
    public final Boolean f59838c;

    /* JADX INFO: renamed from: d */
    public final List f59839d;

    /* JADX INFO: renamed from: e */
    public final List f59840e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29763f)) {
            return false;
        }
        C29763f c29763f = (C29763f) obj;
        return Intrinsics.areEqual(this.f59836a, c29763f.f59836a) && Intrinsics.areEqual(this.f59837b, c29763f.f59837b) && Intrinsics.areEqual(this.f59838c, c29763f.f59838c) && Intrinsics.areEqual(this.f59839d, c29763f.f59839d) && Intrinsics.areEqual(this.f59840e, c29763f.f59840e);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59835f = new Lazy[]{null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.esign.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29763f.m69922a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.esign.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29763f.m69923b();
            }
        })};
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69922a() {
        return new C41813f(C29771j.f59845a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69923b() {
        return new C41813f(C29737I.f59808a);
    }

    public final int hashCode() {
        String str = this.f59836a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59837b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f59838c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f59839d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f59840e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "ESignAgreement(id=" + this.f59836a + ", text=" + this.f59837b + ", accepted=" + this.f59838c + ", files=" + this.f59839d + ", pages=" + this.f59840e + ")";
    }

    public /* synthetic */ C29763f(int i11, String str, String str2, Boolean bool, List list, List list2) {
        if ((i11 & 1) == 0) {
            this.f59836a = null;
        } else {
            this.f59836a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59837b = null;
        } else {
            this.f59837b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59838c = null;
        } else {
            this.f59838c = bool;
        }
        if ((i11 & 8) == 0) {
            this.f59839d = null;
        } else {
            this.f59839d = list;
        }
        if ((i11 & 16) == 0) {
            this.f59840e = null;
        } else {
            this.f59840e = list2;
        }
    }
}
