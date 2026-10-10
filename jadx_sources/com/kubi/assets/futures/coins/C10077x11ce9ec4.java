package com.kubi.assets.futures.coins;

import com.kubi.assets.entity.FuturesTrialAssets;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$4 */
/* JADX INFO: compiled from: AssetFuturesCoinsContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/FuturesTrialAssets;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsContract$AssetFuturesCoinsViewModel$fetchFuturesTrialDetails$4", m90122f = "AssetFuturesCoinsContract.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class C10077x11ce9ec4 extends SuspendLambda implements Function2<FuturesTrialAssets, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetFuturesCoinsContract$AssetFuturesCoinsViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(FuturesTrialAssets futuresTrialAssets, Continuation<? super Unit> continuation) {
        return ((C10077x11ce9ec4) create(futuresTrialAssets, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10077x11ce9ec4(AssetFuturesCoinsContract$AssetFuturesCoinsViewModel assetFuturesCoinsContract$AssetFuturesCoinsViewModel, Continuation<? super C10077x11ce9ec4> continuation) {
        super(2, continuation);
        this.this$0 = assetFuturesCoinsContract$AssetFuturesCoinsViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m16965f(FuturesTrialAssets futuresTrialAssets, UIState uIState) {
        return UIState.copy$default(uIState, null, null, false, futuresTrialAssets, null, null, 55, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C10077x11ce9ec4 c10077x11ce9ec4 = new C10077x11ce9ec4(this.this$0, continuation);
        c10077x11ce9ec4.L$0 = obj;
        return c10077x11ce9ec4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final FuturesTrialAssets futuresTrialAssets = (FuturesTrialAssets) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateState(new Function1() { // from class: com.kubi.assets.futures.coins.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C10077x11ce9ec4.m16965f(futuresTrialAssets, (UIState) obj2);
            }
        });
        return Unit.INSTANCE;
    }
}
