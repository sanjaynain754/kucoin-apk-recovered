package n30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcSwitchButton;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;

/* JADX INFO: renamed from: n30.n */
/* JADX INFO: compiled from: KcLayoutToggleCardItemSelectorBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42738n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f94651a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f94652b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcSwitchButton f94653c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f94654d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f94655e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42738n m93649a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.switchCompat;
        KcSwitchButton kcSwitchButton = (KcSwitchButton) ViewBindings.findChildViewById(view, i11);
        if (kcSwitchButton != null) {
            i11 = R$id.tvDescDetail;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tvTitle;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    return new C42738n(constraintLayout, constraintLayout, kcSwitchButton, baseTextView, baseTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C42738n m93650c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.kc_layout_toggle_card_item_selector, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m93649a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f94651a;
    }

    public C42738n(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull KcSwitchButton kcSwitchButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f94651a = constraintLayout;
        this.f94652b = constraintLayout2;
        this.f94653c = kcSwitchButton;
        this.f94654d = baseTextView;
        this.f94655e = baseTextView2;
    }
}
