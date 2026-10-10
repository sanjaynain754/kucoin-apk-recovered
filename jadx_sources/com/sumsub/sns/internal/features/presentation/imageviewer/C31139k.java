package com.sumsub.sns.internal.features.presentation.imageviewer;

import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.imageviewer.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31139k extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62967a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Throwable f62968b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31139k(Throwable th2, Continuation continuation) {
        super(2, continuation);
        this.f62968b = th2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31139k c31139k = new C31139k(this.f62968b, continuation);
        c31139k.f62967a = obj;
        return c31139k;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31139k c31139k = new C31139k(this.f62968b, (Continuation) obj2);
        c31139k.f62967a = (InterfaceC41709m0) obj;
        return c31139k.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f62967a;
        C33272c c33272c = C33272c.f67812a;
        C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68956e(AbstractC33294e.m71624a(interfaceC41709m0), "Can't decode file", this.f62968b);
        return Unit.INSTANCE;
    }
}
