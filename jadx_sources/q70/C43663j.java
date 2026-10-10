package q70;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utaspotlib.R$id;

/* JADX INFO: renamed from: q70.j */
/* JADX INFO: compiled from: UtaOrderSegmentLayoutBinding.java */
/* JADX INFO: loaded from: classes54.dex */
public final class C43663j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f96426a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f96427b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f96428c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f96429d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f96430e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f96431f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f96432g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f96433h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RecyclerView f96434i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f96435j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f96436k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f96437l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f96438m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f96439n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f96440o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f96441p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f96442q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f96443r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f96444s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f96445t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f96446u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f96447v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f96448w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final View f96449x;

    public C43663j(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout2, @NonNull BaseTextView baseTextView4, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15, @NonNull BaseTextView baseTextView16, @NonNull BaseTextView baseTextView17, @NonNull BaseTextView baseTextView18, @NonNull View view2) {
        this.f96426a = linearLayout;
        this.f96427b = view;
        this.f96428c = baseTextView;
        this.f96429d = baseTextView2;
        this.f96430e = baseTextView3;
        this.f96431f = constraintLayout;
        this.f96432g = linearLayout2;
        this.f96433h = baseTextView4;
        this.f96434i = recyclerView;
        this.f96435j = baseTextView5;
        this.f96436k = baseTextView6;
        this.f96437l = baseTextView7;
        this.f96438m = baseTextView8;
        this.f96439n = baseTextView9;
        this.f96440o = baseTextView10;
        this.f96441p = baseTextView11;
        this.f96442q = baseTextView12;
        this.f96443r = baseTextView13;
        this.f96444s = baseTextView14;
        this.f96445t = baseTextView15;
        this.f96446u = baseTextView16;
        this.f96447v = baseTextView17;
        this.f96448w = baseTextView18;
        this.f96449x = view2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43663j m96087a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.segmentDivider;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            i11 = R$id.segmentHeaderPriceTv;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.segmentHeaderQtyTv;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.segmentHeaderTypeTv;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.segmentOrderListContainer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout != null) {
                            i11 = R$id.segmentOrderListHeaderRow;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.segmentOrderListTitleTv;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.segmentOrdersRv;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                    if (recyclerView != null) {
                                        i11 = R$id.tvAvgPriceUnit;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.tvAvgPriceValue;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                i11 = R$id.tvBorrowAmountSegment;
                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView7 != null) {
                                                    i11 = R$id.tvBorrowAmountValueSegment;
                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView8 != null) {
                                                        i11 = R$id.tvDistributionValue;
                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView9 != null) {
                                                            i11 = R$id.tvHourSegment;
                                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView10 != null) {
                                                                i11 = R$id.tvHourValueSegment;
                                                                BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView11 != null) {
                                                                    i11 = R$id.tvOrderCountValue;
                                                                    BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView12 != null) {
                                                                        i11 = R$id.tvPriceHigherUnit;
                                                                        BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView13 != null) {
                                                                            i11 = R$id.tvPriceHigherValue;
                                                                            BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView14 != null) {
                                                                                i11 = R$id.tvPriceLowerUnit;
                                                                                BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView15 != null) {
                                                                                    i11 = R$id.tvPriceLowerValue;
                                                                                    BaseTextView baseTextView16 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView16 != null) {
                                                                                        i11 = R$id.tvTotalQtyUnit;
                                                                                        BaseTextView baseTextView17 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView17 != null) {
                                                                                            i11 = R$id.tvTotalQtyValue;
                                                                                            BaseTextView baseTextView18 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView18 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider3Segment))) != null) {
                                                                                                return new C43663j((LinearLayout) view, viewFindChildViewById2, baseTextView, baseTextView2, baseTextView3, constraintLayout, linearLayout, baseTextView4, recyclerView, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, baseTextView15, baseTextView16, baseTextView17, baseTextView18, viewFindChildViewById);
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
    public LinearLayout getRoot() {
        return this.f96426a;
    }
}
