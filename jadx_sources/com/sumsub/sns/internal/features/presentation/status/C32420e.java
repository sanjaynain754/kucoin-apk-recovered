package com.sumsub.sns.internal.features.presentation.status;

import android.os.Bundle;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28121h;
import com.sumsub.sns.core.widget.SNSSumsubIdBanner;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32420e extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bundle f66086a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32435m f66087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32420e(Bundle bundle, C32435m c32435m, Continuation continuation) {
        super(2, continuation);
        this.f66086a = bundle;
        this.f66087b = c32435m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32420e(this.f66086a, this.f66087b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32420e(this.f66086a, this.f66087b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C28121h c28121h = AbstractC28133l.Companion;
        Bundle bundle = this.f66086a;
        c28121h.getClass();
        int i11 = bundle.getInt(AbstractC28133l.FRAGMENT_RESULT_KEY);
        if (i11 != 50) {
            if (i11 == 51) {
                C32403L c32403l = (C32403L) this.f66087b.f66110a.getValue();
                C28936t c28936t = c32403l.f66055n;
                KProperty kProperty = C32403L.f66041o[0];
                c28936t.f58834a.set(c28936t.f58835b, Boolean.FALSE);
                AbstractC28073M0.updateState$default(c32403l, false, new C32395D(false, null), 1, null);
                C32435m c32435m = this.f66087b;
                C28404L c28404l = c32435m.f66118i;
                KProperty[] kPropertyArr = C32435m.f66109p;
                SNSSumsubIdBanner sNSSumsubIdBanner = (SNSSumsubIdBanner) c28404l.getValue(c32435m, kPropertyArr[6]);
                if (sNSSumsubIdBanner != null) {
                    sNSSumsubIdBanner.setOnCheckedChanged(null);
                }
                SNSSumsubIdBanner sNSSumsubIdBanner2 = (SNSSumsubIdBanner) c32435m.f66118i.getValue(c32435m, kPropertyArr[6]);
                if (sNSSumsubIdBanner2 != null) {
                    sNSSumsubIdBanner2.setIsChecked(false);
                }
                c32435m.m71150f();
            }
        } else {
            C32403L c32403l2 = (C32403L) this.f66087b.f66110a.getValue();
            C28936t c28936t2 = c32403l2.f66055n;
            KProperty kProperty2 = C32403L.f66041o[0];
            c28936t2.f58834a.set(c28936t2.f58835b, Boolean.FALSE);
            AbstractC28073M0.updateState$default(c32403l2, false, new C32395D(false, null), 1, null);
            c32403l2.m71123e();
        }
        return Unit.INSTANCE;
    }
}
