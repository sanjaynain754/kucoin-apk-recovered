.class public abstract Landroidx/camera/core/SurfaceRequest$Result;
.super Ljava/lang/Object;
.source "SurfaceRequest.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/SurfaceRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Result"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/SurfaceRequest$Result$ResultCode;
    }
.end annotation


# static fields
.field public static final RESULT_INVALID_SURFACE:I = 0x2

.field public static final RESULT_REQUEST_CANCELLED:I = 0x1

.field public static final RESULT_SURFACE_ALREADY_PROVIDED:I = 0x3

.field public static final RESULT_SURFACE_USED_SUCCESSFULLY:I = 0x0

.field public static final RESULT_WILL_NOT_PROVIDE_SURFACE:I = 0x4


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

.method public static of(ILandroid/view/Surface;)Landroidx/camera/core/SurfaceRequest$Result;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/AutoValue_SurfaceRequest_Result;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Landroidx/camera/core/AutoValue_SurfaceRequest_Result;-><init>(ILandroid/view/Surface;)V

    .line 6
    return-object v0
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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public abstract getResultCode()I
.end method

.method public abstract getSurface()Landroid/view/Surface;
.end method
