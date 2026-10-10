package com.kubi.redpackage.api;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.router.core.Router;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IRedPackageService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/redpackage/api/IRedPackageService;", "", "isSupportRedPackage", "", FirebaseAnalytics.Param.CURRENCY, "", "jumpToRedPackageHome", "", "fetchSupportRedPackageCoins", "getRedPacketData", "redCode", "Companion", "RedpackageApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IRedPackageService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f43051a = Companion.f43052a;

    /* JADX INFO: compiled from: IRedPackageService.kt */
    /* JADX INFO: loaded from: classes38.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/redpackage/api/IRedPackageService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/redpackage/api/IRedPackageService;", "RedpackageApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f43052a = new Companion();

        @NotNull
        public final IRedPackageService get() {
            return (IRedPackageService) Router.f46192a.m56192n(IRedPackageService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo53743a();

    /* JADX INFO: renamed from: b */
    boolean mo53744b(@NotNull String str);

    /* JADX INFO: renamed from: c */
    void mo53745c();

    /* JADX INFO: renamed from: d */
    void mo53746d(@Nullable String str);
}
