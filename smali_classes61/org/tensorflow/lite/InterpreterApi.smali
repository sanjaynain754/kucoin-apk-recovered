.class public interface abstract Lorg/tensorflow/lite/InterpreterApi;
.super Ljava/lang/Object;
.source "InterpreterApi.java"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/tensorflow/lite/InterpreterApi$Options;
    }
.end annotation


# direct methods
.method public static create(Ljava/io/File;Lorg/tensorflow/lite/InterpreterApi$Options;)Lorg/tensorflow/lite/InterpreterApi;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lorg/tensorflow/lite/InterpreterApi$Options;->getRuntime()Lorg/tensorflow/lite/InterpreterApi$Options$TfLiteRuntime;

    move-result-object v0

    .line 2
    :goto_0
    invoke-static {v0}, Lorg/tensorflow/lite/TensorFlowLite;->getFactory(Lorg/tensorflow/lite/InterpreterApi$Options$TfLiteRuntime;)Lorg/tensorflow/lite/InterpreterFactoryApi;

    move-result-object v0

    .line 3
    invoke-interface {v0, p0, p1}, Lorg/tensorflow/lite/InterpreterFactoryApi;->create(Ljava/io/File;Lorg/tensorflow/lite/InterpreterApi$Options;)Lorg/tensorflow/lite/InterpreterApi;

    move-result-object p0

    return-object p0
.end method

.method public static create(Ljava/nio/ByteBuffer;Lorg/tensorflow/lite/InterpreterApi$Options;)Lorg/tensorflow/lite/InterpreterApi;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Lorg/tensorflow/lite/InterpreterApi$Options;->getRuntime()Lorg/tensorflow/lite/InterpreterApi$Options$TfLiteRuntime;

    move-result-object v0

    .line 5
    :goto_0
    invoke-static {v0}, Lorg/tensorflow/lite/TensorFlowLite;->getFactory(Lorg/tensorflow/lite/InterpreterApi$Options$TfLiteRuntime;)Lorg/tensorflow/lite/InterpreterFactoryApi;

    move-result-object v0

    .line 6
    invoke-interface {v0, p0, p1}, Lorg/tensorflow/lite/InterpreterFactoryApi;->create(Ljava/nio/ByteBuffer;Lorg/tensorflow/lite/InterpreterApi$Options;)Lorg/tensorflow/lite/InterpreterApi;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract allocateTensors()V
.end method

.method public abstract close()V
.end method

.method public abstract getInputIndex(Ljava/lang/String;)I
.end method

.method public abstract getInputTensor(I)Lorg/tensorflow/lite/Tensor;
.end method

.method public abstract getInputTensorCount()I
.end method

.method public abstract getInputTensorFromSignature(Ljava/lang/String;Ljava/lang/String;)Lorg/tensorflow/lite/Tensor;
.end method

.method public abstract getLastNativeInferenceDurationNanoseconds()Ljava/lang/Long;
.end method

.method public abstract getOutputIndex(Ljava/lang/String;)I
.end method

.method public abstract getOutputTensor(I)Lorg/tensorflow/lite/Tensor;
.end method

.method public abstract getOutputTensorCount()I
.end method

.method public abstract getOutputTensorFromSignature(Ljava/lang/String;Ljava/lang/String;)Lorg/tensorflow/lite/Tensor;
.end method

.method public abstract getSignatureInputs(Ljava/lang/String;)[Ljava/lang/String;
.end method

.method public abstract getSignatureKeys()[Ljava/lang/String;
.end method

.method public abstract getSignatureOutputs(Ljava/lang/String;)[Ljava/lang/String;
.end method

.method public abstract resizeInput(I[I)V
.end method

.method public abstract resizeInput(I[IZ)V
.end method

.method public abstract run(Ljava/lang/Object;Ljava/lang/Object;)V
.end method

.method public abstract runForMultipleInputsOutputs([Ljava/lang/Object;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract runSignature(Ljava/util/Map;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract runSignature(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation
.end method
