package fj;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;

/* JADX INFO: renamed from: fj.z0 */
/* JADX INFO: compiled from: PopupCardEditMenuItemBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37558z0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f83512a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f83513b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f83514c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37558z0 m84590a(@NonNull View view) {
        int i11 = R$id.card_menu_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.card_menu_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null) {
                return new C37558z0((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f83512a;
    }

    public C37558z0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f83512a = linearLayout;
        this.f83513b = imageView;
        this.f83514c = textView;
    }
}
