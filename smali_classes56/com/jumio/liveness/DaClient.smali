.class public Lcom/jumio/liveness/DaClient;
.super Ljava/lang/Object;
.source "DaClient.java"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final ATTR_CAMERA_MATRIX:Ljava/lang/String; = "camera_matrix"

.field public static final ATTR_DISTANCE:Ljava/lang/String; = "distance"

.field public static final ATTR_FACE_BRIGHTNESS:Ljava/lang/String; = "face_brightness"

.field public static final ATTR_FACE_ROI:Ljava/lang/String; = "face_roi"

.field public static final ATTR_IOD:Ljava/lang/String; = "iod"

.field public static final ATTR_IS_TRUE:Ljava/lang/String; = "is_true"

.field public static final ATTR_METADATA:Ljava/lang/String; = "metadata"

.field public static final ATTR_OFFSET_X:Ljava/lang/String; = "offset_x"

.field public static final ATTR_OFFSET_Y:Ljava/lang/String; = "offset_y"

.field public static final ATTR_PITCH:Ljava/lang/String; = "pitch"

.field public static final ATTR_PSEUDO_PITCH:Ljava/lang/String; = "pseudo_pitch"

.field public static final ATTR_PSEUDO_YAW:Ljava/lang/String; = "pseudo_yaw"

.field public static final ATTR_ROLL:Ljava/lang/String; = "roll"

.field public static final ATTR_SEQUENCE_ID:Ljava/lang/String; = "sequence_id"

.field public static final ATTR_SERVER_DATA:Ljava/lang/String; = "server_data"

.field public static final ATTR_SHIFT:Ljava/lang/String; = "shift"

.field public static final ATTR_TARGET_DEPTH:Ljava/lang/String; = "target_depth"

.field public static final ATTR_YAW:Ljava/lang/String; = "yaw"

.field public static final EVENT_CAMERA_INFO:Ljava/lang/String; = "camera_info"

.field public static final EVENT_FAR_PHOTINUS_END:Ljava/lang/String; = "far_photinus_end"

.field public static final EVENT_FAR_PHOTINUS_START:Ljava/lang/String; = "far_photinus_start"

.field public static final EVENT_NEAR_PHOTINUS_END:Ljava/lang/String; = "near_photinus_end"

.field public static final EVENT_NEAR_PHOTINUS_START:Ljava/lang/String; = "near_photinus_start"

.field public static final EVENT_PHOTINUS_PATTERN:Ljava/lang/String; = "photinus_pattern"

.field public static final EVENT_POSE:Ljava/lang/String; = "pose"

.field public static final EVENT_POSE_READY:Ljava/lang/String; = "pose_ready"

.field public static final EVENT_POSE_START:Ljava/lang/String; = "pose_start"

.field public static final EVENT_SERVER_DATA_BLOB:Ljava/lang/String; = "server_data_blob"

.field public static final EVENT_START_SESSION:Ljava/lang/String; = "start_session"

.field private static hasStarted:Z


# direct methods
.method static constructor <clinit>()V
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
.end method

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

.method private static native deinit()V
.end method

.method public static deinitCompat()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    sput-boolean v0, Lcom/jumio/liveness/DaClient;->hasStarted:Z

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/jumio/liveness/DaClient;->deinit()V

    .line 7
    return-void
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

.method public static hasStarted()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/jumio/liveness/DaClient;->hasStarted:Z

    .line 3
    return v0
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
.end method

.method private static native init(Ljava/nio/ByteBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/jumio/liveness/IEventHandler;)Z
.end method

.method public static initCompat(Ljava/nio/ByteBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/jumio/liveness/IEventHandler;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    sput-boolean v0, Lcom/jumio/liveness/DaClient;->hasStarted:Z

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, p2, p3, p4}, Lcom/jumio/liveness/DaClient;->init(Ljava/nio/ByteBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/jumio/liveness/IEventHandler;)Z

    .line 7
    move-result p0

    .line 8
    return p0
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
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
.end method

.method public static native isBusy()Z
.end method

.method public static native isInitialized()Z
.end method

.method public static native sendAccel(JFFF)V
.end method

.method public static native sendEvent(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native sendEvent2(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native sendFrame(J[BIIIIII)V
.end method

.method public static native sendFrameYUV(JLandroid/media/Image;III)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation
.end method

.method public static native sendGyro(JFFF)V
.end method

.method public static native setEventHandler(Lcom/jumio/liveness/IEventHandler;)V
.end method

.method private static native start()V
.end method

.method public static startCompat()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    sput-boolean v0, Lcom/jumio/liveness/DaClient;->hasStarted:Z

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/jumio/liveness/DaClient;->start()V

    .line 7
    return-void
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

.method private static native stop()V
.end method

.method public static stopCompat()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    sput-boolean v0, Lcom/jumio/liveness/DaClient;->hasStarted:Z

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/jumio/liveness/DaClient;->stop()V

    .line 7
    return-void
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
