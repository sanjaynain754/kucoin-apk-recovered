package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;

/* JADX INFO: renamed from: dm.p1 */
/* JADX INFO: compiled from: BkumexFooterPanelOnewaySplitBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36819p1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80786a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80787b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f80788c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final DashTextView f80789d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f80790e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Group f80791f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final DashTextView f80792g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80793h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Group f80794i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80795j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80796k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final Group f80797l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DashTextView f80798m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80799n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36819p1 m82499a(@NonNull View view) {
        int i11 = R$id.action;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.costBarrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier != null) {
                i11 = R$id.costLabel;
                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                if (dashTextView != null) {
                    i11 = R$id.costValue;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.liqGroup;
                        Group group = (Group) ViewBindings.findChildViewById(view, i11);
                        if (group != null) {
                            i11 = R$id.liqLabel;
                            DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                            if (dashTextView2 != null) {
                                i11 = R$id.liqValue;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.maxGroup;
                                    Group group2 = (Group) ViewBindings.findChildViewById(view, i11);
                                    if (group2 != null) {
                                        i11 = R$id.maxLabel;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.maxValue;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.perOrderQtyGroup;
                                                Group group3 = (Group) ViewBindings.findChildViewById(view, i11);
                                                if (group3 != null) {
                                                    i11 = R$id.perOrderQtyLabelTv;
                                                    DashTextView dashTextView3 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (dashTextView3 != null) {
                                                        i11 = R$id.perOrderQtyTv;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            return new C36819p1((ConstraintLayout) view, baseTextView, barrier, dashTextView, baseTextView2, group, dashTextView2, baseTextView3, group2, baseTextView4, baseTextView5, group3, dashTextView3, baseTextView6);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80786a;
    }

    public C36819p1(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull Barrier barrier, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView2, @NonNull Group group, @NonNull DashTextView dashTextView2, @NonNull BaseTextView baseTextView3, @NonNull Group group2, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull Group group3, @NonNull DashTextView dashTextView3, @NonNull BaseTextView baseTextView6) {
        this.f80786a = constraintLayout;
        this.f80787b = baseTextView;
        this.f80788c = barrier;
        this.f80789d = dashTextView;
        this.f80790e = baseTextView2;
        this.f80791f = group;
        this.f80792g = dashTextView2;
        this.f80793h = baseTextView3;
        this.f80794i = group2;
        this.f80795j = baseTextView4;
        this.f80796k = baseTextView5;
        this.f80797l = group3;
        this.f80798m = dashTextView3;
        this.f80799n = baseTextView6;
    }
}
