.class public final Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Ltg0/o;
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/d0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final h:[Lkotlin/Lazy;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/d0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/d0;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/d0;

    .line 8
    .line 9
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/y5;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/y5;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/z5;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2}, Lcom/sumsub/sns/internal/features/data/model/common/remote/z5;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    move-result-object v0

    .line 28
    const/4 v2, 0x7

    .line 29
    .line 30
    new-array v2, v2, [Lkotlin/Lazy;

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    .line 34
    aput-object v3, v2, v4

    .line 35
    const/4 v4, 0x1

    .line 36
    .line 37
    aput-object v3, v2, v4

    .line 38
    const/4 v4, 0x2

    .line 39
    .line 40
    aput-object v3, v2, v4

    .line 41
    const/4 v4, 0x3

    .line 42
    .line 43
    aput-object v1, v2, v4

    .line 44
    const/4 v1, 0x4

    .line 45
    .line 46
    aput-object v3, v2, v1

    .line 47
    const/4 v1, 0x5

    .line 48
    .line 49
    aput-object v3, v2, v1

    .line 50
    const/4 v1, 0x6

    .line 51
    .line 52
    aput-object v0, v2, v1

    .line 53
    .line 54
    sput-object v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->h:[Lkotlin/Lazy;

    .line 55
    return-void
    .line 56
    .line 57
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    and-int/lit8 v0, p1, 0x7f

    const/16 v1, 0x7f

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/c0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/c0;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/c0;->getDescriptor()Lvg0/f;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/c2;->a(IILvg0/f;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->d:Ljava/util/List;

    iput-object p6, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->e:Ljava/lang/String;

    iput-object p7, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->g:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->c:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->d:Ljava/util/List;

    .line 7
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->e:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->f:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->g:Ljava/util/List;

    return-void
.end method

.method public static final synthetic a()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/f;

    .line 3
    .line 4
    sget-object v1, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/f;-><init>(Ltg0/d;)V

    .line 8
    return-object v0
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

.method public static final synthetic b()Ltg0/d;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lkotlinx/serialization/internal/f;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/f0;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/f0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/f;-><init>(Ltg0/d;)V

    .line 8
    return-object v0
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
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

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
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->b:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->c:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->c:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->d:Ljava/util/List;

    .line 48
    .line 49
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->d:Ljava/util/List;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->e:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->e:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->f:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->f:Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    move-result v1

    .line 76
    .line 77
    if-nez v1, :cond_7

    .line 78
    return v2

    .line 79
    .line 80
    :cond_7
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->g:Ljava/util/List;

    .line 81
    .line 82
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->g:Ljava/util/List;

    .line 83
    .line 84
    .line 85
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    move-result p1

    .line 87
    .line 88
    if-nez p1, :cond_8

    .line 89
    return v2

    .line 90
    :cond_8
    return v0
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
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->b:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->c:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->d:Ljava/util/List;

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
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->e:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->f:Ljava/lang/String;

    .line 68
    .line 69
    if-nez v2, :cond_5

    .line 70
    move v2, v1

    .line 71
    goto :goto_5

    .line 72
    .line 73
    .line 74
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 75
    move-result v2

    .line 76
    :goto_5
    add-int/2addr v0, v2

    .line 77
    .line 78
    mul-int/lit8 v0, v0, 0x1f

    .line 79
    .line 80
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->g:Ljava/util/List;

    .line 81
    .line 82
    if-nez v2, :cond_6

    .line 83
    goto :goto_6

    .line 84
    .line 85
    .line 86
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 87
    move-result v1

    .line 88
    :goto_6
    add-int/2addr v0, v1

    .line 89
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->a:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->b:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->c:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->d:Ljava/util/List;

    .line 9
    .line 10
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->e:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->f:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/e0;->g:Ljava/util/List;

    .line 15
    .line 16
    new-instance v7, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    const-string v8, "MRTDData(imageId="

    .line 22
    .line 23
    .line 24
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v0, ", country="

    .line 30
    .line 31
    .line 32
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v0, ", idDocType="

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v0, ", data="

    .line 46
    .line 47
    .line 48
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v0, ", kinegramSessionId="

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v0, ", kinegramData="

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v0, ", processingErrors="

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v0, ")"

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    move-result-object v0

    .line 85
    return-object v0
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
