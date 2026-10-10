.class public Lkotlinx/serialization/json/internal/r0;
.super Lkotlinx/serialization/encoding/a;
.source "StreamingJsonDecoder.kt"

# interfaces
.implements Lxg0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlinx/serialization/json/internal/r0$a;,
        Lkotlinx/serialization/json/internal/r0$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0001\n\u0002\u0008\u0007\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0010\n\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000c\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u0012*\u0004\u0018\u00010\u000c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008)\u0010*J#\u0010.\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010+2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00028\u00000,H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u00081\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u00083\u0010\u0017J\u000f\u00104\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u00084\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016\u00a2\u0006\u0004\u00087\u00108J=\u0010:\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010+2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00028\u00000,2\u0008\u00109\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u0017\u0010<\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008<\u0010!J\u000f\u0010=\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008=\u00105J\u000f\u0010?\u001a\u00020>H\u0016\u00a2\u0006\u0004\u0008?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016\u00a2\u0006\u0004\u0008B\u0010CJ\u000f\u0010D\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008D\u0010\u001cJ\u000f\u0010F\u001a\u00020EH\u0016\u00a2\u0006\u0004\u0008F\u0010GJ\u000f\u0010I\u001a\u00020HH\u0016\u00a2\u0006\u0004\u0008I\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016\u00a2\u0006\u0004\u0008L\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016\u00a2\u0006\u0004\u0008O\u0010PJ\u000f\u0010Q\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008Q\u0010\'J\u0017\u0010S\u001a\u00020R2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008S\u0010TJ\u0017\u0010V\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008V\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008W\u0010X\u001a\u0004\u0008W\u0010YR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010ZR\u0014\u0010\t\u001a\u00020\u00088\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010[R\u001a\u0010`\u001a\u00020\\8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010]\u001a\u0004\u0008^\u0010_R\u0016\u0010b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010cR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010eR\u0016\u0010i\u001a\u0004\u0018\u00010g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010h\u00a8\u0006j"
    }
    d2 = {
        "Lkotlinx/serialization/json/internal/r0;",
        "Lxg0/g;",
        "",
        "Lkotlinx/serialization/encoding/a;",
        "Lxg0/a;",
        "json",
        "Lkotlinx/serialization/json/internal/WriteMode;",
        "mode",
        "Lkotlinx/serialization/json/internal/a;",
        "lexer",
        "Lvg0/f;",
        "descriptor",
        "Lkotlinx/serialization/json/internal/r0$a;",
        "discriminatorHolder",
        "<init>",
        "(Lxg0/a;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/a;Lvg0/f;Lkotlinx/serialization/json/internal/r0$a;)V",
        "",
        "unknownKey",
        "",
        "k",
        "(Lkotlinx/serialization/json/internal/r0$a;Ljava/lang/String;)Z",
        "",
        "j",
        "(Lvg0/f;)V",
        "c",
        "()V",
        "",
        "f",
        "()I",
        "index",
        "d",
        "(Lvg0/f;I)Z",
        "g",
        "(Lvg0/f;)I",
        "key",
        "i",
        "(Ljava/lang/String;)Z",
        "e",
        "h",
        "()Ljava/lang/String;",
        "Lkotlinx/serialization/json/JsonElement;",
        "b",
        "()Lkotlinx/serialization/json/JsonElement;",
        "T",
        "Ltg0/c;",
        "deserializer",
        "decodeSerializableValue",
        "(Ltg0/c;)Ljava/lang/Object;",
        "Lkotlinx/serialization/encoding/CompositeDecoder;",
        "beginStructure",
        "(Lvg0/f;)Lkotlinx/serialization/encoding/CompositeDecoder;",
        "endStructure",
        "decodeNotNullMark",
        "()Z",
        "",
        "decodeNull",
        "()Ljava/lang/Void;",
        "previousValue",
        "decodeSerializableElement",
        "(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;",
        "decodeElementIndex",
        "decodeBoolean",
        "",
        "decodeByte",
        "()B",
        "",
        "decodeShort",
        "()S",
        "decodeInt",
        "",
        "decodeLong",
        "()J",
        "",
        "decodeFloat",
        "()F",
        "",
        "decodeDouble",
        "()D",
        "",
        "decodeChar",
        "()C",
        "decodeString",
        "Lkotlinx/serialization/encoding/b;",
        "decodeInline",
        "(Lvg0/f;)Lkotlinx/serialization/encoding/b;",
        "enumDescriptor",
        "decodeEnum",
        "a",
        "Lxg0/a;",
        "()Lxg0/a;",
        "Lkotlinx/serialization/json/internal/WriteMode;",
        "Lkotlinx/serialization/json/internal/a;",
        "Lyg0/a;",
        "Lyg0/a;",
        "getSerializersModule",
        "()Lyg0/a;",
        "serializersModule",
        "I",
        "currentIndex",
        "Lkotlinx/serialization/json/internal/r0$a;",
        "Lxg0/f;",
        "Lxg0/f;",
        "configuration",
        "Lkotlinx/serialization/json/internal/JsonElementMarker;",
        "Lkotlinx/serialization/json/internal/JsonElementMarker;",
        "elementMarker",
        "kotlinx-serialization-json"
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
        "SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n+ 2 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 4 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 5 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 6 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,391:1\n76#2,6:392\n82#2,9:406\n271#3,8:398\n513#4,3:415\n513#4,3:418\n133#5,18:421\n384#6,5:439\n384#6,5:444\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoder\n*L\n75#1:392,6\n75#1:406,9\n75#1:398,8\n202#1:415,3\n203#1:418,3\n215#1:421,18\n308#1:439,5\n315#1:444,5\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lxg0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lkotlinx/serialization/json/internal/WriteMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lkotlinx/serialization/json/internal/a;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lyg0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:I

.field public f:Lkotlinx/serialization/json/internal/r0$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final g:Lxg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lkotlinx/serialization/json/internal/JsonElementMarker;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxg0/a;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/a;Lvg0/f;Lkotlinx/serialization/json/internal/r0$a;)V
    .locals 1
    .param p1    # Lxg0/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlinx/serialization/json/internal/WriteMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlinx/serialization/json/internal/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lvg0/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlinx/serialization/json/internal/r0$a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "json"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "mode"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "lexer"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "descriptor"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lkotlinx/serialization/encoding/a;-><init>()V

    .line 24
    .line 25
    iput-object p1, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 26
    .line 27
    iput-object p2, p0, Lkotlinx/serialization/json/internal/r0;->b:Lkotlinx/serialization/json/internal/WriteMode;

    .line 28
    .line 29
    iput-object p3, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lxg0/a;->getSerializersModule()Lyg0/a;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    iput-object p2, p0, Lkotlinx/serialization/json/internal/r0;->d:Lyg0/a;

    .line 36
    const/4 p2, -0x1

    .line 37
    .line 38
    iput p2, p0, Lkotlinx/serialization/json/internal/r0;->e:I

    .line 39
    .line 40
    iput-object p5, p0, Lkotlinx/serialization/json/internal/r0;->f:Lkotlinx/serialization/json/internal/r0$a;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lxg0/a;->e()Lxg0/f;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    iput-object p1, p0, Lkotlinx/serialization/json/internal/r0;->g:Lxg0/f;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lxg0/f;->j()Z

    .line 50
    move-result p1

    .line 51
    .line 52
    if-eqz p1, :cond_0

    .line 53
    const/4 p1, 0x0

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_0
    new-instance p1, Lkotlinx/serialization/json/internal/JsonElementMarker;

    .line 57
    .line 58
    .line 59
    invoke-direct {p1, p4}, Lkotlinx/serialization/json/internal/JsonElementMarker;-><init>(Lvg0/f;)V

    .line 60
    .line 61
    :goto_0
    iput-object p1, p0, Lkotlinx/serialization/json/internal/r0;->h:Lkotlinx/serialization/json/internal/JsonElementMarker;

    .line 62
    return-void
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
.end method


# virtual methods
.method public final a()Lxg0/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

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

.method public b()Lkotlinx/serialization/json/JsonElement;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/json/internal/JsonTreeReader;

    .line 3
    .line 4
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lxg0/a;->e()Lxg0/f;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/json/internal/JsonTreeReader;-><init>(Lxg0/f;Lkotlinx/serialization/json/internal/a;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/JsonTreeReader;->e()Lkotlinx/serialization/json/JsonElement;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method public beginStructure(Lvg0/f;)Lkotlinx/serialization/encoding/CompositeDecoder;
    .locals 7
    .param p1    # Lvg0/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "descriptor"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lkotlinx/serialization/json/internal/b1;->b(Lxg0/a;Lvg0/f;)Lkotlinx/serialization/json/internal/WriteMode;

    .line 11
    move-result-object v3

    .line 12
    .line 13
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 14
    .line 15
    iget-object v0, v0, Lkotlinx/serialization/json/internal/a;->b:Lkotlinx/serialization/json/internal/e0;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lkotlinx/serialization/json/internal/e0;->c(Lvg0/f;)V

    .line 19
    .line 20
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 21
    .line 22
    iget-char v1, v3, Lkotlinx/serialization/json/internal/WriteMode;->begin:C

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lkotlinx/serialization/json/internal/a;->l(C)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lkotlinx/serialization/json/internal/r0;->c()V

    .line 29
    .line 30
    sget-object v0, Lkotlinx/serialization/json/internal/r0$b;->$EnumSwitchMapping$0:[I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 34
    move-result v1

    .line 35
    .line 36
    aget v0, v0, v1

    .line 37
    const/4 v1, 0x1

    .line 38
    .line 39
    if-eq v0, v1, :cond_1

    .line 40
    const/4 v1, 0x2

    .line 41
    .line 42
    if-eq v0, v1, :cond_1

    .line 43
    const/4 v1, 0x3

    .line 44
    .line 45
    if-eq v0, v1, :cond_1

    .line 46
    .line 47
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->b:Lkotlinx/serialization/json/internal/WriteMode;

    .line 48
    .line 49
    if-ne v0, v3, :cond_0

    .line 50
    .line 51
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lxg0/a;->e()Lxg0/f;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lxg0/f;->j()Z

    .line 59
    move-result v0

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    return-object p0

    .line 63
    .line 64
    :cond_0
    new-instance v1, Lkotlinx/serialization/json/internal/r0;

    .line 65
    .line 66
    iget-object v2, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 67
    .line 68
    iget-object v4, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 69
    .line 70
    iget-object v6, p0, Lkotlinx/serialization/json/internal/r0;->f:Lkotlinx/serialization/json/internal/r0$a;

    .line 71
    move-object v5, p1

    .line 72
    .line 73
    .line 74
    invoke-direct/range {v1 .. v6}, Lkotlinx/serialization/json/internal/r0;-><init>(Lxg0/a;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/a;Lvg0/f;Lkotlinx/serialization/json/internal/r0$a;)V

    .line 75
    return-object v1

    .line 76
    :cond_1
    move-object v5, p1

    .line 77
    .line 78
    new-instance v1, Lkotlinx/serialization/json/internal/r0;

    .line 79
    .line 80
    iget-object v2, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 81
    .line 82
    iget-object v4, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 83
    .line 84
    iget-object v6, p0, Lkotlinx/serialization/json/internal/r0;->f:Lkotlinx/serialization/json/internal/r0$a;

    .line 85
    .line 86
    .line 87
    invoke-direct/range {v1 .. v6}, Lkotlinx/serialization/json/internal/r0;-><init>(Lxg0/a;Lkotlinx/serialization/json/internal/WriteMode;Lkotlinx/serialization/json/internal/a;Lvg0/f;Lkotlinx/serialization/json/internal/r0$a;)V

    .line 88
    return-object v1
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

.method public final c()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->F()B

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x4

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object v2, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 13
    const/4 v6, 0x6

    .line 14
    const/4 v7, 0x0

    .line 15
    .line 16
    const-string v3, "Unexpected leading comma"

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static/range {v2 .. v7}, Lkotlinx/serialization/json/internal/a;->x(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 22
    .line 23
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 27
    throw v0
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
.end method

.method public final d(Lvg0/f;I)Z
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1, p2}, Lvg0/f;->i(I)Z

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, p2}, Lvg0/f;->d(I)Lvg0/f;

    .line 10
    move-result-object p1

    .line 11
    const/4 p2, 0x1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lvg0/f;->b()Z

    .line 17
    move-result v2

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p2}, Lkotlinx/serialization/json/internal/a;->N(Z)Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    return p2

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-interface {p1}, Lvg0/f;->getKind()Lvg0/n;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    sget-object v3, Lvg0/n$b;->a:Lvg0/n$b;

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result v2

    .line 39
    const/4 v3, 0x0

    .line 40
    .line 41
    if-eqz v2, :cond_5

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Lvg0/f;->b()Z

    .line 45
    move-result v2

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    iget-object v2, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3}, Lkotlinx/serialization/json/internal/a;->N(Z)Z

    .line 53
    move-result v2

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    return v3

    .line 57
    .line 58
    :cond_1
    iget-object v2, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 59
    .line 60
    iget-object v4, p0, Lkotlinx/serialization/json/internal/r0;->g:Lxg0/f;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Lxg0/f;->q()Z

    .line 64
    move-result v4

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v4}, Lkotlinx/serialization/json/internal/a;->G(Z)Ljava/lang/String;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    if-nez v2, :cond_2

    .line 71
    return v3

    .line 72
    .line 73
    .line 74
    :cond_2
    invoke-static {p1, v0, v2}, Lkotlinx/serialization/json/internal/d0;->i(Lvg0/f;Lxg0/a;Ljava/lang/String;)I

    .line 75
    move-result v2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lxg0/a;->e()Lxg0/f;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lxg0/f;->j()Z

    .line 83
    move-result v0

    .line 84
    .line 85
    if-nez v0, :cond_3

    .line 86
    .line 87
    .line 88
    invoke-interface {p1}, Lvg0/f;->b()Z

    .line 89
    move-result p1

    .line 90
    .line 91
    if-eqz p1, :cond_3

    .line 92
    move p1, p2

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    move p1, v3

    .line 95
    :goto_0
    const/4 v0, -0x3

    .line 96
    .line 97
    if-ne v2, v0, :cond_5

    .line 98
    .line 99
    if-nez v1, :cond_4

    .line 100
    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    :cond_4
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lkotlinx/serialization/json/internal/a;->o()Ljava/lang/String;

    .line 107
    return p2

    .line 108
    :cond_5
    return v3
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

.method public decodeBoolean()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->g()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public decodeByte()B
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->m()J

    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-byte v2, v2

    .line 9
    int-to-long v3, v2

    .line 10
    .line 11
    cmp-long v3, v0, v3

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    return v2

    .line 15
    .line 16
    :cond_0
    iget-object v4, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    const-string v3, "Failed to parse byte for input \'"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const/16 v0, 0x27

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object v5

    .line 39
    const/4 v8, 0x6

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static/range {v4 .. v9}, Lkotlinx/serialization/json/internal/a;->x(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 46
    .line 47
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 48
    .line 49
    .line 50
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 51
    throw v0
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
.end method

.method public decodeChar()C
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->q()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    .line 21
    :cond_0
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    const-string v3, "Expected single char, but got \'"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const/16 v0, 0x27

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object v2

    .line 44
    const/4 v5, 0x6

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    .line 49
    .line 50
    invoke-static/range {v1 .. v6}, Lkotlinx/serialization/json/internal/a;->x(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 51
    .line 52
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 56
    throw v0
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
.end method

.method public decodeDouble()D
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->q()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 10
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    iget-object v2, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lxg0/a;->e()Lxg0/f;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Lxg0/f;->b()Z

    .line 20
    move-result v2

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 26
    move-result v2

    .line 27
    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-nez v2, :cond_0

    .line 35
    return-wide v0

    .line 36
    .line 37
    :cond_0
    iget-object v2, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v0}, Lkotlinx/serialization/json/internal/b0;->l(Lkotlinx/serialization/json/internal/a;Ljava/lang/Number;)Ljava/lang/Void;

    .line 45
    .line 46
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 47
    .line 48
    .line 49
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 50
    throw v0

    .line 51
    :cond_1
    return-wide v0

    .line 52
    .line 53
    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    const-string v3, "Failed to parse type \'"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v3, "double"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v3, "\' for input \'"

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const/16 v1, 0x27

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    move-result-object v1

    .line 84
    const/4 v4, 0x6

    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    .line 89
    .line 90
    invoke-static/range {v0 .. v5}, Lkotlinx/serialization/json/internal/a;->x(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 91
    .line 92
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 93
    .line 94
    .line 95
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 96
    throw v0
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
.end method

.method public decodeElementIndex(Lvg0/f;)I
    .locals 2
    .param p1    # Lvg0/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "descriptor"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->b:Lkotlinx/serialization/json/internal/WriteMode;

    .line 8
    .line 9
    sget-object v1, Lkotlinx/serialization/json/internal/r0$b;->$EnumSwitchMapping$0:[I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    move-result v0

    .line 14
    .line 15
    aget v0, v1, v0

    .line 16
    const/4 v1, 0x2

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    const/4 v1, 0x4

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lkotlinx/serialization/json/internal/r0;->e()I

    .line 25
    move-result p1

    .line 26
    goto :goto_0

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/r0;->g(Lvg0/f;)I

    .line 30
    move-result p1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lkotlinx/serialization/json/internal/r0;->f()I

    .line 35
    move-result p1

    .line 36
    .line 37
    :goto_0
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->b:Lkotlinx/serialization/json/internal/WriteMode;

    .line 38
    .line 39
    sget-object v1, Lkotlinx/serialization/json/internal/WriteMode;->MAP:Lkotlinx/serialization/json/internal/WriteMode;

    .line 40
    .line 41
    if-eq v0, v1, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 44
    .line 45
    iget-object v0, v0, Lkotlinx/serialization/json/internal/a;->b:Lkotlinx/serialization/json/internal/e0;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lkotlinx/serialization/json/internal/e0;->g(I)V

    .line 49
    :cond_2
    return p1
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
.end method

.method public decodeEnum(Lvg0/f;)I
    .locals 4
    .param p1    # Lvg0/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "enumDescriptor"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lkotlinx/serialization/json/internal/r0;->decodeString()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    const-string v3, " at path "

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    iget-object v3, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 24
    .line 25
    iget-object v3, v3, Lkotlinx/serialization/json/internal/a;->b:Lkotlinx/serialization/json/internal/e0;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Lkotlinx/serialization/json/internal/e0;->a()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0, v1, v2}, Lkotlinx/serialization/json/internal/d0;->j(Lvg0/f;Lxg0/a;Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    move-result p1

    .line 41
    return p1
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
.end method

.method public decodeFloat()F
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->q()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 10
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lxg0/a;->e()Lxg0/f;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lxg0/f;->b()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    .line 26
    move-result v1

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    return v0

    .line 36
    .line 37
    :cond_0
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v0}, Lkotlinx/serialization/json/internal/b0;->l(Lkotlinx/serialization/json/internal/a;Ljava/lang/Number;)Ljava/lang/Void;

    .line 45
    .line 46
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 47
    .line 48
    .line 49
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 50
    throw v0

    .line 51
    :cond_1
    return v0

    .line 52
    .line 53
    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    const-string v3, "Failed to parse type \'"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v3, "float"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v3, "\' for input \'"

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const/16 v1, 0x27

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    move-result-object v1

    .line 84
    const/4 v4, 0x6

    .line 85
    const/4 v5, 0x0

    .line 86
    const/4 v2, 0x0

    .line 87
    const/4 v3, 0x0

    .line 88
    .line 89
    .line 90
    invoke-static/range {v0 .. v5}, Lkotlinx/serialization/json/internal/a;->x(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 91
    .line 92
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 93
    .line 94
    .line 95
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 96
    throw v0
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
.end method

.method public decodeInline(Lvg0/f;)Lkotlinx/serialization/encoding/b;
    .locals 2
    .param p1    # Lvg0/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "descriptor"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lkotlinx/serialization/json/internal/t0;->b(Lvg0/f;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance p1, Lkotlinx/serialization/json/internal/a0;

    .line 14
    .line 15
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 16
    .line 17
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, v0, v1}, Lkotlinx/serialization/json/internal/a0;-><init>(Lkotlinx/serialization/json/internal/a;Lxg0/a;)V

    .line 21
    return-object p1

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-super {p0, p1}, Lkotlinx/serialization/encoding/a;->decodeInline(Lvg0/f;)Lkotlinx/serialization/encoding/b;

    .line 25
    move-result-object p1

    .line 26
    return-object p1
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public decodeInt()I
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->m()J

    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-long v3, v2

    .line 9
    .line 10
    cmp-long v3, v0, v3

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    return v2

    .line 14
    .line 15
    :cond_0
    iget-object v4, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    const-string v3, "Failed to parse int for input \'"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const/16 v0, 0x27

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    move-result-object v5

    .line 38
    const/4 v8, 0x6

    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v4 .. v9}, Lkotlinx/serialization/json/internal/a;->x(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 45
    .line 46
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 47
    .line 48
    .line 49
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 50
    throw v0
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
.end method

.method public decodeLong()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->m()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public decodeNotNullMark()Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->h:Lkotlinx/serialization/json/internal/JsonElementMarker;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/JsonElementMarker;->b()Z

    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1, v3, v2}, Lkotlinx/serialization/json/internal/a;->O(Lkotlinx/serialization/json/internal/a;ZILjava/lang/Object;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    return v3

    .line 25
    :cond_1
    return v1
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
.end method

.method public decodeNull()Ljava/lang/Void;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
.end method

.method public decodeSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lvg0/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltg0/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lvg0/f;",
            "I",
            "Ltg0/c<",
            "+TT;>;TT;)TT;"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "descriptor"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "deserializer"

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->b:Lkotlinx/serialization/json/internal/WriteMode;

    .line 13
    .line 14
    sget-object v1, Lkotlinx/serialization/json/internal/WriteMode;->MAP:Lkotlinx/serialization/json/internal/WriteMode;

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    and-int/lit8 v0, p2, 0x1

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 28
    .line 29
    iget-object v1, v1, Lkotlinx/serialization/json/internal/a;->b:Lkotlinx/serialization/json/internal/e0;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lkotlinx/serialization/json/internal/e0;->d()V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Lkotlinx/serialization/encoding/a;->decodeSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object p2, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 41
    .line 42
    iget-object p2, p2, Lkotlinx/serialization/json/internal/a;->b:Lkotlinx/serialization/json/internal/e0;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, p1}, Lkotlinx/serialization/json/internal/e0;->f(Ljava/lang/Object;)V

    .line 46
    :cond_2
    return-object p1
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

.method public decodeSerializableValue(Ltg0/c;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ltg0/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ltg0/c<",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "deserializer"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    :try_start_0
    instance-of v0, p1, Lkotlinx/serialization/internal/b;

    .line 10
    .line 11
    if-eqz v0, :cond_6

    .line 12
    .line 13
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lxg0/a;->e()Lxg0/f;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lxg0/f;->p()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    :cond_0
    move-object v0, p1

    .line 27
    .line 28
    check-cast v0, Lkotlinx/serialization/internal/b;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ltg0/d;->getDescriptor()Lvg0/f;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget-object v3, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v3}, Lkotlinx/serialization/json/internal/p0;->c(Lvg0/f;Lxg0/a;)Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    iget-object v3, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 41
    .line 42
    iget-object v4, p0, Lkotlinx/serialization/json/internal/r0;->g:Lxg0/f;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4}, Lxg0/f;->q()Z

    .line 46
    move-result v4

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v0, v4}, Lkotlinx/serialization/json/internal/a;->E(Ljava/lang/String;Z)Ljava/lang/String;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    if-nez v3, :cond_5

    .line 53
    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    .line 57
    invoke-interface {p0}, Lxg0/g;->a()Lxg0/a;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lxg0/a;->e()Lxg0/f;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lxg0/f;->p()Z

    .line 66
    move-result v0

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    goto/16 :goto_1

    .line 71
    :cond_1
    move-object v0, p1

    .line 72
    .line 73
    check-cast v0, Lkotlinx/serialization/internal/b;

    .line 74
    .line 75
    .line 76
    invoke-interface {v0}, Ltg0/d;->getDescriptor()Lvg0/f;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    .line 80
    invoke-interface {p0}, Lxg0/g;->a()Lxg0/a;

    .line 81
    move-result-object v3

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v3}, Lkotlinx/serialization/json/internal/p0;->c(Lvg0/f;Lxg0/a;)Ljava/lang/String;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    .line 88
    invoke-interface {p0}, Lxg0/g;->b()Lkotlinx/serialization/json/JsonElement;

    .line 89
    move-result-object v3

    .line 90
    move-object v4, p1

    .line 91
    .line 92
    check-cast v4, Lkotlinx/serialization/internal/b;

    .line 93
    .line 94
    .line 95
    invoke-interface {v4}, Ltg0/d;->getDescriptor()Lvg0/f;

    .line 96
    move-result-object v4

    .line 97
    .line 98
    .line 99
    invoke-interface {v4}, Lvg0/f;->h()Ljava/lang/String;

    .line 100
    move-result-object v4

    .line 101
    .line 102
    instance-of v5, v3, Lkotlinx/serialization/json/JsonObject;

    .line 103
    const/4 v6, -0x1

    .line 104
    .line 105
    if-eqz v5, :cond_3

    .line 106
    .line 107
    check-cast v3, Lkotlinx/serialization/json/JsonObject;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    move-result-object v4

    .line 112
    .line 113
    check-cast v4, Lkotlinx/serialization/json/JsonElement;

    .line 114
    .line 115
    if-eqz v4, :cond_2

    .line 116
    .line 117
    .line 118
    invoke-static {v4}, Lxg0/i;->l(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    .line 119
    move-result-object v4

    .line 120
    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    .line 124
    invoke-static {v4}, Lxg0/i;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    .line 125
    move-result-object v4
    :try_end_0
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    goto :goto_0

    .line 127
    :catch_0
    move-exception v0

    .line 128
    move-object p1, v0

    .line 129
    .line 130
    goto/16 :goto_3

    .line 131
    :cond_2
    move-object v4, v2

    .line 132
    .line 133
    :goto_0
    :try_start_1
    check-cast p1, Lkotlinx/serialization/internal/b;

    .line 134
    .line 135
    .line 136
    invoke-static {p1, p0, v4}, Ltg0/i;->a(Lkotlinx/serialization/internal/b;Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Ltg0/c;

    .line 137
    move-result-object p1
    :try_end_1
    .catch Lkotlinx/serialization/SerializationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 138
    .line 139
    :try_start_2
    const-string v4, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>"

    .line 140
    .line 141
    .line 142
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p0}, Lxg0/g;->a()Lxg0/a;

    .line 146
    move-result-object v4

    .line 147
    .line 148
    .line 149
    invoke-static {v4, v0, v3, p1}, Lkotlinx/serialization/json/internal/y0;->b(Lxg0/a;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ltg0/c;)Ljava/lang/Object;

    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    :catch_1
    move-exception v0

    .line 153
    move-object p1, v0

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 157
    move-result-object p1

    .line 158
    .line 159
    .line 160
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3}, Lkotlinx/serialization/json/JsonObject;->toString()Ljava/lang/String;

    .line 164
    move-result-object v0

    .line 165
    .line 166
    .line 167
    invoke-static {v6, p1, v0}, Lkotlinx/serialization/json/internal/b0;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    .line 168
    move-result-object p1

    .line 169
    throw p1

    .line 170
    .line 171
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    const-string v0, "Expected "

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-class v0, Lkotlinx/serialization/json/JsonObject;

    .line 182
    .line 183
    .line 184
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 185
    move-result-object v0

    .line 186
    .line 187
    .line 188
    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v0, ", but had "

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    .line 204
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 205
    move-result-object v0

    .line 206
    .line 207
    .line 208
    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 209
    move-result-object v0

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    const-string v0, " as the serialized body of "

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v0, " at element: "

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 228
    .line 229
    iget-object v0, v0, Lkotlinx/serialization/json/internal/a;->b:Lkotlinx/serialization/json/internal/e0;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/e0;->a()Ljava/lang/String;

    .line 233
    move-result-object v0

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    move-result-object p1

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 244
    move-result-object v0

    .line 245
    .line 246
    .line 247
    invoke-static {v6, p1, v0}, Lkotlinx/serialization/json/internal/b0;->f(ILjava/lang/String;Ljava/lang/CharSequence;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    .line 248
    move-result-object p1

    .line 249
    throw p1

    .line 250
    .line 251
    .line 252
    :cond_4
    :goto_1
    invoke-interface {p1, p0}, Ltg0/c;->deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;

    .line 253
    move-result-object p1
    :try_end_2
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_2 .. :try_end_2} :catch_0

    .line 254
    return-object p1

    .line 255
    .line 256
    :cond_5
    :try_start_3
    check-cast p1, Lkotlinx/serialization/internal/b;

    .line 257
    .line 258
    .line 259
    invoke-static {p1, p0, v3}, Ltg0/i;->a(Lkotlinx/serialization/internal/b;Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Ltg0/c;

    .line 260
    move-result-object p1
    :try_end_3
    .catch Lkotlinx/serialization/SerializationException; {:try_start_3 .. :try_end_3} :catch_2

    .line 261
    .line 262
    :try_start_4
    const-string v3, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue>"

    .line 263
    .line 264
    .line 265
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    new-instance v3, Lkotlinx/serialization/json/internal/r0$a;

    .line 268
    .line 269
    .line 270
    invoke-direct {v3, v0}, Lkotlinx/serialization/json/internal/r0$a;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    iput-object v3, p0, Lkotlinx/serialization/json/internal/r0;->f:Lkotlinx/serialization/json/internal/r0$a;

    .line 273
    .line 274
    .line 275
    invoke-interface {p1, p0}, Ltg0/c;->deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;

    .line 276
    move-result-object p1

    .line 277
    return-object p1

    .line 278
    :catch_2
    move-exception v0

    .line 279
    move-object p1, v0

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 283
    move-result-object v0

    .line 284
    .line 285
    .line 286
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 287
    .line 288
    const/16 v3, 0xa

    .line 289
    .line 290
    .line 291
    invoke-static {v0, v3, v2, v1, v2}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 292
    move-result-object v0

    .line 293
    .line 294
    const-string v4, "."

    .line 295
    .line 296
    .line 297
    invoke-static {v0, v4}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 298
    move-result-object v6

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 302
    move-result-object p1

    .line 303
    .line 304
    .line 305
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 306
    .line 307
    const-string v0, ""

    .line 308
    .line 309
    .line 310
    invoke-static {p1, v3, v0}, Lkotlin/text/StringsKt;->substringAfter(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 311
    move-result-object v8

    .line 312
    .line 313
    iget-object v5, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 314
    const/4 v9, 0x2

    .line 315
    const/4 v10, 0x0

    .line 316
    const/4 v7, 0x0

    .line 317
    .line 318
    .line 319
    invoke-static/range {v5 .. v10}, Lkotlinx/serialization/json/internal/a;->x(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 320
    .line 321
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 322
    .line 323
    .line 324
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 325
    throw p1

    .line 326
    .line 327
    .line 328
    :cond_6
    :goto_2
    invoke-interface {p1, p0}, Ltg0/c;->deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;

    .line 329
    move-result-object p1
    :try_end_4
    .catch Lkotlinx/serialization/MissingFieldException; {:try_start_4 .. :try_end_4} :catch_0

    .line 330
    return-object p1

    .line 331
    .line 332
    .line 333
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 334
    move-result-object v0

    .line 335
    .line 336
    .line 337
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 338
    .line 339
    const-string v3, "at path"

    .line 340
    const/4 v4, 0x0

    .line 341
    .line 342
    .line 343
    invoke-static {v0, v3, v4, v1, v2}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 344
    move-result v0

    .line 345
    .line 346
    if-eqz v0, :cond_7

    .line 347
    throw p1

    .line 348
    .line 349
    :cond_7
    new-instance v0, Lkotlinx/serialization/MissingFieldException;

    .line 350
    .line 351
    .line 352
    invoke-virtual {p1}, Lkotlinx/serialization/MissingFieldException;->getMissingFields()Ljava/util/List;

    .line 353
    move-result-object v1

    .line 354
    .line 355
    new-instance v2, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 362
    move-result-object v3

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    const-string v3, " at path: "

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    iget-object v3, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 373
    .line 374
    iget-object v3, v3, Lkotlinx/serialization/json/internal/a;->b:Lkotlinx/serialization/json/internal/e0;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v3}, Lkotlinx/serialization/json/internal/e0;->a()Ljava/lang/String;

    .line 378
    move-result-object v3

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    move-result-object v2

    .line 386
    .line 387
    .line 388
    invoke-direct {v0, v1, v2, p1}, Lkotlinx/serialization/MissingFieldException;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 389
    throw v0
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

.method public decodeShort()S
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->m()J

    .line 6
    move-result-wide v0

    .line 7
    long-to-int v2, v0

    .line 8
    int-to-short v2, v2

    .line 9
    int-to-long v3, v2

    .line 10
    .line 11
    cmp-long v3, v0, v3

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    return v2

    .line 15
    .line 16
    :cond_0
    iget-object v4, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    const-string v3, "Failed to parse short for input \'"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const/16 v0, 0x27

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    move-result-object v5

    .line 39
    const/4 v8, 0x6

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static/range {v4 .. v9}, Lkotlinx/serialization/json/internal/a;->x(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 46
    .line 47
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 48
    .line 49
    .line 50
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 51
    throw v0
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
.end method

.method public decodeString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->g:Lxg0/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lxg0/f;->q()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->r()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->o()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    return-object v0
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
.end method

.method public final e()I
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->M()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lkotlinx/serialization/json/internal/a;->e()Z

    .line 12
    move-result v1

    .line 13
    const/4 v2, -0x1

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget v1, p0, Lkotlinx/serialization/json/internal/r0;->e:I

    .line 18
    .line 19
    if-eq v1, v2, :cond_1

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    iget-object v3, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 25
    const/4 v7, 0x6

    .line 26
    const/4 v8, 0x0

    .line 27
    .line 28
    const-string v4, "Expected end of the array or comma"

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static/range {v3 .. v8}, Lkotlinx/serialization/json/internal/a;->x(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 34
    .line 35
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 39
    throw v0

    .line 40
    .line 41
    :cond_1
    :goto_0
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    iput v1, p0, Lkotlinx/serialization/json/internal/r0;->e:I

    .line 44
    return v1

    .line 45
    .line 46
    :cond_2
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lxg0/a;->e()Lxg0/f;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lxg0/f;->d()Z

    .line 56
    move-result v0

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    goto :goto_1

    .line 60
    .line 61
    :cond_3
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 62
    .line 63
    const-string v1, "array"

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v1}, Lkotlinx/serialization/json/internal/b0;->h(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;)Ljava/lang/Void;

    .line 67
    .line 68
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 69
    .line 70
    .line 71
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 72
    throw v0

    .line 73
    :cond_4
    :goto_1
    return v2
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
.end method

.method public endStructure(Lvg0/f;)V
    .locals 1
    .param p1    # Lvg0/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "descriptor"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lxg0/a;->e()Lxg0/f;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lxg0/f;->k()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Lvg0/f;->e()I

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/r0;->j(Lvg0/f;)V

    .line 27
    .line 28
    :cond_0
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lkotlinx/serialization/json/internal/a;->M()Z

    .line 32
    move-result p1

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lxg0/a;->e()Lxg0/f;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lxg0/f;->d()Z

    .line 44
    move-result p1

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_1
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 50
    .line 51
    const-string v0, ""

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v0}, Lkotlinx/serialization/json/internal/b0;->h(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;)Ljava/lang/Void;

    .line 55
    .line 56
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 57
    .line 58
    .line 59
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 60
    throw p1

    .line 61
    .line 62
    :cond_2
    :goto_0
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 63
    .line 64
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->b:Lkotlinx/serialization/json/internal/WriteMode;

    .line 65
    .line 66
    iget-char v0, v0, Lkotlinx/serialization/json/internal/WriteMode;->end:C

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/internal/a;->l(C)V

    .line 70
    .line 71
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 72
    .line 73
    iget-object p1, p1, Lkotlinx/serialization/json/internal/a;->b:Lkotlinx/serialization/json/internal/e0;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lkotlinx/serialization/json/internal/e0;->b()V

    .line 77
    return-void
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

.method public final f()I
    .locals 11

    .line 1
    .line 2
    iget v0, p0, Lkotlinx/serialization/json/internal/r0;->e:I

    .line 3
    .line 4
    rem-int/lit8 v1, v0, 0x2

    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    move v1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v3

    .line 12
    :goto_0
    const/4 v4, -0x1

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eq v0, v4, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->M()Z

    .line 22
    move-result v3

    .line 23
    goto :goto_1

    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 26
    .line 27
    const/16 v5, 0x3a

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v5}, Lkotlinx/serialization/json/internal/a;->l(C)V

    .line 31
    .line 32
    :cond_2
    :goto_1
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->e()Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-eqz v0, :cond_7

    .line 39
    .line 40
    if-eqz v1, :cond_6

    .line 41
    .line 42
    iget v0, p0, Lkotlinx/serialization/json/internal/r0;->e:I

    .line 43
    .line 44
    if-ne v0, v4, :cond_4

    .line 45
    .line 46
    iget-object v5, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 47
    .line 48
    iget v7, v5, Lkotlinx/serialization/json/internal/a;->a:I

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    goto :goto_2

    .line 52
    :cond_3
    const/4 v9, 0x4

    .line 53
    const/4 v10, 0x0

    .line 54
    .line 55
    const-string v6, "Unexpected leading comma"

    .line 56
    const/4 v8, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static/range {v5 .. v10}, Lkotlinx/serialization/json/internal/a;->x(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 60
    .line 61
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 62
    .line 63
    .line 64
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 65
    throw v0

    .line 66
    .line 67
    :cond_4
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 68
    move v0, v3

    .line 69
    .line 70
    iget v3, v1, Lkotlinx/serialization/json/internal/a;->a:I

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    goto :goto_2

    .line 74
    :cond_5
    const/4 v5, 0x4

    .line 75
    const/4 v6, 0x0

    .line 76
    .line 77
    const-string v2, "Expected comma after the key-value pair"

    .line 78
    const/4 v4, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static/range {v1 .. v6}, Lkotlinx/serialization/json/internal/a;->x(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 82
    .line 83
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 87
    throw v0

    .line 88
    .line 89
    :cond_6
    :goto_2
    iget v0, p0, Lkotlinx/serialization/json/internal/r0;->e:I

    .line 90
    add-int/2addr v0, v2

    .line 91
    .line 92
    iput v0, p0, Lkotlinx/serialization/json/internal/r0;->e:I

    .line 93
    return v0

    .line 94
    :cond_7
    move v0, v3

    .line 95
    .line 96
    if-eqz v0, :cond_9

    .line 97
    .line 98
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lxg0/a;->e()Lxg0/f;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lxg0/f;->d()Z

    .line 106
    move-result v0

    .line 107
    .line 108
    if-eqz v0, :cond_8

    .line 109
    goto :goto_3

    .line 110
    .line 111
    :cond_8
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 112
    const/4 v1, 0x0

    .line 113
    .line 114
    .line 115
    invoke-static {v0, v1, v2, v1}, Lkotlinx/serialization/json/internal/b0;->i(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 116
    .line 117
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 118
    .line 119
    .line 120
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 121
    throw v0

    .line 122
    :cond_9
    :goto_3
    return v4
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
.end method

.method public final g(Lvg0/f;)I
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->M()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    :goto_0
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lkotlinx/serialization/json/internal/a;->e()Z

    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    if-eqz v1, :cond_4

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lkotlinx/serialization/json/internal/r0;->h()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 22
    .line 23
    const/16 v3, 0x3a

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v3}, Lkotlinx/serialization/json/internal/a;->l(C)V

    .line 27
    .line 28
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v1, v0}, Lkotlinx/serialization/json/internal/d0;->i(Lvg0/f;Lxg0/a;Ljava/lang/String;)I

    .line 32
    move-result v1

    .line 33
    const/4 v3, -0x3

    .line 34
    const/4 v4, 0x0

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    iget-object v2, p0, Lkotlinx/serialization/json/internal/r0;->g:Lxg0/f;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lxg0/f;->g()Z

    .line 42
    move-result v2

    .line 43
    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, v1}, Lkotlinx/serialization/json/internal/r0;->d(Lvg0/f;I)Z

    .line 48
    move-result v2

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    iget-object v1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lkotlinx/serialization/json/internal/a;->M()Z

    .line 56
    move-result v1

    .line 57
    move v2, v4

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_0
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->h:Lkotlinx/serialization/json/internal/JsonElementMarker;

    .line 61
    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1}, Lkotlinx/serialization/json/internal/JsonElementMarker;->c(I)V

    .line 66
    :cond_1
    return v1

    .line 67
    :cond_2
    move v1, v4

    .line 68
    .line 69
    :goto_1
    if-eqz v2, :cond_3

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/internal/r0;->i(Ljava/lang/String;)Z

    .line 73
    move-result v0

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    move v0, v1

    .line 76
    goto :goto_0

    .line 77
    .line 78
    :cond_4
    if-eqz v0, :cond_6

    .line 79
    .line 80
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->a:Lxg0/a;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lxg0/a;->e()Lxg0/f;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lxg0/f;->d()Z

    .line 88
    move-result p1

    .line 89
    .line 90
    if-eqz p1, :cond_5

    .line 91
    goto :goto_2

    .line 92
    .line 93
    :cond_5
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 94
    const/4 v0, 0x0

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0, v2, v0}, Lkotlinx/serialization/json/internal/b0;->i(Lkotlinx/serialization/json/internal/a;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;

    .line 98
    .line 99
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 100
    .line 101
    .line 102
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 103
    throw p1

    .line 104
    .line 105
    :cond_6
    :goto_2
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->h:Lkotlinx/serialization/json/internal/JsonElementMarker;

    .line 106
    .line 107
    if-eqz p1, :cond_7

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lkotlinx/serialization/json/internal/JsonElementMarker;->d()I

    .line 111
    move-result p1

    .line 112
    return p1

    .line 113
    :cond_7
    const/4 p1, -0x1

    .line 114
    return p1
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method

.method public getSerializersModule()Lyg0/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->d:Lyg0/a;

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

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->g:Lxg0/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lxg0/f;->q()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->r()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lkotlinx/serialization/json/internal/a;->i()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    return-object v0
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
.end method

.method public final i(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->g:Lxg0/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lxg0/f;->k()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->f:Lkotlinx/serialization/json/internal/r0$a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lkotlinx/serialization/json/internal/r0;->k(Lkotlinx/serialization/json/internal/r0$a;Ljava/lang/String;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lkotlinx/serialization/json/internal/a;->A(Ljava/lang/String;)V

    .line 23
    goto :goto_1

    .line 24
    .line 25
    :cond_1
    :goto_0
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 26
    .line 27
    iget-object v0, p0, Lkotlinx/serialization/json/internal/r0;->g:Lxg0/f;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lxg0/f;->q()Z

    .line 31
    move-result v0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/internal/a;->I(Z)V

    .line 35
    .line 36
    :goto_1
    iget-object p1, p0, Lkotlinx/serialization/json/internal/r0;->c:Lkotlinx/serialization/json/internal/a;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lkotlinx/serialization/json/internal/a;->M()Z

    .line 40
    move-result p1

    .line 41
    return p1
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
.end method

.method public final j(Lvg0/f;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lkotlinx/serialization/json/internal/r0;->decodeElementIndex(Lvg0/f;)I

    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

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
.end method

.method public final k(Lkotlinx/serialization/json/internal/r0$a;Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    iget-object v1, p1, Lkotlinx/serialization/json/internal/r0$a;->a:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    move-result p2

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    const/4 p2, 0x0

    .line 14
    .line 15
    iput-object p2, p1, Lkotlinx/serialization/json/internal/r0$a;->a:Ljava/lang/String;

    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_1
    return v0
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
