package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.g2 */
/* JADX INFO: compiled from: AssetViewAlphaHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44771g2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99966a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AccountInfoHeaderView f99967b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f99968c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f99969d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44771g2 m99058a(@NonNull View view) {
        int i11 = R$id.accountInfoHeader;
        AccountInfoHeaderView accountInfoHeaderView = (AccountInfoHeaderView) ViewBindings.findChildViewById(view, i11);
        if (accountInfoHeaderView != null) {
            i11 = R$id.tvBuy;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.tvSell;
                KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton2 != null) {
                    return new C44771g2((ConstraintLayout) view, accountInfoHeaderView, kcPrimaryButton, kcPrimaryButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99966a;
    }

    public C44771g2(@NonNull ConstraintLayout constraintLayout, @NonNull AccountInfoHeaderView accountInfoHeaderView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2) {
        this.f99966a = constraintLayout;
        this.f99967b = accountInfoHeaderView;
        this.f99968c = kcPrimaryButton;
        this.f99969d = kcPrimaryButton2;
    }
}
