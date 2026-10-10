package com.sumsub.sns.internal.features.presentation.camera.photo;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30675j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f61987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30736v0 f61988b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30675j(C30736v0 c30736v0, Continuation continuation) {
        super(2, continuation);
        this.f61988b = c30736v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30675j c30675j = new C30675j(this.f61988b, continuation);
        c30675j.f61987a = obj;
        return c30675j;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30675j c30675j = new C30675j(this.f61988b, (Continuation) obj2);
        c30675j.f61987a = (C30400E) obj;
        return c30675j.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C30400E c30400e = (C30400E) this.f61987a;
        if (c30400e == null) {
            return Unit.INSTANCE;
        }
        InterfaceC30399D interfaceC30399D = c30400e.f61160a;
        if (interfaceC30399D instanceof C30687p) {
            str = ((C30687p) interfaceC30399D).f62012b.f59176a;
        } else if (interfaceC30399D instanceof C30733u) {
            str = ((C30733u) interfaceC30399D).f62083b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        SNSEvent.DocumentTypeSelected documentTypeSelected = new SNSEvent.DocumentTypeSelected(interfaceC30399D.mo70271a(), str);
        Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this.f61988b), "Document option selected: " + interfaceC30399D, null, 4, null);
        SNSEventHandler eventHandler = C28468k0.f57983a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(documentTypeSelected);
        }
        return Unit.INSTANCE;
    }
}
