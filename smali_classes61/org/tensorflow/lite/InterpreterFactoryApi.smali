.class public interface abstract Lorg/tensorflow/lite/InterpreterFactoryApi;
.super Ljava/lang/Object;
.source "InterpreterFactoryApi.java"


# virtual methods
.method public abstract create(Ljava/io/File;Lorg/tensorflow/lite/InterpreterApi$Options;)Lorg/tensorflow/lite/InterpreterApi;
.end method

.method public abstract create(Ljava/nio/ByteBuffer;Lorg/tensorflow/lite/InterpreterApi$Options;)Lorg/tensorflow/lite/InterpreterApi;
.end method

.method public abstract createNnApiDelegateImpl(Lorg/tensorflow/lite/nnapi/NnApiDelegate$Options;)Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;
.end method

.method public abstract runtimeVersion()Ljava/lang/String;
.end method

.method public abstract schemaVersion()Ljava/lang/String;
.end method
