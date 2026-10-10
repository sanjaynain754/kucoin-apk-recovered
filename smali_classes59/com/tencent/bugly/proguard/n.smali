.class public final Lcom/tencent/bugly/proguard/n;
.super Lcom/tencent/bugly/proguard/w0;
.source "BUGLY"


# static fields
.field public static final o:Ljava/lang/String; = "AlarmInfo"


# instance fields
.field public j:I

.field public k:J

.field public l:Z

.field public m:Landroid/app/PendingIntent;

.field public n:Landroid/app/AlarmManager$OnAlarmListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/w0;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/n;->l:Z

    .line 7
    return-void
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
.end method


# virtual methods
.method public b(J)Lorg/json/JSONObject;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/tencent/bugly/proguard/w0;->b(J)Lorg/json/JSONObject;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    :try_start_0
    const-string p2, "alarm_type"

    .line 7
    .line 8
    iget v0, p0, Lcom/tencent/bugly/proguard/n;->j:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    return-object p1

    .line 13
    :catchall_0
    move-exception p2

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    const-string v1, "AlarmInfo"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
.end method
