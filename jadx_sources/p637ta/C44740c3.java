package p637ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.c3 */
/* JADX INFO: compiled from: BkumexAccountItemContractOpenBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44740c3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99674a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f99675b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99676c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99677d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99678e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99679f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99680g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99681h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99682i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final KcPrimaryButton f99683j;

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C44740c3 m98991c(@NonNull LayoutInflater layoutInflater) {
        return m98992d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44740c3 m98990a(@NonNull View view) {
        int i11 = R$id.center_line;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.inner_empty_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.inner_empty_tips;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.pick_down_label;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.pick_down_value;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.pick_up_label;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.pick_up_value;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.tv1;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        i11 = R$id.tv_open;
                                        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                        if (kcPrimaryButton != null) {
                                            return new C44740c3((ConstraintLayout) view, viewFindChildViewById, imageView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, kcPrimaryButton);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C44740c3 m98992d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_account_item_contract_open, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m98990a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99674a;
    }

    public C44740c3(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f99674a = constraintLayout;
        this.f99675b = view;
        this.f99676c = imageView;
        this.f99677d = baseTextView;
        this.f99678e = baseTextView2;
        this.f99679f = baseTextView3;
        this.f99680g = baseTextView4;
        this.f99681h = baseTextView5;
        this.f99682i = baseTextView6;
        this.f99683j = kcPrimaryButton;
    }
}
