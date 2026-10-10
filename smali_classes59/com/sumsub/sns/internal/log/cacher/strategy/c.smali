.class public final Lcom/sumsub/sns/internal/log/cacher/strategy/c;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/log/cacher/strategy/g;


# static fields
.field public static final a:Lcom/sumsub/sns/internal/log/cacher/strategy/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/log/cacher/strategy/c;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/log/cacher/strategy/c;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/log/cacher/strategy/c;->a:Lcom/sumsub/sns/internal/log/cacher/strategy/c;

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
    .locals 6

    .line 1
    .line 2
    instance-of v0, p4, Lcom/sumsub/sns/internal/log/cacher/strategy/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p4

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->e:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->e:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p4}, Lcom/sumsub/sns/internal/log/cacher/strategy/a;-><init>(Lcom/sumsub/sns/internal/log/cacher/strategy/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p4, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->c:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->e:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->b:Ljava/io/Serializable;

    .line 43
    .line 44
    check-cast p1, Ljava/io/File;

    .line 45
    .line 46
    iget-object p2, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->a:Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    move-object v1, p2

    .line 51
    goto :goto_3

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    throw p1

    .line 60
    .line 61
    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->b:Ljava/io/Serializable;

    .line 62
    move-object p2, p1

    .line 63
    .line 64
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 65
    .line 66
    iget-object p1, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->a:Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    goto :goto_1

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    .line 75
    sget-object p4, Lkotlinx/coroutines/g2;->b:Lkotlinx/coroutines/g2;

    .line 76
    .line 77
    new-instance v2, Lcom/sumsub/sns/internal/log/cacher/strategy/b;

    .line 78
    const/4 v5, 0x0

    .line 79
    .line 80
    .line 81
    invoke-direct {v2, p3, v5}, Lcom/sumsub/sns/internal/log/cacher/strategy/b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 82
    .line 83
    iput-object p1, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->a:Ljava/lang/String;

    .line 84
    .line 85
    iput-object p2, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->b:Ljava/io/Serializable;

    .line 86
    .line 87
    iput v4, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->e:I

    .line 88
    .line 89
    .line 90
    invoke-static {p4, v2, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 91
    move-result-object p4

    .line 92
    .line 93
    if-ne p4, v1, :cond_4

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    :goto_1
    move-object p3, p4

    .line 96
    .line 97
    check-cast p3, Ljava/io/File;

    .line 98
    .line 99
    iput-object p1, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->a:Ljava/lang/String;

    .line 100
    .line 101
    iput-object p3, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->b:Ljava/io/Serializable;

    .line 102
    .line 103
    iput v3, v0, Lcom/sumsub/sns/internal/log/cacher/strategy/a;->e:I

    .line 104
    .line 105
    .line 106
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    move-result-object p4

    .line 108
    .line 109
    if-ne p4, v1, :cond_5

    .line 110
    :goto_2
    return-object v1

    .line 111
    :cond_5
    move-object v1, p1

    .line 112
    move-object p1, p3

    .line 113
    .line 114
    :goto_3
    check-cast p4, Ljava/lang/Boolean;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    move-result p2

    .line 119
    .line 120
    if-eqz p2, :cond_6

    .line 121
    .line 122
    if-eqz p1, :cond_9

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 126
    move-result p1

    .line 127
    .line 128
    .line 129
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 130
    goto :goto_4

    .line 131
    .line 132
    :cond_6
    if-eqz p1, :cond_7

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    if-nez p1, :cond_8

    .line 139
    .line 140
    .line 141
    :cond_7
    const-string/jumbo p1, "unknown"

    .line 142
    .line 143
    :cond_8
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 144
    .line 145
    new-instance p2, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    const-string p3, "Wrapped sink couldn\'t send value - cached to "

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    move-result-object v2

    .line 161
    const/4 v4, 0x4

    .line 162
    const/4 v5, 0x0

    .line 163
    const/4 v3, 0x0

    .line 164
    .line 165
    .line 166
    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 167
    .line 168
    :cond_9
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 169
    return-object p1
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
    instance-of p1, p1, Lcom/sumsub/sns/internal/log/cacher/strategy/c;

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
    const v0, -0x6737cdc9

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
    const-string v0, "CacheThenSendSinkStrategy"

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
