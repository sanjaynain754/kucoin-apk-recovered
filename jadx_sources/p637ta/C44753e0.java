package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ta.e0 */
/* JADX INFO: compiled from: AssetDialogSmallAssetHideBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44753e0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99790a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCheckBox f99791b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSecondaryButton f99792c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44753e0 m99020a(@NonNull View view) {
        int i11 = R$id.cbHideSmall;
        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
        if (kuCheckBox != null) {
            i11 = R$id.tvCancel;
            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcSecondaryButton != null) {
                return new C44753e0((LinearLayout) view, kuCheckBox, kcSecondaryButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f99790a;
    }

    public C44753e0(@NonNull LinearLayout linearLayout, @NonNull KuCheckBox kuCheckBox, @NonNull KcSecondaryButton kcSecondaryButton) {
        this.f99790a = linearLayout;
        this.f99791b = kuCheckBox;
        this.f99792c = kcSecondaryButton;
    }
}
