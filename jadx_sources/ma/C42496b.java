package ma;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.app.country.R$id;

/* JADX INFO: renamed from: ma.b */
/* JADX INFO: compiled from: SafeLayoutAddCountryCodeBinding.java */
/* JADX INFO: loaded from: classes.dex */
public final class C42496b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f94157a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f94158b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f94159c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f94160d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42496b m93181a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.iv_flag;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tv_choose_phone_code;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
            if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                return new C42496b(view, imageView, textView, viewFindChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f94157a;
    }

    public C42496b(@NonNull View view, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull View view2) {
        this.f94157a = view;
        this.f94158b = imageView;
        this.f94159c = textView;
        this.f94160d = view2;
    }
}
