package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30671h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30877b f61981a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30671h(C30877b c30877b, Continuation continuation) {
        super(2, continuation);
        this.f61981a = c30877b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30671h(this.f61981a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30671h(this.f61981a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SNSEventHandler eventHandler = C28468k0.f57983a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(new SNSEvent.CountrySelected(this.f61981a.f62373a, false));
        }
        return Unit.INSTANCE;
    }
}
