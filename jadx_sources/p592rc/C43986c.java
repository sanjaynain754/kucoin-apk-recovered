package p592rc;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.CopytdApi;
import com.kubi.copytrading.ICopyTradingFuturesDelegate;
import com.kubi.copytrading.ICopyTradingService;
import com.kubi.copytrading.LeadTradingGuideHelper;
import com.kubi.copytrading.R$string;
import com.kubi.copytrading.assets.AssetCopyTradingMainFragment;
import com.kubi.copytrading.assets.center.LeadTradingCenterFragment;
import com.kubi.copytrading.entity.LeadUserEntity;
import com.kubi.copytrading.futures.CopyTradingDelegate;
import com.kubi.copytrading.futures.FutureCopyTradingConfig;
import com.kubi.copytrading.quote.CopyTradeQuoteRnFragment;
import com.kubi.copytrading.widgets.C11576e;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.C27017c;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p495oc.CopyTradingUiState;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rc.c */
/* JADX INFO: compiled from: CopyTradingService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0012\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u001c\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020\tH\u0016J\u001e\u0010,\u001a\u0004\u0018\u00010-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0)H\u0016J\u0016\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u000204H\u0016R#\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u00065"}, m90084d2 = {"Lcom/kubi/copytrading/service/CopyTradingService;", "Lcom/kubi/copytrading/ICopyTradingService;", "<init>", "()V", "isSupportCopyTrading", "", "getCopyTradingFragment", "Lcom/kubi/sdk/BaseFragment;", "uiStateValue", "", "entrySource", "getKlineCopyTradingRecommendFragment", "removeCopyTradingFragment", "", "copyTradingFragment", "Landroidx/fragment/app/Fragment;", "jump2CopyTradingSearch", "notifyCopyTradingMsg2Rn", "bundle", "Landroid/os/Bundle;", "getFuturesCopyTradingDelegateImp", "Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;", "futuresFragment", "getCopyTradingAssetsMainFragment", "forceSetInterceptFlag", "subUid", "isForceSetInterceptFlag", "isCopytdAccount", "getLeaderUserConfigId", "isCopytdNeedShowLeaderTips", "copyTradingAccountStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/copytrading/data/CopyTradingUiState;", "cpApi", "Lcom/kubi/copytrading/CopytdApi;", "kotlin.jvm.PlatformType", "getCpApi", "()Lcom/kubi/copytrading/CopytdApi;", "cpApi$delegate", "Lkotlin/Lazy;", "fetchSymbolConfig1", "", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "time", "submitSymbolConfig", "", "request", "addFuturesBottomTab", "Lkotlin/Pair;", "checkNeedShowLeaderGuide", "fragment", "getWidgetOfCopyTrading", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43986c implements ICopyTradingService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f97220b = LazyKt.lazy(new Function0() { // from class: rc.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C43986c.m96943u();
        }
    });

    @Override // com.kubi.copytrading.ICopyTradingService
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo20620a(@NotNull Map<String, String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return m96944v().m20824a(request);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @Nullable
    /* JADX INFO: renamed from: c */
    public BaseFragment mo20622c() {
        return IReactNativeService.INSTANCE.get().getRnRootFragment(BundleKt.bundleOf(new Pair(Constants.BIZ, "follow"), new Pair("entry", "main"), new Pair(Constants.COMPONENT, "krn_follow_trade"), new Pair("route", "FeaturedTodayList")));
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: d */
    public boolean mo20623d() {
        return Router.f46192a.m56184f("krn/router?biz=follow&entry=main&component=krn_follow_trade&route=SearchMain").m4048k();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: e */
    public boolean mo20624e() {
        return FutureCopyTradingConfig.f19902a.m20875j().getValue().getIsNeedShowLeaderTips();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: f */
    public boolean mo20625f() {
        return FutureCopyTradingConfig.f19902a.m20877l().getValue() != null;
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: g */
    public void mo20626g(@Nullable Bundle bundle) {
        String string;
        if (!C24129b.m58030b(SiteVisibleConfigKey.CopyTrading) || bundle == null || (string = bundle.getString("uiStateValue")) == null) {
            return;
        }
        IReactNativeService.nativeNotifyRn$default(IReactNativeService.INSTANCE.get(), string, null, 2, null);
        bundle.remove("uiStateValue");
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: h */
    public ICopyTradingFuturesDelegate mo20627h(@NotNull BaseFragment futuresFragment) {
        Intrinsics.checkNotNullParameter(futuresFragment, "futuresFragment");
        return new CopyTradingDelegate(futuresFragment);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @Nullable
    /* JADX INFO: renamed from: i */
    public String mo20628i() {
        LeadUserEntity leadUserEntityM20602s = CopyTradingConfig.f19710a.m20602s();
        if (leadUserEntityM20602s != null) {
            return leadUserEntityM20602s.getConfigId();
        }
        return null;
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: k */
    public BaseFragment mo20630k(@Nullable String str, @NotNull String entrySource) {
        Intrinsics.checkNotNullParameter(entrySource, "entrySource");
        CopyTradeQuoteRnFragment.Companion companion = CopyTradeQuoteRnFragment.f19944X;
        Pair pair = new Pair(Constants.BIZ, "follow");
        Pair pair2 = new Pair("entry", "main");
        Pair pair3 = new Pair(Constants.COMPONENT, "krn_follow_trade");
        Pair pair4 = new Pair("isLeader", String.valueOf(CopyTradingConfig.f19710a.m20602s() != null));
        String strEncode = "CopyTradeMain";
        if (!TextUtils.isEmpty(str)) {
            strEncode = Uri.encode("CopyTradeMain?uiStateValue=" + str);
        }
        return companion.instance(BundleKt.bundleOf(pair, pair2, pair3, pair4, new Pair("route", strEncode), new Pair("ignoreHandleBackPressed", Boolean.TRUE), new Pair("entrySource", entrySource)));
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @Nullable
    /* JADX INFO: renamed from: l */
    public Pair<String, BaseFragment> mo20631l() {
        return new Pair<>(C27017c.f54310a.m66516f(R$string.cprd_lead_center, new Object[0]), new LeadTradingCenterFragment());
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: m */
    public InterfaceC41634e<CopyTradingUiState> mo20632m() {
        return FutureCopyTradingConfig.f19902a.m20875j();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: n */
    public BaseFragment mo20633n() {
        return AssetCopyTradingMainFragment.f19802Y.newInstance();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: o */
    public boolean mo20634o() {
        return CopyTradingConfig.f19710a.m20609z();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: p */
    public boolean mo20635p() {
        return !FutureCopyTradingConfig.f19902a.m20875j().getValue().getIsMasterAccount();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: q */
    public void mo20636q(@Nullable String str) {
        FutureCopyTradingConfig.f19902a.m20873h(str);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: r */
    public void mo20637r(@NotNull Fragment copyTradingFragment) {
        Intrinsics.checkNotNullParameter(copyTradingFragment, "copyTradingFragment");
        if (CopyTradingConfig.f19710a.m20604u()) {
            CopyTradeQuoteRnFragment copyTradeQuoteRnFragment = copyTradingFragment instanceof CopyTradeQuoteRnFragment ? (CopyTradeQuoteRnFragment) copyTradingFragment : null;
            if (copyTradeQuoteRnFragment != null) {
                copyTradeQuoteRnFragment.m20911q3();
            }
        }
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: s */
    public void mo20638s(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        LeadTradingGuideHelper.f19949a.m20930j(fragment);
    }

    /* JADX INFO: renamed from: v */
    public final CopytdApi m96944v() {
        return (CopytdApi) this.f97220b.getValue();
    }

    /* JADX INFO: renamed from: u */
    public static final CopytdApi m96943u() {
        return (CopytdApi) C42597a.m93391g().create(CopytdApi.class);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: b */
    public Map<String, SymbolConfig> mo20621b(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return m96944v().m20825b(time);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: j */
    public ClassMappingV2 mo20629j() {
        return C11576e.m20990a();
    }
}
