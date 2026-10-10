package fj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;

/* JADX INFO: renamed from: fj.y0 */
/* JADX INFO: compiled from: PopupCardEditMenuBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37556y0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CardView f83503a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C37558z0 f83504b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f83505c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f83506d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C37558z0 f83507e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37556y0 m84585a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.edit_home_widget;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            C37558z0 c37558z0M84590a = C37558z0.m84590a(viewFindChildViewById2);
            i11 = R$id.home_card_menu;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.quick_change_style;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.remove_widget))) != null) {
                    return new C37556y0((CardView) view, c37558z0M84590a, linearLayout, linearLayout2, C37558z0.m84590a(viewFindChildViewById));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C37556y0 m84586c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.popup_card_edit_menu, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m84585a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.f83503a;
    }

    public C37556y0(@NonNull CardView cardView, @NonNull C37558z0 c37558z0, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull C37558z0 c37558z1) {
        this.f83503a = cardView;
        this.f83504b = c37558z0;
        this.f83505c = linearLayout;
        this.f83506d = linearLayout2;
        this.f83507e = c37558z1;
    }
}
