package com.sumsub.sns.internal.features.presentation.preview.photo.identity;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.presentation.utils.C32662m;
import java.util.Collection;
import java.util.List;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.identity.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31813q extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64642a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31816t f64643b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31813q(C31816t c31816t, Continuation continuation) {
        super(2, continuation);
        this.f64643b = c31816t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31813q(this.f64643b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31813q(this.f64643b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objMo70878a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64642a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31801e c31801e = this.f64643b.f64651n;
            this.f64642a = 1;
            InterfaceC31802f interfaceC31802f = null;
            if (!c31801e.m70885j() && !c31801e.m71251d() && C28468k0.f57983a.getPreferredDocumentsDefinitions() == null) {
                IdentitySide identitySide = IdentitySide.Front;
                C28936t c28936t = c31801e.f66620l.f66657c;
                KProperty kProperty = C32662m.f66654e[0];
                c28936t.f58834a.set(c28936t.f58835b, identitySide);
                List mutableList = CollectionsKt.toMutableList((Collection) c31801e.m71250c());
                mutableList.clear();
                c31801e.m71244a(mutableList);
                objMo70878a = c31801e.mo70878a((C29054T) null, this);
                if (objMo70878a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objMo70878a = Unit.INSTANCE;
                }
            } else {
                Object obj2 = c31801e.f66621m;
                if (obj2 instanceof InterfaceC31802f) {
                    interfaceC31802f = (InterfaceC31802f) obj2;
                }
                if (interfaceC31802f != null) {
                    AbstractC28052C.finish$default((C31816t) interfaceC31802f, null, null, null, null, 15, null);
                }
                objMo70878a = Unit.INSTANCE;
            }
            if (objMo70878a == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
