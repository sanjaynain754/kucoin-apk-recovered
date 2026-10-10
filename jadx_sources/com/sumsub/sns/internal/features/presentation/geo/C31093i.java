package com.sumsub.sns.internal.features.presentation.geo;

import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.presentation.android.C28705t;
import java.util.Map;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.geo.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31093i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Screen f62867a;

    /* JADX INFO: renamed from: b */
    public String f62868b;

    /* JADX INFO: renamed from: c */
    public int f62869c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f62870d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31120v0 f62871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31093i(C31120v0 c31120v0, Continuation continuation) {
        super(2, continuation);
        this.f62871e = c31120v0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31093i c31093i = new C31093i(this.f62871e, continuation);
        c31093i.f62870d = obj;
        return c31093i;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31093i c31093i = new C31093i(this.f62871e, (Continuation) obj2);
        c31093i.f62870d = (Screen) obj;
        return c31093i.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Screen screen;
        C28367f c28367f;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62869c;
        if (i11 != 0) {
            if (i11 == 1) {
                str = this.f62868b;
                screen = this.f62867a;
                c28367f = (C28367f) this.f62870d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            screen = (Screen) this.f62870d;
            C28367f c28367fM70585e = this.f62871e.m70585e();
            String str2 = this.f62871e.f62921g.getType().f59014a;
            C28705t c28705t = this.f62871e.f62923i;
            this.f62870d = c28367fM70585e;
            this.f62867a = screen;
            this.f62868b = str2;
            this.f62869c = 1;
            Object objM69506a = c28705t.m69506a(this);
            if (objM69506a == coroutine_suspended) {
                return coroutine_suspended;
            }
            c28367f = c28367fM70585e;
            obj = objM69506a;
            str = str2;
        }
        C28367f.m69259a(c28367f, screen, str, (Map) obj, 8);
        return Unit.INSTANCE;
    }
}
