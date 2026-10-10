package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31315k;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31318n;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.x1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31364x1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63558a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31243a2 f63559b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f63560c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31364x1(C31243a2 c31243a2, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f63559b = c31243a2;
        this.f63560c = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31364x1(this.f63559b, this.f63560c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31364x1(this.f63559b, this.f63560c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (r9 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (r9.m70696b(r1, r8) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63558a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            C28936t c28936t = this.f63559b.f63240w.f63509s;
            KProperty kProperty = C31332p0.f63490u[0];
            String str = "Move to next document..., reload documents = " + ((Boolean) c28936t.m69705a()).booleanValue();
            C33270a c33270a = C33272c.f67816e;
            c33270a.f67810a.mo68955d("SNSAppViewModel2", str, null);
            if (C33048a.f67467b0.m71434a()) {
                C31318n c31318n = this.f63559b.f63230m;
                this.f63558a = 1;
                c31318n.getClass();
                c33270a.f67810a.mo68955d("ServerNavigationRouter", "navigateNext", null);
                Object objM70677a = c31318n.m70677a(false, new C31315k(c31318n, null), this);
                if (objM70677a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM70677a = Unit.INSTANCE;
                }
            } else {
                C31332p0 c31332p0 = this.f63559b.f63240w;
                boolean z11 = this.f63560c;
                this.f63558a = 2;
            }
        }
        return Unit.INSTANCE;
    }
}
