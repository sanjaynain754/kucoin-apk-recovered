.class public final enum Lshark/HprofRecordTag;
.super Ljava/lang/Enum;
.source "HprofRecordTag.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lshark/HprofRecordTag$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lshark/HprofRecordTag;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008)\u0008\u0086\u0001\u0018\u0000 +2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&j\u0002\u0008\'j\u0002\u0008(j\u0002\u0008)j\u0002\u0008*\u00a8\u0006,"
    }
    d2 = {
        "Lshark/HprofRecordTag;",
        "",
        "tag",
        "",
        "(Ljava/lang/String;II)V",
        "getTag",
        "()I",
        "STRING_IN_UTF8",
        "LOAD_CLASS",
        "UNLOAD_CLASS",
        "STACK_FRAME",
        "STACK_TRACE",
        "ALLOC_SITES",
        "HEAP_SUMMARY",
        "START_THREAD",
        "END_THREAD",
        "HEAP_DUMP",
        "HEAP_DUMP_SEGMENT",
        "HEAP_DUMP_END",
        "CPU_SAMPLES",
        "CONTROL_SETTINGS",
        "ROOT_UNKNOWN",
        "ROOT_JNI_GLOBAL",
        "ROOT_JNI_LOCAL",
        "ROOT_JAVA_FRAME",
        "ROOT_NATIVE_STACK",
        "ROOT_STICKY_CLASS",
        "ROOT_THREAD_BLOCK",
        "ROOT_MONITOR_USED",
        "ROOT_THREAD_OBJECT",
        "HEAP_DUMP_INFO",
        "ROOT_INTERNED_STRING",
        "ROOT_FINALIZING",
        "ROOT_DEBUGGER",
        "ROOT_REFERENCE_CLEANUP",
        "ROOT_VM_INTERNAL",
        "ROOT_JNI_MONITOR",
        "ROOT_UNREACHABLE",
        "PRIMITIVE_ARRAY_NODATA",
        "CLASS_DUMP",
        "INSTANCE_DUMP",
        "OBJECT_ARRAY_DUMP",
        "PRIMITIVE_ARRAY_DUMP",
        "Companion",
        "shark-hprof"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# static fields
.field public static final enum ALLOC_SITES:Lshark/HprofRecordTag;

.field public static final enum CLASS_DUMP:Lshark/HprofRecordTag;

.field public static final enum CONTROL_SETTINGS:Lshark/HprofRecordTag;

.field public static final enum CPU_SAMPLES:Lshark/HprofRecordTag;

.field public static final Companion:Lshark/HprofRecordTag$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum END_THREAD:Lshark/HprofRecordTag;

.field public static final enum HEAP_DUMP:Lshark/HprofRecordTag;

.field public static final enum HEAP_DUMP_END:Lshark/HprofRecordTag;

.field public static final enum HEAP_DUMP_INFO:Lshark/HprofRecordTag;

.field public static final enum HEAP_DUMP_SEGMENT:Lshark/HprofRecordTag;

.field public static final enum HEAP_SUMMARY:Lshark/HprofRecordTag;

.field public static final enum INSTANCE_DUMP:Lshark/HprofRecordTag;

.field public static final enum LOAD_CLASS:Lshark/HprofRecordTag;

.field public static final enum OBJECT_ARRAY_DUMP:Lshark/HprofRecordTag;

.field public static final enum PRIMITIVE_ARRAY_DUMP:Lshark/HprofRecordTag;

.field public static final enum PRIMITIVE_ARRAY_NODATA:Lshark/HprofRecordTag;

.field public static final enum ROOT_DEBUGGER:Lshark/HprofRecordTag;

.field public static final enum ROOT_FINALIZING:Lshark/HprofRecordTag;

.field public static final enum ROOT_INTERNED_STRING:Lshark/HprofRecordTag;

.field public static final enum ROOT_JAVA_FRAME:Lshark/HprofRecordTag;

.field public static final enum ROOT_JNI_GLOBAL:Lshark/HprofRecordTag;

.field public static final enum ROOT_JNI_LOCAL:Lshark/HprofRecordTag;

.field public static final enum ROOT_JNI_MONITOR:Lshark/HprofRecordTag;

.field public static final enum ROOT_MONITOR_USED:Lshark/HprofRecordTag;

.field public static final enum ROOT_NATIVE_STACK:Lshark/HprofRecordTag;

.field public static final enum ROOT_REFERENCE_CLEANUP:Lshark/HprofRecordTag;

.field public static final enum ROOT_STICKY_CLASS:Lshark/HprofRecordTag;

.field public static final enum ROOT_THREAD_BLOCK:Lshark/HprofRecordTag;

.field public static final enum ROOT_THREAD_OBJECT:Lshark/HprofRecordTag;

.field public static final enum ROOT_UNKNOWN:Lshark/HprofRecordTag;

.field public static final enum ROOT_UNREACHABLE:Lshark/HprofRecordTag;

.field public static final enum ROOT_VM_INTERNAL:Lshark/HprofRecordTag;

.field public static final enum STACK_FRAME:Lshark/HprofRecordTag;

.field public static final enum STACK_TRACE:Lshark/HprofRecordTag;

.field public static final enum START_THREAD:Lshark/HprofRecordTag;

.field public static final enum STRING_IN_UTF8:Lshark/HprofRecordTag;

.field public static final enum UNLOAD_CLASS:Lshark/HprofRecordTag;

.field public static final synthetic b:[Lshark/HprofRecordTag;

.field public static final c:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lshark/HprofRecordTag;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final tag:I


# direct methods
.method static constructor <clinit>()V
    .locals 42

    .line 1
    .line 2
    new-instance v1, Lshark/HprofRecordTag;

    .line 3
    .line 4
    const-string v0, "STRING_IN_UTF8"

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v0, v2, v3}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 10
    .line 11
    sput-object v1, Lshark/HprofRecordTag;->STRING_IN_UTF8:Lshark/HprofRecordTag;

    .line 12
    .line 13
    new-instance v2, Lshark/HprofRecordTag;

    .line 14
    .line 15
    const-string v0, "LOAD_CLASS"

    .line 16
    const/4 v4, 0x2

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v0, v3, v4}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 20
    .line 21
    sput-object v2, Lshark/HprofRecordTag;->LOAD_CLASS:Lshark/HprofRecordTag;

    .line 22
    .line 23
    new-instance v0, Lshark/HprofRecordTag;

    .line 24
    .line 25
    const-string v5, "UNLOAD_CLASS"

    .line 26
    const/4 v6, 0x3

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v5, v4, v6}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 30
    .line 31
    sput-object v0, Lshark/HprofRecordTag;->UNLOAD_CLASS:Lshark/HprofRecordTag;

    .line 32
    .line 33
    new-instance v5, Lshark/HprofRecordTag;

    .line 34
    .line 35
    const-string v7, "STACK_FRAME"

    .line 36
    const/4 v8, 0x4

    .line 37
    .line 38
    .line 39
    invoke-direct {v5, v7, v6, v8}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 40
    .line 41
    sput-object v5, Lshark/HprofRecordTag;->STACK_FRAME:Lshark/HprofRecordTag;

    .line 42
    move-object v7, v5

    .line 43
    .line 44
    new-instance v5, Lshark/HprofRecordTag;

    .line 45
    .line 46
    const-string v9, "STACK_TRACE"

    .line 47
    const/4 v10, 0x5

    .line 48
    .line 49
    .line 50
    invoke-direct {v5, v9, v8, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 51
    .line 52
    sput-object v5, Lshark/HprofRecordTag;->STACK_TRACE:Lshark/HprofRecordTag;

    .line 53
    .line 54
    new-instance v9, Lshark/HprofRecordTag;

    .line 55
    .line 56
    const-string v11, "ALLOC_SITES"

    .line 57
    const/4 v12, 0x6

    .line 58
    .line 59
    .line 60
    invoke-direct {v9, v11, v10, v12}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 61
    .line 62
    sput-object v9, Lshark/HprofRecordTag;->ALLOC_SITES:Lshark/HprofRecordTag;

    .line 63
    move-object v11, v7

    .line 64
    .line 65
    new-instance v7, Lshark/HprofRecordTag;

    .line 66
    .line 67
    const-string v13, "HEAP_SUMMARY"

    .line 68
    const/4 v14, 0x7

    .line 69
    .line 70
    .line 71
    invoke-direct {v7, v13, v12, v14}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 72
    .line 73
    sput-object v7, Lshark/HprofRecordTag;->HEAP_SUMMARY:Lshark/HprofRecordTag;

    .line 74
    .line 75
    new-instance v13, Lshark/HprofRecordTag;

    .line 76
    .line 77
    const-string v15, "START_THREAD"

    .line 78
    .line 79
    const/16 v12, 0xa

    .line 80
    .line 81
    .line 82
    invoke-direct {v13, v15, v14, v12}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 83
    .line 84
    sput-object v13, Lshark/HprofRecordTag;->START_THREAD:Lshark/HprofRecordTag;

    .line 85
    move-object v15, v9

    .line 86
    .line 87
    new-instance v9, Lshark/HprofRecordTag;

    .line 88
    .line 89
    const-string v14, "END_THREAD"

    .line 90
    .line 91
    const/16 v10, 0x8

    .line 92
    .line 93
    const/16 v8, 0xb

    .line 94
    .line 95
    .line 96
    invoke-direct {v9, v14, v10, v8}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 97
    .line 98
    sput-object v9, Lshark/HprofRecordTag;->END_THREAD:Lshark/HprofRecordTag;

    .line 99
    .line 100
    new-instance v14, Lshark/HprofRecordTag;

    .line 101
    .line 102
    const-string v10, "HEAP_DUMP"

    .line 103
    .line 104
    const/16 v6, 0x9

    .line 105
    .line 106
    const/16 v4, 0xc

    .line 107
    .line 108
    .line 109
    invoke-direct {v14, v10, v6, v4}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 110
    .line 111
    sput-object v14, Lshark/HprofRecordTag;->HEAP_DUMP:Lshark/HprofRecordTag;

    .line 112
    move-object v6, v11

    .line 113
    .line 114
    new-instance v11, Lshark/HprofRecordTag;

    .line 115
    .line 116
    const-string v10, "HEAP_DUMP_SEGMENT"

    .line 117
    .line 118
    const/16 v3, 0x1c

    .line 119
    .line 120
    .line 121
    invoke-direct {v11, v10, v12, v3}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 122
    .line 123
    sput-object v11, Lshark/HprofRecordTag;->HEAP_DUMP_SEGMENT:Lshark/HprofRecordTag;

    .line 124
    .line 125
    new-instance v12, Lshark/HprofRecordTag;

    .line 126
    .line 127
    const-string v10, "HEAP_DUMP_END"

    .line 128
    .line 129
    const/16 v3, 0x2c

    .line 130
    .line 131
    .line 132
    invoke-direct {v12, v10, v8, v3}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 133
    .line 134
    sput-object v12, Lshark/HprofRecordTag;->HEAP_DUMP_END:Lshark/HprofRecordTag;

    .line 135
    move-object v8, v13

    .line 136
    .line 137
    new-instance v13, Lshark/HprofRecordTag;

    .line 138
    .line 139
    const-string v3, "CPU_SAMPLES"

    .line 140
    .line 141
    const/16 v10, 0xd

    .line 142
    .line 143
    .line 144
    invoke-direct {v13, v3, v4, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 145
    .line 146
    sput-object v13, Lshark/HprofRecordTag;->CPU_SAMPLES:Lshark/HprofRecordTag;

    .line 147
    move-object v3, v14

    .line 148
    .line 149
    new-instance v14, Lshark/HprofRecordTag;

    .line 150
    .line 151
    const-string v4, "CONTROL_SETTINGS"

    .line 152
    .line 153
    move-object/from16 v25, v0

    .line 154
    .line 155
    const/16 v0, 0xe

    .line 156
    .line 157
    .line 158
    invoke-direct {v14, v4, v10, v0}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 159
    .line 160
    sput-object v14, Lshark/HprofRecordTag;->CONTROL_SETTINGS:Lshark/HprofRecordTag;

    .line 161
    move-object v4, v6

    .line 162
    move-object v6, v15

    .line 163
    .line 164
    new-instance v15, Lshark/HprofRecordTag;

    .line 165
    .line 166
    const-string v10, "ROOT_UNKNOWN"

    .line 167
    .line 168
    move-object/from16 v26, v1

    .line 169
    .line 170
    const/16 v1, 0xff

    .line 171
    .line 172
    .line 173
    invoke-direct {v15, v10, v0, v1}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 174
    .line 175
    sput-object v15, Lshark/HprofRecordTag;->ROOT_UNKNOWN:Lshark/HprofRecordTag;

    .line 176
    .line 177
    new-instance v0, Lshark/HprofRecordTag;

    .line 178
    .line 179
    const-string v1, "ROOT_JNI_GLOBAL"

    .line 180
    .line 181
    const/16 v10, 0xf

    .line 182
    .line 183
    move-object/from16 v27, v2

    .line 184
    const/4 v2, 0x1

    .line 185
    .line 186
    .line 187
    invoke-direct {v0, v1, v10, v2}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 188
    .line 189
    sput-object v0, Lshark/HprofRecordTag;->ROOT_JNI_GLOBAL:Lshark/HprofRecordTag;

    .line 190
    .line 191
    new-instance v1, Lshark/HprofRecordTag;

    .line 192
    .line 193
    const-string v2, "ROOT_JNI_LOCAL"

    .line 194
    .line 195
    const/16 v10, 0x10

    .line 196
    .line 197
    move-object/from16 v23, v0

    .line 198
    const/4 v0, 0x2

    .line 199
    .line 200
    .line 201
    invoke-direct {v1, v2, v10, v0}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 202
    .line 203
    sput-object v1, Lshark/HprofRecordTag;->ROOT_JNI_LOCAL:Lshark/HprofRecordTag;

    .line 204
    .line 205
    new-instance v0, Lshark/HprofRecordTag;

    .line 206
    .line 207
    const-string v2, "ROOT_JAVA_FRAME"

    .line 208
    .line 209
    const/16 v10, 0x11

    .line 210
    .line 211
    move-object/from16 v28, v1

    .line 212
    const/4 v1, 0x3

    .line 213
    .line 214
    .line 215
    invoke-direct {v0, v2, v10, v1}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 216
    .line 217
    sput-object v0, Lshark/HprofRecordTag;->ROOT_JAVA_FRAME:Lshark/HprofRecordTag;

    .line 218
    .line 219
    new-instance v1, Lshark/HprofRecordTag;

    .line 220
    .line 221
    const-string v2, "ROOT_NATIVE_STACK"

    .line 222
    .line 223
    const/16 v10, 0x12

    .line 224
    .line 225
    move-object/from16 v29, v0

    .line 226
    const/4 v0, 0x4

    .line 227
    .line 228
    .line 229
    invoke-direct {v1, v2, v10, v0}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 230
    .line 231
    sput-object v1, Lshark/HprofRecordTag;->ROOT_NATIVE_STACK:Lshark/HprofRecordTag;

    .line 232
    .line 233
    new-instance v0, Lshark/HprofRecordTag;

    .line 234
    .line 235
    const-string v2, "ROOT_STICKY_CLASS"

    .line 236
    .line 237
    const/16 v10, 0x13

    .line 238
    .line 239
    move-object/from16 v19, v1

    .line 240
    const/4 v1, 0x5

    .line 241
    .line 242
    .line 243
    invoke-direct {v0, v2, v10, v1}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 244
    .line 245
    sput-object v0, Lshark/HprofRecordTag;->ROOT_STICKY_CLASS:Lshark/HprofRecordTag;

    .line 246
    .line 247
    new-instance v1, Lshark/HprofRecordTag;

    .line 248
    .line 249
    const-string v2, "ROOT_THREAD_BLOCK"

    .line 250
    .line 251
    const/16 v10, 0x14

    .line 252
    .line 253
    move-object/from16 v31, v0

    .line 254
    const/4 v0, 0x6

    .line 255
    .line 256
    .line 257
    invoke-direct {v1, v2, v10, v0}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 258
    .line 259
    sput-object v1, Lshark/HprofRecordTag;->ROOT_THREAD_BLOCK:Lshark/HprofRecordTag;

    .line 260
    .line 261
    new-instance v0, Lshark/HprofRecordTag;

    .line 262
    .line 263
    const-string v2, "ROOT_MONITOR_USED"

    .line 264
    .line 265
    const/16 v10, 0x15

    .line 266
    .line 267
    move-object/from16 v21, v1

    .line 268
    const/4 v1, 0x7

    .line 269
    .line 270
    .line 271
    invoke-direct {v0, v2, v10, v1}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 272
    .line 273
    sput-object v0, Lshark/HprofRecordTag;->ROOT_MONITOR_USED:Lshark/HprofRecordTag;

    .line 274
    .line 275
    new-instance v1, Lshark/HprofRecordTag;

    .line 276
    .line 277
    const-string v2, "ROOT_THREAD_OBJECT"

    .line 278
    .line 279
    const/16 v10, 0x16

    .line 280
    .line 281
    move-object/from16 v22, v0

    .line 282
    .line 283
    const/16 v0, 0x8

    .line 284
    .line 285
    .line 286
    invoke-direct {v1, v2, v10, v0}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 287
    .line 288
    sput-object v1, Lshark/HprofRecordTag;->ROOT_THREAD_OBJECT:Lshark/HprofRecordTag;

    .line 289
    .line 290
    new-instance v0, Lshark/HprofRecordTag;

    .line 291
    .line 292
    const/16 v2, 0x17

    .line 293
    .line 294
    const/16 v10, 0xfe

    .line 295
    .line 296
    move-object/from16 v34, v1

    .line 297
    .line 298
    const-string v1, "HEAP_DUMP_INFO"

    .line 299
    .line 300
    .line 301
    invoke-direct {v0, v1, v2, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 302
    .line 303
    sput-object v0, Lshark/HprofRecordTag;->HEAP_DUMP_INFO:Lshark/HprofRecordTag;

    .line 304
    .line 305
    new-instance v1, Lshark/HprofRecordTag;

    .line 306
    .line 307
    const/16 v2, 0x18

    .line 308
    .line 309
    const/16 v10, 0x89

    .line 310
    .line 311
    move-object/from16 v16, v0

    .line 312
    .line 313
    const-string v0, "ROOT_INTERNED_STRING"

    .line 314
    .line 315
    .line 316
    invoke-direct {v1, v0, v2, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 317
    .line 318
    sput-object v1, Lshark/HprofRecordTag;->ROOT_INTERNED_STRING:Lshark/HprofRecordTag;

    .line 319
    .line 320
    new-instance v0, Lshark/HprofRecordTag;

    .line 321
    .line 322
    const/16 v2, 0x19

    .line 323
    .line 324
    const/16 v10, 0x8a

    .line 325
    .line 326
    move-object/from16 v35, v1

    .line 327
    .line 328
    const-string v1, "ROOT_FINALIZING"

    .line 329
    .line 330
    .line 331
    invoke-direct {v0, v1, v2, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 332
    .line 333
    sput-object v0, Lshark/HprofRecordTag;->ROOT_FINALIZING:Lshark/HprofRecordTag;

    .line 334
    .line 335
    new-instance v1, Lshark/HprofRecordTag;

    .line 336
    .line 337
    const/16 v2, 0x1a

    .line 338
    .line 339
    const/16 v10, 0x8b

    .line 340
    .line 341
    move-object/from16 v36, v0

    .line 342
    .line 343
    const-string v0, "ROOT_DEBUGGER"

    .line 344
    .line 345
    .line 346
    invoke-direct {v1, v0, v2, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 347
    .line 348
    sput-object v1, Lshark/HprofRecordTag;->ROOT_DEBUGGER:Lshark/HprofRecordTag;

    .line 349
    .line 350
    new-instance v0, Lshark/HprofRecordTag;

    .line 351
    .line 352
    const/16 v2, 0x1b

    .line 353
    .line 354
    const/16 v10, 0x8c

    .line 355
    .line 356
    move-object/from16 v37, v1

    .line 357
    .line 358
    const-string v1, "ROOT_REFERENCE_CLEANUP"

    .line 359
    .line 360
    .line 361
    invoke-direct {v0, v1, v2, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 362
    .line 363
    sput-object v0, Lshark/HprofRecordTag;->ROOT_REFERENCE_CLEANUP:Lshark/HprofRecordTag;

    .line 364
    .line 365
    new-instance v1, Lshark/HprofRecordTag;

    .line 366
    .line 367
    const-string v2, "ROOT_VM_INTERNAL"

    .line 368
    .line 369
    const/16 v10, 0x8d

    .line 370
    .line 371
    move-object/from16 v38, v0

    .line 372
    .line 373
    const/16 v0, 0x1c

    .line 374
    .line 375
    .line 376
    invoke-direct {v1, v2, v0, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 377
    .line 378
    sput-object v1, Lshark/HprofRecordTag;->ROOT_VM_INTERNAL:Lshark/HprofRecordTag;

    .line 379
    .line 380
    new-instance v0, Lshark/HprofRecordTag;

    .line 381
    .line 382
    const/16 v2, 0x1d

    .line 383
    .line 384
    const/16 v10, 0x8e

    .line 385
    .line 386
    move-object/from16 v39, v1

    .line 387
    .line 388
    const-string v1, "ROOT_JNI_MONITOR"

    .line 389
    .line 390
    .line 391
    invoke-direct {v0, v1, v2, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 392
    .line 393
    sput-object v0, Lshark/HprofRecordTag;->ROOT_JNI_MONITOR:Lshark/HprofRecordTag;

    .line 394
    .line 395
    new-instance v1, Lshark/HprofRecordTag;

    .line 396
    .line 397
    const/16 v2, 0x1e

    .line 398
    .line 399
    const/16 v10, 0x90

    .line 400
    .line 401
    move-object/from16 v30, v0

    .line 402
    .line 403
    const-string v0, "ROOT_UNREACHABLE"

    .line 404
    .line 405
    .line 406
    invoke-direct {v1, v0, v2, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 407
    .line 408
    sput-object v1, Lshark/HprofRecordTag;->ROOT_UNREACHABLE:Lshark/HprofRecordTag;

    .line 409
    .line 410
    new-instance v0, Lshark/HprofRecordTag;

    .line 411
    .line 412
    const/16 v2, 0x1f

    .line 413
    .line 414
    const/16 v10, 0xc3

    .line 415
    .line 416
    move-object/from16 v41, v1

    .line 417
    .line 418
    const-string v1, "PRIMITIVE_ARRAY_NODATA"

    .line 419
    .line 420
    .line 421
    invoke-direct {v0, v1, v2, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 422
    .line 423
    sput-object v0, Lshark/HprofRecordTag;->PRIMITIVE_ARRAY_NODATA:Lshark/HprofRecordTag;

    .line 424
    .line 425
    new-instance v1, Lshark/HprofRecordTag;

    .line 426
    .line 427
    const-string v2, "CLASS_DUMP"

    .line 428
    .line 429
    const/16 v10, 0x20

    .line 430
    .line 431
    .line 432
    invoke-direct {v1, v2, v10, v10}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 433
    .line 434
    sput-object v1, Lshark/HprofRecordTag;->CLASS_DUMP:Lshark/HprofRecordTag;

    .line 435
    .line 436
    new-instance v2, Lshark/HprofRecordTag;

    .line 437
    .line 438
    const-string v10, "INSTANCE_DUMP"

    .line 439
    .line 440
    move-object/from16 v32, v0

    .line 441
    .line 442
    const/16 v0, 0x21

    .line 443
    .line 444
    .line 445
    invoke-direct {v2, v10, v0, v0}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 446
    .line 447
    sput-object v2, Lshark/HprofRecordTag;->INSTANCE_DUMP:Lshark/HprofRecordTag;

    .line 448
    .line 449
    new-instance v0, Lshark/HprofRecordTag;

    .line 450
    .line 451
    const-string v10, "OBJECT_ARRAY_DUMP"

    .line 452
    .line 453
    move-object/from16 v33, v1

    .line 454
    .line 455
    const/16 v1, 0x22

    .line 456
    .line 457
    .line 458
    invoke-direct {v0, v10, v1, v1}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 459
    .line 460
    sput-object v0, Lshark/HprofRecordTag;->OBJECT_ARRAY_DUMP:Lshark/HprofRecordTag;

    .line 461
    .line 462
    new-instance v1, Lshark/HprofRecordTag;

    .line 463
    .line 464
    const-string v10, "PRIMITIVE_ARRAY_DUMP"

    .line 465
    .line 466
    move-object/from16 v17, v0

    .line 467
    .line 468
    const/16 v0, 0x23

    .line 469
    .line 470
    .line 471
    invoke-direct {v1, v10, v0, v0}, Lshark/HprofRecordTag;-><init>(Ljava/lang/String;II)V

    .line 472
    .line 473
    sput-object v1, Lshark/HprofRecordTag;->PRIMITIVE_ARRAY_DUMP:Lshark/HprofRecordTag;

    .line 474
    .line 475
    move-object/from16 v10, v36

    .line 476
    .line 477
    move-object/from16 v36, v1

    .line 478
    .line 479
    move-object/from16 v1, v26

    .line 480
    .line 481
    move-object/from16 v26, v10

    .line 482
    move-object v10, v3

    .line 483
    .line 484
    move-object/from16 v24, v16

    .line 485
    .line 486
    move-object/from16 v16, v23

    .line 487
    .line 488
    move-object/from16 v3, v25

    .line 489
    .line 490
    move-object/from16 v18, v29

    .line 491
    .line 492
    move-object/from16 v20, v31

    .line 493
    .line 494
    move-object/from16 v23, v34

    .line 495
    .line 496
    move-object/from16 v25, v35

    .line 497
    .line 498
    move-object/from16 v29, v39

    .line 499
    .line 500
    move-object/from16 v31, v41

    .line 501
    .line 502
    move-object/from16 v34, v2

    .line 503
    .line 504
    move-object/from16 v35, v17

    .line 505
    .line 506
    move-object/from16 v2, v27

    .line 507
    .line 508
    move-object/from16 v17, v28

    .line 509
    .line 510
    move-object/from16 v27, v37

    .line 511
    .line 512
    move-object/from16 v28, v38

    .line 513
    .line 514
    .line 515
    filled-new-array/range {v1 .. v36}, [Lshark/HprofRecordTag;

    .line 516
    move-result-object v0

    .line 517
    .line 518
    move-object/from16 v34, v23

    .line 519
    .line 520
    move-object/from16 v35, v25

    .line 521
    .line 522
    move-object/from16 v36, v26

    .line 523
    .line 524
    move-object/from16 v28, v17

    .line 525
    .line 526
    move-object/from16 v29, v18

    .line 527
    .line 528
    move-object/from16 v31, v20

    .line 529
    .line 530
    sput-object v0, Lshark/HprofRecordTag;->b:[Lshark/HprofRecordTag;

    .line 531
    .line 532
    new-instance v0, Lshark/HprofRecordTag$Companion;

    .line 533
    const/4 v1, 0x0

    .line 534
    .line 535
    .line 536
    invoke-direct {v0, v1}, Lshark/HprofRecordTag$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 537
    .line 538
    sput-object v0, Lshark/HprofRecordTag;->Companion:Lshark/HprofRecordTag$Companion;

    .line 539
    .line 540
    move-object/from16 v27, v16

    .line 541
    .line 542
    move-object/from16 v32, v21

    .line 543
    .line 544
    move-object/from16 v33, v22

    .line 545
    .line 546
    move-object/from16 v40, v30

    .line 547
    .line 548
    move-object/from16 v30, v19

    .line 549
    .line 550
    .line 551
    filled-new-array/range {v27 .. v41}, [Lshark/HprofRecordTag;

    .line 552
    move-result-object v0

    .line 553
    .line 554
    .line 555
    invoke-static {v15, v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 556
    move-result-object v0

    .line 557
    .line 558
    const-string v1, "EnumSet.of(\n      ROOT_U\u2026   ROOT_UNREACHABLE\n    )"

    .line 559
    .line 560
    .line 561
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 562
    .line 563
    sput-object v0, Lshark/HprofRecordTag;->c:Ljava/util/EnumSet;

    .line 564
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;II)V
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
    iput p3, p0, Lshark/HprofRecordTag;->tag:I

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

.method public static final synthetic access$getRootTags$cp()Ljava/util/EnumSet;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lshark/HprofRecordTag;->c:Ljava/util/EnumSet;

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

.method public static valueOf(Ljava/lang/String;)Lshark/HprofRecordTag;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lshark/HprofRecordTag;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lshark/HprofRecordTag;

    .line 9
    return-object p0
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

.method public static values()[Lshark/HprofRecordTag;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lshark/HprofRecordTag;->b:[Lshark/HprofRecordTag;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lshark/HprofRecordTag;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lshark/HprofRecordTag;

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
    .line 19
    .line 20
    .line 21
.end method


# virtual methods
.method public final getTag()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lshark/HprofRecordTag;->tag:I

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
