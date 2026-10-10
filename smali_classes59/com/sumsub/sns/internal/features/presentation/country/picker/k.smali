.class public final Lcom/sumsub/sns/internal/features/presentation/country/picker/k;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/f;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/k;->a:Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/country/picker/k;->b:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    move-object v2, v1

    .line 10
    .line 11
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;

    .line 12
    .line 13
    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->b:I

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
    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->b:I

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/country/picker/k;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->a:Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->b:I

    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x1

    .line 40
    const/4 v8, 0x0

    .line 41
    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    if-eq v4, v7, :cond_3

    .line 45
    .line 46
    if-eq v4, v6, :cond_2

    .line 47
    .line 48
    if-ne v4, v5, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    throw v1

    .line 62
    .line 63
    :cond_2
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->c:Lkotlinx/coroutines/flow/f;

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 67
    goto :goto_3

    .line 68
    .line 69
    :cond_3
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->e:I

    .line 70
    .line 71
    iget-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->c:Lkotlinx/coroutines/flow/f;

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 75
    goto :goto_1

    .line 76
    .line 77
    .line 78
    :cond_4
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 79
    .line 80
    iget-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/k;->a:Lkotlinx/coroutines/flow/f;

    .line 81
    .line 82
    move-object/from16 v1, p1

    .line 83
    .line 84
    check-cast v1, Ljava/lang/Number;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 88
    move-result v1

    .line 89
    .line 90
    if-lez v1, :cond_7

    .line 91
    .line 92
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/k;->b:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;

    .line 93
    .line 94
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->c:Lkotlinx/coroutines/flow/f;

    .line 95
    .line 96
    iput v1, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->e:I

    .line 97
    .line 98
    iput v7, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->b:I

    .line 99
    .line 100
    sget v7, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;->U:I

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v2}, Lcom/sumsub/sns/internal/features/presentation/common/c;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 104
    move-result-object v6

    .line 105
    .line 106
    if-ne v6, v3, :cond_5

    .line 107
    goto :goto_5

    .line 108
    :cond_5
    move-object v15, v4

    .line 109
    move v4, v1

    .line 110
    move-object v1, v6

    .line 111
    move-object v6, v15

    .line 112
    .line 113
    :goto_1
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 114
    .line 115
    if-eqz v1, :cond_6

    .line 116
    .line 117
    .line 118
    const-string/jumbo v7, "sns_countries_action_selectMultiple"

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v7}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    move-result-object v1

    .line 123
    move-object v9, v1

    .line 124
    goto :goto_2

    .line 125
    :cond_6
    move-object v9, v8

    .line 126
    .line 127
    :goto_2
    if-eqz v9, :cond_a

    .line 128
    .line 129
    .line 130
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 131
    move-result-object v11

    .line 132
    const/4 v13, 0x4

    .line 133
    const/4 v14, 0x0

    .line 134
    .line 135
    .line 136
    const-string/jumbo v10, "{count}"

    .line 137
    const/4 v12, 0x0

    .line 138
    .line 139
    .line 140
    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 141
    move-result-object v1

    .line 142
    goto :goto_4

    .line 143
    .line 144
    :cond_7
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/country/picker/k;->b:Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;

    .line 145
    .line 146
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->c:Lkotlinx/coroutines/flow/f;

    .line 147
    .line 148
    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->b:I

    .line 149
    .line 150
    sget v6, Lcom/sumsub/sns/internal/features/presentation/country/picker/CountryPickerDialog;->U:I

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/common/c;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 154
    move-result-object v1

    .line 155
    .line 156
    if-ne v1, v3, :cond_8

    .line 157
    goto :goto_5

    .line 158
    .line 159
    :cond_8
    :goto_3
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    .line 160
    .line 161
    if-eqz v1, :cond_9

    .line 162
    .line 163
    .line 164
    const-string/jumbo v6, "sns_countries_action_selectNothing"

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v6}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    move-result-object v1

    .line 169
    move-object v6, v4

    .line 170
    goto :goto_4

    .line 171
    :cond_9
    move-object v6, v4

    .line 172
    :cond_a
    move-object v1, v8

    .line 173
    .line 174
    :goto_4
    iput-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->c:Lkotlinx/coroutines/flow/f;

    .line 175
    .line 176
    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/country/picker/j;->b:I

    .line 177
    .line 178
    .line 179
    invoke-interface {v6, v1, v2}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 180
    move-result-object v1

    .line 181
    .line 182
    if-ne v1, v3, :cond_b

    .line 183
    :goto_5
    return-object v3

    .line 184
    .line 185
    :cond_b
    :goto_6
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 186
    return-object v1
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
