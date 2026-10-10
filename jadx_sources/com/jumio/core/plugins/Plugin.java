package com.jumio.core.plugins;

import com.jumio.core.Controller;
import com.jumio.core.models.ScanPartModel;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0011À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/plugins/Plugin;", "", "version", "", "getVersion", "()Ljava/lang/String;", "isUsable", "", "controller", "Lcom/jumio/core/Controller;", "isApplicableFor", "scanPartModel", "Lcom/jumio/core/models/ScanPartModel;", "preload", "", "unload", "isPreloaded", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface Plugin {

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isApplicableFor(@NotNull Plugin plugin, @NotNull Controller controller, @NotNull ScanPartModel scanPartModel) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
            return Plugin.super.isApplicableFor(controller, scanPartModel);
        }

        @Deprecated
        public static boolean isPreloaded(@NotNull Plugin plugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            return Plugin.super.isPreloaded(controller);
        }

        @Deprecated
        public static boolean isUsable(@NotNull Plugin plugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            return Plugin.super.isUsable(controller);
        }

        @Deprecated
        public static void preload(@NotNull Plugin plugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Plugin.super.preload(controller);
        }

        @Deprecated
        public static void unload(@NotNull Plugin plugin) {
            Plugin.super.unload();
        }
    }

    @NotNull
    String getVersion();

    default boolean isApplicableFor(@NotNull Controller controller, @NotNull ScanPartModel scanPartModel) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
        return true;
    }

    default boolean isPreloaded(@NotNull Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return true;
    }

    default boolean isUsable(@NotNull Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        return true;
    }

    default void preload(@NotNull Controller controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
    }

    default void unload() {
    }
}
