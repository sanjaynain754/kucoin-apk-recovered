package c70;

import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.m0 */
/* JADX INFO: compiled from: BusercenterUpdatePasskeyNicknameBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4884m0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f5208a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5209b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextInputEditText f5210c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f5211d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcTextInputLayout f5212e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ScrollView f5213f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f5214g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f5215h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4884m0 m5047a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnConfirmNickname;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.clearInputNickname;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i11);
            if (textInputEditText != null) {
                i11 = R$id.imgClearNickname;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.inputLayoutNickname;
                    KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
                    if (kcTextInputLayout != null) {
                        ScrollView scrollView = (ScrollView) view;
                        i11 = R$id.tvNicknameLength;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.updatePasskeyNicknameMask))) != null) {
                            return new C4884m0(scrollView, kcPrimaryButton, textInputEditText, imageView, kcTextInputLayout, scrollView, baseTextView, viewFindChildViewById);
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
    public ScrollView getRoot() {
        return this.f5208a;
    }

    public C4884m0(@NonNull ScrollView scrollView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TextInputEditText textInputEditText, @NonNull ImageView imageView, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull ScrollView scrollView2, @NonNull BaseTextView baseTextView, @NonNull View view) {
        this.f5208a = scrollView;
        this.f5209b = kcPrimaryButton;
        this.f5210c = textInputEditText;
        this.f5211d = imageView;
        this.f5212e = kcTextInputLayout;
        this.f5213f = scrollView2;
        this.f5214g = baseTextView;
        this.f5215h = view;
    }
}
