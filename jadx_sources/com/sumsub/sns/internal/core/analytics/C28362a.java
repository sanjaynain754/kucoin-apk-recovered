package com.sumsub.sns.internal.core.analytics;

import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.log.cacher.AbstractC33277e;
import com.sumsub.sns.internal.log.cacher.C33276d;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C41696j;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28362a extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57826a;

    public C28362a(Continuation continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28362a(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28362a((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57826a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            List list = C28366e.f57833b;
            if (!list.isEmpty()) {
                List mutableList = CollectionsKt.toMutableList((Collection) list);
                list.clear();
                C29903a c29903a = C28366e.f57832a;
                if (c29903a != null) {
                    this.f57826a = 1;
                    obj = c29903a.f60023a.send(mutableList, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            C41696j.m91104d(AbstractC33277e.f67821a, null, null, new C33276d(null), 3, null);
            return Unit.INSTANCE;
        }
        C41696j.m91104d(AbstractC33277e.f67821a, null, null, new C33276d(null), 3, null);
        return Unit.INSTANCE;
    }
}
