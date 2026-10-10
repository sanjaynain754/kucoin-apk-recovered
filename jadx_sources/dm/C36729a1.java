package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SuffixTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.a1 */
/* JADX INFO: compiled from: BkumexDialogSelectFuturesWelfareBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36729a1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f79674a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f79675b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f79676c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f79677d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TabLayout f79678e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f79679f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcPrimaryButton f79680g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final SuffixTextView f79681h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36729a1 m82307a(@NonNull View view) {
        int i11 = R$id.container;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.iv_close;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    i11 = R$id.tab;
                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i11);
                    if (tabLayout != null) {
                        i11 = R$id.title;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_confirm;
                            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                            if (kcPrimaryButton != null) {
                                i11 = R$id.tv_welfare_tips;
                                SuffixTextView suffixTextView = (SuffixTextView) ViewBindings.findChildViewById(view, i11);
                                if (suffixTextView != null) {
                                    return new C36729a1((LinearLayout) view, linearLayoutCompat, appCompatImageView, recyclerView, tabLayout, baseTextView, kcPrimaryButton, suffixTextView);
                                }
                            }
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
        return this.f79674a;
    }

    public C36729a1(@NonNull LinearLayout linearLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatImageView appCompatImageView, @NonNull RecyclerView recyclerView, @NonNull TabLayout tabLayout, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull SuffixTextView suffixTextView) {
        this.f79674a = linearLayout;
        this.f79675b = linearLayoutCompat;
        this.f79676c = appCompatImageView;
        this.f79677d = recyclerView;
        this.f79678e = tabLayout;
        this.f79679f = baseTextView;
        this.f79680g = kcPrimaryButton;
        this.f79681h = suffixTextView;
    }
}
