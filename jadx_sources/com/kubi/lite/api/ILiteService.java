package com.kubi.lite.api;

import android.os.Bundle;
import com.kubi.router.core.Router;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: ILiteService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H&J$\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/lite/api/ILiteService;", "", "liteInUse", "", "isLiteAvailable", "checkTransition", "mainActivity", "Lcom/kubi/sdk/BaseActivity;", "launchLiteFlutterActivity", "", "bundle", "Landroid/os/Bundle;", "animation", "forceNoAnim", "launchLiteMainActivity", "migrateLiteMarketStorageIfNeeded", "Companion", "LiteApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ILiteService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f32003a = Companion.f32004a;

    /* JADX INFO: compiled from: ILiteService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/lite/api/ILiteService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/lite/api/ILiteService;", "LiteApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f32004a = new Companion();

        @NotNull
        public final ILiteService get() {
            return (ILiteService) Router.f46192a.m56192n(ILiteService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo37530a();

    /* JADX INFO: renamed from: b */
    void mo37531b(@NotNull Bundle bundle, boolean z11, boolean z12);

    /* JADX INFO: renamed from: c */
    void mo37532c();

    /* JADX INFO: renamed from: d */
    static /* synthetic */ void m37529d(ILiteService iLiteService, Bundle bundle, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchLiteMainActivity");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        iLiteService.mo37531b(bundle, z11, z12);
    }
}
