package k00;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.sdk.res.R$id;

/* JADX INFO: renamed from: k00.r */
/* JADX INFO: compiled from: ViewSimpleScrollBarLayoutBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40854r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f90813a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final HorizontalScrollView f90814b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f90815c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40854r m89409a(@NonNull View view) {
        int i11 = R$id.hsv;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
        if (horizontalScrollView != null) {
            i11 = R$id.rbContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                return new C40854r((LinearLayout) view, horizontalScrollView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f90813a;
    }

    public C40854r(@NonNull LinearLayout linearLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull LinearLayout linearLayout2) {
        this.f90813a = linearLayout;
        this.f90814b = horizontalScrollView;
        this.f90815c = linearLayout2;
    }
}
