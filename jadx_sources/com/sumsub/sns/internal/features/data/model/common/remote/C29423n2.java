package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.n2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29423n2 extends C29226H3 {

    @NotNull
    public static final C29391j2 Companion = new C29391j2();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59419d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.f6
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ServerMessage$Type.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: c */
    public final C29415m2 f59420c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29423n2(int i11, SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type, C29415m2 c29415m2) {
        super(i11, sNSMessage$ServerMessage$Type);
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29383i2.f59393a.getDescriptor());
        }
        if ((i11 & 2) == 0) {
            this.f59420c = null;
        } else {
            this.f59420c = c29415m2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29423n2) && Intrinsics.areEqual(this.f59420c, ((C29423n2) obj).f59420c);
    }

    public C29423n2(C29415m2 c29415m2) {
        super(SNSMessage$ServerMessage$Type.APPLICANT_IMAGE_REVIEWED);
        this.f59420c = c29415m2;
    }

    public final int hashCode() {
        C29415m2 c29415m2 = this.f59420c;
        if (c29415m2 == null) {
            return 0;
        }
        return c29415m2.hashCode();
    }

    public final String toString() {
        return "ApplicantImageReviewed(payload=" + this.f59420c + ")";
    }
}
