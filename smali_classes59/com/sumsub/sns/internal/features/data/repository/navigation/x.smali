.class public final synthetic Lcom/sumsub/sns/internal/features/data/repository/navigation/x;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/serialization/internal/m0;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/data/repository/navigation/x;

.field private static final descriptor:Lvg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/x;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/repository/navigation/x;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/x;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/x;

    .line 8
    .line 9
    new-instance v1, Lkotlinx/serialization/internal/h2;

    .line 10
    .line 11
    const-string v2, "com.sumsub.sns.internal.features.data.repository.navigation.ServerNavigationStateDto"

    .line 12
    const/4 v3, 0x5

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 16
    .line 17
    .line 18
    const-string/jumbo v0, "navigation"

    .line 19
    const/4 v2, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 23
    .line 24
    .line 25
    const-string/jumbo v0, "params"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    const-string/jumbo v0, "step"

    .line 32
    const/4 v3, 0x0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v0, "version"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 42
    .line 43
    const-string v0, "applicantReview"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 47
    .line 48
    sput-object v1, Lcom/sumsub/sns/internal/features/data/repository/navigation/x;->descriptor:Lvg0/f;

    .line 49
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
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
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/g;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/g;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget-object v1, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    sget-object v2, Lcom/sumsub/sns/internal/features/data/repository/navigation/a;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/a;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x5

    .line 20
    .line 21
    new-array v3, v3, [Ltg0/d;

    .line 22
    .line 23
    sget-object v4, Lcom/sumsub/sns/internal/features/data/repository/navigation/d;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/d;

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    aput-object v4, v3, v5

    .line 27
    const/4 v4, 0x1

    .line 28
    .line 29
    aput-object v0, v3, v4

    .line 30
    .line 31
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/j;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/j;

    .line 32
    const/4 v4, 0x2

    .line 33
    .line 34
    aput-object v0, v3, v4

    .line 35
    const/4 v0, 0x3

    .line 36
    .line 37
    aput-object v1, v3, v0

    .line 38
    const/4 v0, 0x4

    .line 39
    .line 40
    aput-object v2, v3, v0

    .line 41
    return-object v3
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

.method public final deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;
    .locals 21

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/x;->descriptor:Lvg0/f;

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
    const/4 v3, 0x3

    .line 14
    const/4 v4, 0x4

    .line 15
    const/4 v5, 0x2

    .line 16
    const/4 v6, 0x1

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v8, 0x0

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    sget-object v2, Lcom/sumsub/sns/internal/features/data/repository/navigation/d;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/d;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, v0, v7, v2, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/navigation/f;

    .line 29
    .line 30
    sget-object v7, Lcom/sumsub/sns/internal/features/data/repository/navigation/g;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/g;

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, v0, v6, v7, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    move-result-object v6

    .line 35
    .line 36
    check-cast v6, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;

    .line 37
    .line 38
    sget-object v7, Lcom/sumsub/sns/internal/features/data/repository/navigation/j;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/j;

    .line 39
    .line 40
    .line 41
    invoke-interface {v1, v0, v5, v7, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    move-result-object v5

    .line 43
    .line 44
    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;

    .line 45
    .line 46
    sget-object v7, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 47
    .line 48
    .line 49
    invoke-interface {v1, v0, v3, v7, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    check-cast v3, Ljava/lang/String;

    .line 53
    .line 54
    sget-object v7, Lcom/sumsub/sns/internal/features/data/repository/navigation/a;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/a;

    .line 55
    .line 56
    .line 57
    invoke-interface {v1, v0, v4, v7, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    check-cast v4, Lcom/sumsub/sns/internal/features/data/repository/navigation/c;

    .line 61
    .line 62
    const/16 v7, 0x1f

    .line 63
    .line 64
    move-object/from16 v16, v2

    .line 65
    .line 66
    move-object/from16 v19, v3

    .line 67
    .line 68
    move-object/from16 v20, v4

    .line 69
    .line 70
    move-object/from16 v18, v5

    .line 71
    .line 72
    move-object/from16 v17, v6

    .line 73
    move v15, v7

    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    :cond_0
    move v13, v6

    .line 77
    move v2, v7

    .line 78
    move-object v9, v8

    .line 79
    move-object v10, v9

    .line 80
    move-object v11, v10

    .line 81
    move-object v12, v11

    .line 82
    .line 83
    :goto_0
    if-eqz v13, :cond_7

    .line 84
    .line 85
    .line 86
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeElementIndex(Lvg0/f;)I

    .line 87
    move-result v14

    .line 88
    const/4 v15, -0x1

    .line 89
    .line 90
    if-eq v14, v15, :cond_6

    .line 91
    .line 92
    if-eqz v14, :cond_5

    .line 93
    .line 94
    if-eq v14, v6, :cond_4

    .line 95
    .line 96
    if-eq v14, v5, :cond_3

    .line 97
    .line 98
    if-eq v14, v3, :cond_2

    .line 99
    .line 100
    if-ne v14, v4, :cond_1

    .line 101
    .line 102
    sget-object v14, Lcom/sumsub/sns/internal/features/data/repository/navigation/a;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/a;

    .line 103
    .line 104
    .line 105
    invoke-interface {v1, v0, v4, v14, v12}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    move-result-object v12

    .line 107
    .line 108
    check-cast v12, Lcom/sumsub/sns/internal/features/data/repository/navigation/c;

    .line 109
    .line 110
    or-int/lit8 v2, v2, 0x10

    .line 111
    goto :goto_0

    .line 112
    .line 113
    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 117
    throw v0

    .line 118
    .line 119
    :cond_2
    sget-object v14, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 120
    .line 121
    .line 122
    invoke-interface {v1, v0, v3, v14, v11}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    move-result-object v11

    .line 124
    .line 125
    check-cast v11, Ljava/lang/String;

    .line 126
    .line 127
    or-int/lit8 v2, v2, 0x8

    .line 128
    goto :goto_0

    .line 129
    .line 130
    :cond_3
    sget-object v14, Lcom/sumsub/sns/internal/features/data/repository/navigation/j;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/j;

    .line 131
    .line 132
    .line 133
    invoke-interface {v1, v0, v5, v14, v10}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    move-result-object v10

    .line 135
    .line 136
    check-cast v10, Lcom/sumsub/sns/internal/features/data/repository/navigation/o;

    .line 137
    .line 138
    or-int/lit8 v2, v2, 0x4

    .line 139
    goto :goto_0

    .line 140
    .line 141
    :cond_4
    sget-object v14, Lcom/sumsub/sns/internal/features/data/repository/navigation/g;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/g;

    .line 142
    .line 143
    .line 144
    invoke-interface {v1, v0, v6, v14, v9}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeNullableSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    move-result-object v9

    .line 146
    .line 147
    check-cast v9, Lcom/sumsub/sns/internal/features/data/repository/navigation/i;

    .line 148
    .line 149
    or-int/lit8 v2, v2, 0x2

    .line 150
    goto :goto_0

    .line 151
    .line 152
    :cond_5
    sget-object v14, Lcom/sumsub/sns/internal/features/data/repository/navigation/d;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/d;

    .line 153
    .line 154
    .line 155
    invoke-interface {v1, v0, v7, v14, v8}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeSerializableElement(Lvg0/f;ILtg0/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    move-result-object v8

    .line 157
    .line 158
    check-cast v8, Lcom/sumsub/sns/internal/features/data/repository/navigation/f;

    .line 159
    .line 160
    or-int/lit8 v2, v2, 0x1

    .line 161
    goto :goto_0

    .line 162
    :cond_6
    move v13, v7

    .line 163
    goto :goto_0

    .line 164
    :cond_7
    move v15, v2

    .line 165
    .line 166
    move-object/from16 v16, v8

    .line 167
    .line 168
    move-object/from16 v17, v9

    .line 169
    .line 170
    move-object/from16 v18, v10

    .line 171
    .line 172
    move-object/from16 v19, v11

    .line 173
    .line 174
    move-object/from16 v20, v12

    .line 175
    .line 176
    .line 177
    :goto_1
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->endStructure(Lvg0/f;)V

    .line 178
    .line 179
    new-instance v14, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;

    .line 180
    .line 181
    .line 182
    invoke-direct/range {v14 .. v20}, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;-><init>(ILcom/sumsub/sns/internal/features/data/repository/navigation/f;Lcom/sumsub/sns/internal/features/data/repository/navigation/i;Lcom/sumsub/sns/internal/features/data/repository/navigation/o;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/navigation/c;)V

    .line 183
    return-object v14
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
.end method

.method public final getDescriptor()Lvg0/f;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/x;->descriptor:Lvg0/f;

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
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/data/repository/navigation/x;->descriptor:Lvg0/f;

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
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/f;

    .line 19
    .line 20
    new-instance v3, Lcom/sumsub/sns/internal/features/data/repository/navigation/f;

    .line 21
    .line 22
    .line 23
    invoke-direct {v3}, Lcom/sumsub/sns/internal/features/data/repository/navigation/f;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    :goto_0
    sget-object v2, Lcom/sumsub/sns/internal/features/data/repository/navigation/d;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/d;

    .line 32
    .line 33
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/f;

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 37
    :cond_1
    const/4 v1, 0x1

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 41
    move-result v2

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_2
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;->b:Lcom/sumsub/sns/internal/features/data/repository/navigation/i;

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    :goto_1
    sget-object v2, Lcom/sumsub/sns/internal/features/data/repository/navigation/g;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/g;

    .line 51
    .line 52
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;->b:Lcom/sumsub/sns/internal/features/data/repository/navigation/i;

    .line 53
    .line 54
    .line 55
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 56
    .line 57
    :cond_3
    sget-object v1, Lcom/sumsub/sns/internal/features/data/repository/navigation/j;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/j;

    .line 58
    .line 59
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;->c:Lcom/sumsub/sns/internal/features/data/repository/navigation/o;

    .line 60
    const/4 v3, 0x2

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0, v3, v1, v2}, Lwg0/b;->encodeSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 64
    const/4 v1, 0x3

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 68
    move-result v2

    .line 69
    .line 70
    if-eqz v2, :cond_4

    .line 71
    goto :goto_2

    .line 72
    .line 73
    :cond_4
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;->d:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v2, :cond_5

    .line 76
    .line 77
    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 78
    .line 79
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;->d:Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-interface {p1, v0, v1, v2, v3}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 83
    :cond_5
    const/4 v1, 0x4

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, v0, v1}, Lwg0/b;->shouldEncodeElementDefault(Lvg0/f;I)Z

    .line 87
    move-result v2

    .line 88
    .line 89
    if-eqz v2, :cond_6

    .line 90
    goto :goto_3

    .line 91
    .line 92
    :cond_6
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;->e:Lcom/sumsub/sns/internal/features/data/repository/navigation/c;

    .line 93
    .line 94
    if-eqz v2, :cond_7

    .line 95
    .line 96
    :goto_3
    sget-object v2, Lcom/sumsub/sns/internal/features/data/repository/navigation/a;->a:Lcom/sumsub/sns/internal/features/data/repository/navigation/a;

    .line 97
    .line 98
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/navigation/z;->e:Lcom/sumsub/sns/internal/features/data/repository/navigation/c;

    .line 99
    .line 100
    .line 101
    invoke-interface {p1, v0, v1, v2, p2}, Lwg0/b;->encodeNullableSerializableElement(Lvg0/f;ILtg0/p;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_7
    invoke-interface {p1, v0}, Lwg0/b;->endStructure(Lvg0/f;)V

    .line 105
    return-void
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
