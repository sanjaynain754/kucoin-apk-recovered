package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.f */
/* JADX INFO: compiled from: BkumexDialogAirdropPositionDetailsBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36757f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79973a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatTextView f79974b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f79975c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AlertTipsTextView f79976d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f79977e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatTextView f79978f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatTextView f79979g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatTextView f79980h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatTextView f79981i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AppCompatTextView f79982j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f79983k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final AppCompatTextView f79984l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final AppCompatTextView f79985m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36757f m82365a(@NonNull View view) {
        int i11 = R$id.check;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
        if (appCompatTextView != null) {
            i11 = R$id.close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.desc;
                AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i11);
                if (alertTipsTextView != null) {
                    i11 = R$id.know;
                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton != null) {
                        i11 = R$id.maxWithdraw;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatTextView2 != null) {
                            i11 = R$id.maxWithdrawLabel;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatTextView3 != null) {
                                i11 = R$id.profit;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatTextView4 != null) {
                                    i11 = R$id.time;
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatTextView5 != null) {
                                        i11 = R$id.timeLabel;
                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                        if (appCompatTextView6 != null) {
                                            i11 = R$id.title;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tradeAmount;
                                                AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                if (appCompatTextView7 != null) {
                                                    i11 = R$id.withdrawLabel;
                                                    AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (appCompatTextView8 != null) {
                                                        return new C36757f((ConstraintLayout) view, appCompatTextView, appCompatImageView, alertTipsTextView, kcPrimaryButton, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, baseTextView, appCompatTextView7, appCompatTextView8);
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
        return this.f79973a;
    }

    public C36757f(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull AlertTipsTextView alertTipsTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull AppCompatTextView appCompatTextView6, @NonNull BaseTextView baseTextView, @NonNull AppCompatTextView appCompatTextView7, @NonNull AppCompatTextView appCompatTextView8) {
        this.f79973a = constraintLayout;
        this.f79974b = appCompatTextView;
        this.f79975c = appCompatImageView;
        this.f79976d = alertTipsTextView;
        this.f79977e = kcPrimaryButton;
        this.f79978f = appCompatTextView2;
        this.f79979g = appCompatTextView3;
        this.f79980h = appCompatTextView4;
        this.f79981i = appCompatTextView5;
        this.f79982j = appCompatTextView6;
        this.f79983k = baseTextView;
        this.f79984l = appCompatTextView7;
        this.f79985m = appCompatTextView8;
    }
}
