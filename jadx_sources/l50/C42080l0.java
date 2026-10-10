package l50;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.l0 */
/* JADX INFO: compiled from: BtradingBotKitStrategyListBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42080l0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93030a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcSecondaryButton f93031b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final NestedScrollView f93032c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f93033d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final HorizontalScrollView f93034e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f93035f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KuCheckBox f93036g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f93037h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayoutCompat f93038i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f93039j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42080l0 m92313a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.createStrategyTv;
        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcSecondaryButton != null) {
            i11 = R$id.delegateHeaderNsv;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
            if (nestedScrollView != null) {
                i11 = R$id.headerOperationsLl;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.hsl;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
                    if (horizontalScrollView != null) {
                        i11 = R$id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (recyclerView != null) {
                            i11 = R$id.showOnlyCurContractCb;
                            KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
                            if (kuCheckBox != null) {
                                i11 = R$id.tagsLl;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout2 != null) {
                                    i11 = R$id.topLl;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayoutCompat != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider))) != null) {
                                        return new C42080l0((ConstraintLayout) view, kcSecondaryButton, nestedScrollView, linearLayout, horizontalScrollView, recyclerView, kuCheckBox, linearLayout2, linearLayoutCompat, viewFindChildViewById);
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

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f93030a;
    }

    public C42080l0(@NonNull ConstraintLayout constraintLayout, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout linearLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull RecyclerView recyclerView, @NonNull KuCheckBox kuCheckBox, @NonNull LinearLayout linearLayout2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view) {
        this.f93030a = constraintLayout;
        this.f93031b = kcSecondaryButton;
        this.f93032c = nestedScrollView;
        this.f93033d = linearLayout;
        this.f93034e = horizontalScrollView;
        this.f93035f = recyclerView;
        this.f93036g = kuCheckBox;
        this.f93037h = linearLayout2;
        this.f93038i = linearLayoutCompat;
        this.f93039j = view;
    }
}
