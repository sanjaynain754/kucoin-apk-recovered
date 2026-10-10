.class public Lcom/sensorsdata/abtest/service/GlobalLoopService;
.super Landroid/app/IntentService;
.source "GlobalLoopService.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "SAB.GlobalLoopService"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    const-string v0, "GlobalLoopService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onHandleIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    .line 2
    const-string p1, "SAB.GlobalLoopService"

    .line 3
    .line 4
    const-string v0, "GlobalLoopService receive"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance p1, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->requestExperimentsAndUpdateCache()V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lcom/sensorsdata/abtest/util/AlarmManagerUtils;->getInstance(Landroid/content/Context;)Lcom/sensorsdata/abtest/util/AlarmManagerUtils;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/sensorsdata/abtest/util/AlarmManagerUtils;->setUpAlarmOnReceiver()V

    .line 23
    return-void
    .line 24
.end method
