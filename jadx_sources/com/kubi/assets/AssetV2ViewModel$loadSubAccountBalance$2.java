package com.kubi.assets;

import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.utils.extensions.C27025c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: AssetV2ViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.AssetV2ViewModel$loadSubAccountBalance$2", m90122f = "AssetV2ViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetV2ViewModel$loadSubAccountBalance$2 extends SuspendLambda implements Function2<AssetV2OverviewEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetV2OverviewEntity $entity;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetV2ViewModel this$0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final UIState m15232f(AssetV2OverviewEntity assetV2OverviewEntity, UIState uIState) {
        return UIState.copy$default(uIState, assetV2OverviewEntity, null, 2, null);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(AssetV2OverviewEntity assetV2OverviewEntity, Continuation<? super Unit> continuation) {
        return ((AssetV2ViewModel$loadSubAccountBalance$2) create(assetV2OverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2ViewModel$loadSubAccountBalance$2(AssetV2ViewModel assetV2ViewModel, AssetV2OverviewEntity assetV2OverviewEntity, Continuation<? super AssetV2ViewModel$loadSubAccountBalance$2> continuation) {
        super(2, continuation);
        this.this$0 = assetV2ViewModel;
        this.$entity = assetV2OverviewEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetV2ViewModel$loadSubAccountBalance$2 assetV2ViewModel$loadSubAccountBalance$2 = new AssetV2ViewModel$loadSubAccountBalance$2(this.this$0, this.$entity, continuation);
        assetV2ViewModel$loadSubAccountBalance$2.L$0 = obj;
        return assetV2ViewModel$loadSubAccountBalance$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final AssetV2OverviewEntity assetV2OverviewEntity = (AssetV2OverviewEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97259c("asset", "loadSubAccountBalance success");
        this.this$0.updateState(new Function1() { // from class: com.kubi.assets.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AssetV2ViewModel$loadSubAccountBalance$2.m15232f(assetV2OverviewEntity, (UIState) obj2);
            }
        });
        AssetV2EventTracker.m17549l(AssetV2EventTracker.f17857a, C27025c.m66566d(this.$entity.getSubOverLimit()), null, 2, null);
        this.this$0.m15223K();
        this.this$0.m15221I();
        return Unit.INSTANCE;
    }
}
