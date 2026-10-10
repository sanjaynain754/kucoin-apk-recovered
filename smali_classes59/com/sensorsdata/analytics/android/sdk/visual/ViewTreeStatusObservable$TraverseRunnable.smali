.class Lcom/sensorsdata/analytics/android/sdk/visual/ViewTreeStatusObservable$TraverseRunnable;
.super Ljava/lang/Object;
.source "ViewTreeStatusObservable.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sensorsdata/analytics/android/sdk/visual/ViewTreeStatusObservable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TraverseRunnable"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sensorsdata/analytics/android/sdk/visual/ViewTreeStatusObservable;


# direct methods
.method public constructor <init>(Lcom/sensorsdata/analytics/android/sdk/visual/ViewTreeStatusObservable;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewTreeStatusObservable$TraverseRunnable;->this$0:Lcom/sensorsdata/analytics/android/sdk/visual/ViewTreeStatusObservable;

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
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "start traverse..."

    .line 4
    .line 5
    const-string v1, "ViewTreeStatusObservable"

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/visual/ViewTreeStatusObservable$TraverseRunnable;->this$0:Lcom/sensorsdata/analytics/android/sdk/visual/ViewTreeStatusObservable;

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/visual/ViewTreeStatusObservable;->access$000(Lcom/sensorsdata/analytics/android/sdk/visual/ViewTreeStatusObservable;)V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v0, "stop traverse..."

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    return-void
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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
