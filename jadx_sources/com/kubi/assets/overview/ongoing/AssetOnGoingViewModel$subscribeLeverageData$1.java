package com.kubi.assets.overview.ongoing;

import com.kubi.assets.entity.Isolated;
import com.kubi.assets.entity.IsolatedPositionDetail;
import com.kubi.assets.entity.OnGoingEntity;
import com.kubi.assets.entity.WsMarkPriceSnapshotEntity;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.extensions.DowngradeExKt;
import java.util.List;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$subscribeLeverageData$1", m90122f = "AssetOnGoingViewModel.kt", m90123i = {0, 0}, m90124l = {382}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$i$a$-runCatching-AssetOnGoingViewModel$subscribeLeverageData$1$1"}, m90127s = {"L$0", "I$0"})
public final class AssetOnGoingViewModel$subscribeLeverageData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbols;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetOnGoingViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingViewModel$subscribeLeverageData$1$a */
    /* JADX INFO: compiled from: AssetOnGoingViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAssetOnGoingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOnGoingViewModel.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$subscribeLeverageData$1$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n2756#2:433\n1#3:434\n1#3:435\n*S KotlinDebug\n*F\n+ 1 AssetOnGoingViewModel.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingViewModel$subscribeLeverageData$1$1$2\n*L\n386#1:433\n386#1:434\n*E\n"})
    public static final class C10755a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41709m0 f18418b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AssetOnGoingViewModel f18419c;

        public C10755a(InterfaceC41709m0 interfaceC41709m0, AssetOnGoingViewModel assetOnGoingViewModel) {
            this.f18418b = interfaceC41709m0;
            this.f18419c = assetOnGoingViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(WsMarkPriceSnapshotEntity wsMarkPriceSnapshotEntity, Continuation<? super Unit> continuation) throws JSONException {
            Isolated isolated;
            IsolatedPositionDetail isolatedPositionDetail;
            List<MarginPosition> positions;
            CurrencyBalance quoteAsset;
            String currency;
            CurrencyBalance baseAsset;
            String currency2;
            if (!C41713n0.m91132h(this.f18418b)) {
                return Unit.INSTANCE;
            }
            OnGoingEntity onGoingEntity = this.f18419c.f18415a0;
            OnGoingEntity onGoingEntityCopy$default = onGoingEntity != null ? OnGoingEntity.copy$default(onGoingEntity, null, null, null, null, null, null, 63, null) : null;
            if (onGoingEntityCopy$default != null && (isolated = onGoingEntityCopy$default.getIsolated()) != null && (isolatedPositionDetail = isolated.getIsolatedPositionDetail()) != null && (positions = isolatedPositionDetail.getPositions()) != null) {
                for (MarginPosition marginPosition : positions) {
                    CurrencyBalance baseAsset2 = marginPosition.getBaseAsset();
                    if (Intrinsics.areEqual((baseAsset2 == null || (currency2 = baseAsset2.getCurrency()) == null) ? null : AssetOnGoingViewModelHelper.f18540a.m18887b(currency2), wsMarkPriceSnapshotEntity.getSymbol()) && (baseAsset = marginPosition.getBaseAsset()) != null) {
                        baseAsset.setMarkPrice(DowngradeExKt.m66536f(wsMarkPriceSnapshotEntity.getValue()));
                    }
                    CurrencyBalance quoteAsset2 = marginPosition.getQuoteAsset();
                    if (Intrinsics.areEqual((quoteAsset2 == null || (currency = quoteAsset2.getCurrency()) == null) ? null : AssetOnGoingViewModelHelper.f18540a.m18887b(currency), wsMarkPriceSnapshotEntity.getSymbol()) && (quoteAsset = marginPosition.getQuoteAsset()) != null) {
                        quoteAsset.setMarkPrice(DowngradeExKt.m66536f(wsMarkPriceSnapshotEntity.getValue()));
                    }
                }
            }
            if (onGoingEntityCopy$default != null) {
                this.f18419c.m18738S(onGoingEntityCopy$default, false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOnGoingViewModel$subscribeLeverageData$1(AssetOnGoingViewModel assetOnGoingViewModel, String str, Continuation<? super AssetOnGoingViewModel$subscribeLeverageData$1> continuation) {
        super(2, continuation);
        this.this$0 = assetOnGoingViewModel;
        this.$symbols = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetOnGoingViewModel$subscribeLeverageData$1 assetOnGoingViewModel$subscribeLeverageData$1 = new AssetOnGoingViewModel$subscribeLeverageData$1(this.this$0, this.$symbols, continuation);
        assetOnGoingViewModel$subscribeLeverageData$1.L$0 = obj;
        return assetOnGoingViewModel$subscribeLeverageData$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AssetOnGoingViewModel$subscribeLeverageData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                AssetOnGoingViewModel assetOnGoingViewModel = this.this$0;
                String str = this.$symbols;
                Result.Companion companion = Result.INSTANCE;
                InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(C41636g.m90906b0(assetOnGoingViewModel.m18704D().m20182b(DowngradeExKt.m66551u("/indicator/markPrice:%s", new Object[]{str}, null, 2, null)), 2000L), new AssetOnGoingViewModel$subscribeLeverageData$1$1$1(null));
                C10755a c10755a = new C10755a(interfaceC41709m0, assetOnGoingViewModel);
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC41634eM90917h.collect(c10755a, this) == coroutine_suspended) {
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
