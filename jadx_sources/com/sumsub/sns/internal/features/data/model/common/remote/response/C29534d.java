package com.sumsub.sns.internal.features.data.model.common.remote.response;

import com.sumsub.sns.internal.features.data.model.common.C29057T2;
import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import com.sumsub.sns.internal.features.data.model.common.remote.C29413m0;
import java.util.List;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.internal.C41813f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29534d {

    @NotNull
    public static final C29529c Companion = new C29529c();

    /* JADX INFO: renamed from: k */
    public static final Lazy[] f59551k;

    /* JADX INFO: renamed from: a */
    public final String f59552a;

    /* JADX INFO: renamed from: b */
    public final C29603s1 f59553b;

    /* JADX INFO: renamed from: c */
    public final String f59554c;

    /* JADX INFO: renamed from: d */
    public final C29489L0 f59555d;

    /* JADX INFO: renamed from: e */
    public final C29489L0 f59556e;

    /* JADX INFO: renamed from: f */
    public final List f59557f;

    /* JADX INFO: renamed from: g */
    public final List f59558g;

    /* JADX INFO: renamed from: h */
    public final C29332c f59559h;

    /* JADX INFO: renamed from: i */
    public final String f59560i;

    /* JADX INFO: renamed from: j */
    public final String f59561j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29534d)) {
            return false;
        }
        C29534d c29534d = (C29534d) obj;
        return Intrinsics.areEqual(this.f59552a, c29534d.f59552a) && Intrinsics.areEqual(this.f59553b, c29534d.f59553b) && Intrinsics.areEqual(this.f59554c, c29534d.f59554c) && Intrinsics.areEqual(this.f59555d, c29534d.f59555d) && Intrinsics.areEqual(this.f59556e, c29534d.f59556e) && Intrinsics.areEqual(this.f59557f, c29534d.f59557f) && Intrinsics.areEqual(this.f59558g, c29534d.f59558g) && Intrinsics.areEqual(this.f59559h, c29534d.f59559h) && Intrinsics.areEqual(this.f59560i, c29534d.f59560i) && Intrinsics.areEqual(this.f59561j, c29534d.f59561j);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59551k = new Lazy[]{null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.s2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29534d.m69883a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.t2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29534d.m69884b();
            }
        }), null, null, null};
    }

    public /* synthetic */ C29534d(int i11, String str, C29603s1 c29603s1, String str2, C29489L0 c29489l0, C29489L0 c29489l1, List list, List list2, C29332c c29332c, String str3, String str4) {
        if (2 != (i11 & 2)) {
            C41801c2.m91514a(i11, 2, C29524b.f59542a.getDescriptor());
        }
        this.f59552a = (i11 & 1) == 0 ? "" : str;
        this.f59553b = c29603s1;
        if ((i11 & 4) == 0) {
            this.f59554c = null;
        } else {
            this.f59554c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f59555d = null;
        } else {
            this.f59555d = c29489l0;
        }
        if ((i11 & 16) == 0) {
            this.f59556e = null;
        } else {
            this.f59556e = c29489l1;
        }
        if ((i11 & 32) == 0) {
            this.f59557f = null;
        } else {
            this.f59557f = list;
        }
        if ((i11 & 64) == 0) {
            this.f59558g = null;
        } else {
            this.f59558g = list2;
        }
        if ((i11 & 128) == 0) {
            this.f59559h = null;
        } else {
            this.f59559h = c29332c;
        }
        if ((i11 & 256) == 0) {
            this.f59560i = null;
        } else {
            this.f59560i = str3;
        }
        if ((i11 & 512) == 0) {
            this.f59561j = null;
        } else {
            this.f59561j = str4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69883a() {
        return new C41813f(C29057T2.f59004a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69884b() {
        return new C41813f(C29413m0.f59415a);
    }

    public final int hashCode() {
        int iHashCode = (this.f59553b.hashCode() + (this.f59552a.hashCode() * 31)) * 31;
        String str = this.f59554c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C29489L0 c29489l0 = this.f59555d;
        int iHashCode3 = (iHashCode2 + (c29489l0 == null ? 0 : c29489l0.hashCode())) * 31;
        C29489L0 c29489l1 = this.f59556e;
        int iHashCode4 = (iHashCode3 + (c29489l1 == null ? 0 : c29489l1.hashCode())) * 31;
        List list = this.f59557f;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f59558g;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C29332c c29332c = this.f59559h;
        int iHashCode7 = (iHashCode6 + (c29332c == null ? 0 : c29332c.hashCode())) * 31;
        String str2 = this.f59560i;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59561j;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "Action(actionId=" + this.f59552a + ", requiredIdDocs=" + this.f59553b + ", externalActionId=" + this.f59554c + ", info=" + this.f59555d + ", fixedInfo=" + this.f59556e + ", questionnaires=" + this.f59557f + ", metadata=" + this.f59558g + ", agreement=" + this.f59559h + ", email=" + this.f59560i + ", phone=" + this.f59561j + ")";
    }
}
