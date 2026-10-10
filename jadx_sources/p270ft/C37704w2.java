package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.w2 */
/* JADX INFO: compiled from: PaymentViewConfirmFooterBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37704w2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f84826a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84827b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f84828c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f84829d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84830e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37704w2 m84996a(@NonNull View view) {
        int i11 = R$id.iv_terms;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.ll_terms;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.tv_confirm;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.tv_terms;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        return new C37704w2(view, appCompatImageView, linearLayout, kcPrimaryButton, baseTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84826a;
    }

    public C37704w2(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView) {
        this.f84826a = view;
        this.f84827b = appCompatImageView;
        this.f84828c = linearLayout;
        this.f84829d = kcPrimaryButton;
        this.f84830e = baseTextView;
    }
}
