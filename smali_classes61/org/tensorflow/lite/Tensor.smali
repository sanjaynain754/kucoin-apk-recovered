.class public interface abstract Lorg/tensorflow/lite/Tensor;
.super Ljava/lang/Object;
.source "Tensor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/tensorflow/lite/Tensor$QuantizationParams;
    }
.end annotation


# virtual methods
.method public abstract asReadOnlyBuffer()Ljava/nio/ByteBuffer;
.end method

.method public abstract dataType()Lorg/tensorflow/lite/DataType;
.end method

.method public abstract index()I
.end method

.method public abstract name()Ljava/lang/String;
.end method

.method public abstract numBytes()I
.end method

.method public abstract numDimensions()I
.end method

.method public abstract numElements()I
.end method

.method public abstract quantizationParams()Lorg/tensorflow/lite/Tensor$QuantizationParams;
.end method

.method public abstract shape()[I
.end method

.method public abstract shapeSignature()[I
.end method
