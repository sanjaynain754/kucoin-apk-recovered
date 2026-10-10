package l50;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.w */
/* JADX INFO: compiled from: BtradingBotKitLayoutHotCoinListBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42097w implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f93298a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f93299b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f93300c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatTextView f93301d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42097w m92349a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i12 = R$id.tv_more;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i12);
            if (appCompatTextView != null) {
                return new C42097w(constraintLayout, recyclerView, constraintLayout, appCompatTextView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f93298a;
    }

    public C42097w(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView) {
        this.f93298a = constraintLayout;
        this.f93299b = recyclerView;
        this.f93300c = constraintLayout2;
        this.f93301d = appCompatTextView;
    }
}
