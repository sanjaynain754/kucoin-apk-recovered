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

/* JADX INFO: renamed from: ft.u0 */
/* JADX INFO: compiled from: PaymentDialogFastBuyCryptoCurrencyBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37692u0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84691a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f84692b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C37632i0 f84693c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f84694d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ClearEditText f84695e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final IndexBar f84696f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84697g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f84698h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f84699i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f84700j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37692u0 m84975a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.all;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.history_currency_layout))) != null) {
            C37632i0 c37632i0M84846a = C37632i0.m84846a(viewFindChildViewById);
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
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_bg))) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.view_line;
                            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
                            if (viewFindChildViewById3 != null) {
                                return new C37692u0(constraintLayout, baseTextView, c37632i0M84846a, recyclerView, clearEditText, indexBar, baseTextView2, viewFindChildViewById2, constraintLayout, viewFindChildViewById3);
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
    public ConstraintLayout getRoot() {
        return this.f84691a;
    }

    public C37692u0(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull C37632i0 c37632i0, @NonNull RecyclerView recyclerView, @NonNull ClearEditText clearEditText, @NonNull IndexBar indexBar, @NonNull BaseTextView baseTextView2, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull View view2) {
        this.f84691a = constraintLayout;
        this.f84692b = baseTextView;
        this.f84693c = c37632i0;
        this.f84694d = recyclerView;
        this.f84695e = clearEditText;
        this.f84696f = indexBar;
        this.f84697g = baseTextView2;
        this.f84698h = view;
        this.f84699i = constraintLayout2;
        this.f84700j = view2;
    }
}
