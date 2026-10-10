.class public final Lcom/kubi/payment/common/helper/UpgradeOptionHelper;
.super Ljava/lang/Object;
.source "UpgradeOptionHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@\u00a2\u0006\u0002\u0010\u0008J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u000cH\u0002\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/kubi/payment/common/helper/UpgradeOptionHelper;",
        "",
        "<init>",
        "()V",
        "loadUpgradeOption",
        "Lcom/kubi/payment/common/data/entities/UpgradeOptionResult;",
        "request",
        "Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;",
        "(Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "checkAppVersionIsSupport",
        "",
        "manage",
        "Landroidx/fragment/app/FragmentManager;",
        "(Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;Landroidx/fragment/app/FragmentManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "showTypeTipWebDialog",
        "",
        "content",
        "",
        "showTypeTipAppDialog",
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
.field public static final a:Lcom/kubi/payment/common/helper/UpgradeOptionHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/payment/common/helper/UpgradeOptionHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper;->a:Lcom/kubi/payment/common/helper/UpgradeOptionHelper;

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
    invoke-static {p0, p1}, Lcom/kubi/payment/common/helper/UpgradeOptionHelper;->e(Landroid/content/DialogInterface;I)V

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

.method public static final e(Landroid/content/DialogInterface;I)V
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


# virtual methods
.method public final b(Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;Landroidx/fragment/app/FragmentManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;",
            "Landroidx/fragment/app/FragmentManager;",
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
    instance-of v0, p3, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;->label:I

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
    iput v1, v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;-><init>(Lcom/kubi/payment/common/helper/UpgradeOptionHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;->label:I

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
    iget-object p1, v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;->L$1:Ljava/lang/Object;

    .line 40
    move-object p2, p1

    .line 41
    .line 42
    check-cast p2, Landroidx/fragment/app/FragmentManager;

    .line 43
    .line 44
    iget-object p1, v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;

    .line 47
    .line 48
    .line 49
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    throw p1

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    move-result-object p3

    .line 66
    .line 67
    iput-object p3, v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object p2, v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    iput v3, v0, Lcom/kubi/payment/common/helper/UpgradeOptionHelper$checkAppVersionIsSupport$1;->label:I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1, v0}, Lcom/kubi/payment/common/helper/UpgradeOptionHelper;->c(Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 75
    move-result-object p3

    .line 76
    .line 77
    if-ne p3, v1, :cond_3

    .line 78
    return-object v1

    .line 79
    .line 80
    :cond_3
    :goto_1
    check-cast p3, Lcom/kubi/payment/common/data/entities/UpgradeOptionResult;

    .line 81
    const/4 p1, 0x0

    .line 82
    .line 83
    if-eqz p3, :cond_4

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3}, Lcom/kubi/payment/common/data/entities/UpgradeOptionResult;->getStatus()Ljava/lang/Boolean;

    .line 87
    move-result-object v0

    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move-object v0, p1

    .line 90
    .line 91
    .line 92
    :goto_2
    invoke-static {v0}, Lub/b;->b(Ljava/lang/Boolean;)Z

    .line 93
    move-result v0

    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    .line 98
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    .line 102
    :cond_5
    if-eqz p3, :cond_6

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3}, Lcom/kubi/payment/common/data/entities/UpgradeOptionResult;->getContent()Ljava/lang/String;

    .line 106
    move-result-object v0

    .line 107
    goto :goto_3

    .line 108
    :cond_6
    move-object v0, p1

    .line 109
    .line 110
    .line 111
    :goto_3
    invoke-static {v0}, Lub/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    if-eqz p3, :cond_7

    .line 115
    .line 116
    .line 117
    invoke-virtual {p3}, Lcom/kubi/payment/common/data/entities/UpgradeOptionResult;->getType()Ljava/lang/String;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    :cond_7
    const-string p3, "1"

    .line 121
    .line 122
    .line 123
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    move-result p3

    .line 125
    const/4 v1, 0x0

    .line 126
    .line 127
    if-eqz p3, :cond_8

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0, p2}, Lcom/kubi/payment/common/helper/UpgradeOptionHelper;->f(Ljava/lang/String;Landroidx/fragment/app/FragmentManager;)V

    .line 131
    goto :goto_4

    .line 132
    .line 133
    :cond_8
    const-string p3, "2"

    .line 134
    .line 135
    .line 136
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    move-result p1

    .line 138
    .line 139
    if-eqz p1, :cond_9

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0, v0, p2}, Lcom/kubi/payment/common/helper/UpgradeOptionHelper;->d(Ljava/lang/String;Landroidx/fragment/app/FragmentManager;)V

    .line 143
    goto :goto_4

    .line 144
    .line 145
    :cond_9
    new-array p1, v1, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    invoke-static {v0, p1}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :goto_4
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 152
    move-result-object p1

    .line 153
    return-object p1
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

.method public final c(Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/payment/common/data/entities/UpgradeOptionResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->c()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lrt/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lrt/a;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Lrt/a;->a(Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;)Lkotlinx/coroutines/flow/e;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->k(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    return-object p1
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

.method public final d(Ljava/lang/String;Landroidx/fragment/app/FragmentManager;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget v1, Lcom/kubi/otc/R$string;->dialog_title_text_tip:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lub/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    sget v0, Lcom/kubi/otc/R$string;->dialog_but_appupgrade_upgrade:I

    .line 23
    .line 24
    new-instance v1, Lcom/kubi/payment/common/helper/e;

    .line 25
    .line 26
    .line 27
    invoke-direct {v1}, Lcom/kubi/payment/common/helper/e;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    sget v0, Lcom/kubi/otc/R$string;->cancel:I

    .line 34
    const/4 v1, 0x0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->P4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    const-string v0, "typeTipAppDialog"

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2, v0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 44
    return-void
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

.method public final f(Ljava/lang/String;Landroidx/fragment/app/FragmentManager;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget v1, Lcom/kubi/otc/R$string;->dialog_title_text_tip:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lub/b;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    sget v0, Lcom/kubi/otc/R$string;->i_already_know:I

    .line 23
    const/4 v1, 0x0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    const-string v0, "typeTipWebDialog"

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2, v0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 33
    return-void
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
