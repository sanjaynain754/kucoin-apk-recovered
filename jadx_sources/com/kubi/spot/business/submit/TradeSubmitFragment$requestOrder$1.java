package com.kubi.spot.business.submit;

import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.entity.OtcAd;
import com.kubi.spot.business.businessTrack.SpotBusinessTracker;
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
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: TradeSubmitFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.submit.TradeSubmitFragment$requestOrder$1", m90122f = "TradeSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nTradeSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSubmitFragment.kt\ncom/kubi/spot/business/submit/TradeSubmitFragment$requestOrder$1\n+ 2 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n*L\n1#1,867:1\n8#2,2:868\n*S KotlinDebug\n*F\n+ 1 TradeSubmitFragment.kt\ncom/kubi/spot/business/submit/TradeSubmitFragment$requestOrder$1\n*L\n564#1:868,2\n*E\n"})
public final class TradeSubmitFragment$requestOrder$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;

    public TradeSubmitFragment$requestOrder$1(Continuation<? super TradeSubmitFragment$requestOrder$1> continuation) {
        super(1, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TradeSubmitFragment$requestOrder$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((TradeSubmitFragment$requestOrder$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException, ApiException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (C27058k0.f54342a.m66755e()) {
                return Unit.INSTANCE;
            }
            C44128b.m97266j("trade|Spot|TradeSubmitFragment", "Enter background before password check");
            SpotBusinessTracker.f49771a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.APP_IS_BACKGROUND, SpotBusinessTracker.SpotFailReason.APP_IS_BACKGROUND);
            throw new ApiException(OtcAd.KYC_NOT_PASS, "app_is_background", new Object());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
