.class public final Li70/d;
.super Ljava/lang/Object;
.source "RouteUserCenterInterceptor.kt"

# interfaces
.implements Lzx/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/kubi/user/interceptor/ReferralCodeInterceptor;",
        "Lcom/kubi/router/interceptor/IInterceptor;",
        "<init>",
        "()V",
        "TAG",
        "",
        "intercept",
        "",
        "chain",
        "Lcom/kubi/router/interceptor/IChain;",
        "UserCenterLib_googleRelease"
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
        "SMAP\nRouteUserCenterInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteUserCenterInterceptor.kt\ncom/kubi/user/interceptor/ReferralCodeInterceptor\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,283:1\n57#2,8:284\n*S KotlinDebug\n*F\n+ 1 RouteUserCenterInterceptor.kt\ncom/kubi/user/interceptor/ReferralCodeInterceptor\n*L\n71#1:284,8\n*E\n"
    }
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "ReferralCodeInterceptor"

    .line 6
    .line 7
    iput-object v0, p0, Li70/d;->a:Ljava/lang/String;

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
.end method


# virtual methods
.method public b(Lzx/a;)Z
    .locals 10
    .param p1    # Lzx/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "utm_campaign"

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "rCode"

    .line 7
    .line 8
    const-string v2, "chain"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Lzx/a;->b()Lay/a;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    iget-object v3, p0, Li70/d;->a:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    const-string v5, "ReferralCodeInterceptor intercept uri: "

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lay/a;->j()Landroid/net/Uri;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v5, "  queryParameterNames: "

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lay/a;->j()Landroid/net/Uri;

    .line 43
    move-result-object v5

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 47
    move-result-object v5

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    move-result-object v4

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v4}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :try_start_0
    invoke-virtual {v2}, Lay/a;->j()Landroid/net/Uri;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    .line 68
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 69
    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    const-string/jumbo v4, "rcode"

    .line 73
    .line 74
    if-nez v3, :cond_0

    .line 75
    .line 76
    .line 77
    :try_start_1
    invoke-virtual {v2}, Lay/a;->j()Landroid/net/Uri;

    .line 78
    move-result-object v3

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    .line 85
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 86
    move-result v3

    .line 87
    .line 88
    if-eqz v3, :cond_2

    .line 89
    goto :goto_0

    .line 90
    :catch_0
    move-exception v0

    .line 91
    move-object v4, v0

    .line 92
    goto :goto_2

    .line 93
    .line 94
    :cond_0
    :goto_0
    sget-object v3, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Lay/a;->j()Landroid/net/Uri;

    .line 98
    move-result-object v5

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 102
    move-result-object v5

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v5}, Lcom/kubi/host/HostManager;->a(Ljava/lang/String;)Z

    .line 106
    move-result v3

    .line 107
    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    sget-object v3, Lcom/kubi/user/config/LoginInfoConfig;->a:Lcom/kubi/user/config/LoginInfoConfig;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Lay/a;->j()Landroid/net/Uri;

    .line 114
    move-result-object v5

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    move-result-object v5

    .line 119
    .line 120
    .line 121
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 122
    move-result v5

    .line 123
    .line 124
    if-eqz v5, :cond_1

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Lay/a;->j()Landroid/net/Uri;

    .line 128
    move-result-object v4

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    move-result-object v1

    .line 133
    goto :goto_1

    .line 134
    .line 135
    .line 136
    :cond_1
    invoke-virtual {v2}, Lay/a;->j()Landroid/net/Uri;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    .line 144
    :goto_1
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    move-result-object v1

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v1}, Lcom/kubi/user/config/LoginInfoConfig;->n0(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :cond_2
    invoke-virtual {v2}, Lay/a;->j()Landroid/net/Uri;

    .line 152
    move-result-object v1

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 156
    move-result-object v1

    .line 157
    .line 158
    .line 159
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 160
    move-result v1

    .line 161
    .line 162
    if-eqz v1, :cond_5

    .line 163
    .line 164
    sget-object v1, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Lay/a;->j()Landroid/net/Uri;

    .line 168
    move-result-object v3

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 172
    move-result-object v3

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v3}, Lcom/kubi/host/HostManager;->a(Ljava/lang/String;)Z

    .line 176
    move-result v1

    .line 177
    .line 178
    if-eqz v1, :cond_5

    .line 179
    .line 180
    sget-object v1, Lcom/kubi/user/config/LoginInfoConfig;->a:Lcom/kubi/user/config/LoginInfoConfig;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Lay/a;->j()Landroid/net/Uri;

    .line 184
    move-result-object v3

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    move-result-object v0

    .line 189
    .line 190
    if-nez v0, :cond_3

    .line 191
    .line 192
    const-string v0, ""

    .line 193
    .line 194
    .line 195
    :cond_3
    invoke-virtual {v1, v0}, Lcom/kubi/user/config/LoginInfoConfig;->o0(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 196
    goto :goto_3

    .line 197
    .line 198
    .line 199
    :goto_2
    invoke-static {v4}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 200
    move-result v0

    .line 201
    .line 202
    if-nez v0, :cond_5

    .line 203
    .line 204
    .line 205
    invoke-static {v4}, Ld70/a;->a(Ljava/lang/Throwable;)Z

    .line 206
    move-result v0

    .line 207
    .line 208
    const-string v5, "ReferralCodeInterceptor"

    .line 209
    .line 210
    if-eqz v0, :cond_4

    .line 211
    .line 212
    new-instance v3, Lcom/kubi/user/exception/UserCenterException;

    .line 213
    .line 214
    const/16 v8, 0x8

    .line 215
    const/4 v9, 0x0

    .line 216
    const/4 v6, 0x1

    .line 217
    const/4 v7, 0x0

    .line 218
    .line 219
    .line 220
    invoke-direct/range {v3 .. v9}, Lcom/kubi/user/exception/UserCenterException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 221
    const/4 v0, 0x2

    .line 222
    const/4 v1, 0x0

    .line 223
    .line 224
    .line 225
    invoke-static {v3, v1, v0, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 226
    goto :goto_3

    .line 227
    .line 228
    .line 229
    :cond_4
    invoke-static {v4, v5}, Ld70/a;->b(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :cond_5
    :goto_3
    invoke-interface {p1, v2}, Lzx/a;->a(Lay/a;)Z

    .line 233
    move-result p1

    .line 234
    return p1
.end method
