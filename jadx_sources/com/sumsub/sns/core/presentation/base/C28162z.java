package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.InterfaceC41565d;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28162z extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57409a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f57410b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC28052C f57411c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC28145r f57412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28162z(boolean z11, AbstractC28052C abstractC28052C, InterfaceC28145r interfaceC28145r, Continuation continuation) {
        super(2, continuation);
        this.f57410b = z11;
        this.f57411c = abstractC28052C;
        this.f57412d = interfaceC28145r;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28162z(this.f57410b, this.f57411c, this.f57412d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28162z) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57409a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.f57410b) {
                C33272c.f67816e.f67810a.mo68958v(AbstractC33294e.m71624a(this.f57411c), "fireEvent: " + this.f57412d, null);
            }
            InterfaceC41565d interfaceC41565d = this.f57411c.eventsInternal;
            InterfaceC28145r interfaceC28145r = this.f57412d;
            this.f57409a = 1;
            if (interfaceC41565d.send(interfaceC28145r, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
