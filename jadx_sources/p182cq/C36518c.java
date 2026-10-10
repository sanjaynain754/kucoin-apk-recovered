package p182cq;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mart.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: cq.c */
/* JADX INFO: compiled from: MartLayoutSortHeaderBinding.java */
/* JADX INFO: loaded from: classes28.dex */
public final class C36518c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79356a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f79357b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f79358c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f79359d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f79360e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f79361f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f79362g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f79363h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36518c m81765a(@NonNull View view) {
        int i11 = R$id.ivChangeRate;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivName;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.ivPrice;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.layoutChangeRate;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.layoutName;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout2 != null) {
                            i11 = R$id.layoutPrice;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout3 != null) {
                                i11 = R$id.vLinde;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    return new C36518c((ConstraintLayout) view, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, baseTextView);
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
        return this.f79356a;
    }

    public C36518c(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView) {
        this.f79356a = constraintLayout;
        this.f79357b = imageView;
        this.f79358c = imageView2;
        this.f79359d = imageView3;
        this.f79360e = linearLayout;
        this.f79361f = linearLayout2;
        this.f79362g = linearLayout3;
        this.f79363h = baseTextView;
    }
}
