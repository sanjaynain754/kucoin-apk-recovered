package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.utils.C32641a;
import com.sumsub.sns.internal.features.presentation.utils.C32649e;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.G0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31182G0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63043a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31251c2 f63044b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC29172p f63045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31182G0(C31251c2 c31251c2, AbstractC29172p abstractC29172p, Continuation continuation) {
        super(2, continuation);
        this.f63044b = c31251c2;
        this.f63045c = abstractC29172p;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31182G0(this.f63044b, this.f63045c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31182G0(this.f63044b, this.f63045c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        boolean z12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63043a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC29984m interfaceC29984m = this.f63044b.f63276j;
            this.f63043a = 1;
            obj = ((C29967J) interfaceC29984m).m70045b(true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ((AbstractC29971N) obj).getClass();
        AbstractC29172p abstractC29172p = this.f63045c;
        if (abstractC29172p != null) {
            C32641a c32641a = C32649e.f66642b;
            if (!C32641a.m71261a(abstractC29172p)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        AbstractC29172p abstractC29172p2 = this.f63045c;
        if (abstractC29172p2 != null && abstractC29172p2.m69797d()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && !z11) {
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Data updated: moving to next document", null);
            C31251c2 c31251c2 = this.f63044b;
            KProperty[] kPropertyArr = AbstractC31275i2.f63367c;
            c31251c2.mo70630d(false);
        } else {
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Data updated: moving to status screen. hasViOnly=" + z12 + ", isAgreementSigned=" + z11, null);
            C31251c2 c31251c3 = this.f63044b;
            KProperty[] kPropertyArr2 = AbstractC31275i2.f63367c;
            c31251c3.mo70626a(false, true);
        }
        return Unit.INSTANCE;
    }
}
