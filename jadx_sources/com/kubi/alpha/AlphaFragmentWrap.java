package com.kubi.alpha;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$color;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AlphaFragmentWrap.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/alpha/AlphaFragmentWrap;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "containerId", "", "alphaFragment", "Lcom/kubi/alpha/AlphaFragment;", "pendingReleaseTask", "Ljava/lang/Runnable;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "showEmotionFragment", "releaseFlutterFragment", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaFragmentWrap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaFragmentWrap.kt\ncom/kubi/alpha/AlphaFragmentWrap\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,111:1\n158#2,2:112\n1#3:114\n44#4,2:115\n44#4,2:117\n*S KotlinDebug\n*F\n+ 1 AlphaFragmentWrap.kt\ncom/kubi/alpha/AlphaFragmentWrap\n*L\n48#1:112,2\n81#1:115,2\n108#1:117,2\n*E\n"})
public final class AlphaFragmentWrap extends BaseFragment {

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f15349X = new Companion(null);

    /* JADX INFO: renamed from: U */
    public final int f15350U = View.generateViewId();

    /* JADX INFO: renamed from: V */
    @Nullable
    public AlphaFragment f15351V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public Runnable f15352W;

    /* JADX INFO: compiled from: AlphaFragmentWrap.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/alpha/AlphaFragmentWrap$Companion;", "", "<init>", "()V", "EVENT_KYC_RELEASE", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final void m14985n3() {
        Object objM103844constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            Runnable runnable = this.f15352W;
            if (runnable != null) {
                View view = getView();
                if (view != null) {
                    view.removeCallbacks(runnable);
                }
                this.f15352W = null;
            }
            AlphaFragment alphaFragment = this.f15351V;
            if (alphaFragment != null && alphaFragment.isAdded()) {
                performArguments(getArguments());
                return;
            }
            Bundle arguments = getArguments();
            Integer numValueOf = arguments != null ? Integer.valueOf(RouteExKt.m56260m(arguments, "type")) : null;
            Bundle arguments2 = getArguments();
            String strM56284y = arguments2 != null ? RouteExKt.m56284y(arguments2, "currencySeq") : null;
            Bundle arguments3 = getArguments();
            AlphaFragment alphaFragmentNewInstance = AlphaFragment.f15339d0.newInstance("swap/home", strM56284y, arguments3 != null ? Boolean.valueOf(RouteExKt.m56250h(arguments3, "isBuy")) : null, numValueOf);
            this.f15351V = alphaFragmentNewInstance;
            if (alphaFragmentNewInstance != null) {
                C27032f.m66625p(this, this.f15350U, alphaFragmentNewInstance, null, 4, null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C43846g.m96568c(new KCConfigException(thM103847exceptionOrNullimpl, "showEmotionFragment", false, null, 8, null), null, 2, null);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public final void m14983l3() {
        Object objM103844constructorimpl;
        Object objValueOf;
        View view;
        final AlphaFragment alphaFragment = this.f15351V;
        if (alphaFragment == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Runnable runnable = this.f15352W;
            if (runnable != null && (view = getView()) != null) {
                view.removeCallbacks(runnable);
            }
            if (alphaFragment.isAdded()) {
                View view2 = getView();
                if (view2 != null) {
                    view2.setBackgroundColor(getColorRes(R$color.c_overlay));
                }
                Runnable runnable2 = new Runnable() { // from class: com.kubi.alpha.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        AlphaFragmentWrap.m14984m3(alphaFragment, this);
                    }
                };
                this.f15352W = runnable2;
                View view3 = getView();
                objValueOf = view3 != null ? Boolean.valueOf(view3.postDelayed(runnable2, 100L)) : null;
            } else {
                this.f15351V = null;
                objValueOf = Unit.INSTANCE;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(objValueOf);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new KCConfigException(thM103847exceptionOrNullimpl, "releaseFlutterFragment", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        frameLayout.setId(this.f15350U);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (C12573b.f21598a.m23696a()) {
            "EVENT_KYC_RELEASE".length();
        }
        C12572a.m23692a(this, true, new AlphaFragmentWrap$onViewCreated$$inlined$bindFlowEvent$1("EVENT_KYC_RELEASE", null, this));
    }

    /* JADX INFO: renamed from: m3 */
    public static final void m14984m3(AlphaFragment alphaFragment, AlphaFragmentWrap alphaFragmentWrap) {
        AlphaFragment alphaFragment2;
        if (alphaFragment.isAdded() && (alphaFragment2 = alphaFragmentWrap.f15351V) == alphaFragment) {
            if (alphaFragment2 != null) {
                C27032f.m66622m(alphaFragmentWrap, alphaFragment2);
            }
            alphaFragmentWrap.f15351V = null;
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m14985n3();
    }
}
