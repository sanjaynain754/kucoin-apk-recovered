package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dm.e1 */
/* JADX INFO: compiled from: BkumexDialogTradeProUnavailableBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36753e1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f79948a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSecondaryButton f79949b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f79950c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36753e1 m82357a(@NonNull View view) {
        int i11 = R$id.tv_exit;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null) {
            i11 = R$id.tv_known;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                return new C36753e1((LinearLayoutCompat) view, kcSecondaryButton, kcPrimaryButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f79948a;
    }

    public C36753e1(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f79948a = linearLayoutCompat;
        this.f79949b = kcSecondaryButton;
        this.f79950c = kcPrimaryButton;
    }
}
