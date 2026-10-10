package p205dn;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;

/* JADX INFO: renamed from: dn.t */
/* JADX INFO: compiled from: LayoutJumioTitleBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36900t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81551a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f81552b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f81553c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36900t m82669a(@NonNull View view) {
        int i11 = R$id.iv_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tvTitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                return new C36900t((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81551a;
    }

    public C36900t(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f81551a = linearLayout;
        this.f81552b = imageView;
        this.f81553c = textView;
    }
}
