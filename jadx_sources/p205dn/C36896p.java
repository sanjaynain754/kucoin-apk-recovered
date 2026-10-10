package p205dn;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.kyc.R$id;

/* JADX INFO: renamed from: dn.p */
/* JADX INFO: compiled from: LayoutJumioLoadingBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36896p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81509a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LottieAnimationView f81510b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C36900t f81511c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f81512d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f81513e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36896p m82661a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.avi;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i11);
        if (lottieAnimationView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.jumioTitle))) != null) {
            C36900t c36900tM82669a = C36900t.m82669a(viewFindChildViewById);
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.tv_loading_description;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                return new C36896p(linearLayout, lottieAnimationView, c36900tM82669a, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81509a;
    }

    public C36896p(@NonNull LinearLayout linearLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull C36900t c36900t, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.f81509a = linearLayout;
        this.f81510b = lottieAnimationView;
        this.f81511c = c36900t;
        this.f81512d = linearLayout2;
        this.f81513e = textView;
    }
}
