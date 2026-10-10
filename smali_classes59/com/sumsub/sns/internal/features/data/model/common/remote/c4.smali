.class public final Lcom/sumsub/sns/internal/features/data/model/common/remote/c4;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Ltg0/d;


# instance fields
.field public final a:Ltg0/d;

.field public final b:Lvg0/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/b4;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/a4;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/remote/a4;->serializer()Ltg0/d;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/c4;->a:Ltg0/d;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ltg0/d;->getDescriptor()Lvg0/f;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/c4;->b:Lvg0/f;

    .line 18
    return-void
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


# virtual methods
.method public final deserialize(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lkotlinx/serialization/SerializationException;

    .line 3
    .line 4
    const-string v0, "Deserialization is not supported for UpdatedField"

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 8
    throw p1
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

.method public final getDescriptor()Lvg0/f;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/c4;->b:Lvg0/f;

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
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/X3;

    .line 3
    .line 4
    instance-of v0, p1, Lxg0/r;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    move-object v0, p1

    .line 9
    .line 10
    check-cast v0, Lxg0/r;

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v0, v1

    .line 13
    .line 14
    :goto_0
    if-eqz v0, :cond_4

    .line 15
    .line 16
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/X3;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/p;

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :cond_1
    instance-of v1, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/n;

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lxg0/r;->a()Lxg0/a;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/n;

    .line 30
    .line 31
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/n;->a:Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lxg0/a;->getSerializersModule()Lyg0/a;

    .line 35
    .line 36
    sget-object v2, Lkotlinx/serialization/internal/w2;->a:Lkotlinx/serialization/internal/w2;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2, v1}, Lxg0/a;->d(Ltg0/p;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    .line 40
    move-result-object v1

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_2
    instance-of v1, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Lxg0/r;->a()Lxg0/a;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;

    .line 52
    .line 53
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/data/model/common/remote/o;->a:Ljava/util/List;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lxg0/a;->getSerializersModule()Lyg0/a;

    .line 57
    .line 58
    new-instance v2, Lkotlinx/serialization/internal/f;

    .line 59
    .line 60
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/R3;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/remote/Q3;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/features/data/model/common/remote/Q3;->serializer()Ltg0/d;

    .line 64
    move-result-object v3

    .line 65
    .line 66
    .line 67
    invoke-direct {v2, v3}, Lkotlinx/serialization/internal/f;-><init>(Ltg0/d;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v2, v1}, Lxg0/a;->d(Ltg0/p;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    :goto_1
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/remote/b4;

    .line 74
    .line 75
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/X3;->a:Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, p2, v1}, Lcom/sumsub/sns/internal/features/data/model/common/remote/b4;-><init>(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    .line 79
    .line 80
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/model/common/remote/c4;->a:Ltg0/d;

    .line 81
    .line 82
    .line 83
    invoke-interface {p2, p1, v0}, Ltg0/p;->serialize(Lwg0/c;Ljava/lang/Object;)V

    .line 84
    return-void

    .line 85
    .line 86
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 87
    .line 88
    .line 89
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 90
    throw p1

    .line 91
    .line 92
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string p2, "FieldRequestSerializer requires JsonEncoder"

    .line 95
    .line 96
    .line 97
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    throw p1
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
