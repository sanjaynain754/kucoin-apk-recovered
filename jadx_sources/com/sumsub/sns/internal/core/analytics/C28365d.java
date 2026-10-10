package com.sumsub.sns.internal.core.analytics;

import com.sumsub.sns.core.data.model.SNSTrackEvents;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28365d extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SNSTrackEvents f57830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f57831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28365d(SNSTrackEvents sNSTrackEvents, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f57830a = sNSTrackEvents;
        this.f57831b = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28365d(this.f57830a, this.f57831b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28365d(this.f57830a, this.f57831b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41775x1 interfaceC41775x1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            Function1 function1 = C28366e.f57838g;
            if (function1 != null) {
                function1.invoke(this.f57830a);
            }
        } catch (Throwable unused) {
        }
        List list = C28366e.f57833b;
        list.add(this.f57830a);
        if (list.size() >= 50 || this.f57831b) {
            C41696j.m91104d(C28366e.f57835d, C28366e.f57836e, null, new C28362a(null), 2, null);
        } else {
            InterfaceC41775x1 interfaceC41775x2 = C28366e.f57837f;
            if (interfaceC41775x2 != null && interfaceC41775x2.isActive() && (interfaceC41775x1 = C28366e.f57837f) != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            C28366e.f57837f = C41696j.m91104d(C28366e.f57835d, null, null, new C28364c(null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
