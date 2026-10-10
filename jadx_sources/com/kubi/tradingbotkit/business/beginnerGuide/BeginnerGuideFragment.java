package com.kubi.tradingbotkit.business.beginnerGuide;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.host.HostManager;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.beginnerGuide.viewModel.GuideStepViewModel;
import com.kubi.tradingbotkit.business.futures.viewModel.FuturesGridViewModel;
import com.kubi.tradingbotkit.business.spot.viewmodel.RobotSpotViewModel;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.entity.LinkEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import l50.C42067f;
import o50.C42974h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: BeginnerGuideFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 V2\u00020\u0001:\u0001VB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u00104\u001a\u000205H\u0016J&\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u001a\u0010>\u001a\u0002052\u0006\u0010?\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010@\u001a\u000205H\u0002J\b\u0010A\u001a\u000205H\u0002J\b\u0010B\u001a\u000205H\u0002J\b\u0010C\u001a\u000205H\u0002J\b\u0010D\u001a\u00020\u000eH\u0002J$\u0010E\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u000e2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020I0HH\u0002J\b\u0010J\u001a\u000205H\u0016J\b\u0010K\u001a\u000205H\u0002J\b\u0010L\u001a\u000205H\u0002J\b\u0010M\u001a\u000205H\u0002J\b\u0010N\u001a\u000205H\u0002J\b\u0010O\u001a\u000205H\u0002J\b\u0010P\u001a\u000205H\u0002J\u000e\u0010O\u001a\u0002052\u0006\u0010Q\u001a\u00020RJ\u0010\u0010S\u001a\u0002052\u0006\u0010T\u001a\u00020UH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010 \u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b!\u0010\u001bR\u001b\u0010#\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b$\u0010\u001bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010)R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0012\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0012\u001a\u0004\b1\u00102¨\u0006W"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/beginnerGuide/BeginnerGuideFragment;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitDialogBeginnerGuideBinding;", "getViewBinding", "()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitDialogBeginnerGuideBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayoutId", "", "currentIndex", "gridType", "", "getGridType", "()Ljava/lang/String;", "gridType$delegate", "Lkotlin/Lazy;", "guideStepViewModel", "Lcom/kubi/tradingbotkit/business/beginnerGuide/viewModel/GuideStepViewModel;", "getGuideStepViewModel", "()Lcom/kubi/tradingbotkit/business/beginnerGuide/viewModel/GuideStepViewModel;", "guideStepViewModel$delegate", "introductionPage", "Lcom/kubi/tradingbotkit/business/beginnerGuide/GuideStepFragment;", "getIntroductionPage", "()Lcom/kubi/tradingbotkit/business/beginnerGuide/GuideStepFragment;", "introductionPage$delegate", "firstPage", "getFirstPage", "firstPage$delegate", "secondPage", "getSecondPage", "secondPage$delegate", "thirdPage", "getThirdPage", "thirdPage$delegate", "currentPage", "getCurrentPage", "setCurrentPage", "(Lcom/kubi/tradingbotkit/business/beginnerGuide/GuideStepFragment;)V", "robotSpotViewModel", "Lcom/kubi/tradingbotkit/business/spot/viewmodel/RobotSpotViewModel;", "getRobotSpotViewModel", "()Lcom/kubi/tradingbotkit/business/spot/viewmodel/RobotSpotViewModel;", "robotSpotViewModel$delegate", "futuresGridViewModel", "Lcom/kubi/tradingbotkit/business/futures/viewModel/FuturesGridViewModel;", "getFuturesGridViewModel", "()Lcom/kubi/tradingbotkit/business/futures/viewModel/FuturesGridViewModel;", "futuresGridViewModel$delegate", "onStart", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "showVideoIcon", "showIntroduceInfo", "showNextBtnText", "clickCollection", "getGridTypeVideoUrl", "getVideoUrlByGridType", "type", "linkMap", "", "Lcom/kubi/tradingbotkit/entity/LinkEntity;", "onResume", "onPageChange", "showDialogTitle", "showStepNumber", "showPreBtn", "replace", "addNow", "fragment", "Landroidx/fragment/app/Fragment;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBeginnerGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginnerGuideFragment.kt\ncom/kubi/tradingbotkit/business/beginnerGuide/BeginnerGuideFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,329:1\n143#2,20:330\n172#3,9:350\n172#3,9:359\n172#3,9:368\n*S KotlinDebug\n*F\n+ 1 BeginnerGuideFragment.kt\ncom/kubi/tradingbotkit/business/beginnerGuide/BeginnerGuideFragment\n*L\n42#1:330,20\n75#1:350,9\n111#1:359,9\n113#1:368,9\n*E\n"})
public final class BeginnerGuideFragment extends GravityDialogFragment {

    /* JADX INFO: renamed from: d0 */
    public int f52253d0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f52255f0;

    /* JADX INFO: renamed from: k0 */
    @Nullable
    public GuideStepFragment f52260k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final Lazy f52261l0;

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final Lazy f52262m0;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ KProperty<Object>[] f52251o0 = {Reflection.property1(new PropertyReference1Impl(BeginnerGuideFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitDialogBeginnerGuideBinding;", 0))};

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public static final Companion f52250n0 = new Companion(null);

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f52252c0 = C45681e.m100799e(this, new Function1<BeginnerGuideFragment, C42067f>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.BeginnerGuideFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42067f invoke(@NotNull BeginnerGuideFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42067f.m92285a(fragment.requireView());
        }
    }, new Function1<C42067f, Unit>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.BeginnerGuideFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42067f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42067f c42067f) {
            invoke(c42067f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f52254e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BeginnerGuideFragment.m63806Z3(this.f52269b);
        }
    });

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f52256g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BeginnerGuideFragment.m63807a4(this.f52270b);
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f52257h0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BeginnerGuideFragment.m63800M3(this.f52271b);
        }
    });

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f52258i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BeginnerGuideFragment.m63808e4(this.f52272b);
        }
    });

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final Lazy f52259j0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BeginnerGuideFragment.m63809l4(this.f52273b);
        }
    });

    /* JADX INFO: compiled from: BeginnerGuideFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/beginnerGuide/BeginnerGuideFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/tradingbotkit/business/beginnerGuide/BeginnerGuideFragment;", "gridType", "", "GRID_TYPE", "INTRODUCTION_PAGE", "", "PAGE_ONE", "PAGE_TWO", "PAGE_THREE", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BeginnerGuideFragment newInstance(@NotNull String gridType) {
            Intrinsics.checkNotNullParameter(gridType, "gridType");
            BeginnerGuideFragment beginnerGuideFragment = new BeginnerGuideFragment();
            Bundle bundle = new Bundle();
            bundle.putString("grid_type", gridType);
            beginnerGuideFragment.setArguments(bundle);
            return beginnerGuideFragment;
        }
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m63797J3(BeginnerGuideFragment beginnerGuideFragment) {
        int i11 = beginnerGuideFragment.f52253d0;
        if (i11 < 3) {
            beginnerGuideFragment.f52253d0 = i11 + 1;
            beginnerGuideFragment.m63819b4();
        } else {
            beginnerGuideFragment.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m63798K3(BeginnerGuideFragment beginnerGuideFragment) {
        beginnerGuideFragment.f52253d0--;
        beginnerGuideFragment.m63819b4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final GuideStepFragment m63800M3(BeginnerGuideFragment beginnerGuideFragment) {
        return GuideStepFragment.f52263Y.newInstance(beginnerGuideFragment.m63802P3(), 1);
    }

    /* JADX INFO: renamed from: O3 */
    private final FuturesGridViewModel m63801O3() {
        return (FuturesGridViewModel) this.f52262m0.getValue();
    }

    /* JADX INFO: renamed from: P3 */
    private final String m63802P3() {
        return (String) this.f52254e0.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    private final GuideStepViewModel m63803R3() {
        return (GuideStepViewModel) this.f52255f0.getValue();
    }

    /* JADX INFO: renamed from: T3 */
    private final int m63804T3() {
        return R$layout.btrading_bot_kit_dialog_beginner_guide;
    }

    /* JADX INFO: renamed from: U3 */
    private final RobotSpotViewModel m63805U3() {
        return (RobotSpotViewModel) this.f52261l0.getValue();
    }

    /* JADX INFO: renamed from: a4 */
    public static final GuideStepFragment m63807a4(BeginnerGuideFragment beginnerGuideFragment) {
        return GuideStepFragment.f52263Y.newInstance(beginnerGuideFragment.m63802P3(), 0);
    }

    /* JADX INFO: renamed from: e4 */
    public static final GuideStepFragment m63808e4(BeginnerGuideFragment beginnerGuideFragment) {
        return GuideStepFragment.f52263Y.newInstance(beginnerGuideFragment.m63802P3(), 2);
    }

    /* JADX INFO: renamed from: l4 */
    public static final GuideStepFragment m63809l4(BeginnerGuideFragment beginnerGuideFragment) {
        return GuideStepFragment.f52263Y.newInstance(beginnerGuideFragment.m63802P3(), 3);
    }

    /* JADX INFO: renamed from: N3 */
    public final GuideStepFragment m63812N3() {
        return (GuideStepFragment) this.f52257h0.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    public final GuideStepFragment m63814S3() {
        return (GuideStepFragment) this.f52256g0.getValue();
    }

    /* JADX INFO: renamed from: V3 */
    public final GuideStepFragment m63815V3() {
        return (GuideStepFragment) this.f52258i0.getValue();
    }

    /* JADX INFO: renamed from: W3 */
    public final GuideStepFragment m63816W3() {
        return (GuideStepFragment) this.f52259j0.getValue();
    }

    /* JADX INFO: renamed from: X3 */
    public final String m63817X3(String str, Map<String, LinkEntity> map) {
        String string;
        String strW = HostManager.a.w();
        LinkEntity linkEntity = map.get(str);
        if (MultiLanguageManager.f46811g.equals(LanguageType.CHINA)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strW);
            sb2.append(linkEntity != null ? linkEntity.getZhCN() : null);
            string = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strW);
            sb3.append(linkEntity != null ? linkEntity.getEnUS() : null);
            string = sb3.toString();
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: Y3 */
    public final C42067f m63818Y3() {
        return (C42067f) this.f52252c0.getValue(this, f52251o0[0]);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m63820c4() {
        GuideStepFragment guideStepFragmentM63814S3;
        int i11 = this.f52253d0;
        if (i11 == 0) {
            guideStepFragmentM63814S3 = m63814S3();
        } else if (i11 == 1) {
            guideStepFragmentM63814S3 = m63812N3();
        } else if (i11 != 2) {
            guideStepFragmentM63814S3 = i11 != 3 ? m63814S3() : m63816W3();
        } else {
            guideStepFragmentM63814S3 = m63815V3();
        }
        this.f52260k0 = guideStepFragmentM63814S3;
        if (guideStepFragmentM63814S3 == null) {
            guideStepFragmentM63814S3 = m63814S3();
        }
        m63821d4(guideStepFragmentM63814S3);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m63821d4(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (getChildFragmentManager().isDestroyed() || getChildFragmentManager().isStateSaved()) {
            return;
        }
        getChildFragmentManager().beginTransaction().replace(R$id.fl_container, fragment).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: f4 */
    public final void m63822f4() {
        C42067f c42067fM63818Y3;
        TextView textView;
        GuideStepFragment guideStepFragment = this.f52260k0;
        int iM66650j = C27039d.m66650j(guideStepFragment != null ? Integer.valueOf(guideStepFragment.m63841s3()) : null);
        if (iM66650j == 0 || (c42067fM63818Y3 = m63818Y3()) == null || (textView = c42067fM63818Y3.f92688f) == null) {
            return;
        }
        textView.setText(getString(iM66650j));
    }

    /* JADX INFO: renamed from: h4 */
    public final void m63824h4() {
        Button button;
        Button button2;
        if (this.f52253d0 < 3) {
            C42067f c42067fM63818Y3 = m63818Y3();
            if (c42067fM63818Y3 == null || (button2 = c42067fM63818Y3.f92684b) == null) {
                return;
            }
            button2.setText(t0.a(C27017c.f54310a.m66516f(R$string.kc_spot_grid_next_step_title, new Object[0]), C42974h.m94374c((this.f52253d0 + 1) + "/4")));
            return;
        }
        C42067f c42067fM63818Y4 = m63818Y3();
        if (c42067fM63818Y4 == null || (button = c42067fM63818Y4.f92684b) == null) {
            return;
        }
        button.setText(t0.a(C27017c.f54310a.m66516f(R$string.start_trade, new Object[0]), C42974h.m94374c((this.f52253d0 + 1) + "/4")));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m63825i4() {
        Button button;
        Button button2;
        int i11 = this.f52253d0;
        if (i11 == 0 || i11 == 3) {
            C42067f c42067fM63818Y3 = m63818Y3();
            if (c42067fM63818Y3 == null || (button = c42067fM63818Y3.f92685c) == null) {
                return;
            }
            ViewExtKt.m66577h(button);
            return;
        }
        C42067f c42067fM63818Y4 = m63818Y3();
        if (c42067fM63818Y4 == null || (button2 = c42067fM63818Y4.f92685c) == null) {
            return;
        }
        ViewExtKt.m66594y(button2);
    }

    /* JADX INFO: renamed from: j4 */
    public final void m63826j4() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        if (this.f52253d0 <= 0) {
            C42067f c42067fM63818Y3 = m63818Y3();
            if (c42067fM63818Y3 == null || (appCompatTextView = c42067fM63818Y3.f92687e) == null) {
                return;
            }
            ViewExtKt.m66577h(appCompatTextView);
            return;
        }
        C42067f c42067fM63818Y4 = m63818Y3();
        if (c42067fM63818Y4 != null && (appCompatTextView3 = c42067fM63818Y4.f92687e) != null) {
            appCompatTextView3.setText(String.valueOf(this.f52253d0));
        }
        C42067f c42067fM63818Y5 = m63818Y3();
        if (c42067fM63818Y5 == null || (appCompatTextView2 = c42067fM63818Y5.f92687e) == null) {
            return;
        }
        ViewExtKt.m66594y(appCompatTextView2);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54249x3(0.7f);
        return inflater.inflate(m63804T3(), (ViewGroup) null);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null) {
            String name = BeginnerGuideFragment.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            BaseActivity.setFragmentResult$default(baseActivity, name, null, 2, null);
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m63803R3().m63853o();
        this.f52260k0 = m63814S3();
        m63811H3();
        m63796I3();
        m63823g4();
        m63827k4();
    }

    public BeginnerGuideFragment() {
        final Function0 function0 = null;
        this.f52255f0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GuideStepViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.BeginnerGuideFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore mViewModelStore = this.requireActivity().getMViewModelStore();
                Intrinsics.checkNotNullExpressionValue(mViewModelStore, "requireActivity().viewModelStore");
                return mViewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.BeginnerGuideFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.BeginnerGuideFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.f52261l0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RobotSpotViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.BeginnerGuideFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore mViewModelStore = this.requireActivity().getMViewModelStore();
                Intrinsics.checkNotNullExpressionValue(mViewModelStore, "requireActivity().viewModelStore");
                return mViewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.BeginnerGuideFragment$special$$inlined$activityViewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.BeginnerGuideFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.f52262m0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FuturesGridViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.BeginnerGuideFragment$special$$inlined$activityViewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore mViewModelStore = this.requireActivity().getMViewModelStore();
                Intrinsics.checkNotNullExpressionValue(mViewModelStore, "requireActivity().viewModelStore");
                return mViewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.BeginnerGuideFragment$special$$inlined$activityViewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.BeginnerGuideFragment$special$$inlined$activityViewModels$default$9
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    private final void m63796I3() {
        AppCompatTextView appCompatTextView;
        Button button;
        Button button2;
        C42067f c42067fM63818Y3 = m63818Y3();
        if (c42067fM63818Y3 != null && (button2 = c42067fM63818Y3.f92684b) != null) {
            C27046k.m66711z(button2, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BeginnerGuideFragment.m63797J3(this.f52274b);
                }
            }, 1, null);
        }
        C42067f c42067fM63818Y4 = m63818Y3();
        if (c42067fM63818Y4 != null && (button = c42067fM63818Y4.f92685c) != null) {
            C27046k.m66711z(button, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BeginnerGuideFragment.m63798K3(this.f52275b);
                }
            }, 1, null);
        }
        C42067f c42067fM63818Y5 = m63818Y3();
        if (c42067fM63818Y5 != null && (appCompatTextView = c42067fM63818Y5.f92689g) != null) {
            C27046k.m66711z(appCompatTextView, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.beginnerGuide.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BeginnerGuideFragment.m63799L3(this.f52276b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m63799L3(BeginnerGuideFragment beginnerGuideFragment) {
        Router.f46192a.m56184f(beginnerGuideFragment.m63813Q3()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final String m63806Z3(BeginnerGuideFragment beginnerGuideFragment) {
        String string;
        Bundle arguments = beginnerGuideFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("grid_type");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: H3 */
    public final void m63811H3() {
        if (!getChildFragmentManager().isDestroyed() && !getChildFragmentManager().isStateSaved()) {
            GuideStepFragment guideStepFragment = this.f52260k0;
            if (guideStepFragment != null && guideStepFragment.isAdded()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            int i11 = R$id.fl_container;
            GuideStepFragment guideStepFragmentM63814S3 = this.f52260k0;
            if (guideStepFragmentM63814S3 == null) {
                guideStepFragmentM63814S3 = m63814S3();
            }
            fragmentTransactionBeginTransaction.add(i11, guideStepFragmentM63814S3).commitAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public final String m63813Q3() {
        String strM63817X3 = null;
        if (Intrinsics.areEqual(m63802P3(), "GRID")) {
            Map<String, LinkEntity> map = (Map) m63805U3().x0().getValue();
            if (map != null) {
                strM63817X3 = m63817X3("SpotGuideVideo", map);
            }
            return C27041f.m66668h(strM63817X3);
        }
        Map<String, LinkEntity> map2 = (Map) m63801O3().f1().getValue();
        if (map2 != null) {
            strM63817X3 = m63817X3("FuturesGuideVideo", map2);
        }
        return C27041f.m66668h(strM63817X3);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m63819b4() {
        m63820c4();
        m63825i4();
        m63826j4();
        m63822f4();
        m63824h4();
    }

    /* JADX INFO: renamed from: g4 */
    public final void m63823g4() {
        m63825i4();
        m63822f4();
        m63824h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63827k4() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        if (Intrinsics.areEqual(m63802P3(), "GRID")) {
            C42067f c42067fM63818Y3 = m63818Y3();
            if (c42067fM63818Y3 != null && (appCompatTextView2 = c42067fM63818Y3.f92689g) != null) {
                ViewExtKt.m66594y(appCompatTextView2);
                return;
            }
            return;
        }
        C42067f c42067fM63818Y4 = m63818Y3();
        if (c42067fM63818Y4 != null && (appCompatTextView = c42067fM63818Y4.f92689g) != null) {
            C27046k.m66703r(appCompatTextView);
        }
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m63819b4();
    }

    @Override // com.kubi.resources.dialog.GravityDialogFragment, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        WindowManager.LayoutParams attributes;
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            attributes = window2.getAttributes();
        } else {
            attributes = null;
        }
        if (attributes != null) {
            attributes.height = (int) (C5267e0.m6182d() * getF43594a0());
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setAttributes(attributes);
        }
    }
}
