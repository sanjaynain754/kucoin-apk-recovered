package com.kubi.sdk.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/startup/IStartupTask;", "", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface IStartupTask {
    void run(@NotNull Application application);
}
