package com.sumsub.sns.internal.core.presentation.android.location;

import android.location.LocationManager;
import androidx.core.content.ContextCompat;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28681q extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58319a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28682r f58320b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28681q(C28682r c28682r, Continuation continuation) {
        super(2, continuation);
        this.f58320b = c28682r;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28681q c28681q = new C28681q(this.f58320b, continuation);
        c28681q.f58319a = obj;
        return c28681q;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28681q c28681q = new C28681q(this.f58320b, (Continuation) obj2);
        c28681q.f58319a = (C28671g) obj;
        return c28681q.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C28671g c28671g = (C28671g) this.f58319a;
        if (c28671g != null) {
            C28682r.m69491a(this.f58320b, c28671g.f58299a);
        } else {
            C28682r c28682r = this.f58320b;
            int i11 = C28682r.f58322t;
            LocationManager locationManager = (LocationManager) ContextCompat.getSystemService(c28682r.f58549a.requireContext(), LocationManager.class);
            if (locationManager != null) {
                locationManager.removeUpdates(c28682r.f58325g);
                locationManager.removeUpdates(c28682r.f58326h);
            }
        }
        return Unit.INSTANCE;
    }
}
