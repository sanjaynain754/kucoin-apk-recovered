.class public final Lio/trtc/tuikit/atomicxcore/impl/room/k0;
.super Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;
.source "SourceFile"

# interfaces
.implements Lio/trtc/tuikit/atomicxcore/impl/room/c;


# static fields
.field public static final synthetic C:I


# instance fields
.field public final A:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

.field public final B:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantState;

.field public final a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

.field public final b:Lkotlinx/coroutines/flow/n;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/n;

.field public final e:Lkotlinx/coroutines/flow/n;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public final g:Lkotlinx/coroutines/flow/n;

.field public final h:Lkotlinx/coroutines/flow/n;

.field public final i:Lkotlinx/coroutines/flow/n;

.field public final j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

.field public final k:I

.field public final l:I

.field public m:Z

.field public n:Z

.field public final o:Ljava/util/LinkedHashMap;

.field public final p:Ljava/util/LinkedHashMap;

.field public final q:Ljava/util/LinkedHashMap;

.field public final r:Lkotlinx/coroutines/m0;

.field public s:Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

.field public final t:Lio/trtc/tuikit/atomicxcore/impl/room/e;

.field public final u:Lio/trtc/tuikit/atomicxcore/impl/common/q;

.field public final v:Lio/trtc/tuikit/atomicxcore/impl/room/E;

.field public final w:Lio/trtc/tuikit/atomicxcore/impl/room/h;

.field public final x:Lio/trtc/tuikit/atomicxcore/impl/room/f;

.field public final y:Lio/trtc/tuikit/atomicxcore/impl/room/b;

.field public final z:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 26

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    const-string/jumbo v3, "sharedInstance(...)"

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    const-string v3, "roomID"

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    const-string v3, "roomEngine"

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStore;-><init>()V

    .line 28
    .line 29
    iput-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 37
    move-result-object v3

    .line 38
    .line 39
    iput-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->b:Lkotlinx/coroutines/flow/n;

    .line 40
    .line 41
    const-string v4, ""

    .line 42
    .line 43
    .line 44
    invoke-static {v4}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 45
    move-result-object v4

    .line 46
    .line 47
    iput-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->c:Lkotlinx/coroutines/flow/n;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    .line 54
    invoke-static {v5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    iput-object v5, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->d:Lkotlinx/coroutines/flow/n;

    .line 58
    const/4 v6, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static {v6}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 62
    move-result-object v6

    .line 63
    .line 64
    iput-object v6, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->e:Lkotlinx/coroutines/flow/n;

    .line 65
    .line 66
    .line 67
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 68
    move-result-object v7

    .line 69
    .line 70
    .line 71
    invoke-static {v7}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 72
    move-result-object v7

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 76
    move-result-object v8

    .line 77
    .line 78
    .line 79
    invoke-static {v8}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 80
    move-result-object v8

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 84
    move-result-object v9

    .line 85
    .line 86
    .line 87
    invoke-static {v9}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 88
    move-result-object v9

    .line 89
    .line 90
    iput-object v9, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->f:Lkotlinx/coroutines/flow/n;

    .line 91
    .line 92
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 93
    .line 94
    .line 95
    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-static {v10}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 99
    move-result-object v10

    .line 100
    .line 101
    iput-object v10, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->g:Lkotlinx/coroutines/flow/n;

    .line 102
    .line 103
    new-instance v11, Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    .line 106
    invoke-direct {v11}, Ljava/util/LinkedHashMap;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-static {v11}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 110
    move-result-object v11

    .line 111
    .line 112
    iput-object v11, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->h:Lkotlinx/coroutines/flow/n;

    .line 113
    .line 114
    new-instance v12, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 115
    .line 116
    const/16 v24, 0x7ff

    .line 117
    .line 118
    const/16 v25, 0x0

    .line 119
    const/4 v13, 0x0

    .line 120
    const/4 v14, 0x0

    .line 121
    const/4 v15, 0x0

    .line 122
    .line 123
    const/16 v16, 0x0

    .line 124
    .line 125
    const/16 v17, 0x0

    .line 126
    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    const/16 v19, 0x0

    .line 130
    .line 131
    const/16 v20, 0x0

    .line 132
    .line 133
    const/16 v21, 0x0

    .line 134
    .line 135
    const/16 v22, 0x0

    .line 136
    .line 137
    const/16 v23, 0x0

    .line 138
    .line 139
    .line 140
    invoke-direct/range {v12 .. v25}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v12}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 144
    move-result-object v12

    .line 145
    .line 146
    iput-object v12, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->i:Lkotlinx/coroutines/flow/n;

    .line 147
    .line 148
    const-string v13, "file"

    .line 149
    .line 150
    const-string v14, "RoomParticipantStoreImpl"

    .line 151
    .line 152
    .line 153
    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    new-instance v13, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 156
    .line 157
    .line 158
    invoke-direct {v13, v14}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 161
    .line 162
    const/16 v13, 0x12c

    .line 163
    .line 164
    iput v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->k:I

    .line 165
    .line 166
    const/16 v13, 0x32

    .line 167
    .line 168
    iput v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->l:I

    .line 169
    .line 170
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 171
    .line 172
    .line 173
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 174
    .line 175
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->o:Ljava/util/LinkedHashMap;

    .line 176
    .line 177
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 178
    .line 179
    .line 180
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 181
    .line 182
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->p:Ljava/util/LinkedHashMap;

    .line 183
    .line 184
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 185
    .line 186
    .line 187
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 188
    .line 189
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->q:Ljava/util/LinkedHashMap;

    .line 190
    .line 191
    .line 192
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 193
    move-result-object v13

    .line 194
    .line 195
    .line 196
    invoke-static {v13}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 197
    move-result-object v13

    .line 198
    .line 199
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->r:Lkotlinx/coroutines/m0;

    .line 200
    .line 201
    new-instance v13, Lio/trtc/tuikit/atomicxcore/impl/room/e;

    .line 202
    .line 203
    .line 204
    invoke-direct {v13}, Lio/trtc/tuikit/atomicxcore/impl/room/e;-><init>()V

    .line 205
    .line 206
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->t:Lio/trtc/tuikit/atomicxcore/impl/room/e;

    .line 207
    .line 208
    new-instance v13, Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 209
    .line 210
    .line 211
    invoke-direct {v13}, Lio/trtc/tuikit/atomicxcore/impl/common/q;-><init>()V

    .line 212
    .line 213
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->u:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 214
    .line 215
    new-instance v13, Lio/trtc/tuikit/atomicxcore/impl/room/E;

    .line 216
    .line 217
    .line 218
    invoke-direct {v13, v0}, Lio/trtc/tuikit/atomicxcore/impl/room/E;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;)V

    .line 219
    .line 220
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->v:Lio/trtc/tuikit/atomicxcore/impl/room/E;

    .line 221
    .line 222
    new-instance v13, Lio/trtc/tuikit/atomicxcore/impl/room/h;

    .line 223
    .line 224
    .line 225
    invoke-direct {v13, v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/room/h;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Ljava/lang/String;)V

    .line 226
    .line 227
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->w:Lio/trtc/tuikit/atomicxcore/impl/room/h;

    .line 228
    .line 229
    new-instance v13, Lio/trtc/tuikit/atomicxcore/impl/room/f;

    .line 230
    .line 231
    .line 232
    invoke-direct {v13, v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/room/f;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Ljava/lang/String;)V

    .line 233
    .line 234
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->x:Lio/trtc/tuikit/atomicxcore/impl/room/f;

    .line 235
    .line 236
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/b;

    .line 237
    .line 238
    .line 239
    invoke-direct {v1, v7, v8}, Lio/trtc/tuikit/atomicxcore/impl/room/b;-><init>(Lkotlinx/coroutines/flow/n;Lkotlinx/coroutines/flow/n;)V

    .line 240
    .line 241
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->y:Lio/trtc/tuikit/atomicxcore/impl/room/b;

    .line 242
    .line 243
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->CONFERENCE_LIST_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getExtension(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;)Ljava/lang/Object;

    .line 247
    move-result-object v1

    .line 248
    .line 249
    const-string v13, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager"

    .line 250
    .line 251
    .line 252
    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 255
    .line 256
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->z:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    .line 257
    .line 258
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;->CONFERENCE_INVITATION_MANAGER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getExtension(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$ExtensionType;)Ljava/lang/Object;

    .line 262
    move-result-object v1

    .line 263
    .line 264
    const-string v2, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager"

    .line 265
    .line 266
    .line 267
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 270
    .line 271
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->A:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    .line 272
    .line 273
    new-instance v13, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantState;

    .line 274
    .line 275
    .line 276
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 277
    move-result-object v14

    .line 278
    .line 279
    .line 280
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 281
    move-result-object v15

    .line 282
    .line 283
    .line 284
    invoke-static {v5}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 285
    move-result-object v16

    .line 286
    .line 287
    .line 288
    invoke-static {v6}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 289
    move-result-object v17

    .line 290
    .line 291
    .line 292
    invoke-static {v7}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 293
    move-result-object v18

    .line 294
    .line 295
    .line 296
    invoke-static {v8}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 297
    move-result-object v19

    .line 298
    .line 299
    .line 300
    invoke-static {v10}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 301
    move-result-object v20

    .line 302
    .line 303
    .line 304
    invoke-static {v11}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 305
    move-result-object v21

    .line 306
    .line 307
    .line 308
    invoke-static {v9}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 309
    move-result-object v22

    .line 310
    .line 311
    .line 312
    invoke-static {v12}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 313
    move-result-object v23

    .line 314
    .line 315
    .line 316
    invoke-direct/range {v13 .. v23}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 317
    .line 318
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->B:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantState;

    .line 319
    return-void
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
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/room/M;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/M;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;->b:Ljava/lang/String;

    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;->a:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v0

    move-object v0, p1

    move-object p1, v2

    :goto_1
    move-object v2, v8

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    new-instance p2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    const-string v2, ""

    iput-object v2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 5
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->q:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    move-object v8, p1

    move-object p1, p0

    move-object p0, p2

    move-object p2, v8

    .line 6
    :goto_2
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;->a:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    iput-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;->b:Ljava/lang/String;

    iput-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/room/M;->f:I

    new-instance v2, Lkotlin/coroutines/SafeContinuation;

    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v4

    invoke-direct {v2, v4}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 7
    iget-object v4, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->z:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;

    iget-object v5, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget v6, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->l:I

    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/room/N;

    invoke-direct {v7, v2, p1}, Lio/trtc/tuikit/atomicxcore/impl/room/N;-><init>(Lkotlin/coroutines/SafeContinuation;Lio/trtc/tuikit/atomicxcore/impl/room/k0;)V

    invoke-virtual {v4, p2, v5, v6, v7}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager;->fetchAttendeeList(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledAttendeesCallback;)V

    .line 8
    invoke-virtual {v2}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_3

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_3
    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v8, v0

    move-object v0, p2

    move-object p2, v2

    goto :goto_1

    :goto_3
    check-cast p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;

    .line 9
    iget-object v4, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;->scheduleAttendees:Ljava/util/List;

    const-string v5, "scheduleAttendees"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 11
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v6, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;->SCHEDULED:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;

    invoke-static {v5, v6}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;)Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    move-result-object v5

    .line 12
    iget-object v6, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->q:Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 13
    :cond_5
    iget-object p2, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;->cursor:Ljava/lang/String;

    const-string v4, "cursor"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 14
    iget-object p2, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "fetchAttendeeList page, cursor: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    const-string v5, "message"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    .line 16
    invoke-virtual {p2, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    .line 17
    iget-object p2, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Ljava/lang/CharSequence;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lez p2, :cond_6

    move-object p2, v0

    move-object v0, v2

    goto/16 :goto_2

    .line 18
    :cond_6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/room/k0;)V
    .locals 5

    .line 19
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->b:Lkotlinx/coroutines/flow/n;

    .line 20
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 21
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 22
    invoke-static {}, Lkotlin/collections/CollectionsKt;->createListBuilder()Ljava/util/List;

    move-result-object v2

    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 24
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->p:Ljava/util/LinkedHashMap;

    .line 26
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 27
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 28
    :cond_2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->q:Ljava/util/LinkedHashMap;

    .line 29
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 30
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 31
    :cond_4
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->build(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 32
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->f:Lkotlinx/coroutines/flow/n;

    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/room/U0;Z)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    .line 100
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->o:Ljava/util/LinkedHashMap;

    .line 101
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    if-nez v1, :cond_1

    if-nez p3, :cond_0

    .line 102
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Ignore participant without stream userID: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    const-string v2, "message"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 104
    invoke-virtual {v0, v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    return-void

    .line 105
    :cond_0
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    const/16 v13, 0x7fe

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v14}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLjava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    move-object/from16 v1, p1

    goto :goto_0

    :cond_1
    const/16 v14, 0x7ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v2, v1

    move-object/from16 v1, p1

    .line 106
    invoke-static/range {v2 .. v15}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->copy$default(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLjava/util/Map;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    move-result-object v2

    .line 107
    :goto_0
    invoke-static/range {p3 .. p3}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Z)Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    move-result-object v3

    .line 108
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    if-eqz v4, :cond_b

    const/4 v5, 0x1

    if-eq v4, v5, :cond_6

    const/4 v1, 0x2

    if-eq v4, v1, :cond_2

    goto/16 :goto_2

    .line 109
    :cond_2
    invoke-virtual {v2, v3}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->setScreenShareStatus(Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;)V

    .line 110
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    if-ne v3, v1, :cond_4

    .line 111
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->e:Lkotlinx/coroutines/flow/n;

    .line 112
    :cond_3
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 113
    move-object v4, v3

    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 114
    invoke-interface {v1, v3, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    .line 115
    :cond_4
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->e:Lkotlinx/coroutines/flow/n;

    .line 116
    :cond_5
    invoke-interface {v4}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 117
    move-object v3, v1

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    const/4 v3, 0x0

    .line 118
    invoke-interface {v4, v1, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    .line 119
    :cond_6
    invoke-virtual {v2, v3}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->setCameraStatus(Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;)V

    .line 120
    sget-object v4, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    if-ne v3, v4, :cond_7

    .line 121
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->d:Lkotlinx/coroutines/flow/n;

    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/room/c0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/c0;

    invoke-static {v1, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/room/a;->a(Lkotlinx/coroutines/flow/n;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 122
    :cond_7
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->d:Lkotlinx/coroutines/flow/n;

    .line 123
    :cond_8
    invoke-interface {v4}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 124
    move-object v5, v3

    check-cast v5, Ljava/util/List;

    .line 125
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 126
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 127
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    .line 128
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 129
    :cond_a
    invoke-interface {v4, v3, v6}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_2

    .line 130
    :cond_b
    invoke-virtual {v2, v3}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->setMicrophoneStatus(Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;)V

    .line 131
    :goto_2
    invoke-virtual {v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V

    return-void
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/room/O;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/O;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;->b:Ljava/lang/String;

    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;->a:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v0

    move-object v0, p1

    move-object p1, v2

    :goto_1
    move-object v2, v8

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    new-instance p2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    const-string v2, ""

    iput-object v2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 4
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->p:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    move-object v8, p1

    move-object p1, p0

    move-object p0, p2

    move-object p2, v8

    .line 5
    :goto_2
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;->a:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    iput-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;->b:Ljava/lang/String;

    iput-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;->c:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O;->f:I

    new-instance v2, Lkotlin/coroutines/SafeContinuation;

    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v4

    invoke-direct {v2, v4}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 6
    iget-object v4, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->A:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;

    iget-object v5, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget v6, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->l:I

    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/room/P;

    invoke-direct {v7, v2, p1}, Lio/trtc/tuikit/atomicxcore/impl/room/P;-><init>(Lkotlin/coroutines/SafeContinuation;Lio/trtc/tuikit/atomicxcore/impl/room/k0;)V

    invoke-virtual {v4, p2, v5, v6, v7}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager;->getInvitationList(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$GetInvitationListCallback;)V

    .line 7
    invoke-virtual {v2}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_3

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_3
    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v8, v0

    move-object v0, p2

    move-object p2, v2

    goto :goto_1

    :goto_3
    check-cast p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationListResult;

    .line 8
    iget-object v4, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationListResult;->invitationList:Ljava/util/List;

    const-string v5, "invitationList"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;

    .line 10
    iget-object v6, v5, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->invitee:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    const-string v7, "invitee"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v5, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$Invitation;->status:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;

    const-string/jumbo v7, "status"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v5}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationStatus;)Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    move-result-object v5

    .line 11
    iget-object v6, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->p:Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 12
    :cond_5
    iget-object p2, p2, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceInvitationManager$InvitationListResult;->cursor:Ljava/lang/String;

    const-string v4, "cursor"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 13
    iget-object p2, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "fetchInvitationList page, cursor: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    const-string v5, "message"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    .line 15
    invoke-virtual {p2, v5, v4}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    .line 16
    iget-object p2, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Ljava/lang/CharSequence;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lez p2, :cond_6

    move-object p2, v0

    move-object v0, v2

    goto/16 :goto_2

    .line 17
    :cond_6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final c(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/room/Q;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    move-object v0, p2

    .line 9
    .line 10
    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;

    .line 11
    .line 12
    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;->f:I

    .line 13
    .line 14
    const/high16 v2, -0x80000000

    .line 15
    .line 16
    and-int v3, v1, v2

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    sub-int/2addr v1, v2

    .line 20
    .line 21
    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;->f:I

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/Q;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 28
    .line 29
    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;->d:Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;->f:I

    .line 36
    .line 37
    const-wide/16 v3, 0x0

    .line 38
    const/4 v5, 0x1

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    if-ne v2, v5, :cond_1

    .line 43
    .line 44
    iget-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;->c:Lkotlin/jvm/internal/Ref$LongRef;

    .line 45
    .line 46
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;->b:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;->a:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 49
    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    move-object v12, v0

    .line 53
    move-object v0, p1

    .line 54
    move-object p1, v2

    .line 55
    :goto_1
    move-object v2, v12

    .line 56
    goto :goto_4

    .line 57
    .line 58
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    throw p0

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    new-instance p2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 70
    .line 71
    .line 72
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 73
    .line 74
    if-eqz p1, :cond_3

    .line 75
    .line 76
    .line 77
    invoke-static {p1}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 84
    move-result-wide v6

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    move-wide v6, v3

    .line 87
    .line 88
    :goto_2
    iput-wide v6, p2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 89
    .line 90
    if-eqz p1, :cond_4

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 94
    move-result v2

    .line 95
    .line 96
    if-nez v2, :cond_5

    .line 97
    .line 98
    :cond_4
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->o:Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 102
    :cond_5
    move-object v12, p1

    .line 103
    move-object p1, p0

    .line 104
    move-object p0, p2

    .line 105
    move-object p2, v12

    .line 106
    .line 107
    :goto_3
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;->a:Lio/trtc/tuikit/atomicxcore/impl/room/k0;

    .line 108
    .line 109
    iput-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;->b:Ljava/lang/String;

    .line 110
    .line 111
    iput-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;->c:Lkotlin/jvm/internal/Ref$LongRef;

    .line 112
    .line 113
    iput v5, v0, Lio/trtc/tuikit/atomicxcore/impl/room/Q;->f:I

    .line 114
    .line 115
    new-instance v2, Lkotlin/coroutines/SafeContinuation;

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 119
    move-result-object v6

    .line 120
    .line 121
    .line 122
    invoke-direct {v2, v6}, Lkotlin/coroutines/SafeContinuation;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 123
    .line 124
    iget-object v6, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 125
    .line 126
    iget-wide v7, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 127
    .line 128
    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/room/S;

    .line 129
    .line 130
    .line 131
    invoke-direct {v9, v2, p1}, Lio/trtc/tuikit/atomicxcore/impl/room/S;-><init>(Lkotlin/coroutines/SafeContinuation;Lio/trtc/tuikit/atomicxcore/impl/room/k0;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6, v7, v8, v9}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getUserList(JLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$GetUserListCallback;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Lkotlin/coroutines/SafeContinuation;->getOrThrow()Ljava/lang/Object;

    .line 138
    move-result-object v2

    .line 139
    .line 140
    .line 141
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 142
    move-result-object v6

    .line 143
    .line 144
    if-ne v2, v6, :cond_6

    .line 145
    .line 146
    .line 147
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    .line 148
    .line 149
    :cond_6
    if-ne v2, v1, :cond_7

    .line 150
    return-object v1

    .line 151
    :cond_7
    move-object v12, v0

    .line 152
    move-object v0, p2

    .line 153
    move-object p2, v2

    .line 154
    goto :goto_1

    .line 155
    .line 156
    :goto_4
    check-cast p2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;

    .line 157
    .line 158
    iget-object v6, p2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;->userInfoList:Ljava/util/List;

    .line 159
    .line 160
    .line 161
    const-string/jumbo v7, "userInfoList"

    .line 162
    .line 163
    .line 164
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    move-result-object v6

    .line 169
    .line 170
    .line 171
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    move-result v7

    .line 173
    .line 174
    if-eqz v7, :cond_d

    .line 175
    .line 176
    .line 177
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    move-result-object v7

    .line 179
    .line 180
    check-cast v7, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 181
    .line 182
    .line 183
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 184
    .line 185
    sget-object v8, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;->IN_ROOM:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;

    .line 186
    .line 187
    .line 188
    invoke-static {v7, v8}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;)Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 189
    move-result-object v7

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v7}, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->b(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 196
    move-result-object v8

    .line 197
    .line 198
    .line 199
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 200
    move-result v8

    .line 201
    .line 202
    if-nez v8, :cond_8

    .line 203
    goto :goto_7

    .line 204
    .line 205
    :cond_8
    iget-object v8, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->e:Lkotlinx/coroutines/flow/n;

    .line 206
    .line 207
    .line 208
    invoke-interface {v8}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 209
    move-result-object v8

    .line 210
    .line 211
    check-cast v8, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 212
    .line 213
    if-eqz v8, :cond_9

    .line 214
    .line 215
    .line 216
    invoke-virtual {v8}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 217
    move-result-object v8

    .line 218
    goto :goto_6

    .line 219
    :cond_9
    const/4 v8, 0x0

    .line 220
    .line 221
    .line 222
    :goto_6
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 223
    move-result-object v9

    .line 224
    .line 225
    .line 226
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    move-result v8

    .line 228
    .line 229
    if-eqz v8, :cond_b

    .line 230
    .line 231
    iget-object v8, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->e:Lkotlinx/coroutines/flow/n;

    .line 232
    .line 233
    .line 234
    :cond_a
    invoke-interface {v8}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 235
    move-result-object v9

    .line 236
    move-object v10, v9

    .line 237
    .line 238
    check-cast v10, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 239
    .line 240
    .line 241
    invoke-interface {v8, v9, v7}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    move-result v9

    .line 243
    .line 244
    if-eqz v9, :cond_a

    .line 245
    .line 246
    .line 247
    :cond_b
    :goto_7
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 248
    move-result-object v8

    .line 249
    .line 250
    .line 251
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    .line 252
    move-result-object v9

    .line 253
    .line 254
    iget-object v9, v9, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    move-result v8

    .line 259
    .line 260
    if-eqz v8, :cond_c

    .line 261
    .line 262
    iget-object v8, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->i:Lkotlinx/coroutines/flow/n;

    .line 263
    .line 264
    .line 265
    invoke-interface {v8, v7}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 266
    .line 267
    :cond_c
    iget-object v8, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->o:Ljava/util/LinkedHashMap;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    .line 271
    move-result-object v9

    .line 272
    .line 273
    .line 274
    invoke-virtual {v8, v9, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    goto :goto_5

    .line 276
    .line 277
    :cond_d
    iget-wide v6, p2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserListResult;->nextSequence:J

    .line 278
    .line 279
    iput-wide v6, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 280
    .line 281
    iget-object p2, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 282
    .line 283
    new-instance v6, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    const-string v7, "getUserList, nextSequence: "

    .line 286
    .line 287
    .line 288
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    iget-wide v7, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 291
    .line 292
    .line 293
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    const-string v7, " userList size:"

    .line 296
    .line 297
    .line 298
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    iget-object v8, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->o:Ljava/util/LinkedHashMap;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v8}, Ljava/util/AbstractMap;->size()I

    .line 304
    move-result v8

    .line 305
    .line 306
    .line 307
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    move-result-object v6

    .line 312
    .line 313
    .line 314
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    const-string v8, "message"

    .line 317
    .line 318
    .line 319
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    const/4 v9, 0x0

    .line 321
    .line 322
    .line 323
    invoke-virtual {p2, v9, v6}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    .line 324
    .line 325
    if-eqz v0, :cond_e

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 329
    move-result p2

    .line 330
    .line 331
    if-lez p2, :cond_e

    .line 332
    goto :goto_8

    .line 333
    .line 334
    :cond_e
    iget-wide v10, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 335
    .line 336
    cmp-long p2, v10, v3

    .line 337
    .line 338
    if-eqz p2, :cond_10

    .line 339
    .line 340
    iget-object p2, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->o:Ljava/util/LinkedHashMap;

    .line 341
    .line 342
    .line 343
    invoke-virtual {p2}, Ljava/util/AbstractMap;->size()I

    .line 344
    move-result p2

    .line 345
    .line 346
    iget v6, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->k:I

    .line 347
    .line 348
    if-lt p2, v6, :cond_f

    .line 349
    goto :goto_8

    .line 350
    :cond_f
    move-object p2, v0

    .line 351
    move-object v0, v2

    .line 352
    .line 353
    goto/16 :goto_3

    .line 354
    .line 355
    :cond_10
    :goto_8
    iget-object p2, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 356
    .line 357
    new-instance v0, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    const-string v1, "getUserList, result: "

    .line 360
    .line 361
    .line 362
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    iget-wide v1, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    iget-object v1, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->o:Ljava/util/LinkedHashMap;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 376
    move-result v1

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    move-result-object v0

    .line 384
    .line 385
    .line 386
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {p2, v9, v0}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    .line 393
    .line 394
    iget-object p2, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->b:Lkotlinx/coroutines/flow/n;

    .line 395
    .line 396
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->o:Ljava/util/LinkedHashMap;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 400
    move-result-object v0

    .line 401
    .line 402
    const-string v1, "<get-values>(...)"

    .line 403
    .line 404
    .line 405
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 409
    move-result-object v0

    .line 410
    .line 411
    .line 412
    invoke-interface {p2, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 413
    .line 414
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->c:Lkotlinx/coroutines/flow/n;

    .line 415
    .line 416
    iget-wide v0, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 417
    .line 418
    .line 419
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 420
    move-result-object p0

    .line 421
    .line 422
    .line 423
    invoke-interface {p1, p0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 424
    .line 425
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 426
    return-object p0
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method


# virtual methods
.method public final a(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Ljava/lang/String;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 33
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->y:Lio/trtc/tuikit/atomicxcore/impl/room/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    const-string/jumbo v1, "userID"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "device"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/b;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/room/V0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 36
    const-string v2, "deviceType"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/V0;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    .line 38
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    const-string p2, "message"

    const-string p3, "Not receiving requests"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 40
    invoke-virtual {p1, p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    if-eqz p4, :cond_1

    .line 41
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    move-result p1

    invoke-interface {p4, p1, p3}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    :cond_1
    return-void

    .line 42
    :cond_2
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 43
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->requestId:Ljava/lang/String;

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 44
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/room/h0;

    invoke-direct {v4, p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/h0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Ljava/lang/String;)V

    const/4 p1, 0x4

    .line 45
    invoke-direct {v3, p4, v4, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 46
    const-string p1, ""

    invoke-virtual {v2, v0, p3, p1, v3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->responseRemoteRequest(Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    return-void
.end method

.method public final a(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "participant"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->o:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->b:Lkotlinx/coroutines/flow/n;

    sget-object v3, Lio/trtc/tuikit/atomicxcore/impl/room/I;->a:Lio/trtc/tuikit/atomicxcore/impl/room/I;

    invoke-static {v2, v1, v3}, Lio/trtc/tuikit/atomicxcore/impl/room/a;->a(Lkotlinx/coroutines/flow/n;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 63
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v2

    .line 64
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    move-result-object v3

    iget-object v3, v3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 65
    iget-object v15, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->i:Lkotlinx/coroutines/flow/n;

    .line 66
    :goto_0
    invoke-interface {v15}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 67
    move-object v3, v2

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    const/16 v13, 0x7ff

    const/4 v14, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v0, v16

    .line 68
    invoke-static/range {v1 .. v14}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->copy$default(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/ParticipantRole;Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLjava/util/Map;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    move-result-object v2

    .line 69
    invoke-interface {v15, v0, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    move-object/from16 v0, p0

    goto :goto_0

    .line 70
    :cond_1
    :goto_1
    invoke-virtual/range {p0 .. p1}, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->b(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V

    .line 71
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    move-object/from16 v0, p0

    goto :goto_3

    :cond_2
    move-object/from16 v0, p0

    .line 72
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->e:Lkotlinx/coroutines/flow/n;

    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    if-eqz v2, :cond_3

    .line 73
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 74
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->e:Lkotlinx/coroutines/flow/n;

    .line 75
    :cond_4
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 76
    move-object v4, v3

    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 77
    invoke-interface {v2, v3, v1}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 78
    :cond_5
    :goto_3
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v2

    .line 79
    const-string/jumbo v3, "userID"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->p:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, v2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->f:Lkotlinx/coroutines/flow/n;

    .line 82
    :cond_6
    invoke-interface {v4}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 83
    move-object v6, v5

    check-cast v6, Ljava/util/List;

    .line 84
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 85
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_7
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 86
    invoke-virtual {v9}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    .line 87
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 88
    :cond_8
    invoke-interface {v4, v5, v7}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 89
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v5

    .line 90
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->q:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v5}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    iget-object v6, v0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->f:Lkotlinx/coroutines/flow/n;

    .line 93
    :cond_9
    invoke-interface {v6}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 94
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    .line 95
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 96
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 97
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    .line 98
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 99
    :cond_b
    invoke-interface {v6, v1, v3}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    return-void
.end method

.method public final a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 47
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->y:Lio/trtc/tuikit/atomicxcore/impl/room/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    const-string/jumbo v1, "userID"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "device"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/b;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/room/V0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 50
    const-string v2, "deviceType"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/room/V0;->b:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    .line 52
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    const-string p2, "message"

    const-string p3, "Not receiving invitations"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 54
    invoke-virtual {p1, p2, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    if-eqz p4, :cond_1

    .line 55
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    move-result p1

    invoke-interface {p4, p1, p3}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    :cond_1
    return-void

    .line 56
    :cond_2
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 57
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->requestId:Ljava/lang/String;

    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 58
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/room/i0;

    invoke-direct {v4, p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/i0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;)V

    const/4 p1, 0x4

    .line 59
    invoke-direct {v3, p4, v4, v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 60
    const-string p1, ""

    invoke-virtual {v2, v0, p3, p1, v3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->responseRemoteRequest(Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    return-void
.end method

.method public final acceptOpenDeviceInvitation(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "device"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const/4 v0, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, v0, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 16
    return-void
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
.end method

.method public final addRoomParticipantListener(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantListener;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->u:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Ljava/lang/Object;)V

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

.method public final approveOpenDeviceRequest(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "device"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "userID"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const/4 v0, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, v0, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Ljava/lang/String;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 16
    return-void
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
.end method

.method public final b(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;)V
    .locals 5

    .line 18
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 19
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->d:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    .line 21
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v1, v2

    .line 22
    :goto_0
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;

    if-eqz v1, :cond_3

    .line 23
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v2

    :cond_3
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipant;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 24
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->d:Lkotlinx/coroutines/flow/n;

    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/room/j0;->a:Lio/trtc/tuikit/atomicxcore/impl/room/j0;

    invoke-static {v0, p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/room/a;->b(Lkotlinx/coroutines/flow/n;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final cancelOpenDeviceInvitation(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "device"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->y:Lio/trtc/tuikit/atomicxcore/impl/room/b;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/b;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    const-string p2, "message"

    .line 27
    .line 28
    const-string v0, "No invitation is sent"

    .line 29
    .line 30
    .line 31
    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    const/4 p2, 0x1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    .line 36
    .line 37
    if-eqz p3, :cond_0

    .line 38
    .line 39
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 43
    move-result p1

    .line 44
    .line 45
    .line 46
    invoke-interface {p3, p1, v0}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 47
    :cond_0
    return-void

    .line 48
    .line 49
    :cond_1
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->requestId:Ljava/lang/String;

    .line 52
    .line 53
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 54
    .line 55
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/room/K;

    .line 56
    .line 57
    .line 58
    invoke-direct {v3, p0, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/room/K;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;)V

    .line 59
    const/4 p1, 0x0

    .line 60
    const/4 p2, 0x4

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, p3, v3, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->cancelRequest(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 67
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
.end method

.method public final cancelOpenDeviceRequest(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "device"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->y:Lio/trtc/tuikit/atomicxcore/impl/room/b;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    iget-object v0, v1, Lio/trtc/tuikit/atomicxcore/impl/room/b;->c:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    const-string v0, "message"

    .line 31
    .line 32
    const-string v1, "No device application is requesting"

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    const/4 v0, 0x1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    .line 40
    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 47
    move-result p1

    .line 48
    .line 49
    .line 50
    invoke-interface {p2, p1, v1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 51
    :cond_0
    return-void

    .line 52
    .line 53
    :cond_1
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;->requestId:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 58
    .line 59
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/room/L;

    .line 60
    .line 61
    .line 62
    invoke-direct {v3, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/room/L;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;)V

    .line 63
    const/4 p1, 0x0

    .line 64
    const/4 v4, 0x4

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, p2, v3, p1, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->cancelRequest(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 71
    return-void
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
.end method

.method public final closeParticipantDevice(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "device"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x6

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p3, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->closeRemoteDeviceByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 28
    return-void
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
.end method

.method public final declineOpenDeviceInvitation(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "device"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, v0, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 16
    return-void
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
.end method

.method public final disableAllDevices(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "device"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x6

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p3, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->disableDeviceForAllUserByAdmin(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 22
    return-void
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
.end method

.method public final disableAllMessages(ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 3
    .line 4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x6

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p2, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->disableSendingMessageForAllUser(ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
    .line 43
.end method

.method public final disableUserMessage(Ljava/lang/String;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 9
    .line 10
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x6

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p3, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->disableSendingMessageByAdmin(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 19
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
.end method

.method public final getParticipantList(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->s:Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->getRoomID()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    :goto_0
    move-object v4, v0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    goto :goto_0

    .line 13
    :goto_1
    const/4 v0, 0x2

    .line 14
    .line 15
    const-string v1, "message"

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 21
    move-result v2

    .line 22
    .line 23
    if-nez v2, :cond_2

    .line 24
    :cond_1
    move-object p1, p0

    .line 25
    move-object v5, p2

    .line 26
    goto :goto_2

    .line 27
    .line 28
    :cond_2
    iget-boolean v2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->m:Z

    .line 29
    .line 30
    if-eqz v2, :cond_4

    .line 31
    .line 32
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    const-string v2, "getParticipantList failed, request limit"

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    .line 44
    .line 45
    if-eqz p2, :cond_3

    .line 46
    .line 47
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FREQ_LIMIT:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 51
    move-result p1

    .line 52
    .line 53
    const-string v0, "request limit"

    .line 54
    .line 55
    .line 56
    invoke-interface {p2, p1, v0}, Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 57
    return-void

    .line 58
    :cond_3
    move-object p1, p0

    .line 59
    goto :goto_3

    .line 60
    .line 61
    :cond_4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->r:Lkotlinx/coroutines/m0;

    .line 62
    .line 63
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/U;

    .line 64
    const/4 v6, 0x0

    .line 65
    move-object v2, p0

    .line 66
    move-object v3, p1

    .line 67
    move-object v5, p2

    .line 68
    .line 69
    .line 70
    invoke-direct/range {v1 .. v6}, Lio/trtc/tuikit/atomicxcore/impl/room/U;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 71
    move-object p1, v2

    .line 72
    const/4 v5, 0x3

    .line 73
    const/4 v2, 0x0

    .line 74
    const/4 v3, 0x0

    .line 75
    move-object v4, v1

    .line 76
    move-object v1, v0

    .line 77
    .line 78
    .line 79
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 80
    return-void

    .line 81
    .line 82
    :goto_2
    iget-object p2, p1, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->j:Lio/trtc/tuikit/atomicxcore/impl/room/log/a;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    const-string v2, "getParticipantList failed, not in room"

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/room/log/a;->a(ILjava/lang/String;)V

    .line 94
    .line 95
    if-eqz v5, :cond_5

    .line 96
    .line 97
    sget-object p2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->OPERATION_INVALID_BEFORE_ENTER_ROOM:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 101
    move-result p2

    .line 102
    .line 103
    const-string v0, "not in room"

    .line 104
    .line 105
    .line 106
    invoke-interface {v5, p2, v0}, Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 107
    :cond_5
    :goto_3
    return-void
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
.end method

.method public final getState()Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->B:Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantState;

    .line 3
    return-object v0
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
.end method

.method public final inviteToOpenDevice(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v1, "device"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 14
    .line 15
    .line 16
    invoke-static {p2}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/room/Z;

    .line 20
    .line 21
    .line 22
    invoke-direct {v4, p0, p2, p4, p1}, Lio/trtc/tuikit/atomicxcore/impl/room/Z;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p1, v3, p3, v4}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->openRemoteDeviceByAdmin(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 26
    move-result-object p3

    .line 27
    .line 28
    iget-object p4, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->y:Lio/trtc/tuikit/atomicxcore/impl/room/b;

    .line 29
    .line 30
    .line 31
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    const-string v0, "request"

    .line 43
    .line 44
    .line 45
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    iget-object v1, p4, Lio/trtc/tuikit/atomicxcore/impl/room/b;->e:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    check-cast v1, Lio/trtc/tuikit/atomicxcore/impl/room/V0;

    .line 54
    .line 55
    if-nez v1, :cond_0

    .line 56
    .line 57
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/V0;

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, p1, v2}, Lio/trtc/tuikit/atomicxcore/impl/room/V0;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 65
    .line 66
    :cond_0
    const-string v2, "deviceType"

    .line 67
    .line 68
    .line 69
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    iget-object v0, v1, Lio/trtc/tuikit/atomicxcore/impl/room/V0;->b:Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-interface {v0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    iget-object p2, v1, Lio/trtc/tuikit/atomicxcore/impl/room/V0;->a:Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    const-string/jumbo v1, "userId"

    .line 87
    .line 88
    .line 89
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    const-string v1, "deviceRequests"

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/room/V0;

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/room/V0;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 100
    .line 101
    iget-object p2, p4, Lio/trtc/tuikit/atomicxcore/impl/room/b;->e:Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    .line 104
    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    iget-object p1, p4, Lio/trtc/tuikit/atomicxcore/impl/room/b;->b:Lkotlinx/coroutines/flow/n;

    .line 107
    .line 108
    .line 109
    :cond_1
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 110
    move-result-object p2

    .line 111
    move-object p4, p2

    .line 112
    .line 113
    check-cast p4, Ljava/util/List;

    .line 114
    .line 115
    .line 116
    invoke-static {p3}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;)Lio/trtc/tuikit/atomicxcore/api/room/DeviceRequestInfo;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    .line 120
    invoke-static {p4, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 121
    move-result-object p4

    .line 122
    .line 123
    .line 124
    invoke-interface {p1, p2, p4}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    move-result p2

    .line 126
    .line 127
    if-eqz p2, :cond_1

    .line 128
    return-void
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
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
.end method

.method public final kickUser(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 9
    .line 10
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x6

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p2, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->kickRemoteUserOutOfRoom(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 19
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
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public final muteMicrophone()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->muteLocalAudio()V

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
.end method

.method public final rejectOpenDeviceRequest(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "device"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "userID"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2, v0, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Ljava/lang/String;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 16
    return-void
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
.end method

.method public final removeRoomParticipantListener(Lio/trtc/tuikit/atomicxcore/api/room/RoomParticipantListener;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->u:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->b(Ljava/lang/Object;)V

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

.method public final requestToOpenDevice(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;ILio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "device"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/room/g0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v3, p0, p1, p3}, Lio/trtc/tuikit/atomicxcore/impl/room/g0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/room/k0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceType;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2, p2, v3}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->applyToAdminToOpenLocalDevice(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$MediaDevice;ILcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RequestCallback;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Request;

    .line 20
    move-result-object p2

    .line 21
    .line 22
    iget-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->y:Lio/trtc/tuikit/atomicxcore/impl/room/b;

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    const-string v0, "request"

    .line 34
    .line 35
    .line 36
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    iget-object p3, p3, Lio/trtc/tuikit/atomicxcore/impl/room/b;->c:Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    .line 41
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    return-void
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
.end method

.method public final revokeAdmin(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 9
    .line 10
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->GENERAL_USER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 11
    .line 12
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x6

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, p2, v3, v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->changeUserRole(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 21
    return-void
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

.method public final setAdmin(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 9
    .line 10
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->MANAGER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 11
    .line 12
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x6

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, p2, v3, v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->changeUserRole(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 21
    return-void
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

.method public final transferOwner(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 9
    .line 10
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->ROOM_OWNER:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 11
    .line 12
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x6

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, p2, v3, v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1, v1, v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->changeUserRole(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 21
    return-void
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

.method public final unmuteMicrophone(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 3
    .line 4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x6

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p1, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->unmuteLocalAudio(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

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
.end method

.method public final updateParticipantMetaData(Ljava/lang/String;Ljava/util/HashMap;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "metaData"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 14
    .line 15
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x6

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p3, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->setCustomInfoForUser(Ljava/lang/String;Ljava/util/HashMap;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 24
    return-void
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
.end method

.method public final updateParticipantNameCard(Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "nameCard"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/k0;->a:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 14
    .line 15
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/c;

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x6

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, p3, v2, v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/c;-><init>(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->changeUserNameCard(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 24
    return-void
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
.end method
