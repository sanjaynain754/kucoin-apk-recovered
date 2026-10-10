.class public abstract Lcom/kubi/payment/fasttrade/FastTradeChannel;
.super Ljava/lang/Object;
.source "FastTradeChannel.kt"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/fasttrade/FastTradeChannel$Balance;,
        Lcom/kubi/payment/fasttrade/FastTradeChannel$BankCard;,
        Lcom/kubi/payment/fasttrade/FastTradeChannel$Blik;,
        Lcom/kubi/payment/fasttrade/FastTradeChannel$GooglePay;,
        Lcom/kubi/payment/fasttrade/FastTradeChannel$Ivy;,
        Lcom/kubi/payment/fasttrade/FastTradeChannel$P2P;,
        Lcom/kubi/payment/fasttrade/FastTradeChannel$Revolut;,
        Lcom/kubi/payment/fasttrade/FastTradeChannel$ThirdParty;,
        Lcom/kubi/payment/fasttrade/FastTradeChannel$ThirdPartyPayID;,
        Lcom/kubi/payment/fasttrade/FastTradeChannel$UnSupportedChannel;,
        Lcom/kubi/payment/fasttrade/FastTradeChannel$ZenPay;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u000b\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0019\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/kubi/payment/fasttrade/FastTradeChannel;",
        "",
        "paymentMethodCode",
        "",
        "channelId",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getPaymentMethodCode",
        "()Ljava/lang/String;",
        "getChannelId",
        "UnSupportedChannel",
        "BankCard",
        "GooglePay",
        "Revolut",
        "Blik",
        "Balance",
        "P2P",
        "ThirdParty",
        "ThirdPartyPayID",
        "Ivy",
        "ZenPay",
        "Lcom/kubi/payment/fasttrade/FastTradeChannel$Balance;",
        "Lcom/kubi/payment/fasttrade/FastTradeChannel$BankCard;",
        "Lcom/kubi/payment/fasttrade/FastTradeChannel$Blik;",
        "Lcom/kubi/payment/fasttrade/FastTradeChannel$GooglePay;",
        "Lcom/kubi/payment/fasttrade/FastTradeChannel$Ivy;",
        "Lcom/kubi/payment/fasttrade/FastTradeChannel$P2P;",
        "Lcom/kubi/payment/fasttrade/FastTradeChannel$Revolut;",
        "Lcom/kubi/payment/fasttrade/FastTradeChannel$ThirdParty;",
        "Lcom/kubi/payment/fasttrade/FastTradeChannel$ThirdPartyPayID;",
        "Lcom/kubi/payment/fasttrade/FastTradeChannel$UnSupportedChannel;",
        "Lcom/kubi/payment/fasttrade/FastTradeChannel$ZenPay;",
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


# instance fields
.field private final channelId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final paymentMethodCode:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/payment/fasttrade/FastTradeChannel;->paymentMethodCode:Ljava/lang/String;

    iput-object p2, p0, Lcom/kubi/payment/fasttrade/FastTradeChannel;->channelId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kubi/payment/fasttrade/FastTradeChannel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getChannelId()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/FastTradeChannel;->channelId:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public getPaymentMethodCode()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/fasttrade/FastTradeChannel;->paymentMethodCode:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method
