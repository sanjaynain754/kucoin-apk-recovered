.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/code/g;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;

.field public final synthetic b:Lcom/sumsub/sns/databinding/t;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;Lcom/sumsub/sns/databinding/t;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/g;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/g;->b:Lcom/sumsub/sns/databinding/t;

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
.method public final onTextComplete(Ljava/lang/String;)Z
    .locals 12

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/g;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;->a:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    move-object v2, v0

    .line 10
    .line 11
    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;

    .line 12
    .line 13
    iget-object v0, v2, Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/code/y;

    .line 14
    .line 15
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->h:Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;->b:Lkotlinx/coroutines/flow/w;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/g;

    .line 26
    .line 27
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/d;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/d;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/d;->b:Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 37
    move-result v1

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    :goto_0
    move-object v5, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    goto :goto_0

    .line 44
    :goto_1
    const/4 v0, 0x1

    .line 45
    .line 46
    if-nez v5, :cond_1

    .line 47
    goto :goto_2

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {v2, v0}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 51
    .line 52
    .line 53
    invoke-static {v2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 54
    move-result-object v7

    .line 55
    move-object v8, v7

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 59
    move-result-object v7

    .line 60
    .line 61
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/t;

    .line 62
    const/4 v3, 0x0

    .line 63
    move-object v4, v2

    .line 64
    move-object v6, p1

    .line 65
    .line 66
    .line 67
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    const/4 v10, 0x2

    .line 69
    const/4 v11, 0x0

    .line 70
    move-object v6, v8

    .line 71
    const/4 v8, 0x0

    .line 72
    move-object v9, v1

    .line 73
    .line 74
    .line 75
    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 76
    .line 77
    :goto_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/g;->b:Lcom/sumsub/sns/databinding/t;

    .line 78
    .line 79
    iget-object p1, p1, Lcom/sumsub/sns/databinding/t;->c:Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 83
    return v0
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
