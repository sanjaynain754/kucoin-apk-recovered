package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ta.k3 */
/* JADX INFO: compiled from: DialogRwaAgreementSignBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44804k3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100294a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f100295b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NestedScrollView f100296c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSecondaryButton f100297d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f100298e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100299f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100300g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44804k3 m99128a(@NonNull View view) {
        int i11 = R$id.ivClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.scrollView;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
            if (nestedScrollView != null) {
                i11 = R$id.tvCancel;
                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcSecondaryButton != null) {
                    i11 = R$id.tvConfirm;
                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton != null) {
                        i11 = R$id.tvContent;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvTitle;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                return new C44804k3((ConstraintLayout) view, imageView, nestedScrollView, kcSecondaryButton, kcPrimaryButton, baseTextView, baseTextView2);
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
        return this.f100294a;
    }

    public C44804k3(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull NestedScrollView nestedScrollView, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f100294a = constraintLayout;
        this.f100295b = imageView;
        this.f100296c = nestedScrollView;
        this.f100297d = kcSecondaryButton;
        this.f100298e = kcPrimaryButton;
        this.f100299f = baseTextView;
        this.f100300g = baseTextView2;
    }
}
