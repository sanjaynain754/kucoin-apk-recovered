package com.sumsub.sns.internal.features.data.model.common.remote;

import kotlinx.serialization.internal.C41801c2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.w1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29663w1 extends C29288U1 {

    @NotNull
    public static final C29656v1 Companion = new C29656v1();

    /* JADX INFO: renamed from: c */
    public static final Lazy[] f59723c = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.internal.features.data.model.common.remote.j6
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSMessage$ClientMessage$Type.Companion.serializer();
        }
    })};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29663w1(int i11, SNSMessage$ClientMessage$Type sNSMessage$ClientMessage$Type) {
        super(i11, sNSMessage$ClientMessage$Type);
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, C29649u1.f59703a.getDescriptor());
        }
    }

    public C29663w1() {
        super(SNSMessage$ClientMessage$Type.COULD_NOT_MAKE_SCREENSHOT);
    }
}
