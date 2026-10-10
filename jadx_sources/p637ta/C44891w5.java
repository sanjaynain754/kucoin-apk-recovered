package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: ta.w5 */
/* JADX INFO: compiled from: ViewAutoEarnEntryBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44891w5 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101086a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSwitchButton f101087b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f101088c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f101089d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f101090e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f101091f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f101092g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f101093h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f101094i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShapeTextView f101095j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ShapeTextView f101096k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f101097l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44891w5 m99306a(@NonNull View view) {
        int i11 = R$id.autoEarnSwitch;
        KcSwitchButton kcSwitchButton = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
        if (kcSwitchButton != null) {
            i11 = R$id.ivArrow;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.ivIcon;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                if (appCompatImageView2 != null) {
                    i11 = R$id.llManage1;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.llManage2;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout2 != null) {
                            i11 = R$id.row1;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                            if (linearLayoutCompat != null) {
                                i11 = R$id.tvDesc;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tvManage;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tvStatusLabel;
                                        ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                        if (shapeTextView != null) {
                                            i11 = R$id.tvStatusLabelNotOpen;
                                            ShapeTextView shapeTextView2 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                            if (shapeTextView2 != null) {
                                                i11 = R$id.tvTitle;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null) {
                                                    return new C44891w5((ConstraintLayout) view, kcSwitchButton, appCompatImageView, appCompatImageView2, linearLayout, linearLayout2, linearLayoutCompat, baseTextView, baseTextView2, shapeTextView, shapeTextView2, baseTextView3);
                                                }
                                            }
                                        }
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
    public ConstraintLayout getRoot() {
        return this.f101086a;
    }

    public C44891w5(@NonNull ConstraintLayout constraintLayout, @NonNull KcSwitchButton kcSwitchButton, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ShapeTextView shapeTextView, @NonNull ShapeTextView shapeTextView2, @NonNull BaseTextView baseTextView3) {
        this.f101086a = constraintLayout;
        this.f101087b = kcSwitchButton;
        this.f101088c = appCompatImageView;
        this.f101089d = appCompatImageView2;
        this.f101090e = linearLayout;
        this.f101091f = linearLayout2;
        this.f101092g = linearLayoutCompat;
        this.f101093h = baseTextView;
        this.f101094i = baseTextView2;
        this.f101095j = shapeTextView;
        this.f101096k = shapeTextView2;
        this.f101097l = baseTextView3;
    }
}
