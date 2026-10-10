package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;

/* JADX INFO: renamed from: ta.p4 */
/* JADX INFO: compiled from: KucoinFragmentDepositSelectDialogChainBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44841p4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100624a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f100625b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f100626c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f100627d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ShapeLinearLayout f100628e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100629f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44841p4 m99208a(@NonNull View view) {
        int i11 = R$id.addrSearch;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tvEvmTip;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_evm_tip_banner;
                    ShapeLinearLayout shapeLinearLayout = (ShapeLinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (shapeLinearLayout != null) {
                        i11 = R$id.tv_title;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            return new C44841p4((LinearLayout) view, clearEditText, recyclerView, baseTextView, shapeLinearLayout, baseTextView2);
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
        return this.f100624a;
    }

    public C44841p4(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull ShapeLinearLayout shapeLinearLayout, @NonNull BaseTextView baseTextView2) {
        this.f100624a = linearLayout;
        this.f100625b = clearEditText;
        this.f100626c = recyclerView;
        this.f100627d = baseTextView;
        this.f100628e = shapeLinearLayout;
        this.f100629f = baseTextView2;
    }
}
