package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: ta.g6 */
/* JADX INFO: compiled from: ViewSearchWidgetBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44775g6 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99997a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f99998b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99999c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44775g6 m99066a(@NonNull View view) {
        int i11 = R$id.etSearch;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.ivSearch;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                return new C44775g6((LinearLayout) view, clearEditText, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f99997a;
    }

    public C44775g6(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull ImageView imageView) {
        this.f99997a = linearLayout;
        this.f99998b = clearEditText;
        this.f99999c = imageView;
    }
}
