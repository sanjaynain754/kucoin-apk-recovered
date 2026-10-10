.class public Landroidx/camera/camera2/internal/compat/workaround/SessionResetPolicy;
.super Ljava/lang/Object;
.source "SessionResetPolicy.java"


# instance fields
.field private final mNeedAbortCapture:Z


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/Quirks;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-class v0, Landroidx/camera/camera2/internal/compat/quirk/Preview3AThreadCrashQuirk;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/Quirks;->contains(Ljava/lang/Class;)Z

    .line 9
    move-result p1

    .line 10
    .line 11
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/compat/workaround/SessionResetPolicy;->mNeedAbortCapture:Z

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
.end method


# virtual methods
.method public needAbortCapture()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/compat/workaround/SessionResetPolicy;->mNeedAbortCapture:Z

    .line 3
    return v0
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
