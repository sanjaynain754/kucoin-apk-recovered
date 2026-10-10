package fj;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: fj.k */
/* JADX INFO: compiled from: HomeLayoutNavigationWeb3tabBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37527k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f83351a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f83352b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83353c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f83354d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f83355e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37527k m84516a(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.tvTabExchange;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.tvTabWallet;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.vBlock;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    return new C37527k(frameLayout, frameLayout, baseTextView, baseTextView2, baseTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f83351a;
    }

    public C37527k(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f83351a = frameLayout;
        this.f83352b = frameLayout2;
        this.f83353c = baseTextView;
        this.f83354d = baseTextView2;
        this.f83355e = baseTextView3;
    }
}
