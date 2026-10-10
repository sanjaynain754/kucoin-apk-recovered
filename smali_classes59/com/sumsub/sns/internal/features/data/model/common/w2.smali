.class public final synthetic Lcom/sumsub/sns/internal/features/data/model/common/w2;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/serialization/internal/m0;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/data/model/common/w2;

.field private static final descriptor:Lvg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/w2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/w2;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/w2;->a:Lcom/sumsub/sns/internal/features/data/model/common/w2;

    .line 8
    .line 9
    new-instance v1, Lkotlinx/serialization/internal/h2;

    .line 10
    .line 11
    const-string v2, "com.sumsub.sns.internal.features.data.model.common.LogParams"

    .line 12
    .line 13
    const/16 v3, 0x8

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 17
    .line 18
    const-string v0, "errorType"

    .line 19
    const/4 v2, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 23
    .line 24
    const-string v0, "location"

    .line 25
    const/4 v3, 0x0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 29
    .line 30
    const-string v0, "externalUserId"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 34
    .line 35
    const-string v0, "fileName"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 39
    .line 40
    const-string v0, "applicantId"

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    const-string/jumbo v0, "message"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 50
    .line 51
    const-string v0, "kind"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    const-string/jumbo v0, "stacktrace"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 61
    .line 62
    sput-object v1, Lcom/sumsub/sns/internal/features/data/model/common/w2;->descriptor:Lvg0/f;

    .line 63
    return-void
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
    .locals 6

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
    move-result-object v3

    .line 15
    .line 16
    const/16 v4, 0x8

    .line 17
    .line 18
    new-array v4, v4, [Ltg0/d;

    .line 19
    const/4 v5, 0x0

    .line 20
    .line 21
    aput-object v0, v4, v5

    .line 22
    const/4 v5, 0x1

    .line 23
    .line 24
    aput-object v0, v4, v5

    .line 25
    const/4 v5, 0x2

    .line 26
    .line 27
    aput-object v1, v4, v5

    .line 28
    const/4 v1, 0x3

    .line 29
    .line 30
    aput-object v2, v4, v1

    .line 31
    const/4 v1, 0x4

    .line 32
    .line 33
    aput-object v0, v4, v1

    .line 34
    const/4 v1, 0x5

    .line 35
    .line 36
    aput-object v0, v4, v1

    .line 37
    const/4 v1, 0x6

    .line 38
    .line 39
    aput-object v0, v4, v1

    .line 40
    const/4 v0, 0x7

    .line 41
    .line 42
    aput-object v3, v4, v0

    .line 43
    return-object v4
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

.method public final deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;
    .locals 30

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/w2;->descriptor:Lvg0/f;

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
    const/4 v3, 0x7

    .line 14
    const/4 v4, 0x6

    .line 15
    const/4 v5, 0x5

    .line 16
    const/4 v6, 0x3

    .line 17
    const/4 v7, 0x4

    .line 18
    const/4 v8, 0x2

    .line 19
    const/4 v9, 0x1

    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v1, v0, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, v0, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 31
    move-result-object v9

    .line 32
    .line 33
    sget-object v10, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 34
    .line 35
    .line 36
    invoke-interface {v1, v0, v8, v10, v11}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    move-result-object v8

    .line 38
    .line 39
    check-cast v8, Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-interface {v1, v0, v6, v10, v11}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    check-cast v6, Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v0, v7}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 49
    move-result-object v7

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, v0, v5}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    .line 56
    invoke-interface {v1, v0, v4}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 57
    move-result-object v4

    .line 58
    .line 59
    .line 60
    invoke-interface {v1, v0, v3, v10, v11}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    check-cast v3, Ljava/lang/String;

    .line 64
    .line 65
    const/16 v10, 0xff

    .line 66
    .line 67
    move-object/from16 v21, v2

    .line 68
    .line 69
    move-object/from16 v28, v3

    .line 70
    .line 71
    move-object/from16 v27, v4

    .line 72
    .line 73
    move-object/from16 v26, v5

    .line 74
    .line 75
    move-object/from16 v24, v6

    .line 76
    .line 77
    move-object/from16 v25, v7

    .line 78
    .line 79
    move-object/from16 v23, v8

    .line 80
    .line 81
    move-object/from16 v22, v9

    .line 82
    .line 83
    move/from16 v20, v10

    .line 84
    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :cond_0
    move/from16 v18, v9

    .line 88
    move v2, v10

    .line 89
    move-object v10, v11

    .line 90
    move-object v12, v10

    .line 91
    move-object v13, v12

    .line 92
    move-object v14, v13

    .line 93
    move-object v15, v14

    .line 94
    .line 95
    move-object/from16 v16, v15

    .line 96
    .line 97
    move-object/from16 v17, v16

    .line 98
    .line 99
    :goto_0
    if-eqz v18, :cond_1

    .line 100
    .line 101
    .line 102
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeElementIndex(Lvg0/f;)I

    .line 103
    move-result v9

    .line 104
    .line 105
    .line 106
    packed-switch v9, :pswitch_data_0

    .line 107
    .line 108
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 109
    .line 110
    .line 111
    invoke-direct {v0, v9}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 112
    throw v0

    .line 113
    .line 114
    :pswitch_0
    sget-object v9, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 115
    .line 116
    .line 117
    invoke-interface {v1, v0, v3, v9, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    move-result-object v9

    .line 119
    move-object v10, v9

    .line 120
    .line 121
    check-cast v10, Ljava/lang/String;

    .line 122
    .line 123
    or-int/lit16 v2, v2, 0x80

    .line 124
    :goto_1
    const/4 v9, 0x1

    .line 125
    goto :goto_0

    .line 126
    .line 127
    .line 128
    :pswitch_1
    invoke-interface {v1, v0, v4}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 129
    move-result-object v17

    .line 130
    .line 131
    or-int/lit8 v2, v2, 0x40

    .line 132
    goto :goto_1

    .line 133
    .line 134
    .line 135
    :pswitch_2
    invoke-interface {v1, v0, v5}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 136
    move-result-object v16

    .line 137
    .line 138
    or-int/lit8 v2, v2, 0x20

    .line 139
    goto :goto_1

    .line 140
    .line 141
    .line 142
    :pswitch_3
    invoke-interface {v1, v0, v7}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 143
    move-result-object v15

    .line 144
    .line 145
    or-int/lit8 v2, v2, 0x10

    .line 146
    goto :goto_1

    .line 147
    .line 148
    :pswitch_4
    sget-object v9, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 149
    .line 150
    .line 151
    invoke-interface {v1, v0, v6, v9, v14}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    move-result-object v9

    .line 153
    move-object v14, v9

    .line 154
    .line 155
    check-cast v14, Ljava/lang/String;

    .line 156
    .line 157
    or-int/lit8 v2, v2, 0x8

    .line 158
    goto :goto_1

    .line 159
    .line 160
    :pswitch_5
    sget-object v9, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 161
    .line 162
    .line 163
    invoke-interface {v1, v0, v8, v9, v13}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    move-result-object v9

    .line 165
    move-object v13, v9

    .line 166
    .line 167
    check-cast v13, Ljava/lang/String;

    .line 168
    .line 169
    or-int/lit8 v2, v2, 0x4

    .line 170
    goto :goto_1

    .line 171
    :pswitch_6
    const/4 v9, 0x1

    .line 172
    .line 173
    .line 174
    invoke-interface {v1, v0, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 175
    move-result-object v12

    .line 176
    .line 177
    or-int/lit8 v2, v2, 0x2

    .line 178
    goto :goto_0

    .line 179
    :pswitch_7
    const/4 v9, 0x1

    .line 180
    const/4 v11, 0x0

    .line 181
    .line 182
    .line 183
    invoke-interface {v1, v0, v11}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeStringElement(Lvg0/f;I)Ljava/lang/String;

    .line 184
    move-result-object v19

    .line 185
    .line 186
    or-int/lit8 v2, v2, 0x1

    .line 187
    .line 188
    move-object/from16 v11, v19

    .line 189
    goto :goto_0

    .line 190
    .line 191
    :pswitch_8
    const/16 v18, 0x0

    .line 192
    goto :goto_1

    .line 193
    .line 194
    :cond_1
    move/from16 v20, v2

    .line 195
    .line 196
    move-object/from16 v28, v10

    .line 197
    .line 198
    move-object/from16 v21, v11

    .line 199
    .line 200
    move-object/from16 v22, v12

    .line 201
    .line 202
    move-object/from16 v23, v13

    .line 203
    .line 204
    move-object/from16 v24, v14

    .line 205
    .line 206
    move-object/from16 v25, v15

    .line 207
    .line 208
    move-object/from16 v26, v16

    .line 209
    .line 210
    move-object/from16 v27, v17

    .line 211
    .line 212
    .line 213
    :goto_2
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->endStructure(Lvg0/f;)V

    .line 214
    .line 215
    new-instance v19, Lcom/sumsub/sns/internal/features/data/model/common/LogParams;

    .line 216
    .line 217
    const/16 v29, 0x0

    .line 218
    .line 219
    .line 220
    invoke-direct/range {v19 .. v29}, Lcom/sumsub/sns/internal/features/data/model/common/LogParams;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/r2;)V

    .line 221
    return-object v19

    .line 222
    nop

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
    :pswitch_data_0
    .packed-switch -0x1
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

.method public final getDescriptor()Lvg0/f;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/w2;->descriptor:Lvg0/f;

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
    .locals 1

    .line 1
    .line 2
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/LogParams;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/w2;->descriptor:Lvg0/f;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Lwg0/c;->beginStructure(Lvg0/f;)Lwg0/b;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-static {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/LogParams;->write$Self$idensic_mobile_sdk_aar_defaultRelease(Lcom/sumsub/sns/internal/features/data/model/common/LogParams;Lwg0/b;Lvg0/f;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0}, Lwg0/b;->endStructure(Lvg0/f;)V

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
