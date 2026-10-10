package p206dp;

import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dp.j */
/* JADX INFO: compiled from: BmarginFragmentCoinListDialogBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36919j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f81740a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f81741b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81742c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81743d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81744e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36919j m82706a(@NonNull View view) {
        int i11 = R$id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.title;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_coin;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_describe;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        return new C36919j((ScrollView) view, recyclerView, baseTextView, baseTextView2, baseTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f81740a;
    }

    public C36919j(@NonNull ScrollView scrollView, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f81740a = scrollView;
        this.f81741b = recyclerView;
        this.f81742c = baseTextView;
        this.f81743d = baseTextView2;
        this.f81744e = baseTextView3;
    }
}
