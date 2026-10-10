package dm;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.round.widget.RoundImageView;

/* JADX INFO: renamed from: dm.a0 */
/* JADX INFO: compiled from: BkumexDialogFuturesOpenrationBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36728a0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79670a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f79671b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RoundImageView f79672c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f79673d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36728a0 m82305a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.iv_bg;
        RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
        if (roundImageView != null) {
            i11 = R$id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                return new C36728a0(constraintLayout, constraintLayout, roundImageView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f79670a;
    }

    public C36728a0(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull RoundImageView roundImageView, @NonNull ImageView imageView) {
        this.f79670a = constraintLayout;
        this.f79671b = constraintLayout2;
        this.f79672c = roundImageView;
        this.f79673d = imageView;
    }
}
