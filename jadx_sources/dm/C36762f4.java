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

/* JADX INFO: renamed from: dm.f4 */
/* JADX INFO: compiled from: BkumexLimitKLineInputPanelViewBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36762f4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80057a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80058b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80059c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f80060d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcTradeNumAbInputView f80061e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcTradeNumAbInputView f80062f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShapeCheckBox f80063g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final InputPanelOfPercentView f80064h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final Barrier f80065i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36762f4 m82377a(@NonNull View view) {
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
                    i11 = R$id.delegationPrice;
                    KcTradeNumAbInputView kcTradeNumAbInputView2 = (KcTradeNumAbInputView) ViewBindings.findChildViewById(view, i11);
                    if (kcTradeNumAbInputView2 != null) {
                        i11 = R$id.marketModel;
                        ShapeCheckBox shapeCheckBox = (ShapeCheckBox) ViewBindings.findChildViewById(view, i11);
                        if (shapeCheckBox != null && (inputPanelOfPercentViewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.percent))) != null) {
                            i11 = R$id.priceBarrier;
                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
                            if (barrier != null) {
                                return new C36762f4(constraintLayout, baseTextView, baseTextView2, constraintLayout, kcTradeNumAbInputView, kcTradeNumAbInputView2, shapeCheckBox, inputPanelOfPercentViewFindChildViewById, barrier);
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
        return this.f80057a;
    }

    public C36762f4(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView, @NonNull KcTradeNumAbInputView kcTradeNumAbInputView2, @NonNull ShapeCheckBox shapeCheckBox, @NonNull InputPanelOfPercentView inputPanelOfPercentView, @NonNull Barrier barrier) {
        this.f80057a = constraintLayout;
        this.f80058b = baseTextView;
        this.f80059c = baseTextView2;
        this.f80060d = constraintLayout2;
        this.f80061e = kcTradeNumAbInputView;
        this.f80062f = kcTradeNumAbInputView2;
        this.f80063g = shapeCheckBox;
        this.f80064h = inputPanelOfPercentView;
        this.f80065i = barrier;
    }
}
