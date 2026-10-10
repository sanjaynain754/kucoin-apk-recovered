.class public Lorg/tensorflow/lite/nnapi/NnApiDelegate;
.super Ljava/lang/Object;
.source "NnApiDelegate.java"

# interfaces
.implements Lorg/tensorflow/lite/Delegate;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/tensorflow/lite/nnapi/NnApiDelegate$Options;,
        Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;
    }
.end annotation


# instance fields
.field private impl:Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;

.field private initialized:Z

.field private options:Lorg/tensorflow/lite/nnapi/NnApiDelegate$Options;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 4
    new-instance v0, Lorg/tensorflow/lite/nnapi/NnApiDelegate$Options;

    invoke-direct {v0}, Lorg/tensorflow/lite/nnapi/NnApiDelegate$Options;-><init>()V

    invoke-direct {p0, v0}, Lorg/tensorflow/lite/nnapi/NnApiDelegate;-><init>(Lorg/tensorflow/lite/nnapi/NnApiDelegate$Options;)V

    return-void
.end method

.method public constructor <init>(Lorg/tensorflow/lite/nnapi/NnApiDelegate$Options;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lorg/tensorflow/lite/TensorFlowLite;->init()V

    .line 3
    iput-object p1, p0, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->options:Lorg/tensorflow/lite/nnapi/NnApiDelegate$Options;

    return-void
.end method

.method private checkNotClosed()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->impl:Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    iget-boolean v1, p0, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->initialized:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-string v1, "Should not access delegate after delegate has been closed."

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    const-string v1, "Should not access delegate before interpreter has been constructed."

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    throw v0

    .line 20
    :cond_1
    return-void
    .line 21
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->impl:Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;->close()V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->impl:Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;

    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getNativeHandle()J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->checkNotClosed()V

    .line 4
    .line 5
    iget-object v0, p0, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->impl:Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lorg/tensorflow/lite/Delegate;->getNativeHandle()J

    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public getNnapiErrno()I
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->initialized:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-direct {p0}, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->checkNotClosed()V

    .line 10
    .line 11
    iget-object v0, p0, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->impl:Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;->getNnapiErrno()I

    .line 15
    move-result v0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public hasErrors()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->getNnapiErrno()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public initWithInterpreterFactoryApi(Lorg/tensorflow/lite/InterpreterFactoryApi;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->options:Lorg/tensorflow/lite/nnapi/NnApiDelegate$Options;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1, v0}, Lorg/tensorflow/lite/InterpreterFactoryApi;->createNnApiDelegateImpl(Lorg/tensorflow/lite/nnapi/NnApiDelegate$Options;)Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    iput-object p1, p0, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->impl:Lorg/tensorflow/lite/nnapi/NnApiDelegate$PrivateInterface;

    .line 9
    const/4 p1, 0x1

    .line 10
    .line 11
    iput-boolean p1, p0, Lorg/tensorflow/lite/nnapi/NnApiDelegate;->initialized:Z

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
