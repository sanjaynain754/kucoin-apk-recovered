.class public interface abstract Lio/flutter/embedding/engine/systemchannels/ScribeChannel$ScribeMethodHandler;
.super Ljava/lang/Object;
.source "ScribeChannel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/systemchannels/ScribeChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ScribeMethodHandler"
.end annotation


# virtual methods
.method public abstract isFeatureAvailable()Z
.end method

.method public abstract isStylusHandwritingAvailable()Z
    .annotation build Landroid/annotation/TargetApi;
        value = 0x22
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x22
    .end annotation
.end method

.method public abstract startStylusHandwriting()V
    .annotation build Landroid/annotation/TargetApi;
        value = 0x21
    .end annotation

    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x21
    .end annotation
.end method
