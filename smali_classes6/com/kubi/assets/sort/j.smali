.class public final Lcom/kubi/assets/sort/j;
.super Ljava/lang/Object;
.source "AccountTabSortData.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "getAccountNameStrRes",
        "",
        "Lcom/kubi/assets/sort/AccountBiz;",
        "getAccountName",
        "",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/kubi/assets/sort/AccountBiz;)Ljava/lang/String;
    .locals 2
    .param p0    # Lcom/kubi/assets/sort/AccountBiz;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lcom/kubi/assets/sort/j;->b(Lcom/kubi/assets/sort/AccountBiz;)I

    .line 11
    move-result p0

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    new-array v1, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
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
.end method

.method public static final b(Lcom/kubi/assets/sort/AccountBiz;)I
    .locals 1
    .param p0    # Lcom/kubi/assets/sort/AccountBiz;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$e;->b:Lcom/kubi/assets/sort/AccountBiz$e;

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget p0, Lcom/kubi/assets/R$string;->save_account_label:I

    .line 16
    return p0

    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$j;->b:Lcom/kubi/assets/sort/AccountBiz$j;

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    sget p0, Lcom/kubi/assets/R$string;->trading:I

    .line 27
    return p0

    .line 28
    .line 29
    :cond_1
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$k;->b:Lcom/kubi/assets/sort/AccountBiz$k;

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    move-result v0

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget p0, Lcom/kubi/assets/R$string;->kc_unify_account:I

    .line 38
    return p0

    .line 39
    .line 40
    :cond_2
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$g;->b:Lcom/kubi/assets/sort/AccountBiz$g;

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    move-result v0

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    sget p0, Lcom/kubi/assets/R$string;->lever_margin:I

    .line 49
    return p0

    .line 50
    .line 51
    :cond_3
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$f;->b:Lcom/kubi/assets/sort/AccountBiz$f;

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    move-result v0

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    sget p0, Lcom/kubi/assets/R$string;->futures:I

    .line 60
    return p0

    .line 61
    .line 62
    :cond_4
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$a;->b:Lcom/kubi/assets/sort/AccountBiz$a;

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    move-result v0

    .line 67
    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    sget p0, Lcom/kubi/assets/R$string;->asset_alpha_title:I

    .line 71
    return p0

    .line 72
    .line 73
    :cond_5
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$b;->b:Lcom/kubi/assets/sort/AccountBiz$b;

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    move-result v0

    .line 78
    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    sget p0, Lcom/kubi/assets/R$string;->kc_tb_asset_bot:I

    .line 82
    return p0

    .line 83
    .line 84
    :cond_6
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$d;->b:Lcom/kubi/assets/sort/AccountBiz$d;

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    move-result v0

    .line 89
    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    sget-object p0, Lcom/kubi/data/coin/AccountType;->FINANCE:Lcom/kubi/data/coin/AccountType;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/kubi/data/coin/AccountType;->getNickNameRes()I

    .line 96
    move-result p0

    .line 97
    return p0

    .line 98
    .line 99
    :cond_7
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$i;->b:Lcom/kubi/assets/sort/AccountBiz$i;

    .line 100
    .line 101
    .line 102
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    move-result v0

    .line 104
    .line 105
    if-eqz v0, :cond_8

    .line 106
    .line 107
    sget p0, Lcom/kubi/assets/R$string;->kc_options_title:I

    .line 108
    return p0

    .line 109
    .line 110
    :cond_8
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$c;->b:Lcom/kubi/assets/sort/AccountBiz$c;

    .line 111
    .line 112
    .line 113
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    move-result v0

    .line 115
    .line 116
    if-eqz v0, :cond_9

    .line 117
    .line 118
    sget p0, Lcom/kubi/assets/R$string;->copytd_copy_trading:I

    .line 119
    return p0

    .line 120
    .line 121
    :cond_9
    sget-object v0, Lcom/kubi/assets/sort/AccountBiz$h;->b:Lcom/kubi/assets/sort/AccountBiz$h;

    .line 122
    .line 123
    .line 124
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    move-result p0

    .line 126
    .line 127
    if-eqz p0, :cond_a

    .line 128
    .line 129
    sget p0, Lcom/kubi/assets/R$string;->kc_account_name_mining:I

    .line 130
    return p0

    .line 131
    .line 132
    :cond_a
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 133
    .line 134
    .line 135
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 136
    throw p0
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
.end method
