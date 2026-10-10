package p206dp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dp.g */
/* JADX INFO: compiled from: BmarginDialogMarginDelegationConfirmBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36913g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81693a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f81694b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f81695c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f81696d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatTextView f81697e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatTextView f81698f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatTextView f81699g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81700h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatTextView f81701i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final DashTextView f81702j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final AppCompatTextView f81703k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final DashTextView f81704l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AppCompatTextView f81705m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81706n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final AppCompatTextView f81707o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final DashTextView f81708p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final AppCompatTextView f81709q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final AppCompatTextView f81710r;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36913g m82695a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.confirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                i11 = R$id.sub_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                if (appCompatTextView != null) {
                    i11 = R$id.title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatTextView2 != null) {
                        i11 = R$id.tvAmount;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatTextView3 != null) {
                            i11 = R$id.tvAmountUnit;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvAutoBorrow;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatTextView4 != null) {
                                    i11 = R$id.tvAutoBorrowLabel;
                                    DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                    if (dashTextView != null) {
                                        i11 = R$id.tvDayRage;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                        if (appCompatTextView5 != null) {
                                            i11 = R$id.tvDayRageLabel;
                                            DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                            if (dashTextView2 != null) {
                                                i11 = R$id.tvFee;
                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                if (appCompatTextView6 != null) {
                                                    i11 = R$id.tvFeeUnit;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tvTax;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (appCompatTextView7 != null) {
                                                            i11 = R$id.tvTaxUnit;
                                                            DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (dashTextView3 != null) {
                                                                i11 = R$id.tv_tips;
                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (appCompatTextView8 != null) {
                                                                    i11 = R$id.tvUseful;
                                                                    AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (appCompatTextView9 != null) {
                                                                        return new C36913g((ConstraintLayout) view, appCompatImageView, kcPrimaryButton, viewFindChildViewById, appCompatTextView, appCompatTextView2, appCompatTextView3, baseTextView, appCompatTextView4, dashTextView, appCompatTextView5, dashTextView2, appCompatTextView6, baseTextView2, appCompatTextView7, dashTextView3, appCompatTextView8, appCompatTextView9);
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
        return this.f81693a;
    }

    public C36913g(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull BaseTextView baseTextView, @NonNull AppCompatTextView appCompatTextView4, @NonNull DashTextView dashTextView, @NonNull AppCompatTextView appCompatTextView5, @NonNull DashTextView dashTextView2, @NonNull AppCompatTextView appCompatTextView6, @NonNull BaseTextView baseTextView2, @NonNull AppCompatTextView appCompatTextView7, @NonNull DashTextView dashTextView3, @NonNull AppCompatTextView appCompatTextView8, @NonNull AppCompatTextView appCompatTextView9) {
        this.f81693a = constraintLayout;
        this.f81694b = appCompatImageView;
        this.f81695c = kcPrimaryButton;
        this.f81696d = view;
        this.f81697e = appCompatTextView;
        this.f81698f = appCompatTextView2;
        this.f81699g = appCompatTextView3;
        this.f81700h = baseTextView;
        this.f81701i = appCompatTextView4;
        this.f81702j = dashTextView;
        this.f81703k = appCompatTextView5;
        this.f81704l = dashTextView2;
        this.f81705m = appCompatTextView6;
        this.f81706n = baseTextView2;
        this.f81707o = appCompatTextView7;
        this.f81708p = dashTextView3;
        this.f81709q = appCompatTextView8;
        this.f81710r = appCompatTextView9;
    }
}
