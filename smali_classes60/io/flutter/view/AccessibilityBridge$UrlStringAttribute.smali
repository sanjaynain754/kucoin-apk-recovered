.class Lio/flutter/view/AccessibilityBridge$UrlStringAttribute;
.super Lio/flutter/view/AccessibilityBridge$StringAttribute;
.source "AccessibilityBridge.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/AccessibilityBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UrlStringAttribute"
.end annotation


# instance fields
.field url:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lio/flutter/view/AccessibilityBridge$StringAttribute;-><init>(Lio/flutter/view/AccessibilityBridge$1;)V

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/view/AccessibilityBridge$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lio/flutter/view/AccessibilityBridge$UrlStringAttribute;-><init>()V

    return-void
.end method
