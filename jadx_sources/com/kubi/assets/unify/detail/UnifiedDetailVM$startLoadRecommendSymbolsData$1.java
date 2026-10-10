package com.kubi.assets.unify.detail;

import com.kubi.data.entity.CoinInfoEntity;
import gf.C37890n;
import io.reactivex.functions.Consumer;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p365jb.InterfaceC40366c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UnifiedDetailVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.detail.UnifiedDetailVM$startLoadRecommendSymbolsData$1", m90122f = "UnifiedDetailVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifiedDetailVM$startLoadRecommendSymbolsData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ Consumer<? super Throwable> $onError;
    final /* synthetic */ UnifiedDetailVM $this_startLoadRecommendSymbolsData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedDetailVM$startLoadRecommendSymbolsData$1(String str, UnifiedDetailVM unifiedDetailVM, Consumer<? super Throwable> consumer, Continuation<? super UnifiedDetailVM$startLoadRecommendSymbolsData$1> continuation) {
        super(2, continuation);
        this.$code = str;
        this.$this_startLoadRecommendSymbolsData = unifiedDetailVM;
        this.$onError = consumer;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifiedDetailVM$startLoadRecommendSymbolsData$1(this.$code, this.$this_startLoadRecommendSymbolsData, this.$onError, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UnifiedDetailVM$startLoadRecommendSymbolsData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C37890n c37890n = C37890n.f85269a;
            String str = this.$code;
            if (str == null) {
                str = "";
            }
            CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(str);
            if (coinInfoEntityM85613u == null) {
                coinInfoEntityM85613u = new CoinInfoEntity();
                String str2 = this.$code;
                coinInfoEntityM85613u.setCode(str2);
                coinInfoEntityM85613u.setCurrency(str2);
            }
            List<InterfaceC40366c> listM19866l = C11172k0.m19866l(this.$this_startLoadRecommendSymbolsData, coinInfoEntityM85613u);
            List<InterfaceC40366c> listM19865k = C11172k0.m19865k(this.$this_startLoadRecommendSymbolsData, coinInfoEntityM85613u);
            C11172k0.m19878x(this.$this_startLoadRecommendSymbolsData, CollectionsKt.plus((Collection) listM19866l, (Iterable) listM19865k));
            C11172k0.m19872r(this.$this_startLoadRecommendSymbolsData, listM19866l, this.$onError);
            C11172k0.m19867m(this.$this_startLoadRecommendSymbolsData, listM19865k, this.$onError);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
