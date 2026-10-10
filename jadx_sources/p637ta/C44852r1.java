package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.r1 */
/* JADX INFO: compiled from: AssetLayoutAddCountryCodeBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44852r1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f100719a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f100720b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100721c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f100722d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44852r1 m99229a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.iv_flag;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tv_choose_phone_code;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                return new C44852r1(view, imageView, baseTextView, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f100719a;
    }

    public C44852r1(@NonNull View view, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull View view2) {
        this.f100719a = view;
        this.f100720b = imageView;
        this.f100721c = baseTextView;
        this.f100722d = view2;
    }
}
