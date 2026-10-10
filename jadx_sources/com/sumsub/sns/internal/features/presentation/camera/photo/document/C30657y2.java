package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.os.Parcelable;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.core.common.AbstractC28476n;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.C29131i0;
import com.sumsub.sns.internal.features.domain.documents.C30127V;
import com.sumsub.sns.internal.features.domain.documents.C30143n;
import com.sumsub.sns.internal.features.domain.documents.DocumentSideness;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.features.presentation.utils.C32662m;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.y2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30657y2 extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Throwable f61952a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f61953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30440B2 f61954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30657y2(C30440B2 c30440b2, Continuation continuation) {
        super(3, continuation);
        this.f61954c = c30440b2;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C30657y2 c30657y2 = new C30657y2(this.f61954c, (Continuation) obj3);
        c30657y2.f61952a = (Throwable) obj;
        c30657y2.f61953b = (String) obj2;
        return c30657y2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Throwable th2 = this.f61952a;
        String str = this.f61953b;
        C30440B2 c30440b2 = this.f61954c;
        KProperty[] kPropertyArr = C30440B2.f61279U;
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "camera upload failed", th2);
        c30440b2.f61296Q = false;
        InterfaceC41669n interfaceC41669n = c30440b2.f61287H;
        interfaceC41669n.setValue(C30538d1.m70407a((C30538d1) interfaceC41669n.getValue(), null, null, null, null, null, null, 55));
        AbstractC28073M0.updateState$default(c30440b2, false, new C30508W1(null), 1, null);
        C32635M c32635m = c30440b2.f61310k;
        if (c32635m != null && (AbstractC28476n.m69376a(th2, (Parcelable) null) instanceof C29131i0)) {
            C28936t c28936t = c32635m.f66620l.f66658d;
            KProperty kProperty = C32662m.f66654e[1];
            AbstractC28052C.finish$default(c30440b2, null, new C30127V(c32635m.m71250c(), new C30143n((DocumentSideness) c28936t.m69705a())), null, null, 13, null);
        } else {
            AbstractC28052C.throwError$default(c30440b2, th2, str, null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
