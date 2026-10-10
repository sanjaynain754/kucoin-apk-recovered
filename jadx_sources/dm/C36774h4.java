package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.trade.submit.panel.view.InputPanelOfPercentView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeNumAbInputView;
import com.kubi.sdk.widget.shape.view.ShapeCheckBox;

/* JADX INFO: renamed from: dm.h4 */
/* JADX INFO: compiled from: BkumexMarketKLineInputPanelViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36774h4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80211a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80212b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80213c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f80214d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcTradeNumAbInputView f80215e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShapeCheckBox f80216f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f80217g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final InputPanelOfPercentView f80218h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Barrier f80219i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36774h4 m82405a(@NonNull View view) {
        InputPanelOfPercentView inputPanelOfPercentViewFindChildViewById;
        int i11 = R$id.availableLabel;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.availableValue;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.delegationAmount;
                KcTradeNumAbInputView kcTradeNumAbInputView = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                if (kcTradeNumAbInputView != null) {
                    i11 = R$id.marketModel;
                    ShapeCheckBox shapeCheckBox = (ShapeCheckBox) ViewBindings.findChildViewById(view, i11);
                    if (shapeCheckBox != null) {
                        i11 = R$id.marketPrice;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null && (inputPanelOfPercentViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.percent))) != null) {
                            i11 = R$id.priceBarrier;
                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
                            if (barrier != null) {
                                return new C36774h4(constraintLayout, baseTextView, baseTextView2, constraintLayout, kcTradeNumAbInputView, shapeCheckBox, baseTextView3, inputPanelOfPercentViewFindChildViewById, barrier);
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
        return this.f80211a;
    }

    public C36774h4(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull ShapeCheckBox shapeCheckBox, @NonNull BaseTextView baseTextView3, @NonNull InputPanelOfPercentView inputPanelOfPercentView, @NonNull Barrier barrier) {
        this.f80211a = constraintLayout;
        this.f80212b = baseTextView;
        this.f80213c = baseTextView2;
        this.f80214d = constraintLayout2;
        this.f80215e = kcTradeNumAbInputView;
        this.f80216f = shapeCheckBox;
        this.f80217g = baseTextView3;
        this.f80218h = inputPanelOfPercentView;
        this.f80219i = barrier;
    }
}
