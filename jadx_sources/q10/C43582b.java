package q10;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.search.R$id;

/* JADX INFO: renamed from: q10.b */
/* JADX INFO: compiled from: SearchFragmentHistoryBinding.java */
/* JADX INFO: loaded from: classes44.dex */
public final class C43582b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f96181a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f96182b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f96183c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f96184d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43582b m95914a(@NonNull View view) {
        int i11 = R$id.ivHistoryClean;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.rvHistory;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tvHistoryTitle;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C43582b((ConstraintLayout) view, imageView, recyclerView, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f96181a;
    }

    public C43582b(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView) {
        this.f96181a = constraintLayout;
        this.f96182b = imageView;
        this.f96183c = recyclerView;
        this.f96184d = baseTextView;
    }
}
