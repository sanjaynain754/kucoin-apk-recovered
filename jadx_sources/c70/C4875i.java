package c70;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.i */
/* JADX INFO: compiled from: BusercenterFragmentLoginVerifyBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4875i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5140a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f5141b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f5142c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f5143d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f5144e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f5145f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f5146g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f5147h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4875i m5028a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.iv_ic_login_verifiy;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tv_verify_no_email;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_verify_subtitle1;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_verify_subtitle2;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.tv_verify_tips;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.tv_verify_title;
                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_line))) != null) {
                                return new C4875i((ConstraintLayout) view, imageView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, viewFindChildViewById);
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
        return this.f5140a;
    }

    public C4875i(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull View view) {
        this.f5140a = constraintLayout;
        this.f5141b = imageView;
        this.f5142c = baseTextView;
        this.f5143d = baseTextView2;
        this.f5144e = baseTextView3;
        this.f5145f = baseTextView4;
        this.f5146g = baseTextView5;
        this.f5147h = view;
    }
}
