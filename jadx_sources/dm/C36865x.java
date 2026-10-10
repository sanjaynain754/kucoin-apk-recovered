package dm;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.x */
/* JADX INFO: compiled from: BkumexDialogFutureOpenFuturesSuccessBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36865x implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81296a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f81297b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f81298c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f81299d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81300e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81301f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36865x m82596a(@NonNull View view) {
        int i11 = R$id.btnActive;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv1;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.tv1;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv2;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C36865x((ConstraintLayout) view, kcPrimaryButton, imageView, imageView2, baseTextView, baseTextView2);
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
        return this.f81296a;
    }

    public C36865x(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f81296a = constraintLayout;
        this.f81297b = kcPrimaryButton;
        this.f81298c = imageView;
        this.f81299d = imageView2;
        this.f81300e = baseTextView;
        this.f81301f = baseTextView2;
    }
}
