package c70;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.j */
/* JADX INFO: compiled from: BusercenterFragmentPasskeyLoginBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4877j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5153a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5154b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f5155c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f5156d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayoutCompat f5157e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f5158f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f5159g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f5160h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f5161i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f5162j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4877j m5032a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnRetryPasskeyLogin;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.llFail;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.llLoading;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat2 != null) {
                    i11 = R$id.loadingContainer;
                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                    if (linearLayoutCompat3 != null) {
                        i11 = R$id.loadingView;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.passkeyLottieView;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.topMaskArea))) != null) {
                                i11 = R$id.tvLoading;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvPasswordLogin;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        return new C4877j((LinearLayoutCompat) view, kcPrimaryButton, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, imageView, imageView2, viewFindChildViewById, baseTextView, baseTextView2);
                                    }
                                }
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
    public LinearLayoutCompat getRoot() {
        return this.f5153a;
    }

    public C4877j(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f5153a = linearLayoutCompat;
        this.f5154b = kcPrimaryButton;
        this.f5155c = linearLayoutCompat2;
        this.f5156d = linearLayoutCompat3;
        this.f5157e = linearLayoutCompat4;
        this.f5158f = imageView;
        this.f5159g = imageView2;
        this.f5160h = view;
        this.f5161i = baseTextView;
        this.f5162j = baseTextView2;
    }
}
