package p270ft;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.q0 */
/* JADX INFO: compiled from: PaymentActivityPayFiatBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37672q0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84413a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f84414b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f84415c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f84416d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f84417e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f84418f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f84419g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84420h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f84421i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final FrameLayout f84422j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37672q0 m84930a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.fl_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.iv_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_more;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.iv_order;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.iv_triangle;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.tv_title;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_bar))) != null) {
                                i11 = R$id.view_more;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                if (frameLayout2 != null) {
                                    return new C37672q0(constraintLayout, frameLayout, imageView, imageView2, appCompatImageView, appCompatImageView2, constraintLayout, baseTextView, viewFindChildViewById, frameLayout2);
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
        return this.f84413a;
    }

    public C37672q0(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView, @NonNull View view, @NonNull FrameLayout frameLayout2) {
        this.f84413a = constraintLayout;
        this.f84414b = frameLayout;
        this.f84415c = imageView;
        this.f84416d = imageView2;
        this.f84417e = appCompatImageView;
        this.f84418f = appCompatImageView2;
        this.f84419g = constraintLayout2;
        this.f84420h = baseTextView;
        this.f84421i = view;
        this.f84422j = frameLayout2;
    }
}
