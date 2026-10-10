.class public final Lv50/a;
.super Ljava/lang/Object;
.source "Converter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "bind",
        "",
        "any",
        "TradingBotKitLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "<this>"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v2, "any"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lkotlin/jvm/internal/ArrayIteratorKt;->iterator([Ljava/lang/Object;)Ljava/util/Iterator;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    :catchall_0
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    move-result v3

    .line 31
    .line 32
    if-eqz v3, :cond_6

    .line 33
    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    check-cast v3, Ljava/lang/reflect/Field;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 42
    move-result v4

    .line 43
    .line 44
    and-int/lit8 v4, v4, 0x8

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    goto :goto_0

    .line 48
    .line 49
    .line 50
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    move-result-object v4

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 59
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 63
    move-result-object v5

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 67
    move-result-object v6

    .line 68
    .line 69
    .line 70
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    move-result v5

    .line 72
    .line 73
    if-nez v5, :cond_2

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v5, 0x1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    move-result-object v5

    .line 86
    .line 87
    if-nez v5, :cond_3

    .line 88
    goto :goto_0

    .line 89
    .line 90
    :cond_3
    new-instance v6, Lv50/a$a;

    .line 91
    .line 92
    .line 93
    invoke-direct {v6}, Lv50/a$a;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 97
    move-result-object v14

    .line 98
    .line 99
    new-instance v6, Lv50/a$b;

    .line 100
    .line 101
    .line 102
    invoke-direct {v6}, Lv50/a$b;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 106
    move-result-object v15

    .line 107
    .line 108
    new-instance v6, Lv50/a$c;

    .line 109
    .line 110
    .line 111
    invoke-direct {v6}, Lv50/a$c;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 115
    move-result-object v16

    .line 116
    .line 117
    new-instance v6, Lv50/a$d;

    .line 118
    .line 119
    .line 120
    invoke-direct {v6}, Lv50/a$d;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 124
    move-result-object v17

    .line 125
    .line 126
    new-instance v6, Lv50/a$e;

    .line 127
    .line 128
    .line 129
    invoke-direct {v6}, Lv50/a$e;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 133
    move-result-object v18

    .line 134
    .line 135
    new-instance v6, Lv50/a$f;

    .line 136
    .line 137
    .line 138
    invoke-direct {v6}, Lv50/a$f;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 142
    move-result-object v19

    .line 143
    .line 144
    new-instance v6, Lv50/a$g;

    .line 145
    .line 146
    .line 147
    invoke-direct {v6}, Lv50/a$g;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 151
    move-result-object v20

    .line 152
    .line 153
    sget-object v7, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 154
    .line 155
    sget-object v8, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 156
    .line 157
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 158
    .line 159
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 160
    .line 161
    sget-object v11, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 162
    .line 163
    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 164
    .line 165
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    filled-new-array/range {v7 .. v20}, [Ljava/lang/Class;

    .line 169
    move-result-object v6

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 173
    move-result-object v7

    .line 174
    .line 175
    .line 176
    invoke-static {v6, v7}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    move-result v6

    .line 178
    .line 179
    if-nez v6, :cond_5

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 183
    move-result-object v6

    .line 184
    .line 185
    const-class v7, Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 189
    move-result v6

    .line 190
    .line 191
    if-nez v6, :cond_5

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 195
    move-result-object v3

    .line 196
    .line 197
    const-class v6, Ljava/math/BigDecimal;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 201
    move-result v3

    .line 202
    .line 203
    if-eqz v3, :cond_4

    .line 204
    goto :goto_1

    .line 205
    .line 206
    .line 207
    :cond_4
    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    move-result-object v3

    .line 209
    .line 210
    if-eqz v3, :cond_0

    .line 211
    .line 212
    .line 213
    invoke-static {v3, v5}, Lv50/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    .line 218
    :cond_5
    :goto_1
    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    :cond_6
    return-object v0
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
.end method
