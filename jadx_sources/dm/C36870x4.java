package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.x4 */
/* JADX INFO: compiled from: BkumexWelfareEmptyBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36870x4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f81340a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f81341b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36870x4 m82608a(@NonNull View view) {
        int i11 = R$id.tv_confirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            return new C36870x4((LinearLayoutCompat) view, kcPrimaryButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f81340a;
    }

    public C36870x4(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f81340a = linearLayoutCompat;
        this.f81341b = kcPrimaryButton;
    }
}
