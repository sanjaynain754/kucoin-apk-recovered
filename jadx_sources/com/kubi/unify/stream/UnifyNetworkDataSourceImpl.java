package com.kubi.unify.stream;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.network.api.subscribe.utils.C19319e;
import com.kubi.network.restful.C19321b;
import com.kubi.unify.entity.UnifyAccountOverviewEntity;
import com.kubi.unify.entity.UnifyBalanceEntity;
import com.kubi.unify.entity.UnifyComposeEntity;
import com.kubi.unify.entity.UnifyCurrencyLeverageWsEntity;
import com.kubi.unify.entity.UnifyFundsInfoEntity;
import com.kubi.unify.entity.UnifyLeverageEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import com.kubi.unify.entity.UnifyPriceEntity;
import com.kubi.unify.entity.WsUnifyAccountOverviewEntity;
import com.kubi.unify.entity.WsUnifyFundsInfoEntity;
import com.kubi.unify.utils.FlowExKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.DowngradeExKt;
import er.C37237b;
import gr.C38000b;
import hr.C38290c;
import hr.C38293f;
import i60.InterfaceC38460c;
import i60.InterfaceC38461d;
import i60.InterfaceC38462e;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41674s;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41668m;
import kotlinx.coroutines.flow.InterfaceC41669n;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u00012B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u0013H\u0016J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0013H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0013H\u0002J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n0\u0013H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n0\u0013H\u0016J\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\n0\u0013H\u0002J\u001a\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u0013H\u0016J\u0010\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0013H\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00132\u0006\u0010 \u001a\u00020\u0011H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00132\u0006\u0010 \u001a\u00020\u0011H\u0002J$\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002J\u001c\u0010&\u001a\u0004\u0018\u00010$2\u0006\u0010 \u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010$H\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0013H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0013H\u0002J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u0013H\u0016J\u001c\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010.0\u00100\u0013H\u0016J\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00102\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m90084d2 = {"Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl;", "Lcom/kubi/unify/stream/IUnifyNetworkDataSource;", "unifyApi", "Lcom/kubi/unify/api/UnifyApi;", "unifyPeriodApi", "Lcom/kubi/unify/api/UnifyPeriodApi;", "unifyWsApi", "Lcom/kubi/unify/api/UnifyWsApi;", "manualPositionRefreshFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lcom/kubi/unify/entity/UnifyPositionEntity;", "<init>", "(Lcom/kubi/unify/api/UnifyApi;Lcom/kubi/unify/api/UnifyPeriodApi;Lcom/kubi/unify/api/UnifyWsApi;Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "indexPriceFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "composeFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/unify/entity/UnifyComposeEntity;", "observeIndexPrices", "observePositions", "observePositionsInterval", "observeFundsInfo", "Lcom/kubi/unify/entity/UnifyFundsInfoEntity;", "observeEquity", "observeFundsInfoInterval", "observeFuturesLeverageData", "observerAccountChanged", "observeAvailableBalance", "Lcom/kubi/unify/entity/UnifyBalanceEntity;", FirebaseAnalytics.Param.CURRENCY, "observeOverViewAvailableBalance", "balanceEntityFromOverviewMargins", "availableMargin", "Ljava/math/BigDecimal;", "availableIsolatedMargin", "convertUsdNotionalToSettleCurrency", "marginUsdNotional", "observeOverViewData", "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;", "observeOverViewDataInterval", "observeMarginCurrencyLeverage", "Lcom/kubi/unify/entity/UnifyCurrencyLeverageWsEntity;", "observeMarginMode", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "transformToPriceMap", "dataList", "Lcom/kubi/unify/entity/UnifyPriceEntity;", "OverviewSnapshot", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyNetworkDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,520:1\n56#2:521\n59#2:525\n17#2:526\n19#2:530\n56#2:531\n59#2:535\n17#2:536\n19#2:540\n17#2:541\n19#2:545\n56#2:546\n59#2:550\n56#2:551\n59#2:555\n17#2:556\n19#2:560\n56#2:561\n59#2:565\n56#2:566\n59#2:570\n17#2:571\n19#2:575\n56#2:576\n59#2:580\n17#2:581\n19#2:585\n17#2:586\n19#2:590\n17#2:591\n19#2:595\n49#2:596\n51#2:600\n17#2:601\n19#2:605\n49#2:606\n51#2:610\n17#2:611\n19#2:615\n17#2:616\n19#2:620\n49#2:621\n51#2:625\n49#2:626\n51#2:630\n17#2:632\n19#2:636\n49#2:637\n51#2:641\n17#2:642\n19#2:646\n46#3:522\n51#3:524\n46#3:527\n51#3:529\n46#3:532\n51#3:534\n46#3:537\n51#3:539\n46#3:542\n51#3:544\n46#3:547\n51#3:549\n46#3:552\n51#3:554\n46#3:557\n51#3:559\n46#3:562\n51#3:564\n46#3:567\n51#3:569\n46#3:572\n51#3:574\n46#3:577\n51#3:579\n46#3:582\n51#3:584\n46#3:587\n51#3:589\n46#3:592\n51#3:594\n46#3:597\n51#3:599\n46#3:602\n51#3:604\n46#3:607\n51#3:609\n46#3:612\n51#3:614\n46#3:617\n51#3:619\n46#3:622\n51#3:624\n46#3:627\n51#3:629\n46#3:633\n51#3:635\n46#3:638\n51#3:640\n46#3:643\n51#3:645\n105#4:523\n105#4:528\n105#4:533\n105#4:538\n105#4:543\n105#4:548\n105#4:553\n105#4:558\n105#4:563\n105#4:568\n105#4:573\n105#4:578\n105#4:583\n105#4:588\n105#4:593\n105#4:598\n105#4:603\n105#4:608\n105#4:613\n105#4:618\n105#4:623\n105#4:628\n105#4:634\n105#4:639\n105#4:644\n189#5:631\n774#6:647\n865#6,2:648\n1193#6,2:650\n1267#6,4:652\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n97#1:521\n97#1:525\n98#1:526\n98#1:530\n100#1:531\n100#1:535\n105#1:536\n105#1:540\n149#1:541\n149#1:545\n151#1:546\n151#1:550\n202#1:551\n202#1:555\n242#1:556\n242#1:560\n245#1:561\n245#1:565\n272#1:566\n272#1:570\n283#1:571\n283#1:575\n285#1:576\n285#1:580\n292#1:581\n292#1:585\n299#1:586\n299#1:590\n333#1:591\n333#1:595\n343#1:596\n343#1:600\n356#1:601\n356#1:605\n361#1:606\n361#1:610\n368#1:611\n368#1:615\n396#1:616\n396#1:620\n444#1:621\n444#1:625\n445#1:626\n445#1:630\n481#1:632\n481#1:636\n492#1:637\n492#1:641\n510#1:642\n510#1:646\n97#1:522\n97#1:524\n98#1:527\n98#1:529\n100#1:532\n100#1:534\n105#1:537\n105#1:539\n149#1:542\n149#1:544\n151#1:547\n151#1:549\n202#1:552\n202#1:554\n242#1:557\n242#1:559\n245#1:562\n245#1:564\n272#1:567\n272#1:569\n283#1:572\n283#1:574\n285#1:577\n285#1:579\n292#1:582\n292#1:584\n299#1:587\n299#1:589\n333#1:592\n333#1:594\n343#1:597\n343#1:599\n356#1:602\n356#1:604\n361#1:607\n361#1:609\n368#1:612\n368#1:614\n396#1:617\n396#1:619\n444#1:622\n444#1:624\n445#1:627\n445#1:629\n481#1:633\n481#1:635\n492#1:638\n492#1:640\n510#1:643\n510#1:645\n97#1:523\n98#1:528\n100#1:533\n105#1:538\n149#1:543\n151#1:548\n202#1:553\n242#1:558\n245#1:563\n272#1:568\n283#1:573\n285#1:578\n292#1:583\n299#1:588\n333#1:593\n343#1:598\n356#1:603\n361#1:608\n368#1:613\n396#1:618\n444#1:623\n445#1:628\n481#1:634\n492#1:639\n510#1:644\n471#1:631\n517#1:647\n517#1:648,2\n517#1:650,2\n517#1:652,4\n*E\n"})
public final class UnifyNetworkDataSourceImpl implements IUnifyNetworkDataSource {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC38460c f53375a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC38461d f53376b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC38462e f53377c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC41668m<List<UnifyPositionEntity>> f53378d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final InterfaceC41669n<Map<String, String>> f53379e;

    /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$a, reason: from toString */
    /* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
    /* JADX INFO: loaded from: classes52.dex */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/unify/stream/UnifyNetworkDataSourceImpl$OverviewSnapshot;", "", "data", "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;", "isFromRest", "", "<init>", "(Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;Z)V", "getData", "()Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class OverviewSnapshot {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final UnifyAccountOverviewEntity data;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final boolean isFromRest;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OverviewSnapshot)) {
                return false;
            }
            OverviewSnapshot overviewSnapshot = (OverviewSnapshot) other;
            return Intrinsics.areEqual(this.data, overviewSnapshot.data) && this.isFromRest == overviewSnapshot.isFromRest;
        }

        public OverviewSnapshot(@NotNull UnifyAccountOverviewEntity data, boolean z11) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            this.isFromRest = z11;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final UnifyAccountOverviewEntity getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsFromRest() {
            return this.isFromRest;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + Boolean.hashCode(this.isFromRest);
        }

        @NotNull
        public String toString() {
            return "OverviewSnapshot(data=" + this.data + ", isFromRest=" + this.isFromRest + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes52.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,328:1\n151#2:329\n*E\n"})
    public static final class C26636b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((UnifyPositionEntity) t11).getOpenTime(), ((UnifyPositionEntity) t12).getOpenTime());
        }
    }

    /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$c */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes52.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,328:1\n202#2:329\n*E\n"})
    public static final class C26637c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((UnifyPositionEntity) t11).getOpenTime(), ((UnifyPositionEntity) t12).getOpenTime());
        }
    }

    public UnifyNetworkDataSourceImpl(@NotNull InterfaceC38460c unifyApi, @NotNull InterfaceC38461d unifyPeriodApi, @NotNull InterfaceC38462e unifyWsApi, @NotNull InterfaceC41668m<List<UnifyPositionEntity>> manualPositionRefreshFlow) {
        Intrinsics.checkNotNullParameter(unifyApi, "unifyApi");
        Intrinsics.checkNotNullParameter(unifyPeriodApi, "unifyPeriodApi");
        Intrinsics.checkNotNullParameter(unifyWsApi, "unifyWsApi");
        Intrinsics.checkNotNullParameter(manualPositionRefreshFlow, "manualPositionRefreshFlow");
        this.f53375a = unifyApi;
        this.f53376b = unifyPeriodApi;
        this.f53377c = unifyWsApi;
        this.f53378d = manualPositionRefreshFlow;
        this.f53379e = C41679x.m91009a(MapsKt.emptyMap());
    }

    /* JADX INFO: renamed from: p */
    public final BigDecimal m65383p(String str, BigDecimal bigDecimal) {
        BigDecimal bigDecimalM66535e;
        if (bigDecimal == null) {
            return null;
        }
        BigDecimal bigDecimalM66535e2 = DowngradeExKt.m66535e(this.f53379e.getValue().get("USD-USDT"), null, 1, null);
        if (Intrinsics.areEqual(str, "USDT")) {
            bigDecimalM66535e = BigDecimal.ONE;
        } else {
            bigDecimalM66535e = DowngradeExKt.m66535e(this.f53379e.getValue().get(str + "-USDT"), null, 1, null);
        }
        if (C41014a.m89917B(bigDecimalM66535e)) {
            return null;
        }
        BigDecimal bigDecimalM66656p = C27039d.m66656p(bigDecimal);
        Intrinsics.checkNotNull(bigDecimalM66535e);
        BigDecimal bigDecimalDivide = bigDecimalM66656p.divide(bigDecimalM66535e, RoundingMode.HALF_EVEN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide.multiply(bigDecimalM66535e2);
    }

    @Override // com.kubi.unify.stream.IUnifyNetworkDataSource
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC41634e<String> mo65372a() {
        final InterfaceC41634e interfaceC41634eM65460d = FlowExKt.m65460d(C41636g.m90917h(InterfaceC38462e.m86763h(this.f53377c, null, 1, null), new UnifyNetworkDataSourceImpl$observerAccountChanged$1(null)), DurationKt.toDuration(1.5d, DurationUnit.SECONDS));
        return C41636g.m90939v(new InterfaceC41634e<String>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observerAccountChanged$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observerAccountChanged$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n299#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53443b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observerAccountChanged$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: classes52.dex */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observerAccountChanged$$inlined$filter$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53443b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53443b;
                        if (((String) obj).length() > 0) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super String> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM65460d.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    @Override // com.kubi.unify.stream.IUnifyNetworkDataSource
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC41634e<Map<String, String>> mo65373b() {
        C38293f<List<UnifyLeverageEntity>> c38293fM86755b = this.f53376b.m86755b();
        final InterfaceC41634e interfaceC41634eM65457a = FlowExKt.m65457a(C41636g.m90881E(InterfaceC38462e.m86766p(this.f53377c, c38293fM86755b, null, 2, null)), 1000L);
        final InterfaceC41634e interfaceC41634eM90894R = C41636g.m90894R(c38293fM86755b, new InterfaceC41634e<List<? extends UnifyLeverageEntity>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n283#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53391b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53391b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53391b;
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super List<? extends UnifyLeverageEntity>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM65457a.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        final InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(C41636g.m90904a0(new InterfaceC41634e<Map<String, ? extends String>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n57#2:50\n58#2:58\n285#3:51\n1193#4,2:52\n1267#4,4:54\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n285#1:52,2\n285#1:54,4\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53395b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$mapNotNull$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {58}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53395b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53395b;
                        List<UnifyLeverageEntity> list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (UnifyLeverageEntity unifyLeverageEntity : list) {
                            String symbol = unifyLeverageEntity.getSymbol();
                            String str = "";
                            if (symbol == null) {
                                symbol = "";
                            }
                            String leverage = unifyLeverageEntity.getLeverage();
                            if (leverage != null) {
                                str = leverage;
                            }
                            Pair pairM90091to = TuplesKt.m90091to(symbol, str);
                            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
                        }
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(linkedHashMap);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Map<String, ? extends String>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90894R.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new UnifyNetworkDataSourceImpl$observeFuturesLeverageData$2(null)), new UnifyNetworkDataSourceImpl$observeFuturesLeverageData$3(null));
        return C41636g.m90890N(C41636g.m90939v(new InterfaceC41634e<Map<String, ? extends String>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$2

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n292#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53393b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$2$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFuturesLeverageData$$inlined$filter$2$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53393b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53393b;
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Map<String, ? extends String>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90917h.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), C42911a.m94120b());
    }

    @Override // com.kubi.unify.stream.IUnifyNetworkDataSource
    @NotNull
    /* JADX INFO: renamed from: d */
    public InterfaceC41634e<Map<String, MarginModeInfoEntity>> mo65375d() {
        final C38293f c38293fM86753e = InterfaceC38461d.m86753e(this.f53376b, null, 1, null);
        final InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(C41636g.m90904a0(C41636g.m90894R(new InterfaceC41634e<Map<String, ? extends MarginModeInfoEntity>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n50#2:50\n493#3:51\n463#4:52\n413#4:53\n1252#5,4:54\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n493#1:52\n493#1:53\n493#1:54,4\n*E\n"})
            public static final class C266522<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53413b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$map$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266522.this.emit(null, this);
                    }
                }

                public C266522(InterfaceC41635f interfaceC41635f) {
                    this.f53413b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53413b;
                        Map map = (Map) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            linkedHashMap.put(entry.getKey(), new MarginModeInfoEntity((String) entry.getValue(), Boxing.boxBoolean(false)));
                        }
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Map<String, ? extends MarginModeInfoEntity>> interfaceC41635f, Continuation continuation) {
                Object objCollect = c38293fM86753e.collect(new C266522(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, C41636g.m90881E(InterfaceC38462e.m86765n(this.f53377c, c38293fM86753e, null, 2, null))), new UnifyNetworkDataSourceImpl$observeMarginMode$1(null)), new UnifyNetworkDataSourceImpl$observeMarginMode$2(null));
        return C41636g.m90890N(C41636g.m90939v(new InterfaceC41634e<Map<String, ? extends MarginModeInfoEntity>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$filter$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n510#3:51\n*E\n"})
            public static final class C266512<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53411b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginMode$$inlined$filter$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266512.this.emit(null, this);
                    }
                }

                public C266512(InterfaceC41635f interfaceC41635f) {
                    this.f53411b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53411b;
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Map<String, ? extends MarginModeInfoEntity>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90917h.collect(new C266512(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), C42911a.m94120b());
    }

    @Override // com.kubi.unify.stream.IUnifyNetworkDataSource
    @NotNull
    /* JADX INFO: renamed from: g */
    public InterfaceC41634e<Map<String, String>> mo65378g() {
        final C38293f<List<UnifyPriceEntity>> c38293fM86756c = this.f53376b.m86756c();
        final InterfaceC41634e interfaceC41634eM65457a = FlowExKt.m65457a(InterfaceC38462e.m86760c(this.f53377c, c38293fM86756c, null, 2, null), 1000L);
        final InterfaceC41634e<Map<String, ? extends String>> interfaceC41634e = new InterfaceC41634e<Map<String, ? extends String>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n57#2:50\n58#2:52\n97#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53402b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ UnifyNetworkDataSourceImpl f53403c;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {52}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f, UnifyNetworkDataSourceImpl unifyNetworkDataSourceImpl) {
                    this.f53402b = interfaceC41635f;
                    this.f53403c = unifyNetworkDataSourceImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53402b;
                        Map mapM65388u = this.f53403c.m65388u(CollectionsKt.flatten((List) obj));
                        if (mapM65388u != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(mapM65388u);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(mapM65388u, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Map<String, ? extends String>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM65457a.collect(new AnonymousClass2(interfaceC41635f, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        final InterfaceC41634e interfaceC41634eM90917h = C41636g.m90917h(C41636g.m90904a0(C41636g.m90894R(new InterfaceC41634e<Map<String, ? extends String>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$2

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n57#2:50\n58#2:52\n100#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53406b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ UnifyNetworkDataSourceImpl f53407c;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$2$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$mapNotNull$2$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {52}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f, UnifyNetworkDataSourceImpl unifyNetworkDataSourceImpl) {
                    this.f53406b = interfaceC41635f;
                    this.f53407c = unifyNetworkDataSourceImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53406b;
                        Map mapM65388u = this.f53407c.m65388u((List) obj);
                        if (mapM65388u != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(mapM65388u);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(mapM65388u, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Map<String, ? extends String>> interfaceC41635f, Continuation continuation) {
                Object objCollect = c38293fM86756c.collect(new AnonymousClass2(interfaceC41635f, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new InterfaceC41634e<Map<String, ? extends String>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n98#3:51\n*E\n"})
            public static final class C266462<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53397b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266462.this.emit(null, this);
                    }
                }

                public C266462(InterfaceC41635f interfaceC41635f) {
                    this.f53397b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53397b;
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Map<String, ? extends String>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634e.collect(new C266462(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new UnifyNetworkDataSourceImpl$observeIndexPrices$2(null)), new UnifyNetworkDataSourceImpl$observeIndexPrices$3(null));
        return C41636g.m90890N(C41636g.m90896T(C41636g.m90939v(new InterfaceC41634e<Map<String, ? extends String>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$2

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$2$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n105#3:51\n*E\n"})
            public static final class C266472<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53399b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$2$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$$inlined$filter$2$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266472.this.emit(null, this);
                    }
                }

                public C266472(InterfaceC41635f interfaceC41635f) {
                    this.f53399b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53399b;
                        if (!((Map) obj).isEmpty()) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Map<String, ? extends String>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90917h.collect(new C266472(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new UnifyNetworkDataSourceImpl$observeIndexPrices$5(this, null)), C42911a.m94120b());
    }

    @Override // com.kubi.unify.stream.IUnifyNetworkDataSource
    @NotNull
    /* JADX INFO: renamed from: h */
    public InterfaceC41634e<UnifyBalanceEntity> mo65379h(@NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        final InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(C41636g.m90908c0(C41636g.m90894R(C41636g.m90890N(C41636g.m90887K(new C26639xf50538b1(this, currency, null)), C42911a.m94120b()), m65385r(currency)), null, new UnifyNetworkDataSourceImpl$observeAvailableBalance$1(currency, null)));
        return C41636g.m90939v(new InterfaceC41634e<UnifyBalanceEntity>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n334#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53383b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeAvailableBalance$$inlined$filter$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53383b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53383b;
                        UnifyBalanceEntity unifyBalanceEntity = (UnifyBalanceEntity) obj;
                        if (unifyBalanceEntity.getFuturesAvailable() != null || unifyBalanceEntity.getFuturesIsolatedAvailable() != null || unifyBalanceEntity.getMaxWithdraw() != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super UnifyBalanceEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    @Override // com.kubi.unify.stream.IUnifyNetworkDataSource
    @NotNull
    /* JADX INFO: renamed from: i */
    public InterfaceC41634e<UnifyCurrencyLeverageWsEntity> mo65380i() {
        final InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(InterfaceC38462e.m86762g(this.f53377c, null, 1, null));
        return C41636g.m90890N(C41636g.m90917h(new InterfaceC41634e<UnifyCurrencyLeverageWsEntity>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginCurrencyLeverage$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginCurrencyLeverage$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n481#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53409b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginCurrencyLeverage$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginCurrencyLeverage$$inlined$filter$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53409b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    String leverage;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53409b;
                        UnifyCurrencyLeverageWsEntity unifyCurrencyLeverageWsEntity = (UnifyCurrencyLeverageWsEntity) obj;
                        String currency = unifyCurrencyLeverageWsEntity.getCurrency();
                        if (currency != null && currency.length() != 0 && (leverage = unifyCurrencyLeverageWsEntity.getLeverage()) != null && leverage.length() != 0) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super UnifyCurrencyLeverageWsEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new UnifyNetworkDataSourceImpl$observeMarginCurrencyLeverage$2(null)), C42911a.m94120b());
    }

    /* JADX INFO: renamed from: n */
    public final UnifyBalanceEntity m65381n(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return this.f53379e.getValue().isEmpty() ? new UnifyBalanceEntity(str, null, null, null, 14, null) : new UnifyBalanceEntity(str, m65383p(str, bigDecimal), m65383p(str, bigDecimal2), null, 8, null);
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC41634e<UnifyComposeEntity> m65382o() {
        return InterfaceC38462e.m86764l(this.f53377c, null, 1, null);
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC41634e<List<UnifyFundsInfoEntity>> m65384q() {
        C38293f<List<UnifyFundsInfoEntity>> c38293fM86754a = this.f53376b.m86754a();
        final InterfaceC41634e interfaceC41634eM90904a0 = C41636g.m90904a0(C41636g.m90894R(c38293fM86754a, InterfaceC38462e.m86761d(this.f53377c, c38293fM86754a, null, 2, null)), new UnifyNetworkDataSourceImpl$observeFundsInfoInterval$1(null));
        return C41636g.m90890N(C41636g.m90939v(C41636g.m90917h(new InterfaceC41634e<List<? extends UnifyFundsInfoEntity>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFundsInfoInterval$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFundsInfoInterval$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n57#2:50\n58#2:52\n272#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53389b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFundsInfoInterval$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFundsInfoInterval$$inlined$mapNotNull$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {52}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53389b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53389b;
                        List list = obj instanceof List ? (List) obj : null;
                        if (list != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(list);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(list, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super List<? extends UnifyFundsInfoEntity>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90904a0.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new UnifyNetworkDataSourceImpl$observeFundsInfoInterval$3(null))), C42911a.m94120b());
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC41634e<UnifyAccountOverviewEntity> m65386s() {
        return C41636g.m90890N(C41636g.m90917h(C41636g.m90930n0(C41636g.m90887K(new UnifyNetworkDataSourceImpl$observeOverViewDataInterval$1(null)), new C26660xb1afbaee(null, this)), new UnifyNetworkDataSourceImpl$observeOverViewDataInterval$3(null)), C42911a.m94120b());
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC41634e<List<UnifyPositionEntity>> m65387t() {
        C38293f c38293fM86752d = InterfaceC38461d.m86752d(this.f53376b, false, 1, null);
        final InterfaceC41634e interfaceC41634eM90904a0 = C41636g.m90904a0(C41636g.m90894R(c38293fM86752d, InterfaceC38462e.m86759a(this.f53377c, c38293fM86752d, null, 2, null), this.f53378d), new UnifyNetworkDataSourceImpl$observePositionsInterval$1(this, null));
        return C41636g.m90890N(C41636g.m90939v(C41636g.m90917h(new InterfaceC41634e<List<? extends UnifyPositionEntity>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositionsInterval$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositionsInterval$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n57#2:50\n58#2:53\n202#3:51\n1056#4:52\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n202#1:52\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53441b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositionsInterval$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositionsInterval$$inlined$mapNotNull$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {53}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53441b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53441b;
                        List list = obj instanceof List ? (List) obj : null;
                        List listSortedWith = list != null ? CollectionsKt.sortedWith(list, new UnifyNetworkDataSourceImpl.C26637c()) : null;
                        if (listSortedWith != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(listSortedWith);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(listSortedWith, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super List<? extends UnifyPositionEntity>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90904a0.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new UnifyNetworkDataSourceImpl$observePositionsInterval$3(null))), C19319e.m42764c());
    }

    /* JADX INFO: renamed from: u */
    public final Map<String, String> m65388u(List<UnifyPriceEntity> list) {
        ArrayList<UnifyPriceEntity> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((UnifyPriceEntity) obj).getPrice() != null) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (UnifyPriceEntity unifyPriceEntity : arrayList) {
            String symbol = unifyPriceEntity.getSymbol();
            if (symbol == null) {
                symbol = "";
            }
            String price = unifyPriceEntity.getPrice();
            Intrinsics.checkNotNull(price);
            Pair pairM90091to = TuplesKt.m90091to(symbol, price);
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return linkedHashMap;
    }

    @Override // com.kubi.unify.stream.IUnifyNetworkDataSource
    @NotNull
    /* JADX INFO: renamed from: c */
    public InterfaceC41634e<UnifyAccountOverviewEntity> mo65374c() {
        final InterfaceC41634e<UnifyAccountOverviewEntity> interfaceC41634eM65386s = m65386s();
        InterfaceC41634e<OverviewSnapshot> interfaceC41634e = new InterfaceC41634e<OverviewSnapshot>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n50#2:50\n444#3:51\n*E\n"})
            public static final class C266582<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53433b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266582.this.emit(null, this);
                    }
                }

                public C266582(InterfaceC41635f interfaceC41635f) {
                    this.f53433b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53433b;
                        UnifyNetworkDataSourceImpl.OverviewSnapshot overviewSnapshot = new UnifyNetworkDataSourceImpl.OverviewSnapshot((UnifyAccountOverviewEntity) obj, true);
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(overviewSnapshot, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super UnifyNetworkDataSourceImpl.OverviewSnapshot> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM65386s.collect(new C266582(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        final InterfaceC41634e<UnifyComposeEntity> interfaceC41634eM65382o = m65382o();
        return C41636g.m90881E(C41636g.m90908c0(C41636g.m90894R(interfaceC41634e, new InterfaceC41634e<OverviewSnapshot>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$2

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$2$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n50#2:50\n446#3,4:51\n*E\n"})
            public static final class C266592<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53435b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewData$$inlined$map$2$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266592.this.emit(null, this);
                    }
                }

                public C266592(InterfaceC41635f interfaceC41635f) {
                    this.f53435b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    UnifyAccountOverviewEntity unifyAccountOverviewEntity;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53435b;
                        WsUnifyAccountOverviewEntity userEquity = ((UnifyComposeEntity) obj).getUserEquity();
                        if (userEquity == null || (unifyAccountOverviewEntity = userEquity.asUnifyAccountOverviewEntity()) == null) {
                            unifyAccountOverviewEntity = new UnifyAccountOverviewEntity(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
                        }
                        UnifyNetworkDataSourceImpl.OverviewSnapshot overviewSnapshot = new UnifyNetworkDataSourceImpl.OverviewSnapshot(unifyAccountOverviewEntity, false);
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(overviewSnapshot, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super UnifyNetworkDataSourceImpl.OverviewSnapshot> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM65382o.collect(new C266592(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), null, new UnifyNetworkDataSourceImpl$observeOverViewData$3(null)));
    }

    @Override // com.kubi.unify.stream.IUnifyNetworkDataSource
    @NotNull
    /* JADX INFO: renamed from: e */
    public InterfaceC41634e<List<UnifyFundsInfoEntity>> mo65376e() {
        final InterfaceC41634e interfaceC41634eM90904a0 = C41636g.m90904a0(C41636g.m90894R(m65384q(), InterfaceC38462e.m86764l(this.f53377c, null, 1, null)), new UnifyNetworkDataSourceImpl$observeEquity$1(null));
        final InterfaceC41634e<Object> interfaceC41634e = new InterfaceC41634e<Object>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeEquity$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeEquity$$inlined$filter$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n243#3:51\n*E\n"})
            public static final class C266402<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53385b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeEquity$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeEquity$$inlined$filter$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266402.this.emit(null, this);
                    }
                }

                public C266402(InterfaceC41635f interfaceC41635f) {
                    this.f53385b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53385b;
                        if (obj instanceof List) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Object> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90904a0.collect(new C266402(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return new InterfaceC41634e<List<? extends UnifyFundsInfoEntity>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeEquity$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeEquity$$inlined$mapNotNull$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n57#2:50\n58#2:52\n245#3:51\n*E\n"})
            public static final class C266412<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53387b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeEquity$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeEquity$$inlined$mapNotNull$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {52}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266412.this.emit(null, this);
                    }
                }

                public C266412(InterfaceC41635f interfaceC41635f) {
                    this.f53387b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53387b;
                        List list = obj instanceof List ? (List) obj : null;
                        if (list != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(list);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(list, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super List<? extends UnifyFundsInfoEntity>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634e.collect(new C266412(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.kubi.unify.stream.IUnifyNetworkDataSource
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC41634e<List<UnifyPositionEntity>> mo65377f() {
        final InterfaceC41634e interfaceC41634eM90904a0 = C41636g.m90904a0(C41636g.m90894R(m65387t(), m65382o()), new UnifyNetworkDataSourceImpl$observePositions$1(null));
        final InterfaceC41634e<Object> interfaceC41634e = new InterfaceC41634e<Object>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositions$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositions$$inlined$filter$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n150#3:51\n*E\n"})
            public static final class C266612<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53437b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositions$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositions$$inlined$filter$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C266612.this.emit(null, this);
                    }
                }

                public C266612(InterfaceC41635f interfaceC41635f) {
                    this.f53437b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53437b;
                        if (obj instanceof List) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super Object> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90904a0.collect(new C266612(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return new InterfaceC41634e<List<? extends UnifyPositionEntity>>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositions$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositions$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,49:1\n57#2:50\n58#2:53\n151#3:51\n1056#4:52\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n151#1:52\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53439b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositions$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositions$$inlined$mapNotNull$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {53}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$mapNotNull_u24lambda_u246", "transformed", "$i$a$-unsafeTransform-FlowKt__TransformKt$mapNotNull$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53439b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53439b;
                        List list = obj instanceof List ? (List) obj : null;
                        List listSortedWith = list != null ? CollectionsKt.sortedWith(list, new UnifyNetworkDataSourceImpl.C26636b()) : null;
                        if (listSortedWith != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.L$4 = SpillingKt.nullOutSpilledVariable(listSortedWith);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(listSortedWith, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super List<? extends UnifyPositionEntity>> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634e.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC41634e<UnifyBalanceEntity> m65385r(final String str) {
        final InterfaceC41634e<UnifyComposeEntity> interfaceC41634eM65382o = m65382o();
        final InterfaceC41634e<UnifyBalanceEntity> interfaceC41634e = new InterfaceC41634e<UnifyBalanceEntity>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n50#2:50\n344#3,10:51\n354#3:62\n1#4:61\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53423b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f53424c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ UnifyNetworkDataSourceImpl f53425d;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f, String str, UnifyNetworkDataSourceImpl unifyNetworkDataSourceImpl) {
                    this.f53423b = interfaceC41635f;
                    this.f53424c = str;
                    this.f53425d = unifyNetworkDataSourceImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T next;
                    UnifyBalanceEntity unifyBalanceEntityM65381n;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53423b;
                        UnifyComposeEntity unifyComposeEntity = (UnifyComposeEntity) obj;
                        WsUnifyAccountOverviewEntity userEquity = unifyComposeEntity.getUserEquity();
                        UnifyBalanceEntity unifyBalanceEntity = (userEquity == null || (unifyBalanceEntityM65381n = this.f53425d.m65381n(this.f53424c, userEquity.getAvailableMargin(), userEquity.getAvailableIsolatedMargin())) == null) ? new UnifyBalanceEntity(this.f53424c, null, null, null, 14, null) : unifyBalanceEntityM65381n;
                        List<WsUnifyFundsInfoEntity> accountEquity = unifyComposeEntity.getAccountEquity();
                        BigDecimal maxWithdraw = null;
                        if (accountEquity != null) {
                            Iterator<T> it = accountEquity.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = (T) null;
                                    break;
                                }
                                next = it.next();
                            } while (!StringsKt.equals(((WsUnifyFundsInfoEntity) next).getCurrency(), this.f53424c, true));
                            WsUnifyFundsInfoEntity wsUnifyFundsInfoEntity = next;
                            if (wsUnifyFundsInfoEntity != null) {
                                maxWithdraw = wsUnifyFundsInfoEntity.getMaxWithdraw();
                            }
                        }
                        if (maxWithdraw == null) {
                            maxWithdraw = unifyBalanceEntity.getMaxWithdraw();
                        }
                        UnifyBalanceEntity unifyBalanceEntityCopy$default = UnifyBalanceEntity.copy$default(unifyBalanceEntity, null, null, null, maxWithdraw, 7, null);
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(unifyBalanceEntityCopy$default, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super UnifyBalanceEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM65382o.collect(new AnonymousClass2(interfaceC41635f, str, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        InterfaceC41634e<UnifyBalanceEntity> interfaceC41634e2 = new InterfaceC41634e<UnifyBalanceEntity>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$1

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n357#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53415b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$1$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53415b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53415b;
                        UnifyBalanceEntity unifyBalanceEntity = (UnifyBalanceEntity) obj;
                        if (unifyBalanceEntity.getFuturesAvailable() != null || unifyBalanceEntity.getFuturesIsolatedAvailable() != null || unifyBalanceEntity.getMaxWithdraw() != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super UnifyBalanceEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634e.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        final InterfaceC41634e<UnifyAccountOverviewEntity> interfaceC41634eM65386s = m65386s();
        final InterfaceC41634e<UnifyBalanceEntity> interfaceC41634e3 = new InterfaceC41634e<UnifyBalanceEntity>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$2

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n50#2:50\n362#3,5:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53429b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ UnifyNetworkDataSourceImpl f53430c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ String f53431d;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$map$2$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f, UnifyNetworkDataSourceImpl unifyNetworkDataSourceImpl, String str) {
                    this.f53429b = interfaceC41635f;
                    this.f53430c = unifyNetworkDataSourceImpl;
                    this.f53431d = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53429b;
                        UnifyAccountOverviewEntity unifyAccountOverviewEntity = (UnifyAccountOverviewEntity) obj;
                        UnifyBalanceEntity unifyBalanceEntityM65381n = this.f53430c.m65381n(this.f53431d, unifyAccountOverviewEntity.getAvailableMargin(), unifyAccountOverviewEntity.getAvailableIsolatedMargin());
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(unifyBalanceEntityM65381n, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super UnifyBalanceEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM65386s.collect(new AnonymousClass2(interfaceC41635f, this, str), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        final InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(C41636g.m90908c0(C41636g.m90894R(interfaceC41634e2, new InterfaceC41634e<UnifyBalanceEntity>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$2

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n369#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53417b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$2$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$2$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53417b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53417b;
                        UnifyBalanceEntity unifyBalanceEntity = (UnifyBalanceEntity) obj;
                        if (unifyBalanceEntity.getFuturesAvailable() != null || unifyBalanceEntity.getFuturesIsolatedAvailable() != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super UnifyBalanceEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634e3.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), null, new UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$1(str, null)));
        return C41636g.m90939v(new InterfaceC41634e<UnifyBalanceEntity>() { // from class: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$3

            /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl\n*L\n1#1,49:1\n18#2:50\n19#2:52\n397#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f53419b;

                /* JADX INFO: renamed from: com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$3$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeOverViewAvailableBalance$$inlined$filter$3$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC41635f interfaceC41635f) {
                    this.f53419b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f53419b;
                        UnifyBalanceEntity unifyBalanceEntity = (UnifyBalanceEntity) obj;
                        if (unifyBalanceEntity.getFuturesAvailable() != null || unifyBalanceEntity.getFuturesIsolatedAvailable() != null || unifyBalanceEntity.getMaxWithdraw() != null) {
                            anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                            anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC41635f.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super UnifyBalanceEntity> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90881E.collect(new AnonymousClass2(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UnifyNetworkDataSourceImpl(InterfaceC38460c interfaceC38460c, InterfaceC38461d interfaceC38461d, InterfaceC38462e interfaceC38462e, InterfaceC41668m interfaceC41668m, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            Object objCreate = C42597a.m93388d().create(InterfaceC38460c.class);
            Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
            interfaceC38460c = (InterfaceC38460c) objCreate;
        }
        if ((i11 & 2) != 0) {
            Object objCreate2 = C38290c.m86420a(C42597a.f94305a).create(InterfaceC38461d.class);
            Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
            interfaceC38461d = (InterfaceC38461d) objCreate2;
        }
        this(interfaceC38460c, interfaceC38461d, (i11 & 4) != 0 ? (InterfaceC38462e) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_unified"))).m42776a().m42772b(InterfaceC38462e.class) : interfaceC38462e, (i11 & 8) != 0 ? C41674s.m91001b(0, 1, null, 5, null) : interfaceC41668m);
    }
}
