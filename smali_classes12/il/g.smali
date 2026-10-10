.class public final Lil/g;
.super Ljava/lang/Object;
.source "BusinessErrorInterceptor.kt"

# interfaces
.implements Lxk/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/kucoin/interceptor/NetBusinessErrorReceiver;",
        "Lcom/kubi/kucoin/callback/INetBusinessErrorReceiver;",
        "<init>",
        "()V",
        "invoke",
        "",
        "info",
        "Lcom/kubi/kucoin/callback/BizErrorInfo;",
        "LAppNet_googleRelease"
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
        "SMAP\nBusinessErrorInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BusinessErrorInterceptor.kt\ncom/kubi/kucoin/interceptor/NetBusinessErrorReceiver\n+ 2 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,86:1\n71#2,4:87\n*S KotlinDebug\n*F\n+ 1 BusinessErrorInterceptor.kt\ncom/kubi/kucoin/interceptor/NetBusinessErrorReceiver\n*L\n70#1:87,4\n*E\n"
    }
.end annotation


# direct methods
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
.end method


# virtual methods
.method public a(Lxk/a;)V
    .locals 4
    .param p1    # Lxk/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "info"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/monitor/TechnologyEvent;->a:Lcom/kubi/monitor/TechnologyEvent;

    .line 8
    .line 9
    sget-object v0, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b:Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;->acquire()Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    const-string v1, "category"

    .line 16
    .line 17
    const-string v2, "request_invalid_not_login"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lxk/a;->b()Lokhttp3/Request;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    const-string v2, "host"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2, v1}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lxk/a;->b()Lokhttp3/Request;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    const-string v2, "path"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2, v1}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lxk/a;->a()Lorg/json/JSONObject;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    const/16 v2, -0x3e7

    .line 61
    .line 62
    const-string v3, "code"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 66
    move-result v1

    .line 67
    .line 68
    const/16 v2, 0x191

    .line 69
    .line 70
    if-ne v1, v2, :cond_0

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lxk/a;->b()Lokhttp3/Request;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    const-string v1, "X-APP-TOKEN"

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v1}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 84
    move-result p1

    .line 85
    .line 86
    if-eqz p1, :cond_0

    .line 87
    const/4 p1, 0x1

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    const/4 p1, 0x0

    .line 90
    .line 91
    .line 92
    :goto_0
    invoke-virtual {v0, v3, p1}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->e(Ljava/lang/String;Z)V

    .line 93
    .line 94
    sget-object p1, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 98
    move-result p1

    .line 99
    .line 100
    const-string v1, "error_message"

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1, p1}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->e(Ljava/lang/String;Z)V

    .line 104
    .line 105
    const-string p1, "technology_event"

    .line 106
    .line 107
    .line 108
    invoke-static {p1, v0}, Lcom/kubi/monitor/TechnologyEvent;->d(Ljava/lang/String;Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)V

    .line 109
    return-void
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lxk/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lil/g;->a(Lxk/a;)V

    .line 6
    .line 7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p1
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
.end method
