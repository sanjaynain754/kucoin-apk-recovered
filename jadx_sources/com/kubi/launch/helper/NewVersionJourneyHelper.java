package com.kubi.launch.helper;

import com.kubi.router.core.Router;
import com.kubi.sdk.BaseConstants;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.AppInstallStatusManager;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p830zf.InterfaceC46801h0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.launch.helper.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: NewVersionJourneyHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/launch/helper/NewVersionJourneyHelper;", "", "<init>", "()V", "needNewVersionGuidance", "", "signupGuidanceShowed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "needSignupGuidance", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewVersionJourneyHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewVersionJourneyHelper.kt\ncom/kubi/launch/helper/NewVersionJourneyHelper\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,51:1\n17#2,2:52\n17#2,2:57\n136#3:54\n126#3,2:55\n*S KotlinDebug\n*F\n+ 1 NewVersionJourneyHelper.kt\ncom/kubi/launch/helper/NewVersionJourneyHelper\n*L\n24#1:52,2\n44#1:57,2\n25#1:54\n27#1:55,2\n*E\n"})
public final class NewVersionJourneyHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final NewVersionJourneyHelper f31794a = new NewVersionJourneyHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AtomicBoolean f31795b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final boolean m37477a() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46801h0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC46801h0) objM56186h).m103130a();
        }
        BaseConstants baseConstants = BaseConstants.f46539a;
        if (C46392a.m102322d(baseConstants.m56609b(), false)) {
            return false;
        }
        C46392a.m102328k(baseConstants.m56609b(), true);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37478b() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46801h0.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h != null ? ((InterfaceC46801h0) objM56186h).m103132c() : false) && AppInstallStatusManager.f48140a.m58376b() && !f31795b.getAndSet(true);
    }
}
