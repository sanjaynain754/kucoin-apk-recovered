package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ta.y */
/* JADX INFO: compiled from: AssetDialogDepositContractAddressBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44899y implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101160a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f101161b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSecondaryButton f101162c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f101163d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101164e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f101165f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44899y m99322a(@NonNull View view) {
        int i11 = R$id.ivCopy;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvConfirm;
            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcSecondaryButton != null) {
                i11 = R$id.tvContent;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvContractAddress;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tvTitle;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            return new C44899y((ConstraintLayout) view, imageView, kcSecondaryButton, baseTextView, baseTextView2, baseTextView3);
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
        return this.f101160a;
    }

    public C44899y(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f101160a = constraintLayout;
        this.f101161b = imageView;
        this.f101162c = kcSecondaryButton;
        this.f101163d = baseTextView;
        this.f101164e = baseTextView2;
        this.f101165f = baseTextView3;
    }
}
