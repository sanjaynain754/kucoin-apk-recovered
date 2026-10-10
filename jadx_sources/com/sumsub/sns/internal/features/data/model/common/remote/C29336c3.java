package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.c3 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29336c3 extends C29226H3 {

    @NotNull
    public static final C29328b3 Companion = new C29328b3();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59352d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.x5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ServerMessage$Type.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: c */
    public final C29424n3 f59353c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29336c3(int i11, SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type, C29424n3 c29424n3) {
        super(i11, sNSMessage$ServerMessage$Type);
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29320a3.f59333a.getDescriptor());
        }
        if ((i11 & 2) == 0) {
            this.f59353c = null;
        } else {
            this.f59353c = c29424n3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29336c3) && Intrinsics.areEqual(this.f59353c, ((C29336c3) obj).f59353c);
    }

    public C29336c3(C29424n3 c29424n3) {
        super(SNSMessage$ServerMessage$Type.READY_FOR_SCREENSHOT);
        this.f59353c = c29424n3;
    }

    public final int hashCode() {
        C29424n3 c29424n3 = this.f59353c;
        if (c29424n3 == null) {
            return 0;
        }
        return c29424n3.hashCode();
    }

    public final String toString() {
        return "ReadyForScreenshot(payload=" + this.f59353c + ")";
    }
}
