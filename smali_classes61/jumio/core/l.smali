.class public final Ljumio/core/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final synthetic a:Lcom/jumio/core/sensors/BaseSensor;


# direct methods
.method public constructor <init>(Lcom/jumio/core/sensors/BaseSensor;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ljumio/core/l;->a:Lcom/jumio/core/sensors/BaseSensor;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
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
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/l;->a:Lcom/jumio/core/sensors/BaseSensor;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Lcom/jumio/core/sensors/BaseSensor;->getConfig()Lcom/jumio/core/sensors/SensorConfig;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/jumio/core/sensors/SensorConfig;->getDefaultValue()[F

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {v0, v1}, Lcom/jumio/core/sensors/BaseSensor;->setLatestData([F)V

    .line 20
    .line 21
    iget-object v0, p0, Ljumio/core/l;->a:Lcom/jumio/core/sensors/BaseSensor;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/jumio/core/sensors/BaseSensor;->getInitialTimestamp()J

    .line 25
    move-result-wide v0

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Ljumio/core/l;->a:Lcom/jumio/core/sensors/BaseSensor;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/jumio/core/sensors/BaseSensor;->getConfig()Lcom/jumio/core/sensors/SensorConfig;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/jumio/core/sensors/SensorConfig;->getTimeModel()Lcom/jumio/core/models/TimeModel;

    .line 41
    move-result-object v1

    .line 42
    const/4 v4, 0x1

    .line 43
    const/4 v5, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2, v3, v4, v5}, Lcom/jumio/core/models/TimeModel;->getCurrentTime$default(Lcom/jumio/core/models/TimeModel;JILjava/lang/Object;)J

    .line 47
    move-result-wide v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lcom/jumio/core/sensors/BaseSensor;->setInitialTimestamp(J)V

    .line 51
    .line 52
    :cond_2
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, Ljumio/core/l;->a:Lcom/jumio/core/sensors/BaseSensor;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Lcom/jumio/core/sensors/BaseSensor;->handleSensorEvent(Landroid/hardware/SensorEvent;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Lcom/jumio/core/sensors/BaseSensor;->access$getOnEventCallback$p(Lcom/jumio/core/sensors/BaseSensor;)Lkotlin/jvm/functions/Function1;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    :cond_3
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
