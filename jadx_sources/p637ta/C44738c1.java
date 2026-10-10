package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.c1 */
/* JADX INFO: compiled from: AssetItemEvmChainBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44738c1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99665a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f99666b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44738c1 m98986a(@NonNull View view) {
        int i11 = R$id.tvChainName;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            return new C44738c1((LinearLayout) view, baseTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f99665a;
    }

    public C44738c1(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView) {
        this.f99665a = linearLayout;
        this.f99666b = baseTextView;
    }
}
