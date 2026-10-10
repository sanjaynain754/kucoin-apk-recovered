package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.build.ReactBuildConfig;
import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import org.jetbrains.annotations.NotNull;
import p747x3.C45999a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FrameBasedAnimationDriver.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/react/animated/FrameBasedAnimationDriver;", "Lcom/facebook/react/animated/AnimationDriver;", "config", "Lcom/facebook/react/bridge/ReadableMap;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;)V", "startFrameTimeNanos", "", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "", "toValue", "", "fromValue", "iterations", "", "currentLoop", "logCount", "resetConfig", "", "runAnimationStep", "frameTimeNanos", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFrameBasedAnimationDriver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameBasedAnimationDriver.kt\ncom/facebook/react/animated/FrameBasedAnimationDriver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class FrameBasedAnimationDriver extends AnimationDriver {
    private static final double FRAME_TIME_MILLIS = 16.666666666666668d;
    private int currentLoop;

    @NotNull
    private double[] frames;
    private double fromValue;
    private int iterations;
    private int logCount;
    private long startFrameTimeNanos;
    private double toValue;

    public FrameBasedAnimationDriver(@NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.startFrameTimeNanos = -1L;
        this.frames = new double[0];
        this.iterations = 1;
        this.currentLoop = 1;
        resetConfig(config);
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void resetConfig(@NotNull ReadableMap config) {
        int size;
        Intrinsics.checkNotNullParameter(config, "config");
        ReadableArray array = config.getArray(ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL);
        if (array != null && this.frames.length != (size = array.size())) {
            double[] dArr = new double[size];
            for (int i11 = 0; i11 < size; i11++) {
                dArr[i11] = array.getDouble(i11);
            }
            this.frames = dArr;
        }
        this.toValue = (config.hasKey("toValue") && config.getType("toValue") == ReadableType.Number) ? config.getDouble("toValue") : 0.0d;
        int i12 = (config.hasKey("iterations") && config.getType("iterations") == ReadableType.Number) ? config.getInt("iterations") : 1;
        this.iterations = i12;
        this.currentLoop = 1;
        this.hasFinished = i12 == 0;
        this.startFrameTimeNanos = -1L;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void runAnimationStep(long frameTimeNanos) {
        double d11;
        ValueAnimatedNode valueAnimatedNode = this.animatedValue;
        if (valueAnimatedNode == null) {
            throw new IllegalArgumentException("Animated value should not be null");
        }
        if (this.startFrameTimeNanos < 0) {
            this.startFrameTimeNanos = frameTimeNanos;
            if (this.currentLoop == 1) {
                this.fromValue = valueAnimatedNode.nodeValue;
            }
        }
        int iRound = (int) Math.round(((frameTimeNanos - this.startFrameTimeNanos) / ((long) 1000000)) / FRAME_TIME_MILLIS);
        if (iRound < 0) {
            String str = "Calculated frame index should never be lower than 0. Called with frameTimeNanos " + frameTimeNanos + " and mStartFrameTimeNanos " + this.startFrameTimeNanos;
            if (ReactBuildConfig.DEBUG) {
                throw new IllegalStateException(str.toString());
            }
            if (this.logCount < 100) {
                C45999a.m101488I(ReactConstants.TAG, str);
                this.logCount++;
                return;
            }
            return;
        }
        if (this.hasFinished) {
            return;
        }
        double[] dArr = this.frames;
        if (iRound >= dArr.length - 1) {
            int i11 = this.iterations;
            if (i11 == -1 || this.currentLoop < i11) {
                double d12 = this.fromValue;
                d11 = d12 + (dArr[dArr.length - 1] * (this.toValue - d12));
                this.startFrameTimeNanos = -1L;
                this.currentLoop++;
            } else {
                d11 = this.toValue;
                this.hasFinished = true;
            }
        } else {
            double d13 = this.fromValue;
            d11 = d13 + (dArr[iRound] * (this.toValue - d13));
        }
        valueAnimatedNode.nodeValue = d11;
    }
}
