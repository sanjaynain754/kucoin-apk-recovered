package v30;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.kubi.core.biz.symbolbar.SymbolBarLayout;

/* JADX INFO: renamed from: v30.f */
/* JADX INFO: compiled from: BkcoinCoreSymbolBarLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45380f implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final SymbolBarLayout f102071a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SymbolBarLayout f102072b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45380f m100290a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        SymbolBarLayout symbolBarLayout = (SymbolBarLayout) view;
        return new C45380f(symbolBarLayout, symbolBarLayout);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SymbolBarLayout getRoot() {
        return this.f102071a;
    }

    public C45380f(@NonNull SymbolBarLayout symbolBarLayout, @NonNull SymbolBarLayout symbolBarLayout2) {
        this.f102071a = symbolBarLayout;
        this.f102072b = symbolBarLayout2;
    }
}
