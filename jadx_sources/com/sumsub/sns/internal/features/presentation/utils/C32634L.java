package com.sumsub.sns.internal.features.presentation.utils;

import java.util.List;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32634L extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66601a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66602b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32635M f66603c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function2 f66604d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Function3 f66605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32634L(C32635M c32635m, Function2 function2, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.f66603c = c32635m;
        this.f66604d = function2;
        this.f66605e = function3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32634L c32634l = new C32634L(this.f66603c, this.f66604d, this.f66605e, continuation);
        c32634l.f66602b = obj;
        return c32634l;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32634L) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r1.invoke(r4, r3, r7) == r0) goto L32;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        C32635M c32635m;
        Throwable thM103847exceptionOrNullimpl;
        Function2 function2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66601a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                        Function3 function3 = this.f66605e;
                        c32635m = this.f66603c;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl != null) {
                            String strM71247b = c32635m.m71247b();
                            this.f66602b = objM103844constructorimpl;
                            this.f66601a = 3;
                        }
                    }
                } else {
                    function2 = (Function2) this.f66602b;
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.f66602b;
            C32635M c32635m2 = this.f66603c;
            Function2 function4 = this.f66604d;
            Result.Companion companion = Result.INSTANCE;
            this.f66602b = function4;
            this.f66601a = 1;
            C32668s c32668s = C32635M.f66606w;
            obj = c32635m2.m71233a(list, this);
            if (obj != coroutine_suspended) {
                function2 = function4;
            }
            return coroutine_suspended;
            this.f66602b = null;
            this.f66601a = 2;
            if (function2.invoke(obj, this) != coroutine_suspended) {
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                Function3 function5 = this.f66605e;
                c32635m = this.f66603c;
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    String strM71247b2 = c32635m.m71247b();
                    this.f66602b = objM103844constructorimpl;
                    this.f66601a = 3;
                }
                return Unit.INSTANCE;
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return coroutine_suspended;
    }
}
