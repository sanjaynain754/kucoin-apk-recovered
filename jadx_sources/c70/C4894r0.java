package c70;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.CircleProgressTextView;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.r0 */
/* JADX INFO: compiled from: BusercenterViewUploadImage2Binding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4894r0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5288a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f5289b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f5290c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f5291d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f5292e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f5293f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f5294g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f5295h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f5296i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f5297j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final FrameLayout f5298k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f5299l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ImageView f5300m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final CircleProgressTextView f5301n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4894r0 m5067a(@NonNull View view) {
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
                                        i11 = R$id.f53591ok;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView4 != null) {
                                            i11 = R$id.progress;
                                            CircleProgressTextView circleProgressTextView = (CircleProgressTextView) ViewBindings.findChildViewById(view, i11);
                                            if (circleProgressTextView != null) {
                                                return new C4894r0(constraintLayout, imageView, frameLayout, frameLayout2, imageView2, imageView3, textView, viewFindChildViewById, constraintLayout, linearLayout, frameLayout3, viewFindChildViewById2, imageView4, circleProgressTextView);
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
        return this.f5288a;
    }

    public C4894r0(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout3, @NonNull View view2, @NonNull ImageView imageView4, @NonNull CircleProgressTextView circleProgressTextView) {
        this.f5288a = constraintLayout;
        this.f5289b = imageView;
        this.f5290c = frameLayout;
        this.f5291d = frameLayout2;
        this.f5292e = imageView2;
        this.f5293f = imageView3;
        this.f5294g = textView;
        this.f5295h = view;
        this.f5296i = constraintLayout2;
        this.f5297j = linearLayout;
        this.f5298k = frameLayout3;
        this.f5299l = view2;
        this.f5300m = imageView4;
        this.f5301n = circleProgressTextView;
    }
}
