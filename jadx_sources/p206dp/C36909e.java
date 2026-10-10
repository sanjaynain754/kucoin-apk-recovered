package p206dp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dp.e */
/* JADX INFO: compiled from: BmarginDialogMarginCrossClosePositionBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36909e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81662a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81663b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f81664c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f81665d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C36911f f81666e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81667f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f81668g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81669h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81670i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AlertTipsTextView f81671j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81672k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36909e m82687a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.cancelTipsView;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.confirm;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.currencyLayout))) != null) {
                    C36911f c36911fM82691a = C36911f.m82691a(viewFindChildViewById);
                    i11 = R$id.currencyTitleView;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
                        i11 = R$id.onlyDebtTipView;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tips;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.tipsView;
                                AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                if (alertTipsTextView != null) {
                                    i11 = R$id.title;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        return new C36909e((ConstraintLayout) view, baseTextView, appCompatImageView, kcPrimaryButton, c36911fM82691a, baseTextView2, viewFindChildViewById2, baseTextView3, baseTextView4, alertTipsTextView, baseTextView5);
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
        return this.f81662a;
    }

    public C36909e(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull C36911f c36911f, @NonNull BaseTextView baseTextView2, @NonNull View view, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull AlertTipsTextView alertTipsTextView, @NonNull BaseTextView baseTextView5) {
        this.f81662a = constraintLayout;
        this.f81663b = baseTextView;
        this.f81664c = appCompatImageView;
        this.f81665d = kcPrimaryButton;
        this.f81666e = c36911f;
        this.f81667f = baseTextView2;
        this.f81668g = view;
        this.f81669h = baseTextView3;
        this.f81670i = baseTextView4;
        this.f81671j = alertTipsTextView;
        this.f81672k = baseTextView5;
    }
}
