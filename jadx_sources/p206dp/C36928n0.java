package p206dp;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dp.n0 */
/* JADX INFO: compiled from: BmarginLayoutDelegationEmptyBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36928n0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81848a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f81849b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81850c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36928n0 m82724a(@NonNull View view) {
        int i11 = R$id.iv_empty_his;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tv_empty_tips;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C36928n0((LinearLayout) view, imageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81848a;
    }

    public C36928n0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView) {
        this.f81848a = linearLayout;
        this.f81849b = imageView;
        this.f81850c = baseTextView;
    }
}
