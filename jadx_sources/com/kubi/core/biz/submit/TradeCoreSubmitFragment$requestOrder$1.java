package com.kubi.core.biz.submit;

import com.kubi.core.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.entity.OtcAd;
import com.kubi.utils.C27058k0;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import ve.C45518a;

/* JADX INFO: compiled from: TradeCoreSubmitFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.TradeCoreSubmitFragment$requestOrder$1", m90122f = "TradeCoreSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeCoreSubmitFragment$requestOrder$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;

    public TradeCoreSubmitFragment$requestOrder$1(Continuation<? super TradeCoreSubmitFragment$requestOrder$1> continuation) {
        super(1, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TradeCoreSubmitFragment$requestOrder$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((TradeCoreSubmitFragment$requestOrder$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException, ApiException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (C27058k0.f54342a.m66755e()) {
                return Unit.INSTANCE;
            }
            C45518a.m100507a("Enter backend before password check", "TradeSubmitFragment");
            SpotBusinessTracker.f21010a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.APP_IS_BACKGROUND, SpotBusinessTracker.SpotFailReason.APP_IS_BACKGROUND);
            throw new ApiException(OtcAd.KYC_NOT_PASS, "app_is_background", new Object());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
