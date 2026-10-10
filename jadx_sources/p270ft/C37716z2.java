package p270ft;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.z2 */
/* JADX INFO: compiled from: PaymentViewCurrencyEditviewBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37716z2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84974a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatEditText f84975b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f84976c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84977d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84978e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37716z2 m85017a(@NonNull View view) {
        int i11 = R$id.et_currency_amount;
        AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, i11);
        if (appCompatEditText != null) {
            i11 = R$id.input;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.tv_currency_symbol;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_limit_tip;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C37716z2((ConstraintLayout) view, appCompatEditText, linearLayout, baseTextView, baseTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f84974a;
    }

    public C37716z2(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatEditText appCompatEditText, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84974a = constraintLayout;
        this.f84975b = appCompatEditText;
        this.f84976c = linearLayout;
        this.f84977d = baseTextView;
        this.f84978e = baseTextView2;
    }
}
