package com.jumio.core.plugins;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.jumio.core.Controller;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.ScanPartModel;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\fJ(\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH&JA\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H&¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH&J(\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0!H&J(\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0!H&J(\u0010#\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u000f2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0!H&¨\u0006$À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/plugins/AnalyticsPlugin;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/model/StaticModel;", "Lcom/jumio/core/plugins/Plugin;", "attachActivity", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "run", "context", "Landroid/content/Context;", "analyticsModel", "(Landroid/content/Context;Lcom/jumio/core/model/StaticModel;)V", "reportRequest", "id", "", "url", "size", "", FirebaseAnalytics.Param.METHOD, "reportResponse", "statusCode", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Exception;)V", "enableDataCollection", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "reportViewStart", "key", "", JAnalysisConstants.EVENT_ATTRIBUTES, "", "reportViewStop", "reportCustomAction", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface AnalyticsPlugin<T extends StaticModel> extends Plugin {

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <T extends StaticModel> boolean isApplicableFor(@NotNull AnalyticsPlugin<T> analyticsPlugin, @NotNull Controller controller, @NotNull ScanPartModel scanPartModel) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
            return AnalyticsPlugin.super.isApplicableFor(controller, scanPartModel);
        }

        @Deprecated
        public static <T extends StaticModel> boolean isPreloaded(@NotNull AnalyticsPlugin<T> analyticsPlugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            return AnalyticsPlugin.super.isPreloaded(controller);
        }

        @Deprecated
        public static <T extends StaticModel> boolean isUsable(@NotNull AnalyticsPlugin<T> analyticsPlugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            return AnalyticsPlugin.super.isUsable(controller);
        }

        @Deprecated
        public static <T extends StaticModel> void preload(@NotNull AnalyticsPlugin<T> analyticsPlugin, @NotNull Controller controller) {
            Intrinsics.checkNotNullParameter(controller, "controller");
            AnalyticsPlugin.super.preload(controller);
        }

        @Deprecated
        public static <T extends StaticModel> void unload(@NotNull AnalyticsPlugin<T> analyticsPlugin) {
            AnalyticsPlugin.super.unload();
        }
    }

    void attachActivity(@NotNull AppCompatActivity activity);

    void enableDataCollection(boolean enable);

    void reportCustomAction(@NotNull String key, @NotNull Map<String, ? extends Object> attributes);

    void reportRequest(@NotNull String id2, @NotNull String url, int size, @NotNull String method);

    void reportResponse(@NotNull String id2, @NotNull String url, @Nullable Integer size, int statusCode, @Nullable Exception error);

    void reportViewStart(@NotNull Object key, @NotNull Map<String, ? extends Object> attributes);

    void reportViewStop(@NotNull Object key, @NotNull Map<String, ? extends Object> attributes);

    void run(@NotNull Context context, @NotNull T analyticsModel);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void reportCustomAction$default(AnalyticsPlugin analyticsPlugin, String str, Map map, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportCustomAction");
        }
        if ((i11 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        analyticsPlugin.reportCustomAction(str, map);
    }

    static /* synthetic */ void reportResponse$default(AnalyticsPlugin analyticsPlugin, String str, String str2, Integer num, int i11, Exception exc, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportResponse");
        }
        if ((i12 & 16) != 0) {
            exc = null;
        }
        analyticsPlugin.reportResponse(str, str2, num, i11, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void reportViewStart$default(AnalyticsPlugin analyticsPlugin, Object obj, Map map, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportViewStart");
        }
        if ((i11 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        analyticsPlugin.reportViewStart(obj, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void reportViewStop$default(AnalyticsPlugin analyticsPlugin, Object obj, Map map, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportViewStop");
        }
        if ((i11 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        analyticsPlugin.reportViewStop(obj, map);
    }
}
