package bv;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.d */
/* JADX INFO: compiled from: FragmentAlphaRankBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4659d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f4265a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f4266b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f4267c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f4268d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RankShimmer f4269e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f4270f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f4271g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final C4681m0 f4272h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4659d m4630a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btnHomeRankAction;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.layoutViewMore;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.rsLoading;
                    RankShimmer rankShimmer = (RankShimmer) ViewBindings.findChildViewById(view, i11);
                    if (rankShimmer != null) {
                        i11 = R$id.tvHead;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvViewMore;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewSort))) != null) {
                                return new C4659d((LinearLayoutCompat) view, linearLayout, linearLayoutCompat, recyclerView, rankShimmer, baseTextView, baseTextView2, C4681m0.m4674a(viewFindChildViewById));
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
    public LinearLayoutCompat getRoot() {
        return this.f4265a;
    }

    public C4659d(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull RecyclerView recyclerView, @NonNull RankShimmer rankShimmer, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull C4681m0 c4681m0) {
        this.f4265a = linearLayoutCompat;
        this.f4266b = linearLayout;
        this.f4267c = linearLayoutCompat2;
        this.f4268d = recyclerView;
        this.f4269e = rankShimmer;
        this.f4270f = baseTextView;
        this.f4271g = baseTextView2;
        this.f4272h = c4681m0;
    }
}
