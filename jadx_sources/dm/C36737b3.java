package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: dm.b3 */
/* JADX INFO: compiled from: BkumexFragmentPreMarketCtBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36737b3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f79746a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f79747b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f79748c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f79749d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeTextView f79750e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShapeTextView f79751f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f79752g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ShapeTextView f79753h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShapeTextView f79754i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f79755j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f79756k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f79757l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f79758m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36737b3 m82324a(@NonNull View view) {
        int i11 = R$id.colon1;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.colon2;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.colon3;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.dayLabel;
                    ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                    if (shapeTextView != null) {
                        i11 = R$id.hourLabel;
                        ShapeTextView shapeTextView2 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                        if (shapeTextView2 != null) {
                            i11 = R$id.label;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.minLabel;
                                ShapeTextView shapeTextView3 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                if (shapeTextView3 != null) {
                                    i11 = R$id.secondLabel;
                                    ShapeTextView shapeTextView4 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                    if (shapeTextView4 != null) {
                                        i11 = R$id.tv11;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.tv22;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                i11 = R$id.tv33;
                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView7 != null) {
                                                    i11 = R$id.tv44;
                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView8 != null) {
                                                        return new C36737b3((ConstraintLayout) view, baseTextView, baseTextView2, baseTextView3, shapeTextView, shapeTextView2, baseTextView4, shapeTextView3, shapeTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8);
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
    public ConstraintLayout getRoot() {
        return this.f79746a;
    }

    public C36737b3(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShapeTextView shapeTextView, @NonNull ShapeTextView shapeTextView2, @NonNull BaseTextView baseTextView4, @NonNull ShapeTextView shapeTextView3, @NonNull ShapeTextView shapeTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8) {
        this.f79746a = constraintLayout;
        this.f79747b = baseTextView;
        this.f79748c = baseTextView2;
        this.f79749d = baseTextView3;
        this.f79750e = shapeTextView;
        this.f79751f = shapeTextView2;
        this.f79752g = baseTextView4;
        this.f79753h = shapeTextView3;
        this.f79754i = shapeTextView4;
        this.f79755j = baseTextView5;
        this.f79756k = baseTextView6;
        this.f79757l = baseTextView7;
        this.f79758m = baseTextView8;
    }
}
