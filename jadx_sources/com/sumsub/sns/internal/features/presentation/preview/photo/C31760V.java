package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.internal.features.domain.documents.AbstractC30146q;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.V */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C31760V extends FunctionReferenceImpl implements Function2, SuspendFunction {
    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AbstractC31770c0 abstractC31770c0 = (AbstractC31770c0) this.receiver;
        KProperty[] kPropertyArr = AbstractC31770c0.f64557l;
        return abstractC31770c0.m70859a((AbstractC30146q) obj, (Continuation) obj2);
    }

    public C31760V(Object obj) {
        super(2, obj, AbstractC31770c0.class, "onDocumentsUploadedSuccess", "onDocumentsUploadedSuccess(Lcom/sumsub/sns/internal/features/domain/documents/DocumentUploadResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
