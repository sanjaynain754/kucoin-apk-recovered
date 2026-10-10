.class Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$3;
.super Ljava/lang/Object;
.source "PushProcess.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;->trackCustomizeClick(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;

.field final synthetic val$id:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$3;->this$0:Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$3;->val$id:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$3;->this$0:Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$3;->val$id:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;->access$200(Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;Ljava/lang/String;)Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$NotificationInfo;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, v0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$NotificationInfo;->title:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$NotificationInfo;->content:Ljava/lang/String;

    .line 15
    .line 16
    const-string v2, "Local"

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {v3, v1, v0, v2, v3}, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushAutoTrackHelper;->trackNotificationOpenedEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    :cond_0
    return-void
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
