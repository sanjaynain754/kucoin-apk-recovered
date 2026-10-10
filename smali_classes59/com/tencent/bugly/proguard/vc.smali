.class public Lcom/tencent/bugly/proguard/vc;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "NatMemFailEvent"

.field public static final b:Ljava/lang/String; = "NatMemSuccEvent"

.field public static final c:Ljava/lang/String; = "NatMemSigJmpEvent"

.field public static final d:Ljava/lang/String; = "crash_times"

.field public static final e:Ljava/lang/String; = "android_verison"

.field public static final f:Ljava/lang/String; = "sample"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
    .line 6
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
.end method

.method public static a()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "NatMemSuccEvent"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/vc;->a(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public static a(I)V
    .locals 1

    .line 3
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    const-string v0, "NatMemSigJmpEvent"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/vc;->a(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 2
    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    const-string v0, "NatMemFailEvent"

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/vc;->a(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    .line 4
    new-instance v0, Lcom/tencent/rmonitor/sla/AttaEvent;

    invoke-direct {v0, p0}, Lcom/tencent/rmonitor/sla/AttaEvent;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParams([Ljava/lang/String;)V

    .line 6
    sget-object p0, Lcom/tencent/rmonitor/sla/AttaEventReporter;->Companion:Lcom/tencent/rmonitor/sla/AttaEventReporter$Companion;

    invoke-virtual {p0}, Lcom/tencent/rmonitor/sla/AttaEventReporter$Companion;->getInstance()Lcom/tencent/rmonitor/sla/AttaEventReporter;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, v0, p1}, Lcom/tencent/rmonitor/sla/AttaEventReporter;->reportAsync(Lcom/tencent/rmonitor/sla/AttaEvent;Z)V

    return-void
.end method
