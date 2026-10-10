package com.jumio.core.interfaces;

import android.content.Context;
import com.jumio.core.Injected;
import com.tencent.bugly.proguard.C33812n7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/interfaces/DeviceUtilInterface;", "", "isSupportedPlatform", "", "context", "Landroid/content/Context;", "useIntel", "isDebug", "areAnimationsEnabled", "isDarkModeActive", "isTalkbackEnabled", "installationId", "", C33812n7.f71057p, "isEmulatorPropertiesPresent", "hasEmulatorRelatedFiles", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface DeviceUtilInterface {
    boolean areAnimationsEnabled(@Nullable Context context);

    boolean hasEmulatorRelatedFiles();

    @NotNull
    String installationId(@NotNull Context context);

    boolean isDarkModeActive(@NotNull Context context);

    boolean isDebug(@Nullable Context context);

    boolean isEmulatorPropertiesPresent();

    boolean isSupportedPlatform(@NotNull Context context, boolean useIntel);

    boolean isTalkbackEnabled(@NotNull Context context);

    @NotNull
    String userAgent(@NotNull Context context);
}
