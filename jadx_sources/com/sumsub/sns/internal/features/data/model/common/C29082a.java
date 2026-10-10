package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sns.internal.features.data.model.common.remote.C29332c;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29082a extends AbstractC29172p {

    /* JADX INFO: renamed from: a */
    public final String f59020a;

    /* JADX INFO: renamed from: b */
    public final String f59021b;

    /* JADX INFO: renamed from: c */
    public final C29160n f59022c;

    /* JADX INFO: renamed from: d */
    public final C29140j3 f59023d;

    /* JADX INFO: renamed from: e */
    public final C29332c f59024e;

    /* JADX INFO: renamed from: f */
    public final C29166o f59025f;

    /* JADX INFO: renamed from: g */
    public final C29136j f59026g;

    /* JADX INFO: renamed from: h */
    public final C29148l f59027h;

    /* JADX INFO: renamed from: i */
    public final String f59028i;

    /* JADX INFO: renamed from: j */
    public final List f59029j;

    /* JADX INFO: renamed from: k */
    public final List f59030k;

    /* JADX INFO: renamed from: l */
    public final String f59031l;

    /* JADX INFO: renamed from: m */
    public final String f59032m;

    /* JADX INFO: renamed from: n */
    public final String f59033n;

    /* JADX INFO: renamed from: o */
    public final String f59034o;

    /* JADX INFO: renamed from: a */
    public static C29082a m69751a(C29082a c29082a, C29332c c29332c, C29166o c29166o, int i11) {
        return new C29082a(c29082a.f59020a, c29082a.f59021b, c29082a.f59022c, c29082a.f59023d, (i11 & 16) != 0 ? c29082a.f59024e : c29332c, (i11 & 32) != 0 ? c29082a.f59025f : c29166o, c29082a.f59026g, c29082a.f59027h, c29082a.f59028i, c29082a.f59029j, c29082a.f59030k, c29082a.f59031l, c29082a.f59032m, c29082a.f59033n, c29082a.f59034o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29082a)) {
            return false;
        }
        C29082a c29082a = (C29082a) obj;
        return Intrinsics.areEqual(this.f59020a, c29082a.f59020a) && Intrinsics.areEqual(this.f59021b, c29082a.f59021b) && Intrinsics.areEqual(this.f59022c, c29082a.f59022c) && Intrinsics.areEqual(this.f59023d, c29082a.f59023d) && Intrinsics.areEqual(this.f59024e, c29082a.f59024e) && Intrinsics.areEqual(this.f59025f, c29082a.f59025f) && Intrinsics.areEqual(this.f59026g, c29082a.f59026g) && Intrinsics.areEqual(this.f59027h, c29082a.f59027h) && Intrinsics.areEqual(this.f59028i, c29082a.f59028i) && Intrinsics.areEqual(this.f59029j, c29082a.f59029j) && Intrinsics.areEqual(this.f59030k, c29082a.f59030k) && Intrinsics.areEqual(this.f59031l, c29082a.f59031l) && Intrinsics.areEqual(this.f59032m, c29082a.f59032m) && Intrinsics.areEqual(this.f59033n, c29082a.f59033n) && Intrinsics.areEqual(this.f59034o, c29082a.f59034o);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: a */
    public final C29332c mo69752a() {
        return this.f59024e;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: c */
    public final String mo69753c() {
        return this.f59031l;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: e */
    public final String mo69754e() {
        return this.f59020a;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: f */
    public final C29136j mo69755f() {
        return this.f59026g;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: g */
    public final String mo69756g() {
        return this.f59028i;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: h */
    public final String mo69757h() {
        return this.f59032m;
    }

    public final int hashCode() {
        int iHashCode = this.f59020a.hashCode() * 31;
        String str = this.f59021b;
        int iHashCode2 = (this.f59023d.hashCode() + ((this.f59022c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        C29332c c29332c = this.f59024e;
        int iHashCode3 = (this.f59025f.hashCode() + ((iHashCode2 + (c29332c == null ? 0 : c29332c.hashCode())) * 31)) * 31;
        C29136j c29136j = this.f59026g;
        int iHashCode4 = (iHashCode3 + (c29136j == null ? 0 : c29136j.hashCode())) * 31;
        C29148l c29148l = this.f59027h;
        int iHashCode5 = (iHashCode4 + (c29148l == null ? 0 : c29148l.hashCode())) * 31;
        String str2 = this.f59028i;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f59029j;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f59030k;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.f59031l;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59032m;
        int iM68983a = AbstractC27897U.m68983a(this.f59033n, (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        String str5 = this.f59034o;
        return iM68983a + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: i */
    public final List mo69758i() {
        return this.f59030k;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: j */
    public final C29148l mo69759j() {
        return this.f59027h;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: k */
    public final C29160n mo69760k() {
        return this.f59022c;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: l */
    public final C29140j3 mo69761l() {
        return this.f59023d;
    }

    @Override // com.sumsub.sns.internal.features.data.model.common.AbstractC29172p
    /* JADX INFO: renamed from: m */
    public final C29166o mo69762m() {
        return this.f59025f;
    }

    public final String toString() {
        return "ActionApplicant(id=" + this.f59020a + ", externalUserId=" + this.f59021b + ", requiredIdDocs=" + this.f59022c + ", requiredIdDocsStatus=" + this.f59023d + ", agreement=" + this.f59024e + ", review=" + this.f59025f + ", info=" + this.f59026g + ", rawInfo=" + this.f59027h + ", lang=" + this.f59028i + ", metadata=" + this.f59029j + ", questionnaires=" + this.f59030k + ", email=" + this.f59031l + ", phone=" + this.f59032m + ", actionId=" + this.f59033n + ", externalActionId=" + this.f59034o + ")";
    }

    public C29082a(String str, String str2, C29160n c29160n, C29140j3 c29140j3, C29332c c29332c, C29166o c29166o, C29136j c29136j, C29148l c29148l, String str3, List list, List list2, String str4, String str5, String str6, String str7) {
        this.f59020a = str;
        this.f59021b = str2;
        this.f59022c = c29160n;
        this.f59023d = c29140j3;
        this.f59024e = c29332c;
        this.f59025f = c29166o;
        this.f59026g = c29136j;
        this.f59027h = c29148l;
        this.f59028i = str3;
        this.f59029j = list;
        this.f59030k = list2;
        this.f59031l = str4;
        this.f59032m = str5;
        this.f59033n = str6;
        this.f59034o = str7;
    }
}
