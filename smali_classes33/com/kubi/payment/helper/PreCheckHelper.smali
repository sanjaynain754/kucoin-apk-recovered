.class public final Lcom/kubi/payment/helper/PreCheckHelper;
.super Ljava/lang/Object;
.source "PreCheckHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0002\u0010\u000cJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0005J\u0008\u0010\u001d\u001a\u00020\u0005H\u0002\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/kubi/payment/helper/PreCheckHelper;",
        "",
        "<init>",
        "()V",
        "loadKycInfo",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadVersionCheck",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "request",
        "Lcom/kubi/payment/data/entities/VersionCheck$Request;",
        "(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "showGuide",
        "",
        "type",
        "",
        "content",
        "preCheckEmail",
        "isBindEmail",
        "isBindPhone",
        "isBindTradingPassword",
        "isHighKyc",
        "hasOpenDoubleCheck",
        "preCheckKycExpired",
        "coroutineScope",
        "Landroidx/lifecycle/LifecycleCoroutineScope;",
        "showKycExpiredAlertDialog",
        "forceShow",
        "cacheAlertValue",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/kubi/payment/helper/PreCheckHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/helper/PreCheckHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/payment/helper/PreCheckHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/payment/helper/PreCheckHelper;->a:Lcom/kubi/payment/helper/PreCheckHelper;

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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static synthetic a(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/helper/PreCheckHelper;->r(Landroid/content/DialogInterface;I)V

    .line 4
    return-void
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
.end method

.method public static synthetic b(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/payment/helper/PreCheckHelper;->o(Landroid/content/DialogInterface;I)V

    .line 4
    return-void
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
.end method

.method public static final synthetic c(Lcom/kubi/payment/helper/PreCheckHelper;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/helper/PreCheckHelper;->d()Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final o(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    sget-object p0, Lcom/kubi/otc/service/a;->a:Lcom/kubi/otc/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/otc/service/a;->n()V

    .line 6
    return-void
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
.end method

.method public static synthetic q(Lcom/kubi/payment/helper/PreCheckHelper;Landroidx/fragment/app/FragmentManager;ZILjava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/payment/helper/PreCheckHelper;->p(Landroidx/fragment/app/FragmentManager;Z)Z

    .line 9
    move-result p0

    .line 10
    return p0
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
.end method

.method public static final r(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method


# virtual methods
.method public final d()Z
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/payment/util/i;->a:Lcom/kubi/payment/util/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/payment/util/i;->n()Ly70/g;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ly70/a;->d(Ly70/g;Z)Z

    .line 11
    move-result v0

    .line 12
    return v0
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
.end method

.method public final e()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/service/a;->a:Lcom/kubi/otc/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/otc/service/a;->j()Lcom/kubi/user/model/LoginUserEntity;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/user/model/LoginUserEntity;->hasOpenDoubleCheck()Z

    .line 10
    move-result v0

    .line 11
    return v0
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
.end method

.method public final f()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/service/a;->a:Lcom/kubi/otc/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/otc/service/a;->m()Lcom/kubi/user/api/IUserService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/user/api/IUserService;->M()Z

    .line 10
    move-result v0

    .line 11
    return v0
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
.end method

.method public final g()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/service/a;->a:Lcom/kubi/otc/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/otc/service/a;->m()Lcom/kubi/user/api/IUserService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/user/api/IUserService;->R()Z

    .line 10
    move-result v0

    .line 11
    return v0
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
.end method

.method public final h()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/service/a;->a:Lcom/kubi/otc/service/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/otc/service/a;->j()Lcom/kubi/user/model/LoginUserEntity;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/user/model/LoginUserEntity;->isWithDrawPassword()Z

    .line 10
    move-result v0

    .line 11
    return v0
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
.end method

.method public final i()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/v;->a:Lcom/kubi/otc/v;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/otc/v;->u()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final j(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;->label:I

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
    iput v1, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;-><init>(Lcom/kubi/payment/helper/PreCheckHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;->label:I

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
    iget-object v1, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Lcom/kubi/payment/data/entities/UserInfo$Request;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lcom/kubi/payment/data/source/a;

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p1

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    sget-object p1, Lcom/kubi/payment/a;->a:Lcom/kubi/payment/a;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/kubi/payment/a;->f()Lcom/kubi/payment/data/source/a;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    new-instance v4, Lcom/kubi/payment/data/entities/UserInfo$Request;

    .line 69
    .line 70
    const/16 v9, 0xf

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v5, 0x0

    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x0

    .line 76
    .line 77
    .line 78
    invoke-direct/range {v4 .. v10}, Lcom/kubi/payment/data/entities/UserInfo$Request;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    iput-object v2, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    iput-object v2, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;->L$1:Ljava/lang/Object;

    .line 91
    .line 92
    iput v3, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;->I$0:I

    .line 93
    .line 94
    iput v3, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadKycInfo$1;->label:I

    .line 95
    .line 96
    .line 97
    invoke-interface {p1, v4, v0}, Lcom/kubi/payment/data/source/a;->E(Lcom/kubi/payment/data/entities/UserInfo$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    if-ne p1, v1, :cond_3

    .line 101
    return-object v1

    .line 102
    .line 103
    :cond_3
    :goto_1
    check-cast p1, Lnt/k;

    .line 104
    .line 105
    instance-of v0, p1, Lnt/k$b;

    .line 106
    const/4 v1, 0x0

    .line 107
    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    check-cast p1, Lnt/k$b;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Lnt/k$b;->a()Ljava/lang/Object;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    check-cast p1, Lcom/kubi/payment/data/entities/UserInfo$Response;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/kubi/payment/data/entities/UserInfo$Response;->getKycInfo()Lcom/kubi/payment/data/entities/UserInfo$KycInfoResponse;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    if-eqz p1, :cond_4

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Lcom/kubi/payment/data/entities/UserInfo$KycInfoResponse;->isVerified()Ljava/lang/Boolean;

    .line 126
    move-result-object v1

    .line 127
    .line 128
    .line 129
    :cond_4
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 130
    move-result p1

    .line 131
    goto :goto_2

    .line 132
    .line 133
    :cond_5
    instance-of v0, p1, Lnt/k$a;

    .line 134
    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    check-cast p1, Lnt/k$a;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Lnt/k$a;->a()Ljava/lang/Exception;

    .line 141
    move-result-object p1

    .line 142
    const/4 v0, 0x2

    .line 143
    .line 144
    .line 145
    invoke-static {p1, v1, v0, v1}, Lcom/kubi/network/retrofit/utils/c;->c(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 146
    const/4 p1, 0x0

    .line 147
    .line 148
    .line 149
    :goto_2
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 150
    move-result-object p1

    .line 151
    return-object p1

    .line 152
    .line 153
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 154
    .line 155
    .line 156
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 157
    throw p1
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
.end method

.method public final k(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/data/entities/VersionCheck$Request;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/FragmentManager;",
            "Lcom/kubi/payment/data/entities/VersionCheck$Request;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->label:I

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
    iput v1, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;-><init>(Lcom/kubi/payment/helper/PreCheckHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->label:I

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
    iget-object p1, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/kubi/payment/data/source/a;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/kubi/payment/data/entities/VersionCheck$Request;

    .line 46
    .line 47
    iget-object p1, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Landroidx/fragment/app/FragmentManager;

    .line 50
    .line 51
    .line 52
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p1

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    if-nez p2, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    .line 73
    :cond_3
    sget-object p3, Lcom/kubi/payment/a;->a:Lcom/kubi/payment/a;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p3}, Lcom/kubi/payment/a;->f()Lcom/kubi/payment/data/source/a;

    .line 77
    move-result-object p3

    .line 78
    .line 79
    iput-object p1, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->L$0:Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    iput-object v2, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->L$1:Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    move-result-object v2

    .line 90
    .line 91
    iput-object v2, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->L$2:Ljava/lang/Object;

    .line 92
    .line 93
    iput v3, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->I$0:I

    .line 94
    .line 95
    iput v3, v0, Lcom/kubi/payment/helper/PreCheckHelper$loadVersionCheck$1;->label:I

    .line 96
    .line 97
    .line 98
    invoke-interface {p3, p2, v0}, Lcom/kubi/payment/data/source/a;->n(Lcom/kubi/payment/data/entities/VersionCheck$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 99
    move-result-object p3

    .line 100
    .line 101
    if-ne p3, v1, :cond_4

    .line 102
    return-object v1

    .line 103
    .line 104
    :cond_4
    :goto_1
    check-cast p3, Lnt/k;

    .line 105
    .line 106
    instance-of p2, p3, Lnt/k$b;

    .line 107
    const/4 v0, 0x0

    .line 108
    .line 109
    if-eqz p2, :cond_6

    .line 110
    .line 111
    check-cast p3, Lnt/k$b;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3}, Lnt/k$b;->a()Ljava/lang/Object;

    .line 115
    move-result-object p2

    .line 116
    .line 117
    check-cast p2, Lcom/kubi/payment/data/entities/VersionCheck$Response;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/kubi/payment/data/entities/VersionCheck$Response;->getStatus()Ljava/lang/Boolean;

    .line 121
    move-result-object p2

    .line 122
    .line 123
    .line 124
    invoke-static {p2}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 125
    move-result p2

    .line 126
    .line 127
    if-eqz p2, :cond_5

    .line 128
    goto :goto_3

    .line 129
    .line 130
    .line 131
    :cond_5
    invoke-virtual {p3}, Lnt/k$b;->a()Ljava/lang/Object;

    .line 132
    move-result-object p2

    .line 133
    .line 134
    check-cast p2, Lcom/kubi/payment/data/entities/VersionCheck$Response;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2}, Lcom/kubi/payment/data/entities/VersionCheck$Response;->getType()Ljava/lang/String;

    .line 138
    move-result-object p2

    .line 139
    .line 140
    .line 141
    invoke-static {p2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    move-result-object p2

    .line 143
    .line 144
    .line 145
    invoke-virtual {p3}, Lnt/k$b;->a()Ljava/lang/Object;

    .line 146
    move-result-object p3

    .line 147
    .line 148
    check-cast p3, Lcom/kubi/payment/data/entities/VersionCheck$Response;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p3}, Lcom/kubi/payment/data/entities/VersionCheck$Response;->getContent()Ljava/lang/String;

    .line 152
    move-result-object p3

    .line 153
    .line 154
    .line 155
    invoke-static {p3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    move-result-object p3

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/payment/helper/PreCheckHelper;->n(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    :goto_2
    move v3, v0

    .line 161
    goto :goto_3

    .line 162
    .line 163
    :cond_6
    instance-of p1, p3, Lnt/k$a;

    .line 164
    .line 165
    if-eqz p1, :cond_7

    .line 166
    .line 167
    check-cast p3, Lnt/k$a;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p3}, Lnt/k$a;->a()Ljava/lang/Exception;

    .line 171
    move-result-object p1

    .line 172
    const/4 p2, 0x2

    .line 173
    const/4 p3, 0x0

    .line 174
    .line 175
    .line 176
    invoke-static {p1, p3, p2, p3}, Lcom/kubi/network/retrofit/utils/c;->c(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 177
    goto :goto_2

    .line 178
    .line 179
    .line 180
    :goto_3
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 181
    move-result-object p1

    .line 182
    return-object p1

    .line 183
    .line 184
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 185
    .line 186
    .line 187
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 188
    throw p1
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
.end method

.method public final l(Landroidx/fragment/app/FragmentManager;)Z
    .locals 10
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "fragmentManager"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/payment/helper/PreCheckHelper;->f()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/kubi/otc/security/SecuritySettingDialog;->x0:Lcom/kubi/otc/security/SecuritySettingDialog$Companion;

    .line 14
    .line 15
    new-instance v1, Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;

    .line 16
    .line 17
    const/16 v8, 0x3b

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct/range {v1 .. v9}, Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;-><init>(ZZZZZLjava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1, v1}, Lcom/kubi/otc/security/SecuritySettingDialog$Companion;->show(Landroidx/fragment/app/FragmentManager;Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;)V

    .line 31
    const/4 p1, 0x0

    .line 32
    return p1

    .line 33
    :cond_0
    const/4 p1, 0x1

    .line 34
    return p1
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
.end method

.method public final m(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/LifecycleCoroutineScope;)V
    .locals 2
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/LifecycleCoroutineScope;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "fragmentManager"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "coroutineScope"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v0, Lcom/kubi/payment/helper/PreCheckHelper$preCheckKycExpired$1;

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p1, v1}, Lcom/kubi/payment/helper/PreCheckHelper$preCheckKycExpired$1;-><init>(Landroidx/fragment/app/FragmentManager;Lkotlin/coroutines/Continuation;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 20
    return-void
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
.end method

.method public final n(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "1"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object p2, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 15
    move-result-object p2

    .line 16
    .line 17
    sget v0, Lcom/kubi/otc/R$string;->dialog_title_text_tip:I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 21
    move-result-object p2

    .line 22
    .line 23
    .line 24
    invoke-static {p3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object p3

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    sget p3, Lcom/kubi/otc/R$string;->i_already_know:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p3, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 35
    move-result-object p2

    .line 36
    .line 37
    const-string p3, "payment_version_check_guide_web"

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p1, p3}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 41
    return-void

    .line 42
    .line 43
    :cond_0
    const-string v0, "2"

    .line 44
    .line 45
    .line 46
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    move-result p2

    .line 48
    .line 49
    if-eqz p2, :cond_1

    .line 50
    .line 51
    sget-object p2, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 55
    move-result-object p2

    .line 56
    .line 57
    sget v0, Lcom/kubi/otc/R$string;->dialog_title_text_tip:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    .line 64
    invoke-static {p3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    move-result-object p3

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 69
    move-result-object p2

    .line 70
    .line 71
    sget p3, Lcom/kubi/otc/R$string;->dialog_but_appupgrade_upgrade:I

    .line 72
    .line 73
    new-instance v0, Lcom/kubi/payment/helper/c;

    .line 74
    .line 75
    .line 76
    invoke-direct {v0}, Lcom/kubi/payment/helper/c;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, p3, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 80
    move-result-object p2

    .line 81
    .line 82
    sget p3, Lcom/kubi/otc/R$string;->cancel:I

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, p3, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->P4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 86
    move-result-object p2

    .line 87
    .line 88
    const-string p3, "payment_version_check_guide_app"

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p1, p3}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 92
    return-void

    .line 93
    :cond_1
    const/4 p1, 0x0

    .line 94
    .line 95
    new-array p1, p1, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    invoke-static {p3, p1}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void
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
.end method

.method public final p(Landroidx/fragment/app/FragmentManager;Z)Z
    .locals 4
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "fragmentManager"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/payment/helper/PreCheckHelper;->d()Z

    .line 12
    move-result p2

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    return v0

    .line 16
    .line 17
    :cond_0
    sget-object p2, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 21
    move-result-object p2

    .line 22
    .line 23
    sget v1, Lcom/kubi/otc/R$drawable;->ic2_common_warning:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->V4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 27
    move-result-object p2

    .line 28
    const/4 v1, 0x1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->Z4(Z)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->N4(Z)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 36
    move-result-object p2

    .line 37
    .line 38
    sget v2, Lcom/kubi/otc/R$string;->payment_kycexpired_tip_title:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 42
    move-result-object p2

    .line 43
    .line 44
    sget v2, Lcom/kubi/otc/R$string;->payment_kycexpired_tip_content:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->J4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 48
    move-result-object p2

    .line 49
    .line 50
    sget v2, Lcom/kubi/otc/R$string;->payment_i_know:I

    .line 51
    .line 52
    new-instance v3, Lcom/kubi/payment/helper/b;

    .line 53
    .line 54
    .line 55
    invoke-direct {v3}, Lcom/kubi/payment/helper/b;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v2, v3}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 59
    move-result-object p2

    .line 60
    .line 61
    const-string v2, "payment_dialog_kyc_expired"

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p1, v2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 65
    .line 66
    sget-object p1, Lcom/kubi/payment/util/i;->a:Lcom/kubi/payment/util/i;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/kubi/payment/util/i;->n()Ly70/g;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v0}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 74
    return v1
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
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
.end method
