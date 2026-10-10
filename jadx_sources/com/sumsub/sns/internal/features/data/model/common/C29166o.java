package com.sumsub.sns.internal.features.data.model.common;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29166o {

    /* JADX INFO: renamed from: a */
    public final Integer f59164a;

    /* JADX INFO: renamed from: b */
    public final ReviewStatusType f59165b;

    /* JADX INFO: renamed from: c */
    public final Integer f59166c;

    /* JADX INFO: renamed from: d */
    public final String f59167d;

    /* JADX INFO: renamed from: e */
    public final C29164n3 f59168e;

    /* JADX INFO: renamed from: f */
    public final Long f59169f;

    /* JADX INFO: renamed from: g */
    public final Long f59170g;

    /* JADX INFO: renamed from: h */
    public final String f59171h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29166o)) {
            return false;
        }
        C29166o c29166o = (C29166o) obj;
        return Intrinsics.areEqual(this.f59164a, c29166o.f59164a) && this.f59165b == c29166o.f59165b && Intrinsics.areEqual(this.f59166c, c29166o.f59166c) && Intrinsics.areEqual(this.f59167d, c29166o.f59167d) && Intrinsics.areEqual(this.f59168e, c29166o.f59168e) && Intrinsics.areEqual(this.f59169f, c29166o.f59169f) && Intrinsics.areEqual(this.f59170g, c29166o.f59170g) && Intrinsics.areEqual(this.f59171h, c29166o.f59171h);
    }

    public final int hashCode() {
        Integer num = this.f59164a;
        int iHashCode = (this.f59165b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        Integer num2 = this.f59166c;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f59167d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C29164n3 c29164n3 = this.f59168e;
        int iHashCode4 = (iHashCode3 + (c29164n3 == null ? 0 : c29164n3.hashCode())) * 31;
        Long l11 = this.f59169f;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f59170g;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.f59171h;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Review(notificationFailureCnt=" + this.f59164a + ", status=" + this.f59165b + ", priority=" + this.f59166c + ", createDate=" + this.f59167d + ", result=" + this.f59168e + ", elapsedSinceQueuedMs=" + this.f59169f + ", elapsedSincePendingMs=" + this.f59170g + ", levelName=" + this.f59171h + ")";
    }

    public C29166o(Integer num, ReviewStatusType reviewStatusType, Integer num2, String str, C29164n3 c29164n3, Long l11, Long l12, String str2) {
        this.f59164a = num;
        this.f59165b = reviewStatusType;
        this.f59166c = num2;
        this.f59167d = str;
        this.f59168e = c29164n3;
        this.f59169f = l11;
        this.f59170g = l12;
        this.f59171h = str2;
    }
}
