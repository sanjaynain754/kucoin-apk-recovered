package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.v3 */
/* JADX INFO: compiled from: PaymentViewTermsBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37700v3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f84770a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84771b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84772c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37700v3 m84989a(@NonNull View view) {
        int i11 = R$id.ivTerms;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.tvTerms;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C37700v3(view, appCompatImageView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84770a;
    }

    public C37700v3(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView) {
        this.f84770a = view;
        this.f84771b = appCompatImageView;
        this.f84772c = baseTextView;
    }
}
