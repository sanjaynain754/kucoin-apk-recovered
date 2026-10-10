package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.KuCheckBox;

/* JADX INFO: renamed from: ta.o */
/* JADX INFO: compiled from: AssetDialogAccountSettingBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44829o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100527a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCheckBox f100528b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f100529c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44829o m99184a(@NonNull View view) {
        int i11 = R$id.cbHideSmall;
        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
        if (kuCheckBox != null) {
            i11 = R$id.layoutManageAccounts;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                return new C44829o((LinearLayout) view, kuCheckBox, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100527a;
    }

    public C44829o(@NonNull LinearLayout linearLayout, @NonNull KuCheckBox kuCheckBox, @NonNull LinearLayout linearLayout2) {
        this.f100527a = linearLayout;
        this.f100528b = kuCheckBox;
        this.f100529c = linearLayout2;
    }
}
