package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: dm.b1 */
/* JADX INFO: compiled from: BkumexDialogSelectQtyUnitBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36735b1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f79729a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ShapeLinearLayout f79730b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f79731c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f79732d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeLinearLayout f79733e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f79734f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f79735g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShapeLinearLayout f79736h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f79737i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f79738j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f79739k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShapeLinearLayout f79740l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f79741m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f79742n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36735b1 m82320a(@NonNull View view) {
        int i11 = R$id.cost;
        ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
        if (shapeLinearLayout != null) {
            i11 = R$id.costDesc;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.costLabel;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.currency;
                    ShapeLinearLayout shapeLinearLayout2 = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (shapeLinearLayout2 != null) {
                        i11 = R$id.currencyDesc;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.currencyLabel;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.lot;
                                ShapeLinearLayout shapeLinearLayout3 = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (shapeLinearLayout3 != null) {
                                    i11 = R$id.lotDesc;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.lotLabel;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.title;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.value;
                                                ShapeLinearLayout shapeLinearLayout4 = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                                                if (shapeLinearLayout4 != null) {
                                                    i11 = R$id.valueDesc;
                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView8 != null) {
                                                        i11 = R$id.valueLabel;
                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView9 != null) {
                                                            return new C36735b1((LinearLayout) view, shapeLinearLayout, baseTextView, baseTextView2, shapeLinearLayout2, baseTextView3, baseTextView4, shapeLinearLayout3, baseTextView5, baseTextView6, baseTextView7, shapeLinearLayout4, baseTextView8, baseTextView9);
                                                        }
                                                    }
                                                }
                                            }
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

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f79729a;
    }

    public C36735b1(@NonNull LinearLayout linearLayout, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ShapeLinearLayout shapeLinearLayout2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull ShapeLinearLayout shapeLinearLayout3, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull ShapeLinearLayout shapeLinearLayout4, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9) {
        this.f79729a = linearLayout;
        this.f79730b = shapeLinearLayout;
        this.f79731c = baseTextView;
        this.f79732d = baseTextView2;
        this.f79733e = shapeLinearLayout2;
        this.f79734f = baseTextView3;
        this.f79735g = baseTextView4;
        this.f79736h = shapeLinearLayout3;
        this.f79737i = baseTextView5;
        this.f79738j = baseTextView6;
        this.f79739k = baseTextView7;
        this.f79740l = shapeLinearLayout4;
        this.f79741m = baseTextView8;
        this.f79742n = baseTextView9;
    }
}
