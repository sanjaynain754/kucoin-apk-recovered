package c70;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.a0 */
/* JADX INFO: compiled from: BusercenterLayoutExternalAccountDiversionBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4860a0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f5037a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f5038b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f5039c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f5040d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f5041e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f5042f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f5043g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4860a0 m4998a(@NonNull View view) {
        int i11 = R$id.clBindAccount;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.clCreateAccount;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout2 != null) {
                i11 = R$id.ivBindAccount;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.ivInviteFriends;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.tvThirdAccountDiversionInfo;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvThirdAccountDiversionTips;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                return new C4860a0((LinearLayout) view, constraintLayout, constraintLayout2, imageView, imageView2, baseTextView, baseTextView2);
                            }
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
    public LinearLayout getRoot() {
        return this.f5037a;
    }

    public C4860a0(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f5037a = linearLayout;
        this.f5038b = constraintLayout;
        this.f5039c = constraintLayout2;
        this.f5040d = imageView;
        this.f5041e = imageView2;
        this.f5042f = baseTextView;
        this.f5043g = baseTextView2;
    }
}
