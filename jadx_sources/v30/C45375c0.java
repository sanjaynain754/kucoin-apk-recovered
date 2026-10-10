package v30;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.c0 */
/* JADX INFO: compiled from: KucoinDelegationGuideLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45375c0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102033a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f102034b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f102035c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f102036d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f102037e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45375c0 m100280a(@NonNull View view) {
        int i11 = R$id.ivEmptyIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvAvailableAmount;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvFiatChargeAndTransfer;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tvSpotTutorial;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        return new C45375c0((ConstraintLayout) view, imageView, baseTextView, baseTextView2, baseTextView3);
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
        return this.f102033a;
    }

    public C45375c0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f102033a = constraintLayout;
        this.f102034b = imageView;
        this.f102035c = baseTextView;
        this.f102036d = baseTextView2;
        this.f102037e = baseTextView3;
    }
}
