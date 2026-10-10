package p836zl;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.broker.BrokerConfig;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelTaskEntity;
import com.kubi.futures.data.platform.model.StrategyOrderConfigEntity;
import com.kubi.futures.dialog.PopData;
import com.kubi.futures.trade.welfare.distribution.PopupData;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.data.market.model.PreMarketKey;
import com.kubi.kumex.data.platform.model.DisplayedArticle;
import com.kubi.kumex.data.platform.model.RobotSiteConfigEntity;
import com.kubi.kumex.guide.OpenFuturesGuide;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.storage.StorageType;
import ir.C40167b;
import ir.InterfaceC40166a;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: zl.j */
/* JADX INFO: compiled from: StorageIdKey.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020#0\u00072\u0006\u0010J\u001a\u00020\u0005J+\u0010W\u001a\b\u0012\u0004\u0012\u0002HX0\u0007\"\u0004\b\u0000\u0010X*\b\u0012\u0004\u0012\u0002HX0\u00072\u0006\u0010Y\u001a\u00020\u0005H\u0000¢\u0006\u0002\bZJ\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\u00072\b\u0010]\u001a\u0004\u0018\u00010\u0005J\u0014\u0010^\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010_\u001a\u00020\u0005J\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\\0\u0007J\u0014\u0010a\u001a\b\u0012\u0004\u0012\u00020b0\u00072\u0006\u0010c\u001a\u00020\u0005J\u0006\u0010d\u001a\u00020eJ\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010Y\u001a\u00020\u0005J\u0014\u0010q\u001a\b\u0012\u0004\u0012\u00020#0\u00072\u0006\u0010r\u001a\u00020\u0005J\u0014\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010|\u001a\u00020\u0005J\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020#0\u0007J\r\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020#0\u0007J\r\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\nR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\nR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\nR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\nR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\nR!\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b-\u0010\nR\u0019\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000501¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R'\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b5\u0010\nR!\u00107\u001a\b\u0012\u0004\u0012\u00020#0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b8\u0010\nR\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020#01¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R!\u0010<\u001a\b\u0012\u0004\u0012\u00020#0\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b=\u0010\nR\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020#01¢\u0006\b\n\u0000\u001a\u0004\b@\u00103R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\nR\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\nR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\nR\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\nR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\nR\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\nR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\nR\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\nR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\nR\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\nR\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\bg\u0010\nR\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\bj\u0010\nR\u001d\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0\u001c0\u0007¢\u0006\b\n\u0000\u001a\u0004\bm\u0010\nR\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020o0\u0007¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\nR\u0017\u0010s\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\b\n\u0000\u001a\u0004\bt\u0010\nR\u0017\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\bv\u0010\nR\u0017\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\bx\u0010\nR\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\bz\u0010\nR\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\nR\u0018\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010\nR\u0019\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010\nR\u0019\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020#0\u0007¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010\n¨\u0006\u0088\u0001"}, m90084d2 = {"Lcom/kubi/kumex/data/StorageIdKeys;", "", "<init>", "()V", "CATEGORY", "", "contractVersion", "Lcom/kubi/utils/storage/StorageId;", "", "getContractVersion", "()Lcom/kubi/utils/storage/StorageId;", "userConfig", "getUserConfig", "contractWelfareNewestActivity", "Lcom/kubi/kumex/data/platform/model/DisplayedArticle;", "getContractWelfareNewestActivity", "announcementStartTime", "", "getAnnouncementStartTime", "topLeftDrawerTipsStartTime", "getTopLeftDrawerTipsStartTime", "contractDrawerNotice", "getContractDrawerNotice", "contractQuoteDrawerNotice", "getContractQuoteDrawerNotice", "welfareCouponsLatestRewardTime", "getWelfareCouponsLatestRewardTime", "gridTradingArea", "", "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "getGridTradingArea", "robotSiteConfigInfo", "Lcom/kubi/kumex/data/platform/model/RobotSiteConfigEntity;", "getRobotSiteConfigInfo", "showMarketOrderTwapRecommendDialog", "", "getShowMarketOrderTwapRecommendDialog", "strategyOrderConfig", "Lcom/kubi/futures/data/platform/model/StrategyOrderConfigEntity;", "getStrategyOrderConfig", "copyTradingGuideDialogDisplayTime", "getCopyTradingGuideDialogDisplayTime", "copyTradingGuideNotShowInSevenDays", "getCopyTradingGuideNotShowInSevenDays", "contractUserTaxRate", "getContractUserTaxRate", "contractUserTaxRate$delegate", "Lcom/kubi/network/api/utils/Link;", "contractUserTaxRateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getContractUserTaxRateFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "contractTradingArea", "getContractTradingArea", "contractTradingArea$delegate", "occupancyMode", "getOccupancyMode", "occupancyMode$delegate", "occupancyModeFlow", "getOccupancyModeFlow", "trialOccupancyMode", "getTrialOccupancyMode", "trialOccupancyMode$delegate", "trialOccupancyModeFlow", "getTrialOccupancyModeFlow", "contractOfflineDialog", "getContractOfflineDialog", "contractOfflineTips", "getContractOfflineTips", "positionMode", "getPositionMode", "trialPositionMode", "getTrialPositionMode", "featureAvailable", "featureType", "reversePosition", "getReversePosition", "chaseOrder", "getChaseOrder", "marketCloseAll", "getMarketCloseAll", "convert2perpTips", "getConvert2perpTips", "preMarketHintTips", "getPreMarketHintTips", "showPreMarketContentTips", "getShowPreMarketContentTips", "keyPrefixWith", ExifInterface.GPS_DIRECTION_TRUE, "symbol", "keyPrefixWith$KumexLib_googleRelease", "distributionBonusDialogKey", "Lcom/kubi/futures/trade/welfare/distribution/PopupData;", "trialCode", "airdropBonusDialogKey", "airdropCode", "openFuturesGuideKey", "operationResourceKey", "Lcom/kubi/futures/dialog/PopData;", "resourceId", "clearUserInfo", "", "bookType", "getBookType", "bookDepth", "europeLeverageTips", "getEuropeLeverageTips", "europeLeverageTasks", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelTaskEntity;", "getEuropeLeverageTasks", "fundingRateChangeTips", "Lcom/kubi/kumex/data/market/model/PreMarketKey;", "getFundingRateChangeTips", "couponBubble", "suffix", "bboTipsKey", "getBboTipsKey", "bboCheckType", "getBboCheckType", "positionSortType", "getPositionSortType", "positionSortOrderType", "getPositionSortOrderType", "bannerItem", "bannerId", "bannerNextFetchTime", "getBannerNextFetchTime", "riskWarningDialogShown", "getRiskWarningDialogShown", "qtyUnitOfCostRedPoint", "pnlAnalyzeRedPoint", "holdEarnNoticeDismissTime", "getHoldEarnNoticeDismissTime", "trialFundsClicked", "getTrialFundsClicked", "traderProChallengeClosedDay", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStorageIdKey.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageIdKey.kt\ncom/kubi/kumex/data/StorageIdKeys\n+ 2 StorageId.kt\ncom/kubi/utils/storage/StorageId\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,595:1\n46#2:596\n46#2:597\n46#2:598\n46#2:599\n46#2:600\n46#2:601\n46#2:602\n46#2:606\n32#3:603\n135#3,2:604\n*S KotlinDebug\n*F\n+ 1 StorageIdKey.kt\ncom/kubi/kumex/data/StorageIdKeys\n*L\n357#1:596\n370#1:597\n392#1:598\n404#1:599\n208#1:600\n222#1:601\n237#1:602\n-1#1:606\n-1#1:603\n-1#1:604,2\n*E\n"})
public final class C46894j {

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final StorageId<String> f104717A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public static final StorageId<Boolean> f104718B;

    /* JADX INFO: renamed from: C */
    @NotNull
    public static final StorageId<Boolean> f104719C;

    /* JADX INFO: renamed from: D */
    @NotNull
    public static final StorageId<Boolean> f104720D;

    /* JADX INFO: renamed from: E */
    @NotNull
    public static final StorageId<Boolean> f104721E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public static final StorageId<Boolean> f104722F;

    /* JADX INFO: renamed from: G */
    @NotNull
    public static final StorageId<Boolean> f104723G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public static final StorageId<String> f104724H;

    /* JADX INFO: renamed from: I */
    @NotNull
    public static final StorageId<String> f104725I;

    /* JADX INFO: renamed from: J */
    @NotNull
    public static final StorageId<List<EuropeUnlockLeverageLevelTaskEntity>> f104726J;

    /* JADX INFO: renamed from: K */
    @NotNull
    public static final StorageId<PreMarketKey> f104727K;

    /* JADX INFO: renamed from: L */
    @NotNull
    public static final StorageId<Boolean> f104728L;

    /* JADX INFO: renamed from: M */
    @NotNull
    public static final StorageId<String> f104729M;

    /* JADX INFO: renamed from: N */
    @NotNull
    public static final StorageId<String> f104730N;

    /* JADX INFO: renamed from: O */
    @NotNull
    public static final StorageId<String> f104731O;

    /* JADX INFO: renamed from: P */
    @NotNull
    public static final StorageId<Long> f104732P;

    /* JADX INFO: renamed from: Q */
    @NotNull
    public static final StorageId<Boolean> f104733Q;

    /* JADX INFO: renamed from: R */
    @NotNull
    public static final StorageId<Long> f104734R;

    /* JADX INFO: renamed from: S */
    @NotNull
    public static final StorageId<Boolean> f104735S;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C46894j f104736a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ KProperty<Object>[] f104737b = {Reflection.property1(new PropertyReference1Impl(C46894j.class, "contractUserTaxRate", "getContractUserTaxRate()Lcom/kubi/utils/storage/StorageId;", 0)), Reflection.property1(new PropertyReference1Impl(C46894j.class, "contractTradingArea", "getContractTradingArea()Lcom/kubi/utils/storage/StorageId;", 0)), Reflection.property1(new PropertyReference1Impl(C46894j.class, "occupancyMode", "getOccupancyMode()Lcom/kubi/utils/storage/StorageId;", 0)), Reflection.property1(new PropertyReference1Impl(C46894j.class, "trialOccupancyMode", "getTrialOccupancyMode()Lcom/kubi/utils/storage/StorageId;", 0))};

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<Integer> f104738c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<String> f104739d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<DisplayedArticle> f104740e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final StorageId<Long> f104741f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final StorageId<Long> f104742g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final StorageId<Long> f104743h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final StorageId<Long> f104744i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final StorageId<Long> f104745j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final StorageId<List<AvailableTradeAreaEntity>> f104746k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final StorageId<RobotSiteConfigEntity> f104747l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final StorageId<Boolean> f104748m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final StorageId<StrategyOrderConfigEntity> f104749n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final StorageId<Long> f104750o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final StorageId<Boolean> f104751p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final InterfaceC40166a f104752q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final InterfaceC41669n<String> f104753r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final InterfaceC40166a f104754s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final InterfaceC40166a f104755t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final InterfaceC41669n<Boolean> f104756u;

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final InterfaceC40166a f104757v;

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final InterfaceC41669n<Boolean> f104758w;

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final StorageId<Boolean> f104759x;

    /* JADX INFO: renamed from: y */
    @NotNull
    public static final StorageId<Boolean> f104760y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public static final StorageId<String> f104761z;

    static {
        C46894j c46894j = new C46894j();
        f104736a = c46894j;
        StorageType storageType = StorageType.LocalSite;
        f104738c = new StorageId<>("BKuMex", "contract_version", storageType, false);
        f104739d = new StorageId<>("BKuMex", "user_config", storageType, false);
        f104740e = new StorageId<>("BKuMex", "contract_welfare_activity_newest", storageType, false);
        f104741f = new StorageId<>("BKuMex", "kumex_upgrade_notice_start", storageType, false);
        f104742g = new StorageId<>("BKuMex", "trade_notice", storageType, false);
        f104743h = new StorageId<>("BKuMex", "contract_drawer_notice", storageType, false);
        f104744i = new StorageId<>("BKuMex", "contract_list_notice", storageType, false);
        f104745j = new StorageId<>("BKuMex", "welfare_coupons_latestrewardtime", storageType, false);
        f104746k = new StorageId<>("BKuMex", "grid_trading_area", storageType, false);
        f104747l = new StorageId<>("BKuMex", "robot_site_config_info", storageType, false);
        StorageType storageType2 = StorageType.Shared;
        f104748m = new StorageId<>("BKuMex", "showMarketOrderTwapRecommendDialog", storageType2, false);
        f104749n = new StorageId<>("BKuMex", "strategy_order_config", storageType2, false);
        f104750o = new StorageId<>("BKuMex", "copy_trading_guide_display_time", storageType, false);
        f104751p = new StorageId<>("BKuMex", "copy_trading_guide_not_show_in_seven_days", storageType, false);
        f104752q = C40167b.m88525a(new Function0() { // from class: zl.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46894j.m103235j();
            }
        });
        f104753r = C41679x.m91009a(C46392a.m102326h(c46894j.m103285x(), ""));
        f104754s = C40167b.m88525a(new Function0() { // from class: zl.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46894j.m103234i();
            }
        });
        f104755t = C40167b.m88525a(new Function0() { // from class: zl.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46894j.m103230b0();
            }
        });
        f104756u = C41679x.m91009a(Boolean.valueOf(C46392a.m102322d(c46894j.m103244I(), false)));
        f104757v = C40167b.m88525a(new Function0() { // from class: zl.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C46894j.m103233h0();
            }
        });
        f104758w = C41679x.m91009a(Boolean.valueOf(C46392a.m102322d(c46894j.m103257V(), false)));
        f104759x = new StorageId<>("BKuMex", "trade_dialog_show_tips_key", storageType, false);
        f104760y = new StorageId<>("BKuMex", "trade_bottom_show_tips_key", storageType, false);
        f104761z = new StorageId<>("BKuMex", "position_mode", storageType, false);
        f104717A = new StorageId<>("BKuMex", "trial_position_mode", storageType, false);
        f104718B = new StorageId<>("BKuMex", "reversePosition", storageType2, false);
        f104719C = new StorageId<>("BKuMex", "chaseOrder", storageType2, false);
        f104720D = new StorageId<>("BKuMex", "market_close_all", storageType2, false);
        f104721E = new StorageId<>("BKuMex", "convert2perpTips", storageType, false);
        f104722F = new StorageId<>("BKuMex", "preMarketHintTips", storageType, false);
        f104723G = new StorageId<>("BKuMex", "showPreMarketContentTips", storageType, false);
        f104724H = new StorageId<>("BKuMex", "kumex_book_type", storageType2, true);
        StorageId storageId = new StorageId("BKuMex", "europe_unlock_leverage_tips", storageType, true);
        f104725I = new StorageId<>(storageId.getCategory(), KuMexDepend.f30378a.m35905g().d() + storageId.getKey(), storageId.getStorageType(), storageId.getSupportLegacy());
        f104726J = new StorageId<>("BKuMex", "europe_unlock_leverage_tasks", storageType, false);
        f104727K = new StorageId<>("BKuMex", "fundingRateChangeTips", storageType, false);
        f104728L = new StorageId<>("BKuMex", "kumexbboTipsKey", storageType, false);
        f104729M = new StorageId<>("BKuMex", "bboCheckType", storageType2, false);
        f104730N = new StorageId<>("BKuMex", "positionSortType", storageType2, false);
        f104731O = new StorageId<>("BKuMex", "positionSortOrderType", storageType2, false);
        f104732P = new StorageId<>("BKuMex", "bannerNextFetchTime", storageType, false);
        f104733Q = new StorageId<>("BKuMex", "risk_warning_dialog_shown", storageType, false);
        f104734R = new StorageId<>("BKuMex", "hold_earn_notice_dismiss_time", storageType, false);
        f104735S = new StorageId<>("BKuMex", "trialFundsClicked", storageType2, false);
    }

    /* JADX INFO: renamed from: b0 */
    public static final StorageId m103230b0() {
        StorageId storageId = new StorageId("BKuMex", "contract_gray_occupancyMode", StorageType.LocalSite, false);
        return new StorageId(storageId.getCategory(), storageId.getKey() + '_' + BrokerConfig.f19211a.m20201d().mo4515x() + '_' + UserInfo.a.h(), storageId.getStorageType(), storageId.getSupportLegacy());
    }

    /* JADX INFO: renamed from: h0 */
    public static final StorageId m103233h0() {
        StorageId storageId = new StorageId("BKuMex", "trial_contract_gray_occupancyMode", StorageType.LocalSite, false);
        return new StorageId(storageId.getCategory(), storageId.getKey() + '_' + BrokerConfig.f19211a.m20201d().mo4515x() + '_' + UserInfo.a.h(), storageId.getStorageType(), storageId.getSupportLegacy());
    }

    /* JADX INFO: renamed from: i */
    public static final StorageId m103234i() {
        StorageId storageId = new StorageId("BKuMex", "bkumex_trading_area_plus", StorageType.LocalSite, false);
        return new StorageId(storageId.getCategory(), storageId.getKey() + '_' + BrokerConfig.f19211a.m20201d().mo4515x(), storageId.getStorageType(), storageId.getSupportLegacy());
    }

    /* JADX INFO: renamed from: j */
    public static final StorageId m103235j() {
        return new StorageId("BKuMex", "contract_user_tax_rate", StorageType.LocalSite, false).m102384f(KuMexDepend.f30378a.m35905g().d());
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final StorageId<Boolean> m103236A() {
        return f104721E;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final StorageId<Long> m103237B() {
        return f104750o;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final StorageId<Boolean> m103238C() {
        return f104751p;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final StorageId<List<EuropeUnlockLeverageLevelTaskEntity>> m103239D() {
        return f104726J;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final StorageId<String> m103240E() {
        return f104725I;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final StorageId<PreMarketKey> m103241F() {
        return f104727K;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final StorageId<List<AvailableTradeAreaEntity>> m103242G() {
        return f104746k;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final StorageId<Boolean> m103243H() {
        return f104720D;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final StorageId<Boolean> m103244I() {
        return (StorageId) f104755t.getValue(this, f104737b[2]);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final InterfaceC41669n<Boolean> m103245J() {
        return f104756u;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final StorageId<String> m103246K() {
        return f104761z;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final StorageId<String> m103247L() {
        return f104731O;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final StorageId<String> m103248M() {
        return f104730N;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final StorageId<Boolean> m103249N() {
        return f104722F;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final StorageId<Boolean> m103250O() {
        return f104718B;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final StorageId<Boolean> m103251P() {
        return f104733Q;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final StorageId<RobotSiteConfigEntity> m103252Q() {
        return f104747l;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final StorageId<Boolean> m103253R() {
        return f104748m;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final StorageId<Boolean> m103254S() {
        return f104723G;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final StorageId<StrategyOrderConfigEntity> m103255T() {
        return f104749n;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final StorageId<Boolean> m103256U() {
        return f104735S;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final StorageId<Boolean> m103257V() {
        return (StorageId) f104757v.getValue(this, f104737b[3]);
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final InterfaceC41669n<Boolean> m103258W() {
        return f104758w;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final StorageId<String> m103259X() {
        return f104717A;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final StorageId<String> m103260Y() {
        return f104739d;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final StorageId<Long> m103261Z() {
        return f104745j;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final <T> StorageId<T> m103262a0(@NotNull StorageId<T> storageId, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(storageId, "<this>");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new StorageId<>(storageId.getCategory(), symbol + '_' + storageId.getKey(), storageId.getStorageType(), storageId.getSupportLegacy());
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final StorageId<PopupData> m103263c0() {
        StorageId storageId = new StorageId("BKuMex", OpenFuturesGuide.f29111e.getKey(), StorageType.Shared, true);
        return new StorageId<>(storageId.getCategory(), KuMexDepend.f30378a.m35905g().d() + storageId.getKey(), storageId.getStorageType(), storageId.getSupportLegacy());
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final StorageId<PopData> m103264d0(@NotNull String resourceId) {
        Intrinsics.checkNotNullParameter(resourceId, "resourceId");
        StorageId storageId = new StorageId("BKuMex", "operation_resource_key", StorageType.Shared, true);
        return new StorageId<>(storageId.getCategory(), storageId.getKey() + resourceId + UserInfo.a.i(), storageId.getStorageType(), storageId.getSupportLegacy());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageId<Integer> m103265e(@NotNull String airdropCode) {
        Intrinsics.checkNotNullParameter(airdropCode, "airdropCode");
        return new StorageId<>("BKuMex", "AirDropBonusDialog_" + airdropCode, StorageType.Shared, true);
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final StorageId<Boolean> m103266e0() {
        return new StorageId<>("BKuMex", "pnlAnalyzeRedPoint", StorageType.Shared, false);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<Long> m103267f(@NotNull String bannerId) {
        Intrinsics.checkNotNullParameter(bannerId, "bannerId");
        return new StorageId<>("BKuMex", "bannerItem" + bannerId, StorageType.LocalSite, false);
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final StorageId<Boolean> m103268f0() {
        return new StorageId<>("BKuMex", "qtyUnitOfCostRedPoint", StorageType.Shared, false);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<Integer> m103269g(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new StorageId<>("BKuMex", "kumex_book_depth_" + symbol, StorageType.Shared, true);
    }

    @NotNull
    /* JADX INFO: renamed from: g0 */
    public final StorageId<Long> m103270g0() {
        return new StorageId<>("BKuMex", "traderProChallengeClosedDay", StorageType.Shared, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m103271h() {
        InterfaceC41669n<Boolean> interfaceC41669n = f104756u;
        Boolean bool = Boolean.FALSE;
        interfaceC41669n.setValue(bool);
        f104758w.setValue(bool);
        f104753r.setValue("0");
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final StorageId<Boolean> m103272k(@NotNull String suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return new StorageId<>("BKuMex", "couponBubble" + suffix, StorageType.LocalSite, false);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final StorageId<PopupData> m103273l(@Nullable String str) {
        StorageId storageId = new StorageId("BKuMex", "DistributionBonusMainDialog", StorageType.Shared, true);
        return new StorageId<>(storageId.getCategory(), str + storageId.getKey(), storageId.getStorageType(), storageId.getSupportLegacy());
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final StorageId<Boolean> m103274m(@NotNull String featureType) {
        Intrinsics.checkNotNullParameter(featureType, "featureType");
        return m103262a0(new StorageId("BKuMex", "feature_available", StorageType.LocalSite, false), featureType);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final StorageId<Long> m103275n() {
        return f104741f;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final StorageId<Long> m103276o() {
        return f104732P;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final StorageId<String> m103277p() {
        return f104729M;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final StorageId<Boolean> m103278q() {
        return f104728L;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final StorageId<String> m103279r() {
        return f104724H;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final StorageId<Boolean> m103280s() {
        return f104719C;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final StorageId<Long> m103281t() {
        return f104743h;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final StorageId<Boolean> m103282u() {
        return f104759x;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final StorageId<Boolean> m103283v() {
        return f104760y;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final StorageId<List<AvailableTradeAreaEntity>> m103284w() {
        return (StorageId) f104754s.getValue(this, f104737b[1]);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final StorageId<String> m103285x() {
        return (StorageId) f104752q.getValue(this, f104737b[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final InterfaceC41669n<String> m103286y() {
        return f104753r;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final StorageId<Integer> m103287z() {
        return f104738c;
    }
}
