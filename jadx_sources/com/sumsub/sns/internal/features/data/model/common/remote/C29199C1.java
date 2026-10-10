package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.C1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29199C1 extends C29288U1 {

    @NotNull
    public static final C29677y1 Companion = new C29677y1();

    /* JADX INFO: renamed from: d */
    public static final Lazy[] f59191d = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.l4
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ClientMessage$Type.Companion.serializer();
        }
    }), null};

    /* JADX INFO: renamed from: c */
    public final C29194B1 f59192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29199C1(int i11, SNSMessage$ClientMessage$Type sNSMessage$ClientMessage$Type, C29194B1 c29194b1) {
        super(i11, sNSMessage$ClientMessage$Type);
        if (3 != (i11 & 3)) {
            C41801c2.m91514a(i11, 3, C29670x1.f59725a.getDescriptor());
        }
        this.f59192c = c29194b1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29199C1) && Intrinsics.areEqual(this.f59192c, ((C29199C1) obj).f59192c);
    }

    public C29199C1(C29194B1 c29194b1) {
        super(SNSMessage$ClientMessage$Type.SCREENSHOT_MADE);
        this.f59192c = c29194b1;
    }

    public final int hashCode() {
        return this.f59192c.hashCode();
    }

    public final String toString() {
        return "ScreenshotMade(payload=" + this.f59192c + ")";
    }
}
