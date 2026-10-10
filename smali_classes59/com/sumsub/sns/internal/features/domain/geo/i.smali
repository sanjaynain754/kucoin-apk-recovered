.class public final Lcom/sumsub/sns/internal/features/domain/geo/i;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lxg0/a;


# direct methods
.method public constructor <init>(Lxg0/a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/geo/i;->a:Lxg0/a;

    .line 6
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/geo/e;)Lcom/sumsub/sns/internal/features/data/model/geo/a;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/geo/h;

    .line 3
    .line 4
    iget-wide v1, p2, Lcom/sumsub/sns/internal/features/data/model/geo/e;->a:D

    .line 5
    .line 6
    iget-wide v3, p2, Lcom/sumsub/sns/internal/features/data/model/geo/e;->b:D

    .line 7
    .line 8
    iget v5, p2, Lcom/sumsub/sns/internal/features/data/model/geo/e;->c:F

    .line 9
    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/domain/geo/h;-><init>(DDF)V

    .line 12
    .line 13
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/geo/i;->a:Lxg0/a;

    .line 14
    .line 15
    .line 16
    invoke-interface {p2}, Ltg0/n;->getSerializersModule()Lyg0/a;

    .line 17
    .line 18
    sget-object v1, Lcom/sumsub/sns/internal/features/domain/geo/h;->Companion:Lcom/sumsub/sns/internal/features/domain/geo/g;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/domain/geo/g;->serializer()Ltg0/d;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Ltg0/p;

    .line 25
    .line 26
    .line 27
    invoke-interface {p2, v1, v0}, Ltg0/c0;->b(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object p2

    .line 29
    .line 30
    const/16 v0, 0x10

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 44
    move-result-object p2

    .line 45
    .line 46
    .line 47
    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/core/common/j;->a([B[B)[B

    .line 48
    move-result-object p1

    .line 49
    const/4 p2, 0x2

    .line 50
    .line 51
    .line 52
    invoke-static {p1, p2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    const-string p2, "data"

    .line 56
    .line 57
    .line 58
    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/geo/i;->a:Lxg0/a;

    .line 66
    .line 67
    .line 68
    invoke-interface {p2}, Ltg0/n;->getSerializersModule()Lyg0/a;

    .line 69
    .line 70
    new-instance v1, Lkotlinx/serialization/internal/a1;

    .line 71
    .line 72
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 73
    .line 74
    .line 75
    invoke-static {v2}, Lug0/a;->u(Ltg0/d;)Ltg0/d;

    .line 76
    move-result-object v3

    .line 77
    .line 78
    .line 79
    invoke-direct {v1, v2, v3}, Lkotlinx/serialization/internal/a1;-><init>(Ltg0/d;Ltg0/d;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p2, v1, p1}, Ltg0/c0;->b(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    new-instance p2, Lcom/sumsub/sns/internal/features/data/model/geo/a;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 89
    move-result-object p1

    .line 90
    .line 91
    .line 92
    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/data/model/geo/a;-><init>([B)V

    .line 93
    return-object p2
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
.end method
