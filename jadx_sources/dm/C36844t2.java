package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dm.t2 */
/* JADX INFO: compiled from: BkumexFragmentMarketCoinInfoDetailBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36844t2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81068a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81069b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81070c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36844t2 m82553a(@NonNull View view) {
        int i11 = R$id.tv_content;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tv_know;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                return new C36844t2((LinearLayout) view, baseTextView, baseTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f81068a;
    }

    public C36844t2(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f81068a = linearLayout;
        this.f81069b = baseTextView;
        this.f81070c = baseTextView2;
    }
}
