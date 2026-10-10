.class public final Lcom/revolut/revolutpay/api/params/ButtonParams$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/revolut/revolutpay/api/params/ButtonParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/revolut/revolutpay/api/params/ButtonParams$Companion;",
        "",
        "()V",
        "default",
        "Lcom/revolut/revolutpay/api/params/ButtonParams;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/revolut/revolutpay/api/params/ButtonParams$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final default()Lcom/revolut/revolutpay/api/params/ButtonParams;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/revolut/revolutpay/api/params/ButtonParams;

    .line 3
    .line 4
    sget-object v1, Lcom/revolut/revolutpay/api/params/Radius;->NONE:Lcom/revolut/revolutpay/api/params/Radius;

    .line 5
    .line 6
    sget-object v2, Lcom/revolut/revolutpay/api/params/Size;->LARGE:Lcom/revolut/revolutpay/api/params/Size;

    .line 7
    .line 8
    new-instance v3, Lia0/b;

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x3

    .line 11
    .line 12
    .line 13
    invoke-direct {v3, v4, v4, v5, v4}, Lia0/b;-><init>(Lcom/revolut/revolutpay/api/params/Variant;Lcom/revolut/revolutpay/api/params/Variant;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    .line 15
    sget-object v4, Lcom/revolut/revolutpay/api/params/BoxText;->NONE:Lcom/revolut/revolutpay/api/params/BoxText;

    .line 16
    .line 17
    const/16 v7, 0x30

    .line 18
    const/4 v8, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v0 .. v8}, Lcom/revolut/revolutpay/api/params/ButtonParams;-><init>(Lcom/revolut/revolutpay/api/params/Radius;Lcom/revolut/revolutpay/api/params/Size;Lia0/b;Lcom/revolut/revolutpay/api/params/BoxText;Lcom/revolut/revolutpay/api/params/BoxTextCurrency;Lcom/revolut/revolutpay/api/params/BoxTextValue;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    return-object v0
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
.end method
