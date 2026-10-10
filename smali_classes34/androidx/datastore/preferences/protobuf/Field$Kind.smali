.class public final enum Landroidx/datastore/preferences/protobuf/Field$Kind;
.super Ljava/lang/Enum;
.source "Field.java"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/Internal$EnumLite;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/Field;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Kind"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/datastore/preferences/protobuf/Field$Kind$KindVerifier;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/datastore/preferences/protobuf/Field$Kind;",
        ">;",
        "Landroidx/datastore/preferences/protobuf/Internal$EnumLite;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final enum TYPE_BOOL:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_BOOL_VALUE:I = 0x8

.field public static final enum TYPE_BYTES:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_BYTES_VALUE:I = 0xc

.field public static final enum TYPE_DOUBLE:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_DOUBLE_VALUE:I = 0x1

.field public static final enum TYPE_ENUM:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_ENUM_VALUE:I = 0xe

.field public static final enum TYPE_FIXED32:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_FIXED32_VALUE:I = 0x7

.field public static final enum TYPE_FIXED64:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_FIXED64_VALUE:I = 0x6

.field public static final enum TYPE_FLOAT:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_FLOAT_VALUE:I = 0x2

.field public static final enum TYPE_GROUP:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_GROUP_VALUE:I = 0xa

.field public static final enum TYPE_INT32:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_INT32_VALUE:I = 0x5

.field public static final enum TYPE_INT64:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_INT64_VALUE:I = 0x3

.field public static final enum TYPE_MESSAGE:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_MESSAGE_VALUE:I = 0xb

.field public static final enum TYPE_SFIXED32:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_SFIXED32_VALUE:I = 0xf

.field public static final enum TYPE_SFIXED64:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_SFIXED64_VALUE:I = 0x10

.field public static final enum TYPE_SINT32:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_SINT32_VALUE:I = 0x11

.field public static final enum TYPE_SINT64:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_SINT64_VALUE:I = 0x12

.field public static final enum TYPE_STRING:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_STRING_VALUE:I = 0x9

.field public static final enum TYPE_UINT32:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_UINT32_VALUE:I = 0xd

.field public static final enum TYPE_UINT64:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_UINT64_VALUE:I = 0x4

.field public static final enum TYPE_UNKNOWN:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field public static final TYPE_UNKNOWN_VALUE:I

.field public static final enum UNRECOGNIZED:Landroidx/datastore/preferences/protobuf/Field$Kind;

.field private static final internalValueMap:Landroidx/datastore/preferences/protobuf/Internal$EnumLiteMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/protobuf/Internal$EnumLiteMap<",
            "Landroidx/datastore/preferences/protobuf/Field$Kind;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    .line 2
    new-instance v1, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 3
    .line 4
    const-string v0, "TYPE_UNKNOWN"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, v0, v2, v2}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    sput-object v1, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_UNKNOWN:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 11
    .line 12
    new-instance v2, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 13
    .line 14
    const-string v0, "TYPE_DOUBLE"

    .line 15
    const/4 v3, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v0, v3, v3}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    sput-object v2, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_DOUBLE:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 21
    .line 22
    new-instance v3, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 23
    .line 24
    const-string v0, "TYPE_FLOAT"

    .line 25
    const/4 v4, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v0, v4, v4}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    sput-object v3, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_FLOAT:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 31
    .line 32
    new-instance v4, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 33
    .line 34
    const-string v0, "TYPE_INT64"

    .line 35
    const/4 v5, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v4, v0, v5, v5}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    sput-object v4, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_INT64:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 41
    .line 42
    new-instance v5, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 43
    .line 44
    const-string v0, "TYPE_UINT64"

    .line 45
    const/4 v6, 0x4

    .line 46
    .line 47
    .line 48
    invoke-direct {v5, v0, v6, v6}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    sput-object v5, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_UINT64:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 51
    .line 52
    new-instance v6, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 53
    .line 54
    const-string v0, "TYPE_INT32"

    .line 55
    const/4 v7, 0x5

    .line 56
    .line 57
    .line 58
    invoke-direct {v6, v0, v7, v7}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    sput-object v6, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_INT32:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 61
    .line 62
    new-instance v7, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 63
    .line 64
    const-string v0, "TYPE_FIXED64"

    .line 65
    const/4 v8, 0x6

    .line 66
    .line 67
    .line 68
    invoke-direct {v7, v0, v8, v8}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 69
    .line 70
    sput-object v7, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_FIXED64:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 71
    .line 72
    new-instance v8, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 73
    .line 74
    const-string v0, "TYPE_FIXED32"

    .line 75
    const/4 v9, 0x7

    .line 76
    .line 77
    .line 78
    invoke-direct {v8, v0, v9, v9}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 79
    .line 80
    sput-object v8, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_FIXED32:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 81
    .line 82
    new-instance v9, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 83
    .line 84
    const-string v0, "TYPE_BOOL"

    .line 85
    .line 86
    const/16 v10, 0x8

    .line 87
    .line 88
    .line 89
    invoke-direct {v9, v0, v10, v10}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 90
    .line 91
    sput-object v9, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_BOOL:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 92
    .line 93
    new-instance v10, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 94
    .line 95
    const-string v0, "TYPE_STRING"

    .line 96
    .line 97
    const/16 v11, 0x9

    .line 98
    .line 99
    .line 100
    invoke-direct {v10, v0, v11, v11}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 101
    .line 102
    sput-object v10, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_STRING:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 103
    .line 104
    new-instance v11, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 105
    .line 106
    const-string v0, "TYPE_GROUP"

    .line 107
    .line 108
    const/16 v12, 0xa

    .line 109
    .line 110
    .line 111
    invoke-direct {v11, v0, v12, v12}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 112
    .line 113
    sput-object v11, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_GROUP:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 114
    .line 115
    new-instance v12, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 116
    .line 117
    const-string v0, "TYPE_MESSAGE"

    .line 118
    .line 119
    const/16 v13, 0xb

    .line 120
    .line 121
    .line 122
    invoke-direct {v12, v0, v13, v13}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 123
    .line 124
    sput-object v12, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_MESSAGE:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 125
    .line 126
    new-instance v13, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 127
    .line 128
    const-string v0, "TYPE_BYTES"

    .line 129
    .line 130
    const/16 v14, 0xc

    .line 131
    .line 132
    .line 133
    invoke-direct {v13, v0, v14, v14}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 134
    .line 135
    sput-object v13, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_BYTES:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 136
    .line 137
    new-instance v14, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 138
    .line 139
    const-string v0, "TYPE_UINT32"

    .line 140
    .line 141
    const/16 v15, 0xd

    .line 142
    .line 143
    .line 144
    invoke-direct {v14, v0, v15, v15}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 145
    .line 146
    sput-object v14, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_UINT32:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 147
    .line 148
    new-instance v15, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 149
    .line 150
    const-string v0, "TYPE_ENUM"

    .line 151
    .line 152
    move-object/from16 v16, v1

    .line 153
    .line 154
    const/16 v1, 0xe

    .line 155
    .line 156
    .line 157
    invoke-direct {v15, v0, v1, v1}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 158
    .line 159
    sput-object v15, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_ENUM:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 160
    .line 161
    new-instance v0, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 162
    .line 163
    const-string v1, "TYPE_SFIXED32"

    .line 164
    .line 165
    move-object/from16 v17, v2

    .line 166
    .line 167
    const/16 v2, 0xf

    .line 168
    .line 169
    .line 170
    invoke-direct {v0, v1, v2, v2}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 171
    .line 172
    sput-object v0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_SFIXED32:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 173
    .line 174
    new-instance v1, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 175
    .line 176
    const-string v2, "TYPE_SFIXED64"

    .line 177
    .line 178
    move-object/from16 v18, v0

    .line 179
    .line 180
    const/16 v0, 0x10

    .line 181
    .line 182
    .line 183
    invoke-direct {v1, v2, v0, v0}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 184
    .line 185
    sput-object v1, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_SFIXED64:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 186
    .line 187
    new-instance v0, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 188
    .line 189
    const-string v2, "TYPE_SINT32"

    .line 190
    .line 191
    move-object/from16 v19, v1

    .line 192
    .line 193
    const/16 v1, 0x11

    .line 194
    .line 195
    .line 196
    invoke-direct {v0, v2, v1, v1}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 197
    .line 198
    sput-object v0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_SINT32:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 199
    .line 200
    new-instance v1, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 201
    .line 202
    const-string v2, "TYPE_SINT64"

    .line 203
    .line 204
    move-object/from16 v20, v0

    .line 205
    .line 206
    const/16 v0, 0x12

    .line 207
    .line 208
    .line 209
    invoke-direct {v1, v2, v0, v0}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 210
    .line 211
    sput-object v1, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_SINT64:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 212
    .line 213
    new-instance v0, Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 214
    .line 215
    const/16 v2, 0x13

    .line 216
    .line 217
    move-object/from16 v21, v1

    .line 218
    const/4 v1, -0x1

    .line 219
    .line 220
    move-object/from16 v22, v3

    .line 221
    .line 222
    const-string v3, "UNRECOGNIZED"

    .line 223
    .line 224
    .line 225
    invoke-direct {v0, v3, v2, v1}, Landroidx/datastore/preferences/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    .line 226
    .line 227
    sput-object v0, Landroidx/datastore/preferences/protobuf/Field$Kind;->UNRECOGNIZED:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 228
    .line 229
    move-object/from16 v1, v16

    .line 230
    .line 231
    move-object/from16 v2, v17

    .line 232
    .line 233
    move-object/from16 v16, v18

    .line 234
    .line 235
    move-object/from16 v17, v19

    .line 236
    .line 237
    move-object/from16 v18, v20

    .line 238
    .line 239
    move-object/from16 v19, v21

    .line 240
    .line 241
    move-object/from16 v3, v22

    .line 242
    .line 243
    move-object/from16 v20, v0

    .line 244
    .line 245
    .line 246
    filled-new-array/range {v1 .. v20}, [Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 247
    move-result-object v0

    .line 248
    .line 249
    sput-object v0, Landroidx/datastore/preferences/protobuf/Field$Kind;->$VALUES:[Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 250
    .line 251
    new-instance v0, Landroidx/datastore/preferences/protobuf/Field$Kind$1;

    .line 252
    .line 253
    .line 254
    invoke-direct {v0}, Landroidx/datastore/preferences/protobuf/Field$Kind$1;-><init>()V

    .line 255
    .line 256
    sput-object v0, Landroidx/datastore/preferences/protobuf/Field$Kind;->internalValueMap:Landroidx/datastore/preferences/protobuf/Internal$EnumLiteMap;

    .line 257
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 4
    .line 5
    iput p3, p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->value:I

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
.end method

.method public static forNumber(I)Landroidx/datastore/preferences/protobuf/Field$Kind;
    .locals 0

    .line 1
    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0

    .line 6
    .line 7
    :pswitch_0
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_SINT64:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 8
    return-object p0

    .line 9
    .line 10
    :pswitch_1
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_SINT32:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 11
    return-object p0

    .line 12
    .line 13
    :pswitch_2
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_SFIXED64:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 14
    return-object p0

    .line 15
    .line 16
    :pswitch_3
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_SFIXED32:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 17
    return-object p0

    .line 18
    .line 19
    :pswitch_4
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_ENUM:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 20
    return-object p0

    .line 21
    .line 22
    :pswitch_5
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_UINT32:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 23
    return-object p0

    .line 24
    .line 25
    :pswitch_6
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_BYTES:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 26
    return-object p0

    .line 27
    .line 28
    :pswitch_7
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_MESSAGE:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 29
    return-object p0

    .line 30
    .line 31
    :pswitch_8
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_GROUP:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 32
    return-object p0

    .line 33
    .line 34
    :pswitch_9
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_STRING:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 35
    return-object p0

    .line 36
    .line 37
    :pswitch_a
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_BOOL:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 38
    return-object p0

    .line 39
    .line 40
    :pswitch_b
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_FIXED32:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 41
    return-object p0

    .line 42
    .line 43
    :pswitch_c
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_FIXED64:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 44
    return-object p0

    .line 45
    .line 46
    :pswitch_d
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_INT32:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 47
    return-object p0

    .line 48
    .line 49
    :pswitch_e
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_UINT64:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 50
    return-object p0

    .line 51
    .line 52
    :pswitch_f
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_INT64:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 53
    return-object p0

    .line 54
    .line 55
    :pswitch_10
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_FLOAT:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 56
    return-object p0

    .line 57
    .line 58
    :pswitch_11
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_DOUBLE:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 59
    return-object p0

    .line 60
    .line 61
    :pswitch_12
    sget-object p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->TYPE_UNKNOWN:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 62
    return-object p0

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static internalGetValueMap()Landroidx/datastore/preferences/protobuf/Internal$EnumLiteMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/datastore/preferences/protobuf/Internal$EnumLiteMap<",
            "Landroidx/datastore/preferences/protobuf/Field$Kind;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Landroidx/datastore/preferences/protobuf/Field$Kind;->internalValueMap:Landroidx/datastore/preferences/protobuf/Internal$EnumLiteMap;

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
.end method

.method public static internalGetVerifier()Landroidx/datastore/preferences/protobuf/Internal$EnumVerifier;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Landroidx/datastore/preferences/protobuf/Field$Kind$KindVerifier;->INSTANCE:Landroidx/datastore/preferences/protobuf/Internal$EnumVerifier;

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
.end method

.method public static valueOf(I)Landroidx/datastore/preferences/protobuf/Field$Kind;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/Field$Kind;->forNumber(I)Landroidx/datastore/preferences/protobuf/Field$Kind;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/datastore/preferences/protobuf/Field$Kind;
    .locals 1

    .line 1
    const-class v0, Landroidx/datastore/preferences/protobuf/Field$Kind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/Field$Kind;

    return-object p0
.end method

.method public static values()[Landroidx/datastore/preferences/protobuf/Field$Kind;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Landroidx/datastore/preferences/protobuf/Field$Kind;->$VALUES:[Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Landroidx/datastore/preferences/protobuf/Field$Kind;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 9
    return-object v0
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


# virtual methods
.method public final getNumber()I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Landroidx/datastore/preferences/protobuf/Field$Kind;->UNRECOGNIZED:Landroidx/datastore/preferences/protobuf/Field$Kind;

    .line 3
    .line 4
    if-eq p0, v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Landroidx/datastore/preferences/protobuf/Field$Kind;->value:I

    .line 7
    return v0

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v1, "Can\'t get the number of an unknown enum value."

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    throw v0
    .line 16
    .line 17
    .line 18
.end method
