package com.sumsub.sns.internal.features.data.model.common.remote.response;

import com.sumsub.sns.internal.features.data.model.common.ReviewAnswerType;
import com.sumsub.sns.internal.features.data.model.common.ReviewRejectType;
import java.util.List;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.response.K1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29487K1 {

    @NotNull
    public static final C29484J1 Companion = new C29484J1();

    /* JADX INFO: renamed from: f */
    public static final Lazy[] f59494f;

    /* JADX INFO: renamed from: a */
    public final String f59495a;

    /* JADX INFO: renamed from: b */
    public final String f59496b;

    /* JADX INFO: renamed from: c */
    public final ReviewAnswerType f59497c;

    /* JADX INFO: renamed from: d */
    public final List f59498d;

    /* JADX INFO: renamed from: e */
    public final ReviewRejectType f59499e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29487K1)) {
            return false;
        }
        C29487K1 c29487k1 = (C29487K1) obj;
        return Intrinsics.areEqual(this.f59495a, c29487k1.f59495a) && Intrinsics.areEqual(this.f59496b, c29487k1.f59496b) && this.f59497c == c29487k1.f59497c && Intrinsics.areEqual(this.f59498d, c29487k1.f59498d) && this.f59499e == c29487k1.f59499e;
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f59494f = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.k2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReviewAnswerType.Companion.serializer();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.l2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C29487K1.m69870b();
            }
        }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.response.m2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReviewRejectType.Companion.serializer();
            }
        })};
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC44951d m69870b() {
        return new C41813f(C41897w2.f92051a);
    }

    public final int hashCode() {
        String str = this.f59495a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59496b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReviewAnswerType reviewAnswerType = this.f59497c;
        int iHashCode3 = (iHashCode2 + (reviewAnswerType == null ? 0 : reviewAnswerType.hashCode())) * 31;
        List list = this.f59498d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ReviewRejectType reviewRejectType = this.f59499e;
        return iHashCode4 + (reviewRejectType != null ? reviewRejectType.hashCode() : 0);
    }

    public final String toString() {
        return "ReviewResult(moderationComment=" + this.f59495a + ", clientComment=" + this.f59496b + ", reviewAnswer=" + this.f59497c + ", rejectLabels=" + this.f59498d + ", reviewRejectType=" + this.f59499e + ")";
    }

    public /* synthetic */ C29487K1(int i11, String str, String str2, ReviewAnswerType reviewAnswerType, List list, ReviewRejectType reviewRejectType) {
        if ((i11 & 1) == 0) {
            this.f59495a = null;
        } else {
            this.f59495a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59496b = null;
        } else {
            this.f59496b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f59497c = null;
        } else {
            this.f59497c = reviewAnswerType;
        }
        if ((i11 & 8) == 0) {
            this.f59498d = null;
        } else {
            this.f59498d = list;
        }
        if ((i11 & 16) == 0) {
            this.f59499e = null;
        } else {
            this.f59499e = reviewRejectType;
        }
    }
}
