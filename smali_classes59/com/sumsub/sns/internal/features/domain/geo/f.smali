.class public final synthetic Lcom/sumsub/sns/internal/features/domain/geo/f;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/serialization/internal/m0;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/features/domain/geo/f;

.field private static final descriptor:Lvg0/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/geo/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/domain/geo/f;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/domain/geo/f;->a:Lcom/sumsub/sns/internal/features/domain/geo/f;

    .line 8
    .line 9
    new-instance v1, Lkotlinx/serialization/internal/h2;

    .line 10
    .line 11
    const-string v2, "com.sumsub.sns.internal.features.domain.geo.EncodeLocationUseCase.LocationPayload"

    .line 12
    const/4 v3, 0x3

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 16
    .line 17
    const-string v0, "lat"

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 22
    .line 23
    const-string v0, "lon"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 27
    .line 28
    const-string v0, "accuracy"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/h2;->o(Ljava/lang/String;Z)V

    .line 32
    .line 33
    sput-object v1, Lcom/sumsub/sns/internal/features/domain/geo/f;->descriptor:Lvg0/f;

    .line 34
    return-void
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
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    .line 3
    new-array v0, v0, [Ltg0/d;

    .line 4
    .line 5
    sget-object v1, Lkotlinx/serialization/internal/c0;->a:Lkotlinx/serialization/internal/c0;

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    aput-object v1, v0, v2

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    aput-object v1, v0, v2

    .line 12
    .line 13
    sget-object v1, Lkotlinx/serialization/internal/l0;->a:Lkotlinx/serialization/internal/l0;

    .line 14
    const/4 v2, 0x2

    .line 15
    .line 16
    aput-object v1, v0, v2

    .line 17
    return-object v0
.end method

.method public final deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;
    .locals 19

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/geo/f;->descriptor:Lvg0/f;

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
    const/4 v3, 0x2

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v0, v5}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeDoubleElement(Lvg0/f;I)D

    .line 21
    move-result-wide v5

    .line 22
    .line 23
    .line 24
    invoke-interface {v1, v0, v4}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeDoubleElement(Lvg0/f;I)D

    .line 25
    move-result-wide v7

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, v0, v3}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeFloatElement(Lvg0/f;I)F

    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x7

    .line 31
    move v13, v3

    .line 32
    move-wide v14, v5

    .line 33
    .line 34
    move-wide/from16 v16, v7

    .line 35
    .line 36
    :goto_0
    move/from16 v18, v2

    .line 37
    goto :goto_2

    .line 38
    .line 39
    :cond_0
    const-wide/16 v6, 0x0

    .line 40
    const/4 v2, 0x0

    .line 41
    move v11, v4

    .line 42
    move-wide v9, v6

    .line 43
    move v6, v5

    .line 44
    move-wide v7, v9

    .line 45
    .line 46
    :goto_1
    if-eqz v11, :cond_5

    .line 47
    .line 48
    .line 49
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeElementIndex(Lvg0/f;)I

    .line 50
    move-result v12

    .line 51
    const/4 v13, -0x1

    .line 52
    .line 53
    if-eq v12, v13, :cond_4

    .line 54
    .line 55
    if-eqz v12, :cond_3

    .line 56
    .line 57
    if-eq v12, v4, :cond_2

    .line 58
    .line 59
    if-ne v12, v3, :cond_1

    .line 60
    .line 61
    .line 62
    invoke-interface {v1, v0, v3}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeFloatElement(Lvg0/f;I)F

    .line 63
    move-result v2

    .line 64
    .line 65
    or-int/lit8 v6, v6, 0x4

    .line 66
    goto :goto_1

    .line 67
    .line 68
    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, v12}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    .line 72
    throw v0

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-interface {v1, v0, v4}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeDoubleElement(Lvg0/f;I)D

    .line 76
    move-result-wide v9

    .line 77
    .line 78
    or-int/lit8 v6, v6, 0x2

    .line 79
    goto :goto_1

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-interface {v1, v0, v5}, Lkotlinx/serialization/encoding/CompositeDecoder;->decodeDoubleElement(Lvg0/f;I)D

    .line 83
    move-result-wide v7

    .line 84
    .line 85
    or-int/lit8 v6, v6, 0x1

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    move v11, v5

    .line 88
    goto :goto_1

    .line 89
    :cond_5
    move v13, v6

    .line 90
    move-wide v14, v7

    .line 91
    .line 92
    move-wide/from16 v16, v9

    .line 93
    goto :goto_0

    .line 94
    .line 95
    .line 96
    :goto_2
    invoke-interface {v1, v0}, Lkotlinx/serialization/encoding/CompositeDecoder;->endStructure(Lvg0/f;)V

    .line 97
    .line 98
    new-instance v12, Lcom/sumsub/sns/internal/features/domain/geo/h;

    .line 99
    .line 100
    .line 101
    invoke-direct/range {v12 .. v18}, Lcom/sumsub/sns/internal/features/domain/geo/h;-><init>(IDDF)V

    .line 102
    return-object v12
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
.end method

.method public final getDescriptor()Lvg0/f;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/geo/f;->descriptor:Lvg0/f;

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
    check-cast p2, Lcom/sumsub/sns/internal/features/domain/geo/h;

    .line 3
    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/geo/f;->descriptor:Lvg0/f;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1, v0}, Lwg0/c;->beginStructure(Lvg0/f;)Lwg0/b;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    iget-wide v1, p2, Lcom/sumsub/sns/internal/features/domain/geo/h;->a:D

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0, v3, v1, v2}, Lwg0/b;->encodeDoubleElement(Lvg0/f;ID)V

    .line 15
    .line 16
    iget-wide v1, p2, Lcom/sumsub/sns/internal/features/domain/geo/h;->b:D

    .line 17
    const/4 v3, 0x1

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0, v3, v1, v2}, Lwg0/b;->encodeDoubleElement(Lvg0/f;ID)V

    .line 21
    .line 22
    iget p2, p2, Lcom/sumsub/sns/internal/features/domain/geo/h;->c:F

    .line 23
    const/4 v1, 0x2

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v0, v1, p2}, Lwg0/b;->encodeFloatElement(Lvg0/f;IF)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0}, Lwg0/b;->endStructure(Lvg0/f;)V

    .line 30
    return-void
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
