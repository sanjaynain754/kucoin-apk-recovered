package com.sumsub.sns.internal.features.presentation.videoident.twilio;

import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import tvi.webrtc.Camera2Enumerator;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.twilio.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C33045e extends FunctionReferenceImpl implements Function1 {
    public C33045e(Camera2Enumerator camera2Enumerator) {
        super(1, camera2Enumerator, Camera2Enumerator.class, "isFrontFacing", "isFrontFacing(Ljava/lang/String;)Z", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((Camera2Enumerator) this.receiver).isFrontFacing((String) obj));
    }
}
