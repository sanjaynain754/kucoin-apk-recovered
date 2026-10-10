.class public final Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$a;
.super Ljava/lang/Object;
.source "BuyRevolutConfirmFragment.kt"

# interfaces
.implements Lha0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment;->F4(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$pay$1",
        "Lcom/revolut/revolutpay/api/OrderResultCallback;",
        "onOrderCompleted",
        "",
        "onOrderFailed",
        "throwable",
        "",
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
        "SMAP\nBuyRevolutConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyRevolutConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$pay$1\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,167:1\n44#2,2:168\n*S KotlinDebug\n*F\n+ 1 BuyRevolutConfirmFragment.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmFragment$pay$1\n*L\n108#1:168,2\n*E\n"
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
    .line 31
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 9

    .line 1
    .line 2
    const-string v0, "throwable"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    const-string v1, "onOrderFailed "

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    const-string v1, "BuyRevolutConfirmFragment"

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    new-instance v2, Lcom/kubi/otc/exception/OtcException;

    .line 30
    .line 31
    const/16 v7, 0x8

    .line 32
    const/4 v8, 0x0

    .line 33
    .line 34
    const-string v4, "BuyRevolutConfirmFragment"

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    move-object v3, p1

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v2 .. v8}, Lcom/kubi/otc/exception/OtcException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    const/4 p1, 0x0

    .line 42
    const/4 v0, 0x2

    .line 43
    .line 44
    .line 45
    invoke-static {v2, p1, v0, p1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 46
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "BuyRevolutConfirmFragment"

    .line 3
    .line 4
    const-string v1, "onOrderCompleted"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

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
