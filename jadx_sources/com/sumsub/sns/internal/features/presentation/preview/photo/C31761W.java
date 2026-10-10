package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.Unit;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.AdaptedFunctionReference;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.W */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C31761W extends AdaptedFunctionReference implements Function3, SuspendFunction {
    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th2 = (Throwable) obj;
        AbstractC31770c0 abstractC31770c0 = (AbstractC31770c0) this.receiver;
        KProperty[] kPropertyArr = AbstractC31770c0.f64557l;
        abstractC31770c0.getClass();
        C33272c c33272c = C33272c.f67812a;
        C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(abstractC31770c0), "Exception while uploading identity photos", th2);
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "Exception while uploading identity photos", th2);
        abstractC31770c0.showProgress(false);
        AbstractC28052C.throwError$default(abstractC31770c0, th2, (String) obj2, null, 4, null);
        AbstractC28073M0.updateState$default(abstractC31770c0, false, new C31748I(null), 1, null);
        return Unit.INSTANCE;
    }

    public C31761W(Object obj) {
        super(3, obj, AbstractC31770c0.class, "onDocumentsUploadedError", "onDocumentsUploadedError(Ljava/lang/Throwable;Ljava/lang/String;)V", 4);
    }
}
