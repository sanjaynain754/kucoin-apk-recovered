package com.kubi.assets.futures.coins;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$3 */
/* JADX INFO: compiled from: AssetFuturesCoinsContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialList$3", m90122f = "AssetFuturesCoinsContract.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C10080x81c8fa7b extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetFuturesCoinsContract$AssetFuturesCoinsViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return ((C10080x81c8fa7b) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10080x81c8fa7b(AssetFuturesCoinsContract$AssetFuturesCoinsViewModel assetFuturesCoinsContract$AssetFuturesCoinsViewModel, Continuation<? super C10080x81c8fa7b> continuation) {
        super(2, continuation);
        this.this$0 = assetFuturesCoinsContract$AssetFuturesCoinsViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m16967f(Boolean bool, UIState uIState) {
        return UIState.copy$default(uIState, null, null, false, null, bool, null, 47, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C10080x81c8fa7b c10080x81c8fa7b = new C10080x81c8fa7b(this.this$0, continuation);
        c10080x81c8fa7b.L$0 = obj;
        return c10080x81c8fa7b;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final Boolean bool = (Boolean) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateState(new Function1() { // from class: com.kubi.assets.futures.coins.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C10080x81c8fa7b.m16967f(bool, (UIState) obj2);
            }
        });
        return Unit.INSTANCE;
    }
}
