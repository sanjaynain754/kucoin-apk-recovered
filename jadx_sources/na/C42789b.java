package na;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.app.facade.R$id;

/* JADX INFO: renamed from: na.b */
/* JADX INFO: compiled from: FragmentEmulatorBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C42789b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f94788a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatTextView f94789b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatTextView f94790c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatTextView f94791d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f94792e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42789b m93777a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.confirm;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
        if (appCompatTextView != null) {
            i11 = R$id.content;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
            if (appCompatTextView2 != null) {
                i11 = R$id.deviceInfo;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                if (appCompatTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.logo))) != null) {
                    return new C42789b((ConstraintLayout) view, appCompatTextView, appCompatTextView2, appCompatTextView3, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f94788a;
    }

    public C42789b(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull View view) {
        this.f94788a = constraintLayout;
        this.f94789b = appCompatTextView;
        this.f94790c = appCompatTextView2;
        this.f94791d = appCompatTextView3;
        this.f94792e = view;
    }
}
