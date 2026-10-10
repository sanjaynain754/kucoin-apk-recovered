package p233ej;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import com.kubi.home.api.R$id;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ej.j */
/* JADX INFO: compiled from: HomeFeedRNHelper.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/home/config/HomeFeedRNHelper;", "", "<init>", "()V", "fakeTabLayoutShow", "", "getFakeTabLayoutShow", "()Z", "setFakeTabLayoutShow", "(Z)V", "createFeedFragment", "Lcom/kubi/sdk/BaseFragment;", "tryAddFeedFragment", "", "context", "Landroid/content/Context;", "group", "Landroid/view/View;", "createFragmentContainer", "Landroidx/fragment/app/FragmentContainerView;", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37202j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37202j f82512a = new C37202j();

    /* JADX INFO: renamed from: b */
    public static boolean f82513b;

    @NotNull
    /* JADX INFO: renamed from: a */
    public final synchronized BaseFragment m83237a() {
        Bundle bundle;
        bundle = new Bundle();
        bundle.putString(Constants.BIZ, "home");
        bundle.putString("entry", "main");
        bundle.putString(Constants.COMPONENT, "home_rn_app");
        bundle.putString("route", "HomeFeedPage");
        bundle.putBoolean("ignoreHandleBackPressed", true);
        return IReactNativeService.INSTANCE.get().getRnRootFragment(bundle);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final FragmentContainerView m83238b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        fragmentContainerView.setId(R$id.quote_home_feed_container);
        return fragmentContainerView;
    }

    /* JADX INFO: renamed from: c */
    public final void m83239c(boolean z11) {
        f82513b = z11;
    }

    /* JADX INFO: renamed from: d */
    public final void m83240d(@Nullable Context context, @NotNull View group) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(group, "group");
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null) {
            return;
        }
        int i11 = R$id.quote_home_feed_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) fragmentActivity.findViewById(i11);
        if (fragmentContainerView == null) {
            FragmentContainerView fragmentContainerViewM83238b = m83238b(context);
            viewGroup = group instanceof ViewGroup ? (ViewGroup) group : null;
            if (viewGroup != null) {
                viewGroup.addView(fragmentContainerViewM83238b);
            }
            fragmentActivity.getSupportFragmentManager().beginTransaction().replace(i11, m83237a()).commitAllowingStateLoss();
            return;
        }
        if (Intrinsics.areEqual(group, fragmentContainerView.getParent())) {
            return;
        }
        if (fragmentContainerView.getParent() != null) {
            ViewParent parent = fragmentContainerView.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(fragmentContainerView);
            }
        }
        viewGroup = group instanceof ViewGroup ? (ViewGroup) group : null;
        if (viewGroup != null) {
            viewGroup.addView(fragmentContainerView);
        }
    }
}
