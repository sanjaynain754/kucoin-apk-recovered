.class public final synthetic Lcom/sumsub/sentry/o0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/serialization/internal/m0;


# static fields
.field public static final a:Lcom/sumsub/sentry/o0;

.field private static final descriptor:Lvg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sentry/o0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sentry/o0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sentry/o0;->a:Lcom/sumsub/sentry/o0;

    .line 8
    .line 9
    new-instance v1, Lkotlinx/serialization/internal/h2;

    .line 10
    .line 11
    const-string v2, "com.sumsub.sentry.SentryException"

    .line 12
    const/4 v3, 0x6

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 16
    .line 17
    .line 18
    const-string/jumbo v0, "type"

    .line 19
    const/4 v2, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 23
    .line 24
    .line 25
    const-string/jumbo v0, "value"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    const-string/jumbo v0, "module"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string/jumbo v0, "thread_id"

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string/jumbo v0, "stacktrace"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 47
    .line 48
    const-string v0, "mechanism"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 52
    .line 53
    sput-object v1, Lcom/sumsub/sentry/o0;->descriptor:Lvg0/f;

    .line 54
    return-void
    .line 55
    .line 56
    .line 57
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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


# virtual methods
.method public final childSerializers()[Ltg0/d;
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sget-object v3, Lkotlinx/serialization/internal/g1;->a:Lkotlinx/serialization/internal/g1;

    .line 17
    .line 18
    .line 19
    invoke-static {v3}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    sget-object v4, Lcom/sumsub/sentry/L0;->a:Lcom/sumsub/sentry/L0;

    .line 23
    .line 24
    .line 25
    invoke-static {v4}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    sget-object v5, Lcom/sumsub/sentry/H;->a:Lcom/sumsub/sentry/H;

    .line 29
    .line 30
    .line 31
    invoke-static {v5}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 32
    move-result-object v5

    .line 33
    const/4 v6, 0x6

    .line 34
    .line 35
    new-array v6, v6, [Ltg0/d;

    .line 36
    const/4 v7, 0x0

    .line 37
    .line 38
    aput-object v1, v6, v7

    .line 39
    const/4 v1, 0x1

    .line 40
    .line 41
    aput-object v2, v6, v1

    .line 42
    const/4 v1, 0x2

    .line 43
    .line 44
    aput-object v0, v6, v1

    .line 45
    const/4 v0, 0x3

    .line 46
    .line 47
    aput-object v3, v6, v0

    .line 48
    const/4 v0, 0x4

    .line 49
    .line 50
    aput-object v4, v6, v0

    .line 51
    const/4 v0, 0x5

    .line 52
    .line 53
    aput-object v5, v6, v0

    .line 54
    return-object v6
    .line 55
    .line 56
    .line 57
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;
    .locals 24

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/o0;->descriptor:Lvg0/f;

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/b;->beginStructure(Lvg0/f;)Lkotlinx/serialization/encoding/CompositeDecoder;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeSequentially()Z

    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x5

    .line 14
    const/4 v4, 0x3

    .line 15
    const/4 v5, 0x4

    .line 16
    const/4 v6, 0x2

    .line 17
    const/4 v7, 0x1

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v9, 0x0

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 24
    .line 25
    .line 26
    invoke-interface {v1, v0, v8, v2, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    move-result-object v8

    .line 28
    .line 29
    check-cast v8, Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v0, v7, v2, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    move-result-object v7

    .line 34
    .line 35
    check-cast v7, Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, v0, v6, v2, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    sget-object v6, Lkotlinx/serialization/internal/g1;->a:Lkotlinx/serialization/internal/g1;

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, v0, v4, v6, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    move-result-object v4

    .line 48
    .line 49
    check-cast v4, Ljava/lang/Long;

    .line 50
    .line 51
    sget-object v6, Lcom/sumsub/sentry/L0;->a:Lcom/sumsub/sentry/L0;

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v0, v5, v6, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    check-cast v5, Lcom/sumsub/sentry/N0;

    .line 58
    .line 59
    sget-object v6, Lcom/sumsub/sentry/H;->a:Lcom/sumsub/sentry/H;

    .line 60
    .line 61
    .line 62
    invoke-interface {v1, v0, v3, v6, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v3

    .line 64
    .line 65
    check-cast v3, Lcom/sumsub/sentry/J;

    .line 66
    .line 67
    const/16 v6, 0x3f

    .line 68
    .line 69
    move-object/from16 v20, v2

    .line 70
    .line 71
    move-object/from16 v23, v3

    .line 72
    .line 73
    move-object/from16 v21, v4

    .line 74
    .line 75
    move-object/from16 v22, v5

    .line 76
    .line 77
    move/from16 v17, v6

    .line 78
    .line 79
    move-object/from16 v19, v7

    .line 80
    .line 81
    move-object/from16 v18, v8

    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    :cond_0
    move v15, v7

    .line 85
    move v2, v8

    .line 86
    move-object v10, v9

    .line 87
    move-object v11, v10

    .line 88
    move-object v12, v11

    .line 89
    move-object v13, v12

    .line 90
    move-object v14, v13

    .line 91
    .line 92
    :goto_0
    if-eqz v15, :cond_1

    .line 93
    .line 94
    .line 95
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeElementIndex(Lvg0/f;)I

    .line 96
    move-result v8

    .line 97
    .line 98
    .line 99
    packed-switch v8, :pswitch_data_0

    .line 100
    .line 101
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 102
    .line 103
    .line 104
    invoke-direct {v0, v8}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 105
    throw v0

    .line 106
    .line 107
    :pswitch_0
    sget-object v8, Lcom/sumsub/sentry/H;->a:Lcom/sumsub/sentry/H;

    .line 108
    .line 109
    .line 110
    invoke-interface {v1, v0, v3, v8, v14}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    move-result-object v8

    .line 112
    move-object v14, v8

    .line 113
    .line 114
    check-cast v14, Lcom/sumsub/sentry/J;

    .line 115
    .line 116
    or-int/lit8 v2, v2, 0x20

    .line 117
    :goto_1
    const/4 v8, 0x0

    .line 118
    goto :goto_0

    .line 119
    .line 120
    :pswitch_1
    sget-object v8, Lcom/sumsub/sentry/L0;->a:Lcom/sumsub/sentry/L0;

    .line 121
    .line 122
    .line 123
    invoke-interface {v1, v0, v5, v8, v13}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    move-result-object v8

    .line 125
    move-object v13, v8

    .line 126
    .line 127
    check-cast v13, Lcom/sumsub/sentry/N0;

    .line 128
    .line 129
    or-int/lit8 v2, v2, 0x10

    .line 130
    goto :goto_1

    .line 131
    .line 132
    :pswitch_2
    sget-object v8, Lkotlinx/serialization/internal/g1;->a:Lkotlinx/serialization/internal/g1;

    .line 133
    .line 134
    .line 135
    invoke-interface {v1, v0, v4, v8, v12}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    move-result-object v8

    .line 137
    move-object v12, v8

    .line 138
    .line 139
    check-cast v12, Ljava/lang/Long;

    .line 140
    .line 141
    or-int/lit8 v2, v2, 0x8

    .line 142
    goto :goto_1

    .line 143
    .line 144
    :pswitch_3
    sget-object v8, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 145
    .line 146
    .line 147
    invoke-interface {v1, v0, v6, v8, v11}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    move-result-object v8

    .line 149
    move-object v11, v8

    .line 150
    .line 151
    check-cast v11, Ljava/lang/String;

    .line 152
    .line 153
    or-int/lit8 v2, v2, 0x4

    .line 154
    goto :goto_1

    .line 155
    .line 156
    :pswitch_4
    sget-object v8, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 157
    .line 158
    .line 159
    invoke-interface {v1, v0, v7, v8, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    move-result-object v8

    .line 161
    move-object v10, v8

    .line 162
    .line 163
    check-cast v10, Ljava/lang/String;

    .line 164
    .line 165
    or-int/lit8 v2, v2, 0x2

    .line 166
    goto :goto_1

    .line 167
    .line 168
    :pswitch_5
    sget-object v8, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 169
    const/4 v3, 0x0

    .line 170
    .line 171
    .line 172
    invoke-interface {v1, v0, v3, v8, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    move-result-object v8

    .line 174
    move-object v9, v8

    .line 175
    .line 176
    check-cast v9, Ljava/lang/String;

    .line 177
    .line 178
    or-int/lit8 v2, v2, 0x1

    .line 179
    move v8, v3

    .line 180
    :goto_2
    const/4 v3, 0x5

    .line 181
    goto :goto_0

    .line 182
    :pswitch_6
    const/4 v3, 0x0

    .line 183
    move v8, v3

    .line 184
    move v15, v8

    .line 185
    goto :goto_2

    .line 186
    .line 187
    :cond_1
    move/from16 v17, v2

    .line 188
    .line 189
    move-object/from16 v18, v9

    .line 190
    .line 191
    move-object/from16 v19, v10

    .line 192
    .line 193
    move-object/from16 v20, v11

    .line 194
    .line 195
    move-object/from16 v21, v12

    .line 196
    .line 197
    move-object/from16 v22, v13

    .line 198
    .line 199
    move-object/from16 v23, v14

    .line 200
    .line 201
    .line 202
    :goto_3
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->endStructure(Lvg0/f;)V

    .line 203
    .line 204
    new-instance v16, Lcom/sumsub/sentry/q0;

    .line 205
    .line 206
    .line 207
    invoke-direct/range {v16 .. v23}, Lcom/sumsub/sentry/q0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/sumsub/sentry/N0;Lcom/sumsub/sentry/J;)V

    .line 208
    return-object v16

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
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final getDescriptor()Lvg0/f;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sentry/o0;->descriptor:Lvg0/f;

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

.method public final serialize(Lwg0/c;Ljava/lang/Object;)V
    .locals 4

    .line 1
    .line 2
    check-cast p2, Lcom/sumsub/sentry/q0;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sentry/o0;->descriptor:Lvg0/f;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Lwg0/c;->beginStructure(Lvg0/f;)Lwg0/b;

    .line 8
    move-result-object p1

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 13
    move-result v2

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    iget-object v2, p2, Lcom/sumsub/sentry/q0;->a:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 23
    .line 24
    iget-object v3, p2, Lcom/sumsub/sentry/q0;->a:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 28
    :cond_1
    const/4 v1, 0x1

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 32
    move-result v2

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_2
    iget-object v2, p2, Lcom/sumsub/sentry/q0;->b:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 42
    .line 43
    iget-object v3, p2, Lcom/sumsub/sentry/q0;->b:Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 47
    :cond_3
    const/4 v1, 0x2

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 51
    move-result v2

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    goto :goto_2

    .line 55
    .line 56
    :cond_4
    iget-object v2, p2, Lcom/sumsub/sentry/q0;->c:Ljava/lang/String;

    .line 57
    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 61
    .line 62
    iget-object v3, p2, Lcom/sumsub/sentry/q0;->c:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 66
    :cond_5
    const/4 v1, 0x3

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 70
    move-result v2

    .line 71
    .line 72
    if-eqz v2, :cond_6

    .line 73
    goto :goto_3

    .line 74
    .line 75
    :cond_6
    iget-object v2, p2, Lcom/sumsub/sentry/q0;->d:Ljava/lang/Long;

    .line 76
    .line 77
    if-eqz v2, :cond_7

    .line 78
    .line 79
    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/g1;->a:Lkotlinx/serialization/internal/g1;

    .line 80
    .line 81
    iget-object v3, p2, Lcom/sumsub/sentry/q0;->d:Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 85
    :cond_7
    const/4 v1, 0x4

    .line 86
    .line 87
    .line 88
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 89
    move-result v2

    .line 90
    .line 91
    if-eqz v2, :cond_8

    .line 92
    goto :goto_4

    .line 93
    .line 94
    :cond_8
    iget-object v2, p2, Lcom/sumsub/sentry/q0;->e:Lcom/sumsub/sentry/N0;

    .line 95
    .line 96
    if-eqz v2, :cond_9

    .line 97
    .line 98
    :goto_4
    sget-object v2, Lcom/sumsub/sentry/L0;->a:Lcom/sumsub/sentry/L0;

    .line 99
    .line 100
    iget-object v3, p2, Lcom/sumsub/sentry/q0;->e:Lcom/sumsub/sentry/N0;

    .line 101
    .line 102
    .line 103
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 104
    :cond_9
    const/4 v1, 0x5

    .line 105
    .line 106
    .line 107
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 108
    move-result v2

    .line 109
    .line 110
    if-eqz v2, :cond_a

    .line 111
    goto :goto_5

    .line 112
    .line 113
    :cond_a
    iget-object v2, p2, Lcom/sumsub/sentry/q0;->f:Lcom/sumsub/sentry/J;

    .line 114
    .line 115
    if-eqz v2, :cond_b

    .line 116
    .line 117
    :goto_5
    sget-object v2, Lcom/sumsub/sentry/H;->a:Lcom/sumsub/sentry/H;

    .line 118
    .line 119
    iget-object p2, p2, Lcom/sumsub/sentry/q0;->f:Lcom/sumsub/sentry/J;

    .line 120
    .line 121
    .line 122
    invoke-interface {p1, v0, v1, v2, p2}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_b
    invoke-interface {p1, v0}, Lwg0/b;->endStructure(Lvg0/f;)V

    .line 126
    return-void
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
.end method

.method public final typeParametersSerializers()[Ltg0/d;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lkotlinx/serialization/internal/m0$a;->a(Lkotlinx/serialization/internal/m0;)[Ltg0/d;

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
