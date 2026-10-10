package com.sumsub.sns.internal.features.presentation.common;

import com.sumsub.sns.internal.features.domain.documents.AbstractC30146q;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C30804C extends FunctionReferenceImpl implements Function2, SuspendFunction {
    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractC30808G) this.receiver).mo70458a((AbstractC30146q) obj, (Continuation) obj2);
    }

    public C30804C(Object obj) {
        super(2, obj, AbstractC30808G.class, "onDocumentsUploadCompleted", "onDocumentsUploadCompleted(Lcom/sumsub/sns/internal/features/domain/documents/DocumentUploadResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
