.class public final Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/p;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/f;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/p;->a:Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/p;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/p;->c:Ljava/util/List;

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
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/o;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/o;

    .line 12
    .line 13
    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/o;->b:I

    .line 14
    .line 15
    const/high16 v4, -0x80000000

    .line 16
    .line 17
    and-int v5, v3, v4

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    sub-int/2addr v3, v4

    .line 21
    .line 22
    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/o;->b:I

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/o;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/p;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/o;->a:Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/o;->b:I

    .line 37
    const/4 v5, 0x1

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    if-ne v4, v5, :cond_1

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    .line 46
    goto/16 :goto_a

    .line 47
    .line 48
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    throw v1

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/p;->a:Lkotlinx/coroutines/flow/f;

    .line 60
    .line 61
    move-object/from16 v4, p1

    .line 62
    .line 63
    check-cast v4, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/p;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 66
    .line 67
    if-eqz v6, :cond_3

    .line 68
    .line 69
    .line 70
    const-string/jumbo v8, "sns_paymentmethods_selector_title"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, v8}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    move-result-object v6

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    const/4 v6, 0x0

    .line 77
    .line 78
    :goto_1
    const-string v8, ""

    .line 79
    .line 80
    if-nez v6, :cond_4

    .line 81
    move-object v10, v8

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move-object v10, v6

    .line 84
    .line 85
    :goto_2
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/p;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 86
    .line 87
    if-eqz v6, :cond_5

    .line 88
    .line 89
    .line 90
    const-string/jumbo v9, "sns_paymentmethods_selector_section"

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v9}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    move-result-object v6

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    const/4 v6, 0x0

    .line 97
    .line 98
    :goto_3
    if-nez v6, :cond_6

    .line 99
    move-object v11, v8

    .line 100
    goto :goto_4

    .line 101
    :cond_6
    move-object v11, v6

    .line 102
    .line 103
    :goto_4
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/p;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 104
    .line 105
    if-eqz v6, :cond_7

    .line 106
    .line 107
    .line 108
    const-string/jumbo v9, "sns_paymentmethods_selector_action_continue"

    .line 109
    .line 110
    .line 111
    invoke-virtual {v6, v9}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    move-result-object v6

    .line 113
    goto :goto_5

    .line 114
    :cond_7
    const/4 v6, 0x0

    .line 115
    .line 116
    :goto_5
    if-nez v6, :cond_8

    .line 117
    move-object v12, v8

    .line 118
    goto :goto_6

    .line 119
    :cond_8
    move-object v12, v6

    .line 120
    .line 121
    :goto_6
    if-eqz v4, :cond_9

    .line 122
    move v13, v5

    .line 123
    goto :goto_7

    .line 124
    :cond_9
    const/4 v6, 0x0

    .line 125
    move v13, v6

    .line 126
    .line 127
    :goto_7
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/p;->c:Ljava/util/List;

    .line 128
    .line 129
    new-instance v14, Ljava/util/ArrayList;

    .line 130
    .line 131
    const/16 v9, 0xa

    .line 132
    .line 133
    .line 134
    invoke-static {v6, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 135
    move-result v9

    .line 136
    .line 137
    .line 138
    invoke-direct {v14, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    move-result-object v6

    .line 143
    .line 144
    .line 145
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    move-result v9

    .line 147
    .line 148
    if-eqz v9, :cond_c

    .line 149
    .line 150
    .line 151
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    move-result-object v9

    .line 153
    .line 154
    check-cast v9, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/b;

    .line 155
    .line 156
    new-instance v15, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/m;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/p;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 162
    .line 163
    if-eqz v9, :cond_a

    .line 164
    .line 165
    .line 166
    const-string/jumbo v7, "sns_paymentmethods_method_bankCard_title"

    .line 167
    .line 168
    .line 169
    invoke-virtual {v9, v7}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    move-result-object v7

    .line 171
    goto :goto_9

    .line 172
    :cond_a
    const/4 v7, 0x0

    .line 173
    .line 174
    :goto_9
    if-nez v7, :cond_b

    .line 175
    move-object v7, v8

    .line 176
    .line 177
    :cond_b
    const-string v9, "bankCard"

    .line 178
    .line 179
    .line 180
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    move-result v9

    .line 182
    .line 183
    .line 184
    invoke-direct {v15, v7, v9}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/m;-><init>(Ljava/lang/String;Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    goto :goto_8

    .line 189
    .line 190
    :cond_c
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/n;

    .line 191
    .line 192
    .line 193
    invoke-direct/range {v9 .. v14}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;)V

    .line 194
    .line 195
    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/o;->b:I

    .line 196
    .line 197
    .line 198
    invoke-interface {v1, v9, v2}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 199
    move-result-object v1

    .line 200
    .line 201
    if-ne v1, v3, :cond_d

    .line 202
    return-object v3

    .line 203
    .line 204
    :cond_d
    :goto_a
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 205
    return-object v1
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
