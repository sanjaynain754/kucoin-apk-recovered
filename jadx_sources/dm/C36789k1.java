package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.k1 */
/* JADX INFO: compiled from: BkumexDrawerFragmentListBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36789k1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80384a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f80385b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f80386c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f80387d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f80388e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80389f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80390g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80391h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80392i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36789k1 m82437a(@NonNull View view) {
        int i11 = R$id.cl_sort;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = R$id.list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.section;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView2 != null) {
                    i11 = R$id.tv_interval;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_name;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_price;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_upDown;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    return new C36789k1(linearLayout, constraintLayout, linearLayout, recyclerView, recyclerView2, baseTextView, baseTextView2, baseTextView3, baseTextView4);
                                }
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
    public LinearLayout getRoot() {
        return this.f80384a;
    }

    public C36789k1(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f80384a = linearLayout;
        this.f80385b = constraintLayout;
        this.f80386c = linearLayout2;
        this.f80387d = recyclerView;
        this.f80388e = recyclerView2;
        this.f80389f = baseTextView;
        this.f80390g = baseTextView2;
        this.f80391h = baseTextView3;
        this.f80392i = baseTextView4;
    }
}
