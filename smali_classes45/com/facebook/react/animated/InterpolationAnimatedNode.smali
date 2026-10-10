.class public final Lcom/facebook/react/animated/InterpolationAnimatedNode;
.super Lcom/facebook/react/animated/ValueAnimatedNode;
.source "InterpolationAnimatedNode.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;,
        Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;,
        Lcom/facebook/react/animated/InterpolationAnimatedNode$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0014H\u0016J\u0008\u0010\u0016\u001a\u00020\u0013H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0016J\u0008\u0010\u0018\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/facebook/react/animated/InterpolationAnimatedNode;",
        "Lcom/facebook/react/animated/ValueAnimatedNode;",
        "config",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "<init>",
        "(Lcom/facebook/react/bridge/ReadableMap;)V",
        "inputRange",
        "",
        "outputRange",
        "",
        "outputType",
        "Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;",
        "pattern",
        "",
        "extrapolateLeft",
        "extrapolateRight",
        "parent",
        "objectValue",
        "onAttachedToNode",
        "",
        "Lcom/facebook/react/animated/AnimatedNode;",
        "onDetachedFromNode",
        "update",
        "getAnimatedObject",
        "prettyPrint",
        "OutputType",
        "Companion",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInterpolationAnimatedNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InterpolationAnimatedNode.kt\ncom/facebook/react/animated/InterpolationAnimatedNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n1#2:280\n*E\n"
    }
.end annotation


# static fields
.field private static final COLOR_OUTPUT_TYPE:Ljava/lang/String; = "color"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final EXTRAPOLATE_TYPE_CLAMP:Ljava/lang/String; = "clamp"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final EXTRAPOLATE_TYPE_EXTEND:Ljava/lang/String; = "extend"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final EXTRAPOLATE_TYPE_IDENTITY:Ljava/lang/String; = "identity"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final numericPattern:Ljava/util/regex/Pattern;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final extrapolateLeft:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final extrapolateRight:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final inputRange:[D
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private objectValue:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private outputRange:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private outputType:Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private parent:Lcom/facebook/react/animated/ValueAnimatedNode;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private pattern:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->Companion:Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;

    .line 9
    .line 10
    const-string v0, "[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?"

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const-string v1, "compile(...)"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    sput-object v0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->numericPattern:Ljava/util/regex/Pattern;

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
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 4
    .param p1    # Lcom/facebook/react/bridge/ReadableMap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x1

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v1, v0, v1}, Lcom/facebook/react/animated/ValueAnimatedNode;-><init>(Lcom/facebook/react/bridge/ReadableMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    sget-object v0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->Companion:Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;

    .line 13
    .line 14
    const-string v2, "inputRange"

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v2}, Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;->access$fromDoubleArray(Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;Lcom/facebook/react/bridge/ReadableArray;)[D

    .line 22
    move-result-object v2

    .line 23
    .line 24
    iput-object v2, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->inputRange:[D

    .line 25
    .line 26
    const-string v2, "extrapolateLeft"

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    iput-object v2, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->extrapolateLeft:Ljava/lang/String;

    .line 33
    .line 34
    const-string v2, "extrapolateRight"

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    iput-object v2, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->extrapolateRight:Ljava/lang/String;

    .line 41
    .line 42
    const-string v2, "outputRange"

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    const-string v3, "outputType"

    .line 49
    .line 50
    .line 51
    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    const-string v3, "color"

    .line 55
    .line 56
    .line 57
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    move-result p1

    .line 59
    .line 60
    if-eqz p1, :cond_0

    .line 61
    .line 62
    sget-object p1, Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;->Color:Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;

    .line 63
    .line 64
    iput-object p1, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->outputType:Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v2}, Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;->access$fromIntArray(Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;Lcom/facebook/react/bridge/ReadableArray;)[I

    .line 68
    move-result-object p1

    .line 69
    .line 70
    iput-object p1, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->outputRange:Ljava/lang/Object;

    .line 71
    return-void

    .line 72
    :cond_0
    const/4 p1, 0x0

    .line 73
    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    .line 77
    invoke-interface {v2, p1}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    :cond_1
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    .line 81
    .line 82
    if-ne v1, v3, :cond_2

    .line 83
    .line 84
    sget-object v1, Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;->String:Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;

    .line 85
    .line 86
    iput-object v1, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->outputType:Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v2}, Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;->access$fromStringPattern(Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;Lcom/facebook/react/bridge/ReadableArray;)[[D

    .line 90
    move-result-object v0

    .line 91
    .line 92
    iput-object v0, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->outputRange:Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    invoke-interface {v2, p1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    iput-object p1, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->pattern:Ljava/lang/String;

    .line 99
    return-void

    .line 100
    .line 101
    :cond_2
    sget-object p1, Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;->Number:Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;

    .line 102
    .line 103
    iput-object p1, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->outputType:Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v2}, Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;->access$fromDoubleArray(Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;Lcom/facebook/react/bridge/ReadableArray;)[D

    .line 107
    move-result-object p1

    .line 108
    .line 109
    iput-object p1, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->outputRange:Ljava/lang/Object;

    .line 110
    return-void
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
.end method

.method public static final synthetic access$getNumericPattern$cp()Ljava/util/regex/Pattern;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->numericPattern:Ljava/util/regex/Pattern;

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


# virtual methods
.method public getAnimatedObject()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->objectValue:Ljava/lang/Object;

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

.method public onAttachedToNode(Lcom/facebook/react/animated/AnimatedNode;)V
    .locals 1
    .param p1    # Lcom/facebook/react/animated/AnimatedNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "parent"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->parent:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    instance-of v0, p1, Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 16
    .line 17
    iput-object p1, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->parent:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 21
    .line 22
    const-string v0, "Parent is of an invalid type"

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 26
    throw p1

    .line 27
    .line 28
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "Parent already attached"

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    throw p1
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
.end method

.method public onDetachedFromNode(Lcom/facebook/react/animated/AnimatedNode;)V
    .locals 1
    .param p1    # Lcom/facebook/react/animated/AnimatedNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "parent"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->parent:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    const/4 p1, 0x0

    .line 11
    .line 12
    iput-object p1, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->parent:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string v0, "Invalid parent node provided"

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    throw p1
    .line 22
    .line 23
.end method

.method public prettyPrint()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/animated/AnimatedNode;->tag:I

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "InterpolationAnimatedNode["

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, "] super: {super.prettyPrint()}"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
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
.end method

.method public update()V
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->parent:Lcom/facebook/react/animated/ValueAnimatedNode;

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/animated/ValueAnimatedNode;->getValue()D

    .line 8
    move-result-wide v2

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->outputType:Lcom/facebook/react/animated/InterpolationAnimatedNode$OutputType;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    const/4 v0, -0x1

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    sget-object v1, Lcom/facebook/react/animated/InterpolationAnimatedNode$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 20
    move-result v0

    .line 21
    .line 22
    aget v0, v1, v0

    .line 23
    :goto_0
    const/4 v1, 0x1

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    const/4 v1, 0x2

    .line 27
    .line 28
    if-eq v0, v1, :cond_2

    .line 29
    const/4 v1, 0x3

    .line 30
    .line 31
    if-eq v0, v1, :cond_1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-wide v3, v2

    .line 34
    .line 35
    iget-object v2, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->pattern:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    sget-object v1, Lcom/facebook/react/animated/InterpolationAnimatedNode;->Companion:Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;

    .line 40
    .line 41
    iget-object v5, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->inputRange:[D

    .line 42
    .line 43
    iget-object v0, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->outputRange:Ljava/lang/Object;

    .line 44
    .line 45
    const-string v6, "null cannot be cast to non-null type kotlin.Array<kotlin.DoubleArray>"

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    move-object v6, v0

    .line 50
    .line 51
    check-cast v6, [[D

    .line 52
    .line 53
    iget-object v7, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->extrapolateLeft:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v8, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->extrapolateRight:Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual/range {v1 .. v8}, Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;->interpolateString(Ljava/lang/String;D[D[[DLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    iput-object v0, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->objectValue:Ljava/lang/Object;

    .line 62
    return-void

    .line 63
    :cond_2
    move-wide v3, v2

    .line 64
    .line 65
    sget-object v0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->Companion:Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;

    .line 66
    .line 67
    iget-object v1, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->inputRange:[D

    .line 68
    .line 69
    iget-object v2, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->outputRange:Ljava/lang/Object;

    .line 70
    .line 71
    const-string v5, "null cannot be cast to non-null type kotlin.IntArray"

    .line 72
    .line 73
    .line 74
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    check-cast v2, [I

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v3, v4, v1, v2}, Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;->interpolateColor(D[D[I)I

    .line 80
    move-result v0

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    iput-object v0, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->objectValue:Ljava/lang/Object;

    .line 87
    return-void

    .line 88
    :cond_3
    move-wide v3, v2

    .line 89
    .line 90
    sget-object v1, Lcom/facebook/react/animated/InterpolationAnimatedNode;->Companion:Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;

    .line 91
    move-wide v2, v3

    .line 92
    .line 93
    iget-object v4, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->inputRange:[D

    .line 94
    .line 95
    iget-object v0, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->outputRange:Ljava/lang/Object;

    .line 96
    .line 97
    const-string v5, "null cannot be cast to non-null type kotlin.DoubleArray"

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    move-object v5, v0

    .line 102
    .line 103
    check-cast v5, [D

    .line 104
    .line 105
    iget-object v6, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->extrapolateLeft:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v7, p0, Lcom/facebook/react/animated/InterpolationAnimatedNode;->extrapolateRight:Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v1 .. v7}, Lcom/facebook/react/animated/InterpolationAnimatedNode$Companion;->interpolate(D[D[DLjava/lang/String;Ljava/lang/String;)D

    .line 111
    move-result-wide v0

    .line 112
    .line 113
    iput-wide v0, p0, Lcom/facebook/react/animated/ValueAnimatedNode;->nodeValue:D

    .line 114
    :cond_4
    :goto_1
    return-void
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
.end method
