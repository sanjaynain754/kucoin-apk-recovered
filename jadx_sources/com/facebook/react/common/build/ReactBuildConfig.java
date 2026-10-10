package com.facebook.react.common.build;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: compiled from: ReactBuildConfig.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/facebook/react/common/build/ReactBuildConfig;", "", "<init>", "()V", "DEBUG", "", "IS_INTERNAL_BUILD", "EXOPACKAGE_FLAGS", "", "UNSTABLE_ENABLE_FUSEBOX_RELEASE", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ReactBuildConfig {

    @JvmField
    public static final boolean DEBUG = false;

    @JvmField
    public static final int EXOPACKAGE_FLAGS = 0;

    @NotNull
    public static final ReactBuildConfig INSTANCE = new ReactBuildConfig();

    @JvmField
    public static final boolean IS_INTERNAL_BUILD = false;

    @JvmField
    public static final boolean UNSTABLE_ENABLE_FUSEBOX_RELEASE = false;

    private ReactBuildConfig() {
    }
}
