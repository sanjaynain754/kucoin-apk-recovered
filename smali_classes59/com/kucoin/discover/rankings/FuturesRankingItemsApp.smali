.class public final Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
.super Lcom/google/protobuf/GeneratedMessageLite;
.source "FuturesRankingItemsApp.java"

# interfaces
.implements Lcom/google/protobuf/MessageLiteOrBuilder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kucoin/discover/rankings/FuturesRankingItemsApp$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite<",
        "Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;",
        "Lcom/kucoin/discover/rankings/FuturesRankingItemsApp$b;",
        ">;",
        "Lcom/google/protobuf/MessageLiteOrBuilder;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

.field public static final ITEMS_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private items_:Lcom/google/protobuf/Internal$ProtobufList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$ProtobufList<",
            "Lcom/kucoin/discover/rankings/FuturesRankingItemApp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    .line 8
    .line 9
    const-class v1, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

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
    .line 6
    invoke-static {}, Lcom/google/protobuf/GeneratedMessageLite;->emptyProtobufList()Lcom/google/protobuf/Internal$ProtobufList;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

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

.method public static synthetic access$000()Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

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

.method public static synthetic access$100(Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;ILcom/kucoin/discover/rankings/FuturesRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->setItems(ILcom/kucoin/discover/rankings/FuturesRankingItemApp;)V

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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
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
.end method

.method public static synthetic access$200(Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;Lcom/kucoin/discover/rankings/FuturesRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->addItems(Lcom/kucoin/discover/rankings/FuturesRankingItemApp;)V

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

.method public static synthetic access$300(Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;ILcom/kucoin/discover/rankings/FuturesRankingItemApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->addItems(ILcom/kucoin/discover/rankings/FuturesRankingItemApp;)V

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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
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
.end method

.method public static synthetic access$400(Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;Ljava/lang/Iterable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->addAllItems(Ljava/lang/Iterable;)V

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

.method public static synthetic access$500(Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->clearItems()V

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

.method public static synthetic access$600(Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->removeItems(I)V

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

.method private addAllItems(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/kucoin/discover/rankings/FuturesRankingItemApp;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->ensureItemsIsMutable()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 9
    return-void
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

.method private addItems(ILcom/kucoin/discover/rankings/FuturesRankingItemApp;)V
    .locals 1

    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->ensureItemsIsMutable()V

    .line 6
    iget-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method private addItems(Lcom/kucoin/discover/rankings/FuturesRankingItemApp;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->ensureItemsIsMutable()V

    .line 3
    iget-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private clearItems()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/google/protobuf/GeneratedMessageLite;->emptyProtobufList()Lcom/google/protobuf/Internal$ProtobufList;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

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
.end method

.method private ensureItemsIsMutable()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/protobuf/Internal$ProtobufList;->isModifiable()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageLite;->mutableCopy(Lcom/google/protobuf/Internal$ProtobufList;)Lcom/google/protobuf/Internal$ProtobufList;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
.end method

.method public static getDefaultInstance()Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

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

.method public static newBuilder()Lcom/kucoin/discover/rankings/FuturesRankingItemsApp$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object v0

    check-cast v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp$b;

    return-object v0
.end method

.method public static newBuilder(Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp$b;
    .locals 1

    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->createBuilder(Lcom/google/protobuf/GeneratedMessageLite;)Lcom/google/protobuf/GeneratedMessageLite$Builder;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp$b;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseDelimitedFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parseFrom(Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;Ljava/nio/ByteBuffer;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[B)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 6
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageLite;->parseFrom(Lcom/google/protobuf/GeneratedMessageLite;[BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/GeneratedMessageLite;

    move-result-object p0

    check-cast p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

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

.method private removeItems(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->ensureItemsIsMutable()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 9
    return-void
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

.method private setItems(ILcom/kucoin/discover/rankings/FuturesRankingItemApp;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->ensureItemsIsMutable()V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 12
    return-void
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


# virtual methods
.method public final dynamicMethod(Lcom/google/protobuf/GeneratedMessageLite$MethodToInvoke;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    sget-object p2, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp$a;->a:[I

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
    sget-object p1, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->PARSER:Lcom/google/protobuf/Parser;

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    const-class p2, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    .line 26
    monitor-enter p2

    .line 27
    .line 28
    :try_start_0
    sget-object p1, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->PARSER:Lcom/google/protobuf/Parser;

    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    new-instance p1, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;

    .line 33
    .line 34
    sget-object p3, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, p3}, Lcom/google/protobuf/GeneratedMessageLite$DefaultInstanceBasedParser;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 38
    .line 39
    sput-object p1, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->PARSER:Lcom/google/protobuf/Parser;

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    monitor-exit p2

    .line 44
    return-object p1

    .line 45
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw p1

    .line 47
    :cond_1
    return-object p1

    .line 48
    .line 49
    :pswitch_2
    sget-object p1, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    .line 50
    return-object p1

    .line 51
    .line 52
    :pswitch_3
    const-string p1, "items_"

    .line 53
    .line 54
    const-class p2, Lcom/kucoin/discover/rankings/FuturesRankingItemApp;

    .line 55
    .line 56
    .line 57
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    const-string p2, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    .line 61
    .line 62
    sget-object p3, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->DEFAULT_INSTANCE:Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    .line 63
    .line 64
    .line 65
    invoke-static {p3, p2, p1}, Lcom/google/protobuf/GeneratedMessageLite;->newMessageInfo(Lcom/google/protobuf/MessageLite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    .line 69
    :pswitch_4
    new-instance p1, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp$b;

    .line 70
    .line 71
    .line 72
    invoke-direct {p1, p2}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp$b;-><init>(Lcom/kucoin/discover/rankings/FuturesRankingItemsApp$a;)V

    .line 73
    return-object p1

    .line 74
    .line 75
    :pswitch_5
    new-instance p1, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;

    .line 76
    .line 77
    .line 78
    invoke-direct {p1}, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;-><init>()V

    .line 79
    return-object p1

    .line 80
    nop

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public getItems(I)Lcom/kucoin/discover/rankings/FuturesRankingItemApp;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Lcom/kucoin/discover/rankings/FuturesRankingItemApp;

    .line 9
    return-object p1
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

.method public getItemsCount()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public getItemsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kucoin/discover/rankings/FuturesRankingItemApp;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

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

.method public getItemsOrBuilder(I)Ly80/c;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Ly80/c;

    .line 9
    return-object p1
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

.method public getItemsOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Ly80/c;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kucoin/discover/rankings/FuturesRankingItemsApp;->items_:Lcom/google/protobuf/Internal$ProtobufList;

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
