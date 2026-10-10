package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;

/* JADX INFO: renamed from: dm.d3 */
/* JADX INFO: compiled from: BkumexFragmentProfitRecordBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36749d3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f79913a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f79914b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f79915c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KuCoinRefreshLayout f79916d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f79917e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f79918f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36749d3 m82349a(@NonNull View view) {
        int i11 = R$id.contract;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.refresh;
                KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                if (kuCoinRefreshLayout != null) {
                    i11 = R$id.time;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.title;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            return new C36749d3((LinearLayout) view, baseTextView, recyclerView, kuCoinRefreshLayout, baseTextView2, baseTextView3);
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
        return this.f79913a;
    }

    public C36749d3(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f79913a = linearLayout;
        this.f79914b = baseTextView;
        this.f79915c = recyclerView;
        this.f79916d = kuCoinRefreshLayout;
        this.f79917e = baseTextView2;
        this.f79918f = baseTextView3;
    }
}
