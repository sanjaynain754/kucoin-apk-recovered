package com.sumsub.sns.internal.features.domain.mrtd;

import android.nfc.tech.IsoDep;
import com.sumsub.sns.internal.features.data.model.common.C28998E2;
import com.sumsub.sns.nfc.api.SNSKinegramNfcDocumentReader;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.InterfaceC41577p;
import kotlinx.coroutines.channels.ProduceKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30260q extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f60840a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60841b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30261r f60842c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ IsoDep f60843d;

    /* JADX INFO: renamed from: a */
    public static final Unit m70166a(InterfaceC41574m interfaceC41574m, SNSKinegramNfcDocumentReader.State state) {
        interfaceC41574m.mo90594e(state);
        if (state instanceof SNSKinegramNfcDocumentReader.Result) {
            InterfaceC41577p.a.m90714a(interfaceC41574m, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30260q(C30261r c30261r, IsoDep isoDep, Continuation continuation) {
        super(2, continuation);
        this.f60842c = c30261r;
        this.f60843d = isoDep;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30260q c30260q = new C30260q(this.f60842c, this.f60843d, continuation);
        c30260q.f60841b = obj;
        return c30260q;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30260q) create((InterfaceC41574m) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60840a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.f60841b;
            SNSKinegramNfcDocumentReader sNSKinegramNfcDocumentReader = (SNSKinegramNfcDocumentReader) this.f60842c.f60845d.getValue();
            IsoDep isoDep = this.f60843d;
            C28998E2 c28998e2 = this.f60842c.f60844c;
            SNSKinegramNfcDocumentReader.DefaultImpls.start$default(sNSKinegramNfcDocumentReader, isoDep, c28998e2.f58937o, c28998e2.f58938p, c28998e2.f58939q, c28998e2.f58936n, (String) null, new Function1() { // from class: com.sumsub.sns.internal.features.domain.mrtd.f0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C30260q.m70166a(interfaceC41574m, (SNSKinegramNfcDocumentReader.State) obj2);
                }
            }, 32, (Object) null);
            Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.domain.mrtd.g0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C30260q.m70165a();
                }
            };
            this.f60840a = 1;
            if (ProduceKt.m90681a(interfaceC41574m, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70165a() {
        return Unit.INSTANCE;
    }
}
