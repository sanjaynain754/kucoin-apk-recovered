package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: dm.y2 */
/* JADX INFO: compiled from: BkumexFragmentPerpetualSwapBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36874y2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81372a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f81373b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f81374c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Barrier f81375d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f81376e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f81377f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f81378g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Barrier f81379h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ClearEditText f81380i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f81381j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81382k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final Barrier f81383l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final Group f81384m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81385n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f81386o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f81387p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f81388q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f81389r;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36874y2 m82616a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.barrier2;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.bottomOperationLl;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.bottomOperationsBarrier;
                Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
                if (barrier2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
                    i11 = R$id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.rightLl;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout2 != null) {
                            i11 = R$id.searchBottomBarrier;
                            Barrier barrier3 = (Barrier) ViewBindings.findChildViewById(view, i11);
                            if (barrier3 != null) {
                                i11 = R$id.searchCet;
                                ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
                                if (clearEditText != null) {
                                    i11 = R$id.searchRightLl;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout3 != null) {
                                        i11 = R$id.searchSelectAllTv;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.searchTopBarrier;
                                            Barrier barrier4 = (Barrier) ViewBindings.findChildViewById(view, i11);
                                            if (barrier4 != null) {
                                                i11 = R$id.searchedTopOperationsGroup;
                                                Group group = (Group) ViewBindings.findChildViewById(view, i11);
                                                if (group != null) {
                                                    i11 = R$id.searchedTotalSelectedNumLabelTv;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.selectAllTv;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            i11 = R$id.setCrossBtn;
                                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView4 != null) {
                                                                i11 = R$id.setIsolatedBtn;
                                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView5 != null) {
                                                                    i11 = R$id.totalSelectedNumLabelTv;
                                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView6 != null) {
                                                                        return new C36874y2((ConstraintLayout) view, barrier, linearLayout, barrier2, viewFindChildViewById, recyclerView, linearLayout2, barrier3, clearEditText, linearLayout3, baseTextView, barrier4, group, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
        return this.f81372a;
    }

    public C36874y2(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull LinearLayout linearLayout, @NonNull Barrier barrier2, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout2, @NonNull Barrier barrier3, @NonNull ClearEditText clearEditText, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView, @NonNull Barrier barrier4, @NonNull Group group, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f81372a = constraintLayout;
        this.f81373b = barrier;
        this.f81374c = linearLayout;
        this.f81375d = barrier2;
        this.f81376e = view;
        this.f81377f = recyclerView;
        this.f81378g = linearLayout2;
        this.f81379h = barrier3;
        this.f81380i = clearEditText;
        this.f81381j = linearLayout3;
        this.f81382k = baseTextView;
        this.f81383l = barrier4;
        this.f81384m = group;
        this.f81385n = baseTextView2;
        this.f81386o = baseTextView3;
        this.f81387p = baseTextView4;
        this.f81388q = baseTextView5;
        this.f81389r = baseTextView6;
    }
}
