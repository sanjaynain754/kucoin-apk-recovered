package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29977f extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f60225a;

    /* JADX INFO: renamed from: b */
    public int f60226b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29978g f60227c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f60228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29977f(C29978g c29978g, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f60227c = c29978g;
        this.f60228d = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C29977f(this.f60227c, this.f60228d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C29977f(this.f60227c, this.f60228d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function3] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60226b;
        if (i11 != 0) {
            if (i11 == 1) {
                obj2 = this.f60225a;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th2 = th3;
                    String str = this.f60227c.f60232d;
                    C33272c.f67816e.f67810a.mo68956e(str, "DataKeeper " + str + " Updating failed: " + th2.getMessage(), null);
                    this.f60227c.f60235g.setValue(new C29969L(th2, obj2));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Object objM70051c = ((AbstractC29971N) this.f60227c.f60235g.getValue()).m70051c();
            try {
                ?? r11 = this.f60227c.f60231c;
                Object obj3 = this.f60228d;
                this.f60225a = objM70051c;
                this.f60226b = 1;
                Object objInvoke = r11.invoke(obj3, objM70051c, this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = objM70051c;
                obj = objInvoke;
            } catch (Throwable th4) {
                obj2 = objM70051c;
                th2 = th4;
                String str2 = this.f60227c.f60232d;
                C33272c.f67816e.f67810a.mo68956e(str2, "DataKeeper " + str2 + " Updating failed: " + th2.getMessage(), null);
                this.f60227c.f60235g.setValue(new C29969L(th2, obj2));
            }
        }
        this.f60227c.f60235g.setValue(new C29970M(obj));
        String str3 = this.f60227c.f60232d;
        C33272c.f67816e.f67810a.mo68955d(str3, "DataKeeper " + str3 + " Updated", null);
        return Unit.INSTANCE;
    }
}
