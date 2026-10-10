package com.facebook.react.views.scroll;

import android.os.SystemClock;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: OnScrollDispatchHelper.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/react/views/scroll/OnScrollDispatchHelper;", "", "<init>", "()V", "prevX", "", "prevY", "value", "", "xFlingVelocity", "getXFlingVelocity", "()F", "yFlingVelocity", "getYFlingVelocity", "lastScrollEventTimeMs", "", "onScrollChanged", "", "x", "y", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class OnScrollDispatchHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int MIN_EVENT_SEPARATION_MS = 10;
    private float xFlingVelocity;
    private float yFlingVelocity;
    private int prevX = Integer.MIN_VALUE;
    private int prevY = Integer.MIN_VALUE;
    private long lastScrollEventTimeMs = -11;

    /* JADX INFO: compiled from: OnScrollDispatchHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/facebook/react/views/scroll/OnScrollDispatchHelper$Companion;", "", "<init>", "()V", "MIN_EVENT_SEPARATION_MS", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final float getXFlingVelocity() {
        return this.xFlingVelocity;
    }

    public final float getYFlingVelocity() {
        return this.yFlingVelocity;
    }

    public final boolean onScrollChanged(int x11, int y11) {
        boolean z11;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j11 = this.lastScrollEventTimeMs;
        if (jUptimeMillis - j11 <= 10 && this.prevX == x11 && this.prevY == y11) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (jUptimeMillis - j11 != 0) {
            this.xFlingVelocity = (x11 - this.prevX) / (jUptimeMillis - j11);
            this.yFlingVelocity = (y11 - this.prevY) / (jUptimeMillis - j11);
        }
        this.lastScrollEventTimeMs = jUptimeMillis;
        this.prevX = x11;
        this.prevY = y11;
        return z11;
    }
}
