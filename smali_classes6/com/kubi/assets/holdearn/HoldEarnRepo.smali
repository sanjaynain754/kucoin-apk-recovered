.class public final Lcom/kubi/assets/holdearn/HoldEarnRepo;
.super Ljava/lang/Object;
.source "HoldEarnRepo.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0086@\u00a2\u0006\u0002\u0010\rR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/assets/holdearn/HoldEarnRepo;",
        "",
        "<init>",
        "()V",
        "api",
        "Lcom/kubi/assets/AssetV2Api;",
        "kotlin.jvm.PlatformType",
        "getApi",
        "()Lcom/kubi/assets/AssetV2Api;",
        "api$delegate",
        "Lkotlin/Lazy;",
        "getHoldEarnCardInfo",
        "Lcom/kubi/assets/entity/HoldEarnInfoEntity;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "AssetsCenterLib_googleRelease"
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
.field public static final a:Lcom/kubi/assets/holdearn/HoldEarnRepo;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/holdearn/HoldEarnRepo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/holdearn/HoldEarnRepo;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/assets/holdearn/HoldEarnRepo;->a:Lcom/kubi/assets/holdearn/HoldEarnRepo;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/assets/holdearn/r;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/assets/holdearn/r;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/kubi/assets/holdearn/HoldEarnRepo;->b:Lkotlin/Lazy;

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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
.end method

.method public static synthetic a()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/holdearn/HoldEarnRepo;->b()Lcom/kubi/assets/h0;

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
.end method

.method public static final b()Lcom/kubi/assets/h0;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->c()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lcom/kubi/assets/h0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/kubi/assets/h0;

    .line 13
    return-object v0
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
.end method


# virtual methods
.method public final c()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/holdearn/HoldEarnRepo;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/h0;

    .line 9
    return-object v0
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
.end method

.method public final d(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/assets/entity/HoldEarnInfoEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;->label:I

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
    iput v1, v0, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;-><init>(Lcom/kubi/assets/holdearn/HoldEarnRepo;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object v0, v0, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lcom/kubi/assets/holdearn/HoldEarnRepo;

    .line 43
    .line 44
    .line 45
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_3

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    sget-object p1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Financing:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 65
    move-result p1

    .line 66
    .line 67
    if-eqz p1, :cond_a

    .line 68
    .line 69
    sget-object p1, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->EARN_HOLD_TO_EARN:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 73
    move-result p1

    .line 74
    .line 75
    if-nez p1, :cond_3

    .line 76
    goto :goto_5

    .line 77
    .line 78
    :cond_3
    sget-object p1, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Lcom/kubi/user/api/IUserService;->c()Z

    .line 86
    move-result p1

    .line 87
    .line 88
    if-nez p1, :cond_4

    .line 89
    return-object v4

    .line 90
    .line 91
    .line 92
    :cond_4
    invoke-static {}, Lcom/kubi/user/config/UserInfo;->c()Lcom/kubi/user/model/LoginUserEntity;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/kubi/user/model/LoginUserEntity;->getType()I

    .line 97
    move-result p1

    .line 98
    const/4 v2, 0x3

    .line 99
    .line 100
    if-ne p1, v2, :cond_5

    .line 101
    return-object v4

    .line 102
    .line 103
    :cond_5
    :try_start_1
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/kubi/assets/holdearn/HoldEarnRepo;->c()Lcom/kubi/assets/h0;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-interface {p1}, Lcom/kubi/assets/h0;->X()Lkotlinx/coroutines/flow/e;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    move-result-object v2

    .line 116
    .line 117
    iput-object v2, v0, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;->L$0:Ljava/lang/Object;

    .line 118
    const/4 v2, 0x0

    .line 119
    .line 120
    iput v2, v0, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;->I$0:I

    .line 121
    .line 122
    iput v3, v0, Lcom/kubi/assets/holdearn/HoldEarnRepo$getHoldEarnCardInfo$1;->label:I

    .line 123
    .line 124
    .line 125
    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/g;->H(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 126
    move-result-object p1

    .line 127
    .line 128
    if-ne p1, v1, :cond_6

    .line 129
    return-object v1

    .line 130
    .line 131
    :cond_6
    :goto_1
    check-cast p1, Lcom/kubi/assets/entity/HoldEarnInfoEntity;

    .line 132
    .line 133
    if-eqz p1, :cond_8

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/kubi/assets/entity/HoldEarnInfoEntity;->getType()Ljava/lang/Integer;

    .line 137
    move-result-object v0

    .line 138
    .line 139
    if-nez v0, :cond_7

    .line 140
    goto :goto_2

    .line 141
    .line 142
    .line 143
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 144
    move-result v0

    .line 145
    const/4 v1, 0x2

    .line 146
    .line 147
    if-ne v0, v1, :cond_8

    .line 148
    return-object p1

    .line 149
    .line 150
    .line 151
    :cond_8
    :goto_2
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    goto :goto_4

    .line 154
    .line 155
    :goto_3
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 156
    .line 157
    .line 158
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 159
    move-result-object p1

    .line 160
    .line 161
    .line 162
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    move-result-object p1

    .line 164
    .line 165
    .line 166
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 167
    move-result v0

    .line 168
    .line 169
    if-eqz v0, :cond_9

    .line 170
    goto :goto_5

    .line 171
    :cond_9
    move-object v4, p1

    .line 172
    :cond_a
    :goto_5
    return-object v4
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
