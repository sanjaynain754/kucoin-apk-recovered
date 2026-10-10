.class public final Lcom/swmansion/gesturehandler/core/StylusData$Companion;
.super Ljava/lang/Object;
.source "StylusData.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/gesturehandler/core/StylusData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/swmansion/gesturehandler/core/StylusData$Companion;",
        "",
        "<init>",
        "()V",
        "Landroid/view/MotionEvent;",
        "event",
        "Lcom/swmansion/gesturehandler/core/StylusData;",
        "fromEvent",
        "(Landroid/view/MotionEvent;)Lcom/swmansion/gesturehandler/core/StylusData;",
        "",
        "altitudeAngle",
        "azimuthAngle",
        "Lkotlin/Pair;",
        "a",
        "(DD)Lkotlin/Pair;",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/gesturehandler/core/StylusData$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(DD)Lkotlin/Pair;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD)",
            "Lkotlin/Pair<",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    .line 4
    .line 5
    const-wide v0, 0x3e112e0be826d695L    # 1.0E-9

    .line 6
    .line 7
    cmpg-double v2, p1, v0

    .line 8
    .line 9
    if-gez v2, :cond_9

    .line 10
    .line 11
    cmpg-double v2, p3, v0

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const-wide v3, 0x401921fb54442d18L    # 6.283185307179586

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const-wide v5, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 22
    .line 23
    const-wide/16 v7, 0x0

    .line 24
    .line 25
    if-ltz v2, :cond_1

    .line 26
    .line 27
    sub-double v9, p3, v3

    .line 28
    .line 29
    .line 30
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    .line 31
    move-result-wide v9

    .line 32
    .line 33
    cmpg-double v2, v9, v0

    .line 34
    .line 35
    if-gez v2, :cond_0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-wide v9, v7

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    move-wide v9, v5

    .line 40
    .line 41
    :goto_1
    sub-double v11, p3, v5

    .line 42
    .line 43
    .line 44
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(D)D

    .line 45
    move-result-wide v13

    .line 46
    .line 47
    cmpg-double v2, v13, v0

    .line 48
    .line 49
    if-gez v2, :cond_2

    .line 50
    move-wide v7, v5

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    :cond_2
    const-wide v13, 0x400921fb54442d18L    # Math.PI

    .line 56
    .line 57
    sub-double v13, p3, v13

    .line 58
    .line 59
    .line 60
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    .line 61
    move-result-wide v15

    .line 62
    .line 63
    cmpg-double v2, v15, v0

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    const-wide v15, -0x4006de04abbbd2e8L    # -1.5707963267948966

    .line 69
    .line 70
    if-gez v2, :cond_3

    .line 71
    move-wide v9, v15

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    :cond_3
    const-wide v17, 0x4012d97c7f3321d2L    # 4.71238898038469

    .line 77
    .line 78
    sub-double v17, p3, v17

    .line 79
    .line 80
    .line 81
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->abs(D)D

    .line 82
    move-result-wide v19

    .line 83
    .line 84
    cmpg-double v2, v19, v0

    .line 85
    .line 86
    if-gez v2, :cond_4

    .line 87
    move-wide v7, v15

    .line 88
    .line 89
    :cond_4
    cmpl-double v2, p3, v0

    .line 90
    .line 91
    if-lez v2, :cond_5

    .line 92
    .line 93
    .line 94
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(D)D

    .line 95
    move-result-wide v19

    .line 96
    .line 97
    cmpg-double v2, v19, v0

    .line 98
    .line 99
    if-gez v2, :cond_5

    .line 100
    move-wide v7, v5

    .line 101
    move-wide v9, v7

    .line 102
    .line 103
    .line 104
    :cond_5
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(D)D

    .line 105
    move-result-wide v11

    .line 106
    .line 107
    cmpl-double v2, v11, v0

    .line 108
    .line 109
    if-lez v2, :cond_6

    .line 110
    .line 111
    .line 112
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    .line 113
    move-result-wide v11

    .line 114
    .line 115
    cmpg-double v2, v11, v0

    .line 116
    .line 117
    if-gez v2, :cond_6

    .line 118
    move-wide v7, v5

    .line 119
    move-wide v9, v15

    .line 120
    .line 121
    .line 122
    :cond_6
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    .line 123
    move-result-wide v11

    .line 124
    .line 125
    cmpl-double v2, v11, v0

    .line 126
    .line 127
    if-lez v2, :cond_7

    .line 128
    .line 129
    .line 130
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->abs(D)D

    .line 131
    move-result-wide v11

    .line 132
    .line 133
    cmpg-double v2, v11, v0

    .line 134
    .line 135
    if-gez v2, :cond_7

    .line 136
    move-wide v7, v15

    .line 137
    move-wide v9, v7

    .line 138
    .line 139
    .line 140
    :cond_7
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->abs(D)D

    .line 141
    move-result-wide v11

    .line 142
    .line 143
    cmpl-double v2, v11, v0

    .line 144
    .line 145
    if-lez v2, :cond_8

    .line 146
    .line 147
    sub-double v2, p3, v3

    .line 148
    .line 149
    .line 150
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 151
    move-result-wide v2

    .line 152
    .line 153
    cmpg-double v0, v2, v0

    .line 154
    .line 155
    if-gez v0, :cond_8

    .line 156
    goto :goto_2

    .line 157
    :cond_8
    move-wide v15, v7

    .line 158
    move-wide v5, v9

    .line 159
    goto :goto_2

    .line 160
    .line 161
    .line 162
    :cond_9
    invoke-static/range {p1 .. p2}, Ljava/lang/Math;->tan(D)D

    .line 163
    move-result-wide v0

    .line 164
    .line 165
    .line 166
    invoke-static/range {p3 .. p4}, Ljava/lang/Math;->cos(D)D

    .line 167
    move-result-wide v2

    .line 168
    div-double/2addr v2, v0

    .line 169
    .line 170
    .line 171
    invoke-static {v2, v3}, Ljava/lang/Math;->atan(D)D

    .line 172
    move-result-wide v5

    .line 173
    .line 174
    .line 175
    invoke-static/range {p3 .. p4}, Ljava/lang/Math;->sin(D)D

    .line 176
    move-result-wide v2

    .line 177
    div-double/2addr v2, v0

    .line 178
    .line 179
    .line 180
    invoke-static {v2, v3}, Ljava/lang/Math;->atan(D)D

    .line 181
    move-result-wide v15

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    :goto_2
    const-wide v0, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 187
    mul-double/2addr v5, v0

    .line 188
    .line 189
    .line 190
    invoke-static {v5, v6}, Ljava/lang/Math;->rint(D)D

    .line 191
    move-result-wide v2

    .line 192
    mul-double/2addr v15, v0

    .line 193
    .line 194
    .line 195
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->rint(D)D

    .line 196
    move-result-wide v0

    .line 197
    .line 198
    new-instance v4, Lkotlin/Pair;

    .line 199
    .line 200
    .line 201
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 202
    move-result-object v2

    .line 203
    .line 204
    .line 205
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 206
    move-result-object v0

    .line 207
    .line 208
    .line 209
    invoke-direct {v4, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 210
    return-object v4
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public final fromEvent(Landroid/view/MotionEvent;)Lcom/swmansion/gesturehandler/core/StylusData;
    .locals 16
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "event"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const/16 v1, 0x19

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 13
    move-result v1

    .line 14
    float-to-double v1, v1

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    const-wide v3, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 20
    .line 21
    sub-double v10, v3, v1

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getPressure(I)F

    .line 26
    move-result v2

    .line 27
    float-to-double v14, v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->getOrientation(I)F

    .line 31
    move-result v0

    .line 32
    float-to-double v0, v0

    .line 33
    add-double/2addr v0, v3

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    .line 39
    rem-double/2addr v0, v2

    .line 40
    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmpg-double v4, v0, v4

    .line 44
    .line 45
    if-nez v4, :cond_0

    .line 46
    goto :goto_0

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Math;->signum(D)D

    .line 50
    move-result-wide v4

    .line 51
    .line 52
    .line 53
    invoke-static {v2, v3}, Ljava/lang/Math;->signum(D)D

    .line 54
    move-result-wide v6

    .line 55
    .line 56
    cmpg-double v4, v4, v6

    .line 57
    .line 58
    if-nez v4, :cond_1

    .line 59
    :goto_0
    move-wide v12, v0

    .line 60
    .line 61
    move-object/from16 v0, p0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    add-double/2addr v0, v2

    .line 64
    goto :goto_0

    .line 65
    .line 66
    .line 67
    :goto_1
    invoke-virtual {v0, v10, v11, v12, v13}, Lcom/swmansion/gesturehandler/core/StylusData$Companion;->a(DD)Lkotlin/Pair;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    new-instance v5, Lcom/swmansion/gesturehandler/core/StylusData;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    check-cast v2, Ljava/lang/Number;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 80
    move-result-wide v6

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    check-cast v1, Ljava/lang/Number;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 90
    move-result-wide v8

    .line 91
    .line 92
    .line 93
    invoke-direct/range {v5 .. v15}, Lcom/swmansion/gesturehandler/core/StylusData;-><init>(DDDDD)V

    .line 94
    return-object v5
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
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
