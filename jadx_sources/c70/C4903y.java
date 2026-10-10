package c70;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.ResendView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.y */
/* JADX INFO: compiled from: BusercenterLayoutExternalAccountCreateCheckBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4903y implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5378a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5379b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextInputEditText f5380c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f5381d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcTextInputLayout f5382e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ResendView f5383f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f5384g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4903y m5085a(@NonNull View view) {
        int i11 = R$id.btnSubmit;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.edtResetAccountCode;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i11);
            if (textInputEditText != null) {
                i11 = R$id.imgClearResetAccountCode;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.inputResetAccount;
                    KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
                    if (kcTextInputLayout != null) {
                        i11 = R$id.tvResetAccountCountDown;
                        ResendView resendView = (ResendView) ViewBindings.findChildViewById(view, i11);
                        if (resendView != null) {
                            i11 = R$id.tvResetAccountSendTips;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                return new C4903y((LinearLayoutCompat) view, kcPrimaryButton, textInputEditText, imageView, kcTextInputLayout, resendView, baseTextView);
                            }
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
    public LinearLayoutCompat getRoot() {
        return this.f5378a;
    }

    public C4903y(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TextInputEditText textInputEditText, @NonNull ImageView imageView, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull ResendView resendView, @NonNull BaseTextView baseTextView) {
        this.f5378a = linearLayoutCompat;
        this.f5379b = kcPrimaryButton;
        this.f5380c = textInputEditText;
        this.f5381d = imageView;
        this.f5382e = kcTextInputLayout;
        this.f5383f = resendView;
        this.f5384g = baseTextView;
    }
}
