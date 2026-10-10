.class public interface abstract Landroidx/media3/exoplayer/SuitableOutputChecker;
.super Ljava/lang/Object;
.source "SuitableOutputChecker.java"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x23
.end annotation

.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/SuitableOutputChecker$Callback;
    }
.end annotation


# virtual methods
.method public abstract disable()V
.end method

.method public abstract enable(Landroidx/media3/exoplayer/SuitableOutputChecker$Callback;)V
.end method

.method public abstract isSelectedOutputSuitableForPlayback()Z
.end method
