.class public Lcom/tencent/rmonitor/sla/b$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/rmonitor/sla/b;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/rmonitor/sla/b;


# direct methods
.method public constructor <init>(Lcom/tencent/rmonitor/sla/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/rmonitor/sla/b$a;->b:Lcom/tencent/rmonitor/sla/b;

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
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "checkSLAReportInner, begin, isSLAReported: "

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, p0, Lcom/tencent/rmonitor/sla/b$a;->b:Lcom/tencent/rmonitor/sla/b;

    .line 12
    .line 13
    iget-boolean v2, v2, Lcom/tencent/rmonitor/sla/b;->b:Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    const-string v2, "RMonitor_metric_sla_Helper"

    .line 23
    .line 24
    .line 25
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 30
    .line 31
    iget-object v1, p0, Lcom/tencent/rmonitor/sla/b$a;->b:Lcom/tencent/rmonitor/sla/b;

    .line 32
    .line 33
    iget-boolean v3, v1, Lcom/tencent/rmonitor/sla/b;->b:Z

    .line 34
    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/tencent/rmonitor/sla/b;->a()V

    .line 39
    .line 40
    iget-object v1, p0, Lcom/tencent/rmonitor/sla/b$a;->b:Lcom/tencent/rmonitor/sla/b;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/tencent/rmonitor/sla/b;->h()V

    .line 44
    .line 45
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v3, "checkSLAReportInner, end, isSLAReported: "

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    iget-object v3, p0, Lcom/tencent/rmonitor/sla/b$a;->b:Lcom/tencent/rmonitor/sla/b;

    .line 53
    .line 54
    iget-boolean v3, v3, Lcom/tencent/rmonitor/sla/b;->b:Z

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 69
    return-void
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
    .line 82
    .line 83
    .line 84
.end method
