package com.kubi.homern.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.RNEvent;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p693vj.C45557b;
import p763xj.C46252a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: HomeRnFragment.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010!\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0012H\u0002J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0002J\u0012\u0010+\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\b\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020\u001eH\u0002J\b\u00100\u001a\u00020\u0001H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014¨\u00062"}, m90084d2 = {"Lcom/kubi/homern/page/HomeRnFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "cardsViewModel", "Lcom/kubi/homern/page/HomeRNViewModel;", "getCardsViewModel", "()Lcom/kubi/homern/page/HomeRNViewModel;", "cardsViewModel$delegate", "Lkotlin/Lazy;", "pageIsShowIng", "", "upgradeCount", "", "upgradeHaveShowed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isHomeRnReady", "needJumpFeedTabCode", "", "curLoadIndex", "Ljava/lang/Integer;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onDestroyView", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "observe", "jumpFeedTab", "code", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "checkDialog", "checkVipLevelUpDialog", "showVipLevelUpDialog", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lcom/kubi/homern/page/HomeRNViewModel$VipLevelUpDialogAction$Show;", "clearVipLevelUpDialogEffects", "activity", "Landroidx/fragment/app/FragmentActivity;", "checkAndShowPasskeyDialog", "checkUpgrade", "createHomeRNFragment", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeRnFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeRnFragment.kt\ncom/kubi/homern/page/HomeRnFragment\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,242:1\n153#2,7:243\n76#2,7:250\n153#2,7:257\n76#2,7:264\n220#3,5:271\n*S KotlinDebug\n*F\n+ 1 HomeRnFragment.kt\ncom/kubi/homern/page/HomeRnFragment\n*L\n106#1:243,7\n110#1:250,7\n118#1:257,7\n126#1:264,7\n61#1:271,5\n*E\n"})
public final class HomeRnFragment extends BaseFragment {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f26965b0 = new Companion(null);

    /* JADX INFO: renamed from: c0 */
    public static boolean f26966c0;

    /* JADX INFO: renamed from: V */
    public boolean f26968V;

    /* JADX INFO: renamed from: Y */
    public volatile boolean f26971Y;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public Integer f26973a0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f26967U = LazyKt.lazy(new Function0() { // from class: com.kubi.homern.page.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeRnFragment.m31281z3(this.f26974b);
        }
    });

    /* JADX INFO: renamed from: W */
    public int f26969W = 2;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final AtomicBoolean f26970X = new AtomicBoolean(false);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public volatile String f26972Z = "";

    /* JADX INFO: compiled from: HomeRnFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/homern/page/HomeRnFragment$Companion;", "", "<init>", "()V", "EVENT_JUMP_RN_TOP", "", "EVENT_JUMP_HOME_FEED_TAB", "KEY_CODE", "BIZ_HOME", "COMPONENT_HOME", "ROUTER_FLUTTER_VIP_DIALOG", "TAG", "hasShowPasskeyDialog", "", "newInstance", "Lcom/kubi/homern/page/HomeRnFragment;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HomeRnFragment newInstance() {
            return new HomeRnFragment();
        }
    }

    /* JADX INFO: renamed from: A3 */
    private final void m31259A3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.homern.page.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeRnFragment.m31260B3();
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m31260B3() {
        if (f26966c0) {
            return Unit.INSTANCE;
        }
        IUserService.Companion companion = IUserService.a;
        if (companion.get().c()) {
            companion.get().Y();
            f26966c0 = true;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    private final void m31261D3() {
        if (this.f26969W <= 0 || this.f26970X.get()) {
            return;
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeRnFragment$checkUpgrade$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: J3 */
    private final void m31262J3() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_tab_jump_page_top".length();
        }
        C12572a.m23692a(this, false, new HomeRnFragment$observe$$inlined$bindFlowEvent$default$1("com.kubi.home.feed.QuoteEvent:home_tab_jump_page_top", null));
        if (c12573b.m23696a()) {
            "com.kubi.home.rn.HomeRNEvent:home_feed_jump_to_tab_position_notify".length();
        }
        C12572a.m23692a(this, false, new HomeRnFragment$observe$$inlined$bindFlowEvent$default$2("com.kubi.home.rn.HomeRNEvent:home_feed_jump_to_tab_position_notify", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.rn.HomeRNEvent:on_home_rn_load_ready".length();
        }
        C12572a.m23692a(this, false, new HomeRnFragment$observe$$inlined$bindFlowEvent$default$3("com.kubi.home.rn.HomeRNEvent:on_home_rn_load_ready", null, this));
        if (c12573b.m23696a()) {
            RNEvent.RN_LOAD_FAIL.length();
        }
        C12572a.m23692a(this, false, new HomeRnFragment$observe$$inlined$bindFlowEvent$default$4(RNEvent.RN_LOAD_FAIL, null));
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m31263K3() {
        IKuMexService.f28731a.get().mo33280h();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final HomeRNViewModel m31281z3(HomeRnFragment homeRnFragment) {
        return (HomeRNViewModel) new ViewModelProvider(homeRnFragment).get(HomeRNViewModel.class);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m31284F3(FragmentActivity fragmentActivity) {
        C46252a c46252a = C46252a.f103819a;
        c46252a.m102012d(fragmentActivity);
        c46252a.m102013e(fragmentActivity);
    }

    /* JADX INFO: renamed from: G3 */
    public final BaseFragment m31285G3() {
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BIZ, "homepage");
        bundle.putString(Constants.COMPONENT, "platform_home_page");
        bundle.putString("entry", "main");
        bundle.putBoolean("ignoreHandleBackPressed", true);
        return IReactNativeService.INSTANCE.get().getRnRootFragment(bundle);
    }

    /* JADX INFO: renamed from: H3 */
    public final HomeRNViewModel m31286H3() {
        return (HomeRNViewModel) this.f26967U.getValue();
    }

    /* JADX INFO: renamed from: I3 */
    public final void m31287I3(String str) {
        IReactNativeService.INSTANCE.get().nativeNotifyRn("onHomeJumpFeedTab", MapsKt.hashMapOf(TuplesKt.m90091to("code", str)));
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f26973a0 = Integer.valueOf(C45557b.m100615f());
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int iGenerateViewId = View.generateViewId();
        fragmentContainerView.setId(iGenerateViewId);
        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        getChildFragmentManager().beginTransaction().replace(iGenerateViewId, m31285G3()).commitAllowingStateLoss();
        return fragmentContainerView;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m31262J3();
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m31264M3(HomeRnFragment homeRnFragment, FragmentActivity fragmentActivity, Map map) {
        homeRnFragment.m31286H3().m31255r();
        C44128b.m97266j(homeRnFragment.getTAG(), "[showVipLevelUpDialog] dialog result:" + map);
        homeRnFragment.m31284F3(fragmentActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public final void m31282C3() {
        m31261D3();
        m31259A3();
        m31283E3();
    }

    /* JADX INFO: renamed from: E3 */
    public final void m31283E3() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new HomeRnFragment$checkVipLevelUpDialog$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: L3 */
    public final void m31288L3(HomeRNViewModel.InterfaceC15155a.Show show) {
        final FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            m31286H3().m31256s(show.getVipLevel());
            try {
                C46252a c46252a = C46252a.f103819a;
                c46252a.m102010b(activity, 21.0f, 21.0f);
                c46252a.m102009a(activity);
                C44128b.m97266j(getTAG(), "[showVipLevelUpDialog] openFlutterDialog");
                KCFlutterRouteManager.f46704a.m56851l("home/feed/vipUpgrade?dialogRouteStyle=true&isTransparent=true&jsonData=" + show.getJsonData(), new Function1() { // from class: com.kubi.homern.page.d
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeRnFragment.m31264M3(this.f26975b, activity, (Map) obj);
                    }
                });
            } catch (Exception e11) {
                m31286H3().m31255r();
                m31284F3(activity);
                C44128b.m97261e(getTAG(), "[showVipLevelUpDialog] error:" + e11.getMessage());
            }
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Integer num = this.f26973a0;
        if (num != null) {
            C45557b.m100616g(num.intValue());
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        this.f26968V = false;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        this.f26968V = true;
        C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: com.kubi.homern.page.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeRnFragment.m31263K3();
            }
        });
        m31282C3();
        DayNightThemeManager.f28592a.m33185j();
    }
}
