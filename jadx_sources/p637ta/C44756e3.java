package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;

/* JADX INFO: renamed from: ta.e3 */
/* JADX INFO: compiled from: DepositNavigationBarBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44756e3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f99804a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f99805b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f99806c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f99807d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f99808e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44756e3 m99026a(@NonNull View view) {
        int i11 = R$id.layout_back;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.llRight;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.title_icon_right_one;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.title_icon_right_two;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        return new C44756e3((FrameLayout) view, linearLayoutCompat, linearLayout, imageView, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f99804a;
    }

    public C44756e3(@NonNull FrameLayout frameLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2) {
        this.f99804a = frameLayout;
        this.f99805b = linearLayoutCompat;
        this.f99806c = linearLayout;
        this.f99807d = imageView;
        this.f99808e = frameLayout2;
    }
}
