package com.kubi;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.home.common.card.HomeCardsRepository;
import com.kubi.home.shortcut.ShortCutDataParser;
import com.kubi.home.v2.biz.grid.utils.GridNaviDataProvider;
import com.kubi.home.v2.card.HomeCardsRepositoryV2;
import com.kubi.home.widgets.HomeWidgetRepo;
import com.kubi.home.widgets.grid.GridNavigationWidgetPreloader;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p233ej.C37201i;
import p502oj.C43099d;
import p830zf.InterfaceC46816p;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeStartupTask.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/HomeStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "home", priority = 200, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Await)
@SourceDebugExtension({"SMAP\nHomeStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeStartupTask.kt\ncom/kubi/HomeStartupTask\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,42:1\n25#2,3:43\n*S KotlinDebug\n*F\n+ 1 HomeStartupTask.kt\ncom/kubi/HomeStartupTask\n*L\n27#1:43,3\n*E\n"})
public final class HomeStartupTask implements IStartupTask {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$2$lambda$1() {
        ShortCutDataParser.f26308a.m30399g();
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C43099d c43099d = C43099d.f95299a;
        c43099d.m94705b();
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46816p.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC46816p) objM56186h).m103147b();
        } else if (c43099d.m94706c()) {
            HomeCardsRepositoryV2.f26494a.m30787c();
            new HomeWidgetRepo().m31076j();
            GridNavigationWidgetPreloader.f26749a.m31194b();
            GridNaviDataProvider.f26418a.m30648h();
        } else {
            HomeCardsRepository.f25606a.m29067c();
            C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.a
                @Override // java.lang.Runnable
                public final void run() {
                    HomeStartupTask.run$lambda$2$lambda$1();
                }
            });
        }
        C37201i.f82500a.m83211C();
    }
}
