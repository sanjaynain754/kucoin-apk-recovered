.class public final enum Lcom/revolut/revolutpay/api/params/BoxTextCurrency;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/revolut/revolutpay/api/params/BoxTextCurrency;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/revolut/revolutpay/api/params/BoxTextCurrency;",
        "",
        "(Ljava/lang/String;I)V",
        "GBP",
        "EUR",
        "USD",
        "revolut_pay_sdk_2_0_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum EUR:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

.field public static final enum GBP:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

.field public static final enum USD:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

.field public static final synthetic b:[Lcom/revolut/revolutpay/api/params/BoxTextCurrency;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 3
    .line 4
    const-string v1, "GBP"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->GBP:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 11
    .line 12
    new-instance v0, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 13
    .line 14
    const-string v1, "EUR"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->EUR:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 21
    .line 22
    new-instance v0, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 23
    .line 24
    const-string v1, "USD"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->USD:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->a()[Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sput-object v0, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->b:[Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 37
    return-void
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
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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
.end method

.method public static final synthetic a()[Lcom/revolut/revolutpay/api/params/BoxTextCurrency;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->GBP:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 3
    .line 4
    sget-object v1, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->EUR:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 5
    .line 6
    sget-object v2, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->USD:Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 7
    .line 8
    .line 9
    filled-new-array {v0, v1, v2}, [Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/revolut/revolutpay/api/params/BoxTextCurrency;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 9
    return-object p0
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

.method public static values()[Lcom/revolut/revolutpay/api/params/BoxTextCurrency;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/revolut/revolutpay/api/params/BoxTextCurrency;->b:[Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/revolut/revolutpay/api/params/BoxTextCurrency;

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
.end method
