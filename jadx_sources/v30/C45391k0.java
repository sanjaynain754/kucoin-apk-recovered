package v30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.k0 */
/* JADX INFO: compiled from: TradeCoreViewChooseSymbolBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45391k0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeLinearLayout f102177a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f102178b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f102179c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f102180d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45391k0 m100316a(@NonNull View view) {
        int i11 = R$id.et_search;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tv_choose;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C45391k0((ShapeLinearLayout) view, clearEditText, recyclerView, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeLinearLayout getRoot() {
        return this.f102177a;
    }

    public C45391k0(@NonNull ShapeLinearLayout shapeLinearLayout, @NonNull ClearEditText clearEditText, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView) {
        this.f102177a = shapeLinearLayout;
        this.f102178b = clearEditText;
        this.f102179c = recyclerView;
        this.f102180d = baseTextView;
    }
}
