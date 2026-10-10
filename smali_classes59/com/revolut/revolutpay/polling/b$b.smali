.class final Lcom/revolut/revolutpay/polling/b$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revolut/revolutpay/polling/b;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/revolut/revolutpay/polling/b;


# direct methods
.method public constructor <init>(Lcom/revolut/revolutpay/polling/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/revolut/revolutpay/polling/b$b;->a:Lcom/revolut/revolutpay/polling/b;

    .line 3
    const/4 p1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    return-void
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
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b$b;->a:Lcom/revolut/revolutpay/polling/b;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/revolut/revolutpay/polling/b;->f(Lcom/revolut/revolutpay/polling/b;)Lja0/d;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/revolut/revolutpay/polling/b$b;->a:Lcom/revolut/revolutpay/polling/b;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lcom/revolut/revolutpay/polling/b;->l(Lcom/revolut/revolutpay/polling/b;)Ljava/lang/String;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Lja0/d;->a(Ljava/lang/String;)Lcom/revolut/revolutpay/api/OrderState;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v1, p0, Lcom/revolut/revolutpay/polling/b$b;->a:Lcom/revolut/revolutpay/polling/b;

    .line 19
    .line 20
    sget-object v2, Lcom/revolut/revolutpay/api/OrderState;->COMPLETED:Lcom/revolut/revolutpay/api/OrderState;

    .line 21
    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Lcom/revolut/revolutpay/polling/b;->o(Lcom/revolut/revolutpay/polling/b;)V

    .line 26
    return-void

    .line 27
    :catch_0
    move-exception v0

    .line 28
    goto :goto_0

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-static {v1}, Lcom/revolut/revolutpay/polling/b;->p(Lcom/revolut/revolutpay/polling/b;)V
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-void

    .line 33
    .line 34
    :goto_0
    iget-object v1, p0, Lcom/revolut/revolutpay/polling/b$b;->a:Lcom/revolut/revolutpay/polling/b;

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v0}, Lcom/revolut/revolutpay/polling/b;->d(Lcom/revolut/revolutpay/polling/b;Ljava/lang/Throwable;)V

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :catch_1
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b$b;->a:Lcom/revolut/revolutpay/polling/b;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/revolut/revolutpay/polling/b;->p(Lcom/revolut/revolutpay/polling/b;)V

    .line 44
    :goto_1
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
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/revolut/revolutpay/polling/b$b;->a()V

    .line 4
    .line 5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object v0
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
.end method
