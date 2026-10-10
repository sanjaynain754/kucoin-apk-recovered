.class public Lwe0/e;
.super Lwe0/i;
.source "SourceFile"


# instance fields
.field public p:F

.field public q:J

.field public r:F


# direct methods
.method public constructor <init>(Landroid/content/Context;J)V
    .locals 6

    .line 1
    .line 2
    const/16 v2, 0x9

    .line 3
    .line 4
    const-string v3, "gravity"

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move-wide v4, p2

    .line 8
    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lwe0/i;-><init>(Landroid/content/Context;ILjava/lang/String;J)V

    .line 11
    return-void
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
.end method


# virtual methods
.method public j()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lwe0/i;->n:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lwe0/d;->b()V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    iput-wide v0, p0, Lwe0/e;->q:J

    .line 13
    return-void
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
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lwe0/i;->onSensorChanged(Landroid/hardware/SensorEvent;)V

    .line 4
    .line 5
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    aget p1, p1, v0

    .line 9
    .line 10
    iput p1, p0, Lwe0/e;->p:F

    .line 11
    .line 12
    iget v0, p0, Lwe0/e;->r:F

    .line 13
    .line 14
    cmpl-float v0, p1, v0

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    iput p1, p0, Lwe0/e;->r:F

    .line 19
    :cond_0
    return-void
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
.end method
