package p493oa;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.app.widget.R$id;

/* JADX INFO: renamed from: oa.a */
/* JADX INFO: compiled from: AppWidgetViewUploadImageBinding.java */
/* JADX INFO: loaded from: classes4.dex */
public final class C43004a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f95157a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f95158b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f95159c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f95160d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f95161e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TextView f95162f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextView f95163g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C43004a m94434a(@NonNull View view) {
        int i11 = R$id.icon_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.image_preview;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.image_view;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.ll_tips;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.tv_progress;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                        if (textView != null) {
                            i11 = R$id.tv_tips;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                            if (textView2 != null) {
                                return new C43004a(view, imageView, imageView2, imageView3, linearLayout, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f95157a;
    }

    public C43004a(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f95157a = view;
        this.f95158b = imageView;
        this.f95159c = imageView2;
        this.f95160d = imageView3;
        this.f95161e = linearLayout;
        this.f95162f = textView;
        this.f95163g = textView2;
    }
}
