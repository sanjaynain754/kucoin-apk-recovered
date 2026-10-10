package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.u2 */
/* JADX INFO: compiled from: PaymentThirdPlatformVerifyBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37694u2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84730a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84731b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f84732c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f84733d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84734e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84735f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84736g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84737h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84738i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ConstraintLayout f84739j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f84740k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37694u2 m84979a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.iv_identity_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_identity_verify_status;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.iv_verify;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.tv_identity;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_identity_process_status;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_identity_verify;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_identity_verify_tip;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tv_intro;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.view_identity_verify_status;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                        if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_space))) != null) {
                                            return new C37694u2((ConstraintLayout) view, imageView, imageView2, imageView3, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, constraintLayout, viewFindChildViewById);
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
        return this.f84730a;
    }

    public C37694u2(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull ConstraintLayout constraintLayout2, @NonNull View view) {
        this.f84730a = constraintLayout;
        this.f84731b = imageView;
        this.f84732c = imageView2;
        this.f84733d = imageView3;
        this.f84734e = baseTextView;
        this.f84735f = baseTextView2;
        this.f84736g = baseTextView3;
        this.f84737h = baseTextView4;
        this.f84738i = baseTextView5;
        this.f84739j = constraintLayout2;
        this.f84740k = view;
    }
}
