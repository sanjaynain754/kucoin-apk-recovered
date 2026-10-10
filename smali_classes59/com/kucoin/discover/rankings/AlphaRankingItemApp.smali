.class public final Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "AlphaRankingItemApp.java"

# interfaces
.implements Ly80/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kucoin/discover/rankings/AlphaRankingItemApp$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lcom/kucoin/discover/rankings/AlphaRankingItemApp;",
        "Lcom/kucoin/discover/rankings/AlphaRankingItemApp$b;",
        ">;",
        "Ly80/a;"
    }
.end annotation


# static fields
.field public static final ALPHAOPENINGAT_FIELD_NUMBER:I = 0x8

.field public static final CHAINICON_FIELD_NUMBER:I = 0x7

.field private static final DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

.field public static final DISPLAYTOKEN_FIELD_NUMBER:I = 0x5

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/kucoin/discover/rankings/AlphaRankingItemApp;",
            ">;"
        }
    .end annotation
.end field

.field public static final PRICERATE_FIELD_NUMBER:I = 0x4

.field public static final PRICE_FIELD_NUMBER:I = 0x3

.field public static final TOKENBRIDGEID_FIELD_NUMBER:I = 0x1

.field public static final TOKENICON_FIELD_NUMBER:I = 0x6

.field public static final TRADINGVOLUME_FIELD_NUMBER:I = 0x2


# instance fields
.field private alphaOpeningAt_:J

.field private chainIcon_:Ljava/lang/String;

.field private displayToken_:Ljava/lang/String;

.field private priceRate_:F

.field private price_:Ljava/lang/String;

.field private tokenBridgeId_:J

.field private tokenIcon_:Ljava/lang/String;

.field private tradingVolume_:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 8
    .line 9
    const-class v1, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v0}, Lcom/google/protobuf/GeneratedMessageLite;->registerDefaultInstance(Ljava/lang/Class;Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageLite;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->price_:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->displayToken_:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tokenIcon_:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->chainIcon_:Ljava/lang/String;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic access$000()Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

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
.end method

.method public static synthetic access$100(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setTokenBridgeId(J)V

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

.method public static synthetic access$1000(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setDisplayToken(Ljava/lang/String;)V

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

.method public static synthetic access$1100(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->clearDisplayToken()V

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
.end method

.method public static synthetic access$1200(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setDisplayTokenBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$1300(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setTokenIcon(Ljava/lang/String;)V

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

.method public static synthetic access$1400(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->clearTokenIcon()V

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
.end method

.method public static synthetic access$1500(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setTokenIconBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$1600(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setChainIcon(Ljava/lang/String;)V

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

.method public static synthetic access$1700(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->clearChainIcon()V

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
.end method

.method public static synthetic access$1800(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setChainIconBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$1900(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setAlphaOpeningAt(J)V

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

.method public static synthetic access$200(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->clearTokenBridgeId()V

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
.end method

.method public static synthetic access$2000(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->clearAlphaOpeningAt()V

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
.end method

.method public static synthetic access$300(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;D)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setTradingVolume(D)V

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

.method public static synthetic access$400(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->clearTradingVolume()V

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
.end method

.method public static synthetic access$500(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setPrice(Ljava/lang/String;)V

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

.method public static synthetic access$600(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->clearPrice()V

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
.end method

.method public static synthetic access$700(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setPriceBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$800(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->setPriceRate(F)V

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

.method public static synthetic access$900(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->clearPriceRate()V

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
.end method

.method private clearAlphaOpeningAt()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->alphaOpeningAt_:J

    .line 5
    return-void
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
.end method

.method private clearChainIcon()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->getDefaultInstance()Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->getChainIcon()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->chainIcon_:Ljava/lang/String;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private clearDisplayToken()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->getDefaultInstance()Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->getDisplayToken()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->displayToken_:Ljava/lang/String;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private clearPrice()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->getDefaultInstance()Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->getPrice()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->price_:Ljava/lang/String;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private clearPriceRate()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->priceRate_:F

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
.end method

.method private clearTokenBridgeId()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tokenBridgeId_:J

    .line 5
    return-void
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
.end method

.method private clearTokenIcon()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->getDefaultInstance()Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->getTokenIcon()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tokenIcon_:Ljava/lang/String;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private clearTradingVolume()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tradingVolume_:D

    .line 5
    return-void
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
.end method

.method public static getDefaultInstance()Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

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
.end method

.method public static newBuilder()Lcom/kucoin/discover/rankings/AlphaRankingItemApp$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp$b;

    return-object v0
.end method

.method public static newBuilder(Lcom/kucoin/discover/rankings/AlphaRankingItemApp;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp$b;
    .locals 1

    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp$b;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/AlphaRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/kucoin/discover/rankings/AlphaRankingItemApp;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->getParserForType()Lcom/google/protobuf/Parser;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method private setAlphaOpeningAt(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->alphaOpeningAt_:J

    .line 3
    return-void
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
.end method

.method private setChainIcon(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->chainIcon_:Ljava/lang/String;

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
.end method

.method private setChainIconBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->chainIcon_:Ljava/lang/String;

    .line 10
    return-void
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

.method private setDisplayToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->displayToken_:Ljava/lang/String;

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
.end method

.method private setDisplayTokenBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->displayToken_:Ljava/lang/String;

    .line 10
    return-void
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

.method private setPrice(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->price_:Ljava/lang/String;

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
.end method

.method private setPriceBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->price_:Ljava/lang/String;

    .line 10
    return-void
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

.method private setPriceRate(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->priceRate_:F

    .line 3
    return-void
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
.end method

.method private setTokenBridgeId(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tokenBridgeId_:J

    .line 3
    return-void
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
.end method

.method private setTokenIcon(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tokenIcon_:Ljava/lang/String;

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
.end method

.method private setTokenIconBytes(Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    iput-object p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tokenIcon_:Ljava/lang/String;

    .line 10
    return-void
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

.method private setTradingVolume(D)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tradingVolume_:D

    .line 3
    return-void
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
.end method


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    .line 2
    sget-object p2, Lcom/kucoin/discover/rankings/AlphaRankingItemApp$a;->a:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, p2, p1

    .line 9
    const/4 p2, 0x0

    .line 10
    .line 11
    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    throw p2

    .line 14
    :pswitch_0
    const/4 p1, 0x1

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    .line 21
    :pswitch_1
    sget-object p1, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->PARSER:Lcom/google/protobuf/Parser;

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    const-class p2, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 26
    monitor-enter p2

    .line 27
    .line 28
    :try_start_0
    sget-object p1, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->PARSER:Lcom/google/protobuf/Parser;

    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 33
    .line 34
    sget-object p3, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 38
    .line 39
    sput-object p1, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->PARSER:Lcom/google/protobuf/Parser;

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit p2

    .line 45
    return-object p1

    .line 46
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p1

    .line 48
    :cond_1
    return-object p1

    .line 49
    .line 50
    :pswitch_2
    sget-object p1, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 51
    return-object p1

    .line 52
    .line 53
    .line 54
    :pswitch_3
    const-string/jumbo v0, "tokenBridgeId_"

    .line 55
    .line 56
    .line 57
    const-string/jumbo v1, "tradingVolume_"

    .line 58
    .line 59
    .line 60
    const-string/jumbo v2, "price_"

    .line 61
    .line 62
    .line 63
    const-string/jumbo v3, "priceRate_"

    .line 64
    .line 65
    const-string v4, "displayToken_"

    .line 66
    .line 67
    .line 68
    const-string/jumbo v5, "tokenIcon_"

    .line 69
    .line 70
    const-string v6, "chainIcon_"

    .line 71
    .line 72
    const-string v7, "alphaOpeningAt_"

    .line 73
    .line 74
    .line 75
    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    const-string p2, "\u0000\u0008\u0000\u0000\u0001\u0008\u0008\u0000\u0000\u0000\u0001\u0002\u0002\u0000\u0003\u0208\u0004\u0001\u0005\u0208\u0006\u0208\u0007\u0208\u0008\u0002"

    .line 79
    .line 80
    sget-object p3, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 81
    .line 82
    .line 83
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    .line 87
    :pswitch_4
    new-instance p1, Lcom/kucoin/discover/rankings/AlphaRankingItemApp$b;

    .line 88
    .line 89
    .line 90
    invoke-direct {p1, p2}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp$b;-><init>(Lcom/kucoin/discover/rankings/AlphaRankingItemApp$a;)V

    .line 91
    return-object p1

    .line 92
    .line 93
    :pswitch_5
    new-instance p1, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;

    .line 94
    .line 95
    .line 96
    invoke-direct {p1}, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;-><init>()V

    .line 97
    return-object p1

    .line 98
    nop

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getAlphaOpeningAt()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->alphaOpeningAt_:J

    .line 3
    return-wide v0
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
.end method

.method public getChainIcon()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->chainIcon_:Ljava/lang/String;

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
.end method

.method public getChainIconBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->chainIcon_:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getDisplayToken()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->displayToken_:Ljava/lang/String;

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
.end method

.method public getDisplayTokenBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->displayToken_:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getPrice()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->price_:Ljava/lang/String;

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
.end method

.method public getPriceBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->price_:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getPriceRate()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->priceRate_:F

    .line 3
    return v0
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
.end method

.method public getTokenBridgeId()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tokenBridgeId_:J

    .line 3
    return-wide v0
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
.end method

.method public getTokenIcon()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tokenIcon_:Ljava/lang/String;

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
.end method

.method public getTokenIconBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tokenIcon_:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public getTradingVolume()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kucoin/discover/rankings/AlphaRankingItemApp;->tradingVolume_:D

    .line 3
    return-wide v0
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
.end method
