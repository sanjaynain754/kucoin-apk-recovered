.class public abstract Landroidx/camera/extensions/internal/sessionprocessor/ImageReaderOutputConfig;
.super Ljava/lang/Object;
.source "ImageReaderOutputConfig.java"

# interfaces
.implements Landroidx/camera/extensions/internal/sessionprocessor/Camera2OutputConfig;


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

.method public static create(IILjava/lang/String;Ljava/util/List;Landroid/util/Size;II)Landroidx/camera/extensions/internal/sessionprocessor/ImageReaderOutputConfig;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/camera/extensions/internal/sessionprocessor/Camera2OutputConfig;",
            ">;",
            "Landroid/util/Size;",
            "II)",
            "Landroidx/camera/extensions/internal/sessionprocessor/ImageReaderOutputConfig;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_ImageReaderOutputConfig;

    move v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_ImageReaderOutputConfig;-><init>(IILjava/lang/String;Ljava/util/List;Landroid/util/Size;II)V

    return-object v0
.end method

.method public static create(ILandroid/util/Size;II)Landroidx/camera/extensions/internal/sessionprocessor/ImageReaderOutputConfig;
    .locals 8

    .line 2
    new-instance v0, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_ImageReaderOutputConfig;

    const/4 v3, 0x0

    .line 3
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v2, -0x1

    move v1, p0

    move-object v5, p1

    move v6, p2

    move v7, p3

    invoke-direct/range {v0 .. v7}, Landroidx/camera/extensions/internal/sessionprocessor/AutoValue_ImageReaderOutputConfig;-><init>(IILjava/lang/String;Ljava/util/List;Landroid/util/Size;II)V

    return-object v0
.end method


# virtual methods
.method public abstract getImageFormat()I
.end method

.method public abstract getMaxImages()I
.end method

.method public abstract getSize()Landroid/util/Size;
.end method
