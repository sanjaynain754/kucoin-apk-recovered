package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.T2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29284T2 extends C29226H3 {

    @NotNull
    public static final C29279S2 Companion = new C29279S2();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59297d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.p5
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ServerMessage$Type.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: c */
    public final C29424n3 f59298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29284T2(int i11, SNSMessage$ServerMessage$Type sNSMessage$ServerMessage$Type, C29424n3 c29424n3) {
        super(i11, sNSMessage$ServerMessage$Type);
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29274R2.f59263a.getDescriptor());
        }
        if ((i11 & 2) == 0) {
            this.f59298c = null;
        } else {
            this.f59298c = c29424n3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29284T2) && Intrinsics.areEqual(this.f59298c, ((C29284T2) obj).f59298c);
    }

    public C29284T2(C29424n3 c29424n3) {
        super(SNSMessage$ServerMessage$Type.MAKE_SCREENSHOT);
        this.f59298c = c29424n3;
    }

    public final int hashCode() {
        C29424n3 c29424n3 = this.f59298c;
        if (c29424n3 == null) {
            return 0;
        }
        return c29424n3.hashCode();
    }

    public final String toString() {
        return "MakeScreenshot(payload=" + this.f59298c + ")";
    }
}
