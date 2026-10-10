package su;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.profit.loss.analysis.lib.R$id;

/* JADX INFO: renamed from: su.a */
/* JADX INFO: compiled from: FragmentProfitAnalysisBinding.java */
/* JADX INFO: loaded from: classes35.dex */
public final class C44545a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f98756a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f98757b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f98758c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44545a m98609a(@NonNull View view) {
        int i11 = R$id.ProfitLossAnalysisFragment_Container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.line_chart_arrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                return new C44545a((LinearLayout) view, frameLayout, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f98756a;
    }

    public C44545a(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView) {
        this.f98756a = linearLayout;
        this.f98757b = frameLayout;
        this.f98758c = imageView;
    }
}
