package c70;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;
import com.kubi.user.view.EmailPhoneInputView;

/* JADX INFO: renamed from: c70.l */
/* JADX INFO: compiled from: BusercenterFragmentResetBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4881l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f5189a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5190b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final EmailPhoneInputView f5191c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4881l m5041a(@NonNull View view) {
        int i11 = R$id.btnNext;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.resetInputEmailPhone;
            EmailPhoneInputView emailPhoneInputView = (EmailPhoneInputView) ViewBindings.findChildViewById(view, i11);
            if (emailPhoneInputView != null) {
                return new C4881l((NestedScrollView) view, kcPrimaryButton, emailPhoneInputView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.f5189a;
    }

    public C4881l(@NonNull NestedScrollView nestedScrollView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull EmailPhoneInputView emailPhoneInputView) {
        this.f5189a = nestedScrollView;
        this.f5190b = kcPrimaryButton;
        this.f5191c = emailPhoneInputView;
    }
}
