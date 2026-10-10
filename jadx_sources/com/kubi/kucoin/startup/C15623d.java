package com.kubi.kucoin.startup;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kucoin.startup.d */
/* JADX INFO: compiled from: EdgeToEdgeStartupTask.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m90084d2 = {"SUMSUB_APP_ACTIVITY", "", "shouldApplyHostSystemBarLayout", "", "activityClassName", "LAppStartup_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C15623d {
    /* JADX INFO: renamed from: a */
    public static final boolean m32874a(@NotNull String activityClassName) {
        Intrinsics.checkNotNullParameter(activityClassName, "activityClassName");
        return !Intrinsics.areEqual(activityClassName, "com.sumsub.sns.internal.features.presentation.main.SNSAppActivity");
    }
}
