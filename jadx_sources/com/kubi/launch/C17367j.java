package com.kubi.launch;

import androidx.webkit.ProxyConfig;
import com.kubi.utils.storage.StorageType;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.launch.j */
/* JADX INFO: compiled from: LauncherConstant.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"KEY_LAUNCHER_TYPE", "", "LAUNCHER_TYPE_COLD", "", "LAUNCHER_TYPE_HOT", "LAUNCHER_TYPE_WARM", "launcherEnableSchema", "", "getLauncherEnableSchema", "()Ljava/util/Set;", "LAUNCHER_CATEGORY", "newVersionGuidanceSid", "Lcom/kubi/utils/storage/StorageId;", "", "getNewVersionGuidanceSid", "()Lcom/kubi/utils/storage/StorageId;", "newUserRegisterRouter", "LAppFacade_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17367j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Set<String> f31800a = SetsKt.setOf((Object[]) new String[]{"http", ProxyConfig.MATCH_HTTPS, "kucoin"});

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Boolean> f31801b = new StorageId<>("appLauncher", "newVersion4x", StorageType.Shared, false, 8, null);

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Set<String> m37480a() {
        return f31800a;
    }
}
