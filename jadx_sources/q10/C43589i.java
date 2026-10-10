package q10;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.search.R$id;

/* JADX INFO: renamed from: q10.i */
/* JADX INFO: compiled from: SearchLayoutLoadingBinding.java */
/* JADX INFO: loaded from: classes44.dex */
public final class C43589i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f96213a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f96214b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43589i m95928a(@NonNull View view) {
        int i11 = R$id.loading;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            return new C43589i((LinearLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f96213a;
    }

    public C43589i(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView) {
        this.f96213a = linearLayout;
        this.f96214b = imageView;
    }
}
