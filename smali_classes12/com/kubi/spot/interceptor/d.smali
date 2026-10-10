.class public final Lcom/kubi/spot/interceptor/d;
.super Lil/c;
.source "SpotRouteLoginInterceptor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/spot/interceptor/SpotRouteLoginInterceptor;",
        "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;",
        "<init>",
        "()V",
        "TYPE_MARGIN_ORDER_CENTER",
        "",
        "intercept",
        "",
        "chain",
        "Lcom/kubi/router/interceptor/IChain;",
        "SpotLib_googleRelease"
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
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lil/c;-><init>()V

    .line 4
    .line 5
    const-string v0, "1"

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/spot/interceptor/d;->a:Ljava/lang/String;

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
.end method

.method public static synthetic c(Lay/a;Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/spot/interceptor/d;->d(Lay/a;Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;

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
.end method

.method public static final d(Lay/a;Landroidx/fragment/app/FragmentActivity;)Lkotlin/Unit;
    .locals 9

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/utaspot/api/IUtaSpotService;->a:Lcom/kubi/utaspot/api/IUtaSpotService$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/utaspot/api/IUtaSpotService$Companion;->get()Lcom/kubi/utaspot/api/IUtaSpotService;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    sget-object v5, Lcom/kubi/utaspot/api/UtaTradeType;->SPOT:Lcom/kubi/utaspot/api/UtaTradeType;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lay/a;->d()Landroid/os/Bundle;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-string v2, "symbol"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lay/a;->d()Landroid/os/Bundle;

    .line 27
    move-result-object p0

    .line 28
    .line 29
    const-string v0, "index"

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 39
    move-result-object p0

    .line 40
    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 45
    move-result p0

    .line 46
    :goto_0
    move v6, p0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    const/4 p0, 0x2

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    const/4 v7, 0x4

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    move-object v2, p1

    .line 54
    .line 55
    .line 56
    invoke-static/range {v1 .. v8}, Lcom/kubi/utaspot/api/IUtaSpotService;->f(Lcom/kubi/utaspot/api/IUtaSpotService;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/utaspot/api/UtaTradeType;IILjava/lang/Object;)V

    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    return-object p0
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
.end method


# virtual methods
.method public b(Lzx/a;)Z
    .locals 17
    .param p1    # Lzx/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "chain"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Lzx/a;->b()Lay/a;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lay/a;->d()Landroid/os/Bundle;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    const-string v3, "type"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lay/a;->j()Landroid/net/Uri;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    .line 28
    invoke-static {v3}, Lcom/kubi/router/utils/RouteExKt;->G(Landroid/net/Uri;)Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    const-string v4, "trade/delegate/record"

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    move-result v3

    .line 36
    const/4 v5, 0x1

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    move-object/from16 v3, p0

    .line 41
    .line 42
    iget-object v6, v3, Lcom/kubi/spot/interceptor/d;->a:Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    move-result v2

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lay/a;->d()Landroid/os/Bundle;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    const-string v2, "symbol"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    move-result-object v9

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lay/a;->d()Landroid/os/Bundle;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    const-string v1, "index"

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    if-eqz v0, :cond_0

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    .line 74
    move-result-object v0

    .line 75
    :goto_0
    move-object v8, v0

    .line 76
    goto :goto_1

    .line 77
    :cond_0
    const/4 v0, 0x0

    .line 78
    goto :goto_0

    .line 79
    .line 80
    :goto_1
    sget-object v6, Lf00/a;->a:Lf00/a;

    .line 81
    .line 82
    const/16 v15, 0xf8

    .line 83
    .line 84
    const/16 v16, 0x0

    .line 85
    .line 86
    const-string v7, "cross"

    .line 87
    const/4 v10, 0x0

    .line 88
    const/4 v11, 0x0

    .line 89
    const/4 v12, 0x0

    .line 90
    const/4 v13, 0x0

    .line 91
    const/4 v14, 0x0

    .line 92
    .line 93
    .line 94
    invoke-static/range {v6 .. v16}, Lg00/h$a;->d(Lg00/h;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 95
    return v5

    .line 96
    .line 97
    :cond_1
    move-object/from16 v3, p0

    .line 98
    .line 99
    .line 100
    :cond_2
    invoke-virtual {v0}, Lay/a;->j()Landroid/net/Uri;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    .line 104
    invoke-static {v2}, Lcom/kubi/router/utils/RouteExKt;->G(Landroid/net/Uri;)Ljava/lang/String;

    .line 105
    move-result-object v2

    .line 106
    .line 107
    .line 108
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    move-result v2

    .line 110
    .line 111
    if-eqz v2, :cond_3

    .line 112
    .line 113
    sget-object v2, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 117
    move-result v2

    .line 118
    .line 119
    if-eqz v2, :cond_3

    .line 120
    .line 121
    sget-object v2, Lcom/kubi/unify/api/IUnifyAccountService;->a:Lcom/kubi/unify/api/IUnifyAccountService$Companion;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Lcom/kubi/unify/api/IUnifyAccountService$Companion;->get()Lcom/kubi/unify/api/IUnifyAccountService;

    .line 125
    move-result-object v2

    .line 126
    .line 127
    .line 128
    invoke-interface {v2}, Lcom/kubi/unify/api/IUnifyAccountService;->C()Z

    .line 129
    move-result v2

    .line 130
    .line 131
    if-eqz v2, :cond_3

    .line 132
    .line 133
    new-instance v1, Lcom/kubi/spot/interceptor/c;

    .line 134
    .line 135
    .line 136
    invoke-direct {v1, v0}, Lcom/kubi/spot/interceptor/c;-><init>(Lay/a;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v1}, Lny/b;->c(Lkotlin/jvm/functions/Function1;)V

    .line 140
    return v5

    .line 141
    .line 142
    .line 143
    :cond_3
    invoke-super/range {p0 .. p1}, Lil/c;->b(Lzx/a;)Z

    .line 144
    move-result v0

    .line 145
    return v0
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
.end method
