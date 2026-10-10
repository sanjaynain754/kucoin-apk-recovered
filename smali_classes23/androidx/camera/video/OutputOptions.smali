.class public abstract Landroidx/camera/video/OutputOptions;
.super Ljava/lang/Object;
.source "OutputOptions.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/video/OutputOptions$OutputOptionsInternal;,
        Landroidx/camera/video/OutputOptions$Builder;
    }
.end annotation


# static fields
.field public static final DURATION_UNLIMITED:I

.field public static final FILE_SIZE_UNLIMITED:I


# instance fields
.field private final mOutputOptionsInternal:Landroidx/camera/video/OutputOptions$OutputOptionsInternal;


# direct methods
.method public constructor <init>(Landroidx/camera/video/OutputOptions$OutputOptionsInternal;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/camera/video/OutputOptions;->mOutputOptionsInternal:Landroidx/camera/video/OutputOptions$OutputOptionsInternal;

    .line 6
    return-void
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
    .line 21
    .line 22
    .line 23
    .line 24
.end method


# virtual methods
.method public getDurationLimitMillis()J
    .locals 2
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/OutputOptions;->mOutputOptionsInternal:Landroidx/camera/video/OutputOptions$OutputOptionsInternal;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/camera/video/OutputOptions$OutputOptionsInternal;->getDurationLimitMillis()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public getFileSizeLimit()J
    .locals 2
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/OutputOptions;->mOutputOptionsInternal:Landroidx/camera/video/OutputOptions$OutputOptionsInternal;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/camera/video/OutputOptions$OutputOptionsInternal;->getFileSizeLimit()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public getLocation()Landroid/location/Location;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/video/OutputOptions;->mOutputOptionsInternal:Landroidx/camera/video/OutputOptions$OutputOptionsInternal;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/camera/video/OutputOptions$OutputOptionsInternal;->getLocation()Landroid/location/Location;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
