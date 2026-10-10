package t20;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.x */
/* JADX INFO: compiled from: DialogNftBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44674x implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99425a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BGABanner f99426b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f99427c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f99428d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99429e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99430f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99431g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44674x m98824a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.banner;
        BGABanner bGABanner = (BGABanner) ViewBindings.findChildViewById(view, i11);
        if (bGABanner != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.bar))) != null) {
            i11 = R$id.iv_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.tv_content;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_known;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tv_title;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            return new C44674x((LinearLayout) view, bGABanner, viewFindChildViewById, imageView, baseTextView, baseTextView2, baseTextView3);
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
        return this.f99425a;
    }

    public C44674x(@NonNull LinearLayout linearLayout, @NonNull BGABanner bGABanner, @NonNull View view, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f99425a = linearLayout;
        this.f99426b = bGABanner;
        this.f99427c = view;
        this.f99428d = imageView;
        this.f99429e = baseTextView;
        this.f99430f = baseTextView2;
        this.f99431g = baseTextView3;
    }
}
