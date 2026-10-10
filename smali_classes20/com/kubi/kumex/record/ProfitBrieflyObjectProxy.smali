.class public final Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;
.super Lcom/kubi/sdk/n3;
.source "RecordObjects.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/sdk/n3<",
        "Lcom/kubi/kumex/record/g0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001c\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;",
        "Lcom/kubi/sdk/ViewHolderProxy;",
        "Lcom/kubi/kumex/record/ProfitBrieflyObject;",
        "parent",
        "Landroid/view/ViewGroup;",
        "shortCall",
        "Lcom/kubi/sdk/ItemCallBack;",
        "Lcom/kubi/kumex/record/CommonEmptyObject;",
        "longCall",
        "<init>",
        "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V",
        "getParent",
        "()Landroid/view/ViewGroup;",
        "getShortCall",
        "()Lcom/kubi/sdk/ItemCallBack;",
        "getLongCall",
        "createView",
        "Landroid/view/View;",
        "bindView",
        "",
        "d",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final longCall:Lcom/kubi/sdk/s2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/sdk/s2<",
            "Lcom/kubi/kumex/record/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final parent:Landroid/view/ViewGroup;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final shortCall:Lcom/kubi/sdk/s2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/sdk/s2<",
            "Lcom/kubi/kumex/record/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lcom/kubi/sdk/s2;Lcom/kubi/sdk/s2;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/s2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/sdk/s2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lcom/kubi/sdk/s2<",
            "Lcom/kubi/kumex/record/b;",
            ">;",
            "Lcom/kubi/sdk/s2<",
            "Lcom/kubi/kumex/record/b;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "parent"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/sdk/n3;-><init>(Landroid/view/ViewGroup;Lcom/kubi/sdk/s2;Lcom/kubi/sdk/s2;)V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->parent:Landroid/view/ViewGroup;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->shortCall:Lcom/kubi/sdk/s2;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->longCall:Lcom/kubi/sdk/s2;

    .line 15
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
.end method

.method public static synthetic a()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->bindView$lambda$17$lambda$16()Lkotlin/Unit;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static synthetic b(Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->bindView$lambda$6$lambda$5(Landroid/view/View;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
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
.end method

.method private static final bindView$lambda$14$lambda$13()Lkotlin/Unit;
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    sget-object v1, Lwl/l0;->a:Lwl/l0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lwl/l0;->s0()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const/16 v8, 0x7e

    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v0 .. v9}, Lg00/r$a;->a(Lg00/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    return-object v0
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

.method private static final bindView$lambda$17$lambda$16()Lkotlin/Unit;
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lf00/a;->a:Lf00/a;

    .line 3
    .line 4
    sget-object v1, Lwl/l0;->a:Lwl/l0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lwl/l0;->t0()Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const/16 v8, 0x7e

    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static/range {v0 .. v9}, Lg00/r$a;->a(Lg00/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    return-object v0
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

.method private static final bindView$lambda$6$lambda$5(Landroid/view/View;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    sget v0, Lcom/kubi/kumex/R$string;->kumex_tax:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/kumex/R$string;->kumex_profit_details_tax_desc:I

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x4

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v2}, Lcom/kubi/kumex/dialog/u;->J(IILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/kubi/resources/dialog/BaseDialogFragment;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Landroidx/fragment/app/ViewKt;->findFragment(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    const-string v1, "getChildFragmentManager(...)"

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    const-string v1, "kumex_profit_details_tax_desc"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    return-object p0
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
.end method

.method private static final bindView$lambda$9$lambda$8(Landroid/view/View;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    sget v0, Lcom/kubi/kumex/R$string;->kumex_pnln_liq_money:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/kumex/R$string;->kumex_pnln_liq_des_detail:I

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x4

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v2}, Lcom/kubi/kumex/dialog/u;->J(IILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/kubi/resources/dialog/BaseDialogFragment;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Landroidx/fragment/app/ViewKt;->findFragment(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    const-string v1, "getChildFragmentManager(...)"

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    const-string v1, "kumex_profit_details_tax_desc"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    return-object p0
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
.end method

.method public static synthetic c(Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->bindView$lambda$9$lambda$8(Landroid/view/View;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
    .line 6
    .line 7
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
.end method

.method public static synthetic d()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->bindView$lambda$14$lambda$13()Lkotlin/Unit;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method


# virtual methods
.method public bindView(Lcom/kubi/kumex/record/g0;)V
    .locals 21
    .param p1    # Lcom/kubi/kumex/record/g0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "d"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super/range {p0 .. p1}, Lcom/kubi/sdk/n3;->bindView(Ljava/lang/Object;)V

    .line 3
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/sdk/n3;->getHolder()Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v0

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const-string v2, "itemView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget v2, Lcom/kubi/kumex/R$id;->profitSymbol:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/kubi/resources/widget/BaseTextView;

    invoke-virtual {v1}, Lcom/kubi/kumex/record/g0;->m()Lcom/kubi/utils/v0;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    sget v2, Lcom/kubi/kumex/R$id;->closeTypeTv:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/AppCompatTextView;

    .line 6
    invoke-virtual {v1}, Lcom/kubi/kumex/record/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/kubi/kumex/record/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v7, 0x1

    if-lez v3, :cond_0

    move v3, v7

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 8
    invoke-virtual {v1}, Lcom/kubi/kumex/record/a;->d()Lcom/kubi/utils/v0;

    move-result-object v2

    const-string v8, "findViewById(...)"

    if-nez v2, :cond_1

    .line 9
    sget v2, Lcom/kubi/kumex/R$id;->directionTv:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    goto :goto_1

    .line 10
    :cond_1
    sget v2, Lcom/kubi/kumex/R$id;->directionTv:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 11
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/kubi/resources/widget/KcTradeRateView;

    .line 12
    invoke-virtual {v1}, Lcom/kubi/kumex/record/a;->d()Lcom/kubi/utils/v0;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    invoke-virtual {v1}, Lcom/kubi/kumex/record/a;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/KcTradeRateView;->setTextColor(I)V

    .line 14
    :goto_1
    sget v2, Lcom/kubi/kumex/R$id;->marginMode:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/kubi/resources/widget/BaseTextView;

    invoke-virtual {v1}, Lcom/kubi/kumex/record/a;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    invoke-virtual {v1}, Lcom/kubi/kumex/record/a;->f()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    .line 16
    sget v2, Lcom/kubi/kumex/R$id;->leverageTv:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    goto :goto_2

    .line 17
    :cond_2
    sget v2, Lcom/kubi/kumex/R$id;->leverageTv:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/kubi/resources/widget/BaseTextView;

    .line 18
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 19
    invoke-virtual {v1}, Lcom/kubi/kumex/record/a;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    :goto_2
    sget v2, Lcom/kubi/kumex/R$id;->time:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/kubi/resources/widget/BaseTextView;

    invoke-virtual {v1}, Lcom/kubi/kumex/record/a;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    sget v2, Lcom/kubi/kumex/R$id;->trialTag:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/kubi/resources/widget/BaseTextView;

    .line 22
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->isTrialFunds()Z

    move-result v3

    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/k;->G(Landroid/view/View;Z)V

    .line 23
    invoke-virtual {v1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v3

    invoke-virtual {v3}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getPrizeType()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/kubi/utils/t0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    sget v2, Lcom/kubi/kumex/R$id;->closePnlValueTv:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/kubi/resources/widget/BaseTextView;

    .line 25
    invoke-virtual {v1}, Lcom/kubi/kumex/record/g0;->j()Ljava/math/BigDecimal;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/kubi/kumex/record/g0;->l(Lcom/kubi/kumex/record/g0;Ljava/math/BigDecimal;IIILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v2

    .line 26
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    sget v1, Lcom/kubi/kumex/R$id;->foundingFeeValueTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/kubi/resources/widget/BaseTextView;

    .line 28
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getFundingFee()Ljava/math/BigDecimal;

    move-result-object v1

    const/4 v10, 0x0

    invoke-static {v1, v10, v7, v10}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object v2

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lcom/kubi/kumex/record/g0;->l(Lcom/kubi/kumex/record/g0;Ljava/math/BigDecimal;IIILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v2

    .line 29
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    sget v1, Lcom/kubi/kumex/R$id;->feeValueTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/kubi/resources/widget/BaseTextView;

    .line 31
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getDealComm()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1, v10, v7, v10}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object v2

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lcom/kubi/kumex/record/g0;->l(Lcom/kubi/kumex/record/g0;Ljava/math/BigDecimal;IIILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v2

    .line 32
    invoke-virtual {v9, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getMarginMode()Ljava/lang/String;

    move-result-object v1

    const-string v9, "CROSS"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 34
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getWithdrawPnl()Ljava/math/BigDecimal;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 35
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getWithdrawPnl()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    .line 36
    :cond_3
    sget v1, Lcom/kubi/kumex/R$id;->profitWithdrawnTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 37
    sget v1, Lcom/kubi/kumex/R$id;->profitWithdrawnValueTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/kubi/resources/widget/BaseTextView;

    .line 38
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v11}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 39
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getWithdrawPnl()Ljava/math/BigDecimal;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lcom/kubi/kumex/record/g0;->l(Lcom/kubi/kumex/record/g0;Ljava/math/BigDecimal;IIILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 40
    :cond_4
    :goto_3
    sget v1, Lcom/kubi/kumex/R$id;->profitWithdrawnTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 41
    sget v1, Lcom/kubi/kumex/R$id;->profitWithdrawnValueTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 42
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getTax()Ljava/math/BigDecimal;

    move-result-object v1

    const-string v11, "multiply(...)"

    const-string v12, "negate(...)"

    const-string v13, "ONE"

    if-eqz v1, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getTax()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v1

    if-gtz v1, :cond_5

    goto :goto_5

    .line 43
    :cond_5
    sget v1, Lcom/kubi/kumex/R$id;->taxTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/kubi/resources/widget/DashTextView;

    .line 44
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v14}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 45
    invoke-virtual {v14, v7}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 46
    new-instance v1, Lcom/kubi/kumex/record/h0;

    invoke-direct {v1, v0}, Lcom/kubi/kumex/record/h0;-><init>(Landroid/view/View;)V

    const/16 v18, 0x1

    const/16 v19, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v17, v1

    invoke-static/range {v14 .. v19}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 47
    sget v1, Lcom/kubi/kumex/R$id;->taxValueTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/kubi/resources/widget/BaseTextView;

    .line 48
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v14}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 49
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getTax()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v2, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    move-result-object v2

    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v2

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lcom/kubi/kumex/record/g0;->l(Lcom/kubi/kumex/record/g0;Ljava/math/BigDecimal;IIILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v14, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 50
    :cond_6
    :goto_5
    sget v1, Lcom/kubi/kumex/R$id;->taxTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 51
    sget v1, Lcom/kubi/kumex/R$id;->taxValueTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 52
    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getCloseType()Ljava/lang/String;

    move-result-object v1

    const-string v14, "CLOSE"

    invoke-static {v1, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getLiquidAmount()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1, v10, v7, v10}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object v1

    .line 53
    invoke-static {v1}, Lkf/a;->D(Ljava/math/BigDecimal;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_7

    .line 54
    :cond_7
    sget v1, Lcom/kubi/kumex/R$id;->liquidationTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lcom/kubi/resources/widget/DashTextView;

    .line 55
    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v15}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 56
    invoke-virtual {v15, v7}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 57
    new-instance v1, Lcom/kubi/kumex/record/i0;

    invoke-direct {v1, v0}, Lcom/kubi/kumex/record/i0;-><init>(Landroid/view/View;)V

    const/16 v19, 0x1

    const/16 v20, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v18, v1

    invoke-static/range {v15 .. v20}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 58
    sget v1, Lcom/kubi/kumex/R$id;->liquidationValueTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Lcom/kubi/resources/widget/BaseTextView;

    .line 59
    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v15}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 60
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getLiquidAmount()Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v2, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    move-result-object v2

    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v2

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lcom/kubi/kumex/record/g0;->l(Lcom/kubi/kumex/record/g0;Ljava/math/BigDecimal;IIILjava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_8

    .line 61
    :cond_8
    :goto_7
    sget v1, Lcom/kubi/kumex/R$id;->liquidationTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 62
    sget v1, Lcom/kubi/kumex/R$id;->liquidationValueTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 63
    :goto_8
    sget v1, Lcom/kubi/kumex/R$id;->realizedPnlValueTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/kubi/resources/widget/BaseTextView;

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/g0;->o()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/g0;->n()Lcom/kubi/utils/v0;

    move-result-object v1

    if-nez v1, :cond_9

    .line 65
    sget v1, Lcom/kubi/kumex/R$id;->realizedPnlRateTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    .line 66
    sget v1, Lcom/kubi/kumex/R$id;->realizedPnlRateValueTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    goto :goto_9

    .line 67
    :cond_9
    sget v1, Lcom/kubi/kumex/R$id;->realizedPnlRateTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 68
    sget v1, Lcom/kubi/kumex/R$id;->realizedPnlRateValueTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/kubi/resources/widget/BaseTextView;

    .line 69
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 70
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/g0;->n()Lcom/kubi/utils/v0;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    :goto_9
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getCloseType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_13

    .line 72
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getCloseType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto/16 :goto_e

    .line 73
    :cond_a
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getMarginMode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "sell"

    const-string v3, "buy"

    if-eqz v1, :cond_f

    .line 74
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getLeverage()Ljava/math/BigDecimal;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->d()Lcom/kubi/utils/v0;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getLiquidPrice()Ljava/math/BigDecimal;

    move-result-object v1

    if-nez v1, :cond_b

    goto/16 :goto_b

    .line 75
    :cond_b
    sget v1, Lcom/kubi/kumex/R$id;->liquidationDetailsCl:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 76
    sget v1, Lcom/kubi/kumex/R$id;->liquidationDescTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/kubi/resources/widget/BaseTextView;

    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 78
    sget v5, Lcom/kubi/kumex/R$string;->kumex_cross_pnl_liq_des_detail:I

    .line 79
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/g0;->m()Lcom/kubi/utils/v0;

    move-result-object v6

    .line 80
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v8

    invoke-virtual {v8}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getLiquidPrice()Ljava/math/BigDecimal;

    move-result-object v11

    if-eqz v11, :cond_d

    .line 81
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->c()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    move-result-object v12

    .line 82
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v8

    invoke-virtual {v8}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->isBuy()Z

    move-result v8

    if-eqz v8, :cond_c

    move-object v13, v3

    goto :goto_a

    :cond_c
    move-object v13, v2

    :goto_a
    const/16 v16, 0xc

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 83
    invoke-static/range {v11 .. v17}, Lcom/kubi/kumex/utils/k0;->n(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 84
    :cond_d
    invoke-static {v10}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 85
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/g0;->m()Lcom/kubi/utils/v0;

    move-result-object v3

    .line 86
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->d()Lcom/kubi/utils/v0;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 87
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v9

    invoke-virtual {v9}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getLeverage()Ljava/math/BigDecimal;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 88
    sget-object v11, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    const/16 v18, 0x70

    const/16 v19, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 89
    invoke-static/range {v10 .. v19}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v6, v2, v3, v8, v9}, [Ljava/lang/Object;

    move-result-object v2

    .line 90
    invoke-virtual {v4, v5, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/kubi/kumex/R$color;->c_text:I

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    .line 92
    sget-object v3, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 93
    new-instance v4, Lkotlin/Pair;

    sget-object v5, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    new-instance v6, Landroid/text/style/StyleSpan;

    invoke-direct {v6, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-direct {v4, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    new-instance v6, Lkotlin/Pair;

    .line 95
    new-instance v8, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v8, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 96
    invoke-direct {v6, v5, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    new-instance v5, Lkotlin/Pair;

    sget-object v8, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN1:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    new-instance v9, Landroid/text/style/StyleSpan;

    invoke-direct {v9, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-direct {v5, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    new-instance v7, Lkotlin/Pair;

    .line 99
    new-instance v9, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v9, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 100
    invoke-direct {v7, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v6, v5, v7}, [Lkotlin/Pair;

    move-result-object v2

    .line 101
    invoke-virtual {v3, v1, v2}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 102
    sget v1, Lcom/kubi/kumex/R$id;->viewMoreTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/kubi/resources/widget/BaseTextView;

    .line 103
    new-instance v1, Lcom/kubi/utils/v0;

    invoke-direct {v1}, Lcom/kubi/utils/v0;-><init>()V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Lcom/kubi/kumex/R$string;->view_more:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kubi/utils/v0;->h(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    move-result-object v0

    .line 104
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v5, Lcom/kubi/kumex/record/j0;

    invoke-direct {v5}, Lcom/kubi/kumex/record/j0;-><init>()V

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    .line 106
    :cond_e
    :goto_b
    sget v1, Lcom/kubi/kumex/R$id;->liquidationDetailsCl:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    return-void

    .line 107
    :cond_f
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->d()Lcom/kubi/utils/v0;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getLiquidPrice()Ljava/math/BigDecimal;

    move-result-object v1

    if-nez v1, :cond_10

    goto/16 :goto_d

    .line 108
    :cond_10
    sget v1, Lcom/kubi/kumex/R$id;->liquidationDetailsCl:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 109
    sget v1, Lcom/kubi/kumex/R$id;->liquidationDescTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/kubi/resources/widget/BaseTextView;

    .line 110
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 111
    sget v5, Lcom/kubi/kumex/R$string;->kumex_isolated_pnl_liq_des_detail:I

    .line 112
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/g0;->m()Lcom/kubi/utils/v0;

    move-result-object v6

    .line 113
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v8

    invoke-virtual {v8}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->getLiquidPrice()Ljava/math/BigDecimal;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 114
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->c()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    move-result-object v10

    .line 115
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->i()Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;

    move-result-object v8

    invoke-virtual {v8}, Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;->isBuy()Z

    move-result v8

    if-eqz v8, :cond_11

    move-object v11, v3

    goto :goto_c

    :cond_11
    move-object v11, v2

    :goto_c
    const/16 v14, 0xc

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 116
    invoke-static/range {v9 .. v15}, Lcom/kubi/kumex/utils/k0;->n(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/platform/model/ContractEntity;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 117
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/g0;->m()Lcom/kubi/utils/v0;

    move-result-object v3

    .line 118
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/record/a;->d()Lcom/kubi/utils/v0;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    filled-new-array {v6, v2, v3, v8}, [Ljava/lang/Object;

    move-result-object v2

    .line 119
    invoke-virtual {v4, v5, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    sget-object v2, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 121
    new-instance v3, Lkotlin/Pair;

    sget-object v4, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    new-instance v5, Landroid/text/style/StyleSpan;

    invoke-direct {v5, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-direct {v3, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    new-instance v5, Lkotlin/Pair;

    .line 123
    new-instance v6, Landroid/text/style/ForegroundColorSpan;

    .line 124
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    .line 125
    sget v8, Lcom/kubi/kumex/R$color;->c_text:I

    .line 126
    invoke-static {v7, v8}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v7

    .line 127
    invoke-direct {v6, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 128
    invoke-direct {v5, v4, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v5}, [Lkotlin/Pair;

    move-result-object v3

    .line 129
    invoke-virtual {v2, v1, v3}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 130
    sget v1, Lcom/kubi/kumex/R$id;->viewMoreTv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/kubi/resources/widget/BaseTextView;

    .line 131
    new-instance v1, Lcom/kubi/utils/v0;

    invoke-direct {v1}, Lcom/kubi/utils/v0;-><init>()V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v3, Lcom/kubi/kumex/R$string;->view_more:I

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kubi/utils/v0;->h(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    move-result-object v0

    .line 132
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v5, Lcom/kubi/kumex/record/k0;

    invoke-direct {v5}, Lcom/kubi/kumex/record/k0;-><init>()V

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    .line 134
    :cond_12
    :goto_d
    sget v1, Lcom/kubi/kumex/R$id;->liquidationDetailsCl:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    return-void

    .line 135
    :cond_13
    :goto_e
    sget v1, Lcom/kubi/kumex/R$id;->liquidationDetailsCl:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->o(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic bindView(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kubi/kumex/record/g0;

    invoke-virtual {p0, p1}, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->bindView(Lcom/kubi/kumex/record/g0;)V

    return-void
.end method

.method public createView()Landroid/view/View;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->getParent()Landroid/view/ViewGroup;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/kumex/R$layout;->bkumex_item_profit_detail_brief:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->getParent()Landroid/view/ViewGroup;

    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v1, "inflate(...)"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    return-object v0
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

.method public getLongCall()Lcom/kubi/sdk/s2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/sdk/s2<",
            "Lcom/kubi/kumex/record/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->longCall:Lcom/kubi/sdk/s2;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public getParent()Landroid/view/ViewGroup;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->parent:Landroid/view/ViewGroup;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public getShortCall()Lcom/kubi/sdk/s2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/sdk/s2<",
            "Lcom/kubi/kumex/record/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kumex/record/ProfitBrieflyObjectProxy;->shortCall:Lcom/kubi/sdk/s2;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method
