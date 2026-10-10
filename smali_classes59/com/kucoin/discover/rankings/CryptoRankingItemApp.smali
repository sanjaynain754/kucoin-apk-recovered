.class public final Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "CryptoRankingItemApp.java"

# interfaces
.implements Ly80/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kucoin/discover/rankings/CryptoRankingItemApp$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lcom/kucoin/discover/rankings/CryptoRankingItemApp;",
        "Lcom/kucoin/discover/rankings/CryptoRankingItemApp$b;",
        ">;",
        "Ly80/b;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

.field public static final ICON_FIELD_NUMBER:I = 0x2

.field public static final LAST24HOURRATE_FIELD_NUMBER:I = 0x3

.field public static final LAST24HOURTRADINGVOLUME_FIELD_NUMBER:I = 0x5

.field public static final LASTPRICE_FIELD_NUMBER:I = 0x4

.field public static final OPENAT_FIELD_NUMBER:I = 0x6

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/kucoin/discover/rankings/CryptoRankingItemApp;",
            ">;"
        }
    .end annotation
.end field

.field public static final SYMBOL_FIELD_NUMBER:I = 0x1


# instance fields
.field private icon_:Ljava/lang/String;

.field private last24HourRate_:F

.field private last24HourTradingVolume_:D

.field private lastPrice_:Ljava/lang/String;

.field private openAt_:J

.field private symbol_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    .line 8
    .line 9
    const-class v1, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

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
    iput-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->symbol_:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->icon_:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->lastPrice_:Ljava/lang/String;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic access$000()Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

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

.method public static synthetic access$100(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->setSymbol(Ljava/lang/String;)V

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

.method public static synthetic access$1000(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->clearLastPrice()V

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

.method public static synthetic access$1100(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->setLastPriceBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$1200(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;D)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->setLast24HourTradingVolume(D)V

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

.method public static synthetic access$1300(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->clearLast24HourTradingVolume()V

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

.method public static synthetic access$1400(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->setOpenAt(J)V

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

.method public static synthetic access$1500(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->clearOpenAt()V

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

.method public static synthetic access$200(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->clearSymbol()V

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

.method public static synthetic access$300(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->setSymbolBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$400(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->setIcon(Ljava/lang/String;)V

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

.method public static synthetic access$500(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->clearIcon()V

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

.method public static synthetic access$600(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->setIconBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$700(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->setLast24HourRate(F)V

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

.method public static synthetic access$800(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->clearLast24HourRate()V

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

.method public static synthetic access$900(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->setLastPrice(Ljava/lang/String;)V

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

.method private clearIcon()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->getDefaultInstance()Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->getIcon()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->icon_:Ljava/lang/String;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private clearLast24HourRate()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->last24HourRate_:F

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

.method private clearLast24HourTradingVolume()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->last24HourTradingVolume_:D

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

.method private clearLastPrice()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->getDefaultInstance()Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->getLastPrice()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->lastPrice_:Ljava/lang/String;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private clearOpenAt()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->openAt_:J

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

.method private clearSymbol()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->getDefaultInstance()Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->getSymbol()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->symbol_:Ljava/lang/String;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static getDefaultInstance()Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

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

.method public static newBuilder()Lcom/kucoin/discover/rankings/CryptoRankingItemApp$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp$b;

    return-object v0
.end method

.method public static newBuilder(Lcom/kucoin/discover/rankings/CryptoRankingItemApp;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp$b;
    .locals 1

    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp$b;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/CryptoRankingItemApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/kucoin/discover/rankings/CryptoRankingItemApp;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

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

.method private setIcon(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->icon_:Ljava/lang/String;

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

.method private setIconBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->icon_:Ljava/lang/String;

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

.method private setLast24HourRate(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->last24HourRate_:F

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

.method private setLast24HourTradingVolume(D)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->last24HourTradingVolume_:D

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

.method private setLastPrice(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->lastPrice_:Ljava/lang/String;

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

.method private setLastPriceBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->lastPrice_:Ljava/lang/String;

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

.method private setOpenAt(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->openAt_:J

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

.method private setSymbol(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->symbol_:Ljava/lang/String;

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

.method private setSymbolBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->symbol_:Ljava/lang/String;

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


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    sget-object p2, Lcom/kucoin/discover/rankings/CryptoRankingItemApp$a;->a:[I

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
    sget-object p1, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->PARSER:Lcom/google/protobuf/Parser;

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    const-class p2, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    .line 26
    monitor-enter p2

    .line 27
    .line 28
    :try_start_0
    sget-object p1, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->PARSER:Lcom/google/protobuf/Parser;

    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 33
    .line 34
    sget-object p3, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 38
    .line 39
    sput-object p1, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->PARSER:Lcom/google/protobuf/Parser;

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
    sget-object p1, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    .line 51
    return-object p1

    .line 52
    .line 53
    .line 54
    :pswitch_3
    const-string/jumbo v0, "symbol_"

    .line 55
    .line 56
    const-string v1, "icon_"

    .line 57
    .line 58
    const-string v2, "last24HourRate_"

    .line 59
    .line 60
    const-string v3, "lastPrice_"

    .line 61
    .line 62
    const-string v4, "last24HourTradingVolume_"

    .line 63
    .line 64
    .line 65
    const-string/jumbo v5, "openAt_"

    .line 66
    .line 67
    .line 68
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    const-string p2, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0001\u0004\u0208\u0005\u0000\u0006\u0002"

    .line 72
    .line 73
    sget-object p3, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    .line 74
    .line 75
    .line 76
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    .line 80
    :pswitch_4
    new-instance p1, Lcom/kucoin/discover/rankings/CryptoRankingItemApp$b;

    .line 81
    .line 82
    .line 83
    invoke-direct {p1, p2}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp$b;-><init>(Lcom/kucoin/discover/rankings/CryptoRankingItemApp$a;)V

    .line 84
    return-object p1

    .line 85
    .line 86
    :pswitch_5
    new-instance p1, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;

    .line 87
    .line 88
    .line 89
    invoke-direct {p1}, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;-><init>()V

    .line 90
    return-object p1

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
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

.method public getIcon()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->icon_:Ljava/lang/String;

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

.method public getIconBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->icon_:Ljava/lang/String;

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

.method public getLast24HourRate()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->last24HourRate_:F

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

.method public getLast24HourTradingVolume()D
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->last24HourTradingVolume_:D

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

.method public getLastPrice()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->lastPrice_:Ljava/lang/String;

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

.method public getLastPriceBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->lastPrice_:Ljava/lang/String;

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

.method public getOpenAt()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->openAt_:J

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

.method public getSymbol()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->symbol_:Ljava/lang/String;

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

.method public getSymbolBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/CryptoRankingItemApp;->symbol_:Ljava/lang/String;

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
