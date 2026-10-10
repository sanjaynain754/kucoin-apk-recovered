.class Landroidx/core/location/LocationCompat$Api28Impl;
.super Ljava/lang/Object;
.source "LocationCompat.java"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x1c
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/location/LocationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Api28Impl"
.end annotation


# direct methods
.method private constructor <init>()V
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
    .line 18
    .line 19
    .line 20
.end method

.method public static removeBearingAccuracy(Landroid/location/Location;)V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/location/Location;->hasBearingAccuracy()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    .line 18
    move-result-wide v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    .line 22
    move-result-wide v4

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    .line 26
    move-result-wide v6

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    .line 30
    move-result-wide v8

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/location/Location;->hasAltitude()Z

    .line 34
    move-result v10

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/location/Location;->getAltitude()D

    .line 38
    move-result-wide v11

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/location/Location;->hasSpeed()Z

    .line 42
    move-result v13

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/location/Location;->getSpeed()F

    .line 46
    move-result v14

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/location/Location;->hasBearing()Z

    .line 50
    move-result v15

    .line 51
    .line 52
    move/from16 v16, v10

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/location/Location;->getBearing()F

    .line 56
    move-result v10

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/location/Location;->hasAccuracy()Z

    .line 60
    move-result v17

    .line 61
    .line 62
    move/from16 v18, v13

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    .line 66
    move-result v13

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/location/Location;->hasVerticalAccuracy()Z

    .line 70
    move-result v19

    .line 71
    .line 72
    move/from16 v20, v15

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    .line 76
    move-result v15

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/location/Location;->hasSpeedAccuracy()Z

    .line 80
    move-result v21

    .line 81
    .line 82
    move/from16 v22, v15

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/location/Location;->getSpeedAccuracyMetersPerSecond()F

    .line 86
    move-result v15

    .line 87
    .line 88
    move/from16 v23, v15

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    .line 92
    move-result-object v15

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/location/Location;->reset()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Landroid/location/Location;->setProvider(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2, v3}, Landroid/location/Location;->setTime(J)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v4, v5}, Landroid/location/Location;->setElapsedRealtimeNanos(J)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v6, v7}, Landroid/location/Location;->setLatitude(D)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v8, v9}, Landroid/location/Location;->setLongitude(D)V

    .line 111
    .line 112
    if-eqz v16, :cond_1

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v11, v12}, Landroid/location/Location;->setAltitude(D)V

    .line 116
    .line 117
    :cond_1
    if-eqz v18, :cond_2

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v14}, Landroid/location/Location;->setSpeed(F)V

    .line 121
    .line 122
    :cond_2
    if-eqz v20, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v10}, Landroid/location/Location;->setBearing(F)V

    .line 126
    .line 127
    :cond_3
    if-eqz v17, :cond_4

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v13}, Landroid/location/Location;->setAccuracy(F)V

    .line 131
    .line 132
    :cond_4
    if-eqz v19, :cond_5

    .line 133
    .line 134
    move/from16 v1, v22

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Landroid/location/Location;->setVerticalAccuracyMeters(F)V

    .line 138
    .line 139
    :cond_5
    if-eqz v21, :cond_6

    .line 140
    .line 141
    move/from16 v1, v23

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Landroid/location/Location;->setBearingAccuracyDegrees(F)V

    .line 145
    .line 146
    :cond_6
    if-eqz v15, :cond_7

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v15}, Landroid/location/Location;->setExtras(Landroid/os/Bundle;)V

    .line 150
    :cond_7
    :goto_0
    return-void
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
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
.end method

.method public static removeSpeedAccuracy(Landroid/location/Location;)V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/location/Location;->hasSpeedAccuracy()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    .line 18
    move-result-wide v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    .line 22
    move-result-wide v4

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    .line 26
    move-result-wide v6

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    .line 30
    move-result-wide v8

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/location/Location;->hasAltitude()Z

    .line 34
    move-result v10

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/location/Location;->getAltitude()D

    .line 38
    move-result-wide v11

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/location/Location;->hasSpeed()Z

    .line 42
    move-result v13

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/location/Location;->getSpeed()F

    .line 46
    move-result v14

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/location/Location;->hasBearing()Z

    .line 50
    move-result v15

    .line 51
    .line 52
    move/from16 v16, v10

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/location/Location;->getBearing()F

    .line 56
    move-result v10

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/location/Location;->hasAccuracy()Z

    .line 60
    move-result v17

    .line 61
    .line 62
    move/from16 v18, v13

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    .line 66
    move-result v13

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/location/Location;->hasVerticalAccuracy()Z

    .line 70
    move-result v19

    .line 71
    .line 72
    move/from16 v20, v15

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/location/Location;->getVerticalAccuracyMeters()F

    .line 76
    move-result v15

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/location/Location;->hasBearingAccuracy()Z

    .line 80
    move-result v21

    .line 81
    .line 82
    move/from16 v22, v15

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/location/Location;->getBearingAccuracyDegrees()F

    .line 86
    move-result v15

    .line 87
    .line 88
    move/from16 v23, v15

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    .line 92
    move-result-object v15

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/location/Location;->reset()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Landroid/location/Location;->setProvider(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2, v3}, Landroid/location/Location;->setTime(J)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v4, v5}, Landroid/location/Location;->setElapsedRealtimeNanos(J)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v6, v7}, Landroid/location/Location;->setLatitude(D)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v8, v9}, Landroid/location/Location;->setLongitude(D)V

    .line 111
    .line 112
    if-eqz v16, :cond_1

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v11, v12}, Landroid/location/Location;->setAltitude(D)V

    .line 116
    .line 117
    :cond_1
    if-eqz v18, :cond_2

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v14}, Landroid/location/Location;->setSpeed(F)V

    .line 121
    .line 122
    :cond_2
    if-eqz v20, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v10}, Landroid/location/Location;->setBearing(F)V

    .line 126
    .line 127
    :cond_3
    if-eqz v17, :cond_4

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v13}, Landroid/location/Location;->setAccuracy(F)V

    .line 131
    .line 132
    :cond_4
    if-eqz v19, :cond_5

    .line 133
    .line 134
    move/from16 v1, v22

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Landroid/location/Location;->setVerticalAccuracyMeters(F)V

    .line 138
    .line 139
    :cond_5
    if-eqz v21, :cond_6

    .line 140
    .line 141
    move/from16 v1, v23

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Landroid/location/Location;->setBearingAccuracyDegrees(F)V

    .line 145
    .line 146
    :cond_6
    if-eqz v15, :cond_7

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v15}, Landroid/location/Location;->setExtras(Landroid/os/Bundle;)V

    .line 150
    :cond_7
    :goto_0
    return-void
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
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
.end method

.method public static removeVerticalAccuracy(Landroid/location/Location;)V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/location/Location;->hasVerticalAccuracy()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    .line 18
    move-result-wide v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/location/Location;->getElapsedRealtimeNanos()J

    .line 22
    move-result-wide v4

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    .line 26
    move-result-wide v6

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    .line 30
    move-result-wide v8

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/location/Location;->hasAltitude()Z

    .line 34
    move-result v10

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/location/Location;->getAltitude()D

    .line 38
    move-result-wide v11

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/location/Location;->hasSpeed()Z

    .line 42
    move-result v13

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/location/Location;->getSpeed()F

    .line 46
    move-result v14

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/location/Location;->hasBearing()Z

    .line 50
    move-result v15

    .line 51
    .line 52
    move/from16 v16, v10

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/location/Location;->getBearing()F

    .line 56
    move-result v10

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/location/Location;->hasAccuracy()Z

    .line 60
    move-result v17

    .line 61
    .line 62
    move/from16 v18, v13

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    .line 66
    move-result v13

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/location/Location;->hasSpeedAccuracy()Z

    .line 70
    move-result v19

    .line 71
    .line 72
    move/from16 v20, v15

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/location/Location;->getSpeedAccuracyMetersPerSecond()F

    .line 76
    move-result v15

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/location/Location;->hasBearingAccuracy()Z

    .line 80
    move-result v21

    .line 81
    .line 82
    move/from16 v22, v15

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/location/Location;->getBearingAccuracyDegrees()F

    .line 86
    move-result v15

    .line 87
    .line 88
    move/from16 v23, v15

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    .line 92
    move-result-object v15

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/location/Location;->reset()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Landroid/location/Location;->setProvider(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2, v3}, Landroid/location/Location;->setTime(J)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v4, v5}, Landroid/location/Location;->setElapsedRealtimeNanos(J)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v6, v7}, Landroid/location/Location;->setLatitude(D)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v8, v9}, Landroid/location/Location;->setLongitude(D)V

    .line 111
    .line 112
    if-eqz v16, :cond_1

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v11, v12}, Landroid/location/Location;->setAltitude(D)V

    .line 116
    .line 117
    :cond_1
    if-eqz v18, :cond_2

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v14}, Landroid/location/Location;->setSpeed(F)V

    .line 121
    .line 122
    :cond_2
    if-eqz v20, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v10}, Landroid/location/Location;->setBearing(F)V

    .line 126
    .line 127
    :cond_3
    if-eqz v17, :cond_4

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v13}, Landroid/location/Location;->setAccuracy(F)V

    .line 131
    .line 132
    :cond_4
    if-eqz v19, :cond_5

    .line 133
    .line 134
    move/from16 v1, v22

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Landroid/location/Location;->setSpeedAccuracyMetersPerSecond(F)V

    .line 138
    .line 139
    :cond_5
    if-eqz v21, :cond_6

    .line 140
    .line 141
    move/from16 v1, v23

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Landroid/location/Location;->setBearingAccuracyDegrees(F)V

    .line 145
    .line 146
    :cond_6
    if-eqz v15, :cond_7

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v15}, Landroid/location/Location;->setExtras(Landroid/os/Bundle;)V

    .line 150
    :cond_7
    :goto_0
    return-void
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
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
.end method
