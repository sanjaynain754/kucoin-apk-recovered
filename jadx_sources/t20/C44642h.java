package t20;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SuffixTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.h */
/* JADX INFO: compiled from: BkucoinFragmentMarketOverviewBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44642h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99077a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FlexboxLayout f99078b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FlexboxLayout f99079c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f99080d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f99081e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f99082f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FlexboxLayout f99083g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f99084h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f99085i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f99086j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f99087k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final LinearLayout f99088l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final LinearLayout f99089m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final LinearLayout f99090n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final LinearLayout f99091o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final LinearLayout f99092p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final RecyclerView f99093q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f99094r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final SuffixTextView f99095s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f99096t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f99097u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f99098v;

    public C44642h(@NonNull LinearLayout linearLayout, @NonNull FlexboxLayout flexboxLayout, @NonNull FlexboxLayout flexboxLayout2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull FlexboxLayout flexboxLayout3, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull LinearLayout linearLayout8, @NonNull LinearLayout linearLayout9, @NonNull LinearLayout linearLayout10, @NonNull LinearLayout linearLayout11, @NonNull LinearLayout linearLayout12, @NonNull LinearLayout linearLayout13, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull SuffixTextView suffixTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f99077a = linearLayout;
        this.f99078b = flexboxLayout;
        this.f99079c = flexboxLayout2;
        this.f99080d = linearLayout2;
        this.f99081e = linearLayout3;
        this.f99082f = linearLayout4;
        this.f99083g = flexboxLayout3;
        this.f99084h = linearLayout5;
        this.f99085i = linearLayout6;
        this.f99086j = linearLayout7;
        this.f99087k = linearLayout8;
        this.f99088l = linearLayout9;
        this.f99089m = linearLayout10;
        this.f99090n = linearLayout11;
        this.f99091o = linearLayout12;
        this.f99092p = linearLayout13;
        this.f99093q = recyclerView;
        this.f99094r = baseTextView;
        this.f99095s = suffixTextView;
        this.f99096t = baseTextView2;
        this.f99097u = baseTextView3;
        this.f99098v = baseTextView4;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44642h m98761a(@NonNull View view) {
        int i11 = R$id.layout_audit;
        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
        if (flexboxLayout != null) {
            i11 = R$id.layout_community;
            FlexboxLayout flexboxLayout2 = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
            if (flexboxLayout2 != null) {
                i11 = R$id.layout_contract;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.layout_doc;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout2 != null) {
                        i11 = R$id.layout_explorer;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout3 != null) {
                            i11 = R$id.layout_investor;
                            FlexboxLayout flexboxLayout3 = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                            if (flexboxLayout3 != null) {
                                i11 = R$id.layout_website;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout4 != null) {
                                    i11 = R$id.ll_audit;
                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout5 != null) {
                                        i11 = R$id.ll_community;
                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout6 != null) {
                                            i11 = R$id.ll_content;
                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (linearLayout7 != null) {
                                                i11 = R$id.ll_contract;
                                                LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                if (linearLayout8 != null) {
                                                    i11 = R$id.ll_doc;
                                                    LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                    if (linearLayout9 != null) {
                                                        i11 = R$id.ll_explorer;
                                                        LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (linearLayout10 != null) {
                                                            i11 = R$id.ll_investor;
                                                            LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (linearLayout11 != null) {
                                                                i11 = R$id.ll_website;
                                                                LinearLayout linearLayout12 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (linearLayout12 != null) {
                                                                    i11 = R$id.f49578rv;
                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                                                    if (recyclerView != null) {
                                                                        i11 = R$id.tv_faq_title;
                                                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView != null) {
                                                                            i11 = R$id.tv_info_content;
                                                                            SuffixTextView suffixTextView = (SuffixTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (suffixTextView != null) {
                                                                                i11 = R$id.tv_info_title;
                                                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView2 != null) {
                                                                                    i11 = R$id.tv_more_title;
                                                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView3 != null) {
                                                                                        i11 = R$id.tv_website_label;
                                                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView4 != null) {
                                                                                            return new C44642h((LinearLayout) view, flexboxLayout, flexboxLayout2, linearLayout, linearLayout2, linearLayout3, flexboxLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, linearLayout11, linearLayout12, recyclerView, baseTextView, suffixTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f99077a;
    }
}
