package com.kubi.assets.futures.coins;

import com.kubi.assets.entity.AssetFuturesEntity;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.mvi.event.SingleEvent;
import io.chad.library.adapter.base.entity.SectionEntity;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$4 */
/* JADX INFO: compiled from: AssetFuturesCoinsContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001* \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00030\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/kubi/assets/entity/AssetFuturesEntity;", "", "Lio/chad/library/adapter/base/entity/SectionEntity;", "Lcom/kubi/kumex/entity/BalanceEntity;", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$4", m90122f = "AssetFuturesCoinsContract.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C10071xd7fd01bd extends SuspendLambda implements Function3<InterfaceC41635f<? super Pair<? extends AssetFuturesEntity, ? extends List<SectionEntity<BalanceEntity>>>>, Throwable, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AssetFuturesCoinsContract$AssetFuturesCoinsViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41635f<? super Pair<? extends AssetFuturesEntity, ? extends List<SectionEntity<BalanceEntity>>>> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC41635f<? super Pair<AssetFuturesEntity, ? extends List<SectionEntity<BalanceEntity>>>>) interfaceC41635f, th2, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10071xd7fd01bd(AssetFuturesCoinsContract$AssetFuturesCoinsViewModel assetFuturesCoinsContract$AssetFuturesCoinsViewModel, Continuation<? super C10071xd7fd01bd> continuation) {
        super(3, continuation);
        this.this$0 = assetFuturesCoinsContract$AssetFuturesCoinsViewModel;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41635f<? super Pair<AssetFuturesEntity, ? extends List<SectionEntity<BalanceEntity>>>> interfaceC41635f, Throwable th2, Continuation<? super Unit> continuation) {
        return new C10071xd7fd01bd(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.sendSingleEvent(SingleEvent.C19247c.f35626b);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
