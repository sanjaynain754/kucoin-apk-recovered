package com.kubi.quotefacade.rank.config;

import com.kubi.sdk.widget.dialog.SelectEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RankMarketConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.config.RankMarketConfigKt$getCurMarketEntity$3", m90122f = "RankMarketConfig.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RankMarketConfigKt$getCurMarketEntity$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super SelectEntity>, Object> {
    final /* synthetic */ SelectEntity $defaultRes;
    final /* synthetic */ SelectEntity $match;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankMarketConfigKt$getCurMarketEntity$3(SelectEntity selectEntity, SelectEntity selectEntity2, Continuation<? super RankMarketConfigKt$getCurMarketEntity$3> continuation) {
        super(2, continuation);
        this.$match = selectEntity;
        this.$defaultRes = selectEntity2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RankMarketConfigKt$getCurMarketEntity$3(this.$match, this.$defaultRes, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super SelectEntity> continuation) {
        return ((RankMarketConfigKt$getCurMarketEntity$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            RankMarketConfigKt.f42415c = this.$match;
            SelectEntity selectEntity = this.$match;
            if (selectEntity == null) {
                return this.$defaultRes;
            }
            return selectEntity;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
