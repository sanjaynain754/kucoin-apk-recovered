package p206dp;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dp.z */
/* JADX INFO: compiled from: BmarginFragmentMarketCoinInfoDetailBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36950z implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f82060a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f82061b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f82062c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36950z m82769a(@NonNull View view) {
        int i11 = R$id.tv_content;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tv_know;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                return new C36950z((LinearLayout) view, baseTextView, baseTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f82060a;
    }

    public C36950z(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f82060a = linearLayout;
        this.f82061b = baseTextView;
        this.f82062c = baseTextView2;
    }
}
