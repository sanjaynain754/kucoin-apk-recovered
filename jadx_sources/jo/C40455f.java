package jo;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.resources.widget.FocusEditTextLinearLayout;

/* JADX INFO: renamed from: jo.f */
/* JADX INFO: compiled from: BloanFragmentBorrowSelectBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40455f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f89783a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FocusEditTextLinearLayout f89784b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ClearEditText f89785c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f89786d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f89787e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f89788f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40455f m89099a(@NonNull View view) {
        int i11 = R$id.et_layout;
        FocusEditTextLinearLayout focusEditTextLinearLayout = (FocusEditTextLinearLayout) ViewBindings.findChildViewById(view, i11);
        if (focusEditTextLinearLayout != null) {
            i11 = R$id.et_search;
            ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
            if (clearEditText != null) {
                i11 = R$id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tv1;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView != null) {
                        i11 = R$id.tvBalanceStr;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView2 != null) {
                            return new C40455f((ConstraintLayout) view, focusEditTextLinearLayout, clearEditText, recyclerView, textView, textView2);
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
        return this.f89783a;
    }

    public C40455f(@NonNull ConstraintLayout constraintLayout, @NonNull FocusEditTextLinearLayout focusEditTextLinearLayout, @NonNull ClearEditText clearEditText, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f89783a = constraintLayout;
        this.f89784b = focusEditTextLinearLayout;
        this.f89785c = clearEditText;
        this.f89786d = recyclerView;
        this.f89787e = textView;
        this.f89788f = textView2;
    }
}
