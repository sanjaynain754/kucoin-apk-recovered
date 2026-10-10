package com.kubi.quotefacade.favorites.edit;

import com.kubi.quotefacade.helper.FavTradeCacheConvert;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: FavEditChildVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.edit.FavEditChildVM$handleUpdateFavoriteList$2", m90122f = "FavEditChildVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FavEditChildVM$handleUpdateFavoriteList$2 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ FavEditChildContract$UiIntent.UpdateFavoriteList $intent;
    final /* synthetic */ List<String> $symbolList;
    int label;
    final /* synthetic */ FavEditChildVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavEditChildVM$handleUpdateFavoriteList$2(FavEditChildVM favEditChildVM, FavEditChildContract$UiIntent.UpdateFavoriteList updateFavoriteList, List<String> list, Continuation<? super FavEditChildVM$handleUpdateFavoriteList$2> continuation) {
        super(2, continuation);
        this.this$0 = favEditChildVM;
        this.$intent = updateFavoriteList;
        this.$symbolList = list;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavEditChildVM$handleUpdateFavoriteList$2(this.this$0, this.$intent, this.$symbolList, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((FavEditChildVM$handleUpdateFavoriteList$2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.sendSingleEvent(new C22015c(this.$intent.getIsDelete()));
            C44128b.m97266j("FavEditChildVM", "编辑自选式，已经是登录状态了，仅仅更新本地缓存就好！");
            FavTradeCacheConvert.f42000a.m51959e(this.$intent.getType(), this.$symbolList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
