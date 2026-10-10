package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.k2 */
/* JADX INFO: compiled from: AssetViewEmptyBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44803k2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100291a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f100292b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100293c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44803k2 m99126a(@NonNull View view) {
        int i11 = R$id.empty_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.empty_tips;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C44803k2((LinearLayout) view, imageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f100291a;
    }

    public C44803k2(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView) {
        this.f100291a = linearLayout;
        this.f100292b = imageView;
        this.f100293c = baseTextView;
    }
}
