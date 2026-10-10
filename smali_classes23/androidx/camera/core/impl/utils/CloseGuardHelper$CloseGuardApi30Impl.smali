.class final Landroidx/camera/core/impl/utils/CloseGuardHelper$CloseGuardApi30Impl;
.super Ljava/lang/Object;
.source "CloseGuardHelper.java"

# interfaces
.implements Landroidx/camera/core/impl/utils/CloseGuardHelper$CloseGuardImpl;


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1e
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/utils/CloseGuardHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CloseGuardApi30Impl"
.end annotation


# instance fields
.field private final mPlatformImpl:Landroid/util/CloseGuard;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Landroid/util/CloseGuard;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Landroid/util/CloseGuard;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/camera/core/impl/utils/CloseGuardHelper$CloseGuardApi30Impl;->mPlatformImpl:Landroid/util/CloseGuard;

    .line 11
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
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/utils/CloseGuardHelper$CloseGuardApi30Impl;->mPlatformImpl:Landroid/util/CloseGuard;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/CloseGuard;->close()V

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
.end method

.method public open(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/utils/CloseGuardHelper$CloseGuardApi30Impl;->mPlatformImpl:Landroid/util/CloseGuard;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/util/CloseGuard;->open(Ljava/lang/String;)V

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

.method public warnIfOpen()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/camera/core/impl/utils/CloseGuardHelper$CloseGuardApi30Impl;->mPlatformImpl:Landroid/util/CloseGuard;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/util/CloseGuard;->warnIfOpen()V

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
.end method
