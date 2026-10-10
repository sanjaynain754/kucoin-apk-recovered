.class public Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;
.super Ljava/lang/Object;
.source "ReanimatedSensorListener.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field private final display:Landroid/view/Display;

.field private final interval:D

.field private lastRead:D

.field private orientation:[F

.field private quaternion:[F

.field private rotation:[F

.field private setter:Lcom/swmansion/reanimated/nativeProxy/SensorSetter;


# direct methods
.method public constructor <init>(Lcom/swmansion/reanimated/nativeProxy/SensorSetter;DLandroid/view/Display;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    move-result-wide v0

    .line 8
    long-to-double v0, v0

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->lastRead:D

    .line 11
    .line 12
    const/16 v0, 0x9

    .line 13
    .line 14
    new-array v0, v0, [F

    .line 15
    .line 16
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->rotation:[F

    .line 17
    const/4 v0, 0x3

    .line 18
    .line 19
    new-array v0, v0, [F

    .line 20
    .line 21
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->orientation:[F

    .line 22
    const/4 v0, 0x4

    .line 23
    .line 24
    new-array v0, v0, [F

    .line 25
    .line 26
    iput-object v0, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->quaternion:[F

    .line 27
    .line 28
    iput-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->setter:Lcom/swmansion/reanimated/nativeProxy/SensorSetter;

    .line 29
    .line 30
    iput-wide p2, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->interval:D

    .line 31
    .line 32
    iput-object p4, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->display:Landroid/view/Display;

    .line 33
    return-void
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
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
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
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 13

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x3

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    move-result-wide v5

    .line 10
    long-to-double v5, v5

    .line 11
    .line 12
    iget-wide v7, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->lastRead:D

    .line 13
    .line 14
    sub-double v7, v5, v7

    .line 15
    .line 16
    iget-wide v9, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->interval:D

    .line 17
    .line 18
    cmpg-double v7, v7, v9

    .line 19
    .line 20
    if-gez v7, :cond_0

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    iget-object v7, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v7}, Landroid/hardware/Sensor;->getType()I

    .line 27
    move-result v7

    .line 28
    .line 29
    iput-wide v5, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->lastRead:D

    .line 30
    .line 31
    iget-object v5, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->display:Landroid/view/Display;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5}, Landroid/view/Display;->getRotation()I

    .line 35
    move-result v5

    .line 36
    .line 37
    if-eq v5, v2, :cond_3

    .line 38
    .line 39
    if-eq v5, v1, :cond_2

    .line 40
    .line 41
    if-eq v5, v4, :cond_1

    .line 42
    move v5, v3

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_1
    const/16 v5, 0x10e

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_2
    const/16 v5, 0xb4

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_3
    const/16 v5, 0x5a

    .line 52
    .line 53
    :goto_0
    if-eq v7, v1, :cond_4

    .line 54
    .line 55
    if-eq v7, v0, :cond_4

    .line 56
    .line 57
    .line 58
    packed-switch v7, :pswitch_data_0

    .line 59
    .line 60
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 61
    .line 62
    const-string v0, "[Reanimated] Unknown sensor type."

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    throw p1

    .line 67
    .line 68
    :pswitch_0
    iget-object v6, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->quaternion:[F

    .line 69
    .line 70
    iget-object v7, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 71
    .line 72
    .line 73
    invoke-static {v6, v7}, Landroid/hardware/SensorManager;->getQuaternionFromVector([F[F)V

    .line 74
    .line 75
    iget-object v6, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->rotation:[F

    .line 76
    .line 77
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 78
    .line 79
    .line 80
    invoke-static {v6, p1}, Landroid/hardware/SensorManager;->getRotationMatrixFromVector([F[F)V

    .line 81
    .line 82
    iget-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->rotation:[F

    .line 83
    .line 84
    iget-object v6, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->orientation:[F

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v6}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    .line 88
    .line 89
    iget-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->quaternion:[F

    .line 90
    .line 91
    aget v6, p1, v2

    .line 92
    .line 93
    aget v7, p1, v4

    .line 94
    .line 95
    aget v8, p1, v1

    .line 96
    neg-float v8, v8

    .line 97
    .line 98
    aget p1, p1, v3

    .line 99
    .line 100
    iget-object v9, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->orientation:[F

    .line 101
    .line 102
    aget v10, v9, v3

    .line 103
    neg-float v10, v10

    .line 104
    .line 105
    aget v11, v9, v2

    .line 106
    neg-float v11, v11

    .line 107
    .line 108
    aget v9, v9, v1

    .line 109
    const/4 v12, 0x7

    .line 110
    .line 111
    new-array v12, v12, [F

    .line 112
    .line 113
    aput v6, v12, v3

    .line 114
    .line 115
    aput v7, v12, v2

    .line 116
    .line 117
    aput v8, v12, v1

    .line 118
    .line 119
    aput p1, v12, v4

    .line 120
    .line 121
    aput v10, v12, v0

    .line 122
    const/4 p1, 0x5

    .line 123
    .line 124
    aput v11, v12, p1

    .line 125
    const/4 p1, 0x6

    .line 126
    .line 127
    aput v9, v12, p1

    .line 128
    .line 129
    iget-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->setter:Lcom/swmansion/reanimated/nativeProxy/SensorSetter;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v12, v5}, Lcom/swmansion/reanimated/nativeProxy/SensorSetter;->sensorSetter([FI)V

    .line 133
    return-void

    .line 134
    .line 135
    :pswitch_1
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 136
    .line 137
    aget v0, p1, v3

    .line 138
    neg-float v0, v0

    .line 139
    .line 140
    aget v6, p1, v2

    .line 141
    neg-float v6, v6

    .line 142
    .line 143
    aget p1, p1, v1

    .line 144
    neg-float p1, p1

    .line 145
    .line 146
    new-array v4, v4, [F

    .line 147
    .line 148
    aput v0, v4, v3

    .line 149
    .line 150
    aput v6, v4, v2

    .line 151
    .line 152
    aput p1, v4, v1

    .line 153
    .line 154
    iget-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->setter:Lcom/swmansion/reanimated/nativeProxy/SensorSetter;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v4, v5}, Lcom/swmansion/reanimated/nativeProxy/SensorSetter;->sensorSetter([FI)V

    .line 158
    return-void

    .line 159
    .line 160
    :cond_4
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 161
    .line 162
    aget v0, p1, v3

    .line 163
    .line 164
    aget v6, p1, v2

    .line 165
    .line 166
    aget p1, p1, v1

    .line 167
    .line 168
    new-array v4, v4, [F

    .line 169
    .line 170
    aput v0, v4, v3

    .line 171
    .line 172
    aput v6, v4, v2

    .line 173
    .line 174
    aput p1, v4, v1

    .line 175
    .line 176
    iget-object p1, p0, Lcom/swmansion/reanimated/sensor/ReanimatedSensorListener;->setter:Lcom/swmansion/reanimated/nativeProxy/SensorSetter;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v4, v5}, Lcom/swmansion/reanimated/nativeProxy/SensorSetter;->sensorSetter([FI)V

    .line 180
    return-void

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
