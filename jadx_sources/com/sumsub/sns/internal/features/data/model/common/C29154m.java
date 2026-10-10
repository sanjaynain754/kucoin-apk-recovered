package com.sumsub.sns.internal.features.data.model.common;

import com.facebook.react.views.scroll.ReactScrollViewHelper;
import java.util.List;
import java.util.Locale;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29154m {

    /* JADX INFO: renamed from: a */
    public final C29070X f59132a;

    /* JADX INFO: renamed from: b */
    public final List f59133b;

    /* JADX INFO: renamed from: c */
    public final List f59134c;

    /* JADX INFO: renamed from: d */
    public final String f59135d;

    /* JADX INFO: renamed from: e */
    public final List f59136e;

    /* JADX INFO: renamed from: f */
    public final List f59137f;

    /* JADX INFO: renamed from: g */
    public final String f59138g;

    /* JADX INFO: renamed from: h */
    public final String f59139h;

    /* JADX INFO: renamed from: i */
    public final String f59140i;

    /* JADX INFO: renamed from: j */
    public final String f59141j;

    /* JADX INFO: renamed from: k */
    public final Boolean f59142k;

    /* JADX INFO: renamed from: l */
    public final Boolean f59143l;

    /* JADX INFO: renamed from: m */
    public final String f59144m;

    /* JADX INFO: renamed from: n */
    public final String f59145n;

    /* JADX INFO: renamed from: o */
    public final Boolean f59146o;

    /* JADX INFO: renamed from: p */
    public final Boolean f59147p;

    /* JADX INFO: renamed from: q */
    public final C29022K2 f59148q;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29154m)) {
            return false;
        }
        C29154m c29154m = (C29154m) obj;
        return Intrinsics.areEqual(this.f59132a, c29154m.f59132a) && Intrinsics.areEqual(this.f59133b, c29154m.f59133b) && Intrinsics.areEqual(this.f59134c, c29154m.f59134c) && Intrinsics.areEqual(this.f59135d, c29154m.f59135d) && Intrinsics.areEqual(this.f59136e, c29154m.f59136e) && Intrinsics.areEqual(this.f59137f, c29154m.f59137f) && Intrinsics.areEqual(this.f59138g, c29154m.f59138g) && Intrinsics.areEqual(this.f59139h, c29154m.f59139h) && Intrinsics.areEqual(this.f59140i, c29154m.f59140i) && Intrinsics.areEqual(this.f59141j, c29154m.f59141j) && Intrinsics.areEqual(this.f59142k, c29154m.f59142k) && Intrinsics.areEqual(this.f59143l, c29154m.f59143l) && Intrinsics.areEqual(this.f59144m, c29154m.f59144m) && Intrinsics.areEqual(this.f59145n, c29154m.f59145n) && Intrinsics.areEqual(this.f59146o, c29154m.f59146o) && Intrinsics.areEqual(this.f59147p, c29154m.f59147p) && Intrinsics.areEqual(this.f59148q, c29154m.f59148q);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69787a() {
        String str = this.f59140i;
        return !Intrinsics.areEqual(str != null ? str.toLowerCase(Locale.ROOT) : null, "manualonly");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m69788b() {
        String str = this.f59140i;
        return Intrinsics.areEqual(str != null ? str.toLowerCase(Locale.ROOT) : null, "manualandauto");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m69789c() {
        return this.f59132a.m69747d() || this.f59132a.m69746c() || Intrinsics.areEqual(this.f59142k, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m69790d() {
        String str = this.f59140i;
        return Intrinsics.areEqual(str != null ? str.toLowerCase(Locale.ROOT) : null, "seamless") && Intrinsics.areEqual(this.f59135d, VideoRequiredType.DocCapture.getValue());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m69791e() {
        return this.f59132a.m69749f() && Intrinsics.areEqual(this.f59135d, VideoRequiredType.PhotoRequired.getValue());
    }

    /* JADX INFO: renamed from: f */
    public final boolean m69792f() {
        return this.f59132a.m69749f() && Intrinsics.areEqual(this.f59135d, VideoRequiredType.Disabled.getValue());
    }

    /* JADX INFO: renamed from: g */
    public final boolean m69793g() {
        String str = this.f59141j;
        return Intrinsics.areEqual(str != null ? str.toLowerCase(Locale.ROOT) : null, ReactScrollViewHelper.OVER_SCROLL_NEVER);
    }

    public final int hashCode() {
        int iHashCode = (this.f59134c.hashCode() + ((this.f59133b.hashCode() + (this.f59132a.f59014a.hashCode() * 31)) * 31)) * 31;
        String str = this.f59135d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f59136e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f59137f;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.f59138g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59139h;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59140i;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59141j;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f59142k;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f59143l;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.f59144m;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f59145n;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool3 = this.f59146o;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f59147p;
        int iHashCode14 = (iHashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        C29022K2 c29022k2 = this.f59148q;
        return iHashCode14 + (c29022k2 != null ? c29022k2.hashCode() : 0);
    }

    public final String toString() {
        return "DocSetsItem(idDocSetType=" + this.f59132a + ", types=" + this.f59133b + ", sides=" + this.f59134c + ", videoRequired=" + this.f59135d + ", fields=" + this.f59136e + ", customField=" + this.f59137f + ", questionnaireId=" + this.f59138g + ", questionnaireDefId=" + this.f59139h + ", captureMode=" + this.f59140i + ", uploaderMode=" + this.f59141j + ", restrictCountries=" + this.f59142k + ", skipAllowed=" + this.f59143l + ", poaStepSettingsId=" + this.f59144m + ", nfcMode=" + this.f59145n + ", phoneInputImmutable=" + this.f59146o + ", emailInputImmutable=" + this.f59147p + ", paymentSourceSettings=" + this.f59148q + ")";
    }

    public C29154m(C29070X c29070x, List list, List list2, String str, List list3, List list4, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, Boolean bool3, Boolean bool4, C29022K2 c29022k2) {
        this.f59132a = c29070x;
        this.f59133b = list;
        this.f59134c = list2;
        this.f59135d = str;
        this.f59136e = list3;
        this.f59137f = list4;
        this.f59138g = str2;
        this.f59139h = str3;
        this.f59140i = str4;
        this.f59141j = str5;
        this.f59142k = bool;
        this.f59143l = bool2;
        this.f59144m = str6;
        this.f59145n = str7;
        this.f59146o = bool3;
        this.f59147p = bool4;
        this.f59148q = c29022k2;
    }
}
