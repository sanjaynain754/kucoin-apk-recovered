package c70;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.t0 */
/* JADX INFO: compiled from: ViewPasswordStrengthBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4898t0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f5330a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f5331b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f5332c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f5333d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f5334e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f5335f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f5336g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4898t0 m5075a(@NonNull View view) {
        int i11 = R$id.level1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.level2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.level3;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i11 = R$id.tvStrength;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvStrengthTips;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C4898t0(linearLayout, imageView, imageView2, imageView3, linearLayout, baseTextView, baseTextView2);
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
    public LinearLayout getRoot() {
        return this.f5330a;
    }

    public C4898t0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f5330a = linearLayout;
        this.f5331b = imageView;
        this.f5332c = imageView2;
        this.f5333d = imageView3;
        this.f5334e = linearLayout2;
        this.f5335f = baseTextView;
        this.f5336g = baseTextView2;
    }
}
