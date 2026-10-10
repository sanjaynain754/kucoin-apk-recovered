package p532pc;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.copytrading.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: pc.h */
/* JADX INFO: compiled from: ViewLeadTradingHeaderBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class C43439h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f95945a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f95946b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f95947c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSecondaryButton f95948d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f95949e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f95950f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f95951g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShapeLinearLayout f95952h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f95953i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ConstraintLayout f95954j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f95955k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f95956l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final LinearLayout f95957m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ShowHideTextView f95958n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ShowHideTextView f95959o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f95960p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final DashTextView f95961q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final ShowHideTextView f95962r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f95963s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final ShowHideTextView f95964t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final ShowHideTextView f95965u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final DashTextView f95966v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final ShowHideTextView f95967w;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43439h m95639a(@NonNull View view) {
        int i11 = R$id.accountInfoHeaderContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.btnLeadTrading;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.btnTransfer;
                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcSecondaryButton != null) {
                    i11 = R$id.ivGuide;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.llPnl;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout != null) {
                            i11 = R$id.llProfit;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout != null) {
                                i11 = R$id.llProfitShape;
                                ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (shapeLinearLayout != null) {
                                    i11 = R$id.llUnPnl;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout2 != null) {
                                        i11 = R$id.llUnProfitShare;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                        if (constraintLayout2 != null) {
                                            i11 = R$id.myLeadingLabel;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.rbCopy;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    i11 = R$id.rb_group;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                    if (linearLayout3 != null) {
                                                        i11 = R$id.tvPnLegal;
                                                        ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (showHideTextView != null) {
                                                            i11 = R$id.tvPnValue;
                                                            ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (showHideTextView2 != null) {
                                                                i11 = R$id.tvPnlLabel;
                                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView3 != null) {
                                                                    i11 = R$id.tvProfitLabel;
                                                                    DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (dashTextView != null) {
                                                                        i11 = R$id.tvProfitValue;
                                                                        ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (showHideTextView3 != null) {
                                                                            i11 = R$id.tvUnPnlLabel;
                                                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView4 != null) {
                                                                                i11 = R$id.tvUnPnlLegal;
                                                                                ShowHideTextView showHideTextView4 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (showHideTextView4 != null) {
                                                                                    i11 = R$id.tvUnPnlValue;
                                                                                    ShowHideTextView showHideTextView5 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (showHideTextView5 != null) {
                                                                                        i11 = R$id.tvUnProfitShareLabel;
                                                                                        DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (dashTextView2 != null) {
                                                                                            i11 = R$id.tvUnProfitShareValue;
                                                                                            ShowHideTextView showHideTextView6 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (showHideTextView6 != null) {
                                                                                                return new C43439h((ConstraintLayout) view, frameLayout, kcPrimaryButton, kcSecondaryButton, imageView, linearLayout, constraintLayout, shapeLinearLayout, linearLayout2, constraintLayout2, baseTextView, baseTextView2, linearLayout3, showHideTextView, showHideTextView2, baseTextView3, dashTextView, showHideTextView3, baseTextView4, showHideTextView4, showHideTextView5, dashTextView2, showHideTextView6);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f95945a;
    }

    public C43439h(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull LinearLayout linearLayout3, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull BaseTextView baseTextView3, @NonNull DashTextView dashTextView, @NonNull ShowHideTextView showHideTextView3, @NonNull BaseTextView baseTextView4, @NonNull ShowHideTextView showHideTextView4, @NonNull ShowHideTextView showHideTextView5, @NonNull DashTextView dashTextView2, @NonNull ShowHideTextView showHideTextView6) {
        this.f95945a = constraintLayout;
        this.f95946b = frameLayout;
        this.f95947c = kcPrimaryButton;
        this.f95948d = kcSecondaryButton;
        this.f95949e = imageView;
        this.f95950f = linearLayout;
        this.f95951g = constraintLayout2;
        this.f95952h = shapeLinearLayout;
        this.f95953i = linearLayout2;
        this.f95954j = constraintLayout3;
        this.f95955k = baseTextView;
        this.f95956l = baseTextView2;
        this.f95957m = linearLayout3;
        this.f95958n = showHideTextView;
        this.f95959o = showHideTextView2;
        this.f95960p = baseTextView3;
        this.f95961q = dashTextView;
        this.f95962r = showHideTextView3;
        this.f95963s = baseTextView4;
        this.f95964t = showHideTextView4;
        this.f95965u = showHideTextView5;
        this.f95966v = dashTextView2;
        this.f95967w = showHideTextView6;
    }
}
