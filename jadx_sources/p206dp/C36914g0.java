package p206dp;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: dp.g0 */
/* JADX INFO: compiled from: BmarginFragmentSearchSymbolBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36914g0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81711a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f81712b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f81713c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81714d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81715e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36914g0 m82697a(@NonNull View view) {
        int i11 = R$id.et_search;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tv_choose;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_close;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C36914g0((LinearLayout) view, clearEditText, recyclerView, baseTextView, baseTextView2);
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
        return this.f81711a;
    }

    public C36914g0(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f81711a = linearLayout;
        this.f81712b = clearEditText;
        this.f81713c = recyclerView;
        this.f81714d = baseTextView;
        this.f81715e = baseTextView2;
    }
}
