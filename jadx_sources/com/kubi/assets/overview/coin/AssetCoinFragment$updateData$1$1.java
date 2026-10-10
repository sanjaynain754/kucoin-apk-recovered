package com.kubi.assets.overview.coin;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetCoinFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.coin.AssetCoinFragment$updateData$1$1", m90122f = "AssetCoinFragment.kt", m90123i = {}, m90124l = {145}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetCoinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinFragment.kt\ncom/kubi/assets/overview/coin/AssetCoinFragment$updateData$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,279:1\n1869#2,2:280\n*S KotlinDebug\n*F\n+ 1 AssetCoinFragment.kt\ncom/kubi/assets/overview/coin/AssetCoinFragment$updateData$1$1\n*L\n148#1:280,2\n*E\n"})
public final class AssetCoinFragment$updateData$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AssetCoinFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetCoinFragment$updateData$1$1(AssetCoinFragment assetCoinFragment, Continuation<? super AssetCoinFragment$updateData$1$1> continuation) {
        super(1, continuation);
        this.this$0 = assetCoinFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AssetCoinFragment$updateData$1$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((AssetCoinFragment$updateData$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.this$0.f18259a0 = true;
            AbstractC41697j0 abstractC41697j0M94119a = C42911a.m94119a();
            AssetCoinFragment$updateData$1$1$updatedPositions$1 assetCoinFragment$updateData$1$1$updatedPositions$1 = new AssetCoinFragment$updateData$1$1$updatedPositions$1(this.this$0, null);
            this.label = 1;
            obj = C41686h.m91049g(abstractC41697j0M94119a, assetCoinFragment$updateData$1$1$updatedPositions$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AssetCoinFragment assetCoinFragment = this.this$0;
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            assetCoinFragment.f18254V.notifyItemChanged(((Number) it.next()).intValue());
        }
        this.this$0.f18259a0 = false;
        return Unit.INSTANCE;
    }
}
