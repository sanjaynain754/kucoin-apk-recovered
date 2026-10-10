package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.KuCheckBox;

/* JADX INFO: renamed from: ta.c2 */
/* JADX INFO: compiled from: AssetTabSortItemsBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44739c2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99667a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCheckBox f99668b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f99669c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KuCheckBox f99670d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f99671e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KuCheckBox f99672f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f99673g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44739c2 m98988a(@NonNull View view) {
        int i11 = R$id.customOrderCheckbox;
        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
        if (kuCheckBox != null) {
            i11 = R$id.customOrderLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.defaultOrderCheckbox;
                KuCheckBox kuCheckBox2 = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
                if (kuCheckBox2 != null) {
                    i11 = R$id.defaultOrderLayout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout2 != null) {
                        i11 = R$id.valueOrderCheckbox;
                        KuCheckBox kuCheckBox3 = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
                        if (kuCheckBox3 != null) {
                            i11 = R$id.valueOrderLayout;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout3 != null) {
                                return new C44739c2((LinearLayout) view, kuCheckBox, linearLayout, kuCheckBox2, linearLayout2, kuCheckBox3, linearLayout3);
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
    public LinearLayout getRoot() {
        return this.f99667a;
    }

    public C44739c2(@NonNull LinearLayout linearLayout, @NonNull KuCheckBox kuCheckBox, @NonNull LinearLayout linearLayout2, @NonNull KuCheckBox kuCheckBox2, @NonNull LinearLayout linearLayout3, @NonNull KuCheckBox kuCheckBox3, @NonNull LinearLayout linearLayout4) {
        this.f99667a = linearLayout;
        this.f99668b = kuCheckBox;
        this.f99669c = linearLayout2;
        this.f99670d = kuCheckBox2;
        this.f99671e = linearLayout3;
        this.f99672f = kuCheckBox3;
        this.f99673g = linearLayout4;
    }
}
