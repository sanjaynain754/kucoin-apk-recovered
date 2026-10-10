package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sns.core.data.listener.SNSIconHandler;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.N0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31585N0 extends AbstractC31596T0 {

    /* JADX INFO: renamed from: b */
    public final String f64154b;

    /* JADX INFO: renamed from: c */
    public final String f64155c;

    /* JADX INFO: renamed from: d */
    public final String f64156d;

    /* JADX INFO: renamed from: e */
    public final SNSIconHandler.SNSEidIcons f64157e;

    /* JADX INFO: renamed from: f */
    public final AbstractC31595T f64158f;

    /* JADX INFO: renamed from: g */
    public final C31629j f64159g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31585N0)) {
            return false;
        }
        C31585N0 c31585n0 = (C31585N0) obj;
        return Intrinsics.areEqual(this.f64154b, c31585n0.f64154b) && Intrinsics.areEqual(this.f64155c, c31585n0.f64155c) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f64156d, c31585n0.f64156d) && this.f64157e == c31585n0.f64157e && Intrinsics.areEqual(this.f64158f, c31585n0.f64158f) && Intrinsics.areEqual(this.f64159g, c31585n0.f64159g);
    }

    public final int hashCode() {
        String str = this.f64154b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64155c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.f64156d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SNSIconHandler.SNSEidIcons sNSEidIcons = this.f64157e;
        int iHashCode4 = (iHashCode3 + (sNSEidIcons == null ? 0 : sNSEidIcons.hashCode())) * 31;
        AbstractC31595T abstractC31595T = this.f64158f;
        return this.f64159g.hashCode() + ((iHashCode4 + (abstractC31595T != null ? abstractC31595T.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f64154b;
        String str2 = this.f64155c;
        String str3 = this.f64156d;
        return "Info(title=" + ((Object) str) + ", subtitle=" + ((Object) str2) + ", moreInfo=" + ((Object) null) + ", buttonText=" + ((Object) str3) + ", icon=" + this.f64157e + ", buttonAction=" + this.f64158f + ", analyticsWrapper=" + this.f64159g + ")";
    }

    public C31585N0(String str, String str2, String str3, SNSIconHandler.SNSEidIcons sNSEidIcons, AbstractC31595T abstractC31595T, C31629j c31629j) {
        super(c31629j);
        this.f64154b = str;
        this.f64155c = str2;
        this.f64156d = str3;
        this.f64157e = sNSEidIcons;
        this.f64158f = abstractC31595T;
        this.f64159g = c31629j;
    }
}
