package p701vs;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.widgets.userstatus.UserStatusNewGuideView;

/* JADX INFO: renamed from: vs.s */
/* JADX INFO: compiled from: OperationWidgetUserStatusBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45642s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102935a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C45641r f102936b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C45643t f102937c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f102938d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C45637n f102939e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final UserStatusNewGuideView f102940f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45642s m100775a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.includeAsset;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById2 != null) {
            C45641r c45641rM100773a = C45641r.m100773a(viewFindChildViewById2);
            i11 = R$id.includeGuide;
            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById3 != null) {
                C45643t c45643tM100777a = C45643t.m100777a(viewFindChildViewById3);
                i11 = R$id.includeGuideContainer;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.includeShimmer))) != null) {
                    C45637n c45637nM100764a = C45637n.m100764a(viewFindChildViewById);
                    i11 = R$id.userStatusGuideView;
                    UserStatusNewGuideView userStatusNewGuideView = (UserStatusNewGuideView) ViewBindings.findChildViewById(view, i11);
                    if (userStatusNewGuideView != null) {
                        return new C45642s((ConstraintLayout) view, c45641rM100773a, c45643tM100777a, frameLayout, c45637nM100764a, userStatusNewGuideView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f102935a;
    }

    public C45642s(@NonNull ConstraintLayout constraintLayout, @NonNull C45641r c45641r, @NonNull C45643t c45643t, @NonNull FrameLayout frameLayout, @NonNull C45637n c45637n, @NonNull UserStatusNewGuideView userStatusNewGuideView) {
        this.f102935a = constraintLayout;
        this.f102936b = c45641r;
        this.f102937c = c45643t;
        this.f102938d = frameLayout;
        this.f102939e = c45637n;
        this.f102940f = userStatusNewGuideView;
    }
}
