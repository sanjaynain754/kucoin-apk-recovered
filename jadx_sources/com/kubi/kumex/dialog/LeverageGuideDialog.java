package com.kubi.kumex.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.view.LeverageGuideAnimView;
import com.kubi.kumex.view.LeverageGuideChartAnimView;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: LeverageGuideDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u0005H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\"\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010$\u001a\u00020\u0005*\u00020#2\u0006\u0010%\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010'\u001a\u00020\fH\u0002J)\u0010(\u001a\u00020\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/kumex/dialog/LeverageGuideDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "screenWidth", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/ParameterName;", "name", "dialog", "", "initType", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "initView", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "secondStep", "showEnterAnim", "up", "", "startAnim", "setEnable", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "getTintString", "", "id", "tintText", "", "indexOfs", "str", "thirdStep", "skip", "setCallback", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LeverageGuideDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f28856s0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    public final int f28857q0 = C5267e0.m6183e();

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function1<? super DialogFragment, Unit> f28858r0;

    /* JADX INFO: compiled from: LeverageGuideDialog.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kumex/dialog/LeverageGuideDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/ParameterName;", "name", "dialog", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean show(@NotNull FragmentManager manager, @NotNull Function1<? super DialogFragment, Unit> callback) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (DataMapUtil.f54245a.m66370a("bkumex_leverage_guide", false)) {
                return false;
            }
            new LeverageGuideDialog().m33524z4(callback).show(manager, "LeverageGuideDialog");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.dialog.LeverageGuideDialog$a */
    /* JADX INFO: compiled from: LeverageGuideDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kumex/dialog/LeverageGuideDialog$initView$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC15846a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LeverageGuideAnimView f28859b;

        public ViewTreeObserverOnGlobalLayoutListenerC15846a(LeverageGuideAnimView leverageGuideAnimView) {
            this.f28859b = leverageGuideAnimView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f28859b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f28859b.m36677m();
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.dialog.LeverageGuideDialog$b */
    /* JADX INFO: compiled from: LeverageGuideDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/dialog/LeverageGuideDialog$showEnterAnim$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15847b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f28861b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f28862c;

        public C15847b(View view, boolean z11) {
            this.f28861b = view;
            this.f28862c = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            LeverageGuideDialog.this.m33519D4(this.f28861b, this.f28862c);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final int m33522s4(String str, String str2) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (iIndexOf$default < 0) {
            return 0;
        }
        return iIndexOf$default;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m33500E4(View view, boolean z11, LeverageGuideDialog leverageGuideDialog, Long l11) {
        TextView textView = (TextView) view.findViewById(R$id.tv_percent);
        C27096v0 c27096v0Append = new C27096v0().m66903c("ROE", new AbsoluteSizeSpan(12, true), new ForegroundColorSpan(Color.parseColor("#A3FFFFFF"))).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        int i11 = z11 ? 1 : -1;
        Intrinsics.checkNotNull(l11);
        textView.setText(c27096v0Append.m66903c(C42180b.m92642g(new BigDecimal(String.valueOf((((long) i11) * l11.longValue()) / 10.0d)), null, null, 2, false, false, false, 59, null), new AbsoluteSizeSpan(22, true), new ForegroundColorSpan(Color.parseColor("#FFFFFF"))));
        if (l11.longValue() >= 10) {
            leverageGuideDialog.getF43550U().clear();
            leverageGuideDialog.m33516A4(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m33502H4(LeverageGuideDialog leverageGuideDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c(C17060n0.m36552b(), "LevEdu", "3", null, 8, null);
        leverageGuideDialog.m33518C4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m33512u4(LeverageGuideDialog leverageGuideDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c(C17060n0.m36552b(), "LevEdu", "4", null, 8, null);
        leverageGuideDialog.m33518C4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m33513v4(View view, LeverageGuideDialog leverageGuideDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TextView textView = (TextView) view.findViewById(R$id.tv_content);
        textView.setMinimumHeight(textView.getHeight());
        C43852m.m96591c(C17060n0.m36552b(), "LevEdu", null, null, 12, null);
        leverageGuideDialog.m33523w4(view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m33514x4(LeverageGuideDialog leverageGuideDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c(C17060n0.m36552b(), "LevEdu", "4", null, 8, null);
        leverageGuideDialog.m33518C4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m33515y4(LeverageGuideDialog leverageGuideDialog, View view, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        leverageGuideDialog.m33520G4(view);
        C43852m.m96591c(C17060n0.m36552b(), "LevEdu", "2", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public final void m33517B4(View view, boolean z11) {
        int i11 = R$id.tv_percent;
        TextView textView = (TextView) view.findViewById(i11);
        C27096v0 c27096v0Append = new C27096v0().m66903c("ROE", new AbsoluteSizeSpan(12, true), new ForegroundColorSpan(Color.parseColor("#A3FFFFFF"))).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        textView.setText(c27096v0Append.m66903c(C42180b.m92642g(ZERO, null, null, 2, false, false, true, 27, null), new AbsoluteSizeSpan(22, true), new ForegroundColorSpan(Color.parseColor("#FFFFFF"))));
        m33516A4(false);
        ((TextView) view.findViewById(i11)).setBackgroundResource(z11 ? R$drawable.bkumex_leverage_guide_green : R$drawable.bkumex_leverage_guide_red);
        view.setTranslationX(this.f28857q0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", this.f28857q0, 0.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        ((LeverageGuideChartAnimView) view.findViewById(R$id.chart)).setVisibility(4);
        objectAnimatorOfFloat.addListener(new C15847b(view, z11));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: C4 */
    public final void m33518C4() {
        DataMapUtil.f54245a.m66377l("bkumex_leverage_guide", true);
        Function1<? super DialogFragment, Unit> function1 = this.f28858r0;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final void m33520G4(View view) {
        TextView textView = (TextView) view.findViewById(R$id.tv_title);
        C27096v0 c27096v0 = new C27096v0();
        C27017c c27017c = C27017c.f54310a;
        textView.setText(c27096v0.m66905e("3", c27017c.m66512a(R$color.primary)).m66903c("/3  ", new AbsoluteSizeSpan(12, true), new ForegroundColorSpan(c27017c.m66512a(R$color.emphasis60))).append(c27017c.m66516f(R$string.leverage_guide_title_three, new Object[0])));
        TextView textView2 = (TextView) view.findViewById(R$id.tv_content);
        int i11 = R$string.leverage_guide_content_three;
        String string = getString(R$string.leverage_guide_content_three_hint);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView2.setText(m33521r4(i11, string, false));
        View viewFindViewById = view.findViewById(R$id.cl_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        m33517B4(viewFindViewById, false);
        TextView textView3 = (TextView) view.findViewById(R$id.tv_action);
        View viewFindViewById2 = view.findViewById(R$id.tv_skip);
        Intrinsics.checkNotNull(viewFindViewById2);
        ViewExtKt.m66577h(viewFindViewById2);
        textView3.setText(getString(R$string.i_already_know));
        Intrinsics.checkNotNull(textView3);
        ViewExtKt.m66575f(textView3, new Function1() { // from class: com.kubi.kumex.dialog.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverageGuideDialog.m33502H4(this.f28874b, (View) obj);
            }
        });
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_dialog_leverage_guide, container, false);
        Intrinsics.checkNotNull(viewInflate);
        m33511t4(viewInflate);
        m54191p3();
        return viewInflate;
    }

    /* JADX INFO: renamed from: r4 */
    public final CharSequence m33521r4(@StringRes int i11, String str, boolean z11) {
        String string = getString(R$string.leverage_guide_content_two_hint_one);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C27017c c27017c = C27017c.f54310a;
        String strM66516f = c27017c.m66516f(R$string.one_hundred_percent_num, new Object[0]);
        String strM66516f2 = c27017c.m66516f(i11, string, str, strM66516f);
        C27096v0 c27096v0 = new C27096v0();
        int iM66512a = c27017c.m66512a(z11 ? R$color.primary : R$color.secondary);
        c27096v0.append(strM66516f2);
        int iM33522s4 = m33522s4(strM66516f2, string);
        c27096v0.setSpan(new ForegroundColorSpan(iM66512a), iM33522s4, string.length() + iM33522s4, 0);
        int iM33522s5 = m33522s4(strM66516f2, str);
        c27096v0.setSpan(new ForegroundColorSpan(iM66512a), iM33522s5, str.length() + iM33522s5, 0);
        int iM33522s6 = m33522s4(strM66516f2, strM66516f);
        c27096v0.setSpan(new ForegroundColorSpan(iM66512a), iM33522s6, strM66516f.length() + iM33522s6, 0);
        return c27096v0;
    }

    /* JADX INFO: renamed from: w4 */
    public final void m33523w4(final View view) {
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R$id.container);
        frameLayout.removeAllViews();
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.bkumex_leverage_guide_step_two_three, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R$id.tv_percent)).setText(new C27096v0().m66903c("ROE", new AbsoluteSizeSpan(12, true), new ForegroundColorSpan(Color.parseColor("#A3FFFFFF"))).append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE).m66903c("+ 0", new AbsoluteSizeSpan(22, true), new ForegroundColorSpan(Color.parseColor("#FFFFFF"))));
        TextView textView = (TextView) view.findViewById(R$id.tv_title);
        C27096v0 c27096v0 = new C27096v0();
        C27017c c27017c = C27017c.f54310a;
        textView.setText(c27096v0.m66905e("2", c27017c.m66512a(R$color.primary)).m66903c("/3  ", new AbsoluteSizeSpan(12, true), new ForegroundColorSpan(c27017c.m66512a(R$color.emphasis60))).append(c27017c.m66516f(R$string.leverage_guide_title_two, new Object[0])));
        TextView textView2 = (TextView) view.findViewById(R$id.tv_content);
        int i11 = R$string.leverage_guide_content_two;
        String string = getString(R$string.leverage_guide_content_two_hint_two);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView2.setText(m33521r4(i11, string, true));
        frameLayout.addView(viewInflate);
        View viewFindViewById = view.findViewById(R$id.cl_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        m33517B4(viewFindViewById, true);
        View viewFindViewById2 = view.findViewById(R$id.tv_skip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById2, new Function1() { // from class: com.kubi.kumex.dialog.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverageGuideDialog.m33514x4(this.f29010b, (View) obj);
            }
        });
        View viewFindViewById3 = view.findViewById(R$id.tv_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById3, new Function1() { // from class: com.kubi.kumex.dialog.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverageGuideDialog.m33515y4(this.f29016b, view, (View) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: z4 */
    public final LeverageGuideDialog m33524z4(@NotNull Function1<? super DialogFragment, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f28858r0 = callback;
        return this;
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m33501F4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t4 */
    private final void m33511t4(final View view) {
        C43852m.m96595g(C17060n0.m36552b(), "LevEdu", null, null, 12, null);
        TextView textView = (TextView) view.findViewById(R$id.tv_title);
        C27096v0 c27096v0 = new C27096v0();
        C27017c c27017c = C27017c.f54310a;
        textView.setText(c27096v0.m66905e("1", c27017c.m66512a(R$color.primary)).m66903c("/3  ", new AbsoluteSizeSpan(12, true), new ForegroundColorSpan(c27017c.m66512a(R$color.emphasis60))).append(c27017c.m66516f(R$string.leverage_guide_title_one, new Object[0])));
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.bkumex_leverage_guide_step_one, (ViewGroup) null);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R$id.container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = C27029c.m66603f(this, 15);
        frameLayout.addView(viewInflate, layoutParams);
        LeverageGuideAnimView leverageGuideAnimView = (LeverageGuideAnimView) view.findViewById(R$id.guideAnimView);
        leverageGuideAnimView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC15846a(leverageGuideAnimView));
        ((TextView) view.findViewById(R$id.tv_content)).setText(getString(R$string.leverage_guide_content_one));
        View viewFindViewById = view.findViewById(R$id.tv_skip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById, new Function1() { // from class: com.kubi.kumex.dialog.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverageGuideDialog.m33512u4(this.f29001b, (View) obj);
            }
        });
        View viewFindViewById2 = view.findViewById(R$id.tv_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById2, new Function1() { // from class: com.kubi.kumex.dialog.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverageGuideDialog.m33513v4(view, this, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public final void m33516A4(boolean z11) {
        View view = getView();
        if (view != null) {
            view.findViewById(R$id.tv_action).setEnabled(z11);
            view.findViewById(R$id.tv_skip).setEnabled(z11);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final void m33519D4(final View view, final boolean z11) {
        CompositeDisposable f43550u = getF43550U();
        Observable<Long> observableObserveOn = Observable.interval(0L, 100L, TimeUnit.MILLISECONDS).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.dialog.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverageGuideDialog.m33500E4(view, z11, this, (Long) obj);
            }
        };
        f43550u.add(observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.kumex.dialog.c0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LeverageGuideDialog.m33501F4(function1, obj);
            }
        }));
        ((LeverageGuideChartAnimView) view.findViewById(R$id.chart)).m36683d(z11);
    }
}
