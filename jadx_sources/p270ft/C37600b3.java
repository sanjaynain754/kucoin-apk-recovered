package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.b3 */
/* JADX INFO: compiled from: PaymentViewFastBuyConfirmFeeItemViewBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37600b3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f83653a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f83654b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83655c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37600b3 m84784a(@NonNull View view) {
        int i11 = R$id.tvFeeValue;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvOriginalFeeValue;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                return new C37600b3(view, baseTextView, baseTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f83653a;
    }

    public C37600b3(@NonNull View view, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f83653a = view;
        this.f83654b = baseTextView;
        this.f83655c = baseTextView2;
    }
}
