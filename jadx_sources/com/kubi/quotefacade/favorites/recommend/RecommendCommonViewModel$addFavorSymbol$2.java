package com.kubi.quotefacade.favorites.recommend;

import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RecommendCommonViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.recommend.RecommendCommonViewModel$addFavorSymbol$2", m90122f = "RecommendCommonViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RecommendCommonViewModel$addFavorSymbol$2 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $favType;
    final /* synthetic */ String $targetStr;
    int label;
    final /* synthetic */ RecommendCommonViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendCommonViewModel$addFavorSymbol$2(String str, RecommendCommonViewModel recommendCommonViewModel, Integer num, Continuation<? super RecommendCommonViewModel$addFavorSymbol$2> continuation) {
        super(2, continuation);
        this.$targetStr = str;
        this.this$0 = recommendCommonViewModel;
        this.$favType = num;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecommendCommonViewModel$addFavorSymbol$2(this.$targetStr, this.this$0, this.$favType, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((RecommendCommonViewModel$addFavorSymbol$2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            IKuMexService.m33250m(BQuoteFacadeDepend.f42592a.m53023c(), this.$targetStr, true, false, null, 8, null);
            this.this$0.m51718X(this.$favType);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
