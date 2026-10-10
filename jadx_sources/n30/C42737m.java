package n30;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradebase.R$id;

/* JADX INFO: renamed from: n30.m */
/* JADX INFO: compiled from: KcFeatureToggleCardSelectorListDialogBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42737m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f94648a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f94649b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f94650c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42737m m93647a(@NonNull View view) {
        int i11 = R$id.rvDataList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.tvDialogTitle;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                return new C42737m((LinearLayout) view, recyclerView, baseTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f94648a;
    }

    public C42737m(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView) {
        this.f94648a = linearLayout;
        this.f94649b = recyclerView;
        this.f94650c = baseTextView;
    }
}
