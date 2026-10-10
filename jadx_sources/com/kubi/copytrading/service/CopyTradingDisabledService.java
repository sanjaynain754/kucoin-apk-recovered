package com.kubi.copytrading.service;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kubi.config.exception.KCConfigException;
import com.kubi.copytrading.ICopyTradingFuturesDelegate;
import com.kubi.copytrading.ICopyTradingService;
import com.kubi.copytrading.assets.AssetCopyTradingMainFragment;
import com.kubi.copytrading.futures.CopyTradingDelegate;
import com.kubi.copytrading.quote.CopyTradeQuoteRnFragment;
import com.kubi.copytrading.widgets.C11576e;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.sdk.BaseFragment;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p495oc.CopyTradingUiState;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CopyTradingDisabledService.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0012\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020\tH\u0016J\u001e\u0010&\u001a\u0004\u0018\u00010'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0#H\u0016J\u0016\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0007H\u0016J\b\u0010/\u001a\u00020\rH\u0002¨\u00061"}, m90084d2 = {"Lcom/kubi/copytrading/service/CopyTradingDisabledService;", "Lcom/kubi/copytrading/ICopyTradingService;", "<init>", "()V", "isSupportCopyTrading", "", "getCopyTradingFragment", "Lcom/kubi/sdk/BaseFragment;", "uiStateValue", "", "entrySource", "getKlineCopyTradingRecommendFragment", "removeCopyTradingFragment", "", "copyTradingFragment", "Landroidx/fragment/app/Fragment;", "jump2CopyTradingSearch", "notifyCopyTradingMsg2Rn", "bundle", "Landroid/os/Bundle;", "getFuturesCopyTradingDelegateImp", "Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;", "futuresFragment", "getCopyTradingAssetsMainFragment", "forceSetInterceptFlag", "subUid", "isForceSetInterceptFlag", "isCopytdAccount", "getLeaderUserConfigId", "", "isCopytdNeedShowLeaderTips", "copyTradingAccountStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/copytrading/data/CopyTradingUiState;", "fetchSymbolConfig1", "", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "time", "submitSymbolConfig", "", "request", "addFuturesBottomTab", "Lkotlin/Pair;", "getWidgetOfCopyTrading", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "checkNeedShowLeaderGuide", "fragment", "assertInDebugMode", "Companion", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradingDisabledService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingDisabledService.kt\ncom/kubi/copytrading/service/CopyTradingDisabledService\n+ 2 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,101:1\n44#2,2:102\n*S KotlinDebug\n*F\n+ 1 CopyTradingDisabledService.kt\ncom/kubi/copytrading/service/CopyTradingDisabledService\n*L\n99#1:102,2\n*E\n"})
public final class CopyTradingDisabledService implements ICopyTradingService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f19959b = new Companion(null);

    /* JADX INFO: compiled from: CopyTradingDisabledService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/copytrading/service/CopyTradingDisabledService$Companion;", "", "<init>", "()V", "TAG", "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @Nullable
    /* JADX INFO: renamed from: c */
    public BaseFragment mo20622c() {
        return null;
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: d */
    public boolean mo20623d() {
        return false;
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: e */
    public boolean mo20624e() {
        return false;
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: f */
    public boolean mo20625f() {
        return false;
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @Nullable
    /* JADX INFO: renamed from: l */
    public Pair<String, BaseFragment> mo20631l() {
        return null;
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: o */
    public boolean mo20634o() {
        return false;
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: p */
    public boolean mo20635p() {
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public Void m20953u() {
        return null;
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo20620a(@NotNull Map<String, String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return null;
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: b */
    public Map<String, SymbolConfig> mo20621b(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return MapsKt.emptyMap();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: h */
    public ICopyTradingFuturesDelegate mo20627h(@NotNull BaseFragment futuresFragment) {
        Intrinsics.checkNotNullParameter(futuresFragment, "futuresFragment");
        return new CopyTradingDelegate(futuresFragment);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: k */
    public BaseFragment mo20630k(@Nullable String str, @NotNull String entrySource) {
        Intrinsics.checkNotNullParameter(entrySource, "entrySource");
        m20952t();
        return CopyTradeQuoteRnFragment.f19944X.instance(null);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: r */
    public void mo20637r(@NotNull Fragment copyTradingFragment) {
        Intrinsics.checkNotNullParameter(copyTradingFragment, "copyTradingFragment");
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: s */
    public void mo20638s(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
    }

    /* JADX INFO: renamed from: t */
    public final void m20952t() {
        C43846g.m96568c(new KCConfigException(new IllegalStateException("CopyTrading service not available"), "CopyTradingDisabledService", false, null, 8, null), null, 2, null);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ String mo20628i() {
        return (String) m20953u();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: j */
    public ClassMappingV2 mo20629j() {
        return C11576e.m20990a();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: m */
    public InterfaceC41634e<CopyTradingUiState> mo20632m() {
        return C41636g.m90879C();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: n */
    public BaseFragment mo20633n() {
        m20952t();
        return AssetCopyTradingMainFragment.f19802Y.newInstance();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: g */
    public void mo20626g(@Nullable Bundle bundle) {
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: q */
    public void mo20636q(@Nullable String str) {
    }
}
