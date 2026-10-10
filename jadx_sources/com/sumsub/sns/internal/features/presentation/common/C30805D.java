package com.sumsub.sns.internal.features.presentation.common;

import p852kotlin.Unit;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.D */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C30805D extends AdaptedFunctionReference implements Function3, SuspendFunction {
    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC30808G abstractC30808G = (AbstractC30808G) this.receiver;
        abstractC30808G.mo70466a((String) obj2, (Throwable) obj);
        return Unit.INSTANCE;
    }

    public C30805D(Object obj) {
        super(3, obj, AbstractC30808G.class, "onDocumentsUploadError", "onDocumentsUploadError(Ljava/lang/Throwable;Ljava/lang/String;)V", 4);
    }
}
