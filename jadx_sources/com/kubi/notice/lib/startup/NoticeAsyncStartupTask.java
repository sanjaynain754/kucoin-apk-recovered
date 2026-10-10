package com.kubi.notice.lib.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.common.MimeTypes;
import com.kubi.notice.lib.api.C19412c;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NoticeAsyncStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\t"}, m90084d2 = {"Lcom/kubi/notice/lib/startup/NoticeAsyncStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "trackNotificationSwitch", "NoticeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "network_async", priority = 200, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Async)
public final class NoticeAsyncStartupTask implements IStartupTask {
    private final void trackNotificationSwitch(Application application) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", NotificationManagerCompat.from(application).areNotificationsEnabled() ? "OPEN" : "CLOSED");
        Unit unit = Unit.INSTANCE;
        C19412c.m43163b("B1messagecenter", "systemSwitchs", "1", jSONObject);
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull Application application) throws JSONException {
        Intrinsics.checkNotNullParameter(application, "application");
        trackNotificationSwitch(application);
    }
}
