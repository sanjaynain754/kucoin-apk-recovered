package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.log.logger.C33296b;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28048A extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Throwable f57191b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28048A(Throwable th2, Continuation continuation) {
        super(2, continuation);
        this.f57191b = th2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28048A c28048a = new C28048A(this.f57191b, continuation);
        c28048a.f57190a = obj;
        return c28048a;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28048A c28048a = new C28048A(this.f57191b, (Continuation) obj2);
        c28048a.f57190a = (InterfaceC41709m0) obj;
        return c28048a.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f57190a;
        C33272c c33272c = C33272c.f67812a;
        C33296b c33296bM71618b = C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA}));
        String strM71624a = AbstractC33294e.m71624a(interfaceC41709m0);
        String message = this.f57191b.getMessage();
        if (message == null) {
            message = "";
        }
        c33296bM71618b.mo68956e(strM71624a, message, this.f57191b);
        return Unit.INSTANCE;
    }
}
