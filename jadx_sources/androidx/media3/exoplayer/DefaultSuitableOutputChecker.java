package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
@RequiresApi(35)
final class DefaultSuitableOutputChecker implements SuitableOutputChecker {
    private static final RouteDiscoveryPreference EMPTY_DISCOVERY_PREFERENCE;

    @Nullable
    private MediaRouter2$ControllerCallback controllerCallback;
    private final Executor executor;
    private boolean isPreviousSelectedOutputSuitableForPlayback;
    private final MediaRouter2$RouteCallback routeCallback = new MediaRouter2$RouteCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.1
    };
    private final MediaRouter2 router;

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void disable() {
        Assertions.checkStateNotNull(this.controllerCallback, "SuitableOutputChecker is not enabled");
        this.router.unregisterControllerCallback(this.controllerCallback);
        this.controllerCallback = null;
        this.router.unregisterRouteCallback(this.routeCallback);
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void enable(final SuitableOutputChecker.Callback callback) {
        this.router.registerRouteCallback(this.executor, this.routeCallback, EMPTY_DISCOVERY_PREFERENCE);
        MediaRouter2$ControllerCallback mediaRouter2$ControllerCallback = new MediaRouter2$ControllerCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.3
            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                boolean zIsSelectedOutputSuitableForPlayback = DefaultSuitableOutputChecker.this.isSelectedOutputSuitableForPlayback();
                if (DefaultSuitableOutputChecker.this.isPreviousSelectedOutputSuitableForPlayback != zIsSelectedOutputSuitableForPlayback) {
                    DefaultSuitableOutputChecker.this.isPreviousSelectedOutputSuitableForPlayback = zIsSelectedOutputSuitableForPlayback;
                    callback.onSelectedOutputSuitabilityChanged(zIsSelectedOutputSuitableForPlayback);
                }
            }
        };
        this.controllerCallback = mediaRouter2$ControllerCallback;
        this.router.registerControllerCallback(this.executor, mediaRouter2$ControllerCallback);
        this.isPreviousSelectedOutputSuitableForPlayback = isSelectedOutputSuitableForPlayback();
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public boolean isSelectedOutputSuitableForPlayback() {
        Assertions.checkStateNotNull(this.controllerCallback, "SuitableOutputChecker is not enabled");
        int transferReason = this.router.getSystemController().getRoutingSessionInfo().getTransferReason();
        boolean zWasTransferInitiatedBySelf = this.router.getSystemController().wasTransferInitiatedBySelf();
        Iterator it = this.router.getSystemController().getSelectedRoutes().iterator();
        while (it.hasNext()) {
            if (isRouteSuitableForMediaPlayback(C3522z.m3514a(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                return true;
            }
        }
        return false;
    }

    static {
        C3420t.m3458a();
        EMPTY_DISCOVERY_PREFERENCE = C3307s.m3374a(ImmutableList.m13439of(), false).build();
    }

    public DefaultSuitableOutputChecker(Context context, final Handler handler) {
        this.router = MediaRouter2.getInstance(context);
        this.executor = new Executor() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.2
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                Util.postOrRun(handler, runnable);
            }
        };
    }

    private static boolean isRouteSuitableForMediaPlayback(MediaRoute2Info mediaRoute2Info, int i11, boolean z11) {
        int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
        if (suitabilityStatus == 1) {
            if ((i11 != 1 && i11 != 2) || !z11) {
                return false;
            }
            return true;
        }
        if (suitabilityStatus != 0) {
            return false;
        }
        return true;
    }
}
