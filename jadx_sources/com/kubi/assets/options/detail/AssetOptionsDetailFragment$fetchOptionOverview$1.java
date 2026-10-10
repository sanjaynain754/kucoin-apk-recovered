package com.kubi.assets.options.detail;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.AssetResponse;
import com.kubi.assets.entity.OptionsOverviewEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetOptionsDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.options.detail.AssetOptionsDetailFragment$fetchOptionOverview$1", m90122f = "AssetOptionsDetailFragment.kt", m90123i = {}, m90124l = {143}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetOptionsDetailFragment$fetchOptionOverview$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AssetOptionsDetailFragment this$0;

    /* JADX INFO: renamed from: com.kubi.assets.options.detail.AssetOptionsDetailFragment$fetchOptionOverview$1$1 */
    /* JADX INFO: compiled from: AssetOptionsDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/OptionsOverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.options.detail.AssetOptionsDetailFragment$fetchOptionOverview$1$1", m90122f = "AssetOptionsDetailFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C105281 extends SuspendLambda implements Function2<OptionsOverviewEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AssetOptionsDetailFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(OptionsOverviewEntity optionsOverviewEntity, Continuation<? super Unit> continuation) {
            return ((C105281) create(optionsOverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105281(AssetOptionsDetailFragment assetOptionsDetailFragment, Continuation<? super C105281> continuation) {
            super(2, continuation);
            this.this$0 = assetOptionsDetailFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105281 c105281 = new C105281(this.this$0, continuation);
            c105281.L$0 = obj;
            return c105281;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OptionsOverviewEntity optionsOverviewEntity = (OptionsOverviewEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetOptionsDetailFragment assetOptionsDetailFragment = this.this$0;
            List<AssetResponse> assets = optionsOverviewEntity.getAssets();
            assetOptionsDetailFragment.m18139Y4(assets != null ? (AssetResponse) CollectionsKt.getOrNull(assets, 0) : null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOptionsDetailFragment$fetchOptionOverview$1(AssetOptionsDetailFragment assetOptionsDetailFragment, Continuation<? super AssetOptionsDetailFragment$fetchOptionOverview$1> continuation) {
        super(2, continuation);
        this.this$0 = assetOptionsDetailFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AssetOptionsDetailFragment$fetchOptionOverview$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetOptionsDetailFragment$fetchOptionOverview$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String code;
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
            AssetV2Api assetV2Api = (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
            CoinInfoEntity coinInfoEntityM15914h4 = this.this$0.m15914h4();
            if (coinInfoEntityM15914h4 != null) {
                code = coinInfoEntityM15914h4.getCode();
            } else {
                code = null;
            }
            if (code == null) {
                code = "";
            }
            InterfaceC41634e<OptionsOverviewEntity> interfaceC41634eM17168u1 = assetV2Api.m17168u1(code);
            C105281 c105281 = new C105281(this.this$0, null);
            this.label = 1;
            if (RetrofitFlowExKt.m42824e(interfaceC41634eM17168u1, false, c105281, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
