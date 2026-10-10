package com.kubi.assets.unify;

import com.kubi.assets.entity.UnifiedAccountOverview;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetUnifiedViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/UnifiedAccountOverview;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1", m90122f = "AssetUnifiedViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1 extends SuspendLambda implements Function2<UnifiedAccountOverview, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetUnifiedViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(UnifiedAccountOverview unifiedAccountOverview, Continuation<? super Unit> continuation) {
        return ((AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1) create(unifiedAccountOverview, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1(AssetUnifiedViewModel assetUnifiedViewModel, Continuation<? super AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = assetUnifiedViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m19708f(UnifiedAccountOverview unifiedAccountOverview, UIState uIState) {
        return UIState.copy$default(uIState, unifiedAccountOverview, null, false, false, false, null, null, null, null, null, null, 2046, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1 assetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1 = new AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1(this.this$0, continuation);
        assetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1.L$0 = obj;
        return assetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final UnifiedAccountOverview unifiedAccountOverview = (UnifiedAccountOverview) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.updateState(new Function1() { // from class: com.kubi.assets.unify.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AssetUnifiedViewModel$fetchUnifiedOverviewInfo$1$1$1.m19708f(unifiedAccountOverview, (UIState) obj2);
            }
        });
        return Unit.INSTANCE;
    }
}
