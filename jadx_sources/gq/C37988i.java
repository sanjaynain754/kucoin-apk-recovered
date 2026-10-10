package gq;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcCoordinatorLayout;

/* JADX INFO: renamed from: gq.i */
/* JADX INFO: compiled from: KucoinFragmentAboutUsBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37988i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final KcCoordinatorLayout f85478a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f85479b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f85480c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f85481d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f85482e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f85483f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37988i m85851a(@NonNull View view) {
        int i11 = R$id.fl_contact_us;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.fl_privacy_policy;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout2 != null) {
                i11 = R$id.fl_service_protocol;
                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout3 != null) {
                    i11 = R$id.fl_version;
                    FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout4 != null) {
                        i11 = R$id.tv_version;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C37988i((KcCoordinatorLayout) view, frameLayout, frameLayout2, frameLayout3, frameLayout4, baseTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public KcCoordinatorLayout getRoot() {
        return this.f85478a;
    }

    public C37988i(@NonNull KcCoordinatorLayout kcCoordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull FrameLayout frameLayout4, @NonNull BaseTextView baseTextView) {
        this.f85478a = kcCoordinatorLayout;
        this.f85479b = frameLayout;
        this.f85480c = frameLayout2;
        this.f85481d = frameLayout3;
        this.f85482e = frameLayout4;
        this.f85483f = baseTextView;
    }
}
