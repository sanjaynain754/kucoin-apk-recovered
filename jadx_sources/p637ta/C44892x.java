package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.x */
/* JADX INFO: compiled from: AssetDialogDepositAddressBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44892x implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101098a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f101099b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f101100c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f101101d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101102e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44892x m99308a(@NonNull View view) {
        int i11 = R$id.btn_add;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.iv_cancel;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tv_title;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C44892x((ConstraintLayout) view, baseTextView, imageView, recyclerView, baseTextView2);
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
        return this.f101098a;
    }

    public C44892x(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView2) {
        this.f101098a = constraintLayout;
        this.f101099b = baseTextView;
        this.f101100c = imageView;
        this.f101101d = recyclerView;
        this.f101102e = baseTextView2;
    }
}
