package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.w0 */
/* JADX INFO: compiled from: SpotViewChooseSymbolBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44673w0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ShapeLinearLayout f99421a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f99422b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f99423c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99424d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44673w0 m98822a(@NonNull View view) {
        int i11 = R$id.et_search;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tv_choose;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C44673w0((ShapeLinearLayout) view, clearEditText, recyclerView, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShapeLinearLayout getRoot() {
        return this.f99421a;
    }

    public C44673w0(@NonNull ShapeLinearLayout shapeLinearLayout, @NonNull ClearEditText clearEditText, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView) {
        this.f99421a = shapeLinearLayout;
        this.f99422b = clearEditText;
        this.f99423c = recyclerView;
        this.f99424d = baseTextView;
    }
}
