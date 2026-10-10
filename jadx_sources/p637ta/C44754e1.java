package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.e1 */
/* JADX INFO: compiled from: AssetItemEvmRepeatChainChildBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44754e1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99793a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f99794b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99795c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99796d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44754e1 m99022a(@NonNull View view) {
        int i11 = R$id.ivIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvNetworkName;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvSymbol;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    return new C44754e1((LinearLayout) view, imageView, baseTextView, baseTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f99793a;
    }

    public C44754e1(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f99793a = linearLayout;
        this.f99794b = imageView;
        this.f99795c = baseTextView;
        this.f99796d = baseTextView2;
    }
}
