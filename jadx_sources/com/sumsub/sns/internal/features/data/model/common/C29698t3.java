package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.t3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29698t3 extends AbstractC29172p {

    /* JADX INFO: renamed from: a */
    public final String f59748a;

    /* JADX INFO: renamed from: b */
    public final String f59749b;

    /* JADX INFO: renamed from: c */
    public final C29160n f59750c;

    /* JADX INFO: renamed from: d */
    public final C29140j3 f59751d;

    /* JADX INFO: renamed from: e */
    public final C29332c f59752e;

    /* JADX INFO: renamed from: f */
    public final C29166o f59753f;

    /* JADX INFO: renamed from: g */
    public final C29136j f59754g;

    /* JADX INFO: renamed from: h */
    public final C29148l f59755h;

    /* JADX INFO: renamed from: i */
    public final String f59756i;

    /* JADX INFO: renamed from: j */
    public final List f59757j;

    /* JADX INFO: renamed from: k */
    public final List f59758k;

    /* JADX INFO: renamed from: l */
    public final String f59759l;

    /* JADX INFO: renamed from: m */
    public final String f59760m;

    /* JADX INFO: renamed from: a */
    public static C29698t3 m69908a(C29698t3 c29698t3, C29332c c29332c, C29166o c29166o, int i11) {
        String str = c29698t3.f59748a;
        String str2 = c29698t3.f59749b;
        C29160n c29160n = c29698t3.f59750c;
        C29140j3 c29140j3 = c29698t3.f59751d;
        if ((i11 & 16) != 0) {
            c29332c = c29698t3.f59752e;
        }
        return new C29698t3(str, str2, c29160n, c29140j3, c29332c, (i11 & 32) != 0 ? c29698t3.f59753f : c29166o, c29698t3.f59754g, c29698t3.f59755h, c29698t3.f59756i, c29698t3.f59757j, c29698t3.f59758k, c29698t3.f59759l, c29698t3.f59760m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29698t3)) {
            return false;
        }
        C29698t3 c29698t3 = (C29698t3) obj;
        return Intrinsics.areEqual(this.f59748a, c29698t3.f59748a) && Intrinsics.areEqual(this.f59749b, c29698t3.f59749b) && Intrinsics.areEqual(this.f59750c, c29698t3.f59750c) && Intrinsics.areEqual(this.f59751d, c29698t3.f59751d) && Intrinsics.areEqual(this.f59752e, c29698t3.f59752e) && Intrinsics.areEqual(this.f59753f, c29698t3.f59753f) && Intrinsics.areEqual(this.f59754g, c29698t3.f59754g) && Intrinsics.areEqual(this.f59755h, c29698t3.f59755h) && Intrinsics.areEqual(this.f59756i, c29698t3.f59756i) && Intrinsics.areEqual(this.f59757j, c29698t3.f59757j) && Intrinsics.areEqual(this.f59758k, c29698t3.f59758k) && Intrinsics.areEqual(this.f59759l, c29698t3.f59759l) && Intrinsics.areEqual(this.f59760m, c29698t3.f59760m);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: a */
    public final C29332c mo69752a() {
        return this.f59752e;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: c */
    public final String mo69753c() {
        return this.f59759l;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: e */
    public final String mo69754e() {
        return this.f59748a;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: f */
    public final C29136j mo69755f() {
        return this.f59754g;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: g */
    public final String mo69756g() {
        return this.f59756i;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: h */
    public final String mo69757h() {
        return this.f59760m;
    }

    public final int hashCode() {
        int iHashCode = this.f59748a.hashCode() * 31;
        String str = this.f59749b;
        int iHashCode2 = (this.f59751d.hashCode() + ((this.f59750c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        C29332c c29332c = this.f59752e;
        int iHashCode3 = (this.f59753f.hashCode() + ((iHashCode2 + (c29332c == null ? 0 : c29332c.hashCode())) * 31)) * 31;
        C29136j c29136j = this.f59754g;
        int iHashCode4 = (iHashCode3 + (c29136j == null ? 0 : c29136j.hashCode())) * 31;
        C29148l c29148l = this.f59755h;
        int iHashCode5 = (iHashCode4 + (c29148l == null ? 0 : c29148l.hashCode())) * 31;
        String str2 = this.f59756i;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f59757j;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f59758k;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.f59759l;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59760m;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: i */
    public final List mo69758i() {
        return this.f59758k;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: j */
    public final C29148l mo69759j() {
        return this.f59755h;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: k */
    public final C29160n mo69760k() {
        return this.f59750c;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: l */
    public final C29140j3 mo69761l() {
        return this.f59751d;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: m */
    public final C29166o mo69762m() {
        return this.f59753f;
    }

    public final String toString() {
        return "StandaloneApplicant(id=" + this.f59748a + ", externalUserId=" + this.f59749b + ", requiredIdDocs=" + this.f59750c + ", requiredIdDocsStatus=" + this.f59751d + ", agreement=" + this.f59752e + ", review=" + this.f59753f + ", info=" + this.f59754g + ", rawInfo=" + this.f59755h + ", lang=" + this.f59756i + ", metadata=" + this.f59757j + ", questionnaires=" + this.f59758k + ", email=" + this.f59759l + ", phone=" + this.f59760m + ")";
    }

    public C29698t3(String str, String str2, C29160n c29160n, C29140j3 c29140j3, C29332c c29332c, C29166o c29166o, C29136j c29136j, C29148l c29148l, String str3, List list, List list2, String str4, String str5) {
        this.f59748a = str;
        this.f59749b = str2;
        this.f59750c = c29160n;
        this.f59751d = c29140j3;
        this.f59752e = c29332c;
        this.f59753f = c29166o;
        this.f59754g = c29136j;
        this.f59755h = c29148l;
        this.f59756i = str3;
        this.f59757j = list;
        this.f59758k = list2;
        this.f59759l = str4;
        this.f59760m = str5;
    }
}
