package n30;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradebase.R$id;

/* JADX INFO: renamed from: n30.i */
/* JADX INFO: compiled from: BtradebaseKlineToolbarBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42733i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f94624a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f94625b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f94626c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f94627d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f94628e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f94629f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f94630g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f94631h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f94632i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f94633j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42733i m93637a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.ivDelete;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.ivExit;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.ivEye;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView3 != null) {
                    i11 = R$id.ivLock;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView4 != null) {
                        i11 = R$id.ivRect;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView5 != null) {
                            i11 = R$id.ivSegment;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView6 != null) {
                                i11 = R$id.ivStraight;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                if (imageView7 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider1))) != null) {
                                    return new C42733i((FrameLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, viewFindChildViewById, viewFindChildViewById2);
                                }
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
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f94624a;
    }

    public C42733i(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull ImageView imageView7, @NonNull View view, @NonNull View view2) {
        this.f94624a = frameLayout;
        this.f94625b = imageView;
        this.f94626c = imageView2;
        this.f94627d = imageView3;
        this.f94628e = imageView4;
        this.f94629f = imageView5;
        this.f94630g = imageView6;
        this.f94631h = imageView7;
        this.f94632i = view;
        this.f94633j = view2;
    }
}
