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

/* JADX INFO: renamed from: pc.g */
/* JADX INFO: compiled from: ViewLeadTradingFooterBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class C43438g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f95938a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSecondaryButton f95939b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSecondaryButton f95940c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f95941d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeLinearLayout f95942e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final C40820a f95943f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f95944g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43438g m95637a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnLeadTrading;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null) {
            i11 = R$id.btnTransfer;
            KcSecondaryButton kcSecondaryButton2 = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcSecondaryButton2 != null) {
                i11 = R$id.emptyOrdersView;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                if (linearLayoutCompat != null) {
                    i11 = R$id.emptyUsdt;
                    ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (shapeLinearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.failedView))) != null) {
                        C40820a c40820aM89302a = C40820a.m89302a(viewFindChildViewById);
                        i11 = R$id.loadingView;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView != null) {
                            return new C43438g((FrameLayout) view, kcSecondaryButton, kcSecondaryButton2, linearLayoutCompat, shapeLinearLayout, c40820aM89302a, appCompatImageView);
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
        return this.f95938a;
    }

    public C43438g(@NonNull FrameLayout frameLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcSecondaryButton kcSecondaryButton2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull C40820a c40820a, @NonNull AppCompatImageView appCompatImageView) {
        this.f95938a = frameLayout;
        this.f95939b = kcSecondaryButton;
        this.f95940c = kcSecondaryButton2;
        this.f95941d = linearLayoutCompat;
        this.f95942e = shapeLinearLayout;
        this.f95943f = c40820a;
        this.f95944g = appCompatImageView;
    }
}
