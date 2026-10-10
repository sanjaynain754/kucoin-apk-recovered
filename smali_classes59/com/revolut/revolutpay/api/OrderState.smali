.class public final enum Lcom/revolut/revolutpay/api/OrderState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/revolut/revolutpay/api/OrderState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/revolut/revolutpay/api/OrderState;",
        "",
        "(Ljava/lang/String;I)V",
        "CREATED",
        "PENDING",
        "COMPLETED",
        "FAILED",
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
.field public static final enum COMPLETED:Lcom/revolut/revolutpay/api/OrderState;

.field public static final enum CREATED:Lcom/revolut/revolutpay/api/OrderState;

.field public static final enum FAILED:Lcom/revolut/revolutpay/api/OrderState;

.field public static final enum PENDING:Lcom/revolut/revolutpay/api/OrderState;

.field public static final synthetic b:[Lcom/revolut/revolutpay/api/OrderState;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/revolut/revolutpay/api/OrderState;

    .line 3
    .line 4
    const-string v1, "CREATED"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lcom/revolut/revolutpay/api/OrderState;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    sput-object v0, Lcom/revolut/revolutpay/api/OrderState;->CREATED:Lcom/revolut/revolutpay/api/OrderState;

    .line 11
    .line 12
    new-instance v0, Lcom/revolut/revolutpay/api/OrderState;

    .line 13
    .line 14
    const-string v1, "PENDING"

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/revolut/revolutpay/api/OrderState;-><init>(Ljava/lang/String;I)V

    .line 19
    .line 20
    sput-object v0, Lcom/revolut/revolutpay/api/OrderState;->PENDING:Lcom/revolut/revolutpay/api/OrderState;

    .line 21
    .line 22
    new-instance v0, Lcom/revolut/revolutpay/api/OrderState;

    .line 23
    .line 24
    const-string v1, "COMPLETED"

    .line 25
    const/4 v2, 0x2

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lcom/revolut/revolutpay/api/OrderState;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    sput-object v0, Lcom/revolut/revolutpay/api/OrderState;->COMPLETED:Lcom/revolut/revolutpay/api/OrderState;

    .line 31
    .line 32
    new-instance v0, Lcom/revolut/revolutpay/api/OrderState;

    .line 33
    .line 34
    const-string v1, "FAILED"

    .line 35
    const/4 v2, 0x3

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1, v2}, Lcom/revolut/revolutpay/api/OrderState;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    sput-object v0, Lcom/revolut/revolutpay/api/OrderState;->FAILED:Lcom/revolut/revolutpay/api/OrderState;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/revolut/revolutpay/api/OrderState;->a()[Lcom/revolut/revolutpay/api/OrderState;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sput-object v0, Lcom/revolut/revolutpay/api/OrderState;->b:[Lcom/revolut/revolutpay/api/OrderState;

    .line 47
    return-void
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

.method public static final synthetic a()[Lcom/revolut/revolutpay/api/OrderState;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/revolut/revolutpay/api/OrderState;->CREATED:Lcom/revolut/revolutpay/api/OrderState;

    .line 3
    .line 4
    sget-object v1, Lcom/revolut/revolutpay/api/OrderState;->PENDING:Lcom/revolut/revolutpay/api/OrderState;

    .line 5
    .line 6
    sget-object v2, Lcom/revolut/revolutpay/api/OrderState;->COMPLETED:Lcom/revolut/revolutpay/api/OrderState;

    .line 7
    .line 8
    sget-object v3, Lcom/revolut/revolutpay/api/OrderState;->FAILED:Lcom/revolut/revolutpay/api/OrderState;

    .line 9
    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3}, [Lcom/revolut/revolutpay/api/OrderState;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/revolut/revolutpay/api/OrderState;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lcom/revolut/revolutpay/api/OrderState;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/revolut/revolutpay/api/OrderState;

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

.method public static values()[Lcom/revolut/revolutpay/api/OrderState;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/revolut/revolutpay/api/OrderState;->b:[Lcom/revolut/revolutpay/api/OrderState;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lcom/revolut/revolutpay/api/OrderState;

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
