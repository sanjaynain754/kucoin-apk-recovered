.class public abstract Lcom/sumsub/sns/internal/features/domain/navigation/model/D;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lcom/sumsub/sns/internal/features/domain/navigation/model/z;)Lcom/sumsub/sns/internal/features/data/model/common/X;
    .locals 1

    .line 1
    .line 2
    instance-of v0, p0, Lcom/sumsub/sns/internal/features/domain/navigation/model/o;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Lcom/sumsub/sns/internal/features/domain/navigation/model/o;

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Lcom/sumsub/sns/internal/features/domain/navigation/model/o;->a()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/navigation/model/w;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/w;

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance p0, Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 22
    .line 23
    const-string v0, "VIDEO_IDENT"

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/sumsub/sns/internal/features/data/model/common/X;-><init>(Ljava/lang/String;)V

    .line 27
    return-object p0

    .line 28
    .line 29
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/navigation/model/x;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/x;

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    move-result v0

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/navigation/model/y;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/y;

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    move-result v0

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/navigation/model/q;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/q;

    .line 46
    .line 47
    .line 48
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    move-result v0

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/navigation/model/s;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/s;

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/navigation/model/r;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/r;

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    move-result v0

    .line 66
    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/navigation/model/d;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/d;

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    move-result v0

    .line 74
    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/navigation/model/v;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/v;

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    move-result v0

    .line 82
    .line 83
    if-nez v0, :cond_3

    .line 84
    .line 85
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/navigation/model/u;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/u;

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    move-result v0

    .line 90
    .line 91
    if-nez v0, :cond_3

    .line 92
    .line 93
    sget-object v0, Lcom/sumsub/sns/internal/features/domain/navigation/model/p;->a:Lcom/sumsub/sns/internal/features/domain/navigation/model/p;

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    move-result v0

    .line 98
    .line 99
    if-nez v0, :cond_3

    .line 100
    .line 101
    instance-of p0, p0, Lcom/sumsub/sns/internal/features/domain/navigation/model/t;

    .line 102
    .line 103
    if-eqz p0, :cond_2

    .line 104
    goto :goto_0

    .line 105
    .line 106
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 107
    .line 108
    .line 109
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 110
    throw p0

    .line 111
    .line 112
    :cond_3
    :goto_0
    new-instance p0, Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 113
    .line 114
    const-string v0, "TYPE_UNKNOWN"

    .line 115
    .line 116
    .line 117
    invoke-direct {p0, v0}, Lcom/sumsub/sns/internal/features/data/model/common/X;-><init>(Ljava/lang/String;)V

    .line 118
    return-object p0
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
