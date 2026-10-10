package p206dp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.view.ExpandableTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;

/* JADX INFO: renamed from: dp.q */
/* JADX INFO: compiled from: BmarginFragmentEtfInfoBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36933q implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final BaseTextView f81876A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final BaseTextView f81877B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final BaseTextView f81878C;

    /* JADX INFO: renamed from: D */
    @NonNull
    public final BaseTextView f81879D;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f81880a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f81881b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Barrier f81882c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Barrier f81883d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Barrier f81884e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Barrier f81885f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Barrier f81886g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Barrier f81887h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Guideline f81888i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ImageView f81889j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RecyclerView f81890k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81891l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final DashTextView f81892m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81893n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final DashTextView f81894o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f81895p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ExpandableTextView f81896q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f81897r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f81898s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f81899t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f81900u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f81901v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f81902w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final BaseTextView f81903x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final BaseTextView f81904y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final BaseTextView f81905z;

    public C36933q(@NonNull ScrollView scrollView, @NonNull Barrier barrier, @NonNull Barrier barrier2, @NonNull Barrier barrier3, @NonNull Barrier barrier4, @NonNull Barrier barrier5, @NonNull Barrier barrier6, @NonNull Barrier barrier7, @NonNull Guideline guideline, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView2, @NonNull BaseTextView baseTextView3, @NonNull ExpandableTextView expandableTextView, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15, @NonNull BaseTextView baseTextView16) {
        this.f81880a = scrollView;
        this.f81881b = barrier;
        this.f81882c = barrier2;
        this.f81883d = barrier3;
        this.f81884e = barrier4;
        this.f81885f = barrier5;
        this.f81886g = barrier6;
        this.f81887h = barrier7;
        this.f81888i = guideline;
        this.f81889j = imageView;
        this.f81890k = recyclerView;
        this.f81891l = baseTextView;
        this.f81892m = dashTextView;
        this.f81893n = baseTextView2;
        this.f81894o = dashTextView2;
        this.f81895p = baseTextView3;
        this.f81896q = expandableTextView;
        this.f81897r = baseTextView4;
        this.f81898s = baseTextView5;
        this.f81899t = baseTextView6;
        this.f81900u = baseTextView7;
        this.f81901v = baseTextView8;
        this.f81902w = baseTextView9;
        this.f81903x = baseTextView10;
        this.f81904y = baseTextView11;
        this.f81905z = baseTextView12;
        this.f81876A = baseTextView13;
        this.f81877B = baseTextView14;
        this.f81878C = baseTextView15;
        this.f81879D = baseTextView16;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36933q m82734a(@NonNull View view) {
        int i11 = R$id.barrier_1;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.barrier_2;
            Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i11);
            if (barrier2 != null) {
                i11 = R$id.barrier_3;
                Barrier barrier3 = (Barrier) ViewBindings.findChildViewById(view, i11);
                if (barrier3 != null) {
                    i11 = R$id.barrier_4;
                    Barrier barrier4 = (Barrier) ViewBindings.findChildViewById(view, i11);
                    if (barrier4 != null) {
                        i11 = R$id.barrier_5;
                        Barrier barrier5 = (Barrier) ViewBindings.findChildViewById(view, i11);
                        if (barrier5 != null) {
                            i11 = R$id.barrier_6;
                            Barrier barrier6 = (Barrier) ViewBindings.findChildViewById(view, i11);
                            if (barrier6 != null) {
                                i11 = R$id.barrier_7;
                                Barrier barrier7 = (Barrier) ViewBindings.findChildViewById(view, i11);
                                if (barrier7 != null) {
                                    i11 = R$id.guideline;
                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i11);
                                    if (guideline != null) {
                                        i11 = R$id.iv_icon;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView != null) {
                                            i11 = R$id.recycler_view;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                            if (recyclerView != null) {
                                                i11 = R$id.tv_basket;
                                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView != null) {
                                                    i11 = R$id.tv_basket_label;
                                                    DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (dashTextView != null) {
                                                        i11 = R$id.tv_fee;
                                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView2 != null) {
                                                            i11 = R$id.tv_fee_label;
                                                            DashTextView dashTextView2 = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (dashTextView2 != null) {
                                                                i11 = R$id.tv_history;
                                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView3 != null) {
                                                                    i11 = R$id.tv_intro;
                                                                    ExpandableTextView expandableTextView = (ExpandableTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (expandableTextView != null) {
                                                                        i11 = R$id.tv_intro_title;
                                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView4 != null) {
                                                                            i11 = R$id.tv_irregular;
                                                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView5 != null) {
                                                                                i11 = R$id.tv_irregular_label;
                                                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView6 != null) {
                                                                                    i11 = R$id.tv_lever;
                                                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView7 != null) {
                                                                                        i11 = R$id.tv_lever_label;
                                                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView8 != null) {
                                                                                            i11 = R$id.tv_management;
                                                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView9 != null) {
                                                                                                i11 = R$id.tv_management_label;
                                                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                if (baseTextView10 != null) {
                                                                                                    i11 = R$id.tv_more;
                                                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (baseTextView11 != null) {
                                                                                                        i11 = R$id.tv_regular;
                                                                                                        BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (baseTextView12 != null) {
                                                                                                            i11 = R$id.tv_regular_label;
                                                                                                            BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (baseTextView13 != null) {
                                                                                                                i11 = R$id.tv_size;
                                                                                                                BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                if (baseTextView14 != null) {
                                                                                                                    i11 = R$id.tv_size_label;
                                                                                                                    BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                    if (baseTextView15 != null) {
                                                                                                                        i11 = R$id.tv_symbol;
                                                                                                                        BaseTextView baseTextView16 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                                        if (baseTextView16 != null) {
                                                                                                                            return new C36933q((ScrollView) view, barrier, barrier2, barrier3, barrier4, barrier5, barrier6, barrier7, guideline, imageView, recyclerView, baseTextView, dashTextView, baseTextView2, dashTextView2, baseTextView3, expandableTextView, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, baseTextView15, baseTextView16);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36933q m82735c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bmargin_fragment_etf_info, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82734a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f81880a;
    }
}
