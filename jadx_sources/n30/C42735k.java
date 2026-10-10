package n30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.tradebase.R$id;

/* JADX INFO: renamed from: n30.k */
/* JADX INFO: compiled from: BtradebaseViewChooseSymbolBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42735k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f94641a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f94642b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f94643c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f94644d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f94645e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42735k m93642a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.et_search;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tv_choose;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_shadow))) != null) {
                    return new C42735k((LinearLayoutCompat) view, clearEditText, recyclerView, baseTextView, viewFindChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f94641a;
    }

    public C42735k(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ClearEditText clearEditText, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull View view) {
        this.f94641a = linearLayoutCompat;
        this.f94642b = clearEditText;
        this.f94643c = recyclerView;
        this.f94644d = baseTextView;
        this.f94645e = view;
    }
}
