package q10;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.search.R$id;

/* JADX INFO: renamed from: q10.h */
/* JADX INFO: compiled from: SearchLayoutEmptyBinding.java */
/* JADX INFO: loaded from: classes44.dex */
public final class C43588h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f96210a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f96211b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f96212c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43588h m95926a(@NonNull View view) {
        int i11 = R$id.empty_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.empty_tips;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C43588h((LinearLayout) view, imageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f96210a;
    }

    public C43588h(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView) {
        this.f96210a = linearLayout;
        this.f96211b = imageView;
        this.f96212c = baseTextView;
    }
}
