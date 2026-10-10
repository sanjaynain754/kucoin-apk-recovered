package com.sumsub.sns.internal.log.logger;

import com.sumsub.sns.internal.features.data.model.common.LogParams;
import com.sumsub.sns.internal.log.cacher.C33284l;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.logger.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33302h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f67891a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C33303i f67892b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f67893c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f67894d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f67895e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Throwable f67896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33302h(C33303i c33303i, int i11, String str, String str2, Throwable th2, Continuation continuation) {
        super(2, continuation);
        this.f67892b = c33303i;
        this.f67893c = i11;
        this.f67894d = str;
        this.f67895e = str2;
        this.f67896f = th2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C33302h(this.f67892b, this.f67893c, this.f67894d, this.f67895e, this.f67896f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C33302h) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f67891a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C33303i c33303i = this.f67892b;
            C33284l c33284l = c33303i.f67899b;
            LogParams logParamsM71627a = c33303i.m71627a(this.f67893c, this.f67894d, this.f67895e, this.f67896f);
            this.f67891a = 1;
            if (c33284l.send(logParamsM71627a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
