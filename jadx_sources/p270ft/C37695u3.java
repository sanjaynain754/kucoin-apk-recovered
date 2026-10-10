package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;

/* JADX INFO: renamed from: ft.u3 */
/* JADX INFO: compiled from: PaymentViewTermBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37695u3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f84741a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KuCheckBox f84742b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84743c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37695u3 m84981a(@NonNull View view) {
        int i11 = R$id.cbTerms;
        KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
        if (kuCheckBox != null) {
            i11 = R$id.tvTerms;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C37695u3(view, kuCheckBox, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84741a;
    }

    public C37695u3(@NonNull View view, @NonNull KuCheckBox kuCheckBox, @NonNull BaseTextView baseTextView) {
        this.f84741a = view;
        this.f84742b = kuCheckBox;
        this.f84743c = baseTextView;
    }
}
