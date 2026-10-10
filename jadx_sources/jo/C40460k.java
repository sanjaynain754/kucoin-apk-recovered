package jo;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;
import com.kubi.resources.widget.CoinAvatarView;

/* JADX INFO: renamed from: jo.k */
/* JADX INFO: compiled from: BloanViewChooseCoinBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40460k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f89825a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f89826b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CoinAvatarView f89827c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f89828d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f89829e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f89830f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f89831g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40460k m89109a(@NonNull View view) {
        int i11 = R$id.iv_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_icon;
            CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
            if (coinAvatarView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i11 = R$id.tv_currency;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    i11 = R$id.tv_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                    if (textView2 != null) {
                        i11 = R$id.tv_tag;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView3 != null) {
                            return new C40460k(linearLayout, imageView, coinAvatarView, linearLayout, textView, textView2, textView3);
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
        return this.f89825a;
    }

    public C40460k(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull CoinAvatarView coinAvatarView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f89825a = linearLayout;
        this.f89826b = imageView;
        this.f89827c = coinAvatarView;
        this.f89828d = linearLayout2;
        this.f89829e = textView;
        this.f89830f = textView2;
        this.f89831g = textView3;
    }
}
