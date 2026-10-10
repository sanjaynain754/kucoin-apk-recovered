package com.tencent.bugly.common.replay;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.WindowManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B5\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\""}, m90084d2 = {"Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;", "", "scaleFactorX", "", "scaleFactorY", "(FF)V", "recordingWidth", "", "recordingHeight", "frameRate", "bitRate", "(IIFFII)V", "getBitRate", "()I", "getFrameRate", "getRecordingHeight", "getRecordingWidth", "getScaleFactorX", "()F", "getScaleFactorY", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final /* data */ class ScreenshotRecorderConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int bitRate;
    private final int frameRate;
    private final int recordingHeight;
    private final int recordingWidth;
    private final float scaleFactorX;
    private final float scaleFactorY;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\t\u001a\u00020\n*\u00020\nH\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig$Companion;", "", "()V", "from", "Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;", "context", "Landroid/content/Context;", "sessionReplay", "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;", "adjustToBlockSize", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final int adjustToBlockSize(int i11) {
            int i12 = i11 % 16;
            return i12 <= 8 ? i11 - i12 : (16 - i12) + i11;
        }

        @NotNull
        public final ScreenshotRecorderConfig from(@NotNull Context context, @NotNull BuglyReplayOptions sessionReplay) {
            Rect rect;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionReplay, "sessionReplay");
            Object systemService = context.getSystemService(InterfaceC33953u5.f72199F);
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
            }
            WindowManager windowManager = (WindowManager) systemService;
            if (AndroidVersion.INSTANCE.isOverR()) {
                rect = windowManager.getCurrentWindowMetrics().getBounds();
            } else {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            Intrinsics.checkNotNullExpressionValue(rect, "if (AndroidVersion.isOve…enBounds.y)\n            }");
            Pair pairM90091to = TuplesKt.m90091to(Integer.valueOf(adjustToBlockSize(MathKt.roundToInt((rect.height() / context.getResources().getDisplayMetrics().density) * sessionReplay.getQuality().sizeScale))), Integer.valueOf(adjustToBlockSize(MathKt.roundToInt((rect.width() / context.getResources().getDisplayMetrics().density) * sessionReplay.getQuality().sizeScale))));
            int iIntValue = ((Number) pairM90091to.component1()).intValue();
            int iIntValue2 = ((Number) pairM90091to.component2()).intValue();
            return new ScreenshotRecorderConfig(iIntValue2, iIntValue, iIntValue2 / rect.width(), iIntValue / rect.height(), sessionReplay.getFrameRate(), sessionReplay.getQuality().bitRate);
        }
    }

    public ScreenshotRecorderConfig(int i11, int i12, float f11, float f12, int i13, int i14) {
        this.recordingWidth = i11;
        this.recordingHeight = i12;
        this.scaleFactorX = f11;
        this.scaleFactorY = f12;
        this.frameRate = i13;
        this.bitRate = i14;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenshotRecorderConfig)) {
            return false;
        }
        ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) other;
        return this.recordingWidth == screenshotRecorderConfig.recordingWidth && this.recordingHeight == screenshotRecorderConfig.recordingHeight && Intrinsics.areEqual((Object) Float.valueOf(this.scaleFactorX), (Object) Float.valueOf(screenshotRecorderConfig.scaleFactorX)) && Intrinsics.areEqual((Object) Float.valueOf(this.scaleFactorY), (Object) Float.valueOf(screenshotRecorderConfig.scaleFactorY)) && this.frameRate == screenshotRecorderConfig.frameRate && this.bitRate == screenshotRecorderConfig.bitRate;
    }

    public static /* synthetic */ ScreenshotRecorderConfig copy$default(ScreenshotRecorderConfig screenshotRecorderConfig, int i11, int i12, float f11, float f12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = screenshotRecorderConfig.recordingWidth;
        }
        if ((i15 & 2) != 0) {
            i12 = screenshotRecorderConfig.recordingHeight;
        }
        if ((i15 & 4) != 0) {
            f11 = screenshotRecorderConfig.scaleFactorX;
        }
        if ((i15 & 8) != 0) {
            f12 = screenshotRecorderConfig.scaleFactorY;
        }
        if ((i15 & 16) != 0) {
            i13 = screenshotRecorderConfig.frameRate;
        }
        if ((i15 & 32) != 0) {
            i14 = screenshotRecorderConfig.bitRate;
        }
        int i16 = i13;
        int i17 = i14;
        return screenshotRecorderConfig.copy(i11, i12, f11, f12, i16, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getScaleFactorX() {
        return this.scaleFactorX;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getScaleFactorY() {
        return this.scaleFactorY;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBitRate() {
        return this.bitRate;
    }

    @NotNull
    public final ScreenshotRecorderConfig copy(int recordingWidth, int recordingHeight, float scaleFactorX, float scaleFactorY, int frameRate, int bitRate) {
        return new ScreenshotRecorderConfig(recordingWidth, recordingHeight, scaleFactorX, scaleFactorY, frameRate, bitRate);
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public final float getScaleFactorX() {
        return this.scaleFactorX;
    }

    public final float getScaleFactorY() {
        return this.scaleFactorY;
    }

    public int hashCode() {
        return Integer.hashCode(this.bitRate) + ((Integer.hashCode(this.frameRate) + ((Float.hashCode(this.scaleFactorY) + ((Float.hashCode(this.scaleFactorX) + ((Integer.hashCode(this.recordingHeight) + (Integer.hashCode(this.recordingWidth) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.recordingWidth + ", recordingHeight=" + this.recordingHeight + ", scaleFactorX=" + this.scaleFactorX + ", scaleFactorY=" + this.scaleFactorY + ", frameRate=" + this.frameRate + ", bitRate=" + this.bitRate + ')';
    }

    public ScreenshotRecorderConfig(float f11, float f12) {
        this(0, 0, f11, f12, 0, 0);
    }
}
