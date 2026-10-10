package dm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: dm.x3 */
/* JADX INFO: compiled from: BkumexItemContractDrawerBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36869x3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81326a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81327b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShowHideTextView f81328c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShowHideTextView f81329d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShowHideTextView f81330e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final FlexboxLayout f81331f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f81332g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f81333h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShapeTextView f81334i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShapeTextView f81335j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ConstraintLayout f81336k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ShapeTextView f81337l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81338m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ShapeTextView f81339n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36869x3 m82605a(@NonNull View view) {
        int i11 = R$id.countDownView;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.drawerPrice;
            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
            if (showHideTextView != null) {
                i11 = R$id.drawerRate;
                ShowHideTextView showHideTextView2 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                if (showHideTextView2 != null) {
                    i11 = R$id.drawerSymbol;
                    ShowHideTextView showHideTextView3 = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                    if (showHideTextView3 != null) {
                        i11 = R$id.drawerSymbolLayout;
                        FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                        if (flexboxLayout != null) {
                            i11 = R$id.ivFavor;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView != null) {
                                i11 = R$id.ivFire;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                if (imageView2 != null) {
                                    i11 = R$id.perpLabel;
                                    ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                    if (shapeTextView != null) {
                                        i11 = R$id.preMarketLabel;
                                        ShapeTextView shapeTextView2 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                        if (shapeTextView2 != null) {
                                            i11 = R$id.rightLayout;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                            if (constraintLayout != null) {
                                                i11 = R$id.tagNew;
                                                ShapeTextView shapeTextView3 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                                if (shapeTextView3 != null) {
                                                    i11 = R$id.tv1;
                                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView2 != null) {
                                                        i11 = R$id.tvOfflineTips;
                                                        ShapeTextView shapeTextView4 = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (shapeTextView4 != null) {
                                                            return new C36869x3((ConstraintLayout) view, baseTextView, showHideTextView, showHideTextView2, showHideTextView3, flexboxLayout, imageView, imageView2, shapeTextView, shapeTextView2, constraintLayout, shapeTextView3, baseTextView2, shapeTextView4);
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

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C36869x3 m82606c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.bkumex_item_contract_drawer, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m82605a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81326a;
    }

    public C36869x3(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView, @NonNull ShowHideTextView showHideTextView2, @NonNull ShowHideTextView showHideTextView3, @NonNull FlexboxLayout flexboxLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ShapeTextView shapeTextView, @NonNull ShapeTextView shapeTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ShapeTextView shapeTextView3, @NonNull BaseTextView baseTextView2, @NonNull ShapeTextView shapeTextView4) {
        this.f81326a = constraintLayout;
        this.f81327b = baseTextView;
        this.f81328c = showHideTextView;
        this.f81329d = showHideTextView2;
        this.f81330e = showHideTextView3;
        this.f81331f = flexboxLayout;
        this.f81332g = imageView;
        this.f81333h = imageView2;
        this.f81334i = shapeTextView;
        this.f81335j = shapeTextView2;
        this.f81336k = constraintLayout2;
        this.f81337l = shapeTextView3;
        this.f81338m = baseTextView2;
        this.f81339n = shapeTextView4;
    }
}
