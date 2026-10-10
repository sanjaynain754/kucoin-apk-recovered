package com.kubi.assets.futures.coins;

import com.kubi.assets.entity.AssetFuturesEntity;
import com.kubi.kumex.entity.BalanceEntity;
import io.chad.library.adapter.base.entity.SectionEntity;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$5 */
/* JADX INFO: compiled from: AssetFuturesCoinsContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/kubi/assets/entity/AssetFuturesEntity;", "", "Lio/chad/library/adapter/base/entity/SectionEntity;", "Lcom/kubi/kumex/entity/BalanceEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$dispatchIntentOnIO$5", m90122f = "AssetFuturesCoinsContract.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C10072xd7fd01be extends SuspendLambda implements Function2<Pair<? extends AssetFuturesEntity, ? extends List<SectionEntity<BalanceEntity>>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetFuturesCoinsContract$AssetFuturesCoinsViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends AssetFuturesEntity, ? extends List<SectionEntity<BalanceEntity>>> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<AssetFuturesEntity, ? extends List<SectionEntity<BalanceEntity>>>) pair, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10072xd7fd01be(AssetFuturesCoinsContract$AssetFuturesCoinsViewModel assetFuturesCoinsContract$AssetFuturesCoinsViewModel, Continuation<? super C10072xd7fd01be> continuation) {
        super(2, continuation);
        this.this$0 = assetFuturesCoinsContract$AssetFuturesCoinsViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C10072xd7fd01be c10072xd7fd01be = new C10072xd7fd01be(this.this$0, continuation);
        c10072xd7fd01be.L$0 = obj;
        return c10072xd7fd01be;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<AssetFuturesEntity, ? extends List<SectionEntity<BalanceEntity>>> pair, Continuation<? super Unit> continuation) {
        return ((C10072xd7fd01be) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Pair pair = (Pair) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateState(new Function1() { // from class: com.kubi.assets.futures.coins.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C10072xd7fd01be.m16961f(pair, (UIState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m16961f(Pair pair, UIState uIState) {
        return UIState.copy$default(uIState, (List) pair.getSecond(), (AssetFuturesEntity) pair.getFirst(), false, null, null, null, 60, null);
    }
}
