package k00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.DashTextView;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;

/* JADX INFO: renamed from: k00.h */
/* JADX INFO: compiled from: KucoinRiskLevelIndicatorViewBinding.java */
/* JADX INFO: loaded from: classes42.dex */
public final class C40844h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f90757a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f90758b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f90759c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f90760d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f90761e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f90762f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final DashTextView f90763g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40844h m89385a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.bar1;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.bar2))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.bar3))) != null) {
            i11 = R$id.levelBars;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i11 = R$id.titleText;
                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                if (dashTextView != null) {
                    return new C40844h(linearLayout2, viewFindChildViewById3, viewFindChildViewById, viewFindChildViewById2, linearLayout, linearLayout2, dashTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C40844h m89386c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.kucoin_risk_level_indicator_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m89385a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f90757a;
    }

    public C40844h(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull DashTextView dashTextView) {
        this.f90757a = linearLayout;
        this.f90758b = view;
        this.f90759c = view2;
        this.f90760d = view3;
        this.f90761e = linearLayout2;
        this.f90762f = linearLayout3;
        this.f90763g = dashTextView;
    }
}
