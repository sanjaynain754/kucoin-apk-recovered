.class public final Lcom/kubi/kweb/helper/WhiteListHelper;
.super Ljava/lang/Object;
.source "WhiteListHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/kubi/kweb/helper/WhiteListHelper;",
        "",
        "<init>",
        "()V",
        "fetchWhiteList",
        "",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "KWebLib_googleRelease"
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
        "SMAP\nWhiteListHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhiteListHelper.kt\ncom/kubi/kweb/helper/WhiteListHelper\n+ 2 KWebIssue.kt\ncom/kubi/kweb/exception/KWebIssueKt\n*L\n1#1,33:1\n44#2,2:34\n*S KotlinDebug\n*F\n+ 1 WhiteListHelper.kt\ncom/kubi/kweb/helper/WhiteListHelper\n*L\n23#1:34,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/kweb/helper/WhiteListHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kweb/helper/WhiteListHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/kweb/helper/WhiteListHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/kweb/helper/WhiteListHelper;->a:Lcom/kubi/kweb/helper/WhiteListHelper;

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
.method public final a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/kweb/helper/WhiteListHelper$fetchWhiteList$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/kweb/helper/WhiteListHelper$fetchWhiteList$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/kweb/helper/WhiteListHelper$fetchWhiteList$1;->label:I

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
    iput v1, v0, Lcom/kubi/kweb/helper/WhiteListHelper$fetchWhiteList$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/kweb/helper/WhiteListHelper$fetchWhiteList$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/kweb/helper/WhiteListHelper$fetchWhiteList$1;-><init>(Lcom/kubi/kweb/helper/WhiteListHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/kweb/helper/WhiteListHelper$fetchWhiteList$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/kweb/helper/WhiteListHelper$fetchWhiteList$1;->label:I

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
    .line 40
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    goto :goto_1

    .line 42
    :catch_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    move-object v1, p1

    .line 45
    goto :goto_2

    .line 46
    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p1

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_1
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    const-class v2, Lcom/kubi/kweb/api/IWebApi;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    check-cast p1, Lcom/kubi/kweb/api/IWebApi;

    .line 69
    .line 70
    iput v3, v0, Lcom/kubi/kweb/helper/WhiteListHelper$fetchWhiteList$1;->label:I

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, v0}, Lcom/kubi/kweb/api/IWebApi;->getWhiteUrlList(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    if-ne p1, v1, :cond_3

    .line 77
    return-object v1

    .line 78
    .line 79
    :cond_3
    :goto_1
    check-cast p1, Lcom/kubi/sdk/base/entity/BaseEntity;

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lzm/a;->a(Lcom/kubi/sdk/base/entity/BaseEntity;)Ljava/lang/Object;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    check-cast p1, Ljava/util/List;

    .line 86
    .line 87
    sget-object v0, Lx00/b;->a:Lx00/b;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1}, Lx00/b;->o(Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 91
    goto :goto_3

    .line 92
    .line 93
    .line 94
    :goto_2
    invoke-static {v1}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 95
    move-result p1

    .line 96
    const/4 v7, 0x2

    .line 97
    const/4 v8, 0x0

    .line 98
    .line 99
    if-nez p1, :cond_4

    .line 100
    .line 101
    new-instance v0, Lcom/kubi/kweb/exception/KWebException;

    .line 102
    .line 103
    const/16 v5, 0x8

    .line 104
    const/4 v6, 0x0

    .line 105
    .line 106
    const-string v2, "fetchWhiteList err"

    .line 107
    const/4 v3, 0x0

    .line 108
    const/4 v4, 0x0

    .line 109
    .line 110
    .line 111
    invoke-direct/range {v0 .. v6}, Lcom/kubi/kweb/exception/KWebException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0, v8, v7, v8}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 115
    goto :goto_3

    .line 116
    .line 117
    :cond_4
    const-string p1, "fetchWhiteList err"

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v8, v7, v8}, Lqq/a;->c(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 121
    .line 122
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 123
    return-object p1
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
