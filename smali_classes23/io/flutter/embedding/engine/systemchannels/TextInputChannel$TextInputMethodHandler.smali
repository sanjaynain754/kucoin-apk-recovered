.class public interface abstract Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextInputMethodHandler;
.super Ljava/lang/Object;
.source "TextInputChannel.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/systemchannels/TextInputChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "TextInputMethodHandler"
.end annotation


# virtual methods
.method public abstract clearClient()V
.end method

.method public abstract finishAutofillContext(Z)V
.end method

.method public abstract hide()V
.end method

.method public abstract requestAutofill()V
.end method

.method public abstract sendAppPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)V
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setClient(ILio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration;)V
    .param p2    # Lio/flutter/embedding/engine/systemchannels/TextInputChannel$Configuration;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setEditableSizeAndTransform(DD[D)V
    .param p5    # [D
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setEditingState(Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextEditState;)V
    .param p1    # Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextEditState;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract setPlatformViewClient(IZ)V
.end method

.method public abstract show()V
.end method
