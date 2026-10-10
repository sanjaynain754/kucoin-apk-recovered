package p727wj;

import android.view.View;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;
import com.kubi.homern.api.IHomeRNService;
import com.kubi.homern.page.HomeRnFragment;
import com.kubi.homern.widgets.homeeditorautoscroll.KCHomeEditorAutoScrollCoordinatorManager;
import com.kubi.homern.widgets.homenestedscroll.KCHomeNestedScrollCoordinatorManager;
import com.kubi.homern.widgets.homerefresh.KCHomeRefreshControlManager;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: wj.a */
/* JADX INFO: compiled from: HomeRNService.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005H\u0016J\u0018\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005H\u0016J\u0018\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/homern/service/HomeRNService;", "Lcom/kubi/homern/api/IHomeRNService;", "<init>", "()V", "getHomeRefreshViewManagerService", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "Lcom/facebook/react/uimanager/ReactShadowNode;", "getHomeNestedScrollCoordinatorViewManagerService", "getHomeEditorAutoScrollCoordinatorViewManagerService", "createHomeRNFragment", "Lcom/kubi/sdk/BaseFragment;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45849a implements IHomeRNService {
    @Override // com.kubi.homern.api.IHomeRNService
    @NotNull
    /* JADX INFO: renamed from: a */
    public ViewManager<View, ReactShadowNode<?>> mo31236a() {
        return new KCHomeNestedScrollCoordinatorManager();
    }

    @Override // com.kubi.homern.api.IHomeRNService
    @NotNull
    /* JADX INFO: renamed from: b */
    public BaseFragment mo31237b() {
        return HomeRnFragment.f26965b0.newInstance();
    }

    @Override // com.kubi.homern.api.IHomeRNService
    @NotNull
    /* JADX INFO: renamed from: c */
    public ViewManager<View, ReactShadowNode<?>> mo31238c() {
        return new KCHomeEditorAutoScrollCoordinatorManager();
    }

    @Override // com.kubi.homern.api.IHomeRNService
    @NotNull
    /* JADX INFO: renamed from: d */
    public ViewManager<View, ReactShadowNode<?>> mo31239d() {
        return new KCHomeRefreshControlManager();
    }
}
