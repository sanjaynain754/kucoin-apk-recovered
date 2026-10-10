.class public Lcom/tencent/rmonitor/sla/a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/e8;


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_atta"


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
.end method


# virtual methods
.method public final a(IIJ)V
    .locals 4

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/q0$a;->a()Lcom/tencent/bugly/proguard/q0;

    move-result-object v0

    .line 4
    const-string v1, "RMConfigEvent"

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/q0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    new-instance v2, Lcom/tencent/rmonitor/sla/AttaEvent;

    invoke-direct {v2, v1}, Lcom/tencent/rmonitor/sla/AttaEvent;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v2, p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->setEventResult(I)V

    .line 7
    invoke-virtual {v2, p2}, Lcom/tencent/rmonitor/sla/AttaEvent;->setErrorCode(I)V

    long-to-int v1, p3

    .line 8
    invoke-virtual {v2, v1}, Lcom/tencent/rmonitor/sla/AttaEvent;->setEventCost(I)V

    const/4 v1, 0x1

    .line 9
    invoke-virtual {v2, v1}, Lcom/tencent/rmonitor/sla/AttaEvent;->setDebug(I)V

    .line 10
    sget-object v1, Lcom/tencent/rmonitor/sla/AttaEventReporter;->Companion:Lcom/tencent/rmonitor/sla/AttaEventReporter$Companion;

    invoke-virtual {v1}, Lcom/tencent/rmonitor/sla/AttaEventReporter$Companion;->getInstance()Lcom/tencent/rmonitor/sla/AttaEventReporter;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/sla/AttaEventReporter;->addEvent(Lcom/tencent/rmonitor/sla/AttaEvent;)V

    .line 11
    :cond_0
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "reportConfigEvent, eventResult: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", errorCode: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", eventCostInMs: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", hitSampling: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "RMonitor_atta"

    filled-new-array {p2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;IIJ)V
    .locals 1

    .line 1
    const-string v0, "RMConfigEvent"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0, p2, p3, p4, p5}, Lcom/tencent/rmonitor/sla/a;->a(IIJ)V

    :cond_0
    return-void
.end method
