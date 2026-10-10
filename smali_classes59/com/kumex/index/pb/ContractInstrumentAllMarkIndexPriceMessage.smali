.class public final Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "ContractInstrumentAllMarkIndexPriceMessage.java"

# interfaces
.implements Lcom/google/protobuf/MessageLiteOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;",
        "Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage$b;",
        ">;",
        "Lcom/google/protobuf/MessageLiteOrBuilder;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

.field public static final GRANULARITY_FIELD_NUMBER:I = 0x1

.field public static final INDEX_PRICE_FIELD_NUMBER:I = 0x3

.field public static final MARK_PRICE_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/Parser; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;",
            ">;"
        }
    .end annotation
.end field

.field public static final SYMBOL_FIELD_NUMBER:I = 0x5

.field public static final TIMESTAMP_FIELD_NUMBER:I = 0x4


# instance fields
.field private granularity_:J

.field private indexPrice_:Ljava/lang/String;

.field private markPrice_:Ljava/lang/String;

.field private symbol_:Ljava/lang/String;

.field private timestamp_:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    .line 8
    .line 9
    const-class v1, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

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
    iput-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->markPrice_:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->indexPrice_:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->symbol_:Ljava/lang/String;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic access$000()Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

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

.method public static synthetic access$100(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->setGranularity(J)V

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

.method public static synthetic access$1000(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->clearTimestamp()V

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

.method public static synthetic access$1100(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->setSymbol(Ljava/lang/String;)V

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

.method public static synthetic access$1200(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->clearSymbol()V

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

.method public static synthetic access$1300(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->setSymbolBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$200(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->clearGranularity()V

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

.method public static synthetic access$300(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->setMarkPrice(Ljava/lang/String;)V

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

.method public static synthetic access$400(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->clearMarkPrice()V

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

.method public static synthetic access$500(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->setMarkPriceBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$600(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->setIndexPrice(Ljava/lang/String;)V

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

.method public static synthetic access$700(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->clearIndexPrice()V

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

.method public static synthetic access$800(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;Lcom/google/protobuf/ByteString;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->setIndexPriceBytes(Lcom/google/protobuf/ByteString;)V

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

.method public static synthetic access$900(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->setTimestamp(J)V

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

.method private clearGranularity()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->granularity_:J

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

.method private clearIndexPrice()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->getDefaultInstance()Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->getIndexPrice()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->indexPrice_:Ljava/lang/String;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private clearMarkPrice()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->getDefaultInstance()Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->getMarkPrice()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->markPrice_:Ljava/lang/String;

    .line 11
    return-void
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
    invoke-static {}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->getDefaultInstance()Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->getSymbol()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->symbol_:Ljava/lang/String;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private clearTimestamp()V
    .locals 2

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->timestamp_:J

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

.method public static getDefaultInstance()Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

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

.method public static newBuilder()Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage$b;

    return-object v0
.end method

.method public static newBuilder(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage$b;
    .locals 1

    .line 2
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage$b;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

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

.method private setGranularity(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->granularity_:J

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

.method private setIndexPrice(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->indexPrice_:Ljava/lang/String;

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

.method private setIndexPriceBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->indexPrice_:Ljava/lang/String;

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

.method private setMarkPrice(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->markPrice_:Ljava/lang/String;

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

.method private setMarkPriceBytes(Lcom/google/protobuf/ByteString;)V
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
    iput-object p1, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->markPrice_:Ljava/lang/String;

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

.method private setSymbol(Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->symbol_:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->symbol_:Ljava/lang/String;

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

.method private setTimestamp(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->timestamp_:J

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
    .locals 2

    .line 1
    .line 2
    sget-object p2, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage$a;->a:[I

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
    sget-object p1, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->PARSER:Lcom/google/protobuf/Parser;

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    const-class p2, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    .line 32
    monitor-enter p2

    .line 33
    .line 34
    :try_start_0
    sget-object p1, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->PARSER:Lcom/google/protobuf/Parser;

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 39
    .line 40
    sget-object p3, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    .line 41
    .line 42
    .line 43
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 44
    .line 45
    sput-object p1, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->PARSER:Lcom/google/protobuf/Parser;

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
    sget-object p1, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    .line 56
    return-object p1

    .line 57
    .line 58
    :pswitch_4
    const-string p1, "granularity_"

    .line 59
    .line 60
    const-string p2, "markPrice_"

    .line 61
    .line 62
    const-string p3, "indexPrice_"

    .line 63
    .line 64
    .line 65
    const-string/jumbo v0, "timestamp_"

    .line 66
    .line 67
    .line 68
    const-string/jumbo v1, "symbol_"

    .line 69
    .line 70
    .line 71
    filled-new-array {p1, p2, p3, v0, v1}, [Ljava/lang/Object;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    const-string p2, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u0208"

    .line 75
    .line 76
    sget-object p3, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->DEFAULT_INSTANCE:Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    .line 77
    .line 78
    .line 79
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    .line 83
    :pswitch_5
    new-instance p1, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage$b;

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, p2}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage$b;-><init>(Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage$a;)V

    .line 87
    return-object p1

    .line 88
    .line 89
    :pswitch_6
    new-instance p1, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;

    .line 90
    .line 91
    .line 92
    invoke-direct {p1}, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;-><init>()V

    .line 93
    return-object p1

    .line 94
    nop

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

.method public getGranularity()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->granularity_:J

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

.method public getIndexPrice()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->indexPrice_:Ljava/lang/String;

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

.method public getIndexPriceBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->indexPrice_:Ljava/lang/String;

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

.method public getMarkPrice()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->markPrice_:Ljava/lang/String;

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

.method public getMarkPriceBytes()Lcom/google/protobuf/ByteString;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->markPrice_:Ljava/lang/String;

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

.method public getSymbol()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->symbol_:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->symbol_:Ljava/lang/String;

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

.method public getTimestamp()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kumex/index/pb/ContractInstrumentAllMarkIndexPriceMessage;->timestamp_:J

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
