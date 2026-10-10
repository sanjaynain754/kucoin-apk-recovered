package p637ta;

import android.view.View;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: ta.k0 */
/* JADX INFO: compiled from: AssetFragmentAddAddressOrEditRemarkBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44801k0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100268a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CheckBox f100269b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextInputEditText f100270c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcTextInputLayout f100271d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f100272e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShapeTextView f100273f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100274g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100275h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100276i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final KcPrimaryButton f100277j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100278k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44801k0 m99121a(@NonNull View view) {
        int i11 = R$id.checkBox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
        if (checkBox != null) {
            i11 = R$id.etRemark;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i11);
            if (textInputEditText != null) {
                i11 = R$id.inputLayout;
                KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
                if (kcTextInputLayout != null) {
                    i11 = R$id.layoutAccount;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.tvAccount;
                        ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                        if (shapeTextView != null) {
                            i11 = R$id.tvAddress;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvAddressName;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tvBoxTip;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tvConfirm;
                                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                        if (kcPrimaryButton != null) {
                                            i11 = R$id.tvTip;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                return new C44801k0((ConstraintLayout) view, checkBox, textInputEditText, kcTextInputLayout, constraintLayout, shapeTextView, baseTextView, baseTextView2, baseTextView3, kcPrimaryButton, baseTextView4);
                                            }
                                        }
                                    }
                                }
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
    public ConstraintLayout getRoot() {
        return this.f100268a;
    }

    public C44801k0(@NonNull ConstraintLayout constraintLayout, @NonNull CheckBox checkBox, @NonNull TextInputEditText textInputEditText, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ShapeTextView shapeTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView4) {
        this.f100268a = constraintLayout;
        this.f100269b = checkBox;
        this.f100270c = textInputEditText;
        this.f100271d = kcTextInputLayout;
        this.f100272e = constraintLayout2;
        this.f100273f = shapeTextView;
        this.f100274g = baseTextView;
        this.f100275h = baseTextView2;
        this.f100276i = baseTextView3;
        this.f100277j = kcPrimaryButton;
        this.f100278k = baseTextView4;
    }
}
