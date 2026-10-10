package p206dp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.margin.view.DashBoardView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: dp.w0 */
/* JADX INFO: compiled from: BmarginViewLeverRiskBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36946w0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeLinearLayout f82023a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final DashBoardView f82024b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShapeLinearLayout f82025c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f82026d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShowHideTextView f82027e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36946w0 m82761a(@NonNull View view) {
        int i11 = R$id.dashboard;
        DashBoardView dashBoardView = (DashBoardView) ViewBindings.findChildViewById(view, i11);
        if (dashBoardView != null) {
            ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) view;
            i11 = R$id.tvDangerLevel;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvRatio;
                ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                if (showHideTextView != null) {
                    return new C36946w0(shapeLinearLayout, dashBoardView, shapeLinearLayout, baseTextView, showHideTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeLinearLayout getRoot() {
        return this.f82023a;
    }

    public C36946w0(@NonNull ShapeLinearLayout shapeLinearLayout, @NonNull DashBoardView dashBoardView, @NonNull ShapeLinearLayout shapeLinearLayout2, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView) {
        this.f82023a = shapeLinearLayout;
        this.f82024b = dashBoardView;
        this.f82025c = shapeLinearLayout2;
        this.f82026d = baseTextView;
        this.f82027e = showHideTextView;
    }
}
