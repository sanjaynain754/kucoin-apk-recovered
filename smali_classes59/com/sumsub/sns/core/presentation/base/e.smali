.class public final synthetic Lcom/sumsub/sns/core/presentation/base/e;
.super Lkotlin/jvm/internal/AdaptedFunctionReference;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;
.implements Lkotlin/coroutines/jvm/internal/SuspendFunction;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/f;)V
    .locals 7

    .line 1
    .line 2
    const-string v5, "handleState(Lcom/sumsub/sns/core/presentation/base/SNSBaseViewModel$SNSViewModelState;)V"

    .line 3
    const/4 v6, 0x4

    .line 4
    const/4 v1, 0x2

    .line 5
    .line 6
    const-class v3, Lcom/sumsub/sns/core/presentation/base/f;

    .line 7
    .line 8
    const-string v4, "handleState"

    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    .line 12
    .line 13
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/AdaptedFunctionReference;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    return-void
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


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/core/presentation/base/s;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    iget-object p2, p0, Lkotlin/jvm/internal/AdaptedFunctionReference;->receiver:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Lcom/sumsub/sns/core/presentation/base/f;

    .line 9
    .line 10
    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/f2;

    .line 16
    .line 17
    iget-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/f2;->a:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->f:Lcom/sumsub/sns/core/widget/SNSProgressView;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/main/f2;->d:Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/SNSProgressView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    :cond_0
    iget-boolean v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/f2;->c:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->f:Lcom/sumsub/sns/core/widget/SNSProgressView;

    .line 35
    .line 36
    if-eqz p2, :cond_4

    .line 37
    .line 38
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/f2;->e:Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Lcom/sumsub/sns/core/widget/SNSProgressView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_1
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/f2;->b:Ljava/lang/Boolean;

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    move-result v0

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->f:Lcom/sumsub/sns/core/widget/SNSProgressView;

    .line 55
    .line 56
    if-eqz p1, :cond_4

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->d(Landroid/view/View;)V

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_2
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->f:Lcom/sumsub/sns/core/widget/SNSProgressView;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/f2;->d:Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/widget/SNSProgressView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    :cond_3
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->f:Lcom/sumsub/sns/core/widget/SNSProgressView;

    .line 72
    .line 73
    if-eqz p1, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->b(Landroid/view/View;)V

    .line 77
    .line 78
    :cond_4
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 79
    return-object p1
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
