package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.t2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29643t2 extends C29226H3 {

    @NotNull
    public static final C29437p2 Companion = new C29437p2();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59698d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.h6
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ServerMessage$Type.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: c */
    public final C29636s2 f59699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29643t2(int i11, SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type, C29636s2 c29636s2) {
        super(i11, sNSMessage$ServerMessage$Type);
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29430o2.f59432a.getDescriptor());
        }
        if ((i11 & 2) == 0) {
            this.f59699c = null;
        } else {
            this.f59699c = c29636s2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29643t2) && Intrinsics.areEqual(this.f59699c, ((C29643t2) obj).f59699c);
    }

    public C29643t2(C29636s2 c29636s2) {
        super(SNSMessage$ServerMessage$Type.APPLICANT_LEVEL_CHANGE);
        this.f59699c = c29636s2;
    }

    public final int hashCode() {
        C29636s2 c29636s2 = this.f59699c;
        if (c29636s2 == null) {
            return 0;
        }
        return c29636s2.hashCode();
    }

    public final String toString() {
        return "ApplicantLevelChange(payload=" + this.f59699c + ")";
    }
}
