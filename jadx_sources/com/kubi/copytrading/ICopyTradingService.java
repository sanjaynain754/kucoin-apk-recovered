package com.kubi.copytrading;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p495oc.CopyTradingUiState;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Pair;

/* JADX INFO: compiled from: ICopyTradingService.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 +2\u00020\u0001:\u0001+J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0005H&J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u001b\u001a\u00020\u0003H&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH&J\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020\u0007H&J\u001e\u0010#\u001a\u0004\u0018\u00010\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070 H&J\u0016\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010&H&J\b\u0010'\u001a\u00020(H&J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/copytrading/ICopyTradingService;", "", "isSupportCopyTrading", "", "getCopyTradingFragment", "Lcom/kubi/sdk/BaseFragment;", "uiStateValue", "", "entrySource", "getKlineCopyTradingRecommendFragment", "removeCopyTradingFragment", "", "copyTradingFragment", "Landroidx/fragment/app/Fragment;", "jump2CopyTradingSearch", "notifyCopyTradingMsg2Rn", "bundle", "Landroid/os/Bundle;", "getFuturesCopyTradingDelegateImp", "Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;", "futuresFragment", "getCopyTradingAssetsMainFragment", "forceSetInterceptFlag", "subUid", "isForceSetInterceptFlag", "isCopytdAccount", "getLeaderUserConfigId", "isCopytdNeedShowLeaderTips", "copyTradingAccountStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/copytrading/data/CopyTradingUiState;", "fetchSymbolConfig1", "", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "time", "submitSymbolConfig", "request", "addFuturesBottomTab", "Lkotlin/Pair;", "getWidgetOfCopyTrading", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "checkNeedShowLeaderGuide", "fragment", "Companion", "CopyTradingApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ICopyTradingService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f19723a = Companion.f19724a;

    /* JADX INFO: compiled from: ICopyTradingService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/copytrading/ICopyTradingService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/copytrading/ICopyTradingService;", "CopyTradingApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f19724a = new Companion();

        @NotNull
        public final ICopyTradingService get() {
            return (ICopyTradingService) Router.f46192a.m56192n(ICopyTradingService.class);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo20620a(@NotNull Map<String, String> map);

    @NotNull
    /* JADX INFO: renamed from: b */
    Map<String, SymbolConfig> mo20621b(@NotNull String str);

    @Nullable
    /* JADX INFO: renamed from: c */
    BaseFragment mo20622c();

    /* JADX INFO: renamed from: d */
    boolean mo20623d();

    /* JADX INFO: renamed from: e */
    boolean mo20624e();

    /* JADX INFO: renamed from: f */
    boolean mo20625f();

    /* JADX INFO: renamed from: g */
    void mo20626g(@Nullable Bundle bundle);

    @NotNull
    /* JADX INFO: renamed from: h */
    ICopyTradingFuturesDelegate mo20627h(@NotNull BaseFragment baseFragment);

    @Nullable
    /* JADX INFO: renamed from: i */
    String mo20628i();

    @NotNull
    /* JADX INFO: renamed from: j */
    ClassMappingV2 mo20629j();

    @NotNull
    /* JADX INFO: renamed from: k */
    BaseFragment mo20630k(@Nullable String str, @NotNull String str2);

    @Nullable
    /* JADX INFO: renamed from: l */
    Pair<String, BaseFragment> mo20631l();

    @NotNull
    /* JADX INFO: renamed from: m */
    InterfaceC41634e<CopyTradingUiState> mo20632m();

    @NotNull
    /* JADX INFO: renamed from: n */
    BaseFragment mo20633n();

    /* JADX INFO: renamed from: o */
    boolean mo20634o();

    /* JADX INFO: renamed from: p */
    boolean mo20635p();

    /* JADX INFO: renamed from: q */
    void mo20636q(@Nullable String str);

    /* JADX INFO: renamed from: r */
    void mo20637r(@NotNull Fragment fragment);

    /* JADX INFO: renamed from: s */
    void mo20638s(@NotNull BaseFragment baseFragment);
}
