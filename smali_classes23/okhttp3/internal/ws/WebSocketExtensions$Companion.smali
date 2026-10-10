.class public final Lokhttp3/internal/ws/WebSocketExtensions$Companion;
.super Ljava/lang/Object;
.source "WebSocketExtensions.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/ws/WebSocketExtensions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lokhttp3/internal/ws/WebSocketExtensions$Companion;",
        "",
        "()V",
        "HEADER_WEB_SOCKET_EXTENSION",
        "",
        "parse",
        "Lokhttp3/internal/ws/WebSocketExtensions;",
        "responseHeaders",
        "Lokhttp3/Headers;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/internal/ws/WebSocketExtensions$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final parse(Lokhttp3/Headers;)Lokhttp3/internal/ws/WebSocketExtensions;
    .locals 20
    .param p1    # Lokhttp3/Headers;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "responseHeaders"

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lokhttp3/Headers;->size()I

    .line 12
    move-result v1

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x0

    .line 20
    .line 21
    :goto_0
    if-ge v4, v1, :cond_13

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    .line 25
    move-result-object v5

    .line 26
    .line 27
    const-string v12, "Sec-WebSocket-Extensions"

    .line 28
    const/4 v13, 0x1

    .line 29
    .line 30
    .line 31
    invoke-static {v5, v12, v13}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 32
    move-result v5

    .line 33
    .line 34
    if-nez v5, :cond_0

    .line 35
    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    .line 40
    move-result-object v14

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    .line 44
    :goto_1
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 45
    move-result v12

    .line 46
    .line 47
    if-ge v5, v12, :cond_12

    .line 48
    .line 49
    const/16 v18, 0x4

    .line 50
    .line 51
    const/16 v19, 0x0

    .line 52
    .line 53
    const/16 v15, 0x2c

    .line 54
    .line 55
    const/16 v17, 0x0

    .line 56
    .line 57
    move/from16 v16, v5

    .line 58
    .line 59
    .line 60
    invoke-static/range {v14 .. v19}, Lokhttp3/internal/Util;->delimiterOffset$default(Ljava/lang/String;CIIILjava/lang/Object;)I

    .line 61
    move-result v5

    .line 62
    .line 63
    move/from16 v12, v16

    .line 64
    .line 65
    const/16 v15, 0x3b

    .line 66
    .line 67
    .line 68
    invoke-static {v14, v15, v12, v5}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 69
    move-result v2

    .line 70
    .line 71
    .line 72
    invoke-static {v14, v12, v2}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 73
    move-result-object v12

    .line 74
    add-int/2addr v2, v13

    .line 75
    .line 76
    .line 77
    const-string/jumbo v3, "permessage-deflate"

    .line 78
    .line 79
    .line 80
    invoke-static {v12, v3, v13}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 81
    move-result v3

    .line 82
    .line 83
    if-eqz v3, :cond_11

    .line 84
    .line 85
    if-eqz v6, :cond_1

    .line 86
    goto :goto_6

    .line 87
    .line 88
    :cond_1
    :goto_2
    if-ge v2, v5, :cond_10

    .line 89
    .line 90
    .line 91
    invoke-static {v14, v15, v2, v5}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 92
    move-result v3

    .line 93
    .line 94
    const/16 v6, 0x3d

    .line 95
    .line 96
    .line 97
    invoke-static {v14, v6, v2, v3}, Lokhttp3/internal/Util;->delimiterOffset(Ljava/lang/String;CII)I

    .line 98
    move-result v6

    .line 99
    .line 100
    .line 101
    invoke-static {v14, v2, v6}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 102
    move-result-object v2

    .line 103
    .line 104
    if-ge v6, v3, :cond_2

    .line 105
    .line 106
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    .line 109
    invoke-static {v14, v6, v3}, Lokhttp3/internal/Util;->trimSubstring(Ljava/lang/String;II)Ljava/lang/String;

    .line 110
    move-result-object v6

    .line 111
    .line 112
    const-string v12, "\""

    .line 113
    .line 114
    .line 115
    invoke-static {v6, v12}, Lkotlin/text/StringsKt;->removeSurrounding(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 116
    move-result-object v6

    .line 117
    goto :goto_3

    .line 118
    :cond_2
    const/4 v6, 0x0

    .line 119
    .line 120
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 121
    .line 122
    const-string v12, "client_max_window_bits"

    .line 123
    .line 124
    .line 125
    invoke-static {v2, v12, v13}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 126
    move-result v12

    .line 127
    .line 128
    if-eqz v12, :cond_7

    .line 129
    .line 130
    if-eqz v7, :cond_3

    .line 131
    move v11, v13

    .line 132
    .line 133
    :cond_3
    if-eqz v6, :cond_4

    .line 134
    .line 135
    .line 136
    invoke-static {v6}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 137
    move-result-object v2

    .line 138
    move-object v7, v2

    .line 139
    goto :goto_4

    .line 140
    :cond_4
    const/4 v7, 0x0

    .line 141
    .line 142
    :goto_4
    if-nez v7, :cond_6

    .line 143
    :cond_5
    :goto_5
    move v2, v3

    .line 144
    :goto_6
    move v11, v13

    .line 145
    goto :goto_2

    .line 146
    :cond_6
    move v2, v3

    .line 147
    goto :goto_2

    .line 148
    .line 149
    :cond_7
    const-string v12, "client_no_context_takeover"

    .line 150
    .line 151
    .line 152
    invoke-static {v2, v12, v13}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 153
    move-result v12

    .line 154
    .line 155
    if-eqz v12, :cond_a

    .line 156
    .line 157
    if-eqz v8, :cond_8

    .line 158
    move v11, v13

    .line 159
    .line 160
    :cond_8
    if-eqz v6, :cond_9

    .line 161
    move v11, v13

    .line 162
    :cond_9
    move v2, v3

    .line 163
    move v8, v13

    .line 164
    goto :goto_2

    .line 165
    .line 166
    .line 167
    :cond_a
    const-string/jumbo v12, "server_max_window_bits"

    .line 168
    .line 169
    .line 170
    invoke-static {v2, v12, v13}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 171
    move-result v12

    .line 172
    .line 173
    if-eqz v12, :cond_d

    .line 174
    .line 175
    if-eqz v9, :cond_b

    .line 176
    move v11, v13

    .line 177
    .line 178
    :cond_b
    if-eqz v6, :cond_c

    .line 179
    .line 180
    .line 181
    invoke-static {v6}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 182
    move-result-object v2

    .line 183
    move-object v9, v2

    .line 184
    goto :goto_7

    .line 185
    :cond_c
    const/4 v9, 0x0

    .line 186
    .line 187
    :goto_7
    if-nez v9, :cond_6

    .line 188
    goto :goto_5

    .line 189
    .line 190
    .line 191
    :cond_d
    const-string/jumbo v12, "server_no_context_takeover"

    .line 192
    .line 193
    .line 194
    invoke-static {v2, v12, v13}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 195
    move-result v2

    .line 196
    .line 197
    if-eqz v2, :cond_5

    .line 198
    .line 199
    if-eqz v10, :cond_e

    .line 200
    move v11, v13

    .line 201
    .line 202
    :cond_e
    if-eqz v6, :cond_f

    .line 203
    move v11, v13

    .line 204
    :cond_f
    move v2, v3

    .line 205
    move v10, v13

    .line 206
    goto :goto_2

    .line 207
    :cond_10
    move v5, v2

    .line 208
    move v6, v13

    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    :cond_11
    move v5, v2

    .line 212
    move v11, v13

    .line 213
    .line 214
    goto/16 :goto_1

    .line 215
    .line 216
    :cond_12
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 217
    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :cond_13
    new-instance v5, Lokhttp3/internal/ws/WebSocketExtensions;

    .line 221
    .line 222
    .line 223
    invoke-direct/range {v5 .. v11}, Lokhttp3/internal/ws/WebSocketExtensions;-><init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V

    .line 224
    return-object v5
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
.end method
