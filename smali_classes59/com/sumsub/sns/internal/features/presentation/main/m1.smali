.class public final Lcom/sumsub/sns/internal/features/presentation/main/m1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Z

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/main/a2;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/m1;->b:Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/m1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/m1;->b:Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/main/m1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    move-result p1

    .line 14
    .line 15
    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/m1;->a:Z

    .line 16
    return-object v0
    .line 17
    .line 18
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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Ljava/lang/Boolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 8
    .line 9
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/m1;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/m1;->b:Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/main/m1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    move-result p1

    .line 19
    .line 20
    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/m1;->a:Z

    .line 21
    .line 22
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/m1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-result-object p1

    .line 27
    return-object p1
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 7
    .line 8
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/m1;->a:Z

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    const-string v1, "Show progress = "

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 28
    .line 29
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 30
    .line 31
    const-string v2, "SNSAppViewModel2"

    .line 32
    const/4 v3, 0x0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/m1;->b:Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 38
    .line 39
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/l1;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/main/l1;-><init>(ZLkotlin/coroutines/Continuation;)V

    .line 43
    .line 44
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/main/a2;->x:[Lkotlin/reflect/KProperty;

    .line 45
    const/4 v2, 0x1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState(ZLkotlin/jvm/functions/Function2;)V

    .line 49
    .line 50
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/m1;->b:Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 51
    .line 52
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->k:Lcom/sumsub/sns/internal/features/presentation/main/j2;

    .line 53
    .line 54
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/j2;->a:Lkotlinx/coroutines/flow/n;

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 62
    const/4 v0, 0x0

    .line 63
    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/m1;->b:Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 67
    .line 68
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/main/a2;->p:Lkotlinx/coroutines/x1;

    .line 69
    .line 70
    if-eqz v1, :cond_0

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v3, v2, v3}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 74
    .line 75
    :cond_0
    iput-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/main/a2;->p:Lkotlinx/coroutines/x1;

    .line 76
    .line 77
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/o1;

    .line 78
    .line 79
    .line 80
    invoke-direct {v1, v3}, Lcom/sumsub/sns/internal/features/presentation/main/o1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p1, v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 87
    move-result-object v4

    .line 88
    .line 89
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/main/U1;

    .line 90
    .line 91
    .line 92
    invoke-direct {v7, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/main/U1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    .line 93
    const/4 v8, 0x3

    .line 94
    const/4 v9, 0x0

    .line 95
    const/4 v5, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    .line 98
    .line 99
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    iput-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/a2;->p:Lkotlinx/coroutines/x1;

    .line 103
    goto :goto_0

    .line 104
    .line 105
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/m1;->b:Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 106
    .line 107
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/main/a2;->p:Lkotlinx/coroutines/x1;

    .line 108
    .line 109
    if-eqz v1, :cond_2

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v3, v2, v3}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 113
    .line 114
    :cond_2
    iput-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/main/a2;->p:Lkotlinx/coroutines/x1;

    .line 115
    .line 116
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/o1;

    .line 117
    .line 118
    .line 119
    invoke-direct {v1, v3}, Lcom/sumsub/sns/internal/features/presentation/main/o1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 120
    .line 121
    .line 122
    invoke-static {p1, v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 123
    .line 124
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 125
    return-object p1
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
