.class public final Lcu/l;
.super Lil/c;
.source "P2PRouteInterceptor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/payment/interceptor/route/P2PRouteInterceptor;",
        "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;",
        "<init>",
        "()V",
        "intercept",
        "",
        "chain",
        "Lcom/kubi/router/interceptor/IChain;",
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
        "SMAP\nP2PRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PRouteInterceptor.kt\ncom/kubi/payment/interceptor/route/P2PRouteInterceptor\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,58:1\n35#2,4:59\n39#2:65\n44#3,2:63\n29#4:66\n*S KotlinDebug\n*F\n+ 1 P2PRouteInterceptor.kt\ncom/kubi/payment/interceptor/route/P2PRouteInterceptor\n*L\n38#1:59,4\n38#1:65\n38#1:63,2\n50#1:66\n*E\n"
    }
.end annotation


# direct methods
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
.end method


# virtual methods
.method public b(Lzx/a;)Z
    .locals 9
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
    sget-object v0, Lcom/kubi/otc/service/a;->a:Lcom/kubi/otc/service/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/otc/service/a;->o()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-super {p0, p1}, Lil/c;->b(Lzx/a;)Z

    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    .line 20
    :cond_0
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    sget-object p1, Lcom/kubi/payment/p2p/P2PFallbackFragment;->V:Lcom/kubi/payment/p2p/P2PFallbackFragment$Companion;

    .line 30
    .line 31
    sget-object v0, Lcom/kubi/utils/l;->a:Lcom/kubi/utils/l;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/kubi/utils/l;->a()Landroid/content/Context;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lcom/kubi/payment/p2p/P2PFallbackFragment$Companion;->launch(Landroid/content/Context;)V

    .line 39
    return v1

    .line 40
    .line 41
    :cond_1
    const-string v0, "payment_android_p2p_rn"

    .line 42
    .line 43
    :try_start_0
    sget-object v2, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 44
    .line 45
    new-instance v2, Lcu/l$a;

    .line 46
    .line 47
    .line 48
    invoke-direct {v2}, Lcu/l$a;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    const-string v3, "object : TypeToken<T>() {}.type"

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v2}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 61
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    move-object v3, v0

    .line 65
    .line 66
    new-instance v2, Lcom/kubi/config/exception/KCConfigException;

    .line 67
    .line 68
    const/16 v7, 0x8

    .line 69
    const/4 v8, 0x0

    .line 70
    .line 71
    const-string v4, "RemoteConfig"

    .line 72
    const/4 v5, 0x0

    .line 73
    const/4 v6, 0x0

    .line 74
    .line 75
    .line 76
    invoke-direct/range {v2 .. v8}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    const/4 v0, 0x2

    .line 78
    const/4 v3, 0x0

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v3, v0, v3}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 82
    move-object v0, v3

    .line 83
    .line 84
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 85
    const/4 v2, 0x0

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v2}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 89
    move-result v0

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    .line 94
    invoke-interface {p1}, Lzx/a;->b()Lay/a;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    const-string v0, "P2PHomePage"

    .line 98
    .line 99
    .line 100
    invoke-static {p1, v0}, Llt/j;->a(Lay/a;Ljava/lang/String;)V

    .line 101
    return v1

    .line 102
    .line 103
    :cond_2
    sget-object v0, Lcom/kubi/payment/helper/e;->a:Lcom/kubi/payment/helper/e;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/kubi/payment/helper/e;->a()Z

    .line 107
    move-result v0

    .line 108
    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    .line 112
    invoke-interface {p1}, Lzx/a;->b()Lay/a;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    .line 116
    invoke-interface {p1, v0}, Lzx/a;->a(Lay/a;)Z

    .line 117
    move-result p1

    .line 118
    return p1

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-interface {p1}, Lzx/a;->b()Lay/a;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lay/a;->j()Landroid/net/Uri;

    .line 131
    move-result-object v2

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 135
    move-result-object v2

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v2, "://otc"

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    .line 150
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Lay/a;->d()Landroid/os/Bundle;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    const-string v2, "type"

    .line 158
    .line 159
    const-string v3, "0"

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    new-instance v2, Lay/a;

    .line 165
    .line 166
    .line 167
    invoke-direct {v2, v0, p1}, Lay/a;-><init>(Landroid/net/Uri;Landroid/os/Bundle;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Lay/a;->k()Z

    .line 171
    return v1
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
