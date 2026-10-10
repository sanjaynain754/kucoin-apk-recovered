package p637ta;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.overview.ongoing.OnGoingRecommendView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.w1 */
/* JADX INFO: compiled from: AssetOngoingListBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44887w1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f101038a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RelativeLayout f101039b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f101040c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f101041d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f101042e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final OnGoingRecommendView f101043f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f101044g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f101045h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f101046i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44887w1 m99298a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.header;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
        if (relativeLayout != null) {
            i11 = R$id.ivArrow;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.loadLayout;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.loadView))) != null) {
                    i11 = R$id.recommendView;
                    OnGoingRecommendView onGoingRecommendView = (OnGoingRecommendView) ViewBindings.findChildViewById(view, i11);
                    if (onGoingRecommendView != null) {
                        i11 = R$id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                        if (recyclerView != null) {
                            i11 = R$id.tvTitle;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.viewDivider))) != null) {
                                return new C44887w1((FrameLayout) view, relativeLayout, imageView, frameLayout, viewFindChildViewById, onGoingRecommendView, recyclerView, baseTextView, viewFindChildViewById2);
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
        return this.f101038a;
    }

    public C44887w1(@NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull View view, @NonNull OnGoingRecommendView onGoingRecommendView, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull View view2) {
        this.f101038a = frameLayout;
        this.f101039b = relativeLayout;
        this.f101040c = imageView;
        this.f101041d = frameLayout2;
        this.f101042e = view;
        this.f101043f = onGoingRecommendView;
        this.f101044g = recyclerView;
        this.f101045h = baseTextView;
        this.f101046i = view2;
    }
}
