.class Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$1;
.super Landroid/os/Handler;
.source "PushProcess.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;


# direct methods
.method public constructor <init>(Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;Landroid/os/Looper;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

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
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1
    .line 2
    iget v0, p1, Landroid/os/Message;->what:I

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;->access$000(Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;)Ljava/util/Map;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;->access$000(Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;)Ljava/util/Map;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    check-cast v0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$NotificationInfo;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$1;->this$0:Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;->access$000(Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess;)Ljava/util/Map;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    iget-object p1, v0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$NotificationInfo;->title:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v1, v0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$NotificationInfo;->content:Ljava/lang/String;

    .line 55
    .line 56
    iget-wide v2, v0, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushProcess$NotificationInfo;->time:J

    .line 57
    const/4 v0, 0x0

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v1, v0, v2, v3}, Lcom/sensorsdata/analytics/android/sdk/aop/push/PushAutoTrackHelper;->trackGeTuiNotificationClicked(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    return-void

    .line 62
    :catch_0
    move-exception p1

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 66
    :cond_0
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
