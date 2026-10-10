package gq;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: gq.b */
/* JADX INFO: compiled from: BmineLayoutKycGuideBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37981b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f85412a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f85413b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f85414c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayoutCompat f85415d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f85416e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f85417f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37981b m85837a(@NonNull View view) {
        int i11 = R$id.ivKycActionArrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivKycTitleIcon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                i11 = R$id.tvKycTips;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvKycTitle;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        return new C37981b(linearLayoutCompat, imageView, imageView2, linearLayoutCompat, baseTextView, baseTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f85412a;
    }

    public C37981b(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f85412a = linearLayoutCompat;
        this.f85413b = imageView;
        this.f85414c = imageView2;
        this.f85415d = linearLayoutCompat2;
        this.f85416e = baseTextView;
        this.f85417f = baseTextView2;
    }
}
