package l50;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.a */
/* JADX INFO: compiled from: BtradingBotKitActivityGridCouponsBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42057a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f92354a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f92355b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f92356c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KuCoinRefreshLayout f92357d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatTextView f92358e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f92359f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42057a m92265a(@NonNull View view) {
        int i11 = R$id.iv_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.refresh_view;
                KuCoinRefreshLayout kuCoinRefreshLayout = (KuCoinRefreshLayout) ViewBindings.findChildViewById(view, i11);
                if (kuCoinRefreshLayout != null) {
                    i11 = R$id.tv_confirm;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatTextView != null) {
                        i11 = R$id.tv_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView != null) {
                            return new C42057a((ConstraintLayout) view, imageView, recyclerView, kuCoinRefreshLayout, appCompatTextView, textView);
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
    public ConstraintLayout getRoot() {
        return this.f92354a;
    }

    public C42057a(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull KuCoinRefreshLayout kuCoinRefreshLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView) {
        this.f92354a = constraintLayout;
        this.f92355b = imageView;
        this.f92356c = recyclerView;
        this.f92357d = kuCoinRefreshLayout;
        this.f92358e = appCompatTextView;
        this.f92359f = textView;
    }
}
