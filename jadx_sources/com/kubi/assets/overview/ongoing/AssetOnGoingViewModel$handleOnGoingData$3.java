package com.kubi.assets.overview.ongoing;

import com.kubi.assets.entity.OnGoingEntity;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/OnGoingEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$handleOnGoingData$3", m90122f = "AssetOnGoingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetOnGoingViewModel$handleOnGoingData$3 extends SuspendLambda implements Function2<OnGoingEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSubscribe;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetOnGoingViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(OnGoingEntity onGoingEntity, Continuation<? super Unit> continuation) {
        return ((AssetOnGoingViewModel$handleOnGoingData$3) create(onGoingEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOnGoingViewModel$handleOnGoingData$3(AssetOnGoingViewModel assetOnGoingViewModel, boolean z11, Continuation<? super AssetOnGoingViewModel$handleOnGoingData$3> continuation) {
        super(2, continuation);
        this.this$0 = assetOnGoingViewModel;
        this.$isSubscribe = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetOnGoingViewModel$handleOnGoingData$3 assetOnGoingViewModel$handleOnGoingData$3 = new AssetOnGoingViewModel$handleOnGoingData$3(this.this$0, this.$isSubscribe, continuation);
        assetOnGoingViewModel$handleOnGoingData$3.L$0 = obj;
        return assetOnGoingViewModel$handleOnGoingData$3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        OnGoingEntity onGoingEntity = (OnGoingEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.f18415a0 = onGoingEntity;
        this.this$0.m18738S(onGoingEntity, this.$isSubscribe);
        return Unit.INSTANCE;
    }
}
