package dm;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;

/* JADX INFO: renamed from: dm.e2 */
/* JADX INFO: compiled from: BkumexFragmentFundsRecordBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36754e2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f79951a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final SwipeRefreshRecyclerView f79952b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f79953c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f79954d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36754e2 m82359a(@NonNull View view) {
        int i11 = R$id.m_swipe_recycler_view;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView = (SwipeRefreshRecyclerView) ViewBindings.findChildViewById(view, i11);
        if (swipeRefreshRecyclerView != null) {
            i11 = R$id.title;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.type;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    return new C36754e2((LinearLayout) view, swipeRefreshRecyclerView, baseTextView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f79951a;
    }

    public C36754e2(@NonNull LinearLayout linearLayout, @NonNull SwipeRefreshRecyclerView swipeRefreshRecyclerView, @NonNull BaseTextView baseTextView, @NonNull ImageView imageView) {
        this.f79951a = linearLayout;
        this.f79952b = swipeRefreshRecyclerView;
        this.f79953c = baseTextView;
        this.f79954d = imageView;
    }
}
