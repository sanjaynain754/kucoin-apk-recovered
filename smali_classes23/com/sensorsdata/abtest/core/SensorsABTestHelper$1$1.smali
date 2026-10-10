.class Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1;
.super Landroid/os/CountDownTimer;
.source "SensorsABTestHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;


# direct methods
.method public constructor <init>(Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;JJ)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1;->this$1:Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

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
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public onFinish()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
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
    .line 18
    .line 19
    .line 20
.end method

.method public onTick(J)V
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {p1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;-><init>()V

    .line 6
    .line 7
    new-instance p2, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1$1;

    .line 8
    .line 9
    .line 10
    invoke-direct {p2, p0}, Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1$1;-><init>(Lcom/sensorsdata/abtest/core/SensorsABTestHelper$1$1;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0, v0, p2}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->requestExperimentsAndUpdateCache(Ljava/util/Map;Ljava/lang/String;Lcom/sensorsdata/abtest/core/IApiCallback;)V

    .line 15
    return-void
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
