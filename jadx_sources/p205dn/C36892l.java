package p205dn;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.resources.widget.CircleProgressTextView;

/* JADX INFO: renamed from: dn.l */
/* JADX INFO: compiled from: KycViewUploadImage2Binding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36892l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81484a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f81485b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f81486c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f81487d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f81488e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f81489f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f81490g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f81491h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f81492i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f81493j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final FrameLayout f81494k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f81495l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ImageView f81496m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final CircleProgressTextView f81497n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36892l m82653a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.example_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.fl_example;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.fl_label;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout2 != null) {
                    i11 = R$id.icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.image;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView3 != null) {
                            i11 = R$id.label;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.layer))) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i11 = R$id.ll_label;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout != null) {
                                    i11 = R$id.ll_progress;
                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                    if (frameLayout3 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.mask))) != null) {
                                        i11 = R$id.f31059ok;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView4 != null) {
                                            i11 = R$id.progress;
                                            CircleProgressTextView circleProgressTextView = (CircleProgressTextView) ViewBindings.findChildViewById(view, i11);
                                            if (circleProgressTextView != null) {
                                                return new C36892l(constraintLayout, imageView, frameLayout, frameLayout2, imageView2, imageView3, textView, viewFindChildViewById, constraintLayout, linearLayout, frameLayout3, viewFindChildViewById2, imageView4, circleProgressTextView);
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
        return this.f81484a;
    }

    public C36892l(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout3, @NonNull View view2, @NonNull ImageView imageView4, @NonNull CircleProgressTextView circleProgressTextView) {
        this.f81484a = constraintLayout;
        this.f81485b = imageView;
        this.f81486c = frameLayout;
        this.f81487d = frameLayout2;
        this.f81488e = imageView2;
        this.f81489f = imageView3;
        this.f81490g = textView;
        this.f81491h = view;
        this.f81492i = constraintLayout2;
        this.f81493j = linearLayout;
        this.f81494k = frameLayout3;
        this.f81495l = view2;
        this.f81496m = imageView4;
        this.f81497n = circleProgressTextView;
    }
}
