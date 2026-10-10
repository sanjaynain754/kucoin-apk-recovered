.class public abstract Landroidx/camera/video/AudioSpec$Builder;
.super Ljava/lang/Object;
.source "AudioSpec.java"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/video/AudioSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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


# virtual methods
.method public abstract build()Landroidx/camera/video/AudioSpec;
.end method

.method public abstract setBitrate(Landroid/util/Range;)Landroidx/camera/video/AudioSpec$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/camera/video/AudioSpec$Builder;"
        }
    .end annotation
.end method

.method public abstract setChannelCount(I)Landroidx/camera/video/AudioSpec$Builder;
.end method

.method public abstract setSampleRate(Landroid/util/Range;)Landroidx/camera/video/AudioSpec$Builder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Landroidx/camera/video/AudioSpec$Builder;"
        }
    .end annotation
.end method

.method public abstract setSource(I)Landroidx/camera/video/AudioSpec$Builder;
.end method

.method public abstract setSourceFormat(I)Landroidx/camera/video/AudioSpec$Builder;
.end method
