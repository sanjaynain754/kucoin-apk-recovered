package com.kubi.kumex.dialog;

import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StopProfitLossGuideDialog.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J&\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0012H\u0002¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kumex/dialog/StopProfitLossGuideDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "showStepOne", "Landroid/widget/FrameLayout;", "showStepTwo", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StopProfitLossGuideDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public static final Companion f28873q0 = new Companion(null);

    /* JADX INFO: compiled from: StopProfitLossGuideDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/dialog/StopProfitLossGuideDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            if (DataMapUtil.f54245a.m66370a("bkumex_stop_profit_loss_guide", false)) {
                return;
            }
            new StopProfitLossGuideDialog().show(manager, "StopProfitLossGuideDialog");
        }
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m33564l4(StopProfitLossGuideDialog stopProfitLossGuideDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c(C17060n0.m36552b(), "TpLsEdu", "3", null, 8, null);
        DataMapUtil.f54245a.m66377l("bkumex_stop_profit_loss_guide", true);
        stopProfitLossGuideDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m33565m4(View view, StopProfitLossGuideDialog stopProfitLossGuideDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        View viewFindViewById = view.findViewById(R$id.tv_skip);
        Intrinsics.checkNotNull(viewFindViewById);
        if (C27046k.m66704s(viewFindViewById)) {
            ((TextView) it).setText(stopProfitLossGuideDialog.getString(R$string.i_already_know));
            ViewExtKt.m66577h(viewFindViewById);
            View viewFindViewById2 = view.findViewById(R$id.container);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            stopProfitLossGuideDialog.m33567o4((FrameLayout) viewFindViewById2);
            C43852m.m96591c(C17060n0.m36552b(), "TpLsEdu", null, null, 12, null);
        } else {
            C43852m.m96591c(C17060n0.m36552b(), "TpLsEdu", "2", null, 8, null);
            DataMapUtil.f54245a.m66377l("bkumex_stop_profit_loss_guide", true);
            stopProfitLossGuideDialog.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
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
        return inflater.inflate(R$layout.bkumex_dialog_profit_loss_guide, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull final View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C43852m.m96595g(C17060n0.m36552b(), "TpLsEdu", null, null, 12, null);
        m54191p3();
        View viewFindViewById = view.findViewById(R$id.tv_skip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById, new Function1() { // from class: com.kubi.kumex.dialog.q2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StopProfitLossGuideDialog.m33564l4(this.f28973b, (View) obj);
            }
        });
        View viewFindViewById2 = view.findViewById(R$id.tv_action);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById2, new Function1() { // from class: com.kubi.kumex.dialog.r2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StopProfitLossGuideDialog.m33565m4(view, this, (View) obj);
            }
        });
        View viewFindViewById3 = view.findViewById(R$id.container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        m33566n4((FrameLayout) viewFindViewById3);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m33566n4(FrameLayout frameLayout) {
        View viewInflate = LayoutInflater.from(frameLayout.getContext()).inflate(R$layout.bkumex_profit_loss_guide_step_one, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewInflate, layoutParams);
        ComponentCallbacks2C5309c.m6557u(viewInflate).mo6632t(Integer.valueOf(R$mipmap.bkumex_stop_profit_loss_guide_top)).m6594E0((ImageView) viewInflate.findViewById(R$id.iv_guide_top));
        ComponentCallbacks2C5309c.m6557u(viewInflate).mo6632t(Integer.valueOf(R$mipmap.bkumex_stop_profit_loss_guide_bottom)).m6594E0((ImageView) viewInflate.findViewById(R$id.iv_guide_bottom));
        View viewFindViewById = viewInflate.findViewById(R$id.top);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExKt.m36484j(viewFindViewById, 4.0f);
        View viewFindViewById2 = viewInflate.findViewById(R$id.bottom);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ViewExKt.m36484j(viewFindViewById2, 4.0f);
        TextView textView = (TextView) requireView().findViewById(R$id.tv_title);
        C27096v0 c27096v0 = new C27096v0();
        C27017c c27017c = C27017c.f54310a;
        textView.setText(c27096v0.m66905e("1", c27017c.m66512a(R$color.primary)).m66903c("/2  ", new AbsoluteSizeSpan(12, true), new ForegroundColorSpan(c27017c.m66512a(R$color.emphasis60))).append(c27017c.m66516f(R$string.bkumex_stop_profit_loss_guide_title_one, new Object[0])));
        ((TextView) requireView().findViewById(R$id.tv_content)).setText(getString(R$string.bkumex_stop_profit_loss_guide_desc_one));
    }

    /* JADX INFO: renamed from: o4 */
    public final void m33567o4(FrameLayout frameLayout) {
        frameLayout.removeAllViews();
        View viewInflate = LayoutInflater.from(frameLayout.getContext()).inflate(R$layout.bkumex_profit_loss_guide_step_two, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewInflate, layoutParams);
        View viewFindViewById = viewInflate.findViewById(R$id.step_two);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExKt.m36484j(viewFindViewById, 4.0f);
        TextView textView = (TextView) requireView().findViewById(R$id.tv_title);
        C27096v0 c27096v0 = new C27096v0();
        C27017c c27017c = C27017c.f54310a;
        textView.setText(c27096v0.m66905e("2", c27017c.m66512a(R$color.primary)).m66903c("/2  ", new AbsoluteSizeSpan(12, true), new ForegroundColorSpan(c27017c.m66512a(R$color.emphasis60))).append(c27017c.m66516f(R$string.bkumex_stop_profit_loss_guide_title_two, new Object[0])));
        ((TextView) requireView().findViewById(R$id.tv_content)).setText(getString(R$string.bkumex_stop_profit_loss_guide_desc_two));
    }
}
