package c60;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.transfer.lib.R$id;

/* JADX INFO: renamed from: c60.e */
/* JADX INFO: compiled from: BtransferSearchHeaderBinding.java */
/* JADX INFO: loaded from: classes52.dex */
public final class C4851e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f4962a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f4963b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f4964c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f4965d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4851e m4979a(@NonNull View view) {
        int i11 = R$id.etSearch;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.tvClose;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new C4851e(linearLayout, clearEditText, baseTextView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f4962a;
    }

    public C4851e(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull BaseTextView baseTextView, @NonNull LinearLayout linearLayout2) {
        this.f4962a = linearLayout;
        this.f4963b = clearEditText;
        this.f4964c = baseTextView;
        this.f4965d = linearLayout2;
    }
}
