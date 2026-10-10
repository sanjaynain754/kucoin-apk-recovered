package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.t */
/* JADX INFO: compiled from: BkumexDialogFutureBonusDistributionChooseSymbolBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36841t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81052a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f81053b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f81054c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81055d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36841t m82547a(@NonNull View view) {
        int i11 = R$id.close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.tv1;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    return new C36841t((LinearLayout) view, appCompatImageView, recyclerView, baseTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81052a;
    }

    public C36841t(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView) {
        this.f81052a = linearLayout;
        this.f81053b = appCompatImageView;
        this.f81054c = recyclerView;
        this.f81055d = baseTextView;
    }
}
