package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.round.widget.RoundImageView;

/* JADX INFO: renamed from: ta.x2 */
/* JADX INFO: compiled from: AssetWithdrawSettingTipDialogBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44895x2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101121a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f101122b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f101123c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RoundImageView f101124d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f101125e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f101126f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcSecondaryButton f101127g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcPrimaryButton f101128h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AlertTipsTextView f101129i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f101130j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f101131k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44895x2 m99314a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.alert_dialog_root;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.rivTopImage;
                RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
                if (roundImageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.tv_content;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_left_btn;
                        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                        if (kcSecondaryButton != null) {
                            i11 = R$id.tv_right_btn;
                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                            if (kcPrimaryButton != null) {
                                i11 = R$id.tv_tip;
                                AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                                if (alertTipsTextView != null) {
                                    i11 = R$id.tv_title;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_spacingHeight))) != null) {
                                        return new C44895x2(constraintLayout, linearLayoutCompat, imageView, roundImageView, constraintLayout, baseTextView, kcSecondaryButton, kcPrimaryButton, alertTipsTextView, baseTextView2, viewFindChildViewById);
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
        return this.f101121a;
    }

    public C44895x2(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull RoundImageView roundImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AlertTipsTextView alertTipsTextView, @NonNull BaseTextView baseTextView2, @NonNull View view) {
        this.f101121a = constraintLayout;
        this.f101122b = linearLayoutCompat;
        this.f101123c = imageView;
        this.f101124d = roundImageView;
        this.f101125e = constraintLayout2;
        this.f101126f = baseTextView;
        this.f101127g = kcSecondaryButton;
        this.f101128h = kcPrimaryButton;
        this.f101129i = alertTipsTextView;
        this.f101130j = baseTextView2;
        this.f101131k = view;
    }
}
