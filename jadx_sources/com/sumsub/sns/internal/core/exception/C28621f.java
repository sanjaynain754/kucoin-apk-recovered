package com.sumsub.sns.internal.core.exception;

import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.exception.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28621f extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58238a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC28620e f58239b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Thread f58240c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Throwable f58241d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f58242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28621f(InterfaceC28620e interfaceC28620e, Thread thread, Throwable th2, String str, Continuation continuation) {
        super(2, continuation);
        this.f58239b = interfaceC28620e;
        this.f58240c = thread;
        this.f58241d = th2;
        this.f58242e = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28621f(this.f58239b, this.f58240c, this.f58241d, this.f58242e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28621f) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58238a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC28620e interfaceC28620e = this.f58239b;
                Thread thread = this.f58240c;
                Throwable th2 = this.f58241d;
                String str = this.f58242e;
                this.f58238a = 1;
                if (interfaceC28620e.mo69475a(thread, th2, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (Exception e11) {
            C33272c.f67814c.mo68956e("SNSUncaughtExceptionHandler", "Reporter failed", e11);
        }
        return Unit.INSTANCE;
    }
}
