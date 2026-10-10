package q10;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.search.R$id;

/* JADX INFO: renamed from: q10.d */
/* JADX INFO: compiled from: SearchFragmentRecommendBinding.java */
/* JADX INFO: loaded from: classes44.dex */
public final class C43584d implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f96192a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f96193b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f96194c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f96195d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f96196e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f96197f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f96198g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43584d m95918a(@NonNull View view) {
        int i11 = R$id.rvEarn;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.rvFuture;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView2 != null) {
                i11 = R$id.rvSpot;
                RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView3 != null) {
                    i11 = R$id.tvEarnTitle;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvFutureTitle;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvSpotTitle;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                return new C43584d((LinearLayoutCompat) view, recyclerView, recyclerView2, recyclerView3, baseTextView, baseTextView2, baseTextView3);
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
        return this.f96192a;
    }

    public C43584d(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull RecyclerView recyclerView3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f96192a = linearLayoutCompat;
        this.f96193b = recyclerView;
        this.f96194c = recyclerView2;
        this.f96195d = recyclerView3;
        this.f96196e = baseTextView;
        this.f96197f = baseTextView2;
        this.f96198g = baseTextView3;
    }
}
