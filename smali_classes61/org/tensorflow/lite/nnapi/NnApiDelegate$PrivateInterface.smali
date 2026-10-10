.class public interface abstract Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;
.super Ljava/lang/Object;
.source "NnApiDelegate.java"

# interfaces
.implements Lorg/tensorflow/lite/Delegate;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/tensorflow/lite/nnapi/NnApiDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "PrivateInterface"
.end annotation


# virtual methods
.method public abstract close()V
.end method

.method public abstract getNnapiErrno()I
.end method
