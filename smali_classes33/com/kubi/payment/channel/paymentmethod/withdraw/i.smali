.class public final Lcom/kubi/payment/channel/paymentmethod/withdraw/i;
.super Ljava/lang/Object;
.source "WithdrawPreCheckInterceptor.kt"

# interfaces
.implements Lcom/kubi/payment/channel/precheck/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kubi/payment/channel/paymentmethod/withdraw/WithdrawPreCheckInterceptor;",
        "Lcom/kubi/payment/channel/precheck/IPreCheckInterceptor;",
        "<init>",
        "()V",
        "intercept",
        "Lcom/kubi/payment/channel/precheck/PreCheckResult;",
        "param",
        "Lcom/kubi/payment/channel/precheck/PreCheckRequest;",
        "(Lcom/kubi/payment/channel/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
    .line 31
.end method


# virtual methods
.method public a(Lcom/kubi/payment/channel/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p1    # Lcom/kubi/payment/channel/precheck/PreCheckRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/payment/channel/precheck/PreCheckRequest;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/payment/channel/precheck/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object p2, Lcom/kubi/payment/channel/precheck/b$c;->a:Lcom/kubi/payment/channel/precheck/b$c;

    .line 3
    .line 4
    sget-object v0, Lcom/kubi/payment/helper/PreCheckHelper;->a:Lcom/kubi/payment/helper/PreCheckHelper;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/payment/helper/PreCheckHelper;->e()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/payment/helper/PreCheckHelper;->h()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object p2

    .line 19
    .line 20
    :cond_1
    :goto_0
    sget-object p2, Lcom/kubi/otc/security/SecuritySettingDialog;->x0:Lcom/kubi/otc/security/SecuritySettingDialog$Companion;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/kubi/payment/channel/precheck/PreCheckRequest;->getFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    new-instance v0, Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;

    .line 27
    .line 28
    const/16 v7, 0x2d

    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v1, 0x0

    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    .line 37
    .line 38
    invoke-direct/range {v0 .. v8}, Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;-><init>(ZZZZZLjava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1, v0}, Lcom/kubi/otc/security/SecuritySettingDialog$Companion;->show(Landroidx/fragment/app/FragmentManager;Lcom/kubi/otc/security/SecuritySettingDialog$SecuritySetting;)V

    .line 42
    .line 43
    sget-object p1, Lcom/kubi/payment/channel/precheck/b$b;->a:Lcom/kubi/payment/channel/precheck/b$b;

    .line 44
    return-object p1
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
