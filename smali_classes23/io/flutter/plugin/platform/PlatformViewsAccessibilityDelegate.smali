.class public interface abstract Lio/flutter/plugin/platform/PlatformViewsAccessibilityDelegate;
.super Ljava/lang/Object;
.source "PlatformViewsAccessibilityDelegate.java"


# virtual methods
.method public abstract attachAccessibilityBridge(Lio/flutter/view/AccessibilityBridge;)V
    .param p1    # Lio/flutter/view/AccessibilityBridge;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract detachAccessibilityBridge()V
.end method

.method public abstract getPlatformViewById(I)Landroid/view/View;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end method

.method public abstract usesVirtualDisplay(I)Z
.end method
