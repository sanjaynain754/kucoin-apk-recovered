package com.kubi.assets.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.entity.BlackGroupResponse;
import com.kubi.assets.entity.HoldEarnInfoEntity;
import com.kubi.assets.entity.HomeAssetInfo;
import com.kubi.data.coin.AccountType;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import y70.StorageId;

/* JADX INFO: compiled from: IAssetsCenterService.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 V2\u00020\u0001:\u0001VJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\n\u0010\r\u001a\u0004\u0018\u00010\tH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H&J\b\u0010\u0015\u001a\u00020\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0005H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\tH&J\b\u0010\u001a\u001a\u00020\tH&J\b\u0010\u001b\u001a\u00020\tH&J\b\u0010\u001c\u001a\u00020\u001dH&J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001dH&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0#H&J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H&J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\tH&J\u001a\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010'2\u0006\u0010-\u001a\u00020.H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020 H&J2\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020 2\b\b\u0002\u00101\u001a\u00020\u001d2\b\u00102\u001a\u0004\u0018\u00010\t2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000304H&JJ\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\u0003042\n\b\u0002\u00109\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\tH&J\u001a\u0010;\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010'2\u0006\u0010<\u001a\u00020=H&J\b\u0010>\u001a\u00020\u0003H&J\b\u0010?\u001a\u00020@H&J\u001a\u0010A\u001a\u00020@2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010CH¦@¢\u0006\u0002\u0010DJ\u001c\u0010E\u001a\u00020\u00032\u0006\u00100\u001a\u00020 2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\tH&J\b\u0010G\u001a\u00020\u0003H&J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001d0#H&J\u0012\u0010I\u001a\u00020\u00052\b\u0010J\u001a\u0004\u0018\u00010KH&J$\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070M2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010<\u001a\u00020=H¦@¢\u0006\u0002\u0010NJ\b\u0010O\u001a\u00020\u0003H&J\b\u0010P\u001a\u00020\tH&J\b\u0010Q\u001a\u00020\u001dH&J\u0010\u0010R\u001a\u0004\u0018\u00010SH¦@¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020\u001dH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006WÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/api/IAssetsCenterService;", "", "jumpToAssetV2SettingPage", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "getTotalBalance", "Ljava/math/BigDecimal;", "balanceCurrency", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSpotAvailableBalance", "availableBalance", "getSmallCoinBaseCurrency", "getSmallCoinQuotaLimit", "startCoinDetailDispatcher", FirebaseAnalytics.Param.CURRENCY, "checkWithdrawLimit", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/assets/entity/BlackGroupResponse;", "createAssetFragment", "refreshAssetFragment", "assetFragment", "initAssetData", "getEarnUrl", "getEarnDetailUrl", "getEarnLockupUrl", "getEyeState", "", "showDepositGuideDialog", "fm", "Landroidx/fragment/app/FragmentManager;", "force", "hideNumberKey", "Lcom/kubi/utils/storage/StorageId;", "createAccountInfoView", "Lcom/kubi/assets/IAssetAccountView;", "requireContext", "Landroid/content/Context;", "getAssetsPrecision", "", "valuableCurrency", "goRecordDetail", "context", "accountDetailEntity", "Landroid/os/Parcelable;", "getAvgPriceDialog", "fragmentManager", "modifyEnable", "avgCostPriceTime", "onModify", "Lkotlin/Function0;", "showEditTradeAvgCostBottomSheet", "host", "currentCost", "onSuccess", "trackPageId", "trackBlock", "jumpToSmallCoinExchangeKcsPage", "type", "Lcom/kubi/data/coin/AccountType;", "refreshAssetsPageTabs", "getCachedAssetInfo", "Lcom/kubi/assets/entity/HomeAssetInfo;", "getAssetInfo", "cacheTime", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showPnlDialog", SessionDescription.ATTR_RANGE, "jumpToPnlAnalysis", "assetShowDigitModeStorageId", "getFuturesFundsRecordFragment", "arguments", "Landroid/os/Bundle;", "fetchAccountTotalBalance", "Lkotlinx/coroutines/flow/Flow;", "(Ljava/lang/String;Lcom/kubi/data/coin/AccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openWithdrawSetting", "getLineChartRange", "turkeyOpenFeature", "getHoldEarnInfo", "Lcom/kubi/assets/entity/HoldEarnInfoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEditAvgCostPriceEnable", "Companion", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IAssetsCenterService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f16464a = Companion.f16465a;

    /* JADX INFO: compiled from: IAssetsCenterService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/api/IAssetsCenterService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/assets/api/IAssetsCenterService;", "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f16465a = new Companion();

        @NotNull
        public final IAssetsCenterService get() {
            return (IAssetsCenterService) Router.f46192a.m56192n(IAssetsCenterService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    BaseFragment mo15331A();

    @NotNull
    /* JADX INFO: renamed from: B */
    StorageId<Boolean> mo15332B();

    /* JADX INFO: renamed from: C */
    void mo15333C(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: D */
    boolean mo15334D();

    /* JADX INFO: renamed from: E */
    boolean mo15335E();

    @Nullable
    /* JADX INFO: renamed from: a */
    BigDecimal mo15336a();

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo15337b(@Nullable Long l11, @NotNull Continuation<? super HomeAssetInfo> continuation);

    /* JADX INFO: renamed from: c */
    void mo15338c(@Nullable Context context, @NotNull Parcelable parcelable);

    @Nullable
    /* JADX INFO: renamed from: d */
    String mo15339d();

    /* JADX INFO: renamed from: e */
    void mo15340e(@NotNull FragmentManager fragmentManager, boolean z11, @Nullable String str, @NotNull Function0<Unit> function0);

    /* JADX INFO: renamed from: f */
    void mo15341f(@NotNull FragmentManager fragmentManager, boolean z11);

    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<BlackGroupResponse>> mo15342g();

    @NotNull
    /* JADX INFO: renamed from: h */
    BaseFragment mo15343h(@Nullable Bundle bundle);

    /* JADX INFO: renamed from: j */
    void mo15344j(@NotNull BaseFragment baseFragment);

    /* JADX INFO: renamed from: k */
    void mo15345k();

    /* JADX INFO: renamed from: l */
    void mo15346l();

    @NotNull
    /* JADX INFO: renamed from: m */
    String mo15347m();

    /* JADX INFO: renamed from: n */
    void mo15348n(@Nullable Context context, @NotNull AccountType accountType);

    /* JADX INFO: renamed from: o */
    int mo15349o(@Nullable String str);

    @Nullable
    /* JADX INFO: renamed from: p */
    Object mo15350p(@NotNull String str, @NotNull Continuation<? super BigDecimal> continuation);

    /* JADX INFO: renamed from: q */
    void mo15351q();

    /* JADX INFO: renamed from: r */
    void mo15352r(@NotNull BaseFragment baseFragment, @NotNull String str, @Nullable String str2, @NotNull Function0<Unit> function0, @Nullable String str3, @Nullable String str4);

    @Nullable
    /* JADX INFO: renamed from: s */
    Object mo15353s(@NotNull Continuation<? super HoldEarnInfoEntity> continuation);

    @NotNull
    /* JADX INFO: renamed from: t */
    StorageId<Boolean> mo15354t();

    /* JADX INFO: renamed from: u */
    void mo15355u();

    /* JADX INFO: renamed from: v */
    void mo15356v(@NotNull FragmentManager fragmentManager, @Nullable String str);

    @NotNull
    /* JADX INFO: renamed from: w */
    HomeAssetInfo mo15357w();

    @NotNull
    /* JADX INFO: renamed from: x */
    String mo15358x();

    /* JADX INFO: renamed from: y */
    boolean mo15359y();

    @NotNull
    /* JADX INFO: renamed from: z */
    IAssetAccountView mo15360z(@NotNull Context context);

    /* JADX INFO: renamed from: i */
    static /* synthetic */ void m15330i(IAssetsCenterService iAssetsCenterService, FragmentManager fragmentManager, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPnlDialog");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        iAssetsCenterService.mo15356v(fragmentManager, str);
    }
}
