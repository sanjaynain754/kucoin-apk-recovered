.class Lio/flutter/plugin/platform/VirtualDisplayController$2$1;
.super Ljava/lang/Object;
.source "VirtualDisplayController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/platform/VirtualDisplayController$2;->onViewAttachedToWindow(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lio/flutter/plugin/platform/VirtualDisplayController$2;


# direct methods
.method public constructor <init>(Lio/flutter/plugin/platform/VirtualDisplayController$2;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/flutter/plugin/platform/VirtualDisplayController$2$1;->this$1:Lio/flutter/plugin/platform/VirtualDisplayController$2;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/flutter/plugin/platform/VirtualDisplayController$2$1;->this$1:Lio/flutter/plugin/platform/VirtualDisplayController$2;

    .line 3
    .line 4
    iget-object v1, v0, Lio/flutter/plugin/platform/VirtualDisplayController$2;->val$embeddedView:Landroid/view/View;

    .line 5
    .line 6
    iget-object v0, v0, Lio/flutter/plugin/platform/VirtualDisplayController$2;->val$onNewSizeFrameAvailable:Ljava/lang/Runnable;

    .line 7
    .line 8
    const-wide/16 v2, 0x80

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

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
.end method
