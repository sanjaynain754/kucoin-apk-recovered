package com.jumio.core.processor;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.log.Log;
import com.jumio.core.processor.queue.ProcessorQueueInterface;
import java.util.ArrayList;
import java.util.Iterator;
import jumio.core.C40583Q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0014\u0010\u0017\u001a\u00020\u00152\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J*\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00150\u001dH\u0096@¢\u0006\u0002\u0010\u001fJf\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2.\u0010)\u001a*\b\u0001\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150,\u0012\u0006\u0012\u0004\u0018\u00010-0*H\u0096@¢\u0006\u0002\u0010.J\u000e\u0010/\u001a\u00020\tH\u0096@¢\u0006\u0002\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00061"}, m90084d2 = {"Lcom/jumio/core/processor/ImageProcessorHandler;", "Lcom/jumio/core/processor/ImageProcessorHandlerInterface;", "processors", "Lcom/jumio/core/processor/queue/ProcessorQueueInterface;", "processorFactory", "Lcom/jumio/core/processor/ImageProcessorFactoryInterface;", "<init>", "(Lcom/jumio/core/processor/queue/ProcessorQueueInterface;Lcom/jumio/core/processor/ImageProcessorFactoryInterface;)V", "lastFrameFailed", "", "skipableProcessorConfig", "", "Lcom/jumio/core/processor/ImageProcessorConfig;", "processingDone", "getProcessingDone", "()Z", "currentProcessor", "Lcom/jumio/core/processor/ImageProcessorInterface;", "getCurrentProcessor", "()Lcom/jumio/core/processor/ImageProcessorInterface;", "reset", "", "resetCurrentProcessor", "initProcessorWithConfig", "processorConfig", "selectNextProcessor", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "skipClassifier", "Lkotlin/Function1;", "", "(Lcom/jumio/commons/camera/CameraSettings;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doProcess", "bitmap", "Landroid/graphics/Bitmap;", "extractionArea", "Landroid/graphics/Rect;", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "parameterInterface", "Lcom/jumio/core/processor/ProcessorParameterInterface;", "handleState", "Lkotlin/Function4;", "Lcom/jumio/core/processor/ProcessorState;", "Lkotlin/coroutines/Continuation;", "", "(Landroid/graphics/Bitmap;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/core/processor/ProcessorParameterInterface;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishCurrentProcessor", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ImageProcessorHandler implements ImageProcessorHandlerInterface {

    /* JADX INFO: renamed from: a */
    public final ProcessorQueueInterface f14468a;

    /* JADX INFO: renamed from: b */
    public final ImageProcessorFactoryInterface f14469b;

    /* JADX INFO: renamed from: c */
    public boolean f14470c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f14471d;

    public ImageProcessorHandler(@NotNull ProcessorQueueInterface processors, @NotNull ImageProcessorFactoryInterface processorFactory) {
        Intrinsics.checkNotNullParameter(processors, "processors");
        Intrinsics.checkNotNullParameter(processorFactory, "processorFactory");
        this.f14468a = processors;
        this.f14469b = processorFactory;
        this.f14471d = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.jumio.core.processor.ImageProcessorHandlerInterface
    @Nullable
    public Object doProcess(@NotNull Bitmap bitmap, @NotNull CameraSettings cameraSettings, @NotNull Rect rect, @NotNull Frame.Metadata metadata, @NotNull ProcessorParameterInterface processorParameterInterface, @NotNull Function4<? super ProcessorState, ? super ImageProcessorInterface, ? super Boolean, ? super Continuation<? super Unit>, ? extends Object> function4, @NotNull Continuation<? super Unit> continuation) throws Exception {
        C40583Q1 c40583q1;
        ProcessorState processorStateProcess;
        if (continuation instanceof C40583Q1) {
            c40583q1 = (C40583Q1) continuation;
            int i11 = c40583q1.f90100l;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c40583q1.f90100l = i11 - Integer.MIN_VALUE;
            } else {
                c40583q1 = new C40583Q1(this, continuation);
            }
        } else {
            c40583q1 = new C40583Q1(this, continuation);
        }
        Object obj = c40583q1.f90098j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c40583q1.f90100l;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                ImageProcessorInterface imageProcessorInterfacePeekFirst = this.f14468a.peekFirst();
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                if (imageProcessorInterfacePeekFirst == null) {
                    processorStateProcess = null;
                } else if (this.f14470c) {
                    this.f14470c = false;
                    processorStateProcess = imageProcessorInterfacePeekFirst.getState();
                } else {
                    processorStateProcess = imageProcessorInterfacePeekFirst.process(bitmap, cameraSettings, rect, metadata, processorParameterInterface);
                    Log.m14479v("ImageProcessorHandler", "Processing state " + processorStateProcess);
                    booleanRef.element = true;
                }
                if (processorStateProcess != null && imageProcessorInterfacePeekFirst != null) {
                    Boolean boolBoxBoolean = Boxing.boxBoolean(booleanRef.element);
                    c40583q1.f90089a = SpillingKt.nullOutSpilledVariable(bitmap);
                    c40583q1.f90090b = SpillingKt.nullOutSpilledVariable(cameraSettings);
                    c40583q1.f90091c = SpillingKt.nullOutSpilledVariable(rect);
                    c40583q1.f90092d = SpillingKt.nullOutSpilledVariable(metadata);
                    c40583q1.f90093e = SpillingKt.nullOutSpilledVariable(processorParameterInterface);
                    c40583q1.f90094f = SpillingKt.nullOutSpilledVariable(function4);
                    c40583q1.f90095g = SpillingKt.nullOutSpilledVariable(imageProcessorInterfacePeekFirst);
                    c40583q1.f90096h = SpillingKt.nullOutSpilledVariable(booleanRef);
                    c40583q1.f90097i = SpillingKt.nullOutSpilledVariable(processorStateProcess);
                    c40583q1.f90100l = 1;
                    if (function4.invoke(processorStateProcess, imageProcessorInterfacePeekFirst, boolBoxBoolean, c40583q1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } catch (Exception e11) {
            this.f14470c = true;
            throw e11;
        }
    }

    @Override // com.jumio.core.processor.ImageProcessorHandlerInterface
    @Nullable
    public Object finishCurrentProcessor(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.f14468a.moveToNext() == null);
    }

    @Override // com.jumio.core.processor.ImageProcessorHandlerInterface
    @Nullable
    public ImageProcessorInterface getCurrentProcessor() {
        return this.f14468a.peekFirst();
    }

    @Override // com.jumio.core.processor.ImageProcessorHandlerInterface
    public boolean getProcessingDone() {
        return this.f14468a.isEmpty();
    }

    @Override // com.jumio.core.processor.ImageProcessorHandlerInterface
    public void initProcessorWithConfig(@NotNull ImageProcessorConfig<?> processorConfig) {
        Intrinsics.checkNotNullParameter(processorConfig, "processorConfig");
        ImageProcessorInterface imageProcessorInterfaceCreateImageProcessor = this.f14469b.createImageProcessor(processorConfig);
        if (imageProcessorInterfaceCreateImageProcessor != null) {
            this.f14468a.add(imageProcessorInterfaceCreateImageProcessor);
            Log.m14463d("ImageProcessorHandler", imageProcessorInterfaceCreateImageProcessor.getClass().getSimpleName().concat(" registered for processing"));
        } else {
            this.f14471d.add(processorConfig);
            Log.m14463d("ImageProcessorHandler", "No processor found in factory for ".concat(processorConfig.getClass().getSimpleName()));
        }
    }

    @Override // com.jumio.core.processor.ImageProcessorHandlerInterface
    public void reset() {
        this.f14468a.clear();
        this.f14471d.clear();
    }

    @Override // com.jumio.core.processor.ImageProcessorHandlerInterface
    @Nullable
    public Object selectNextProcessor(@NotNull CameraSettings cameraSettings, @NotNull Function1<? super String, Unit> function1, @NotNull Continuation<? super Boolean> continuation) {
        ArrayList<ImageProcessorConfig> arrayList = this.f14471d;
        for (ImageProcessorConfig imageProcessorConfig : arrayList) {
            if (imageProcessorConfig instanceof MultiImageProcessorConfig) {
                Iterator it = ((MultiImageProcessorConfig) imageProcessorConfig).getImages().iterator();
                while (it.hasNext()) {
                    function1.invoke(((ProcessorImage) it.next()).getClassifier());
                }
            } else if (imageProcessorConfig instanceof SingleImageProcessorConfig) {
                function1.invoke(((SingleImageProcessorConfig) imageProcessorConfig).getImage().getClassifier());
            }
        }
        arrayList.clear();
        ImageProcessorInterface imageProcessorInterfacePeekFirst = this.f14468a.peekFirst();
        while (imageProcessorInterfacePeekFirst != null && !imageProcessorInterfacePeekFirst.checkRequirements(cameraSettings)) {
            Log.m14484w("ImageProcessorHandler", "Capabilities missing for " + Reflection.getOrCreateKotlinClass(imageProcessorInterfacePeekFirst.getClass()).getSimpleName() + ", skipping...");
            if (imageProcessorInterfacePeekFirst instanceof MultiImageProcessorInterface) {
                Iterator<T> it2 = ((MultiImageProcessorInterface) imageProcessorInterfacePeekFirst).getImages().iterator();
                while (it2.hasNext()) {
                    function1.invoke(((ProcessorImage) it2.next()).getClassifier());
                }
            } else {
                function1.invoke(imageProcessorInterfacePeekFirst.getImage().getClassifier());
            }
            imageProcessorInterfacePeekFirst = this.f14468a.moveToNext();
        }
        return Boxing.boxBoolean(imageProcessorInterfacePeekFirst != null);
    }

    @Override // com.jumio.core.processor.ImageProcessorHandlerInterface
    public void resetCurrentProcessor() {
        ImageProcessorInterface currentProcessor = getCurrentProcessor();
        if (currentProcessor != null) {
            currentProcessor.reset();
        }
    }
}
