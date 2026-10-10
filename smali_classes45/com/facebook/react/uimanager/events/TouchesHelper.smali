.class public Lcom/facebook/react/uimanager/events/TouchesHelper;
.super Ljava/lang/Object;
.source "TouchesHelper.java"


# static fields
.field private static final CHANGED_TOUCHES_KEY:Ljava/lang/String; = "changedTouches"

.field private static final LOCATION_X_KEY:Ljava/lang/String; = "locationX"

.field private static final LOCATION_Y_KEY:Ljava/lang/String; = "locationY"

.field private static final PAGE_X_KEY:Ljava/lang/String; = "pageX"

.field private static final PAGE_Y_KEY:Ljava/lang/String; = "pageY"

.field private static final POINTER_IDENTIFIER_KEY:Ljava/lang/String; = "identifier"

.field private static final TAG:Ljava/lang/String; = "TouchesHelper"

.field public static final TARGET_KEY:Ljava/lang/String; = "target"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final TARGET_SURFACE_KEY:Ljava/lang/String; = "targetSurface"

.field private static final TIMESTAMP_KEY:Ljava/lang/String; = "timestamp"

.field private static final TOUCHES_KEY:Ljava/lang/String; = "touches"


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
    .line 18
.end method

.method private static createPointersArray(Lcom/facebook/react/uimanager/events/TouchEvent;)[Lcom/facebook/react/bridge/WritableMap;
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/TouchEvent;->getMotionEvent()Landroid/view/MotionEvent;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 8
    move-result v1

    .line 9
    .line 10
    new-array v1, v1, [Lcom/facebook/react/bridge/WritableMap;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    .line 14
    move-result v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/TouchEvent;->getViewX()F

    .line 18
    move-result v3

    .line 19
    sub-float/2addr v2, v3

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    .line 23
    move-result v3

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/TouchEvent;->getViewY()F

    .line 27
    move-result v4

    .line 28
    sub-float/2addr v3, v4

    .line 29
    const/4 v4, 0x0

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 33
    move-result v5

    .line 34
    .line 35
    if-ge v4, v5, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 39
    move-result-object v5

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 43
    move-result v6

    .line 44
    .line 45
    .line 46
    invoke-static {v6}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 47
    move-result v6

    .line 48
    float-to-double v6, v6

    .line 49
    .line 50
    const-string v8, "pageX"

    .line 51
    .line 52
    .line 53
    invoke-interface {v5, v8, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 57
    move-result v6

    .line 58
    .line 59
    .line 60
    invoke-static {v6}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 61
    move-result v6

    .line 62
    float-to-double v6, v6

    .line 63
    .line 64
    const-string v8, "pageY"

    .line 65
    .line 66
    .line 67
    invoke-interface {v5, v8, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 71
    move-result v6

    .line 72
    sub-float/2addr v6, v2

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 76
    move-result v7

    .line 77
    sub-float/2addr v7, v3

    .line 78
    .line 79
    .line 80
    invoke-static {v6}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 81
    move-result v6

    .line 82
    float-to-double v8, v6

    .line 83
    .line 84
    const-string v6, "locationX"

    .line 85
    .line 86
    .line 87
    invoke-interface {v5, v6, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 88
    .line 89
    .line 90
    invoke-static {v7}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 91
    move-result v6

    .line 92
    float-to-double v6, v6

    .line 93
    .line 94
    const-string v8, "locationY"

    .line 95
    .line 96
    .line 97
    invoke-interface {v5, v8, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 98
    .line 99
    .line 100
    const-string/jumbo v6, "targetSurface"

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getSurfaceId()I

    .line 104
    move-result v7

    .line 105
    .line 106
    .line 107
    invoke-interface {v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 108
    .line 109
    .line 110
    const-string/jumbo v6, "target"

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getViewTag()I

    .line 114
    move-result v7

    .line 115
    .line 116
    .line 117
    invoke-interface {v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getTimestampMs()J

    .line 121
    move-result-wide v6

    .line 122
    long-to-double v6, v6

    .line 123
    .line 124
    .line 125
    const-string/jumbo v8, "timestamp"

    .line 126
    .line 127
    .line 128
    invoke-interface {v5, v8, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 132
    move-result v6

    .line 133
    int-to-double v6, v6

    .line 134
    .line 135
    const-string v8, "identifier"

    .line 136
    .line 137
    .line 138
    invoke-interface {v5, v8, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 139
    .line 140
    aput-object v5, v1, v4

    .line 141
    .line 142
    add-int/lit8 v4, v4, 0x1

    .line 143
    goto :goto_0

    .line 144
    :cond_0
    return-object v1
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
.end method

.method private static varargs getWritableArray(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 4
    move-result-object v0

    .line 5
    array-length v1, p1

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v2, v1, :cond_2

    .line 9
    .line 10
    aget-object v3, p1, v2

    .line 11
    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v3}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 22
    .line 23
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_2
    return-object v0
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
.end method

.method public static sendTouchEvent(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;Lcom/facebook/react/uimanager/events/TouchEvent;)V
    .locals 17

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v3, "TouchesHelper.sentTouchEventModern("

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/TouchEvent;->getEventName()Ljava/lang/String;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v3, ")"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    const-wide/16 v3, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v4, v2}, Lcom/facebook/systrace/Systrace;->c(JLjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/TouchEvent;->getTouchEventType()Lcom/facebook/react/uimanager/events/TouchEventType;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/TouchEvent;->getMotionEvent()Landroid/view/MotionEvent;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    if-nez v5, :cond_0

    .line 44
    .line 45
    const-string v0, "TouchesHelper"

    .line 46
    .line 47
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v2, "Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"

    .line 50
    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    invoke-static {v3, v4}, Lcom/facebook/systrace/Systrace;->i(J)V

    .line 59
    return-void

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    .line 65
    :cond_0
    :try_start_1
    invoke-static/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/TouchesHelper;->createPointersArray(Lcom/facebook/react/uimanager/events/TouchEvent;)[Lcom/facebook/react/bridge/WritableMap;

    .line 66
    move-result-object v6

    .line 67
    .line 68
    sget-object v7, Lcom/facebook/react/uimanager/events/TouchesHelper$1;->$SwitchMap$com$facebook$react$uimanager$events$TouchEventType:[I

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 72
    move-result v2

    .line 73
    .line 74
    aget v2, v7, v2

    .line 75
    .line 76
    if-eq v2, v1, :cond_5

    .line 77
    const/4 v7, 0x2

    .line 78
    const/4 v8, 0x0

    .line 79
    .line 80
    if-eq v2, v7, :cond_4

    .line 81
    const/4 v5, 0x3

    .line 82
    .line 83
    if-eq v2, v5, :cond_2

    .line 84
    const/4 v5, 0x4

    .line 85
    .line 86
    if-eq v2, v5, :cond_1

    .line 87
    move-object v2, v6

    .line 88
    move-object v6, v8

    .line 89
    goto :goto_2

    .line 90
    .line 91
    :cond_1
    new-array v2, v0, [Lcom/facebook/react/bridge/WritableMap;

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    array-length v2, v6

    .line 94
    .line 95
    new-array v2, v2, [Lcom/facebook/react/bridge/WritableMap;

    .line 96
    move v5, v0

    .line 97
    :goto_0
    array-length v7, v6

    .line 98
    .line 99
    if-ge v5, v7, :cond_3

    .line 100
    .line 101
    aget-object v7, v6, v5

    .line 102
    .line 103
    .line 104
    invoke-interface {v7}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    .line 105
    move-result-object v7

    .line 106
    .line 107
    aput-object v7, v2, v5

    .line 108
    add-int/2addr v5, v1

    .line 109
    goto :goto_0

    .line 110
    .line 111
    :cond_3
    :goto_1
    move-object/from16 v16, v6

    .line 112
    move-object v6, v2

    .line 113
    .line 114
    move-object/from16 v2, v16

    .line 115
    goto :goto_2

    .line 116
    .line 117
    .line 118
    :cond_4
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 119
    move-result v2

    .line 120
    .line 121
    aget-object v5, v6, v2

    .line 122
    .line 123
    aput-object v8, v6, v2

    .line 124
    .line 125
    new-array v2, v1, [Lcom/facebook/react/bridge/WritableMap;

    .line 126
    .line 127
    aput-object v5, v2, v0

    .line 128
    goto :goto_1

    .line 129
    .line 130
    .line 131
    :cond_5
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 132
    move-result v2

    .line 133
    .line 134
    aget-object v2, v6, v2

    .line 135
    .line 136
    .line 137
    invoke-interface {v2}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    .line 138
    move-result-object v2

    .line 139
    .line 140
    new-array v5, v1, [Lcom/facebook/react/bridge/WritableMap;

    .line 141
    .line 142
    aput-object v2, v5, v0

    .line 143
    move-object v2, v6

    .line 144
    move-object v6, v5

    .line 145
    .line 146
    :goto_2
    if-eqz v6, :cond_6

    .line 147
    array-length v5, v6

    .line 148
    .line 149
    :goto_3
    if-ge v0, v5, :cond_6

    .line 150
    .line 151
    aget-object v7, v6, v0

    .line 152
    .line 153
    .line 154
    invoke-interface {v7}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    .line 155
    move-result-object v14

    .line 156
    .line 157
    .line 158
    invoke-static {v1, v6}, Lcom/facebook/react/uimanager/events/TouchesHelper;->getWritableArray(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;

    .line 159
    move-result-object v7

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/events/TouchesHelper;->getWritableArray(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;

    .line 163
    move-result-object v8

    .line 164
    .line 165
    const-string v9, "changedTouches"

    .line 166
    .line 167
    .line 168
    invoke-interface {v14, v9, v7}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 169
    .line 170
    .line 171
    const-string/jumbo v7, "touches"

    .line 172
    .line 173
    .line 174
    invoke-interface {v14, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/Event;->getSurfaceId()I

    .line 178
    move-result v9

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/Event;->getViewTag()I

    .line 182
    move-result v10

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/TouchEvent;->getEventName()Ljava/lang/String;

    .line 186
    move-result-object v11

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/TouchEvent;->canCoalesce()Z

    .line 190
    move-result v12

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/TouchEvent;->getEventCategory()I

    .line 194
    move-result v15

    .line 195
    const/4 v13, 0x0

    .line 196
    .line 197
    move-object/from16 v8, p0

    .line 198
    .line 199
    .line 200
    invoke-interface/range {v8 .. v15}, Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;->receiveEvent(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    add-int/2addr v0, v1

    .line 202
    goto :goto_3

    .line 203
    .line 204
    .line 205
    :cond_6
    invoke-static {v3, v4}, Lcom/facebook/systrace/Systrace;->i(J)V

    .line 206
    return-void

    .line 207
    .line 208
    .line 209
    :goto_4
    invoke-static {v3, v4}, Lcom/facebook/systrace/Systrace;->i(J)V

    .line 210
    throw v0
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
.end method

.method public static sendTouchesLegacy(Lcom/facebook/react/uimanager/events/RCTEventEmitter;Lcom/facebook/react/uimanager/events/TouchEvent;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/TouchEvent;->getTouchEventType()Lcom/facebook/react/uimanager/events/TouchEventType;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/facebook/react/uimanager/events/TouchesHelper;->createPointersArray(Lcom/facebook/react/uimanager/events/TouchEvent;)[Lcom/facebook/react/bridge/WritableMap;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v2, v1}, Lcom/facebook/react/uimanager/events/TouchesHelper;->getWritableArray(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/TouchEvent;->getMotionEvent()Landroid/view/MotionEvent;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 21
    move-result-object v3

    .line 22
    .line 23
    sget-object v4, Lcom/facebook/react/uimanager/events/TouchEventType;->MOVE:Lcom/facebook/react/uimanager/events/TouchEventType;

    .line 24
    .line 25
    if-eq v0, v4, :cond_3

    .line 26
    .line 27
    sget-object v4, Lcom/facebook/react/uimanager/events/TouchEventType;->CANCEL:Lcom/facebook/react/uimanager/events/TouchEventType;

    .line 28
    .line 29
    if-ne v0, v4, :cond_0

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_0
    sget-object v2, Lcom/facebook/react/uimanager/events/TouchEventType;->START:Lcom/facebook/react/uimanager/events/TouchEventType;

    .line 33
    .line 34
    if-eq v0, v2, :cond_2

    .line 35
    .line 36
    sget-object v2, Lcom/facebook/react/uimanager/events/TouchEventType;->END:Lcom/facebook/react/uimanager/events/TouchEventType;

    .line 37
    .line 38
    if-ne v0, v2, :cond_1

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    new-instance p1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    const-string v1, "Unknown touch type: "

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p0

    .line 63
    .line 64
    .line 65
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 66
    move-result p1

    .line 67
    .line 68
    .line 69
    invoke-interface {v3, p1}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 70
    goto :goto_2

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 74
    move-result v4

    .line 75
    .line 76
    if-ge v2, v4, :cond_4

    .line 77
    .line 78
    .line 79
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 80
    .line 81
    add-int/lit8 v2, v2, 0x1

    .line 82
    goto :goto_1

    .line 83
    .line 84
    .line 85
    :cond_4
    :goto_2
    invoke-static {v0}, Lcom/facebook/react/uimanager/events/TouchEventType;->getJSEventName(Lcom/facebook/react/uimanager/events/TouchEventType;)Ljava/lang/String;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-interface {p0, p1, v1, v3}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveTouches(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V

    .line 90
    return-void
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
.end method
