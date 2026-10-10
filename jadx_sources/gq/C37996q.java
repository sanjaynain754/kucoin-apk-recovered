package gq;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: gq.q */
/* JADX INFO: compiled from: KucoinLayoutQaParamsBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37996q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f85587a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f85588b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f85589c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f85590d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37996q m85867a(@NonNull View view) {
        int i11 = R$id.bt_share;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.ll_root;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    return new C37996q((LinearLayout) view, kcPrimaryButton, linearLayout, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f85587a;
    }

    public C37996q(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView) {
        this.f85587a = linearLayout;
        this.f85588b = kcPrimaryButton;
        this.f85589c = linearLayout2;
        this.f85590d = recyclerView;
    }
}
