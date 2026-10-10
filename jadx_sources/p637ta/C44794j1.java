package p637ta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: ta.j1 */
/* JADX INFO: compiled from: AssetItemOngoingHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44794j1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RelativeLayout f100206a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f100207b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f100208c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShapeLinearLayout f100209d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f100210e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100211f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100212g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f100213h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44794j1 m99106a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ivArrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivLeadFollowerIcon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.llLeadFollowerBadge;
                ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                if (shapeLinearLayout != null) {
                    i11 = R$id.llTitle;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.tvLeadFollowerCount;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvTitle;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider))) != null) {
                                return new C44794j1((RelativeLayout) view, imageView, imageView2, shapeLinearLayout, linearLayout, baseTextView, baseTextView2, viewFindChildViewById);
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
    public static C44794j1 m99107c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.asset_item_ongoing_header, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m99106a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f100206a;
    }

    public C44794j1(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull View view) {
        this.f100206a = relativeLayout;
        this.f100207b = imageView;
        this.f100208c = imageView2;
        this.f100209d = shapeLinearLayout;
        this.f100210e = linearLayout;
        this.f100211f = baseTextView;
        this.f100212g = baseTextView2;
        this.f100213h = view;
    }
}
