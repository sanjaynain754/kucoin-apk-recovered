.class public final Lcom/sumsub/sns/internal/features/data/repository/common/e;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/data/repository/common/a;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/common/b;

.field public final b:Lkotlinx/coroutines/flow/n;

.field public final c:Lkotlinx/coroutines/flow/w;

.field public d:Ljava/util/Map;

.field public final e:Lcom/sumsub/sentry/android/a;

.field public final f:Lcom/sumsub/sns/internal/util/root/a;

.field public final g:Lcom/sumsub/sentry/android/g;

.field public final h:Lcom/sumsub/sns/internal/util/root/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/sumsub/sns/internal/features/data/repository/common/b;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a:Lcom/sumsub/sns/internal/features/data/repository/common/b;

    .line 6
    const/4 p2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {p2}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->b:Lkotlinx/coroutines/flow/n;

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->c:Lkotlinx/coroutines/flow/w;

    .line 19
    .line 20
    new-instance p2, Lcom/sumsub/sentry/android/a;

    .line 21
    .line 22
    .line 23
    invoke-direct {p2}, Lcom/sumsub/sentry/android/a;-><init>()V

    .line 24
    .line 25
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->e:Lcom/sumsub/sentry/android/a;

    .line 26
    .line 27
    new-instance v0, Lcom/sumsub/sns/internal/util/root/a;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/util/root/a;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->f:Lcom/sumsub/sns/internal/util/root/a;

    .line 33
    .line 34
    new-instance v0, Lcom/sumsub/sentry/android/g;

    .line 35
    .line 36
    const/16 v1, 0x1c

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, p1, p2, v1}, Lcom/sumsub/sentry/android/g;-><init>(Landroid/content/Context;Lcom/sumsub/sentry/android/a;I)V

    .line 40
    .line 41
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->g:Lcom/sumsub/sentry/android/g;

    .line 42
    .line 43
    new-instance p1, Lcom/sumsub/sns/internal/util/root/c;

    .line 44
    .line 45
    .line 46
    invoke-direct {p1}, Lcom/sumsub/sns/internal/util/root/c;-><init>()V

    .line 47
    .line 48
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->h:Lcom/sumsub/sns/internal/util/root/c;

    .line 49
    return-void
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
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


# virtual methods
.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/repository/common/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/c;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/common/c;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/common/c;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/common/c;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/common/c;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/common/c;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 20
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/common/c;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/repository/common/c;->a:Lcom/sumsub/sns/internal/features/data/repository/common/e;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->d:Ljava/util/Map;

    if-nez p1, :cond_4

    .line 22
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a:Lcom/sumsub/sns/internal/features/data/repository/common/b;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/data/repository/common/c;->a:Lcom/sumsub/sns/internal/features/data/repository/common/e;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/common/c;->d:I

    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/common/b;->d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    .line 23
    :goto_1
    check-cast p1, Ljava/util/Map;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->d:Ljava/util/Map;

    .line 24
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->d:Ljava/util/Map;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->b:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/core/data/model/SNSSDKState;

    .line 2
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 3
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The SDK state was changed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 4
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 5
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v4, 0x0

    .line 6
    invoke-virtual {v3, v1, v2, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz v0, :cond_1

    .line 7
    :try_start_0
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getStateChangedHandler()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1, v0, p1}, Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;->onStateChanged(Lcom/sumsub/sns/core/data/model/SNSSDKState;Lcom/sumsub/sns/core/data/model/SNSSDKState;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    .line 9
    :cond_0
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v3, v1, v2, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    :cond_1
    :goto_0
    sput-object p1, Lcom/sumsub/sns/internal/core/common/k0;->g:Lcom/sumsub/sns/core/data/model/SNSSDKState;

    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->b:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 12
    instance-of v0, p1, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;

    if-eqz v0, :cond_5

    .line 13
    check-cast p1, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;

    invoke-virtual {p1}, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;->getException()Ljava/lang/Exception;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 14
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_2

    move-object v4, p1

    :cond_2
    if-eqz v4, :cond_5

    .line 15
    sget-object p1, Lcom/sumsub/sns/internal/core/common/F0;->a:Ljava/util/Map;

    .line 16
    instance-of p1, v4, Lcom/sumsub/sns/core/data/model/SNSException;

    if-eqz p1, :cond_3

    check-cast v4, Lcom/sumsub/sns/core/data/model/SNSException;

    goto :goto_2

    .line 17
    :cond_3
    instance-of p1, v4, Ljava/io/IOException;

    if-eqz p1, :cond_4

    new-instance p1, Lcom/sumsub/sns/core/data/model/SNSException$Network;

    invoke-direct {p1, v4}, Lcom/sumsub/sns/core/data/model/SNSException$Network;-><init>(Ljava/lang/Throwable;)V

    :goto_1
    move-object v4, p1

    goto :goto_2

    .line 18
    :cond_4
    new-instance p1, Lcom/sumsub/sns/core/data/model/SNSException$Internal;

    invoke-direct {p1, v4}, Lcom/sumsub/sns/core/data/model/SNSException$Internal;-><init>(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 19
    :goto_2
    invoke-static {v4}, Lcom/sumsub/sns/internal/core/common/F0;->a(Lcom/sumsub/sns/core/data/model/SNSException;)V

    :cond_5
    return-void
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/repository/common/d;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/d;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/common/d;->c:I

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
    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/common/d;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/common/d;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/common/d;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/common/d;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/common/d;->c:I

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
    .line 40
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    goto :goto_1

    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    :try_start_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a:Lcom/sumsub/sns/internal/features/data/repository/common/b;

    .line 57
    .line 58
    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/common/d;->c:I

    .line 59
    .line 60
    .line 61
    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/common/b;->b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    return-object v1

    .line 66
    .line 67
    :cond_3
    :goto_1
    check-cast p1, Lretrofit2/Response;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lretrofit2/Response;->code()I

    .line 71
    move-result v1

    .line 72
    .line 73
    const/16 v2, 0xc8

    .line 74
    .line 75
    if-eq v1, v2, :cond_5

    .line 76
    .line 77
    const/16 v2, 0xcc

    .line 78
    .line 79
    if-eq v1, v2, :cond_4

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1}, Lretrofit2/Response;->code()I

    .line 83
    move-result p1

    .line 84
    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    const-string v2, "Unexpected response code: "

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 103
    .line 104
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    .line 107
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    move-result-object p1

    .line 116
    return-object p1

    .line 117
    :cond_4
    const/4 p1, 0x0

    .line 118
    .line 119
    .line 120
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    .line 124
    :cond_5
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    .line 131
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 133
    return-object p1

    .line 134
    .line 135
    .line 136
    :goto_2
    invoke-virtual {v0}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, Lkotlinx/coroutines/z1;->l(Lkotlin/coroutines/CoroutineContext;)V

    .line 141
    .line 142
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 143
    .line 144
    .line 145
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    .line 149
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

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
