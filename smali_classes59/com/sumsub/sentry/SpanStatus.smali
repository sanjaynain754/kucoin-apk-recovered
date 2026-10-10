.class public final enum Lcom/sumsub/sentry/SpanStatus;
.super Ljava/lang/Enum;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sumsub/sentry/SpanStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0018\u0008\u0081\u0081\u0002\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\u0008\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0019\u0008\u0012\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000cR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000cj\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 \u00a8\u0006!"
    }
    d2 = {
        "Lcom/sumsub/sentry/SpanStatus;",
        "",
        "",
        "httpStatusCode",
        "<init>",
        "(Ljava/lang/String;II)V",
        "minHttpStatusCode",
        "maxHttpStatusCode",
        "(Ljava/lang/String;III)V",
        "",
        "matches",
        "(I)Z",
        "I",
        "Companion",
        "com/sumsub/sentry/e1",
        "OK",
        "CANCELLED",
        "INTERNAL_ERROR",
        "UNKNOWN",
        "UNKNOWN_ERROR",
        "INVALID_ARGUMENT",
        "DEADLINE_EXCEEDED",
        "NOT_FOUND",
        "ALREADY_EXISTS",
        "PERMISSION_DENIED",
        "RESOURCE_EXHAUSTED",
        "FAILED_PRECONDITION",
        "ABORTED",
        "OUT_OF_RANGE",
        "UNIMPLEMENTED",
        "UNAVAILABLE",
        "DATA_LOSS",
        "UNAUTHENTICATED",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ltg0/o;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sumsub/sentry/SpanStatus;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ltg0/d<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum ABORTED:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum ALREADY_EXISTS:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum CANCELLED:Lcom/sumsub/sentry/SpanStatus;

.field public static final Companion:Lcom/sumsub/sentry/e1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum DATA_LOSS:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum DEADLINE_EXCEEDED:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum FAILED_PRECONDITION:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum INTERNAL_ERROR:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum INVALID_ARGUMENT:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum NOT_FOUND:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum OK:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum OUT_OF_RANGE:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum PERMISSION_DENIED:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum RESOURCE_EXHAUSTED:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum UNAUTHENTICATED:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum UNAVAILABLE:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum UNIMPLEMENTED:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum UNKNOWN:Lcom/sumsub/sentry/SpanStatus;

.field public static final enum UNKNOWN_ERROR:Lcom/sumsub/sentry/SpanStatus;


# instance fields
.field private final maxHttpStatusCode:I

.field private final minHttpStatusCode:I


# direct methods
.method private static final synthetic $values()[Lcom/sumsub/sentry/SpanStatus;
    .locals 19

    .line 1
    .line 2
    sget-object v1, Lcom/sumsub/sentry/SpanStatus;->OK:Lcom/sumsub/sentry/SpanStatus;

    .line 3
    .line 4
    sget-object v2, Lcom/sumsub/sentry/SpanStatus;->CANCELLED:Lcom/sumsub/sentry/SpanStatus;

    .line 5
    .line 6
    sget-object v3, Lcom/sumsub/sentry/SpanStatus;->INTERNAL_ERROR:Lcom/sumsub/sentry/SpanStatus;

    .line 7
    .line 8
    sget-object v4, Lcom/sumsub/sentry/SpanStatus;->UNKNOWN:Lcom/sumsub/sentry/SpanStatus;

    .line 9
    .line 10
    sget-object v5, Lcom/sumsub/sentry/SpanStatus;->UNKNOWN_ERROR:Lcom/sumsub/sentry/SpanStatus;

    .line 11
    .line 12
    sget-object v6, Lcom/sumsub/sentry/SpanStatus;->INVALID_ARGUMENT:Lcom/sumsub/sentry/SpanStatus;

    .line 13
    .line 14
    sget-object v7, Lcom/sumsub/sentry/SpanStatus;->DEADLINE_EXCEEDED:Lcom/sumsub/sentry/SpanStatus;

    .line 15
    .line 16
    sget-object v8, Lcom/sumsub/sentry/SpanStatus;->NOT_FOUND:Lcom/sumsub/sentry/SpanStatus;

    .line 17
    .line 18
    sget-object v9, Lcom/sumsub/sentry/SpanStatus;->ALREADY_EXISTS:Lcom/sumsub/sentry/SpanStatus;

    .line 19
    .line 20
    sget-object v10, Lcom/sumsub/sentry/SpanStatus;->PERMISSION_DENIED:Lcom/sumsub/sentry/SpanStatus;

    .line 21
    .line 22
    sget-object v11, Lcom/sumsub/sentry/SpanStatus;->RESOURCE_EXHAUSTED:Lcom/sumsub/sentry/SpanStatus;

    .line 23
    .line 24
    sget-object v12, Lcom/sumsub/sentry/SpanStatus;->FAILED_PRECONDITION:Lcom/sumsub/sentry/SpanStatus;

    .line 25
    .line 26
    sget-object v13, Lcom/sumsub/sentry/SpanStatus;->ABORTED:Lcom/sumsub/sentry/SpanStatus;

    .line 27
    .line 28
    sget-object v14, Lcom/sumsub/sentry/SpanStatus;->OUT_OF_RANGE:Lcom/sumsub/sentry/SpanStatus;

    .line 29
    .line 30
    sget-object v15, Lcom/sumsub/sentry/SpanStatus;->UNIMPLEMENTED:Lcom/sumsub/sentry/SpanStatus;

    .line 31
    .line 32
    sget-object v16, Lcom/sumsub/sentry/SpanStatus;->UNAVAILABLE:Lcom/sumsub/sentry/SpanStatus;

    .line 33
    .line 34
    sget-object v17, Lcom/sumsub/sentry/SpanStatus;->DATA_LOSS:Lcom/sumsub/sentry/SpanStatus;

    .line 35
    .line 36
    sget-object v18, Lcom/sumsub/sentry/SpanStatus;->UNAUTHENTICATED:Lcom/sumsub/sentry/SpanStatus;

    .line 37
    .line 38
    .line 39
    filled-new-array/range {v1 .. v18}, [Lcom/sumsub/sentry/SpanStatus;

    .line 40
    move-result-object v0

    .line 41
    return-object v0
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
.end method

.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 3
    .line 4
    const/16 v1, 0xc8

    .line 5
    .line 6
    const/16 v2, 0x12b

    .line 7
    .line 8
    const-string v3, "OK"

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;III)V

    .line 13
    .line 14
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->OK:Lcom/sumsub/sentry/SpanStatus;

    .line 15
    .line 16
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    const/16 v2, 0x1f3

    .line 20
    .line 21
    const-string v3, "CANCELLED"

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 25
    .line 26
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->CANCELLED:Lcom/sumsub/sentry/SpanStatus;

    .line 27
    .line 28
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 29
    .line 30
    const-string v1, "INTERNAL_ERROR"

    .line 31
    const/4 v2, 0x2

    .line 32
    .line 33
    const/16 v3, 0x1f4

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1, v2, v3}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->INTERNAL_ERROR:Lcom/sumsub/sentry/SpanStatus;

    .line 39
    .line 40
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 41
    .line 42
    const-string v1, "UNKNOWN"

    .line 43
    const/4 v2, 0x3

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1, v2, v3}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->UNKNOWN:Lcom/sumsub/sentry/SpanStatus;

    .line 49
    .line 50
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 51
    .line 52
    const-string v1, "UNKNOWN_ERROR"

    .line 53
    const/4 v2, 0x4

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v1, v2, v3}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->UNKNOWN_ERROR:Lcom/sumsub/sentry/SpanStatus;

    .line 59
    .line 60
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 61
    .line 62
    const-string v1, "INVALID_ARGUMENT"

    .line 63
    const/4 v2, 0x5

    .line 64
    .line 65
    const/16 v4, 0x190

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1, v2, v4}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 69
    .line 70
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->INVALID_ARGUMENT:Lcom/sumsub/sentry/SpanStatus;

    .line 71
    .line 72
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 73
    const/4 v1, 0x6

    .line 74
    .line 75
    const/16 v2, 0x1f8

    .line 76
    .line 77
    const-string v5, "DEADLINE_EXCEEDED"

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, v5, v1, v2}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 81
    .line 82
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->DEADLINE_EXCEEDED:Lcom/sumsub/sentry/SpanStatus;

    .line 83
    .line 84
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 85
    const/4 v1, 0x7

    .line 86
    .line 87
    const/16 v2, 0x194

    .line 88
    .line 89
    const-string v5, "NOT_FOUND"

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, v5, v1, v2}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 93
    .line 94
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->NOT_FOUND:Lcom/sumsub/sentry/SpanStatus;

    .line 95
    .line 96
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 97
    .line 98
    const-string v1, "ALREADY_EXISTS"

    .line 99
    .line 100
    const/16 v2, 0x8

    .line 101
    .line 102
    const/16 v5, 0x199

    .line 103
    .line 104
    .line 105
    invoke-direct {v0, v1, v2, v5}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 106
    .line 107
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->ALREADY_EXISTS:Lcom/sumsub/sentry/SpanStatus;

    .line 108
    .line 109
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 110
    .line 111
    const/16 v1, 0x9

    .line 112
    .line 113
    const/16 v2, 0x193

    .line 114
    .line 115
    const-string v6, "PERMISSION_DENIED"

    .line 116
    .line 117
    .line 118
    invoke-direct {v0, v6, v1, v2}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 119
    .line 120
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->PERMISSION_DENIED:Lcom/sumsub/sentry/SpanStatus;

    .line 121
    .line 122
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 123
    .line 124
    const/16 v1, 0xa

    .line 125
    .line 126
    const/16 v2, 0x1ad

    .line 127
    .line 128
    const-string v6, "RESOURCE_EXHAUSTED"

    .line 129
    .line 130
    .line 131
    invoke-direct {v0, v6, v1, v2}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 132
    .line 133
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->RESOURCE_EXHAUSTED:Lcom/sumsub/sentry/SpanStatus;

    .line 134
    .line 135
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 136
    .line 137
    const-string v1, "FAILED_PRECONDITION"

    .line 138
    .line 139
    const/16 v2, 0xb

    .line 140
    .line 141
    .line 142
    invoke-direct {v0, v1, v2, v4}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 143
    .line 144
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->FAILED_PRECONDITION:Lcom/sumsub/sentry/SpanStatus;

    .line 145
    .line 146
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 147
    .line 148
    const-string v1, "ABORTED"

    .line 149
    .line 150
    const/16 v2, 0xc

    .line 151
    .line 152
    .line 153
    invoke-direct {v0, v1, v2, v5}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 154
    .line 155
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->ABORTED:Lcom/sumsub/sentry/SpanStatus;

    .line 156
    .line 157
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 158
    .line 159
    const-string v1, "OUT_OF_RANGE"

    .line 160
    .line 161
    const/16 v2, 0xd

    .line 162
    .line 163
    .line 164
    invoke-direct {v0, v1, v2, v4}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 165
    .line 166
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->OUT_OF_RANGE:Lcom/sumsub/sentry/SpanStatus;

    .line 167
    .line 168
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 169
    .line 170
    const/16 v1, 0xe

    .line 171
    .line 172
    const/16 v2, 0x1f5

    .line 173
    .line 174
    const-string v4, "UNIMPLEMENTED"

    .line 175
    .line 176
    .line 177
    invoke-direct {v0, v4, v1, v2}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 178
    .line 179
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->UNIMPLEMENTED:Lcom/sumsub/sentry/SpanStatus;

    .line 180
    .line 181
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 182
    .line 183
    const/16 v1, 0xf

    .line 184
    .line 185
    const/16 v2, 0x1f7

    .line 186
    .line 187
    const-string v4, "UNAVAILABLE"

    .line 188
    .line 189
    .line 190
    invoke-direct {v0, v4, v1, v2}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 191
    .line 192
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->UNAVAILABLE:Lcom/sumsub/sentry/SpanStatus;

    .line 193
    .line 194
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 195
    .line 196
    const-string v1, "DATA_LOSS"

    .line 197
    .line 198
    const/16 v2, 0x10

    .line 199
    .line 200
    .line 201
    invoke-direct {v0, v1, v2, v3}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 202
    .line 203
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->DATA_LOSS:Lcom/sumsub/sentry/SpanStatus;

    .line 204
    .line 205
    new-instance v0, Lcom/sumsub/sentry/SpanStatus;

    .line 206
    .line 207
    const/16 v1, 0x11

    .line 208
    .line 209
    const/16 v2, 0x191

    .line 210
    .line 211
    const-string v3, "UNAUTHENTICATED"

    .line 212
    .line 213
    .line 214
    invoke-direct {v0, v3, v1, v2}, Lcom/sumsub/sentry/SpanStatus;-><init>(Ljava/lang/String;II)V

    .line 215
    .line 216
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->UNAUTHENTICATED:Lcom/sumsub/sentry/SpanStatus;

    .line 217
    .line 218
    .line 219
    invoke-static {}, Lcom/sumsub/sentry/SpanStatus;->$values()[Lcom/sumsub/sentry/SpanStatus;

    .line 220
    move-result-object v0

    .line 221
    .line 222
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->$VALUES:[Lcom/sumsub/sentry/SpanStatus;

    .line 223
    .line 224
    .line 225
    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 226
    move-result-object v0

    .line 227
    .line 228
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 229
    .line 230
    new-instance v0, Lcom/sumsub/sentry/e1;

    .line 231
    .line 232
    .line 233
    invoke-direct {v0}, Lcom/sumsub/sentry/e1;-><init>()V

    .line 234
    .line 235
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->Companion:Lcom/sumsub/sentry/e1;

    .line 236
    .line 237
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 238
    .line 239
    new-instance v1, Lcom/sumsub/sentry/x1;

    .line 240
    .line 241
    .line 242
    invoke-direct {v1}, Lcom/sumsub/sentry/x1;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 246
    move-result-object v0

    .line 247
    .line 248
    sput-object v0, Lcom/sumsub/sentry/SpanStatus;->$cachedSerializer$delegate:Lkotlin/Lazy;

    .line 249
    return-void
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
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/sumsub/sentry/SpanStatus;->minHttpStatusCode:I

    .line 3
    iput p3, p0, Lcom/sumsub/sentry/SpanStatus;->maxHttpStatusCode:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 5
    iput p3, p0, Lcom/sumsub/sentry/SpanStatus;->minHttpStatusCode:I

    .line 6
    iput p4, p0, Lcom/sumsub/sentry/SpanStatus;->maxHttpStatusCode:I

    return-void
.end method

.method private static final synthetic _init_$_anonymous_()Ltg0/d;
    .locals 20

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sentry/SpanStatus;->values()[Lcom/sumsub/sentry/SpanStatus;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v17, "data_loss"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v18, "unauthenticated"

    .line 10
    .line 11
    .line 12
    const-string/jumbo v1, "ok"

    .line 13
    .line 14
    const-string v2, "cancelled"

    .line 15
    .line 16
    const-string v3, "internal_error"

    .line 17
    .line 18
    .line 19
    const-string/jumbo v4, "unknown"

    .line 20
    .line 21
    .line 22
    const-string/jumbo v5, "unknown_error"

    .line 23
    .line 24
    const-string v6, "invalid_argument"

    .line 25
    .line 26
    const-string v7, "deadline_exceeded"

    .line 27
    .line 28
    .line 29
    const-string/jumbo v8, "not_found"

    .line 30
    .line 31
    const-string v9, "already_exists"

    .line 32
    .line 33
    .line 34
    const-string/jumbo v10, "permission_denied"

    .line 35
    .line 36
    .line 37
    const-string/jumbo v11, "resource_exhausted"

    .line 38
    .line 39
    const-string v12, "failed_precondition"

    .line 40
    .line 41
    const-string v13, "aborted"

    .line 42
    .line 43
    .line 44
    const-string/jumbo v14, "out_of_range"

    .line 45
    .line 46
    .line 47
    const-string/jumbo v15, "unimplemented"

    .line 48
    .line 49
    .line 50
    const-string/jumbo v16, "unavailable"

    .line 51
    .line 52
    .line 53
    filled-new-array/range {v1 .. v18}, [Ljava/lang/String;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    const/16 v18, 0x0

    .line 57
    .line 58
    const/16 v19, 0x0

    .line 59
    const/4 v2, 0x0

    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    const/4 v9, 0x0

    .line 67
    const/4 v10, 0x0

    .line 68
    const/4 v11, 0x0

    .line 69
    const/4 v12, 0x0

    .line 70
    const/4 v13, 0x0

    .line 71
    const/4 v14, 0x0

    .line 72
    const/4 v15, 0x0

    .line 73
    .line 74
    const/16 v16, 0x0

    .line 75
    .line 76
    const/16 v17, 0x0

    .line 77
    .line 78
    .line 79
    filled-new-array/range {v2 .. v19}, [[Ljava/lang/annotation/Annotation;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    const-string v3, "com.sumsub.sentry.SpanStatus"

    .line 83
    .line 84
    .line 85
    invoke-static {v3, v0, v1, v2, v4}, Lkotlinx/serialization/internal/i0;->a(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Ltg0/d;

    .line 86
    move-result-object v0

    .line 87
    return-object v0
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
.end method

.method public static synthetic a()Ltg0/d;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sentry/SpanStatus;->_init_$_anonymous_()Ltg0/d;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/SpanStatus;->$cachedSerializer$delegate:Lkotlin/Lazy;

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
.end method

.method public static final synthetic access$matches(Lcom/sumsub/sentry/SpanStatus;I)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sentry/SpanStatus;->matches(I)Z

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/sumsub/sentry/SpanStatus;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/SpanStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
.end method

.method private final matches(I)Z
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sentry/SpanStatus;->minHttpStatusCode:I

    .line 3
    .line 4
    iget v1, p0, Lcom/sumsub/sentry/SpanStatus;->maxHttpStatusCode:I

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-gt p1, v1, :cond_0

    .line 8
    .line 9
    if-gt v0, p1, :cond_0

    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    return v2
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
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sumsub/sentry/SpanStatus;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sentry/SpanStatus;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sentry/SpanStatus;

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
.end method

.method public static values()[Lcom/sumsub/sentry/SpanStatus;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/SpanStatus;->$VALUES:[Lcom/sumsub/sentry/SpanStatus;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/sumsub/sentry/SpanStatus;

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
.end method
