.class Lcom/wang/avi/AVLoadingIndicatorView$2;
.super Ljava/lang/Object;
.source "AVLoadingIndicatorView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wang/avi/AVLoadingIndicatorView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/wang/avi/AVLoadingIndicatorView;


# direct methods
.method public constructor <init>(Lcom/wang/avi/AVLoadingIndicatorView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/wang/avi/AVLoadingIndicatorView$2;->this$0:Lcom/wang/avi/AVLoadingIndicatorView;

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
    iget-object v0, p0, Lcom/wang/avi/AVLoadingIndicatorView$2;->this$0:Lcom/wang/avi/AVLoadingIndicatorView;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/wang/avi/AVLoadingIndicatorView;->access$202(Lcom/wang/avi/AVLoadingIndicatorView;Z)Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/wang/avi/AVLoadingIndicatorView$2;->this$0:Lcom/wang/avi/AVLoadingIndicatorView;

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/wang/avi/AVLoadingIndicatorView;->access$300(Lcom/wang/avi/AVLoadingIndicatorView;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/wang/avi/AVLoadingIndicatorView$2;->this$0:Lcom/wang/avi/AVLoadingIndicatorView;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    move-result-wide v2

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2, v3}, Lcom/wang/avi/AVLoadingIndicatorView;->access$102(Lcom/wang/avi/AVLoadingIndicatorView;J)J

    .line 24
    .line 25
    iget-object v0, p0, Lcom/wang/avi/AVLoadingIndicatorView$2;->this$0:Lcom/wang/avi/AVLoadingIndicatorView;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/wang/avi/AVLoadingIndicatorView;->setVisibility(I)V

    .line 29
    :cond_0
    return-void
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
