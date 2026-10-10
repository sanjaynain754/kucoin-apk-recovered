package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: ta.d1 */
/* JADX INFO: compiled from: AssetItemEvmRepeatChainAddressBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44746d1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99726a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f99727b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99728c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f99729d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99730e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ShapeTextView f99731f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99732g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f99733h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44746d1 m99004a(@NonNull View view) {
        int i11 = R$id.childRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.ivDelete;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.ivExpand;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView2 != null) {
                    i11 = R$id.tvAddress;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvAddressCount;
                        ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
                        if (shapeTextView != null) {
                            i11 = R$id.tvAddressIndex;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.withdraw_desc_title_layout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout != null) {
                                    return new C44746d1((LinearLayout) view, recyclerView, imageView, imageView2, baseTextView, shapeTextView, baseTextView2, linearLayout);
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
        return this.f99726a;
    }

    public C44746d1(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView, @NonNull ShapeTextView shapeTextView, @NonNull BaseTextView baseTextView2, @NonNull LinearLayout linearLayout2) {
        this.f99726a = linearLayout;
        this.f99727b = recyclerView;
        this.f99728c = imageView;
        this.f99729d = imageView2;
        this.f99730e = baseTextView;
        this.f99731f = shapeTextView;
        this.f99732g = baseTextView2;
        this.f99733h = linearLayout2;
    }
}
