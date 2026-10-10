package tf;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.fallback.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: tf.a */
/* JADX INFO: compiled from: FallbackFragmentGlobalBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class C44939a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101334a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f101335b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f101336c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f101337d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101338e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44939a m99385a(@NonNull View view) {
        int i11 = R$id.btnUpdate;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.fallback_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.tvDescription;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvTitle;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C44939a((ConstraintLayout) view, kcPrimaryButton, imageView, baseTextView, baseTextView2);
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
        return this.f101334a;
    }

    public C44939a(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f101334a = constraintLayout;
        this.f101335b = kcPrimaryButton;
        this.f101336c = imageView;
        this.f101337d = baseTextView;
        this.f101338e = baseTextView2;
    }
}
