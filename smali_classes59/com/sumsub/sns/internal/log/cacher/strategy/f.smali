.class public final Lcom/sumsub/sns/internal/log/cacher/strategy/f;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/log/cacher/strategy/g;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/log/cacher/strategy/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/log/cacher/strategy/f;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/log/cacher/strategy/f;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/log/cacher/strategy/f;->a:Lcom/sumsub/sns/internal/log/cacher/strategy/f;

    .line 8
    return-void
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
.method public final a(Ljava/lang/String;Lcom/sumsub/sns/internal/log/cacher/i;Lcom/sumsub/sns/internal/log/cacher/j;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    .line 2
    instance-of v0, p4, Lcom/sumsub/sns/internal/log/cacher/strategy/d;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p4

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->e:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->e:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p4}, Lcom/sumsub/sns/internal/log/cacher/strategy/d;-><init>(Lcom/sumsub/sns/internal/log/cacher/strategy/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p4, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->c:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->e:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    goto :goto_3

    .line 45
    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    throw p1

    .line 53
    .line 54
    :cond_2
    iget-object p3, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->b:Lcom/sumsub/sns/internal/log/cacher/j;

    .line 55
    .line 56
    iget-object p1, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->a:Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    :cond_3
    move-object v5, p1

    .line 61
    goto :goto_1

    .line 62
    .line 63
    .line 64
    :cond_4
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    iput-object p1, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->a:Ljava/lang/String;

    .line 67
    .line 68
    iput-object p3, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->b:Lcom/sumsub/sns/internal/log/cacher/j;

    .line 69
    .line 70
    iput v4, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->e:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, v0}, Lcom/sumsub/sns/internal/log/cacher/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    move-result-object p4

    .line 75
    .line 76
    if-ne p4, v1, :cond_3

    .line 77
    goto :goto_2

    .line 78
    .line 79
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    move-result p1

    .line 84
    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 88
    return-object p1

    .line 89
    .line 90
    :cond_5
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 91
    const/4 v8, 0x4

    .line 92
    const/4 v9, 0x0

    .line 93
    .line 94
    const-string v6, "Send failed, caching value ..."

    .line 95
    const/4 v7, 0x0

    .line 96
    .line 97
    .line 98
    invoke-static/range {v4 .. v9}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 99
    .line 100
    sget-object p1, Lkotlinx/coroutines/g2;->b:Lkotlinx/coroutines/g2;

    .line 101
    .line 102
    new-instance p2, Lcom/sumsub/sns/internal/log/cacher/strategy/e;

    .line 103
    const/4 p4, 0x0

    .line 104
    .line 105
    .line 106
    invoke-direct {p2, p3, p4}, Lcom/sumsub/sns/internal/log/cacher/strategy/e;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 107
    .line 108
    iput-object p4, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->a:Ljava/lang/String;

    .line 109
    .line 110
    iput-object p4, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->b:Lcom/sumsub/sns/internal/log/cacher/j;

    .line 111
    .line 112
    iput v3, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/d;->e:I

    .line 113
    .line 114
    .line 115
    invoke-static {p1, p2, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    if-ne p1, v1, :cond_6

    .line 119
    :goto_2
    return-object v1

    .line 120
    .line 121
    :cond_6
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 122
    return-object p1
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

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
    instance-of p1, p1, Lcom/sumsub/sns/internal/log/cacher/strategy/f;

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    return v0
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

.method public final hashCode()I
    .locals 1

    .line 1
    .line 2
    .line 3
    const v0, 0x5d87790d

    .line 4
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "SendThenCacheSinkStrategy"

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
