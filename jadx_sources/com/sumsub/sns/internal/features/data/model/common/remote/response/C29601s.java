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

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29601s {

    @NotNull
    public static final C29597r Companion = new C29597r();

    /* JADX INFO: renamed from: l */
    public static final Lazy[] f59637l;

    /* JADX INFO: renamed from: a */
    public final String f59638a;

    /* JADX INFO: renamed from: b */
    public final C29603s1 f59639b;

    /* JADX INFO: renamed from: c */
    public final String f59640c;

    /* JADX INFO: renamed from: d */
    public final String f59641d;

    /* JADX INFO: renamed from: e */
    public final C29489L0 f59642e;

    /* JADX INFO: renamed from: f */
    public final C29489L0 f59643f;

    /* JADX INFO: renamed from: g */
    public final List f59644g;

    /* JADX INFO: renamed from: h */
    public final List f59645h;

    /* JADX INFO: renamed from: i */
    public final C29332c f59646i;

    /* JADX INFO: renamed from: j */
    public final String f59647j;

    /* JADX INFO: renamed from: k */
    public final String f59648k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29601s)) {
            return false;
        }
        C29601s c29601s = (C29601s) obj;
        return Intrinsics.areEqual(this.f59638a, c29601s.f59638a) && Intrinsics.areEqual(this.f59639b, c29601s.f59639b) && Intrinsics.areEqual(this.f59640c, c29601s.f59640c) && Intrinsics.areEqual(this.f59641d, c29601s.f59641d) && Intrinsics.areEqual(this.f59642e, c29601s.f59642e) && Intrinsics.areEqual(this.f59643f, c29601s.f59643f) && Intrinsics.areEqual(this.f59644g, c29601s.f59644g) && Intrinsics.areEqual(this.f59645h, c29601s.f59645h) && Intrinsics.areEqual(this.f59646i, c29601s.f59646i) && Intrinsics.areEqual(this.f59647j, c29601s.f59647j) && Intrinsics.areEqual(this.f59648k, c29601s.f59648k);
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59637l = new Lazy[]{null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.a3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29601s.m69891a();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.b3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29601s.m69892b();
            }
        }), null, null, null};
    }

    public /* synthetic */ C29601s(int i11, String str, C29603s1 c29603s1, String str2, String str3, C29489L0 c29489l0, C29489L0 c29489l1, List list, List list2, C29332c c29332c, String str4, String str5) {
        if (2 != (i11 & 2)) {
            C41801c2.m91514a(i11, 2, C29593q.f59617a.getDescriptor());
        }
        this.f59638a = (i11 & 1) == 0 ? "" : str;
        this.f59639b = c29603s1;
        if ((i11 & 4) == 0) {
            this.f59640c = null;
        } else {
            this.f59640c = str2;
        }
        if ((i11 & 8) == 0) {
            this.f59641d = null;
        } else {
            this.f59641d = str3;
        }
        if ((i11 & 16) == 0) {
            this.f59642e = null;
        } else {
            this.f59642e = c29489l0;
        }
        if ((i11 & 32) == 0) {
            this.f59643f = null;
        } else {
            this.f59643f = c29489l1;
        }
        if ((i11 & 64) == 0) {
            this.f59644g = null;
        } else {
            this.f59644g = list;
        }
        if ((i11 & 128) == 0) {
            this.f59645h = null;
        } else {
            this.f59645h = list2;
        }
        if ((i11 & 256) == 0) {
            this.f59646i = null;
        } else {
            this.f59646i = c29332c;
        }
        if ((i11 & 512) == 0) {
            this.f59647j = null;
        } else {
            this.f59647j = str4;
        }
        if ((i11 & 1024) == 0) {
            this.f59648k = null;
        } else {
            this.f59648k = str5;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC44951d m69891a() {
        return new C41813f(C29057T2.f59004a);
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69892b() {
        return new C41813f(C29413m0.f59415a);
    }

    public final int hashCode() {
        int iHashCode = (this.f59639b.hashCode() + (this.f59638a.hashCode() * 31)) * 31;
        String str = this.f59640c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59641d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C29489L0 c29489l0 = this.f59642e;
        int iHashCode4 = (iHashCode3 + (c29489l0 == null ? 0 : c29489l0.hashCode())) * 31;
        C29489L0 c29489l1 = this.f59643f;
        int iHashCode5 = (iHashCode4 + (c29489l1 == null ? 0 : c29489l1.hashCode())) * 31;
        List list = this.f59644g;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f59645h;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C29332c c29332c = this.f59646i;
        int iHashCode8 = (iHashCode7 + (c29332c == null ? 0 : c29332c.hashCode())) * 31;
        String str3 = this.f59647j;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59648k;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "Applicant(id=" + this.f59638a + ", requiredIdDocs=" + this.f59639b + ", externalUserId=" + this.f59640c + ", lang=" + this.f59641d + ", info=" + this.f59642e + ", fixedInfo=" + this.f59643f + ", questionnaires=" + this.f59644g + ", metadata=" + this.f59645h + ", agreement=" + this.f59646i + ", email=" + this.f59647j + ", phone=" + this.f59648k + ")";
    }
}
