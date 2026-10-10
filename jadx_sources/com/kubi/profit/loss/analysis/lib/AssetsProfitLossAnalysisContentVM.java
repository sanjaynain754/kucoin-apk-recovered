package com.kubi.profit.loss.analysis.lib;

import androidx.lifecycle.ViewModelKt;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.assets.AssetTotalNotifier;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.profit.loss.analysis.exception.ProfitException;
import com.kubi.resources.widget.chart.data.DataPoint;
import com.kubi.resources.widget.chart.data.TipGravity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p479nw.Label;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IndexedValue;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisContentVM.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u000e\u0010\u000f\u001a\u00020\u000bH\u0094@¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bH\u0002J(\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001cH\u0002J \u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0019H\u0002J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020-H\u0002J\u0012\u0010.\u001a\u0004\u0018\u00010/2\u0006\u0010)\u001a\u00020*H\u0002J\u0014\u00100\u001a\u0004\u0018\u00010\u00192\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0014\u00103\u001a\u0004\u0018\u00010\u00192\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0012\u00104\u001a\u0004\u0018\u0001022\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u000206H\u0002J\u0016\u00109\u001a\u00020\u000b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020!0\u001cH\u0002J&\u0010;\u001a\u00020\u000b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020!0\u001c2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\u001cH\u0002J\u0016\u0010>\u001a\u00020\u000b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020!0\u001cH\u0002J\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020!0\u001c*\b\u0012\u0004\u0012\u00020@0\u001cH\u0002J\u0018\u0010A\u001a\b\u0012\u0004\u0012\u00020!0\u001c*\b\u0012\u0004\u0012\u00020B0\u001cH\u0002J.\u0010C\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0E0Dj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0E`F2\b\b\u0002\u0010G\u001a\u00020$H\u0002J.\u0010H\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0E0Dj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0E`F2\b\b\u0002\u0010G\u001a\u00020$H\u0002J&\u0010I\u001a\u0004\u0018\u00010J2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u001c2\b\b\u0002\u0010L\u001a\u00020\u0019H\u0002J&\u0010M\u001a\u0004\u0018\u00010J2\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010\u001c2\b\b\u0002\u0010L\u001a\u00020\u0019H\u0002J\u0010\u0010N\u001a\u00020\u00192\u0006\u0010O\u001a\u00020\u0019H\u0002J\u0016\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020RH\u0094@¢\u0006\u0002\u0010SR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010T\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragmentContract$ContentUIState;", "<init>", "()V", "mApi", "Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisApi;", "totalBalance", "Ljava/math/BigDecimal;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "bindEvent", "handleInitIntent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hideAsset", "showAsset", "calculateYAxisScale", "Lcom/kubi/profit/loss/analysis/lib/LabelScale;", "high", "", "low", "formatNumber", "", "value", "getLabelList", "", "Lcom/kubi/resources/widget/chart/data/Label;", "count", "", "pointList", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "requestGetPointByRange", "needLoading", "", SessionDescription.ATTR_RANGE, "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshData", "handleGetPointByRange", "response", "Lcom/kubi/profit/loss/analysis/lib/ProfitLossAnalysisApiResponse;", "handleTrendList", "handleGetPointByRangeOld", "Lcom/kubi/profit/loss/analysis/lib/OldProfitLossAnalysisApiResponse;", "getTime", "Lcom/kubi/profit/loss/analysis/lib/RangeTime;", "getMd", "date", "Ljava/util/Date;", "convertDateToString", "str2Date", "str", "", "convertTimestampToFormattedDate", "timestamp", "findPeaksAndValleys", "points", "getInOutPoint", "assetFlowList", "Lcom/kubi/profit/loss/analysis/lib/FlowPoint;", "getPeriod", "toDataPointList", "Lcom/kubi/profit/loss/analysis/lib/ChartPoint;", "toDataPointListOld", "Lcom/kubi/profit/loss/analysis/lib/OldChartPoint;", "createComparator", "Ljava/util/Comparator;", "Lkotlin/collections/IndexedValue;", "Lkotlin/Comparator;", "compareMax", "createComparatorOld", "calculateValueRange", "Lcom/kubi/profit/loss/analysis/lib/ValueEntity;", "list", "rangeName", "calculateValueRangeOld", "getValueStr", "valueStr", "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragmentContract$ContentUIState;", "Companion", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsProfitLossAnalysisContentVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsProfitLossAnalysisContentVM.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentVM\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 6 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 7 ProfitLossAnalysisIssue.kt\ncom/kubi/profit/loss/analysis/exception/ProfitLossAnalysisIssueKt\n+ 8 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n*L\n1#1,725:1\n106#2,2:726\n106#2,2:728\n1#3:730\n1#3:732\n1#3:734\n1#3:737\n2756#4:731\n1208#4,2:758\n1236#4,4:760\n1869#4,2:764\n1869#4,2:766\n1573#4:768\n1604#4,4:769\n1573#4:773\n1604#4,4:774\n1573#4:778\n1604#4,4:779\n1573#4:783\n1604#4,4:784\n1563#4:792\n1634#4,3:793\n1563#4:796\n1634#4,3:797\n1573#4:800\n1604#4,4:801\n1740#4,3:805\n1573#4:808\n1604#4,4:809\n1740#4,3:813\n33#5:733\n34#5:735\n25#5:736\n26#5:738\n50#6,17:739\n44#7,2:756\n473#8,4:788\n*S KotlinDebug\n*F\n+ 1 AssetsProfitLossAnalysisContentVM.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentVM\n*L\n75#1:726,2\n83#1:728,2\n221#1:732\n279#1:734\n281#1:737\n221#1:731\n512#1:758,2\n512#1:760,4\n513#1:764,2\n541#1:766,2\n565#1:768\n565#1:769,4\n581#1:773\n581#1:774,4\n606#1:778\n606#1:779,4\n621#1:783\n621#1:784,4\n110#1:792\n110#1:793,3\n133#1:796\n133#1:797,3\n321#1:800\n321#1:801,4\n350#1:805,3\n368#1:808\n368#1:809,4\n397#1:813,3\n279#1:733\n279#1:735\n281#1:736\n281#1:738\n448#1:739,17\n450#1:756,2\n716#1:788,4\n*E\n"})
public final class AssetsProfitLossAnalysisContentVM extends AbstractC19291m<ContentUIState> {

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f40620a0 = new Companion(null);

    /* JADX INFO: renamed from: Y */
    @Nullable
    public BigDecimal f40622Y;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final AssetsProfitLossAnalysisApi f40621X = (AssetsProfitLossAnalysisApi) RetrofitFlowExKt.m42820a(AssetsProfitLossAnalysisApi.class);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Function1<BigDecimal, Unit> f40623Z = new Function1() { // from class: com.kubi.profit.loss.analysis.lib.k
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AssetsProfitLossAnalysisContentVM.m49990P(this.f40732b, (BigDecimal) obj);
        }
    };

    /* JADX INFO: compiled from: AssetsProfitLossAnalysisContentVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentVM$Companion;", "", "<init>", "()V", "LINE_COUNT", "", "OFFSET", "", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: AssetsProfitLossAnalysisContentVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentVM", m90122f = "AssetsProfitLossAnalysisContentVM.kt", m90123i = {0, 1, 1, 1, 1, 1, 1}, m90124l = {715, 718}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "this_$iv", "$this$checkIntent$iv", "intent", "$i$f$checkIntent", "$i$a$-checkIntent-AssetsProfitLossAnalysisContentVM$dispatchIntent$2"}, m90127s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C214991 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C214991(Continuation<? super C214991> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetsProfitLossAnalysisContentVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentVM$handleInitIntent$1 */
    /* JADX INFO: compiled from: AssetsProfitLossAnalysisContentVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentVM", m90122f = "AssetsProfitLossAnalysisContentVM.kt", m90123i = {}, m90124l = {95}, m90125m = "handleInitIntent", m90126n = {}, m90127s = {})
    public static final class C215001 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C215001(Continuation<? super C215001> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssetsProfitLossAnalysisContentVM.this.handleInitIntent(this);
        }
    }

    /* JADX INFO: renamed from: M */
    public static final ContentUIState m49988M(ProfitLossAnalysisApiResponse profitLossAnalysisApiResponse, AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM, ContentUIState updateState) {
        List<ChartPoint> trendList;
        ArrayList arrayList;
        List list;
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        List<ChartPoint> trendList2 = profitLossAnalysisApiResponse.getTrendList();
        Boolean boolValueOf = null;
        if (trendList2 == null || trendList2.isEmpty()) {
            trendList = profitLossAnalysisApiResponse.getTrendList();
        } else {
            List<ChartPoint> trendList3 = profitLossAnalysisApiResponse.getTrendList();
            if (trendList3 != null) {
                Long lValueOf = Long.valueOf(System.currentTimeMillis());
                BigDecimal bigDecimal = assetsProfitLossAnalysisContentVM.f40622Y;
                if (bigDecimal == null) {
                    bigDecimal = BigDecimal.ZERO;
                }
                trendList = CollectionsKt.plus((Collection<? extends ChartPoint>) trendList3, new ChartPoint(lValueOf, bigDecimal));
            } else {
                trendList = null;
            }
        }
        List<DataPoint> listM50027Y = trendList != null ? assetsProfitLossAnalysisContentVM.m50027Y(trendList) : null;
        if (listM50027Y != null) {
            assetsProfitLossAnalysisContentVM.m50011A(listM50027Y);
            assetsProfitLossAnalysisContentVM.m50013C(listM50027Y, profitLossAnalysisApiResponse.getAssetFlowResponseList());
            assetsProfitLossAnalysisContentVM.m50017G(listM50027Y);
        }
        List<RangeType> rangeListV2 = profitLossAnalysisApiResponse.getRangeListV2();
        int iM66650j = C27039d.m66650j(rangeListV2 != null ? Integer.valueOf(rangeListV2.size()) : null);
        List<RangeType> rangeListV3 = profitLossAnalysisApiResponse.getRangeListV2();
        boolean z11 = false;
        String strM66668h = "";
        if (rangeListV3 == null || (list = CollectionsKt.toList(rangeListV3)) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                RangeType rangeType = (RangeType) obj;
                if (Intrinsics.areEqual(rangeType.getRange(), profitLossAnalysisApiResponse.getCurrentRangeV2())) {
                    strM66668h = C27041f.m66668h(rangeType.getName());
                }
                int i13 = i11 % iM66650j;
                RangeType rangeTypeCopy$default = i13 == 0 ? RangeType.copy$default(rangeType, null, null, false, 0, false, 0, 16, 15, null) : i13 == iM66650j + (-1) ? RangeType.copy$default(rangeType, null, null, false, 0, false, 16, 0, 15, null) : RangeType.copy$default(rangeType, null, null, false, 0, false, 16, 16, 15, null);
                arrayList2.add(RangeType.copy$default(rangeTypeCopy$default, null, null, Intrinsics.areEqual(profitLossAnalysisApiResponse.getCurrentRangeV2(), rangeTypeCopy$default.getRange()), Intrinsics.areEqual(profitLossAnalysisApiResponse.getCurrentRangeV2(), rangeTypeCopy$default.getRange()) ? R$color.c_text : R$color.c_text30, false, 0, 0, 115, null));
                i11 = i12;
            }
            arrayList = arrayList2;
        }
        String str = strM66668h;
        String strM66669i = C27041f.m66669i(profitLossAnalysisApiResponse.getCurrentRangeV2(), "LAST_1_DAY");
        ValueEntity valueEntityM50029t = assetsProfitLossAnalysisContentVM.m50029t(trendList, str);
        if (listM50027Y != null) {
            if (listM50027Y.isEmpty()) {
                z11 = true;
                break;
            }
            Iterator<T> it = listM50027Y.iterator();
            do {
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                }
            } while (((DataPoint) it.next()).getValue() == listM50027Y.get(0).getValue());
            boolValueOf = Boolean.valueOf(z11);
        }
        return ContentUIState.copy$default(updateState, null, arrayList, str, strM66669i, new DataPointState(listM50027Y, null, valueEntityM50029t, assetsProfitLossAnalysisContentVM.m50015E(5, listM50027Y), C27025c.m66566d(boolValueOf), 2, null), assetsProfitLossAnalysisContentVM.m50018H(profitLossAnalysisApiResponse), null, null, 193, null);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Comparator m50009y(AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return assetsProfitLossAnalysisContentVM.m50033x(z11);
    }

    /* JADX INFO: renamed from: G */
    public final void m50017G(List<DataPoint> list) {
        DataPoint dataPoint = (DataPoint) CollectionsKt.getOrNull(list, 0);
        DataPoint dataPoint2 = (DataPoint) CollectionsKt.getOrNull(list, 1);
        long jM66652l = C27039d.m66652l(dataPoint2 != null ? dataPoint2.getTime() : null) - C27039d.m66652l(dataPoint != null ? dataPoint.getTime() : null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(jM66652l);
        long hours = timeUnit.toHours(jM66652l);
        for (DataPoint dataPoint3 : list) {
            if (days > 0) {
                dataPoint3.setPeriod((int) days);
                dataPoint3.setPeriodType(2);
            } else {
                dataPoint3.setPeriod((int) hours);
                dataPoint3.setPeriodType(1);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final ValueEntity m50029t(List<ChartPoint> list, String str) {
        if (list == null) {
            return null;
        }
        ChartPoint chartPoint = (ChartPoint) CollectionsKt.lastOrNull((List) list);
        if (chartPoint == null) {
            chartPoint = new ChartPoint(null, null, 3, null);
        }
        ChartPoint chartPoint2 = (ChartPoint) CollectionsKt.firstOrNull((List) list);
        if (chartPoint2 == null) {
            chartPoint2 = new ChartPoint(null, null, 3, null);
        }
        BigDecimal total = chartPoint.getTotal();
        if (total == null) {
            total = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(total);
        BigDecimal total2 = chartPoint2.getTotal();
        if (total2 == null) {
            total2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(total2);
        BigDecimal bigDecimalSubtract = total.subtract(total2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return new ValueEntity(Double.valueOf(bigDecimalSubtract.doubleValue()), m50019I(C21535v.m50064b(bigDecimalSubtract)), str, null, 8, null);
    }

    /* JADX INFO: renamed from: K */
    public static final ContentUIState m49987K(ContentUIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return ContentUIState.copy$default(updateState, null, null, null, null, null, null, Boolean.TRUE, null, 191, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public static final ContentUIState m49989O(AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM, ContentUIState updateState) {
        ArrayList arrayList;
        List list;
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        DataPointState dataPointState = updateState.getDataPointState();
        Object objCopy$default = null;
        if (dataPointState != null) {
            List<DataPoint> pointList = updateState.getDataPointState().getPointList();
            if (pointList == null || (list = CollectionsKt.toList(pointList)) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(DataPoint.copy$default((DataPoint) it.next(), 0, 0.0d, false, false, false, false, false, false, false, 0.0f, "", null, null, "", 0.0f, 0.0f, null, 0, null, null, 0, 0, 4185087, null));
                }
                arrayList = arrayList2;
            }
            ValueEntity rangeValueEntity = updateState.getDataPointState().getRangeValueEntity();
            objCopy$default = DataPointState.copy$default(dataPointState, arrayList, null, rangeValueEntity != null ? ValueEntity.copy$default(rangeValueEntity, null, "", null, null, 13, null) : null, assetsProfitLossAnalysisContentVM.m50015E(5, updateState.getDataPointState().getPointList()), false, 18, null);
        }
        return ContentUIState.copy$default(updateState, null, null, null, null, objCopy$default, null, null, null, 239, null);
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m49990P(AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM, BigDecimal bigDecimal) {
        assetsProfitLossAnalysisContentVM.f40622Y = bigDecimal;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ Object m49991S(AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM, boolean z11, String str, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return assetsProfitLossAnalysisContentVM.m50024R(z11, str, continuation);
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m49992T(AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM, String str) {
        assetsProfitLossAnalysisContentVM.m50023Q(C27041f.m66669i(str, "LAST_1_DAY"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final ContentUIState m49993U(ContentUIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return ContentUIState.copy$default(updateState, null, null, null, null, null, null, Boolean.FALSE, null, 191, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public static final ContentUIState m49994W(AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM, ContentUIState updateState) {
        ArrayList arrayList;
        List<DataPoint> list;
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        DataPointState dataPointState = updateState.getDataPointState();
        Object objCopy$default = null;
        if (dataPointState != null) {
            List<DataPoint> pointList = updateState.getDataPointState().getPointList();
            if (pointList == null || (list = CollectionsKt.toList(pointList)) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (DataPoint dataPoint : list) {
                    arrayList2.add(DataPoint.copy$default(dataPoint, 0, 0.0d, false, false, false, false, false, false, false, 0.0f, dataPoint.getSelectOriginalText1(), null, null, dataPoint.getSelectOriginalText1(), 0.0f, 0.0f, null, 0, null, null, 0, 0, 4185087, null));
                }
                arrayList = arrayList2;
            }
            ValueEntity rangeValueEntity = updateState.getDataPointState().getRangeValueEntity();
            if (rangeValueEntity != null) {
                Double value = updateState.getDataPointState().getRangeValueEntity().getValue();
                objCopy$default = ValueEntity.copy$default(rangeValueEntity, null, value != null ? C21535v.m50064b(new BigDecimal(String.valueOf(value.doubleValue()))) : null, null, null, 13, null);
            }
            objCopy$default = DataPointState.copy$default(dataPointState, arrayList, null, objCopy$default, assetsProfitLossAnalysisContentVM.m50015E(5, updateState.getDataPointState().getPointList()), false, 18, null);
        }
        return ContentUIState.copy$default(updateState, null, null, null, null, objCopy$default, null, null, null, 239, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m50013C(List<DataPoint> list, List<FlowPoint> list2) {
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(Long.valueOf(C27039d.m66652l(((FlowPoint) obj).getTimestamp())), obj);
        }
        for (DataPoint dataPoint : list) {
            FlowPoint flowPoint = (FlowPoint) linkedHashMap.getOrDefault(Long.valueOf(C27039d.m66652l(dataPoint.getTime())), null);
            if (flowPoint != null) {
                String direction = flowPoint.getDirection();
                dataPoint.setDepositOrWithdraw(Intrinsics.areEqual(direction, "IN") ? 1 : Intrinsics.areEqual(direction, "OUT") ? 2 : 0);
                dataPoint.setDepositOrWithdrawAmount(flowPoint.getAmount());
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public ContentUIState getInitState() {
        return new ContentUIState(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX INFO: renamed from: E */
    public final List<Label> m50015E(int i11, List<DataPoint> list) {
        Object next;
        Object next2;
        LabelScale labelScaleM50030u;
        ArrayList arrayList = null;
        arrayList = null;
        arrayList = null;
        arrayList = null;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((DataPoint) next).isMax());
            DataPoint dataPoint = (DataPoint) next;
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((DataPoint) next2).isMin());
            DataPoint dataPoint2 = (DataPoint) next2;
            Double dValueOf = dataPoint != null ? Double.valueOf(dataPoint.getValue()) : null;
            Double dValueOf2 = dataPoint2 != null ? Double.valueOf(dataPoint2.getValue()) : null;
            if (dValueOf != null && dValueOf2 != null) {
                if (Intrinsics.areEqual(dValueOf, dValueOf2)) {
                    labelScaleM50030u = new LabelScale(C27039d.m66646f(dataPoint2 != null ? Double.valueOf(dataPoint2.getValue() - 10.0d) : null), C27039d.m66646f(dataPoint2 != null ? Double.valueOf(dataPoint2.getValue()) : null), C27039d.m66646f(dataPoint != null ? Double.valueOf(dataPoint.getValue() + 10.0d) : null));
                } else {
                    labelScaleM50030u = m50030u(dValueOf.doubleValue(), dValueOf2.doubleValue());
                }
                arrayList = new ArrayList();
                int i12 = i11 / 2;
                Iterator it3 = CollectionsKt.toList(RangesKt.until(0, i11)).iterator();
                while (it3.hasNext()) {
                    int iIntValue = ((Number) it3.next()).intValue();
                    if (iIntValue == 0) {
                        arrayList.add(new Label(m50019I(m50012B(new BigDecimal(String.valueOf(labelScaleM50030u.getMin())))), 0.0f, 0.0f, true, labelScaleM50030u.getMin(), 6, null));
                    } else if (iIntValue == i11 - 1) {
                        arrayList.add(new Label(m50019I(m50012B(new BigDecimal(String.valueOf(labelScaleM50030u.getMax())))), 0.0f, 0.0f, true, labelScaleM50030u.getMax(), 6, null));
                    } else if (iIntValue == i12) {
                        arrayList.add(new Label(m50019I(m50012B(new BigDecimal(String.valueOf(labelScaleM50030u.getMiddle())))), 0.0f, 0.0f, true, labelScaleM50030u.getMiddle(), 6, null));
                    } else {
                        arrayList.add(new Label(null, 0.0f, 0.0f, false, labelScaleM50030u.getMin(), 7, null));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public final String m50016F(Date date) {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat("MM/dd", Locale.US).format(date);
    }

    /* JADX INFO: renamed from: I */
    public final String m50019I(String str) {
        return AssetsProfitLossAnalysisDepend.f40740a.m50062a().mo15359y() ? "" : str;
    }

    /* JADX INFO: renamed from: J */
    public final void m50020J(ProfitLossAnalysisApiResponse profitLossAnalysisApiResponse) {
        updateState(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetsProfitLossAnalysisContentVM.m49987K((ContentUIState) obj);
            }
        });
        m50021L(profitLossAnalysisApiResponse);
    }

    /* JADX INFO: renamed from: L */
    public final void m50021L(final ProfitLossAnalysisApiResponse profitLossAnalysisApiResponse) {
        updateState(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetsProfitLossAnalysisContentVM.m49988M(profitLossAnalysisApiResponse, this, (ContentUIState) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m50022N() {
        updateState(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetsProfitLossAnalysisContentVM.m49989O(this.f40735b, (ContentUIState) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m50023Q(String str) {
        sendIntent(new C21510x555bf7ec(str));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: R */
    public final Object m50024R(boolean z11, final String str, Continuation<? super Unit> continuation) {
        AssetsProfitLossAnalysisContentVM$requestGetPointByRange$1 assetsProfitLossAnalysisContentVM$requestGetPointByRange$1;
        BaseStateVM baseStateVM;
        String str2;
        C19334f c19334f;
        Object objM42846a;
        if (continuation instanceof AssetsProfitLossAnalysisContentVM$requestGetPointByRange$1) {
            assetsProfitLossAnalysisContentVM$requestGetPointByRange$1 = (AssetsProfitLossAnalysisContentVM$requestGetPointByRange$1) continuation;
            int i11 = assetsProfitLossAnalysisContentVM$requestGetPointByRange$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetsProfitLossAnalysisContentVM$requestGetPointByRange$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetsProfitLossAnalysisContentVM$requestGetPointByRange$1 = new AssetsProfitLossAnalysisContentVM$requestGetPointByRange$1(this, continuation);
            }
        } else {
            assetsProfitLossAnalysisContentVM$requestGetPointByRange$1 = new AssetsProfitLossAnalysisContentVM$requestGetPointByRange$1(this, continuation);
        }
        AssetsProfitLossAnalysisContentVM$requestGetPointByRange$1 assetsProfitLossAnalysisContentVM$requestGetPointByRange$2 = assetsProfitLossAnalysisContentVM$requestGetPointByRange$1;
        Object objStartLoadingViewWithCondition = assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objStartLoadingViewWithCondition);
            InterfaceC41634e interfaceC41634eM90897U = C41636g.m90897U(this.f40621X.m50061i(C27041f.m66669i(str, "LAST_1_DAY")), new AssetsProfitLossAnalysisContentVM$requestGetPointByRange$2(z11, this, null));
            assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.L$0 = str;
            assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.L$1 = this;
            assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.Z$0 = z11;
            assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.label = 1;
            objStartLoadingViewWithCondition = startLoadingViewWithCondition(interfaceC41634eM90897U, z11, assetsProfitLossAnalysisContentVM$requestGetPointByRange$2);
            if (objStartLoadingViewWithCondition != coroutine_suspended) {
                baseStateVM = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            z11 = assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.Z$0;
            BaseStateVM baseStateVM2 = (BaseStateVM) assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.L$1;
            String str3 = (String) assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.L$0;
            ResultKt.throwOnFailure(objStartLoadingViewWithCondition);
            baseStateVM = baseStateVM2;
            str = str3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.L$0;
            ResultKt.throwOnFailure(objStartLoadingViewWithCondition);
        }
        c19334f = (C19334f) objStartLoadingViewWithCondition;
        objM42846a = c19334f.m42846a();
        if (objM42846a != null) {
            m50020J((ProfitLossAnalysisApiResponse) objM42846a);
        }
        if (c19334f.getThrowable() != null) {
            updateState(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetsProfitLossAnalysisContentVM.m49993U((ContentUIState) obj);
                }
            });
        }
        C21535v.m50063a(str2);
        return Unit.INSTANCE;
        Function0 function0 = new Function0() { // from class: com.kubi.profit.loss.analysis.lib.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetsProfitLossAnalysisContentVM.m49992T(this.f40733b, str);
            }
        };
        assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.L$0 = str;
        assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.L$1 = null;
        assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.Z$0 = z11;
        assetsProfitLossAnalysisContentVM$requestGetPointByRange$2.label = 2;
        objStartLoadingViewWithCondition = BaseStateVM.requestNet$default(baseStateVM, (InterfaceC41634e) objStartLoadingViewWithCondition, false, function0, assetsProfitLossAnalysisContentVM$requestGetPointByRange$2, 1, null);
        if (objStartLoadingViewWithCondition != coroutine_suspended) {
            str2 = str;
            c19334f = (C19334f) objStartLoadingViewWithCondition;
            objM42846a = c19334f.m42846a();
            if (objM42846a != null) {
                m50020J((ProfitLossAnalysisApiResponse) objM42846a);
            }
            if (c19334f.getThrowable() != null) {
                updateState(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.m
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetsProfitLossAnalysisContentVM.m49993U((ContentUIState) obj);
                    }
                });
            }
            C21535v.m50063a(str2);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: V */
    public final void m50025V() {
        updateState(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetsProfitLossAnalysisContentVM.m49994W(this.f40736b, (ContentUIState) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final Date m50026X(long j11) throws Throwable {
        Object objM103844constructorimpl;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd", Locale.US);
        String str = simpleDateFormat.format(new Date(j11));
        boolean zM42528a = C19241c.f35620a.m42528a();
        boolean z11 = !zM42528a;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(simpleDateFormat.parse(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            C44128b.m97262f("crash_issue", "crash_issue->【mvi 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C43846g.m96568c(new ProfitException(thM103847exceptionOrNullimpl2, "AssetsProfitLossAnalysisFragmentContractVM", false, null, 8, null), null, 2, null);
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (Date) objM103844constructorimpl;
    }

    /* JADX INFO: renamed from: Y */
    public final List<DataPoint> m50027Y(List<ChartPoint> list) {
        ChartPoint chartPoint;
        BigDecimal total;
        ChartPoint chartPoint2;
        String str = null;
        Comparator comparatorM50009y = m50009y(this, false, 1, null);
        Comparator<IndexedValue<ChartPoint>> comparatorM50033x = m50033x(false);
        IndexedValue indexedValue = (IndexedValue) CollectionsKt.maxWithOrNull(CollectionsKt.withIndex(list), comparatorM50009y);
        IndexedValue indexedValue2 = (IndexedValue) CollectionsKt.minWithOrNull(CollectionsKt.withIndex(list), comparatorM50033x);
        Integer numValueOf = indexedValue != null ? Integer.valueOf(indexedValue.getIndex()) : null;
        Integer numValueOf2 = indexedValue2 != null ? Integer.valueOf(indexedValue2.getIndex()) : null;
        if (indexedValue != null && (chartPoint = (ChartPoint) indexedValue.getValue()) != null && (total = chartPoint.getTotal()) != null) {
            if (total.compareTo((indexedValue2 == null || (chartPoint2 = (ChartPoint) indexedValue2.getValue()) == null) ? null : chartPoint2.getTotal()) == 0) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ChartPoint chartPoint3 = (ChartPoint) obj;
                    BigDecimal total2 = chartPoint3.getTotal();
                    String strM66668h = C27041f.m66668h(total2 != null ? C21535v.m50066d(total2) : null);
                    BigDecimal total3 = chartPoint3.getTotal();
                    arrayList.add(new DataPoint(i11, total3 != null ? total3.doubleValue() : 0.0d, numValueOf != null && i11 == numValueOf.intValue(), numValueOf2 != null && i11 == numValueOf2.intValue(), (numValueOf != null && i11 == numValueOf.intValue()) || (numValueOf2 != null && i11 == numValueOf2.intValue()), false, false, false, false, 0.0f, m50019I(strM66668h), strM66668h, m50032w(C27039d.m66652l(chartPoint3.getTime())), m50019I(strM66668h), 0.0f, 0.0f, null, 0, chartPoint3.getTime(), null, 0, 0, 3916768, null));
                    i11 = i12;
                }
                return arrayList;
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i13 = 0;
        for (Object obj2 : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ChartPoint chartPoint4 = (ChartPoint) obj2;
            BigDecimal total4 = chartPoint4.getTotal();
            String strM66668h2 = C27041f.m66668h(total4 != null ? C21535v.m50066d(total4) : str);
            BigDecimal total5 = chartPoint4.getTotal();
            arrayList2.add(new DataPoint(i13, total5 != null ? total5.doubleValue() : 0.0d, numValueOf != null && i13 == numValueOf.intValue(), numValueOf2 != null && i13 == numValueOf2.intValue(), (numValueOf != null && i13 == numValueOf.intValue()) || (numValueOf2 != null && i13 == numValueOf2.intValue()), false, false, false, false, 0.0f, m50019I(strM66668h2), strM66668h2, m50032w(C27039d.m66652l(chartPoint4.getTime())), m50019I(strM66668h2), 0.0f, 0.0f, null, 0, chartPoint4.getTime(), null, 0, 0, 3916768, null));
            i13 = i14;
            str = null;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (m49991S(r7, false, r3, r4, 1, null) == r0) goto L24;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C214991 c214991;
        if (continuation instanceof C214991) {
            c214991 = (C214991) continuation;
            int i11 = c214991.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c214991.label = i11 - Integer.MIN_VALUE;
            } else {
                c214991 = new C214991(continuation);
            }
        } else {
            c214991 = new C214991(continuation);
        }
        C214991 c214992 = c214991;
        Object obj = c214992.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c214992.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c214992.L$0 = interfaceC19282d;
            c214992.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c214992) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            interfaceC19282d = (InterfaceC19282d) c214992.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        if (interfaceC19282d instanceof C21510x555bf7ec) {
            C21510x555bf7ec c21510x555bf7ec = (C21510x555bf7ec) interfaceC19282d;
            String range = c21510x555bf7ec.getRange();
            c214992.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c214992.L$1 = SpillingKt.nullOutSpilledVariable(this);
            c214992.L$2 = interfaceC19282d;
            c214992.L$3 = SpillingKt.nullOutSpilledVariable(c21510x555bf7ec);
            c214992.I$0 = 0;
            c214992.I$1 = 0;
            c214992.label = 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object handleInitIntent(@NotNull Continuation<? super Unit> continuation) {
        C215001 c215001;
        if (continuation instanceof C215001) {
            c215001 = (C215001) continuation;
            int i11 = c215001.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c215001.label = i11 - Integer.MIN_VALUE;
            } else {
                c215001 = new C215001(continuation);
            }
        } else {
            c215001 = new C215001(continuation);
        }
        Object obj = c215001.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c215001.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c215001.label = 1;
            if (super.handleInitIntent(c215001) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        m50023Q(AssetsProfitLossAnalysisDepend.f40740a.m50062a().mo15347m());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public final String m50031v(Date date) {
        if (date == null) {
            return null;
        }
        return new SimpleDateFormat("yyyy/MM/dd", Locale.US).format(date);
    }

    /* JADX INFO: renamed from: w */
    public final String m50032w(long j11) {
        String str = new SimpleDateFormat("MM/dd HH:mm", Locale.getDefault()).format(new Date(j11));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: x */
    public final Comparator<IndexedValue<ChartPoint>> m50033x(final boolean z11) {
        return new Comparator() { // from class: com.kubi.profit.loss.analysis.lib.r
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AssetsProfitLossAnalysisContentVM.m50010z(z11, (IndexedValue) obj, (IndexedValue) obj2);
            }
        };
    }

    public AssetsProfitLossAnalysisContentVM() {
        m50028s();
    }

    /* JADX INFO: renamed from: z */
    public static final int m50010z(boolean z11, IndexedValue indexedValue, IndexedValue indexedValue2) {
        int iCompareTo;
        BigDecimal total = ((ChartPoint) indexedValue.getValue()).getTotal();
        if (total != null) {
            iCompareTo = total.compareTo(((ChartPoint) indexedValue2.getValue()).getTotal());
        } else {
            iCompareTo = 0;
        }
        if (iCompareTo == 0) {
            if (z11) {
                return Intrinsics.compare(indexedValue.getIndex(), indexedValue2.getIndex());
            }
            return Intrinsics.compare(indexedValue2.getIndex(), indexedValue.getIndex());
        }
        return iCompareTo;
    }

    /* JADX INFO: renamed from: A */
    public final void m50011A(List<DataPoint> list) {
        List list2 = CollectionsKt.toList(list);
        if (list2.size() < 2) {
            return;
        }
        DataPoint dataPoint = (DataPoint) list2.get(0);
        if (dataPoint.getValue() < ((DataPoint) list2.get(1)).getValue()) {
            dataPoint.setTipGravity(TipGravity.BOTTOM);
        } else {
            dataPoint.setTipGravity(TipGravity.TOP);
        }
        int size = list2.size() - 1;
        int i11 = 1;
        while (i11 < size) {
            DataPoint dataPoint2 = (DataPoint) list2.get(i11 - 1);
            DataPoint dataPoint3 = (DataPoint) list2.get(i11);
            i11++;
            DataPoint dataPoint4 = (DataPoint) list2.get(i11);
            if (dataPoint3.getValue() > dataPoint2.getValue() && dataPoint3.getValue() > dataPoint4.getValue()) {
                dataPoint3.setTipGravity(TipGravity.TOP);
            }
            if (dataPoint3.getValue() < dataPoint2.getValue() && dataPoint3.getValue() < dataPoint4.getValue()) {
                dataPoint3.setTipGravity(TipGravity.BOTTOM);
            }
        }
        DataPoint dataPoint5 = (DataPoint) list2.get(list2.size() - 1);
        if (dataPoint5.getValue() > ((DataPoint) list2.get(list2.size() - 2)).getValue()) {
            dataPoint5.setTipGravity(TipGravity.TOP);
        } else {
            dataPoint5.setTipGravity(TipGravity.BOTTOM);
        }
    }

    /* JADX INFO: renamed from: H */
    public final RangeTime m50018H(ProfitLossAnalysisApiResponse profitLossAnalysisApiResponse) throws Throwable {
        Long time;
        Long time2;
        String strM50016F;
        String strM50016F2;
        ChartPoint chartPoint;
        ChartPoint chartPoint2;
        List<ChartPoint> trendList = profitLossAnalysisApiResponse.getTrendList();
        if (trendList != null && (chartPoint2 = (ChartPoint) CollectionsKt.firstOrNull((List) trendList)) != null) {
            time = chartPoint2.getTime();
        } else {
            time = null;
        }
        List<ChartPoint> trendList2 = profitLossAnalysisApiResponse.getTrendList();
        if (trendList2 != null && (chartPoint = (ChartPoint) CollectionsKt.lastOrNull((List) trendList2)) != null) {
            time2 = chartPoint.getTime();
        } else {
            time2 = null;
        }
        if (time == null || time2 == null) {
            return null;
        }
        Date dateM50026X = m50026X(time.longValue());
        Date dateM50026X2 = m50026X(time2.longValue());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateM50026X);
        int i11 = calendar.get(1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(dateM50026X2);
        if (i11 != calendar2.get(1)) {
            strM50016F = m50031v(dateM50026X);
            strM50016F2 = m50031v(dateM50026X2);
        } else {
            strM50016F = m50016F(dateM50026X);
            strM50016F2 = m50016F(dateM50026X2);
        }
        return new RangeTime(strM50016F, strM50016F2);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        AssetTotalNotifier.f17602a.m17045i(this.f40623Z);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        AssetTotalNotifier assetTotalNotifier = AssetTotalNotifier.f17602a;
        this.f40622Y = assetTotalNotifier.m17042f();
        assetTotalNotifier.m17044h(this.f40623Z);
    }

    /* JADX INFO: renamed from: s */
    public final void m50028s() {
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(this);
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "update_chart".length();
        }
        C12572a.m23693b(viewModelScope, new C21497x51385b00("update_chart", null, this));
        InterfaceC41709m0 viewModelScope2 = ViewModelKt.getViewModelScope(this);
        if (c12573b.m23696a()) {
            "hide_asset".length();
        }
        C12572a.m23693b(viewModelScope2, new C21498x51385b01("hide_asset", null, this));
    }

    /* JADX INFO: renamed from: u */
    public final LabelScale m50030u(double d11, double d12) {
        double dCeil;
        int iLog10 = ((int) Math.log10(d11)) - 1;
        double dFloor = 0.0d;
        if (d11 == 0.0d) {
            dCeil = 0.0d;
        } else {
            double d13 = iLog10;
            dCeil = Math.ceil(d11 / Math.pow(10.0d, d13)) * Math.pow(10.0d, d13);
        }
        int iLog11 = ((int) Math.log10(d12)) - 1;
        if (d12 != 0.0d) {
            double d14 = iLog11;
            dFloor = Math.floor(d12 / Math.pow(10.0d, d14)) * Math.pow(10.0d, d14);
        }
        double d15 = dFloor;
        return new LabelScale(d15, (dCeil + d15) / ((double) 2), dCeil);
    }

    /* JADX INFO: renamed from: B */
    public final String m50012B(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(BigDecimal.valueOf(1.0E-6d)) < 0) {
            String plainString = bigDecimal.setScale(2, RoundingMode.HALF_UP).toPlainString();
            Intrinsics.checkNotNull(plainString);
            return plainString;
        }
        if (bigDecimal.compareTo(BigDecimal.valueOf(0.1d)) < 0) {
            String plainString2 = C6447a.m11724a(bigDecimal.setScale(6, RoundingMode.HALF_UP)).toPlainString();
            Intrinsics.checkNotNull(plainString2);
            return plainString2;
        }
        if (bigDecimal.compareTo(BigDecimal.valueOf(1000L)) < 0) {
            String plainString3 = C6447a.m11724a(bigDecimal.setScale(1, RoundingMode.HALF_UP)).toPlainString();
            Intrinsics.checkNotNull(plainString3);
            return plainString3;
        }
        BigDecimal bigDecimalDivide = bigDecimal.divide(BigDecimal.valueOf(1000L));
        if (bigDecimalDivide.compareTo(BigDecimal.valueOf(1000L)) < 0) {
            return C6447a.m11724a(bigDecimalDivide.setScale(1, RoundingMode.HALF_UP)).toPlainString() + 'K';
        }
        BigDecimal bigDecimalDivide2 = bigDecimalDivide.divide(BigDecimal.valueOf(1000L));
        if (bigDecimalDivide2.compareTo(BigDecimal.valueOf(1000L)) < 0) {
            return C6447a.m11724a(bigDecimalDivide2.setScale(1, RoundingMode.HALF_UP)).toPlainString() + 'M';
        }
        return C6447a.m11724a(bigDecimalDivide2.divide(BigDecimal.valueOf(1000L)).setScale(1, RoundingMode.HALF_UP)).toPlainString() + 'B';
    }
}
