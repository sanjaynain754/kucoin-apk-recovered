package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.h2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29375h2 extends C29226H3 {

    @NotNull
    public static final C29343d2 Companion = new C29343d2();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59385d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.a6
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ServerMessage$Type.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: c */
    public final C29367g2 f59386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29375h2(int i11, SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type, C29367g2 c29367g2) {
        super(i11, sNSMessage$ServerMessage$Type);
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29335c2.f59351a.getDescriptor());
        }
        if ((i11 & 2) == 0) {
            this.f59386c = null;
        } else {
            this.f59386c = c29367g2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29375h2) && Intrinsics.areEqual(this.f59386c, ((C29375h2) obj).f59386c);
    }

    public C29375h2(C29367g2 c29367g2) {
        super(SNSMessage$ServerMessage$Type.APPLICANT_ACTION_STATUS_CHANGE);
        this.f59386c = c29367g2;
    }

    public final int hashCode() {
        C29367g2 c29367g2 = this.f59386c;
        if (c29367g2 == null) {
            return 0;
        }
        return c29367g2.hashCode();
    }

    public final String toString() {
        return "ApplicantActionStatusChange(payload=" + this.f59386c + ")";
    }
}
