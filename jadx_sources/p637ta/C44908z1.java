package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.KuRadioButton;

/* JADX INFO: renamed from: ta.z1 */
/* JADX INFO: compiled from: AssetSortOptionsBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44908z1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f101229a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f101230b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f101231c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f101232d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KuRadioButton f101233e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KuRadioButton f101234f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KuRadioButton f101235g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44908z1 m99340a(@NonNull View view) {
        int i11 = R$id.layoutAll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.layoutRecommend;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout2 != null) {
                i11 = R$id.layoutSimple;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout3 != null) {
                    i11 = R$id.rbAll;
                    KuRadioButton kuRadioButton = (KuRadioButton) ViewBindings.findChildViewById(view, i11);
                    if (kuRadioButton != null) {
                        i11 = R$id.rbRecommend;
                        KuRadioButton kuRadioButton2 = (KuRadioButton) ViewBindings.findChildViewById(view, i11);
                        if (kuRadioButton2 != null) {
                            i11 = R$id.rbSimple;
                            KuRadioButton kuRadioButton3 = (KuRadioButton) ViewBindings.findChildViewById(view, i11);
                            if (kuRadioButton3 != null) {
                                return new C44908z1((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, kuRadioButton, kuRadioButton2, kuRadioButton3);
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
        return this.f101229a;
    }

    public C44908z1(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull KuRadioButton kuRadioButton, @NonNull KuRadioButton kuRadioButton2, @NonNull KuRadioButton kuRadioButton3) {
        this.f101229a = linearLayout;
        this.f101230b = linearLayout2;
        this.f101231c = linearLayout3;
        this.f101232d = linearLayout4;
        this.f101233e = kuRadioButton;
        this.f101234f = kuRadioButton2;
        this.f101235g = kuRadioButton3;
    }
}
