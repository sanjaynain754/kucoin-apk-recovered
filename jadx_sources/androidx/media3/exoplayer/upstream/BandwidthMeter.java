package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {
            private final CopyOnWriteArrayList<HandlerAndListener> listeners = new CopyOnWriteArrayList<>();

            public static final class HandlerAndListener {
                private final Handler handler;
                private final EventListener listener;
                private boolean released;

                public void release() {
                    this.released = true;
                }

                public HandlerAndListener(Handler handler, EventListener eventListener) {
                    this.handler = handler;
                    this.listener = eventListener;
                }
            }

            public void bandwidthSample(int i11, long j11, long j12) {
                final int i12;
                final long j13;
                final long j14;
                for (final HandlerAndListener handlerAndListener : this.listeners) {
                    if (handlerAndListener.released) {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                    } else {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                        handlerAndListener.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.upstream.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                handlerAndListener.listener.onBandwidthSample(i12, j13, j14);
                            }
                        });
                    }
                    i11 = i12;
                    j11 = j13;
                    j12 = j14;
                }
            }

            public void removeListener(EventListener eventListener) {
                for (HandlerAndListener handlerAndListener : this.listeners) {
                    if (handlerAndListener.listener == eventListener) {
                        handlerAndListener.release();
                        this.listeners.remove(handlerAndListener);
                    }
                }
            }

            public void addListener(Handler handler, EventListener eventListener) {
                Assertions.checkNotNull(handler);
                Assertions.checkNotNull(eventListener);
                removeListener(eventListener);
                this.listeners.add(new HandlerAndListener(handler, eventListener));
            }
        }

        void onBandwidthSample(int i11, long j11, long j12);
    }

    void addEventListener(Handler handler, EventListener eventListener);

    long getBitrateEstimate();

    @Nullable
    TransferListener getTransferListener();

    void removeEventListener(EventListener eventListener);

    default long getTimeToFirstByteEstimateUs() {
        return C2711C.TIME_UNSET;
    }
}
