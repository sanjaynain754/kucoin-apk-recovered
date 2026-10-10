package com.tencent.rmonitor.common.lifecycle;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u000e"}, m90084d2 = {"Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;", "", "onBackground", "", "onCreate", "activity", "Landroid/app/Activity;", "onDestroy", "onForeground", "onPause", "onPostCreate", "onResume", "onStart", "onStop", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IActivityStateCallback {
    void onBackground();

    void onCreate(@NotNull Activity activity);

    void onDestroy(@NotNull Activity activity);

    void onForeground();

    void onPause(@NotNull Activity activity);

    void onPostCreate(@NotNull Activity activity);

    void onResume(@NotNull Activity activity);

    void onStart(@NotNull Activity activity);

    void onStop(@NotNull Activity activity);
}
