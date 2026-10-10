package p206dp;

import android.view.View;
import android.widget.CheckBox;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dp.e0 */
/* JADX INFO: compiled from: BmarginFragmentOpenLeverBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36910e0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81673a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f81674b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CheckBox f81675c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f81676d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f81677e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f81678f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f81679g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81680h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81681i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36910e0 m82689a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btn_open;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.cb_check;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
            if (checkBox != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.divider))) != null) {
                i11 = R$id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tv_content;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_progress;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_title;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tvWarning;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    return new C36910e0((ConstraintLayout) view, kcPrimaryButton, checkBox, viewFindChildViewById, recyclerView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
    public ConstraintLayout getRoot() {
        return this.f81673a;
    }

    public C36910e0(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull CheckBox checkBox, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f81673a = constraintLayout;
        this.f81674b = kcPrimaryButton;
        this.f81675c = checkBox;
        this.f81676d = view;
        this.f81677e = recyclerView;
        this.f81678f = baseTextView;
        this.f81679g = baseTextView2;
        this.f81680h = baseTextView3;
        this.f81681i = baseTextView4;
    }
}
