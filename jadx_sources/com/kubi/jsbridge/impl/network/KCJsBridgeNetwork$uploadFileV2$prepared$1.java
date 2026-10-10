package com.kubi.jsbridge.impl.network;

import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJsBridgeNetwork.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* synthetic */ class KCJsBridgeNetwork$uploadFileV2$prepared$1 extends FunctionReferenceImpl implements Function1<Object, String> {
    public KCJsBridgeNetwork$uploadFileV2$prepared$1(Object obj) {
        super(1, obj, KCJsBridgeNetwork.class, "encodeUploadV2FormValue", "encodeUploadV2FormValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final String invoke(Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((KCJsBridgeNetwork) this.receiver).m31761J(p11);
    }
}
