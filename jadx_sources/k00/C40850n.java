package k00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;

/* JADX INFO: renamed from: k00.n */
/* JADX INFO: compiled from: ViewNavigationbarBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C40850n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f90785a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f90786b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f90787c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f90788d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f90789e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f90790f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f90791g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f90792h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f90793i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f90794j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ViewStub f90795k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40850n m89398a(@NonNull View view) {
        int i11 = R$id.fl_back;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.iv_right_one;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.iv_right_three;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.iv_right_two;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView3 != null) {
                        i11 = R$id.m_iv_navigation_back;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView4 != null) {
                            i11 = R$id.m_iv_navigation_bg;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView5 != null) {
                                i11 = R$id.mLeftText;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.m_tv_navigation_right_text;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.m_tv_navigation_title;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.view_stup;
                                            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i11);
                                            if (viewStub != null) {
                                                return new C40850n(view, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, baseTextView, baseTextView2, baseTextView3, viewStub);
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

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C40850n m89399b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_navigationbar, viewGroup);
        return m89398a(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f90785a;
    }

    public C40850n(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ViewStub viewStub) {
        this.f90785a = view;
        this.f90786b = frameLayout;
        this.f90787c = imageView;
        this.f90788d = imageView2;
        this.f90789e = imageView3;
        this.f90790f = imageView4;
        this.f90791g = imageView5;
        this.f90792h = baseTextView;
        this.f90793i = baseTextView2;
        this.f90794j = baseTextView3;
        this.f90795k = viewStub;
    }
}
