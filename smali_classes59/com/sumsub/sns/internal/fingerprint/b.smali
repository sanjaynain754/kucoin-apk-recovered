.class public final Lcom/sumsub/sns/internal/fingerprint/b;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/fingerprint/c;

.field public final synthetic b:Lcom/sumsub/sns/internal/fingerprint/f;

.field public final synthetic c:Lcom/sumsub/sns/internal/fingerprint/f;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/fingerprint/c;Lcom/sumsub/sns/internal/fingerprint/f;Lcom/sumsub/sns/internal/fingerprint/f;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/fingerprint/b;->a:Lcom/sumsub/sns/internal/fingerprint/c;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/fingerprint/b;->b:Lcom/sumsub/sns/internal/fingerprint/f;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/sumsub/sns/internal/fingerprint/b;->c:Lcom/sumsub/sns/internal/fingerprint/f;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
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
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iget-object v1, p0, Lcom/sumsub/sns/internal/fingerprint/b;->a:Lcom/sumsub/sns/internal/fingerprint/c;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/sumsub/sns/internal/fingerprint/c;->b:Lkotlin/Lazy;

    .line 6
    .line 7
    .line 8
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    check-cast v1, Lkotlin/Result;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    check-cast v1, Lcom/sumsub/sns/internal/fingerprint/e;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    iget-object v1, v1, Lcom/sumsub/sns/internal/fingerprint/e;->a:Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/u;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/u;->a()Ljava/util/ArrayList;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 41
    move-result v3

    .line 42
    const/4 v4, 0x0

    .line 43
    .line 44
    :goto_0
    if-ge v4, v3, :cond_0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    move-result-object v5

    .line 49
    add-int/2addr v4, v0

    .line 50
    .line 51
    check-cast v5, Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/s;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/s;->a()Ljava/util/Map;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    .line 58
    invoke-interface {v2, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_0
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 75
    move-result v2

    .line 76
    .line 77
    if-ne v2, v0, :cond_2

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 81
    .line 82
    check-cast v1, Lkotlin/Result;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 86
    move-result-object v0

    .line 87
    goto :goto_1

    .line 88
    .line 89
    :cond_2
    if-nez v2, :cond_4

    .line 90
    .line 91
    .line 92
    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    :goto_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/fingerprint/b;->b:Lcom/sumsub/sns/internal/fingerprint/f;

    .line 104
    .line 105
    .line 106
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    if-nez v2, :cond_3

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/fingerprint/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    goto :goto_2

    .line 114
    .line 115
    :cond_3
    iget-object v0, p0, Lcom/sumsub/sns/internal/fingerprint/b;->c:Lcom/sumsub/sns/internal/fingerprint/f;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    iget-object v0, v0, Lcom/sumsub/sns/internal/fingerprint/f;->a:Lkotlin/coroutines/SafeContinuation;

    .line 122
    .line 123
    .line 124
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    move-result-object v1

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Lkotlin/coroutines/SafeContinuation;->resumeWith(Ljava/lang/Object;)V

    .line 129
    .line 130
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 131
    .line 132
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 133
    return-object v0

    .line 134
    .line 135
    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 136
    .line 137
    .line 138
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 139
    throw v0
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
.end method
