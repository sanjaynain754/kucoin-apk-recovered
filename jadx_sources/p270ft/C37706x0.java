package p270ft;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.x0 */
/* JADX INFO: compiled from: PaymentDialogFastSellAvailableBalanceBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37706x0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84851a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84852b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f84853c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f84854d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f84855e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f84856f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f84857g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f84858h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f84859i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37706x0 m84999a(@NonNull View view) {
        int i11 = R$id.ivClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tvAvailableBalanceEnd;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                i11 = R$id.tvAvailableBalanceStart;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView2 != null) {
                    i11 = R$id.tvCanWithdrawBalanceEnd;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView3 != null) {
                        i11 = R$id.tvCanWithdrawBalanceStart;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView4 != null) {
                            i11 = R$id.tvConfirm;
                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                            if (kcPrimaryButton != null) {
                                i11 = R$id.tvDescription;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                if (textView5 != null) {
                                    i11 = R$id.tvTitle;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                    if (textView6 != null) {
                                        return new C37706x0((ConstraintLayout) view, appCompatImageView, textView, textView2, textView3, textView4, kcPrimaryButton, textView5, textView6);
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
        return this.f84851a;
    }

    public C37706x0(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f84851a = constraintLayout;
        this.f84852b = appCompatImageView;
        this.f84853c = textView;
        this.f84854d = textView2;
        this.f84855e = textView3;
        this.f84856f = textView4;
        this.f84857g = kcPrimaryButton;
        this.f84858h = textView5;
        this.f84859i = textView6;
    }
}
