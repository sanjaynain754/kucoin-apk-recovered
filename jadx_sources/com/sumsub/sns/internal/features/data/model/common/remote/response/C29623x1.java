package com.sumsub.sns.internal.features.data.model.common.remote.response;

import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.x1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29623x1 {

    @NotNull
    public static final C29619w1 Companion = new C29619w1();

    /* JADX INFO: renamed from: l */
    public static final Lazy[] f59672l = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.j3
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ReviewStatusType.Companion.serializer();
        }
    }), null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final Integer f59673a;

    /* JADX INFO: renamed from: b */
    public final ReviewStatusType f59674b;

    /* JADX INFO: renamed from: c */
    public final Integer f59675c;

    /* JADX INFO: renamed from: d */
    public final String f59676d;

    /* JADX INFO: renamed from: e */
    public final C29487K1 f59677e;

    /* JADX INFO: renamed from: f */
    public final String f59678f;

    /* JADX INFO: renamed from: g */
    public final Boolean f59679g;

    /* JADX INFO: renamed from: h */
    public final String f59680h;

    /* JADX INFO: renamed from: i */
    public final Boolean f59681i;

    /* JADX INFO: renamed from: j */
    public final Long f59682j;

    /* JADX INFO: renamed from: k */
    public final Long f59683k;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29623x1)) {
            return false;
        }
        C29623x1 c29623x1 = (C29623x1) obj;
        return Intrinsics.areEqual(this.f59673a, c29623x1.f59673a) && this.f59674b == c29623x1.f59674b && Intrinsics.areEqual(this.f59675c, c29623x1.f59675c) && Intrinsics.areEqual(this.f59676d, c29623x1.f59676d) && Intrinsics.areEqual(this.f59677e, c29623x1.f59677e) && Intrinsics.areEqual(this.f59678f, c29623x1.f59678f) && Intrinsics.areEqual(this.f59679g, c29623x1.f59679g) && Intrinsics.areEqual(this.f59680h, c29623x1.f59680h) && Intrinsics.areEqual(this.f59681i, c29623x1.f59681i) && Intrinsics.areEqual(this.f59682j, c29623x1.f59682j) && Intrinsics.areEqual(this.f59683k, c29623x1.f59683k);
    }

    public final int hashCode() {
        Integer num = this.f59673a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ReviewStatusType reviewStatusType = this.f59674b;
        int iHashCode2 = (iHashCode + (reviewStatusType == null ? 0 : reviewStatusType.hashCode())) * 31;
        Integer num2 = this.f59675c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f59676d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C29487K1 c29487k1 = this.f59677e;
        int iHashCode5 = (iHashCode4 + (c29487k1 == null ? 0 : c29487k1.hashCode())) * 31;
        String str2 = this.f59678f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f59679g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f59680h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.f59681i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l11 = this.f59682j;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f59683k;
        return iHashCode10 + (l12 != null ? l12.hashCode() : 0);
    }

    public final String toString() {
        return "InspectionReview(notificationFailureCnt=" + this.f59673a + ", reviewStatus=" + this.f59674b + ", priority=" + this.f59675c + ", createDate=" + this.f59676d + ", result=" + this.f59677e + ", reviewId=" + this.f59678f + ", reprocessing=" + this.f59679g + ", levelName=" + this.f59680h + ", autoChecked=" + this.f59681i + ", elapsedSinceQueuedMs=" + this.f59682j + ", elapsedSincePendingMs=" + this.f59683k + ")";
    }

    public /* synthetic */ C29623x1(int i11, Integer num, ReviewStatusType reviewStatusType, Integer num2, String str, C29487K1 c29487k1, String str2, Boolean bool, String str3, Boolean bool2, Long l11, Long l12) {
        if ((i11 & 1) == 0) {
            this.f59673a = null;
        } else {
            this.f59673a = num;
        }
        if ((i11 & 2) == 0) {
            this.f59674b = null;
        } else {
            this.f59674b = reviewStatusType;
        }
        if ((i11 & 4) == 0) {
            this.f59675c = null;
        } else {
            this.f59675c = num2;
        }
        if ((i11 & 8) == 0) {
            this.f59676d = null;
        } else {
            this.f59676d = str;
        }
        if ((i11 & 16) == 0) {
            this.f59677e = null;
        } else {
            this.f59677e = c29487k1;
        }
        if ((i11 & 32) == 0) {
            this.f59678f = null;
        } else {
            this.f59678f = str2;
        }
        if ((i11 & 64) == 0) {
            this.f59679g = null;
        } else {
            this.f59679g = bool;
        }
        if ((i11 & 128) == 0) {
            this.f59680h = null;
        } else {
            this.f59680h = str3;
        }
        if ((i11 & 256) == 0) {
            this.f59681i = null;
        } else {
            this.f59681i = bool2;
        }
        if ((i11 & 512) == 0) {
            this.f59682j = null;
        } else {
            this.f59682j = l11;
        }
        if ((i11 & 1024) == 0) {
            this.f59683k = null;
        } else {
            this.f59683k = l12;
        }
    }
}
