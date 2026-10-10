package p592rc;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kubi.copytrading.ICopyTradingFuturesDelegate;
import com.kubi.copytrading.ICopyTradingService;
import com.kubi.copytrading.service.CopyTradingDisabledService;
import com.kubi.kucoin.home.p090v2.cards.ClassMappingV2;
import com.kubi.kumex.data.platform.model.SymbolConfig;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p495oc.CopyTradingUiState;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rc.a */
/* JADX INFO: compiled from: CopyTradingImplService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0096\u0001J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0096\u0001J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096\u0001J\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0096\u0001J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\t\u0010\u0015\u001a\u00020\bH\u0096\u0001J\u001b\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0096\u0001J\u0011\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0096\u0001J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0096\u0001J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\t\u0010 \u001a\u00020!H\u0096\u0001J\t\u0010\"\u001a\u00020!H\u0096\u0001J\t\u0010#\u001a\u00020!H\u0096\u0001J\t\u0010$\u001a\u00020!H\u0096\u0001J\t\u0010%\u001a\u00020!H\u0096\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0001J\u0011\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020+H\u0096\u0001J\u001f\u0010,\u001a\u0004\u0018\u00010-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0010H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m90084d2 = {"Lcom/kubi/copytrading/service/CopyTradingImplService;", "Lcom/kubi/copytrading/ICopyTradingService;", "delegate", "<init>", "(Lcom/kubi/copytrading/ICopyTradingService;)V", "addFuturesBottomTab", "Lkotlin/Pair;", "", "Lcom/kubi/sdk/BaseFragment;", "checkNeedShowLeaderGuide", "", "fragment", "copyTradingAccountStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/copytrading/data/CopyTradingUiState;", "fetchSymbolConfig1", "", "Lcom/kubi/kumex/data/platform/model/SymbolConfig;", "time", "forceSetInterceptFlag", "subUid", "getCopyTradingAssetsMainFragment", "getCopyTradingFragment", "uiStateValue", "entrySource", "getFuturesCopyTradingDelegateImp", "Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;", "futuresFragment", "getKlineCopyTradingRecommendFragment", "getLeaderUserConfigId", "getWidgetOfCopyTrading", "Lcom/kubi/kucoin/home/v2/cards/ClassMappingV2;", "isCopytdAccount", "", "isCopytdNeedShowLeaderTips", "isForceSetInterceptFlag", "isSupportCopyTrading", "jump2CopyTradingSearch", "notifyCopyTradingMsg2Rn", "bundle", "Landroid/os/Bundle;", "removeCopyTradingFragment", "copyTradingFragment", "Landroidx/fragment/app/Fragment;", "submitSymbolConfig", "", "request", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43984a implements ICopyTradingService {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ICopyTradingService f97219b;

    /* JADX WARN: Multi-variable type inference failed */
    public C43984a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C43984a(@NotNull ICopyTradingService delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f97219b = delegate;
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo20620a(@NotNull Map<String, String> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f97219b.mo20620a(request);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @Nullable
    /* JADX INFO: renamed from: c */
    public BaseFragment mo20622c() {
        return this.f97219b.mo20622c();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: d */
    public boolean mo20623d() {
        return this.f97219b.mo20623d();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: e */
    public boolean mo20624e() {
        return this.f97219b.mo20624e();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: f */
    public boolean mo20625f() {
        return this.f97219b.mo20625f();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: g */
    public void mo20626g(@Nullable Bundle bundle) {
        this.f97219b.mo20626g(bundle);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: h */
    public ICopyTradingFuturesDelegate mo20627h(@NotNull BaseFragment futuresFragment) {
        Intrinsics.checkNotNullParameter(futuresFragment, "futuresFragment");
        return this.f97219b.mo20627h(futuresFragment);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @Nullable
    /* JADX INFO: renamed from: i */
    public String mo20628i() {
        return this.f97219b.mo20628i();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: j */
    public ClassMappingV2 mo20629j() {
        return this.f97219b.mo20629j();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: k */
    public BaseFragment mo20630k(@Nullable String str, @NotNull String entrySource) {
        Intrinsics.checkNotNullParameter(entrySource, "entrySource");
        return this.f97219b.mo20630k(str, entrySource);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @Nullable
    /* JADX INFO: renamed from: l */
    public Pair<String, BaseFragment> mo20631l() {
        return this.f97219b.mo20631l();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: m */
    public InterfaceC41634e<CopyTradingUiState> mo20632m() {
        return this.f97219b.mo20632m();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: n */
    public BaseFragment mo20633n() {
        return this.f97219b.mo20633n();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: o */
    public boolean mo20634o() {
        return this.f97219b.mo20634o();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: p */
    public boolean mo20635p() {
        return this.f97219b.mo20635p();
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: q */
    public void mo20636q(@Nullable String str) {
        this.f97219b.mo20636q(str);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: r */
    public void mo20637r(@NotNull Fragment copyTradingFragment) {
        Intrinsics.checkNotNullParameter(copyTradingFragment, "copyTradingFragment");
        this.f97219b.mo20637r(copyTradingFragment);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    /* JADX INFO: renamed from: s */
    public void mo20638s(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f97219b.mo20638s(fragment);
    }

    @Override // com.kubi.copytrading.ICopyTradingService
    @NotNull
    /* JADX INFO: renamed from: b */
    public Map<String, SymbolConfig> mo20621b(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        return this.f97219b.mo20621b(time);
    }

    public /* synthetic */ C43984a(ICopyTradingService iCopyTradingService, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C24129b.m58030b(SiteVisibleConfigKey.CopyTrading) ? new C43986c() : new CopyTradingDisabledService() : iCopyTradingService);
    }
}
