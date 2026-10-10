package com.kubi.futures.entry.p080rn;

import ai.C0361b;
import ai.C0363d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.FuturesFacedFragment;
import com.kubi.futures.FuturesRemote;
import com.kubi.futures.entry.FuturesContainerFragment;
import com.kubi.futures.entry.IFuturesFragmentController;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.sdk.BaseFragment;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: FuturesRnMigrationHostFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002-.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\b\u0010 \u001a\u00020\u000fH\u0016J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J\u0012\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u000bH\u0002J\b\u0010%\u001a\u00020\u0001H\u0002J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\rH\u0002J\b\u0010)\u001a\u00020\u000fH\u0002J\u001e\u0010*\u001a\u0004\u0018\u00010\t2\b\u0010+\u001a\u0004\u0018\u00010\t2\b\u0010,\u001a\u0004\u0018\u00010\tH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m90084d2 = {"Lcom/kubi/futures/entry/rn/FuturesRnMigrationHostFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/futures/entry/IFuturesFragmentController;", "<init>", "()V", "renderMode", "Lcom/kubi/futures/entry/rn/FuturesRnMigrationHostFragment$RenderMode;", "currentFragment", "latestRouteArgs", "Landroid/os/Bundle;", "isReplacing", "", "rnInstanceId", "", "onCreate", "", "savedInstanceState", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onSaveInstanceState", "outState", "onArguments", "bundle", "handleKlineInMaintenance", TIMPushProvider.f75062n, "refresh", "releaseRnEngine", "restoreChildOrResolveMode", "showRnOrFallback", "showNative", "force", "createNativeFragment", "replaceChild", "fragment", "tag", "syncRnRoute", "mergeRouteArgs", "current", "incoming", "RenderMode", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesRnMigrationHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesRnMigrationHostFragment.kt\ncom/kubi/futures/entry/rn/FuturesRnMigrationHostFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,193:1\n1#2:194\n*E\n"})
public final class FuturesRnMigrationHostFragment extends BaseFragment implements IFuturesFragmentController {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f23030Z = new Companion(null);

    /* JADX INFO: renamed from: V */
    @Nullable
    public BaseFragment f23032V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public Bundle f23033W;

    /* JADX INFO: renamed from: X */
    public boolean f23034X;

    /* JADX INFO: renamed from: U */
    @NotNull
    public RenderMode f23031U = RenderMode.UNRESOLVED;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f23035Y = "";

    /* JADX INFO: compiled from: FuturesRnMigrationHostFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/futures/entry/rn/FuturesRnMigrationHostFragment$Companion;", "", "<init>", "()V", "TAG_RN", "", "TAG_NATIVE", "STATE_ROUTE_ARGS", "STATE_RN_INSTANCE_ID", "EVENT_TRADE_MAIN_NATIVE_ROUTE_CHANGED", "newInstance", "Lcom/kubi/futures/entry/rn/FuturesRnMigrationHostFragment;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FuturesRnMigrationHostFragment newInstance() {
            return new FuturesRnMigrationHostFragment();
        }
    }

    /* JADX INFO: compiled from: FuturesRnMigrationHostFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/futures/entry/rn/FuturesRnMigrationHostFragment$RenderMode;", "", "<init>", "(Ljava/lang/String;I)V", "UNRESOLVED", "RN", "NATIVE", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum RenderMode {
        UNRESOLVED,
        RN,
        NATIVE;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f23038c = EnumEntriesKt.enumEntries(m25553a());

        @NotNull
        public static EnumEntries<RenderMode> getEntries() {
            return f23038c;
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m25545o3(FuturesRnMigrationHostFragment futuresRnMigrationHostFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        futuresRnMigrationHostFragment.m25550n3(z11);
    }

    @Override // com.kubi.futures.entry.IFuturesFragmentController
    /* JADX INFO: renamed from: B0 */
    public void mo20214B0() {
        ActivityResultCaller activityResultCaller = this.f23032V;
        IFuturesFragmentController iFuturesFragmentController = activityResultCaller instanceof IFuturesFragmentController ? (IFuturesFragmentController) activityResultCaller : null;
        if (iFuturesFragmentController != null) {
            iFuturesFragmentController.mo20214B0();
        }
    }

    @Override // com.kubi.futures.entry.IFuturesFragmentController
    /* JADX INFO: renamed from: Y0 */
    public void mo25527Y0() {
        ActivityResultCaller activityResultCaller = this.f23032V;
        IFuturesFragmentController iFuturesFragmentController = activityResultCaller instanceof IFuturesFragmentController ? (IFuturesFragmentController) activityResultCaller : null;
        if (iFuturesFragmentController != null) {
            iFuturesFragmentController.mo25527Y0();
        }
    }

    /* JADX INFO: renamed from: j3 */
    public final BaseFragment m25546j3() {
        Bundle bundle = this.f23033W;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        if (FuturesRemote.f23108a.m25650p()) {
            FuturesContainerFragment futuresContainerFragmentNewInstance = FuturesContainerFragment.f23000b0.newInstance();
            futuresContainerFragmentNewInstance.setArguments(bundle2);
            return futuresContainerFragmentNewInstance;
        }
        FuturesFacedFragment futuresFacedFragment = new FuturesFacedFragment();
        bundle2.putBoolean("set_root_top_padding", true);
        futuresFacedFragment.setArguments(bundle2);
        return futuresFacedFragment;
    }

    /* JADX INFO: renamed from: k3 */
    public final Bundle m25547k3(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return null;
        }
        if (bundle == null) {
            bundle = BundleKt.bundleOf();
        }
        Bundle bundle3 = new Bundle(bundle);
        if (bundle2 != null) {
            bundle3.putAll(bundle2);
        }
        return bundle3;
    }

    /* JADX INFO: renamed from: n3 */
    public final void m25550n3(boolean z11) {
        Object objM103844constructorimpl;
        if ((z11 || !this.f23034X) && !getChildFragmentManager().isDestroyed()) {
            boolean z12 = this.f23034X;
            this.f23034X = true;
            try {
                Result.Companion companion = Result.INSTANCE;
                BaseFragment baseFragmentM25546j3 = m25546j3();
                m25548l3(baseFragmentM25546j3, "futures_rn_migration_native");
                this.f23032V = baseFragmentM25546j3;
                this.f23031U = RenderMode.NATIVE;
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97262f(getTAG(), "create Native failed", thM103847exceptionOrNullimpl);
            }
            this.f23034X = z12;
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable Bundle bundle) {
        this.f23033W = m25547k3(this.f23033W, bundle);
        if (this.f23031U == RenderMode.RN) {
            m25552q3();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_futures_rn_migration_host, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Bundle bundle = this.f23033W;
        if (bundle != null) {
            outState.putBundle("futures_rn_migration_route_args", new Bundle(bundle));
        }
        outState.putString("futures_rn_migration_instance_id", this.f23035Y);
        super.onSaveInstanceState(outState);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m25549m3();
    }

    /* JADX INFO: renamed from: p3 */
    public final void m25551p3() {
        Object objM103844constructorimpl;
        if (this.f23034X || getChildFragmentManager().isDestroyed()) {
            return;
        }
        this.f23034X = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            BaseFragment rnRootFragment = IReactNativeService.INSTANCE.get().getRnRootFragment(C0363d.f1077a.m1427c(this.f23033W, this.f23035Y));
            m25548l3(rnRootFragment, "futures_rn_migration_rn");
            this.f23032V = rnRootFragment;
            this.f23031U = RenderMode.RN;
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97262f(getTAG(), "create RN failed", thM103847exceptionOrNullimpl);
            m25550n3(true);
        }
        this.f23034X = false;
    }

    @Override // com.kubi.futures.entry.IFuturesFragmentController
    /* JADX INFO: renamed from: q1 */
    public void mo20216q1(boolean z11) {
        ActivityResultCaller activityResultCaller = this.f23032V;
        IFuturesFragmentController iFuturesFragmentController = activityResultCaller instanceof IFuturesFragmentController ? (IFuturesFragmentController) activityResultCaller : null;
        if (iFuturesFragmentController != null) {
            iFuturesFragmentController.mo20216q1(z11);
        }
    }

    /* JADX INFO: renamed from: l3 */
    public final void m25548l3(BaseFragment baseFragment, String str) {
        getChildFragmentManager().beginTransaction().replace(R$id.futuresRnMigrationContainer, baseFragment, str).commitNowAllowingStateLoss();
    }

    /* JADX INFO: renamed from: m3 */
    public final void m25549m3() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("futures_rn_migration_rn");
        BaseFragment baseFragment = null;
        if (fragmentFindFragmentByTag != null) {
            if (fragmentFindFragmentByTag instanceof BaseFragment) {
                baseFragment = (BaseFragment) fragmentFindFragmentByTag;
            }
            this.f23032V = baseFragment;
            this.f23031U = RenderMode.RN;
            return;
        }
        Fragment fragmentFindFragmentByTag2 = getChildFragmentManager().findFragmentByTag("futures_rn_migration_native");
        if (fragmentFindFragmentByTag2 != null) {
            if (fragmentFindFragmentByTag2 instanceof BaseFragment) {
                baseFragment = (BaseFragment) fragmentFindFragmentByTag2;
            }
            this.f23032V = baseFragment;
            this.f23031U = RenderMode.NATIVE;
            return;
        }
        if (C0361b.f1076a.m1423a()) {
            m25551p3();
        } else {
            m25545o3(this, false, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle bundle;
        String string;
        super.onCreate(savedInstanceState);
        String string2 = null;
        if (savedInstanceState == null || (bundle = savedInstanceState.getBundle("futures_rn_migration_route_args")) == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                bundle = new Bundle(arguments);
            } else {
                bundle = null;
            }
        }
        this.f23033W = bundle;
        if (savedInstanceState != null && (string = savedInstanceState.getString("futures_rn_migration_instance_id")) != null) {
            if (!StringsKt.isBlank(string)) {
                string2 = string;
            }
            if (string2 == null) {
                string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            }
        } else {
            string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        }
        this.f23035Y = string2;
    }

    /* JADX INFO: renamed from: q3 */
    public final void m25552q3() {
        if (isAdded() && !getChildFragmentManager().isDestroyed()) {
            C0363d c0363d = C0363d.f1077a;
            Bundle bundleM1427c = c0363d.m1427c(this.f23033W, this.f23035Y);
            BaseFragment baseFragment = this.f23032V;
            if (baseFragment != null) {
                baseFragment.performArguments(bundleM1427c);
            }
            IReactNativeService.INSTANCE.get().nativeNotifyRn("tradeMainNativeRouteChanged", c0363d.m1426b(this.f23033W, this.f23035Y));
        }
    }
}
