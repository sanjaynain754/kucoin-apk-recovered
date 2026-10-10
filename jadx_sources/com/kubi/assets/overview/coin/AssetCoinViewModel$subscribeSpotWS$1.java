package com.kubi.assets.overview.coin;

import com.kubi.assets.entity.SpotWSEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.utils.extensions.DowngradeExKt;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetCoinViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.coin.AssetCoinViewModel$subscribeSpotWS$1", m90122f = "AssetCoinViewModel.kt", m90123i = {0, 0}, m90124l = {198}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$i$a$-runCatching-AssetCoinViewModel$subscribeSpotWS$1$1"}, m90127s = {"L$0", "I$0"})
public final class AssetCoinViewModel$subscribeSpotWS$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $spotSymbols;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetCoinViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.assets.overview.coin.AssetCoinViewModel$subscribeSpotWS$1$a */
    /* JADX INFO: compiled from: AssetCoinViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAssetCoinViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinViewModel.kt\ncom/kubi/assets/overview/coin/AssetCoinViewModel$subscribeSpotWS$1$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,237:1\n1#2:238\n*E\n"})
    public static final class C10633a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41709m0 f18267b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AssetCoinViewModel f18268c;

        public C10633a(InterfaceC41709m0 interfaceC41709m0, AssetCoinViewModel assetCoinViewModel) {
            this.f18267b = interfaceC41709m0;
            this.f18268c = assetCoinViewModel;
        }

        /* JADX INFO: renamed from: f */
        public static final UIState m18503f(WsMarketSnapshotEntity wsMarketSnapshotEntity, UIState updateState) {
            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
            return UIState.copy$default(updateState, null, wsMarketSnapshotEntity, false, null, null, 29, null);
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(SpotWSEntity spotWSEntity, Continuation<? super Unit> continuation) {
            if (!C41713n0.m91132h(this.f18267b)) {
                return Unit.INSTANCE;
            }
            final WsMarketSnapshotEntity data = spotWSEntity.getData();
            if (data != null) {
                this.f18268c.updateState(new Function1() { // from class: com.kubi.assets.overview.coin.r
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetCoinViewModel$subscribeSpotWS$1.C10633a.m18503f(data, (UIState) obj);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetCoinViewModel$subscribeSpotWS$1(AssetCoinViewModel assetCoinViewModel, String str, Continuation<? super AssetCoinViewModel$subscribeSpotWS$1> continuation) {
        super(2, continuation);
        this.this$0 = assetCoinViewModel;
        this.$spotSymbols = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetCoinViewModel$subscribeSpotWS$1 assetCoinViewModel$subscribeSpotWS$1 = new AssetCoinViewModel$subscribeSpotWS$1(this.this$0, this.$spotSymbols, continuation);
        assetCoinViewModel$subscribeSpotWS$1.L$0 = obj;
        return assetCoinViewModel$subscribeSpotWS$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetCoinViewModel$subscribeSpotWS$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                AssetCoinViewModel assetCoinViewModel = this.this$0;
                String str = this.$spotSymbols;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(assetCoinViewModel.m18492I().m20183c(DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{str}, null, 2, null)), new AssetCoinViewModel$subscribeSpotWS$1$1$1(null));
                C10633a c10633a = new C10633a(interfaceC41709m0, assetCoinViewModel);
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC41634eM90917h.collect(c10633a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }
}
