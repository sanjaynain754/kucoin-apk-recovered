package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface MediaSourceEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void downstreamFormatChanged(int i11, @Nullable Format format, int i12, @Nullable Object obj, long j11) {
            downstreamFormatChanged(new MediaLoadData(1, i11, format, i12, obj, Util.usToMs(j11), C2711C.TIME_UNSET));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i11) {
            loadCanceled(loadEventInfo, i11, -1, null, 0, null, C2711C.TIME_UNSET, C2711C.TIME_UNSET);
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i11) {
            loadCompleted(loadEventInfo, i11, -1, null, 0, null, C2711C.TIME_UNSET, C2711C.TIME_UNSET);
        }

        public void loadError(LoadEventInfo loadEventInfo, int i11, IOException iOException, boolean z11) {
            loadError(loadEventInfo, i11, -1, null, 0, null, C2711C.TIME_UNSET, C2711C.TIME_UNSET, iOException, z11);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i11) {
            loadStarted(loadEventInfo, i11, -1, null, 0, null, C2711C.TIME_UNSET, C2711C.TIME_UNSET);
        }

        public void upstreamDiscarded(int i11, long j11, long j12) {
            upstreamDiscarded(new MediaLoadData(1, i11, null, 3, null, Util.usToMs(j11), Util.usToMs(j12)));
        }

        @CheckResult
        public EventDispatcher withParameters(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i11, mediaPeriodId);
        }

        public static final class ListenerAndHandler {
            public Handler handler;
            public MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i11;
            this.mediaPeriodId = mediaPeriodId;
        }

        public void dispatchEvent(final Consumer<MediaSourceEventListener> consumer) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                final MediaSourceEventListener mediaSourceEventListener = listenerAndHandler.listener;
                Util.postOrRun(listenerAndHandler.handler, new Runnable() { // from class: androidx.media3.exoplayer.source.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        consumer.accept(mediaSourceEventListener);
                    }
                });
            }
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i11, int i12, @Nullable Format format, int i13, @Nullable Object obj, long j11, long j12) {
            loadCanceled(loadEventInfo, new MediaLoadData(i11, i12, format, i13, obj, Util.usToMs(j11), Util.usToMs(j12)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i11, int i12, @Nullable Format format, int i13, @Nullable Object obj, long j11, long j12) {
            loadCompleted(loadEventInfo, new MediaLoadData(i11, i12, format, i13, obj, Util.usToMs(j11), Util.usToMs(j12)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int i11, int i12, @Nullable Format format, int i13, @Nullable Object obj, long j11, long j12, IOException iOException, boolean z11) {
            loadError(loadEventInfo, new MediaLoadData(i11, i12, format, i13, obj, Util.usToMs(j11), Util.usToMs(j12)), iOException, z11);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i11, int i12, @Nullable Format format, int i13, @Nullable Object obj, long j11, long j12) {
            loadStarted(loadEventInfo, new MediaLoadData(i11, i12, format, i13, obj, Util.usToMs(j11), Util.usToMs(j12)));
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                if (listenerAndHandler.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        @CheckResult
        @Deprecated
        public EventDispatcher withParameters(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long j11) {
            return new EventDispatcher(this.listenerAndHandlers, i11, mediaPeriodId);
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.o
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener.EventDispatcher eventDispatcher = this.f3359a;
                    ((MediaSourceEventListener) obj).onDownstreamFormatChanged(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, mediaLoadData);
                }
            });
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.t
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
                    mediaSourceEventListener.onUpstreamDiscarded(this.f3404a.windowIndex, mediaPeriodId, mediaLoadData);
                }
            });
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.s
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener.EventDispatcher eventDispatcher = this.f3401a;
                    ((MediaSourceEventListener) obj).onLoadCanceled(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                }
            });
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.q
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener.EventDispatcher eventDispatcher = this.f3393a;
                    ((MediaSourceEventListener) obj).onLoadCompleted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                }
            });
        }

        public void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException iOException, final boolean z11) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.r
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener.EventDispatcher eventDispatcher = this.f3396a;
                    ((MediaSourceEventListener) obj).onLoadError(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z11);
                }
            });
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            dispatchEvent(new Consumer() { // from class: androidx.media3.exoplayer.source.p
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSourceEventListener.EventDispatcher eventDispatcher = this.f3361a;
                    ((MediaSourceEventListener) obj).onLoadStarted(eventDispatcher.windowIndex, eventDispatcher.mediaPeriodId, loadEventInfo, mediaLoadData);
                }
            });
        }
    }

    default void onDownstreamFormatChanged(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void onUpstreamDiscarded(int i11, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void onLoadCanceled(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadStarted(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadError(int i11, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z11) {
    }
}
