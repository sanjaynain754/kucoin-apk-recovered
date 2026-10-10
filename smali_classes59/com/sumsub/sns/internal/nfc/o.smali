.class public abstract Lcom/sumsub/sns/internal/nfc/o;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(IILkotlin/jvm/functions/Function0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    .line 2
    instance-of v0, p3, Lcom/sumsub/sns/internal/nfc/n;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/nfc/n;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/nfc/n;->f:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/nfc/n;->f:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/nfc/n;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p3}, Lcom/sumsub/sns/internal/nfc/n;-><init>(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/nfc/n;->e:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/nfc/n;->f:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget p0, v0, Lcom/sumsub/sns/internal/nfc/n;->c:I

    .line 40
    .line 41
    iget p1, v0, Lcom/sumsub/sns/internal/nfc/n;->b:I

    .line 42
    .line 43
    iget p2, v0, Lcom/sumsub/sns/internal/nfc/n;->a:I

    .line 44
    .line 45
    iget-object v2, v0, Lcom/sumsub/sns/internal/nfc/n;->d:Lkotlin/jvm/functions/Function0;

    .line 46
    .line 47
    .line 48
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    move p3, p2

    .line 50
    move p2, p1

    .line 51
    move p1, p3

    .line 52
    move-object p3, v2

    .line 53
    goto :goto_2

    .line 54
    .line 55
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p0

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    if-ltz p0, :cond_5

    .line 67
    const/4 p3, 0x0

    .line 68
    move v6, p1

    .line 69
    move p1, p0

    .line 70
    move p0, p3

    .line 71
    move-object p3, p2

    .line 72
    move p2, v6

    .line 73
    .line 74
    .line 75
    :goto_1
    :try_start_0
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 76
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    return-object p0

    .line 78
    :catchall_0
    move-exception v2

    .line 79
    .line 80
    if-eq p0, p1, :cond_4

    .line 81
    int-to-long v4, p2

    .line 82
    .line 83
    iput-object p3, v0, Lcom/sumsub/sns/internal/nfc/n;->d:Lkotlin/jvm/functions/Function0;

    .line 84
    .line 85
    iput p1, v0, Lcom/sumsub/sns/internal/nfc/n;->a:I

    .line 86
    .line 87
    iput p2, v0, Lcom/sumsub/sns/internal/nfc/n;->b:I

    .line 88
    .line 89
    iput p0, v0, Lcom/sumsub/sns/internal/nfc/n;->c:I

    .line 90
    .line 91
    iput v3, v0, Lcom/sumsub/sns/internal/nfc/n;->f:I

    .line 92
    .line 93
    .line 94
    invoke-static {v4, v5, v0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 95
    move-result-object v2

    .line 96
    .line 97
    if-ne v2, v1, :cond_3

    .line 98
    return-object v1

    .line 99
    .line 100
    :cond_3
    :goto_2
    if-eq p0, p1, :cond_5

    .line 101
    .line 102
    add-int/lit8 p0, p0, 0x1

    .line 103
    goto :goto_1

    .line 104
    :cond_4
    throw v2

    .line 105
    .line 106
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    const-string p1, "Impossible state"

    .line 109
    .line 110
    .line 111
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 112
    throw p0
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method
