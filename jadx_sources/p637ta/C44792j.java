package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ta.j */
/* JADX INFO: compiled from: AssetCoinDetailButtonViewBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44792j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100196a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f100197b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f100198c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSecondaryButton f100199d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcSecondaryButton f100200e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44792j m99102a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.tvDeposit;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.tvTransfer;
            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcSecondaryButton != null) {
                i11 = R$id.tvWithdraw;
                KcSecondaryButton kcSecondaryButton2 = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcSecondaryButton2 != null) {
                    return new C44792j(linearLayout, linearLayout, kcPrimaryButton, kcSecondaryButton, kcSecondaryButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100196a;
    }

    public C44792j(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcSecondaryButton kcSecondaryButton2) {
        this.f100196a = linearLayout;
        this.f100197b = linearLayout2;
        this.f100198c = kcPrimaryButton;
        this.f100199d = kcSecondaryButton;
        this.f100200e = kcSecondaryButton2;
    }
}
