package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.e0 */
/* JADX INFO: compiled from: BkumexDialogHedgeAutoDepositBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36752e0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f79942a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f79943b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSwitchButton f79944c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSwitchButton f79945d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f79946e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f79947f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36752e0 m82355a(@NonNull View view) {
        int i11 = R$id.confirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.switchLong;
            KcSwitchButton kcSwitchButton = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
            if (kcSwitchButton != null) {
                i11 = R$id.switchShort;
                KcSwitchButton kcSwitchButton2 = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
                if (kcSwitchButton2 != null) {
                    i11 = R$id.tvLong;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvShort;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C36752e0((LinearLayout) view, kcPrimaryButton, kcSwitchButton, kcSwitchButton2, baseTextView, baseTextView2);
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
        return this.f79942a;
    }

    public C36752e0(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSwitchButton kcSwitchButton, @NonNull KcSwitchButton kcSwitchButton2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f79942a = linearLayout;
        this.f79943b = kcPrimaryButton;
        this.f79944c = kcSwitchButton;
        this.f79945d = kcSwitchButton2;
        this.f79946e = baseTextView;
        this.f79947f = baseTextView2;
    }
}
