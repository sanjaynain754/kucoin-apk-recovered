package p532pc;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.copytrading.R$id;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import p385jy.C40820a;

/* JADX INFO: renamed from: pc.e */
/* JADX INFO: compiled from: ViewCopyTradingFooterBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class C43436e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f95916a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSecondaryButton f95917b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f95918c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f95919d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeLinearLayout f95920e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final C40820a f95921f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f95922g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43436e m95633a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnCopyTrading;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null) {
            i11 = R$id.emptyContainer;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.emptyOrdersView;
                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat2 != null) {
                    i11 = R$id.emptyUsdt;
                    ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (shapeLinearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.failedView))) != null) {
                        C40820a c40820aM89302a = C40820a.m89302a(viewFindChildViewById);
                        i11 = R$id.loadingView;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView != null) {
                            return new C43436e((FrameLayout) view, kcSecondaryButton, linearLayoutCompat, linearLayoutCompat2, shapeLinearLayout, c40820aM89302a, appCompatImageView);
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
    public FrameLayout getRoot() {
        return this.f95916a;
    }

    public C43436e(@NonNull FrameLayout frameLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull C40820a c40820a, @NonNull AppCompatImageView appCompatImageView) {
        this.f95916a = frameLayout;
        this.f95917b = kcSecondaryButton;
        this.f95918c = linearLayoutCompat;
        this.f95919d = linearLayoutCompat2;
        this.f95920e = shapeLinearLayout;
        this.f95921f = c40820a;
        this.f95922g = appCompatImageView;
    }
}
