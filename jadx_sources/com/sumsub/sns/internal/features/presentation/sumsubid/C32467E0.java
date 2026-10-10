package com.sumsub.sns.internal.features.presentation.sumsubid;

import androidx.lifecycle.ViewModelKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.E0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32467E0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f66199a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f66200b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32487O0 f66201c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f66202d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C32487O0 f66203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32467E0(C32487O0 c32487o0, Continuation continuation, String str, C32487O0 c32487o1) {
        super(2, continuation);
        this.f66201c = c32487o0;
        this.f66202d = str;
        this.f66203e = c32487o1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32467E0 c32467e0 = new C32467E0(this.f66201c, continuation, this.f66202d, this.f66203e);
        c32467e0.f66200b = obj;
        return c32467e0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32467E0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f66199a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC32493S.m71164a("onEmailConfirmed, email=" + this.f66202d);
                C32487O0 c32487o0 = this.f66203e;
                String str = this.f66202d;
                this.f66199a = 1;
                obj = C32487O0.m71151a(c32487o0, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                C32487O0 c32487o1 = this.f66203e;
                String str2 = this.f66202d;
                KProperty[] kPropertyArr = C32487O0.f66261v;
                c32487o1.showProgress(true);
                C41696j.m91104d(ViewModelKt.getViewModelScope(c32487o1), C41782z0.m91392b(), null, new C32477J0(c32487o1, null, str2, c32487o1), 2, null);
            }
            this.f66201c.showProgress(false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f66201c.showProgress(false);
            throw th2;
        }
    }
}
