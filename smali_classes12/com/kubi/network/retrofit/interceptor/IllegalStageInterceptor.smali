.class public final Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor;
.super Ljava/lang/Object;
.source "IllegalStageInterceptor.kt"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor;",
        "Lokhttp3/Interceptor;",
        "",
        "debug",
        "<init>",
        "(Z)V",
        "Lokhttp3/Interceptor$Chain;",
        "chain",
        "Lokhttp3/Response;",
        "intercept",
        "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;",
        "a",
        "Z",
        "b",
        "Companion",
        "network-core-retrofit_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIllegalStageInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IllegalStageInterceptor.kt\ncom/kubi/network/retrofit/interceptor/IllegalStageInterceptor\n+ 2 NetCoreRetrofitIssue.kt\ncom/kubi/network/retrofit/exception/NetCoreRetrofitIssueKt\n*L\n1#1,45:1\n64#2,34:46\n*S KotlinDebug\n*F\n+ 1 IllegalStageInterceptor.kt\ncom/kubi/network/retrofit/interceptor/IllegalStageInterceptor\n*L\n28#1:46,34\n*E\n"
    }
.end annotation


# static fields
.field public static final b:Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static volatile c:Z


# instance fields
.field public final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor;->b:Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor$Companion;

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
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor;->a:Z

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
.end method

.method public static final synthetic a()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor;->c:Z

    .line 3
    return v0
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
.end method

.method public static final synthetic b(Z)V
    .locals 0

    .line 1
    .line 2
    sput-boolean p0, Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor;->c:Z

    .line 3
    return-void
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
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 8
    .param p1    # Lokhttp3/Interceptor$Chain;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "chain"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "Ignore-Stage"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->removeHeader(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    .line 40
    :cond_0
    sget-boolean v1, Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor;->c:Z

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    .line 49
    :cond_1
    iget-boolean v1, p0, Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor;->a:Z

    .line 50
    .line 51
    const/16 v2, 0x5d

    .line 52
    .line 53
    const-string v3, "\u7981\u6b62\u95ea\u5c4f\u524d\u53d1\u8d77\u7f51\u7edc\u8bf7\u6c42[url="

    .line 54
    .line 55
    if-nez v1, :cond_a

    .line 56
    .line 57
    new-instance v1, Lcom/kubi/network/retrofit/interceptor/IllegalStageException;

    .line 58
    .line 59
    new-instance v4, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    .line 82
    invoke-direct {v1, v2}, Lcom/kubi/network/retrofit/interceptor/IllegalStageException;-><init>(Ljava/lang/String;)V

    .line 83
    const/4 v2, 0x0

    .line 84
    const/4 v3, 0x1

    .line 85
    const/4 v4, 0x0

    .line 86
    const/4 v5, 0x2

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    move-result-object v6

    .line 91
    .line 92
    if-eqz v6, :cond_8

    .line 93
    .line 94
    const-string v7, "Required SETTINGS preface not received"

    .line 95
    .line 96
    .line 97
    invoke-static {v6, v7, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 98
    move-result v7

    .line 99
    .line 100
    if-eqz v7, :cond_2

    .line 101
    goto :goto_0

    .line 102
    .line 103
    :cond_2
    const-string v7, "Unexpected response code for CONNECT"

    .line 104
    .line 105
    .line 106
    invoke-static {v6, v7, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 107
    move-result v7

    .line 108
    .line 109
    if-eqz v7, :cond_3

    .line 110
    goto :goto_0

    .line 111
    .line 112
    :cond_3
    const-string v7, "exhausted all routes"

    .line 113
    .line 114
    .line 115
    invoke-static {v6, v7, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 116
    move-result v7

    .line 117
    .line 118
    if-eqz v7, :cond_4

    .line 119
    goto :goto_0

    .line 120
    .line 121
    :cond_4
    const-string v7, "unexpected end of stream"

    .line 122
    .line 123
    .line 124
    invoke-static {v6, v7, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 125
    move-result v7

    .line 126
    .line 127
    if-eqz v7, :cond_5

    .line 128
    goto :goto_0

    .line 129
    .line 130
    :cond_5
    const-string v7, "stream was reset: CANCEL"

    .line 131
    .line 132
    .line 133
    invoke-static {v6, v7, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 134
    move-result v7

    .line 135
    .line 136
    if-eqz v7, :cond_6

    .line 137
    goto :goto_0

    .line 138
    .line 139
    :cond_6
    const-string v7, "Software caused connection abort"

    .line 140
    .line 141
    .line 142
    invoke-static {v6, v7, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 143
    move-result v4

    .line 144
    .line 145
    if-eqz v4, :cond_7

    .line 146
    goto :goto_0

    .line 147
    .line 148
    :cond_7
    const-string v4, "closed"

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    move-result v4

    .line 153
    .line 154
    if-eqz v4, :cond_8

    .line 155
    goto :goto_0

    .line 156
    :cond_8
    move v3, v2

    .line 157
    .line 158
    :goto_0
    const-string v4, "IllegalStageInterceptor"

    .line 159
    .line 160
    if-eqz v3, :cond_9

    .line 161
    .line 162
    .line 163
    invoke-static {v4, v1}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 164
    goto :goto_1

    .line 165
    .line 166
    .line 167
    :cond_9
    invoke-static {v1, v4}, Lor/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 168
    .line 169
    :goto_1
    sget-object v1, Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;->CATE_HTTP_ILLEGAL:Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;

    .line 170
    .line 171
    .line 172
    invoke-static {v1, v2}, Lqq/h;->d(Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    .line 176
    move-result-object p1

    .line 177
    return-object p1

    .line 178
    .line 179
    :cond_a
    new-instance p1, Lcom/kubi/network/retrofit/interceptor/IllegalStageException;

    .line 180
    .line 181
    new-instance v1, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 191
    move-result-object v0

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    .line 204
    invoke-direct {p1, v0}, Lcom/kubi/network/retrofit/interceptor/IllegalStageException;-><init>(Ljava/lang/String;)V

    .line 205
    throw p1
.end method
