package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.presentation.prooface.session.C32197b;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32200c;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32201c0;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32240s;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32242t;
import com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32251x0;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.R1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32034R1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65140a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65141b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32072c2 f65142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32034R1(C32072c2 c32072c2, Continuation continuation) {
        super(2, continuation);
        this.f65142c = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32034R1 c32034r1 = new C32034R1(this.f65142c, continuation);
        c32034r1.f65141b = obj;
        return c32034r1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32034R1 c32034r1 = new C32034R1(this.f65142c, (Continuation) obj2);
        c32034r1.f65141b = (InterfaceC32251x0) obj;
        return c32034r1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c32061a1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65140a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC32251x0 interfaceC32251x0 = (InterfaceC32251x0) this.f65141b;
            KProperty[] kPropertyArr = C32072c2.f65257x;
            if (interfaceC32251x0 instanceof C32200c) {
                c32061a1 = new C32061a1(((C32200c) interfaceC32251x0).f65576a);
            } else if (!Intrinsics.areEqual(interfaceC32251x0, C32197b.f65570a) && !(interfaceC32251x0 instanceof C32242t)) {
                if (!Intrinsics.areEqual(interfaceC32251x0, C32201c0.f65577a) && !(interfaceC32251x0 instanceof C32240s)) {
                    throw new NoWhenBranchMatchedException();
                }
                c32061a1 = C32057Z0.f65220a;
            } else {
                c32061a1 = C32066b1.f65240a;
            }
            AbstractC32267d.m71078a("ViewModel: required camera state: " + c32061a1);
            InterfaceC41669n interfaceC41669n = this.f65142c.f65276s;
            this.f65140a = 1;
            if (interfaceC41669n.emit(c32061a1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
