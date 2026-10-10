package com.jumio.core.processor;

import android.os.SystemClock;
import com.jumio.commons.camera.CameraSettings;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.jumio.core.processor.a */
/* JADX INFO: loaded from: classes56.dex */
public abstract class AbstractC9312a implements ImageProcessorInterface {

    @NotNull
    private final ImageProcessorConfig<?> config;
    private long coolDownTimestamp;

    @NotNull
    private ProcessorState currentState;
    private long holdStillTimestamp;
    private boolean imageStarted;
    private long startTimestamp;
    private final boolean uhdImageRequired;

    public AbstractC9312a(ImageProcessorConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.startTimestamp = -1L;
        this.holdStillTimestamp = -1L;
        this.coolDownTimestamp = -1L;
        this.currentState = ProcessorState.Ready.INSTANCE;
        this.imageStarted = true;
    }

    @Override // com.jumio.core.processor.ImageProcessorInterface
    public boolean checkRequirements(@NotNull CameraSettings cameraSettings) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        return true;
    }

    @NotNull
    public final ImageProcessorConfig<?> getConfig() {
        return this.config;
    }

    @NotNull
    public final ProcessorState getCurrentState() {
        return this.currentState;
    }

    public final boolean getImageStarted() {
        return this.imageStarted;
    }

    @Override // com.jumio.core.processor.ImageProcessorInterface
    @NotNull
    public ProcessorState getState() {
        return this.currentState;
    }

    @Override // com.jumio.core.processor.ImageProcessorInterface
    public boolean getUhdImageRequired() {
        return this.uhdImageRequired;
    }

    @Override // com.jumio.core.processor.ImageProcessorInterface
    public void reset() {
        this.currentState = ProcessorState.Ready.INSTANCE;
        this.imageStarted = true;
        resetStart();
        resetHoldStillTimestamp();
        resetCoolDownTimestamp();
    }

    public final void resetCoolDownTimestamp() {
        this.coolDownTimestamp = -1L;
    }

    public final void resetHoldStillTimestamp() {
        this.holdStillTimestamp = -1L;
    }

    public final void resetStart() {
        this.startTimestamp = -1L;
    }

    public final void setCurrentState(@NotNull ProcessorState processorState) {
        Intrinsics.checkNotNullParameter(processorState, "<set-?>");
        this.currentState = processorState;
    }

    public final void setImageStarted(boolean z11) {
        this.imageStarted = z11;
    }

    public final boolean shouldCoolDown(long j11) {
        if (j11 == 0) {
            return false;
        }
        startCoolDown();
        return this.coolDownTimestamp > 0 && SystemClock.uptimeMillis() - this.coolDownTimestamp < j11;
    }

    public final boolean shouldHoldStill(long j11) {
        if (j11 == 0) {
            return false;
        }
        startHoldStill();
        return this.holdStillTimestamp > 0 && SystemClock.uptimeMillis() - this.holdStillTimestamp < j11;
    }

    public final boolean shouldStart() {
        if (this.startTimestamp >= 0) {
            return false;
        }
        this.startTimestamp = SystemClock.uptimeMillis();
        return true;
    }

    public final boolean shouldTakePicture() {
        return this.startTimestamp > 0 && SystemClock.uptimeMillis() - this.startTimestamp >= this.config.getStartUpTime();
    }

    public final void startCoolDown() {
        if (this.coolDownTimestamp < 0) {
            this.coolDownTimestamp = SystemClock.uptimeMillis();
        }
    }

    public final void startHoldStill() {
        if (this.holdStillTimestamp < 0) {
            this.holdStillTimestamp = SystemClock.uptimeMillis();
        }
    }
}
