.class Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;
.super Ljava/lang/Object;
.source "SensorsABTestHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->requestExperimentsAndUpdateCacheWithRetry()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sensorsdata/abtest/core/SensorsABTestHelper;


# direct methods
.method public constructor <init>(Lcom/sensorsdata/abtest/core/SensorsABTestHelper;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestHelper;

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
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestHelper;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->access$000(Lcom/sensorsdata/abtest/core/SensorsABTestHelper;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestHelper;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->access$100(Lcom/sensorsdata/abtest/core/SensorsABTestHelper;)Landroid/os/CountDownTimer;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestHelper;

    .line 16
    .line 17
    new-instance v1, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1;

    .line 18
    .line 19
    .line 20
    const-wide/32 v3, 0x1d4c0

    .line 21
    .line 22
    const-wide/16 v5, 0x7530

    .line 23
    move-object v2, p0

    .line 24
    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1;-><init>(Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;JJ)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v1}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->access$102(Lcom/sensorsdata/abtest/core/SensorsABTestHelper;Landroid/os/CountDownTimer;)Landroid/os/CountDownTimer;

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v2, p0

    .line 32
    .line 33
    :goto_0
    iget-object v0, v2, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestHelper;

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper;->access$100(Lcom/sensorsdata/abtest/core/SensorsABTestHelper;)Landroid/os/CountDownTimer;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 41
    return-void
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
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
.end method
