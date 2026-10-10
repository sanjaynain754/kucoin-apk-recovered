.class public final Lcom/sumsub/sns/internal/features/domain/C;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
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

.method public static a(Lcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/domain/n;)Lcom/sumsub/sns/internal/features/domain/B;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/n;->a:Ljava/util/List;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v1

    .line 23
    move-object v4, v1

    .line 24
    .line 25
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 26
    .line 27
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 28
    .line 29
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 30
    .line 31
    const-string v5, "PHONE_VERIFICATION"

    .line 32
    const/4 v6, 0x2

    .line 33
    .line 34
    .line 35
    invoke-static {v4, v5, v2, v6, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 36
    move-result v4

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v1, v3

    .line 41
    .line 42
    :goto_0
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/domain/n;->f:Lcom/sumsub/sns/internal/features/domain/m;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/domain/m;->b:Ljava/lang/String;

    .line 51
    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/domain/m;->a:Ljava/lang/String;

    .line 55
    .line 56
    if-nez v4, :cond_3

    .line 57
    .line 58
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/domain/m;->c:Ljava/lang/String;

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move-object v4, v3

    .line 61
    .line 62
    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 63
    .line 64
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/n;->b:Ljava/util/Map;

    .line 65
    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    .line 69
    invoke-static {v4, p1}, Lcom/sumsub/sns/core/presentation/form/viewutils/c;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    .line 73
    :cond_4
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->h()Ljava/lang/String;

    .line 74
    move-result-object p0

    .line 75
    .line 76
    if-eqz p0, :cond_7

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 80
    move-result p1

    .line 81
    .line 82
    if-eqz p1, :cond_5

    .line 83
    goto :goto_2

    .line 84
    .line 85
    :cond_5
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/B;

    .line 86
    .line 87
    if-eqz v1, :cond_6

    .line 88
    .line 89
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/data/model/common/m;->o:Ljava/lang/Boolean;

    .line 90
    .line 91
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    move-result v2

    .line 96
    .line 97
    .line 98
    :cond_6
    invoke-direct {p1, p0, v2}, Lcom/sumsub/sns/internal/features/domain/B;-><init>(Ljava/lang/String;Z)V

    .line 99
    return-object p1

    .line 100
    .line 101
    :cond_7
    :goto_2
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/B;

    .line 102
    .line 103
    if-nez p0, :cond_8

    .line 104
    goto :goto_3

    .line 105
    :cond_8
    move-object v3, p0

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-direct {p1, v3, v2}, Lcom/sumsub/sns/internal/features/domain/B;-><init>(Ljava/lang/String;Z)V

    .line 109
    return-object p1
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
