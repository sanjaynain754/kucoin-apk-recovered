package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.j3 */
/* JADX INFO: compiled from: PaymentViewFastLivePriceExplainBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37640j3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f84100a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f84101b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84102c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37640j3 m84864a(@NonNull View view) {
        int i11 = R$id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.tvLivePrice;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C37640j3(view, viewFindChildViewById, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84100a;
    }

    public C37640j3(@NonNull View view, @NonNull View view2, @NonNull BaseTextView baseTextView) {
        this.f84100a = view;
        this.f84101b = view2;
        this.f84102c = baseTextView;
    }
}
