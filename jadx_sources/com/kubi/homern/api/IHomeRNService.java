package com.kubi.homern.api;

import android.view.View;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IHomeRNService.kt */
/* JADX INFO: loaded from: classes16.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003H&J\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003H&J\u0018\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003H&J\b\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/homern/api/IHomeRNService;", "", "getHomeRefreshViewManagerService", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "Lcom/facebook/react/uimanager/ReactShadowNode;", "getHomeNestedScrollCoordinatorViewManagerService", "getHomeEditorAutoScrollCoordinatorViewManagerService", "createHomeRNFragment", "Lcom/kubi/sdk/BaseFragment;", "Companion", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IHomeRNService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f26874a = Companion.f26875a;

    /* JADX INFO: compiled from: IHomeRNService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/homern/api/IHomeRNService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/homern/api/IHomeRNService;", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f26875a = new Companion();

        @NotNull
        public final IHomeRNService get() {
            return (IHomeRNService) Router.f46192a.m56192n(IHomeRNService.class);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    ViewManager<View, ReactShadowNode<?>> mo31236a();

    @NotNull
    /* JADX INFO: renamed from: b */
    BaseFragment mo31237b();

    @NotNull
    /* JADX INFO: renamed from: c */
    ViewManager<View, ReactShadowNode<?>> mo31238c();

    @NotNull
    /* JADX INFO: renamed from: d */
    ViewManager<View, ReactShadowNode<?>> mo31239d();
}
