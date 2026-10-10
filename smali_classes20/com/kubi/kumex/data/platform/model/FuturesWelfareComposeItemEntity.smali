.class public final Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;
.super Ljava/lang/Object;
.source "FuturesWelfareEntity.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BX\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u001b\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u000b\u0012\t\u0018\u00010\u000b\u00a2\u0006\u0002\u0008\u000c\u0018\u00010\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001fH\u0002J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001e\u0010%\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u000b\u0012\t\u0018\u00010\u000b\u00a2\u0006\u0002\u0008\u000c\u0018\u00010\nH\u00c6\u0003Ji\u0010&\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u001d\u0008\u0002\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u000b\u0012\t\u0018\u00010\u000b\u00a2\u0006\u0002\u0008\u000c\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\'J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020)H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0010R&\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u000b\u0012\t\u0018\u00010\u000b\u00a2\u0006\u0002\u0008\u000c\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u00065"
    }
    d2 = {
        "Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;",
        "Landroid/os/Parcelable;",
        "couponId",
        "",
        "welfareType",
        "effectiveTime",
        "expireTime",
        "",
        "tag",
        "attributes",
        "",
        "Lcom/google/gson/JsonElement;",
        "Lkotlinx/parcelize/RawValue;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V",
        "getCouponId",
        "()Ljava/lang/String;",
        "getWelfareType",
        "getEffectiveTime",
        "getExpireTime",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getTag",
        "getAttributes",
        "()Ljava/util/Map;",
        "toTrial",
        "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;",
        "toCoupon",
        "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;",
        "toAirdrop",
        "parseSupportedContracts",
        "",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;",
        "describeContents",
        "",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFuturesWelfareEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesWelfareEntity.kt\ncom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,368:1\n1869#2,2:369\n*S KotlinDebug\n*F\n+ 1 FuturesWelfareEntity.kt\ncom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity\n*L\n335#1:369,2\n*E\n"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final attributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/gson/JsonElement;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final couponId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "id"
        }
        value = "couponId"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final effectiveTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "claimTime"
        }
        value = "effectiveTime"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final expireTime:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final tag:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final welfareType:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "trialFundType"
        }
        value = "welfareType"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity$a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/google/gson/JsonElement;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->effectiveTime:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->expireTime:Ljava/lang/Long;

    .line 6
    iput-object p5, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->tag:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 8
    invoke-direct/range {v0 .. v6}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p8, p7, 0x1

    .line 3
    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 9
    .line 10
    if-eqz p8, :cond_1

    .line 11
    .line 12
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

    .line 13
    .line 14
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 15
    .line 16
    if-eqz p8, :cond_2

    .line 17
    .line 18
    iget-object p3, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->effectiveTime:Ljava/lang/String;

    .line 19
    .line 20
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 21
    .line 22
    if-eqz p8, :cond_3

    .line 23
    .line 24
    iget-object p4, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->expireTime:Ljava/lang/Long;

    .line 25
    .line 26
    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 27
    .line 28
    if-eqz p8, :cond_4

    .line 29
    .line 30
    iget-object p5, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->tag:Ljava/lang/String;

    .line 31
    .line 32
    :cond_4
    and-int/lit8 p7, p7, 0x20

    .line 33
    .line 34
    if-eqz p7, :cond_5

    .line 35
    .line 36
    iget-object p6, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 37
    :cond_5
    move-object p7, p5

    .line 38
    move-object p8, p6

    .line 39
    move-object p5, p3

    .line 40
    move-object p6, p4

    .line 41
    move-object p3, p1

    .line 42
    move-object p4, p2

    .line 43
    move-object p2, p0

    .line 44
    .line 45
    .line 46
    invoke-virtual/range {p2 .. p8}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;

    .line 47
    move-result-object p0

    .line 48
    return-object p0
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
.end method

.method private final parseSupportedContracts()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v2, "supportedContracts"

    .line 12
    .line 13
    .line 14
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    :cond_0
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const-string v2, "supportContract"

    .line 32
    .line 33
    .line 34
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/google/gson/JsonElement;->getAsJsonArray()Lcom/google/gson/JsonArray;

    .line 43
    move-result-object v1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 v1, 0x0

    .line 46
    .line 47
    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    .line 54
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    move-result v2

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    check-cast v2, Lcom/google/gson/JsonElement;

    .line 64
    .line 65
    .line 66
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    .line 73
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    return-object v0
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
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

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

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

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

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->effectiveTime:Ljava/lang/String;

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

.method public final component4()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->expireTime:Ljava/lang/Long;

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

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->tag:Ljava/lang/String;

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

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/gson/JsonElement;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

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

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/google/gson/JsonElement;",
            ">;)",
            "Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    move-object v6, p6

    .line 9
    .line 10
    .line 11
    invoke-direct/range {v0 .. v6}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V

    .line 12
    return-object v0
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
.end method

.method public final describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    return v2

    .line 35
    .line 36
    :cond_3
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->effectiveTime:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->effectiveTime:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-nez v1, :cond_4

    .line 45
    return v2

    .line 46
    .line 47
    :cond_4
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->expireTime:Ljava/lang/Long;

    .line 48
    .line 49
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->expireTime:Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-nez v1, :cond_5

    .line 56
    return v2

    .line 57
    .line 58
    :cond_5
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->tag:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v3, p1, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->tag:Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    move-result v1

    .line 65
    .line 66
    if-nez v1, :cond_6

    .line 67
    return v2

    .line 68
    .line 69
    :cond_6
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 70
    .line 71
    iget-object p1, p1, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    move-result p1

    .line 76
    .line 77
    if-nez p1, :cond_7

    .line 78
    return v2

    .line 79
    :cond_7
    return v0
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
.end method

.method public final getAttributes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/gson/JsonElement;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

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

.method public final getCouponId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

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

.method public final getEffectiveTime()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->effectiveTime:Ljava/lang/String;

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

.method public final getExpireTime()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->expireTime:Ljava/lang/Long;

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

.method public final getTag()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->tag:Ljava/lang/String;

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

.method public final getWelfareType()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

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

.method public hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    move-result v0

    .line 12
    .line 13
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 14
    .line 15
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->effectiveTime:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    move v2, v1

    .line 32
    goto :goto_2

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 36
    move-result v2

    .line 37
    :goto_2
    add-int/2addr v0, v2

    .line 38
    .line 39
    mul-int/lit8 v0, v0, 0x1f

    .line 40
    .line 41
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->expireTime:Ljava/lang/Long;

    .line 42
    .line 43
    if-nez v2, :cond_3

    .line 44
    move v2, v1

    .line 45
    goto :goto_3

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 49
    move-result v2

    .line 50
    :goto_3
    add-int/2addr v0, v2

    .line 51
    .line 52
    mul-int/lit8 v0, v0, 0x1f

    .line 53
    .line 54
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->tag:Ljava/lang/String;

    .line 55
    .line 56
    if-nez v2, :cond_4

    .line 57
    move v2, v1

    .line 58
    goto :goto_4

    .line 59
    .line 60
    .line 61
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 62
    move-result v2

    .line 63
    :goto_4
    add-int/2addr v0, v2

    .line 64
    .line 65
    mul-int/lit8 v0, v0, 0x1f

    .line 66
    .line 67
    iget-object v2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 68
    .line 69
    if-nez v2, :cond_5

    .line 70
    goto :goto_5

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 74
    move-result v1

    .line 75
    :goto_5
    add-int/2addr v0, v1

    .line 76
    return v0
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
.end method

.method public final toAirdrop()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;
    .locals 45
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_c

    .line 8
    .line 9
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

    .line 10
    .line 11
    const-string v3, "CONTRACT_AIRDROP_POSITION"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_a

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-direct {v0}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->parseSupportedContracts()Ljava/util/List;

    .line 23
    move-result-object v22

    .line 24
    .line 25
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 26
    .line 27
    const-string v3, "faceValue"

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v1, v2

    .line 42
    .line 43
    :goto_0
    const-string v4, "0"

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v4}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    iget-object v4, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 50
    .line 51
    const-string v5, "type"

    .line 52
    .line 53
    .line 54
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    check-cast v4, Lcom/google/gson/JsonElement;

    .line 58
    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    .line 62
    invoke-static {v4}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    .line 63
    move-result-object v4

    .line 64
    move-object v14, v4

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move-object v14, v2

    .line 67
    .line 68
    :goto_1
    iget-object v4, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    check-cast v3, Lcom/google/gson/JsonElement;

    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    .line 79
    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    .line 80
    move-result-object v3

    .line 81
    move-object v10, v3

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    move-object v10, v2

    .line 84
    .line 85
    :goto_2
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 86
    .line 87
    const-string v4, "currency"

    .line 88
    .line 89
    .line 90
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    move-result-object v3

    .line 92
    .line 93
    check-cast v3, Lcom/google/gson/JsonElement;

    .line 94
    .line 95
    if-eqz v3, :cond_4

    .line 96
    .line 97
    .line 98
    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    .line 99
    move-result-object v3

    .line 100
    move-object v9, v3

    .line 101
    goto :goto_3

    .line 102
    :cond_4
    move-object v9, v2

    .line 103
    .line 104
    :goto_3
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 105
    .line 106
    const-string v4, "status"

    .line 107
    .line 108
    .line 109
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    move-result-object v3

    .line 111
    .line 112
    check-cast v3, Lcom/google/gson/JsonElement;

    .line 113
    .line 114
    if-eqz v3, :cond_5

    .line 115
    .line 116
    .line 117
    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    .line 118
    move-result-object v3

    .line 119
    goto :goto_4

    .line 120
    :cond_5
    move-object v3, v2

    .line 121
    .line 122
    .line 123
    :goto_4
    invoke-static {v3}, Lbm/c;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    move-result-object v5

    .line 125
    .line 126
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 127
    .line 128
    const-string v4, "expiredPeriod"

    .line 129
    .line 130
    .line 131
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    move-result-object v3

    .line 133
    .line 134
    check-cast v3, Lcom/google/gson/JsonElement;

    .line 135
    .line 136
    if-eqz v3, :cond_6

    .line 137
    .line 138
    .line 139
    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->c(Lcom/google/gson/JsonElement;)Ljava/lang/Long;

    .line 140
    move-result-object v3

    .line 141
    move-object v8, v3

    .line 142
    goto :goto_5

    .line 143
    :cond_6
    move-object v8, v2

    .line 144
    .line 145
    :goto_5
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 146
    .line 147
    const-string v4, "code"

    .line 148
    .line 149
    .line 150
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    move-result-object v3

    .line 152
    .line 153
    check-cast v3, Lcom/google/gson/JsonElement;

    .line 154
    .line 155
    if-eqz v3, :cond_7

    .line 156
    .line 157
    .line 158
    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    .line 159
    move-result-object v3

    .line 160
    move-object v4, v3

    .line 161
    goto :goto_6

    .line 162
    :cond_7
    move-object v4, v2

    .line 163
    .line 164
    :goto_6
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 165
    .line 166
    const-string v6, "maxValue"

    .line 167
    .line 168
    .line 169
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    move-result-object v3

    .line 171
    .line 172
    check-cast v3, Lcom/google/gson/JsonElement;

    .line 173
    .line 174
    if-eqz v3, :cond_8

    .line 175
    .line 176
    .line 177
    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    .line 178
    move-result-object v3

    .line 179
    .line 180
    move-object/from16 v19, v3

    .line 181
    goto :goto_7

    .line 182
    .line 183
    :cond_8
    move-object/from16 v19, v2

    .line 184
    .line 185
    :goto_7
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 186
    .line 187
    const-string v6, "trialFundBalance"

    .line 188
    .line 189
    .line 190
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    move-result-object v3

    .line 192
    .line 193
    check-cast v3, Lcom/google/gson/JsonElement;

    .line 194
    .line 195
    if-eqz v3, :cond_9

    .line 196
    .line 197
    .line 198
    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    .line 199
    move-result-object v3

    .line 200
    .line 201
    if-eqz v3, :cond_9

    .line 202
    .line 203
    .line 204
    invoke-static {v3, v1}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 205
    move-result-object v1

    .line 206
    .line 207
    move-object/from16 v24, v1

    .line 208
    goto :goto_8

    .line 209
    .line 210
    :cond_9
    move-object/from16 v24, v2

    .line 211
    .line 212
    :goto_8
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 213
    .line 214
    const-string v3, "useDurition"

    .line 215
    .line 216
    .line 217
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    move-result-object v1

    .line 219
    .line 220
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 221
    .line 222
    if-eqz v1, :cond_a

    .line 223
    .line 224
    .line 225
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->b(Lcom/google/gson/JsonElement;)Ljava/lang/Integer;

    .line 226
    move-result-object v1

    .line 227
    .line 228
    move-object/from16 v33, v1

    .line 229
    goto :goto_9

    .line 230
    .line 231
    :cond_a
    move-object/from16 v33, v2

    .line 232
    .line 233
    :goto_9
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 234
    .line 235
    const-string v3, "couponAlias"

    .line 236
    .line 237
    .line 238
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    move-result-object v1

    .line 240
    .line 241
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 242
    .line 243
    if-eqz v1, :cond_b

    .line 244
    .line 245
    .line 246
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    .line 247
    move-result-object v2

    .line 248
    .line 249
    :cond_b
    move-object/from16 v39, v2

    .line 250
    .line 251
    new-instance v3, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    .line 252
    .line 253
    const/16 v43, 0x37

    .line 254
    .line 255
    const/16 v44, 0x0

    .line 256
    const/4 v6, 0x0

    .line 257
    const/4 v7, 0x0

    .line 258
    const/4 v11, 0x0

    .line 259
    const/4 v12, 0x0

    .line 260
    const/4 v13, 0x0

    .line 261
    const/4 v15, 0x0

    .line 262
    .line 263
    const/16 v16, 0x0

    .line 264
    .line 265
    const/16 v17, 0x0

    .line 266
    .line 267
    const/16 v18, 0x0

    .line 268
    .line 269
    const/16 v20, 0x0

    .line 270
    .line 271
    const/16 v21, 0x0

    .line 272
    .line 273
    const/16 v23, 0x0

    .line 274
    .line 275
    const/16 v25, 0x0

    .line 276
    .line 277
    const/16 v26, 0x0

    .line 278
    .line 279
    const/16 v27, 0x0

    .line 280
    .line 281
    const/16 v28, 0x0

    .line 282
    .line 283
    const/16 v29, 0x0

    .line 284
    .line 285
    const/16 v30, 0x0

    .line 286
    .line 287
    const/16 v31, 0x0

    .line 288
    .line 289
    const-string v32, "AIRDROP_POSITION"

    .line 290
    .line 291
    const/16 v34, 0x0

    .line 292
    .line 293
    const/16 v35, 0x0

    .line 294
    .line 295
    const/16 v36, 0x0

    .line 296
    .line 297
    const/16 v37, 0x0

    .line 298
    .line 299
    const/16 v38, 0x0

    .line 300
    .line 301
    const/16 v40, 0x0

    .line 302
    .line 303
    const/16 v41, 0x0

    .line 304
    .line 305
    .line 306
    const v42, -0x30148474

    .line 307
    .line 308
    .line 309
    invoke-direct/range {v3 .. v44}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 310
    return-object v3

    .line 311
    :cond_c
    :goto_a
    return-object v2
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
.end method

.method public final toCoupon()Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;
    .locals 18
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_b

    .line 8
    .line 9
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

    .line 10
    .line 11
    const-string v3, "CONTRACT_COUPON"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_9

    .line 20
    .line 21
    :cond_0
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->effectiveTime:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    .line 33
    move-result-object v1

    .line 34
    move-object v6, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v6, v2

    .line 37
    .line 38
    :goto_0
    iget-object v7, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->expireTime:Ljava/lang/Long;

    .line 39
    .line 40
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    move-result-object v5

    .line 45
    .line 46
    new-instance v8, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;

    .line 47
    .line 48
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 49
    .line 50
    const-string v3, "faceValue"

    .line 51
    .line 52
    .line 53
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    .line 62
    move-result-object v1

    .line 63
    move-object v9, v1

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move-object v9, v2

    .line 66
    .line 67
    :goto_1
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 68
    .line 69
    const-string v3, "deductionRatio"

    .line 70
    .line 71
    .line 72
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    .line 81
    move-result-object v1

    .line 82
    move-object v10, v1

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    move-object v10, v2

    .line 85
    .line 86
    :goto_2
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 87
    .line 88
    const-string v3, "deductedAmount"

    .line 89
    .line 90
    .line 91
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 95
    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    .line 99
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    .line 100
    move-result-object v1

    .line 101
    move-object v11, v1

    .line 102
    goto :goto_3

    .line 103
    :cond_4
    move-object v11, v2

    .line 104
    .line 105
    :goto_3
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 106
    .line 107
    const-string v3, "remainAmount"

    .line 108
    .line 109
    .line 110
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 114
    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    .line 118
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    .line 119
    move-result-object v1

    .line 120
    move-object v12, v1

    .line 121
    goto :goto_4

    .line 122
    :cond_5
    move-object v12, v2

    .line 123
    .line 124
    :goto_4
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 125
    .line 126
    const-string v3, "couponAlias"

    .line 127
    .line 128
    .line 129
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    move-result-object v1

    .line 131
    .line 132
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 133
    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    .line 137
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    .line 138
    move-result-object v1

    .line 139
    move-object v13, v1

    .line 140
    goto :goto_5

    .line 141
    :cond_6
    move-object v13, v2

    .line 142
    .line 143
    :goto_5
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 144
    .line 145
    const-string v3, "status"

    .line 146
    .line 147
    .line 148
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    move-result-object v1

    .line 150
    .line 151
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 152
    .line 153
    if-eqz v1, :cond_7

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    .line 157
    move-result-object v1

    .line 158
    move-object v14, v1

    .line 159
    goto :goto_6

    .line 160
    :cond_7
    move-object v14, v2

    .line 161
    .line 162
    :goto_6
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 163
    .line 164
    const-string v3, "validPeriod"

    .line 165
    .line 166
    .line 167
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    move-result-object v1

    .line 169
    .line 170
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 171
    .line 172
    if-eqz v1, :cond_8

    .line 173
    .line 174
    .line 175
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->c(Lcom/google/gson/JsonElement;)Ljava/lang/Long;

    .line 176
    move-result-object v1

    .line 177
    move-object v15, v1

    .line 178
    goto :goto_7

    .line 179
    :cond_8
    move-object v15, v2

    .line 180
    .line 181
    :goto_7
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 182
    .line 183
    const-string v3, "currency"

    .line 184
    .line 185
    .line 186
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    move-result-object v1

    .line 188
    .line 189
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 190
    .line 191
    if-eqz v1, :cond_9

    .line 192
    .line 193
    .line 194
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    .line 195
    move-result-object v1

    .line 196
    .line 197
    move-object/from16 v16, v1

    .line 198
    goto :goto_8

    .line 199
    .line 200
    :cond_9
    move-object/from16 v16, v2

    .line 201
    .line 202
    :goto_8
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 203
    .line 204
    const-string v3, "tradeMode"

    .line 205
    .line 206
    .line 207
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    move-result-object v1

    .line 209
    .line 210
    check-cast v1, Lcom/google/gson/JsonElement;

    .line 211
    .line 212
    if-eqz v1, :cond_a

    .line 213
    .line 214
    .line 215
    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->b(Lcom/google/gson/JsonElement;)Ljava/lang/Integer;

    .line 216
    move-result-object v2

    .line 217
    .line 218
    :cond_a
    move-object/from16 v17, v2

    .line 219
    .line 220
    .line 221
    invoke-direct/range {v8 .. v17}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;-><init>(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 222
    .line 223
    new-instance v3, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;

    .line 224
    .line 225
    .line 226
    invoke-direct/range {v3 .. v8}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponItemEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;)V

    .line 227
    return-object v3

    .line 228
    :cond_b
    :goto_9
    return-object v2
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
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "FuturesWelfareComposeItemEntity(couponId="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, ", welfareType="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, ", effectiveTime="

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->effectiveTime:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, ", expireTime="

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->expireTime:Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, ", tag="

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->tag:Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, ", attributes="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-object v1, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const/16 v1, 0x29

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    move-result-object v0

    .line 75
    return-object v0
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
.end method

.method public final toTrial()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;
    .locals 46
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 2
    :cond_0
    const-string v3, "trialFundType"

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/JsonElement;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    .line 3
    :goto_0
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v4, "type"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_3

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v15, v3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v15, v1

    .line 4
    :goto_2
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 5
    const-string v4, "CONTRACT_BONUS"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 6
    const-string v5, "leadTrial"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 7
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 8
    invoke-static {v15, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v1, 0x1

    :goto_4
    if-nez v4, :cond_6

    if-nez v1, :cond_6

    return-object v2

    .line 9
    :cond_6
    invoke-direct {v0}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->parseSupportedContracts()Ljava/util/List;

    move-result-object v23

    .line 10
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v4, "faceValue"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    const-string v5, "amount"

    if-eqz v3, :cond_7

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_9

    .line 11
    :cond_7
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_8

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_8
    move-object v3, v2

    :goto_5
    if-nez v3, :cond_9

    .line 12
    const-string v3, "0"

    .line 13
    :cond_9
    iget-object v6, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v7, "code"

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/gson/JsonElement;

    if-eqz v6, :cond_a

    invoke-static {v6}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v6

    goto :goto_6

    :cond_a
    move-object v6, v2

    .line 14
    :goto_6
    iget-object v7, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v8, "rewardId"

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/gson/JsonElement;

    if-eqz v7, :cond_b

    invoke-static {v7}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v37, v7

    goto :goto_7

    :cond_b
    move-object/from16 v37, v2

    :goto_7
    if-eqz v1, :cond_d

    .line 15
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

    if-nez v1, :cond_c

    if-nez v37, :cond_e

    goto :goto_8

    :cond_c
    move-object v6, v1

    goto :goto_8

    :cond_d
    if-nez v6, :cond_f

    :cond_e
    move-object/from16 v6, v37

    .line 16
    :cond_f
    :goto_8
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/JsonElement;

    if-eqz v1, :cond_11

    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v1

    if-nez v1, :cond_10

    goto :goto_a

    :cond_10
    :goto_9
    move-object v11, v1

    goto :goto_b

    .line 17
    :cond_11
    :goto_a
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/JsonElement;

    if-eqz v1, :cond_12

    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v1

    goto :goto_9

    :cond_12
    move-object v11, v2

    .line 18
    :goto_b
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v4, "currency"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/JsonElement;

    if-eqz v1, :cond_13

    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v1

    move-object v10, v1

    goto :goto_c

    :cond_13
    move-object v10, v2

    .line 19
    :goto_c
    iget-object v1, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v4, "status"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/gson/JsonElement;

    if-eqz v1, :cond_14

    invoke-static {v1}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v1

    goto :goto_d

    :cond_14
    move-object v1, v2

    :goto_d
    invoke-static {v1}, Lbm/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 20
    iget-object v4, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "expiredPeriod"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/gson/JsonElement;

    if-eqz v4, :cond_16

    invoke-static {v4}, Lcom/kubi/kumex/utils/u;->c(Lcom/google/gson/JsonElement;)Ljava/lang/Long;

    move-result-object v4

    if-nez v4, :cond_15

    goto :goto_f

    :cond_15
    :goto_e
    move-object v9, v4

    goto :goto_10

    .line 21
    :cond_16
    :goto_f
    iget-object v4, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->expireTime:Ljava/lang/Long;

    goto :goto_e

    .line 22
    :goto_10
    iget-object v4, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

    .line 23
    iget-object v5, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v7, "maxValue"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/gson/JsonElement;

    if-eqz v5, :cond_18

    invoke-static {v5}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v5

    if-nez v5, :cond_17

    goto :goto_12

    :cond_17
    :goto_11
    move-object/from16 v20, v5

    goto :goto_13

    .line 24
    :cond_18
    :goto_12
    iget-object v5, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v7, "maxWithdrawAmount"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/gson/JsonElement;

    if-eqz v5, :cond_19

    invoke-static {v5}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v5

    goto :goto_11

    :cond_19
    move-object/from16 v20, v2

    .line 25
    :goto_13
    iget-object v5, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v7, "trialFundBalance"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/gson/JsonElement;

    if-eqz v5, :cond_1a

    invoke-static {v5}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v5

    if-eqz v5, :cond_1a

    .line 26
    invoke-static {v5, v3}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object v5

    move-object/from16 v25, v5

    goto :goto_14

    :cond_1a
    move-object/from16 v25, v2

    .line 27
    :goto_14
    iget-object v5, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v7, "minTotalAmount"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/gson/JsonElement;

    if-eqz v5, :cond_1c

    invoke-static {v5}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v5

    if-nez v5, :cond_1b

    goto :goto_16

    :cond_1b
    :goto_15
    move-object/from16 v16, v5

    goto :goto_17

    .line 28
    :cond_1c
    :goto_16
    iget-object v5, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v7, "withdrawThresholdTrade"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/gson/JsonElement;

    if-eqz v5, :cond_1d

    invoke-static {v5}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v5

    if-eqz v5, :cond_1d

    .line 29
    invoke-static {v5, v3}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object v5

    goto :goto_15

    :cond_1d
    move-object/from16 v16, v2

    .line 30
    :goto_17
    iget-object v5, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v7, "minCloseRealisedPnl"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/gson/JsonElement;

    if-eqz v5, :cond_1f

    invoke-static {v5}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v5

    if-nez v5, :cond_1e

    goto :goto_19

    :cond_1e
    :goto_18
    move-object/from16 v29, v5

    goto :goto_1a

    .line 31
    :cond_1f
    :goto_19
    iget-object v5, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v7, "withdrawThresholdProfit"

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/gson/JsonElement;

    if-eqz v5, :cond_20

    invoke-static {v5}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v5

    if-eqz v5, :cond_20

    .line 32
    invoke-static {v5, v3}, Lkf/a;->F(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object v5

    goto :goto_18

    :cond_20
    move-object/from16 v29, v2

    .line 33
    :goto_1a
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "maxLeverage"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_21

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v3

    move-object/from16 v24, v3

    goto :goto_1b

    :cond_21
    move-object/from16 v24, v2

    .line 34
    :goto_1b
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "realisedPNL"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_23

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v3

    if-nez v3, :cond_22

    goto :goto_1d

    :cond_22
    :goto_1c
    move-object v14, v3

    goto :goto_1e

    .line 35
    :cond_23
    :goto_1d
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "profitAmount"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_24

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v3

    goto :goto_1c

    :cond_24
    move-object v14, v2

    .line 36
    :goto_1e
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "totalAmount"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_26

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v3

    if-nez v3, :cond_25

    goto :goto_20

    :cond_25
    :goto_1f
    move-object/from16 v17, v3

    goto :goto_21

    .line 37
    :cond_26
    :goto_20
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "tradeAmount"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_27

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->a(Lcom/google/gson/JsonElement;)Ljava/math/BigDecimal;

    move-result-object v3

    goto :goto_1f

    :cond_27
    move-object/from16 v17, v2

    .line 38
    :goto_21
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "useDurition"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_28

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->b(Lcom/google/gson/JsonElement;)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v34, v3

    goto :goto_22

    :cond_28
    move-object/from16 v34, v2

    .line 39
    :goto_22
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "prizeType"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_29

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v33, v3

    goto :goto_23

    :cond_29
    move-object/from16 v33, v2

    .line 40
    :goto_23
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->tag:Ljava/lang/String;

    if-nez v3, :cond_2a

    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "tag"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_2b

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    :cond_2a
    move-object/from16 v38, v3

    goto :goto_24

    :cond_2b
    move-object/from16 v38, v2

    .line 41
    :goto_24
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "title"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_2d

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2c

    goto :goto_26

    :cond_2c
    :goto_25
    move-object/from16 v39, v3

    goto :goto_27

    .line 42
    :cond_2d
    :goto_26
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "displayTitle"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_2e

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    goto :goto_25

    :cond_2e
    move-object/from16 v39, v2

    .line 43
    :goto_27
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "couponAlias"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_2f

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v40, v3

    goto :goto_28

    :cond_2f
    move-object/from16 v40, v2

    .line 44
    :goto_28
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "campaignTemplateCode"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_30

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v42, v3

    goto :goto_29

    :cond_30
    move-object/from16 v42, v2

    .line 45
    :goto_29
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    const-string v5, "ruleUrl"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    const-string v7, "progressUrl"

    if-eqz v3, :cond_32

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_31

    goto :goto_2b

    :cond_31
    :goto_2a
    move-object/from16 v26, v3

    goto :goto_2c

    .line 46
    :cond_32
    :goto_2b
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_33

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    goto :goto_2a

    :cond_33
    move-object/from16 v26, v2

    .line 47
    :goto_2c
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_35

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_34

    goto :goto_2e

    :cond_34
    move-object/from16 v41, v3

    :goto_2d
    move-object/from16 v36, v4

    goto :goto_2f

    .line 48
    :cond_35
    :goto_2e
    iget-object v3, v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/gson/JsonElement;

    if-eqz v3, :cond_36

    invoke-static {v3}, Lcom/kubi/kumex/utils/u;->d(Lcom/google/gson/JsonElement;)Ljava/lang/String;

    move-result-object v2

    :cond_36
    move-object/from16 v41, v2

    goto :goto_2d

    .line 49
    :goto_2f
    new-instance v4, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    const v43, 0x4ec3618c

    move-object v5, v6

    move-object v6, v1

    invoke-direct/range {v4 .. v45}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ZLjava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string p2, "dest"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->couponId:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->welfareType:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->effectiveTime:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 21
    .line 22
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->expireTime:Ljava/lang/Long;

    .line 23
    const/4 v0, 0x1

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 37
    move-result-wide v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 41
    .line 42
    :goto_0
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->tag:Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    .line 47
    iget-object p2, p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareComposeItemEntity;->attributes:Ljava/util/Map;

    .line 48
    .line 49
    if-nez p2, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 53
    return-void

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 60
    move-result v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 67
    move-result-object p2

    .line 68
    .line 69
    .line 70
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    move-result-object p2

    .line 72
    .line 73
    .line 74
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    move-result v0

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    .line 80
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    check-cast v0, Ljava/util/Map$Entry;

    .line 84
    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    check-cast v1, Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 100
    goto :goto_1

    .line 101
    :cond_2
    return-void
.end method
