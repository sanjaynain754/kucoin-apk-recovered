.class public final Lcom/sumsub/sns/internal/features/domain/mrtd/b;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/domain/mrtd/j;

.field public final b:Lcom/sumsub/sns/internal/features/domain/mrtd/G;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/mrtd/j;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/domain/mrtd/j;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 6
    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/features/domain/mrtd/G;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/domain/mrtd/G;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/b;->a:Lcom/sumsub/sns/internal/features/domain/mrtd/j;

    .line 16
    .line 17
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/b;->b:Lcom/sumsub/sns/internal/features/domain/mrtd/G;

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/A2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    .line 2
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/domain/mrtd/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/domain/mrtd/a;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/mrtd/a;->c:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/mrtd/a;->c:I

    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/mrtd/a;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/domain/mrtd/a;-><init>(Lcom/sumsub/sns/internal/features/domain/mrtd/b;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    iget-object p2, v6, Lcom/sumsub/sns/internal/features/domain/mrtd/a;->a:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    iget v1, v6, Lcom/sumsub/sns/internal/features/domain/mrtd/a;->c:I

    .line 35
    const/4 v7, 0x1

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v7, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    .line 44
    check-cast p2, Lkotlin/Result;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 48
    goto :goto_4

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/b;->a:Lcom/sumsub/sns/internal/features/domain/mrtd/j;

    .line 62
    .line 63
    iget-object v1, p2, Lcom/sumsub/sns/internal/features/domain/mrtd/j;->c:Lkotlin/Lazy;

    .line 64
    .line 65
    .line 66
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    check-cast v1, Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    move-result v1

    .line 74
    .line 75
    if-nez v1, :cond_3

    .line 76
    .line 77
    sget-object p2, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->ModuleNotFound:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 78
    :goto_2
    move-object v5, p2

    .line 79
    goto :goto_3

    .line 80
    .line 81
    :cond_3
    iget-object v1, p2, Lcom/sumsub/sns/internal/features/domain/mrtd/j;->a:Lkotlin/jvm/functions/Function0;

    .line 82
    .line 83
    .line 84
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 85
    move-result-object v1

    .line 86
    .line 87
    check-cast v1, Lcom/sumsub/sns/internal/core/common/r0;

    .line 88
    .line 89
    .line 90
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/domain/mrtd/j;->a(Lcom/sumsub/sns/internal/core/common/r0;)Z

    .line 91
    move-result v1

    .line 92
    .line 93
    if-nez v1, :cond_4

    .line 94
    .line 95
    sget-object p2, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->HardwareUnavailable:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 96
    goto :goto_2

    .line 97
    .line 98
    :cond_4
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/domain/mrtd/j;->d:Lkotlin/Lazy;

    .line 99
    .line 100
    .line 101
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 102
    move-result-object p2

    .line 103
    .line 104
    check-cast p2, Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    move-result p2

    .line 109
    .line 110
    if-nez p2, :cond_5

    .line 111
    .line 112
    sget-object p2, Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;->ModuleMisconfigured:Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;

    .line 113
    goto :goto_2

    .line 114
    :cond_5
    const/4 p2, 0x0

    .line 115
    goto :goto_2

    .line 116
    .line 117
    :goto_3
    if-nez v5, :cond_6

    .line 118
    const/4 p1, 0x0

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 122
    move-result-object p1

    .line 123
    return-object p1

    .line 124
    .line 125
    :cond_6
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/b;->b:Lcom/sumsub/sns/internal/features/domain/mrtd/G;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->g()Ljava/lang/String;

    .line 129
    move-result-object v2

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->c()Ljava/lang/String;

    .line 133
    move-result-object v3

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/A2;->f()Ljava/lang/String;

    .line 137
    move-result-object v4

    .line 138
    .line 139
    iput v7, v6, Lcom/sumsub/sns/internal/features/domain/mrtd/a;->c:I

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/domain/mrtd/G;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/MRTDError;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    if-ne p1, v0, :cond_7

    .line 146
    return-object v0

    .line 147
    .line 148
    .line 149
    :cond_7
    :goto_4
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 150
    move-result-object p1

    .line 151
    return-object p1
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
