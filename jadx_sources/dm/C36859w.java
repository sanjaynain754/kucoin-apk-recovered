package dm;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cpiz.android.bubbleview.BubbleTextView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.AlignTopCheckBox;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.w */
/* JADX INFO: compiled from: BkumexDialogFutureOpenFuturesBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36859w implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81264a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f81265b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BubbleTextView f81266c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AlignTopCheckBox f81267d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f81268e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f81269f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81270g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81271h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36859w m82583a(@NonNull View view) {
        int i11 = R$id.btnActive;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.bubbleTips;
            BubbleTextView bubbleTextView = (BubbleTextView) ViewBindings.findChildViewById(view, i11);
            if (bubbleTextView != null) {
                i11 = R$id.checkBox;
                AlignTopCheckBox alignTopCheckBox = (AlignTopCheckBox) ViewBindings.findChildViewById(view, i11);
                if (alignTopCheckBox != null) {
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
                                    return new C36859w((ConstraintLayout) view, kcPrimaryButton, bubbleTextView, alignTopCheckBox, imageView, imageView2, baseTextView, baseTextView2);
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
        return this.f81264a;
    }

    public C36859w(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BubbleTextView bubbleTextView, @NonNull AlignTopCheckBox alignTopCheckBox, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f81264a = constraintLayout;
        this.f81265b = kcPrimaryButton;
        this.f81266c = bubbleTextView;
        this.f81267d = alignTopCheckBox;
        this.f81268e = imageView;
        this.f81269f = imageView2;
        this.f81270g = baseTextView;
        this.f81271h = baseTextView2;
    }
}
