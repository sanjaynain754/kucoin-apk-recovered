.class public abstract Landroidx/camera/video/OutputResults;
.super Ljava/lang/Object;
.source "OutputResults.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
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

.method public static of(Landroid/net/Uri;)Landroidx/camera/video/OutputResults;
    .locals 1

    .line 1
    .line 2
    const-string v0, "OutputUri cannot be null."

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    new-instance v0, Landroidx/camera/video/AutoValue_OutputResults;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0}, Landroidx/camera/video/AutoValue_OutputResults;-><init>(Landroid/net/Uri;)V

    .line 11
    return-object v0
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
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public abstract getOutputUri()Landroid/net/Uri;
.end method
