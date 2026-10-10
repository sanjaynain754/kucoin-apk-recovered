package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.v0 */
/* JADX INFO: compiled from: PaymentDialogFastBuyPaymentMethodBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37697v0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84747a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84748b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f84749c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f84750d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f84751e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84752f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37697v0 m84984a(@NonNull View view) {
        int i11 = R$id.ivBack;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.ivClose;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView2 != null) {
                i11 = R$id.ivLoading;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView3 != null) {
                    i11 = R$id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.tvTitle;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C37697v0((ConstraintLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, recyclerView, baseTextView);
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
    public ConstraintLayout getRoot() {
        return this.f84747a;
    }

    public C37697v0(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView) {
        this.f84747a = constraintLayout;
        this.f84748b = appCompatImageView;
        this.f84749c = appCompatImageView2;
        this.f84750d = appCompatImageView3;
        this.f84751e = recyclerView;
        this.f84752f = baseTextView;
    }
}
