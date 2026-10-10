package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;

/* JADX INFO: renamed from: dp.v0 */
/* JADX INFO: compiled from: BmarginViewLeverGiftBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36944v0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f82016a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f82017b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f82018c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f82019d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f82020e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36944v0 m82758a(@NonNull View view) {
        int i11 = R$id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_go;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.iv_src;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.ll_gift;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        return new C36944v0(view, imageView, imageView2, imageView3, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f82016a;
    }

    public C36944v0(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull FrameLayout frameLayout) {
        this.f82016a = view;
        this.f82017b = imageView;
        this.f82018c = imageView2;
        this.f82019d = imageView3;
        this.f82020e = frameLayout;
    }
}
