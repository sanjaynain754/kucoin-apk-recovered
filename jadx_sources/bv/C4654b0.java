package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: bv.b0 */
/* JADX INFO: compiled from: HoldingsContainerEmptyViewBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4654b0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4229a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f4230b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f4231c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f4232d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4654b0 m4620a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.tv_action;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.tv_holding_status;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C4654b0(linearLayout, linearLayout, kcPrimaryButton, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f4229a;
    }

    public C4654b0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView) {
        this.f4229a = linearLayout;
        this.f4230b = linearLayout2;
        this.f4231c = kcPrimaryButton;
        this.f4232d = baseTextView;
    }
}
