package t20;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.g */
/* JADX INFO: compiled from: BkucoinFragmentMarketCoinInfoDetailBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44640g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99067a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f99068b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99069c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44640g m98757a(@NonNull View view) {
        int i11 = R$id.tv_content;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tv_know;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                return new C44640g((LinearLayout) view, baseTextView, baseTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f99067a;
    }

    public C44640g(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f99067a = linearLayout;
        this.f99068b = baseTextView;
        this.f99069c = baseTextView2;
    }
}
