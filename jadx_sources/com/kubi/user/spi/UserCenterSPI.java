package com.kubi.user.spi;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.user.config.a;
import com.kubi.user.utils.l0;
import com.kubi.utils.storage.StorageType;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p668un.InterfaceC45270g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: UserCenterSPI.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/user/spi/UserCenterSPI;", "Lcom/kubi/launch/spi/IUserCenterSPI;", "<init>", "()V", "TAG", "", "everydayFirstLogin", "hasLockState", "", "setLockState", "", "state", "isLockAb", "isSiteAb", "logout", "success", "Ljava/lang/Runnable;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "isNeedChangeSite", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserCenterSPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCenterSPI.kt\ncom/kubi/user/spi/UserCenterSPI\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,107:1\n84#2:108\n75#2,2:109\n23#2,2:111\n*S KotlinDebug\n*F\n+ 1 UserCenterSPI.kt\ncom/kubi/user/spi/UserCenterSPI\n*L\n33#1:108\n41#1:109,2\n59#1:111,2\n*E\n"})
public final class UserCenterSPI implements InterfaceC45270g {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f53819b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f53820a = "UserCenterSPI";

    /* JADX INFO: compiled from: UserCenterSPI.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/user/spi/UserCenterSPI$Companion;", "", "<init>", "()V", "HOUR", "", "getStatisticalDay", "", "now", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "Ljava/util/TimeZone;", "getStatisticalDay$UserCenterLib_googleRelease", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ long getStatisticalDay$UserCenterLib_googleRelease$default(Companion companion, long j11, TimeZone timeZone, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                timeZone = TimeZone.getDefault();
                Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
            }
            return companion.getStatisticalDay$UserCenterLib_googleRelease(j11, timeZone);
        }

        @VisibleForTesting
        public final long getStatisticalDay$UserCenterLib_googleRelease(long now, @NotNull TimeZone timeZone) {
            Intrinsics.checkNotNullParameter(timeZone, "timeZone");
            long offset = now + ((long) timeZone.getOffset(now));
            long j11 = 86400000;
            long j12 = offset / j11;
            if (offset % j11 < 14400000) {
                return j12 - 1;
            }
            return j12;
        }
    }

    @Override // p668un.InterfaceC45270g
    /* JADX INFO: renamed from: c */
    public boolean mo65781c() {
        return UserInfo.a.o();
    }

    @Override // p668un.InterfaceC45270g
    @Nullable
    /* JADX INFO: renamed from: d */
    public String mo65782d() {
        UserInfo userInfo = UserInfo.a;
        if (userInfo.d() == UserInfo.LoginState.Login) {
            return null;
        }
        l0 l0Var = l0.a;
        long jM102324f = C46392a.m102324f(l0Var.b(), 0L);
        long statisticalDay$UserCenterLib_googleRelease$default = Companion.getStatisticalDay$UserCenterLib_googleRelease$default(f53819b, System.currentTimeMillis(), null, 2, null);
        if (jM102324f == statisticalDay$UserCenterLib_googleRelease$default) {
            return null;
        }
        C46392a.m102330m(l0Var.b(), statisticalDay$UserCenterLib_googleRelease$default);
        return userInfo.m() ? "needLogin" : "needRegister";
    }

    @Override // p668un.InterfaceC45270g
    /* JADX INFO: renamed from: e */
    public boolean mo65783e() {
        SiteVisibleConfigKey siteVisibleConfigKey = SiteVisibleConfigKey.SecurityBiometrics;
        if (!C24129b.m58030b(siteVisibleConfigKey)) {
            C44128b.m97261e("UserCenterSPI", "AppLock 多租户生物识别关 ");
            a.f(false);
        }
        SiteVisibleConfigKey siteVisibleConfigKey2 = SiteVisibleConfigKey.SecurityPattern;
        if (!C24129b.m58030b(siteVisibleConfigKey2)) {
            C44128b.m97261e("UserCenterSPI", "AppLock 多租户手势关 ");
            a.g(false);
        }
        return C24129b.m58030b(SiteVisibleConfigKey.AppLockSettings) && (C24129b.m58030b(siteVisibleConfigKey) || C24129b.m58030b(siteVisibleConfigKey2));
    }

    @Override // p668un.InterfaceC45270g
    /* JADX INFO: renamed from: h */
    public boolean mo65784h() {
        return IUserService.a.get().h();
    }

    @Override // p668un.InterfaceC45270g
    /* JADX INFO: renamed from: a */
    public void mo65779a(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C46392a.m102333p(new StorageId("CATE_KV_SAFE", UserInfo.c().id + "lock_app_count_down", StorageType.Shared, false, 8, null), state);
    }

    @Override // p668un.InterfaceC45270g
    /* JADX INFO: renamed from: b */
    public void mo65780b(@NotNull Runnable success, @NotNull Runnable error, boolean z11) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        IUserService.a.get().N(success, error, z11);
    }
}
