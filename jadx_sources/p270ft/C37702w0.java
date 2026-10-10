package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kucoin.view.IndexBar;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: ft.w0 */
/* JADX INFO: compiled from: PaymentDialogFastFiatSelectBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37702w0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84807a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C37632i0 f84808b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f84809c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ClearEditText f84810d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final IndexBar f84811e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84812f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f84813g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f84814h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37702w0 m84992a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.history_currency_layout;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById3 != null) {
            C37632i0 c37632i0M84846a = C37632i0.m84846a(viewFindChildViewById3);
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.searchView;
                ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
                if (clearEditText != null) {
                    i11 = R$id.side_bar;
                    IndexBar indexBar = (IndexBar) ViewBindings.findChildViewById(view, i11);
                    if (indexBar != null) {
                        i11 = R$id.tvTitle;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_bg))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_line))) != null) {
                            return new C37702w0((ConstraintLayout) view, c37632i0M84846a, recyclerView, clearEditText, indexBar, baseTextView, viewFindChildViewById, viewFindChildViewById2);
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
        return this.f84807a;
    }

    public C37702w0(@NonNull ConstraintLayout constraintLayout, @NonNull C37632i0 c37632i0, @NonNull RecyclerView recyclerView, @NonNull ClearEditText clearEditText, @NonNull IndexBar indexBar, @NonNull BaseTextView baseTextView, @NonNull View view, @NonNull View view2) {
        this.f84807a = constraintLayout;
        this.f84808b = c37632i0;
        this.f84809c = recyclerView;
        this.f84810d = clearEditText;
        this.f84811e = indexBar;
        this.f84812f = baseTextView;
        this.f84813g = view;
        this.f84814h = view2;
    }
}
