package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;

/* JADX INFO: renamed from: ft.z0 */
/* JADX INFO: compiled from: PaymentDialogFastSellCryptoCurrencyBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37714z0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84960a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f84961b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C37632i0 f84962c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f84963d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ClearEditText f84964e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84965f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84966g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f84967h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f84968i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f84969j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37714z0 m85013a(@NonNull View view) {
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
                    i11 = R$id.tvTitle;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tvTransfer;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_bg))) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.view_line;
                            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
                            if (viewFindChildViewById3 != null) {
                                return new C37714z0(constraintLayout, baseTextView, c37632i0M84846a, recyclerView, clearEditText, baseTextView2, baseTextView3, viewFindChildViewById2, constraintLayout, viewFindChildViewById3);
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
        return this.f84960a;
    }

    public C37714z0(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull C37632i0 c37632i0, @NonNull RecyclerView recyclerView, @NonNull ClearEditText clearEditText, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view, @NonNull ConstraintLayout constraintLayout2, @NonNull View view2) {
        this.f84960a = constraintLayout;
        this.f84961b = baseTextView;
        this.f84962c = c37632i0;
        this.f84963d = recyclerView;
        this.f84964e = clearEditText;
        this.f84965f = baseTextView2;
        this.f84966g = baseTextView3;
        this.f84967h = view;
        this.f84968i = constraintLayout2;
        this.f84969j = view2;
    }
}
