package com.sumsub.sns.internal.features.domain;

import com.sumsub.sentry.android.C27921i;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.util.root.C33411b;
import com.sumsub.sns.internal.util.root.C33413d;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.InterruptibleKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30076J extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f60431a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30078L f60432b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30076J(C30078L c30078l, Continuation continuation) {
        super(2, continuation);
        this.f60432b = c30078l;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m70101a(C30078L c30078l) {
        C29957e c29957e = (C29957e) c30078l.f60438c;
        boolean zM71698b = ((C33411b) c29957e.f60160f.f68113a.getValue()).m71698b();
        C27921i c27921i = (C27921i) c29957e.f60161g.f57039f.getValue();
        boolean z11 = c27921i.f57040a || c27921i.f57041b || c27921i.f57042c || c27921i.f57043d || c29957e.f60159e.m68994a();
        C33413d c33413d = (C33413d) c29957e.f60162h.f68123a.getValue();
        return zM71698b || z11 || (c33413d.f68124a || c33413d.f68125b);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30076J(this.f60432b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30076J(this.f60432b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60431a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final C30078L c30078l = this.f60432b;
        AbstractC41697j0 abstractC41697j0 = c30078l.f60441f;
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.domain.x0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C30076J.m70101a(c30078l));
            }
        };
        this.f60431a = 1;
        Object objM90355b = InterruptibleKt.m90355b(abstractC41697j0, function0, this);
        if (objM90355b == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM90355b;
    }
}
