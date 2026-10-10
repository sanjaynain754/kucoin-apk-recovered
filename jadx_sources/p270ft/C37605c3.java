package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.c3 */
/* JADX INFO: compiled from: PaymentViewFastBuyConfirmHeaderBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37605c3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f83755a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f83756b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83757c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37605c3 m84793a(@NonNull View view) {
        int i11 = R$id.tvAmountValue;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvTitle;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                return new C37605c3(view, baseTextView, baseTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f83755a;
    }

    public C37605c3(@NonNull View view, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f83755a = view;
        this.f83756b = baseTextView;
        this.f83757c = baseTextView2;
    }
}
