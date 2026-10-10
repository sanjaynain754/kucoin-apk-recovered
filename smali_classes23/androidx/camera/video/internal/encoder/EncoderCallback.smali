.class public interface abstract Landroidx/camera/video/internal/encoder/EncoderCallback;
.super Ljava/lang/Object;
.source "EncoderCallback.java"


# static fields
.field public static final EMPTY:Landroidx/camera/video/internal/encoder/EncoderCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/video/internal/encoder/EncoderCallback$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/camera/video/internal/encoder/EncoderCallback$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Landroidx/camera/video/internal/encoder/EncoderCallback;->EMPTY:Landroidx/camera/video/internal/encoder/EncoderCallback;

    .line 8
    return-void
    .line 9
    .line 10
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
.end method


# virtual methods
.method public abstract onEncodeError(Landroidx/camera/video/internal/encoder/EncodeException;)V
.end method

.method public onEncodePaused()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method

.method public abstract onEncodeStart()V
.end method

.method public abstract onEncodeStop()V
.end method

.method public abstract onEncodedData(Landroidx/camera/video/internal/encoder/EncodedData;)V
.end method

.method public abstract onOutputConfigUpdate(Landroidx/camera/video/internal/encoder/OutputConfig;)V
.end method
