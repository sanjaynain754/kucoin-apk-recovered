package v30;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.r */
/* JADX INFO: compiled from: DialogUnifyLoanCurrencySelectBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45404r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102309a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ClearEditText f102310b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f102311c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f102312d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f102313e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102314f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45404r m100345a(@NonNull View view) {
        int i11 = R$id.etSearchBar;
        ClearEditText clearEditText = (ClearEditText) ViewBindings.findChildViewById(view, i11);
        if (clearEditText != null) {
            i11 = R$id.ivClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.ll_coin;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                    if (recyclerView != null) {
                        i11 = R$id.tvTitle;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            return new C45404r((LinearLayout) view, clearEditText, imageView, linearLayout, recyclerView, baseTextView);
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
        return this.f102309a;
    }

    public C45404r(@NonNull LinearLayout linearLayout, @NonNull ClearEditText clearEditText, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView) {
        this.f102309a = linearLayout;
        this.f102310b = clearEditText;
        this.f102311c = imageView;
        this.f102312d = linearLayout2;
        this.f102313e = recyclerView;
        this.f102314f = baseTextView;
    }
}
