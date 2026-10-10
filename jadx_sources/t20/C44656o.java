package t20;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.o */
/* JADX INFO: compiled from: BkucoinLayoutCoinBottomBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44656o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99267a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f99268b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Button f99269c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C44658p f99270d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ViewSwitcher f99271e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44656o m98788a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btn_convert;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null) {
            i11 = R$id.btn_trade;
            Button button = (Button) ViewBindings.findChildViewById(view, i11);
            if (button != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.countDown))) != null) {
                C44658p c44658pM98792a = C44658p.m98792a(viewFindChildViewById);
                i11 = R$id.switcher;
                ViewSwitcher viewSwitcher = (ViewSwitcher) ViewBindings.findChildViewById(view, i11);
                if (viewSwitcher != null) {
                    return new C44656o((ConstraintLayout) view, linearLayout, button, c44658pM98792a, viewSwitcher);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99267a;
    }

    public C44656o(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull C44658p c44658p, @NonNull ViewSwitcher viewSwitcher) {
        this.f99267a = constraintLayout;
        this.f99268b = linearLayout;
        this.f99269c = button;
        this.f99270d = c44658p;
        this.f99271e = viewSwitcher;
    }
}
