package v30;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.q */
/* JADX INFO: compiled from: DialogNftBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45402q implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102288a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BGABanner f102289b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f102290c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f102291d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f102292e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102293f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102294g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45402q m100341a(@NonNull View view) {
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
                            return new C45402q((LinearLayout) view, bGABanner, viewFindChildViewById, imageView, baseTextView, baseTextView2, baseTextView3);
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
        return this.f102288a;
    }

    public C45402q(@NonNull LinearLayout linearLayout, @NonNull BGABanner bGABanner, @NonNull View view, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f102288a = linearLayout;
        this.f102289b = bGABanner;
        this.f102290c = view;
        this.f102291d = imageView;
        this.f102292e = baseTextView;
        this.f102293f = baseTextView2;
        this.f102294g = baseTextView3;
    }
}
