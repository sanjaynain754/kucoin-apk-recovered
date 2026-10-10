package com.sumsub.sns.internal.features.presentation.intro;

import com.sumsub.sns.internal.core.presentation.intro.C28890b;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.Map;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.intro.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31160m extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C31161n f63000a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31160m(C31161n c31161n, Continuation continuation) {
        super(2, continuation);
        this.f63000a = c31161n;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31160m(this.f63000a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31160m(this.f63000a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C31161n c31161n = this.f63000a;
        C28895g c28895g = new C28895g(c31161n.f63001a, c31161n.f63003c, c31161n.f63002b, c31161n.f63004d);
        C29983l strings = c31161n.getStrings();
        C29124h config = this.f63000a.getConfig();
        if (config != null) {
            map = config.f59071d;
        } else {
            map = null;
        }
        Map map2 = map;
        C31161n c31161n2 = this.f63000a;
        return new C31159l(c28895g, new C28890b(strings, map2, c31161n2.f63001a, c31161n2.f63002b, c31161n2.f63003c, false).f58739e);
    }
}
