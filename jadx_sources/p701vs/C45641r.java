package p701vs;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.widgets.userstatus.UserStatusGuideCardView;
import com.kubi.resources.widget.AutoSizeShowHideTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: vs.r */
/* JADX INFO: compiled from: OperationWidgetUserStatusAssetBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45641r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102923a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f102924b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f102925c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f102926d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f102927e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayoutCompat f102928f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final DashTextView f102929g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AutoSizeShowHideTextView f102930h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102931i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AutoSizeShowHideTextView f102932j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f102933k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final UserStatusGuideCardView f102934l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45641r m100773a(@NonNull View view) {
        int i11 = R$id.btnDeposit;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.ivArrow;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.ivShowHide;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView2 != null) {
                    i11 = R$id.layoutAsset;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.layoutPnl;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                        if (linearLayoutCompat != null) {
                            i11 = R$id.pnlTitle;
                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                            if (dashTextView != null) {
                                i11 = R$id.pnlValue;
                                AutoSizeShowHideTextView autoSizeShowHideTextView = (AutoSizeShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                if (autoSizeShowHideTextView != null) {
                                    i11 = R$id.tvTitle;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tvTotalAsset;
                                        AutoSizeShowHideTextView autoSizeShowHideTextView2 = (AutoSizeShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                        if (autoSizeShowHideTextView2 != null) {
                                            i11 = R$id.tvUnit;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                i11 = R$id.userStatusGuideCardView;
                                                UserStatusGuideCardView userStatusGuideCardView = (UserStatusGuideCardView) ViewBindings.findChildViewById(view, i11);
                                                if (userStatusGuideCardView != null) {
                                                    return new C45641r((ConstraintLayout) view, kcPrimaryButton, appCompatImageView, appCompatImageView2, constraintLayout, linearLayoutCompat, dashTextView, autoSizeShowHideTextView, baseTextView, autoSizeShowHideTextView2, baseTextView2, userStatusGuideCardView);
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
        return this.f102923a;
    }

    public C45641r(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull DashTextView dashTextView, @NonNull AutoSizeShowHideTextView autoSizeShowHideTextView, @NonNull BaseTextView baseTextView, @NonNull AutoSizeShowHideTextView autoSizeShowHideTextView2, @NonNull BaseTextView baseTextView2, @NonNull UserStatusGuideCardView userStatusGuideCardView) {
        this.f102923a = constraintLayout;
        this.f102924b = kcPrimaryButton;
        this.f102925c = appCompatImageView;
        this.f102926d = appCompatImageView2;
        this.f102927e = constraintLayout2;
        this.f102928f = linearLayoutCompat;
        this.f102929g = dashTextView;
        this.f102930h = autoSizeShowHideTextView;
        this.f102931i = baseTextView;
        this.f102932j = autoSizeShowHideTextView2;
        this.f102933k = baseTextView2;
        this.f102934l = userStatusGuideCardView;
    }
}
