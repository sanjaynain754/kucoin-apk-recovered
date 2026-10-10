package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.o1 */
/* JADX INFO: compiled from: BkumexFooterPanelKLineTwowayBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36813o1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80705a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f80706b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80707c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f80708d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Group f80709e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80710f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f80711g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80712h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayoutCompat f80713i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80714j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80715k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final Group f80716l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f80717m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80718n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final Barrier f80719o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80720p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f80721q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36813o1 m82487a(@NonNull View view) {
        int i11 = R$id.bottomOperationLl;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.buyAction;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.buyMaxValue;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.closePositionGroup;
                    Group group = (Group) ViewBindings.findChildViewById(view, i11);
                    if (group != null) {
                        i11 = R$id.closePositionManyLabel;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.closePositionManyValue;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                            if (linearLayoutCompat != null) {
                                i11 = R$id.closePositionNullLabel;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.closePositionNullValue;
                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayoutCompat2 != null) {
                                        i11 = R$id.marginDeposit;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.marginDepositValue;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                i11 = R$id.openGroup;
                                                Group group2 = (Group) ViewBindings.findChildViewById(view, i11);
                                                if (group2 != null) {
                                                    i11 = R$id.openLabel;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.openValue;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            i11 = R$id.positionBarrier;
                                                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
                                                            if (barrier != null) {
                                                                i11 = R$id.sellAction;
                                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView9 != null) {
                                                                    i11 = R$id.sellMaxValue;
                                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView10 != null) {
                                                                        return new C36813o1((ConstraintLayout) view, linearLayout, baseTextView, baseTextView2, group, baseTextView3, linearLayoutCompat, baseTextView4, linearLayoutCompat2, baseTextView5, baseTextView6, group2, baseTextView7, baseTextView8, barrier, baseTextView9, baseTextView10);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80705a;
    }

    public C36813o1(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull Group group, @NonNull BaseTextView baseTextView3, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView4, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull Group group2, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull Barrier barrier, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10) {
        this.f80705a = constraintLayout;
        this.f80706b = linearLayout;
        this.f80707c = baseTextView;
        this.f80708d = baseTextView2;
        this.f80709e = group;
        this.f80710f = baseTextView3;
        this.f80711g = linearLayoutCompat;
        this.f80712h = baseTextView4;
        this.f80713i = linearLayoutCompat2;
        this.f80714j = baseTextView5;
        this.f80715k = baseTextView6;
        this.f80716l = group2;
        this.f80717m = baseTextView7;
        this.f80718n = baseTextView8;
        this.f80719o = barrier;
        this.f80720p = baseTextView9;
        this.f80721q = baseTextView10;
    }
}
