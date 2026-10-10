.class public final Lcom/kubi/payment/interceptor/route/PaymentMethodInterceptor;
.super Lil/c;
.source "PaymentMethodInterceptor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/interceptor/route/PaymentMethodInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kubi/payment/interceptor/route/PaymentMethodInterceptor;",
        "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;",
        "<init>",
        "()V",
        "intercept",
        "",
        "chain",
        "Lcom/kubi/router/interceptor/IChain;",
        "Companion",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentMethodInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodInterceptor.kt\ncom/kubi/payment/interceptor/route/PaymentMethodInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,50:1\n543#2,6:51\n44#3,2:57\n*S KotlinDebug\n*F\n+ 1 PaymentMethodInterceptor.kt\ncom/kubi/payment/interceptor/route/PaymentMethodInterceptor\n*L\n35#1:51,6\n40#1:57,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/payment/interceptor/route/PaymentMethodInterceptor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/interceptor/route/PaymentMethodInterceptor$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/payment/interceptor/route/PaymentMethodInterceptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/payment/interceptor/route/PaymentMethodInterceptor;->a:Lcom/kubi/payment/interceptor/route/PaymentMethodInterceptor$Companion;

    .line 9
    return-void
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
    invoke-direct {p0}, Lil/c;-><init>()V

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


# virtual methods
.method public b(Lzx/a;)Z
    .locals 11
    .param p1    # Lzx/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "chain"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-super {p0, p1}, Lil/c;->b(Lzx/a;)Z

    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/a;->h()Landroid/app/Activity;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    instance-of v0, p1, Landroidx/fragment/app/FragmentActivity;

    .line 29
    const/4 v1, 0x1

    .line 30
    .line 31
    const-string v2, "PaymentMethodInterceptor"

    .line 32
    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    check-cast p1, Landroidx/fragment/app/FragmentActivity;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    const-string v0, "getFragments(...)"

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 52
    move-result v0

    .line 53
    .line 54
    .line 55
    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 60
    move-result v0

    .line 61
    const/4 v3, 0x0

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 67
    move-result-object v0

    .line 68
    move-object v4, v0

    .line 69
    .line 70
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->isVisible()Z

    .line 74
    move-result v4

    .line 75
    .line 76
    if-eqz v4, :cond_1

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move-object v0, v3

    .line 79
    .line 80
    :goto_0
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    sget-object p1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 88
    move-result p1

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lht/y;->T(Landroidx/fragment/app/Fragment;)V

    .line 94
    goto :goto_1

    .line 95
    .line 96
    :cond_3
    new-instance v5, Ljava/lang/Exception;

    .line 97
    .line 98
    const-string p1, "P2P payment method list is not available"

    .line 99
    .line 100
    .line 101
    invoke-direct {v5, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    new-instance v4, Lcom/kubi/otc/exception/OtcException;

    .line 104
    .line 105
    const/16 v9, 0x8

    .line 106
    const/4 v10, 0x0

    .line 107
    .line 108
    const-string v6, "PaymentMethodInterceptor"

    .line 109
    const/4 v7, 0x0

    .line 110
    const/4 v8, 0x0

    .line 111
    .line 112
    .line 113
    invoke-direct/range {v4 .. v10}, Lcom/kubi/otc/exception/OtcException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 114
    const/4 p1, 0x2

    .line 115
    .line 116
    .line 117
    invoke-static {v4, v3, p1, v3}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 118
    .line 119
    :goto_1
    const-string p1, "jump to payment method page via toPayMethodPage"

    .line 120
    .line 121
    .line 122
    invoke-static {v2, p1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    return v1

    .line 124
    .line 125
    :cond_4
    const-string p1, "no visible fragment found, cannot open payment method page"

    .line 126
    .line 127
    .line 128
    invoke-static {v2, p1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    return v1
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
.end method
