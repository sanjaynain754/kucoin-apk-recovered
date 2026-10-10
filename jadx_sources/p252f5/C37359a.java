package p252f5;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.fresco.p061ui.common.ControllerListener2;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f5.a */
/* JADX INFO: compiled from: MiddlewareUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jµ\u0001\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lf5/a;", "", "<init>", "()V", "", "", "componentAttribution", "shortcutAttribution", "dataSourceExtras", "imageSourceExtras", "Landroid/graphics/Rect;", "viewportDimensions", "scaleType", "Landroid/graphics/PointF;", "focusPoint", "imageExtras", "callerContext", "", "logWithHighSamplingRate", "Landroid/net/Uri;", "mainUri", "Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Landroid/graphics/Rect;Ljava/lang/String;Landroid/graphics/PointF;Ljava/util/Map;Ljava/lang/Object;ZLandroid/net/Uri;)Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;", "middleware_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C37359a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37359a f82889a = new C37359a();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ControllerListener2.Extras m83988a(@NotNull Map<String, ? extends Object> componentAttribution, @NotNull Map<String, ? extends Object> shortcutAttribution, @Nullable Map<String, ? extends Object> dataSourceExtras, @Nullable Map<String, ? extends Object> imageSourceExtras, @Nullable Rect viewportDimensions, @Nullable String scaleType, @Nullable PointF focusPoint, @Nullable Map<String, ? extends Object> imageExtras, @Nullable Object callerContext, boolean logWithHighSamplingRate, @Nullable Uri mainUri) {
        Intrinsics.checkNotNullParameter(componentAttribution, "componentAttribution");
        Intrinsics.checkNotNullParameter(shortcutAttribution, "shortcutAttribution");
        ControllerListener2.Extras extras = new ControllerListener2.Extras();
        if (viewportDimensions != null) {
            extras.viewportWidth = viewportDimensions.width();
            extras.viewportHeight = viewportDimensions.height();
        }
        extras.scaleType = scaleType;
        if (focusPoint != null) {
            extras.focusX = Float.valueOf(focusPoint.x);
            extras.focusY = Float.valueOf(focusPoint.y);
        }
        extras.callerContext = callerContext;
        extras.logWithHighSamplingRate = logWithHighSamplingRate;
        extras.mainUri = mainUri;
        extras.datasourceExtras = dataSourceExtras;
        extras.imageExtras = imageExtras;
        extras.shortcutExtras = shortcutAttribution;
        extras.componentExtras = componentAttribution;
        extras.imageSourceExtras = imageSourceExtras;
        return extras;
    }
}
