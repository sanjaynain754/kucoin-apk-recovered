.class public final Lio/trtc/tuikit/atomicxcore/impl/contact/G0;
.super Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingStore;
.source "SourceFile"


# static fields
.field public static final synthetic C:I


# instance fields
.field public volatile A:Lio/trtc/tuikit/atomicxcore/impl/contact/n0;

.field public volatile B:Lio/trtc/tuikit/atomicxcore/impl/contact/j0;

.field public final a:Ljava/lang/String;

.field public final b:Lkotlinx/coroutines/m0;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/n;

.field public final e:Lkotlinx/coroutines/flow/n;

.field public final f:Lkotlinx/coroutines/flow/n;

.field public final g:Lkotlinx/coroutines/flow/n;

.field public final h:Lkotlinx/coroutines/flow/n;

.field public final i:Lkotlinx/coroutines/flow/n;

.field public final j:Lkotlinx/coroutines/flow/n;

.field public final k:Lkotlinx/coroutines/flow/n;

.field public final l:Lkotlinx/coroutines/flow/n;

.field public final m:Lkotlinx/coroutines/flow/n;

.field public final n:Lkotlinx/coroutines/flow/n;

.field public final o:Lkotlinx/coroutines/flow/n;

.field public final p:Lkotlinx/coroutines/flow/n;

.field public final q:Lkotlinx/coroutines/flow/n;

.field public final r:Lkotlinx/coroutines/flow/n;

.field public final s:Lkotlinx/coroutines/flow/n;

.field public final t:Lkotlinx/coroutines/flow/n;

.field public u:J

.field public v:Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;

.field public w:Lcom/tencent/imsdk/v2/V2TIMGroupInfo;

.field public final x:Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingState;

.field public volatile y:Lio/trtc/tuikit/atomicxcore/impl/contact/V;

.field public volatile z:Lio/trtc/tuikit/atomicxcore/impl/common/u;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 38

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "groupID"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct/range {p0 .. p1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingStore;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-static {v1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 25
    .line 26
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;->WORK:Lio/trtc/tuikit/atomicxcore/api/contact/GroupType;

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->c:Lkotlinx/coroutines/flow/n;

    .line 33
    .line 34
    const-string v2, ""

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    iput-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->d:Lkotlinx/coroutines/flow/n;

    .line 41
    .line 42
    .line 43
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    iput-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->e:Lkotlinx/coroutines/flow/n;

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    iput-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->f:Lkotlinx/coroutines/flow/n;

    .line 53
    .line 54
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    invoke-static {v5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 58
    move-result-object v6

    .line 59
    .line 60
    iput-object v6, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->g:Lkotlinx/coroutines/flow/n;

    .line 61
    .line 62
    .line 63
    invoke-static {v5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 64
    move-result-object v7

    .line 65
    .line 66
    iput-object v7, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->h:Lkotlinx/coroutines/flow/n;

    .line 67
    .line 68
    .line 69
    invoke-static {v5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 70
    move-result-object v8

    .line 71
    .line 72
    iput-object v8, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->i:Lkotlinx/coroutines/flow/n;

    .line 73
    const/4 v9, 0x0

    .line 74
    .line 75
    .line 76
    invoke-static {v9}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 77
    move-result-object v10

    .line 78
    .line 79
    iput-object v10, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->j:Lkotlinx/coroutines/flow/n;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 83
    move-result-object v11

    .line 84
    .line 85
    .line 86
    invoke-static {v11}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 87
    move-result-object v11

    .line 88
    .line 89
    iput-object v11, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->k:Lkotlinx/coroutines/flow/n;

    .line 90
    .line 91
    sget-object v12, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;->MEMBER:Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;

    .line 92
    .line 93
    .line 94
    invoke-static {v12}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 95
    move-result-object v12

    .line 96
    .line 97
    iput-object v12, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->l:Lkotlinx/coroutines/flow/n;

    .line 98
    .line 99
    .line 100
    invoke-static {v9}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 101
    move-result-object v9

    .line 102
    .line 103
    iput-object v9, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->m:Lkotlinx/coroutines/flow/n;

    .line 104
    const/4 v13, 0x0

    .line 105
    .line 106
    .line 107
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    move-result-object v13

    .line 109
    .line 110
    .line 111
    invoke-static {v13}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 112
    move-result-object v13

    .line 113
    .line 114
    iput-object v13, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->n:Lkotlinx/coroutines/flow/n;

    .line 115
    .line 116
    sget-object v14, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->FORBID:Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;

    .line 117
    .line 118
    .line 119
    invoke-static {v14}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 120
    move-result-object v15

    .line 121
    .line 122
    iput-object v15, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->o:Lkotlinx/coroutines/flow/n;

    .line 123
    .line 124
    .line 125
    invoke-static {v14}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 126
    move-result-object v14

    .line 127
    .line 128
    iput-object v14, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->p:Lkotlinx/coroutines/flow/n;

    .line 129
    .line 130
    .line 131
    invoke-static {v5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 132
    move-result-object v5

    .line 133
    .line 134
    iput-object v5, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->q:Lkotlinx/coroutines/flow/n;

    .line 135
    .line 136
    .line 137
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 138
    move-result-object v16

    .line 139
    .line 140
    move-object/from16 p1, v1

    .line 141
    .line 142
    .line 143
    invoke-static/range {v16 .. v16}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 144
    move-result-object v1

    .line 145
    .line 146
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->r:Lkotlinx/coroutines/flow/n;

    .line 147
    .line 148
    sget-object v16, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->RECEIVE:Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;

    .line 149
    .line 150
    move-object/from16 v17, v1

    .line 151
    .line 152
    .line 153
    invoke-static/range {v16 .. v16}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 154
    move-result-object v1

    .line 155
    .line 156
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->s:Lkotlinx/coroutines/flow/n;

    .line 157
    .line 158
    .line 159
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 160
    move-result-object v16

    .line 161
    .line 162
    move-object/from16 v18, v1

    .line 163
    .line 164
    .line 165
    invoke-static/range {v16 .. v16}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 166
    move-result-object v1

    .line 167
    .line 168
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->t:Lkotlinx/coroutines/flow/n;

    .line 169
    .line 170
    move-object/from16 v16, v1

    .line 171
    .line 172
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;->ALL:Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;

    .line 173
    .line 174
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->v:Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;

    .line 175
    .line 176
    .line 177
    invoke-static/range {p1 .. p1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 178
    move-result-object v20

    .line 179
    .line 180
    .line 181
    invoke-static {v3}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 182
    move-result-object v21

    .line 183
    .line 184
    .line 185
    invoke-static {v4}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 186
    move-result-object v22

    .line 187
    .line 188
    .line 189
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 190
    move-result-object v23

    .line 191
    .line 192
    .line 193
    invoke-static {v6}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 194
    move-result-object v24

    .line 195
    .line 196
    .line 197
    invoke-static {v7}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 198
    move-result-object v25

    .line 199
    .line 200
    .line 201
    invoke-static {v8}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 202
    move-result-object v26

    .line 203
    .line 204
    .line 205
    invoke-static {v10}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 206
    move-result-object v27

    .line 207
    .line 208
    .line 209
    invoke-static {v11}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 210
    move-result-object v28

    .line 211
    .line 212
    .line 213
    invoke-static {v12}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 214
    move-result-object v30

    .line 215
    .line 216
    .line 217
    invoke-static {v9}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 218
    move-result-object v31

    .line 219
    .line 220
    .line 221
    invoke-static {v13}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 222
    move-result-object v32

    .line 223
    .line 224
    .line 225
    invoke-static {v15}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 226
    move-result-object v33

    .line 227
    .line 228
    .line 229
    invoke-static {v14}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 230
    move-result-object v34

    .line 231
    .line 232
    .line 233
    invoke-static {v5}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 234
    move-result-object v35

    .line 235
    .line 236
    .line 237
    invoke-static/range {v17 .. v17}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 238
    move-result-object v36

    .line 239
    .line 240
    .line 241
    invoke-static/range {v18 .. v18}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 242
    move-result-object v37

    .line 243
    .line 244
    .line 245
    invoke-static/range {v16 .. v16}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 246
    move-result-object v29

    .line 247
    .line 248
    new-instance v19, Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingState;

    .line 249
    .line 250
    .line 251
    invoke-direct/range {v19 .. v37}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingState;-><init>(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V

    .line 252
    .line 253
    move-object/from16 v1, v19

    .line 254
    .line 255
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->x:Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingState;

    .line 256
    .line 257
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/V;

    .line 258
    .line 259
    .line 260
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/V;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;)V

    .line 261
    .line 262
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->y:Lio/trtc/tuikit/atomicxcore/impl/contact/V;

    .line 263
    .line 264
    new-instance v1, Ldg0/a;

    .line 265
    .line 266
    .line 267
    invoke-direct {v1, v0}, Ldg0/a;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;)V

    .line 268
    .line 269
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->z:Lio/trtc/tuikit/atomicxcore/impl/common/u;

    .line 270
    .line 271
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/n0;

    .line 272
    .line 273
    .line 274
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/n0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;)V

    .line 275
    .line 276
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->A:Lio/trtc/tuikit/atomicxcore/impl/contact/n0;

    .line 277
    .line 278
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/j0;

    .line 279
    .line 280
    .line 281
    invoke-direct {v1, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/j0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;)V

    .line 282
    .line 283
    iput-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->B:Lio/trtc/tuikit/atomicxcore/impl/contact/j0;

    .line 284
    .line 285
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/x;

    .line 286
    .line 287
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->B:Lio/trtc/tuikit/atomicxcore/impl/contact/j0;

    .line 288
    .line 289
    .line 290
    invoke-direct {v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/x;-><init>(Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;)V

    .line 291
    .line 292
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/y;

    .line 293
    .line 294
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->A:Lio/trtc/tuikit/atomicxcore/impl/contact/n0;

    .line 295
    .line 296
    .line 297
    invoke-direct {v2, v3}, Lio/trtc/tuikit/atomicxcore/impl/common/y;-><init>(Lcom/tencent/imsdk/v2/V2TIMGroupListener;)V

    .line 298
    .line 299
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/common/w;

    .line 300
    .line 301
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->y:Lio/trtc/tuikit/atomicxcore/impl/contact/V;

    .line 302
    .line 303
    .line 304
    invoke-direct {v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/common/w;-><init>(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    .line 305
    .line 306
    .line 307
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 308
    move-result-object v4

    .line 309
    .line 310
    .line 311
    invoke-virtual {v4, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->addGroupListener(Lcom/tencent/imsdk/v2/V2TIMGroupListener;)V

    .line 312
    .line 313
    .line 314
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 315
    move-result-object v2

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v3}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->addConversationListener(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    .line 319
    .line 320
    .line 321
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getFriendshipManager()Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;

    .line 322
    move-result-object v2

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v1}, Lcom/tencent/imsdk/v2/V2TIMFriendshipManager;->addFriendListener(Lcom/tencent/imsdk/v2/V2TIMFriendshipListener;)V

    .line 326
    .line 327
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 328
    .line 329
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->z:Lio/trtc/tuikit/atomicxcore/impl/common/u;

    .line 330
    .line 331
    const-string v2, "onConversationMutedChanged"

    .line 332
    .line 333
    .line 334
    invoke-static {v2, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/t;->a(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/u;)V

    .line 335
    return-void
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

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;)Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;
    .locals 10

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;

    .line 22
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getUserID()Ljava/lang/String;

    move-result-object v1

    const-string p0, "getUserID(...)"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getNickName()Ljava/lang/String;

    move-result-object v2

    .line 24
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getFaceUrl()Ljava/lang/String;

    move-result-object v3

    .line 25
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberInfo;->getNameCard()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    .line 26
    invoke-direct/range {v0 .. v9}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 27
    instance-of p0, p1, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;

    if-eqz p0, :cond_0

    .line 28
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;->Companion:Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole$Companion;

    check-cast p1, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;

    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;->getRole()I

    move-result v1

    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole$Companion;->parse(I)Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;

    move-result-object p0

    invoke-virtual {v0, p0}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;->setRole(Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;)V

    .line 29
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;->getMuteUntil()J

    move-result-wide p0

    invoke-virtual {v0, p0, p1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;->setMuteUntil(J)V

    :cond_0
    return-object v0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;Lio/trtc/tuikit/atomicxcore/impl/contact/q0;)Ljava/lang/Object;
    .locals 3

    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 101
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 102
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;

    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;-><init>()V

    .line 103
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 104
    invoke-virtual {v1, p0}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setGroupID(Ljava/lang/String;)V

    .line 105
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->getValue()I

    move-result p0

    invoke-virtual {v1, p0}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setGroupApproveOpt(I)V

    .line 106
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object p0

    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/contact/r0;

    invoke-direct {p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/r0;-><init>(Lkotlinx/coroutines/o;)V

    invoke-virtual {p0, v1, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->setGroupInfo(Lcom/tencent/imsdk/v2/V2TIMGroupInfo;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 107
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 108
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 109
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;Lio/trtc/tuikit/atomicxcore/impl/contact/s0;)Ljava/lang/Object;
    .locals 3

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 112
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 113
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;

    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;-><init>()V

    .line 114
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 115
    invoke-virtual {v1, p0}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setGroupID(Ljava/lang/String;)V

    .line 116
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;->getValue()I

    move-result p0

    invoke-virtual {v1, p0}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setGroupAddOpt(I)V

    .line 117
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object p0

    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/contact/t0;

    invoke-direct {p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/t0;-><init>(Lkotlinx/coroutines/o;)V

    invoke-virtual {p0, v1, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->setGroupInfo(Lcom/tencent/imsdk/v2/V2TIMGroupInfo;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 118
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 119
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 120
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;JLkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 6

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/contact/P;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v1, 0x3

    const/4 v2, 0x4

    if-eq p1, v1, :cond_3

    if-ne p1, v2, :cond_1

    const/4 v1, 0x0

    :cond_0
    move v2, v1

    goto :goto_0

    .line 66
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    move v2, v0

    .line 67
    :cond_3
    :goto_0
    new-instance p1, Lkotlinx/coroutines/o;

    invoke-static {p4}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-direct {p1, v1, v0}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 68
    invoke-virtual {p1}, Lkotlinx/coroutines/o;->E()V

    .line 69
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object v0

    .line 70
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 71
    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/contact/e0;

    invoke-direct {v5, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/contact/e0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lkotlinx/coroutines/o;)V

    move-wide v3, p2

    .line 72
    invoke-virtual/range {v0 .. v5}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->getGroupMemberList(Ljava/lang/String;IJLcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 73
    invoke-virtual {p1}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 74
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_4
    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;Lio/trtc/tuikit/atomicxcore/impl/contact/A0;)Ljava/lang/Object;
    .locals 5

    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 150
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 151
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getMessageManager()Lcom/tencent/imsdk/v2/V2TIMMessageManager;

    move-result-object v1

    .line 152
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 153
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;->getValue()I

    move-result v3

    .line 154
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/contact/B0;

    invoke-direct {v4, p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/B0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;Lkotlinx/coroutines/o;)V

    .line 155
    invoke-virtual {v1, v2, v3, v4}, Lcom/tencent/imsdk/v2/V2TIMMessageManager;->setGroupReceiveMessageOpt(Ljava/lang/String;ILcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 156
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 157
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 158
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/impl/contact/Y;)Ljava/lang/Object;
    .locals 3

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 47
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 48
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v1

    .line 49
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 50
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/Z;

    invoke-direct {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/Z;-><init>(Lkotlinx/coroutines/o;)V

    invoke-virtual {v1, p0, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->dismissGroup(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 51
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 52
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 53
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/impl/contact/o0;)Ljava/lang/Object;
    .locals 3

    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p1}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 92
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 93
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object v1

    .line 94
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 95
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/p0;

    invoke-direct {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/p0;-><init>(Lkotlinx/coroutines/o;)V

    invoke-virtual {v1, p0, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->quitGroup(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 96
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 97
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 98
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/lang/String;JLio/trtc/tuikit/atomicxcore/impl/contact/u0;)Ljava/lang/Object;
    .locals 3

    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p4}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 123
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 124
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object v1

    .line 125
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    long-to-int p2, p2

    .line 126
    new-instance p3, Lio/trtc/tuikit/atomicxcore/impl/contact/v0;

    invoke-direct {p3, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/v0;-><init>(Lkotlinx/coroutines/o;)V

    invoke-virtual {v1, p0, p1, p2, p3}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->muteGroupMember(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 127
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 128
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 129
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;Lio/trtc/tuikit/atomicxcore/impl/contact/w0;)Ljava/lang/Object;
    .locals 3

    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p3}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 132
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 133
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object v1

    .line 134
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 135
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;->getValue()I

    move-result p2

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/x0;

    invoke-direct {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/x0;-><init>(Lkotlinx/coroutines/o;)V

    invoke-virtual {v1, p0, p1, p2, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->setGroupMemberRole(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 136
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 137
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 138
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/contact/C0;)Ljava/lang/Object;
    .locals 3

    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 161
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 162
    new-instance v1, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;

    invoke-direct {v1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;-><init>()V

    .line 163
    invoke-static {p0}, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;->setUserID(Ljava/lang/String;)V

    .line 164
    invoke-virtual {v1, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;->setNameCard(Ljava/lang/String;)V

    .line 165
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object p1

    .line 166
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 167
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/D0;

    invoke-direct {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/D0;-><init>(Lkotlinx/coroutines/o;)V

    invoke-virtual {p1, p0, v1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->setGroupMemberInfo(Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMGroupMemberFullInfo;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 168
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 169
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 170
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/contact/T;)Ljava/lang/Object;
    .locals 3

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 13
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 14
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object v1

    .line 15
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 16
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/U;

    invoke-direct {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/U;-><init>(Lkotlinx/coroutines/o;)V

    invoke-virtual {v1, p0, p1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->transferGroupOwner(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 17
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 18
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 19
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/contact/E0;)Ljava/lang/Object;
    .locals 8

    .line 171
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    new-instance v6, Lkotlinx/coroutines/o;

    invoke-static {p4}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v6, v0, v1}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 173
    invoke-virtual {v6}, Lkotlinx/coroutines/o;->E()V

    .line 174
    new-instance v3, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;

    invoke-direct {v3}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;-><init>()V

    .line 175
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 176
    invoke-virtual {v3, v0}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setGroupID(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 177
    invoke-virtual {v3, p1}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setGroupName(Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    .line 178
    invoke-virtual {v3, p2}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setNotification(Ljava/lang/String;)V

    :cond_1
    if-eqz p3, :cond_2

    .line 179
    invoke-virtual {v3, p3}, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;->setFaceUrl(Ljava/lang/String;)V

    .line 180
    :cond_2
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object v7

    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/contact/F0;

    move-object v2, p0

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, Lio/trtc/tuikit/atomicxcore/impl/contact/F0;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lcom/tencent/imsdk/v2/V2TIMGroupInfo;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/o;)V

    invoke-virtual {v7, v3, v0}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->setGroupInfo(Lcom/tencent/imsdk/v2/V2TIMGroupInfo;Lcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 181
    invoke-virtual {v6}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 182
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    return-object p0

    .line 183
    :cond_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/impl/contact/Q;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 4
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object v1

    .line 5
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 6
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/S;

    invoke-direct {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/S;-><init>(Lkotlinx/coroutines/o;)V

    .line 7
    invoke-virtual {v1, p0, p1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->inviteUserToGroup(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 8
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 9
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 10
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/impl/contact/W;)Ljava/lang/Object;
    .locals 9

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 32
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 33
    new-instance v5, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 35
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;

    .line 36
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/contact/GroupMember;->getUserID()Ljava/lang/String;

    move-result-object v1

    .line 37
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 38
    :cond_0
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object v3

    .line 39
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 40
    new-instance v8, Lio/trtc/tuikit/atomicxcore/impl/contact/X;

    invoke-direct {v8, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/X;-><init>(Lkotlinx/coroutines/o;)V

    .line 41
    const-string v6, ""

    const/4 v7, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->kickGroupMember(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 42
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 43
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    .line 44
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/impl/contact/a0;)Ljava/lang/Object;
    .locals 4

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 56
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 57
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object v1

    .line 58
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 59
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/b0;

    invoke-direct {v3, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/b0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lkotlinx/coroutines/o;)V

    .line 60
    invoke-virtual {v1, v2, p1, v3}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->getGroupAttributes(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 61
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 62
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 63
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/impl/contact/f0;)Ljava/lang/Object;
    .locals 4

    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 77
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 78
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 79
    sget-object p0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 80
    new-instance p0, Lio/trtc/tuikit/atomicxcore/impl/common/e;

    const/16 p1, 0x1781

    const-string/jumbo v1, "userIDList is empty"

    invoke-direct {p0, p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/e;-><init>(ILjava/lang/String;)V

    invoke-static {p0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Lkotlinx/coroutines/o;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    .line 81
    :cond_0
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object v1

    .line 82
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 83
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/g0;

    invoke-direct {v3, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/g0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lkotlinx/coroutines/o;)V

    .line 84
    invoke-virtual {v1, v2, p1, v3}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->getGroupMembersInfo(Ljava/lang/String;Ljava/util/List;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 85
    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 86
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    .line 87
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;ZLio/trtc/tuikit/atomicxcore/impl/contact/y0;)Ljava/lang/Object;
    .locals 3

    .line 139
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    new-instance v0, Lkotlinx/coroutines/o;

    invoke-static {p2}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 141
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->E()V

    .line 142
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getGroupManager()Lcom/tencent/imsdk/v2/V2TIMGroupManager;

    move-result-object v1

    .line 143
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 144
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/z0;

    invoke-direct {v2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/z0;-><init>(Lkotlinx/coroutines/o;)V

    invoke-virtual {v1, p0, p1, v2}, Lcom/tencent/imsdk/v2/V2TIMGroupManager;->muteAllGroupMembers(Ljava/lang/String;ZLcom/tencent/imsdk/v2/V2TIMCallback;)V

    .line 145
    invoke-virtual {v0}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p0

    .line 146
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_0
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    .line 147
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;)Ljava/lang/String;
    .locals 0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    move-result-object p0

    invoke-virtual {p0}, Lcom/tencent/imsdk/v2/V2TIMManager;->getLoginUser()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "data"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    instance-of p1, p2, Ljava/util/Map;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    check-cast p2, Ljava/util/Map;

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    if-nez p2, :cond_1

    goto :goto_2

    .line 185
    :cond_1
    const-string p1, "conversationID"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_2

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object p1, v0

    :goto_1
    if-nez p1, :cond_3

    goto :goto_2

    .line 186
    :cond_3
    const-string v1, "mute"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    instance-of v1, p2, Ljava/lang/Boolean;

    if-eqz v1, :cond_4

    move-object v0, p2

    check-cast v0, Ljava/lang/Boolean;

    :cond_4
    if-eqz v0, :cond_5

    .line 187
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "group_"

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

    .line 189
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 190
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 191
    iget-object p0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->g:Lkotlinx/coroutines/flow/n;

    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public static b(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/c0;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, v1, v1}, Lio/trtc/tuikit/atomicxcore/impl/contact/c0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final addGroupMember(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userIDList"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 9
    .line 10
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/contact/Q;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v4, p0, p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/Q;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public final changeGroupOwner(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "newOwnerID"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 8
    .line 9
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/contact/T;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v4, p0, p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/T;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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

.method public final deleteGroupMember(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "groupMembers"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 8
    .line 9
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/contact/W;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v4, p0, p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/W;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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

.method public final dismissGroup(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/Y;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/contact/Y;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final fetchGroupAttributes(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/a0;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, p1, p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/contact/a0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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

.method public final fetchGroupInfo(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/common/d;->h:Lio/trtc/tuikit/atomicxcore/impl/common/d;

    .line 3
    .line 4
    const-string v1, "componentType"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v0, Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 13
    .line 14
    const/16 v1, 0x3f0

    .line 15
    int-to-long v1, v1

    .line 16
    .line 17
    const-string v3, "UIComponentType"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    const-string/jumbo v1, "toString(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getInstance()Lcom/tencent/imsdk/v2/V2TIMManager;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/common/m;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2}, Lio/trtc/tuikit/atomicxcore/impl/common/m;-><init>()V

    .line 40
    .line 41
    const-string v3, "reportTUIFeatureUsage"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v3, v0, v2}, Lcom/tencent/imsdk/v2/V2TIMManager;->callExperimentalAPI(Ljava/lang/String;Ljava/lang/Object;Lcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 45
    .line 46
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 47
    .line 48
    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/contact/c0;

    .line 49
    const/4 v0, 0x0

    .line 50
    .line 51
    .line 52
    invoke-direct {v7, p0, p1, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/c0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 53
    const/4 v8, 0x3

    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 60
    return-void
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
.end method

.method public final fetchGroupMemberList(Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "role"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 8
    .line 9
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/contact/d0;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v4, p0, p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/d0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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

.method public final fetchGroupMembersInfo(Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userIDList"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 9
    .line 10
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/contact/f0;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v4, p0, p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/f0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/util/List;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 15
    const/4 v5, 0x3

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
.end method

.method public final fetchMoreGroupMemberList(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/h0;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/contact/h0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final fetchSelfMemberInfo(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/i0;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/contact/i0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final getGroupID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->a:Ljava/lang/String;

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

.method public final getGroupSettingState()Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingState;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->x:Lio/trtc/tuikit/atomicxcore/api/contact/GroupSettingState;

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

.method public final quitGroup(Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/o0;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/contact/o0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setGroupInviteOption(Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "option"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 8
    .line 9
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/contact/q0;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v4, p0, p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/q0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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

.method public final setGroupJoinOption(Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "option"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 8
    .line 9
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/contact/s0;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v4, p0, p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/s0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/contact/GroupJoinOption;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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

.method public final setGroupMemberMuteTime(Ljava/lang/String;JLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 9

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
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 9
    .line 10
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/u0;

    .line 11
    const/4 v8, 0x0

    .line 12
    move-object v3, p0

    .line 13
    move-object v4, p1

    .line 14
    move-wide v5, p2

    .line 15
    move-object v7, p4

    .line 16
    .line 17
    .line 18
    invoke-direct/range {v2 .. v8}, Lio/trtc/tuikit/atomicxcore/impl/contact/u0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/lang/String;JLio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v4, v2

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 27
    return-void
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

.method public final setGroupMemberRole(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 8

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
    const-string v0, "role"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 14
    .line 15
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/contact/w0;

    .line 16
    const/4 v7, 0x0

    .line 17
    move-object v3, p0

    .line 18
    move-object v4, p1

    .line 19
    move-object v5, p2

    .line 20
    move-object v6, p3

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v2 .. v7}, Lio/trtc/tuikit/atomicxcore/impl/contact/w0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/contact/GroupMemberRole;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 24
    const/4 v5, 0x3

    .line 25
    const/4 v6, 0x0

    .line 26
    move-object v4, v2

    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 32
    return-void
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

.method public final setMuteAllMembers(ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/y0;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, p1, p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/contact/y0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;ZLio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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

.method public final setReceiveMessageOpt(Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 7

    .line 1
    .line 2
    const-string v0, "opt"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 8
    .line 9
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/contact/A0;

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-direct {v4, p0, p1, p2, v0}, Lio/trtc/tuikit/atomicxcore/impl/contact/A0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Lio/trtc/tuikit/atomicxcore/api/contact/ReceiveMessageOpt;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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

.method public final setSelfGroupNameCard(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/contact/C0;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, p1, p2, v1}, Lio/trtc/tuikit/atomicxcore/impl/contact/C0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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

.method public final updateGroupProfile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/contact/G0;->b:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/contact/E0;

    .line 5
    const/4 v7, 0x0

    .line 6
    move-object v2, p0

    .line 7
    move-object v3, p1

    .line 8
    move-object v4, p2

    .line 9
    move-object v5, p3

    .line 10
    move-object v6, p4

    .line 11
    .line 12
    .line 13
    invoke-direct/range {v1 .. v7}, Lio/trtc/tuikit/atomicxcore/impl/contact/E0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/contact/G0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;Lkotlin/coroutines/Continuation;)V

    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x0

    .line 16
    move-object v3, v1

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

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
