package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes23.dex */
public final class MotionEventTracker {
    private static MotionEventTracker INSTANCE = null;
    private static final String TAG = "MotionEventTracker";
    private final LongSparseArray<MotionEvent> eventById = new LongSparseArray<>();
    private final PriorityQueue<Long> unusedEvents = new PriorityQueue<>();

    /* JADX INFO: loaded from: classes60.dex */
    public static class MotionEventId {
        private static final AtomicLong ID_COUNTER = new AtomicLong(0);

        /* JADX INFO: renamed from: id */
        private final long f86731id;

        @NonNull
        public static MotionEventId createUnique() {
            return from(ID_COUNTER.incrementAndGet());
        }

        @NonNull
        public static MotionEventId from(long j11) {
            return new MotionEventId(j11);
        }

        public long getId() {
            return this.f86731id;
        }

        private MotionEventId(long j11) {
            this.f86731id = j11;
        }
    }

    @NonNull
    public static MotionEventTracker getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MotionEventTracker();
        }
        return INSTANCE;
    }

    @Nullable
    public MotionEvent pop(@NonNull MotionEventId motionEventId) {
        while (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() < motionEventId.f86731id) {
            this.eventById.remove(this.unusedEvents.poll().longValue());
        }
        if (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() == motionEventId.f86731id) {
            this.unusedEvents.poll();
        }
        MotionEvent motionEvent = this.eventById.get(motionEventId.f86731id);
        this.eventById.remove(motionEventId.f86731id);
        return motionEvent;
    }

    private MotionEventTracker() {
    }

    @NonNull
    public MotionEventId track(@NonNull MotionEvent motionEvent) {
        MotionEventId motionEventIdCreateUnique = MotionEventId.createUnique();
        this.eventById.put(motionEventIdCreateUnique.f86731id, MotionEvent.obtain(motionEvent));
        this.unusedEvents.add(Long.valueOf(motionEventIdCreateUnique.f86731id));
        return motionEventIdCreateUnique;
    }
}
