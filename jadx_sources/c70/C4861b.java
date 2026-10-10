package c70;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.b */
/* JADX INFO: compiled from: BusercenterActivitySignupGuidanceBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4861b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5044a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BGABanner f5045b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSecondaryButton f5046c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f5047d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4861b m5000a(@NonNull View view) {
        int i11 = R$id.banner;
        BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
        if (bGABanner != null) {
            i11 = R$id.bottomButton;
            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcSecondaryButton != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new C4861b(constraintLayout, bGABanner, kcSecondaryButton, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f5044a;
    }

    public C4861b(@NonNull ConstraintLayout constraintLayout, @NonNull BGABanner bGABanner, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull ConstraintLayout constraintLayout2) {
        this.f5044a = constraintLayout;
        this.f5045b = bGABanner;
        this.f5046c = kcSecondaryButton;
        this.f5047d = constraintLayout2;
    }
}
