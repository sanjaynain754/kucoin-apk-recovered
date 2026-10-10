.class public final Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "AlphaTickerOuterClass.java"

# interfaces
.implements Lcom/google/protobuf/MessageLiteOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;",
        "Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker$a;",
        ">;",
        "Lcom/google/protobuf/MessageLiteOrBuilder;"
    }
.end annotation


# static fields
.field public static final CLOSEPRICE_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;",
            ">;"
        }
    .end annotation
.end field

.field public static final RATE_FIELD_NUMBER:I = 0x3

.field public static final TOKENBRIDGEID_FIELD_NUMBER:I = 0x1

.field public static final TRADINGVOLUME_FIELD_NUMBER:I = 0x4


# instance fields
.field private closePrice_:Ljava/lang/String;

.field private rate_:F

.field private tokenBridgeId_:J

.field private tradingVolume_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    .line 8
    .line 9
    const-class v1, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

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
    iput-object v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->closePrice_:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->tradingVolume_:Ljava/lang/String;

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic access$000()Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

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

.method public static synthetic access$100(Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->setTokenBridgeId(J)V

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

.method public static synthetic access$1000(Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->setTradingVolumeBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$200(Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->clearTokenBridgeId()V

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

.method public static synthetic access$300(Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->setClosePrice(Ljava/lang/String;)V

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

.method public static synthetic access$400(Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->clearClosePrice()V

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

.method public static synthetic access$500(Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->setClosePriceBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$600(Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->setRate(F)V

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

.method public static synthetic access$700(Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->clearRate()V

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

.method public static synthetic access$800(Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->setTradingVolume(Ljava/lang/String;)V

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

.method public static synthetic access$900(Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->clearTradingVolume()V

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

.method private clearClosePrice()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->getDefaultInstance()Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->getClosePrice()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->closePrice_:Ljava/lang/String;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private clearRate()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->rate_:F

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
    iput-wide v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->tokenBridgeId_:J

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

.method private clearTradingVolume()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->getDefaultInstance()Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->getTradingVolume()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->tradingVolume_:Ljava/lang/String;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static getDefaultInstance()Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

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

.method public static newBuilder()Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker$a;
    .locals 1

    .line 1
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker$a;

    return-object v0
.end method

.method public static newBuilder(Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker$a;
    .locals 1

    .line 2
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker$a;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

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

.method private setClosePrice(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->closePrice_:Ljava/lang/String;

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

.method private setClosePriceBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->closePrice_:Ljava/lang/String;

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

.method private setRate(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->rate_:F

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
    iput-wide p1, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->tokenBridgeId_:J

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

.method private setTradingVolume(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->tradingVolume_:Ljava/lang/String;

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

.method private setTradingVolumeBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->tradingVolume_:Ljava/lang/String;

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
    .locals 1

    .line 1
    .line 2
    sget-object p2, Lx80/a;->a:[I

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
    .line 14
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 18
    throw p1

    .line 19
    :pswitch_0
    return-object p2

    .line 20
    :pswitch_1
    const/4 p1, 0x1

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    .line 27
    :pswitch_2
    sget-object p1, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->PARSER:Lcom/google/protobuf/Parser;

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    const-class p2, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    .line 32
    monitor-enter p2

    .line 33
    .line 34
    :try_start_0
    sget-object p1, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->PARSER:Lcom/google/protobuf/Parser;

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 39
    .line 40
    sget-object p3, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    .line 41
    .line 42
    .line 43
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 44
    .line 45
    sput-object p1, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->PARSER:Lcom/google/protobuf/Parser;

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    monitor-exit p2

    .line 50
    return-object p1

    .line 51
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p1

    .line 53
    :cond_1
    return-object p1

    .line 54
    .line 55
    :pswitch_3
    sget-object p1, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    .line 56
    return-object p1

    .line 57
    .line 58
    .line 59
    :pswitch_4
    const-string/jumbo p1, "tokenBridgeId_"

    .line 60
    .line 61
    const-string p2, "closePrice_"

    .line 62
    .line 63
    .line 64
    const-string/jumbo p3, "rate_"

    .line 65
    .line 66
    .line 67
    const-string/jumbo v0, "tradingVolume_"

    .line 68
    .line 69
    .line 70
    filled-new-array {p1, p2, p3, v0}, [Ljava/lang/Object;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0001\u0004\u0208"

    .line 74
    .line 75
    sget-object p3, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->DEFAULT_INSTANCE:Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    .line 76
    .line 77
    .line 78
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    .line 82
    :pswitch_5
    new-instance p1, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker$a;

    .line 83
    .line 84
    .line 85
    invoke-direct {p1, p2}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker$a;-><init>(Lx80/a;)V

    .line 86
    return-object p1

    .line 87
    .line 88
    :pswitch_6
    new-instance p1, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;

    .line 89
    .line 90
    .line 91
    invoke-direct {p1}, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;-><init>()V

    .line 92
    return-object p1

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
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getClosePrice()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->closePrice_:Ljava/lang/String;

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

.method public getClosePriceBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->closePrice_:Ljava/lang/String;

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

.method public getRate()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->rate_:F

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
    iget-wide v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->tokenBridgeId_:J

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

.method public getTradingVolume()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->tradingVolume_:Ljava/lang/String;

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

.method public getTradingVolumeBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/alpha/AlphaTickerOuterClass$AlphaTicker;->tradingVolume_:Ljava/lang/String;

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
