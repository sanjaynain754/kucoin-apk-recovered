.class public Landroidx/camera/core/impl/capability/PreviewCapabilitiesImpl;
.super Ljava/lang/Object;
.source "PreviewCapabilitiesImpl.java"

# interfaces
.implements Landroidx/camera/core/PreviewCapabilities;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# instance fields
.field private mIsStabilizationSupported:Z


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/CameraInfoInternal;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroidx/camera/core/impl/CameraInfoInternal;->isPreviewStabilizationSupported()Z

    .line 7
    move-result p1

    .line 8
    .line 9
    iput-boolean p1, p0, Landroidx/camera/core/impl/capability/PreviewCapabilitiesImpl;->mIsStabilizationSupported:Z

    .line 10
    return-void
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

.method public static from(Landroidx/camera/core/CameraInfo;)Landroidx/camera/core/PreviewCapabilities;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/impl/capability/PreviewCapabilitiesImpl;

    .line 3
    .line 4
    check-cast p0, Landroidx/camera/core/impl/CameraInfoInternal;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/camera/core/impl/capability/PreviewCapabilitiesImpl;-><init>(Landroidx/camera/core/impl/CameraInfoInternal;)V

    .line 8
    return-object v0
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
.method public isStabilizationSupported()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/core/impl/capability/PreviewCapabilitiesImpl;->mIsStabilizationSupported:Z

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
