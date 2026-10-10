package com.jumio.core.processor;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\u0014\u0010\r\u001a\u00020\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH&J*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u0014H¦@¢\u0006\u0002\u0010\u0016Jf\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2.\u0010 \u001a*\b\u0001\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0#\u0012\u0006\u0012\u0004\u0018\u00010\u00010!H¦@¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006'À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/ImageProcessorHandlerInterface;", "", "processingDone", "", "getProcessingDone", "()Z", "currentProcessor", "Lcom/jumio/core/processor/ImageProcessorInterface;", "getCurrentProcessor", "()Lcom/jumio/core/processor/ImageProcessorInterface;", "reset", "", "resetCurrentProcessor", "initProcessorWithConfig", "processorConfig", "Lcom/jumio/core/processor/ImageProcessorConfig;", "selectNextProcessor", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "skipClassifier", "Lkotlin/Function1;", "", "(Lcom/jumio/commons/camera/CameraSettings;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doProcess", "bitmap", "Landroid/graphics/Bitmap;", "extractionArea", "Landroid/graphics/Rect;", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "parameterInterface", "Lcom/jumio/core/processor/ProcessorParameterInterface;", "handleState", "Lkotlin/Function4;", "Lcom/jumio/core/processor/ProcessorState;", "Lkotlin/coroutines/Continuation;", "(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/core/processor/ProcessorParameterInterface;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishCurrentProcessor", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ImageProcessorHandlerInterface {
    @Nullable
    Object doProcess(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect rect, @NotNull Frame.Metadata metadata, @NotNull ProcessorParameterInterface processorParameterInterface, @NotNull Function4<? super ProcessorState, ? super ImageProcessorInterface, ? super Boolean, ? super Continuation<? super Unit>, ? extends Object> function4, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object finishCurrentProcessor(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    ImageProcessorInterface getCurrentProcessor();

    boolean getProcessingDone();

    void initProcessorWithConfig(@NotNull ImageProcessorConfig<?> processorConfig);

    void reset();

    void resetCurrentProcessor();

    @Nullable
    Object selectNextProcessor(@NotNull CameraSettings cameraSettings, @NotNull Function1<? super String, Unit> function1, @NotNull Continuation<? super Boolean> continuation);
}
