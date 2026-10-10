package jo;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: jo.c */
/* JADX INFO: compiled from: BloanFragmentBorrowBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40452c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f89770a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f89771b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f89772c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f89773d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f89774e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40452c m89093a(@NonNull View view) {
        int i11 = R$id.dividerLine;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.fragment;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.tv_code;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_reset;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C40452c((LinearLayout) view, viewFindChildViewById, frameLayout, baseTextView, baseTextView2);
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
        return this.f89770a;
    }

    public C40452c(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f89770a = linearLayout;
        this.f89771b = view;
        this.f89772c = frameLayout;
        this.f89773d = baseTextView;
        this.f89774e = baseTextView2;
    }
}
