.class public final Lcom/kubi/flutter/proto/kline/OrderList$b;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "OrderList.java"

# interfaces
.implements Lcom/google/protobuf/MessageLiteOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/flutter/proto/kline/OrderList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/kubi/flutter/proto/kline/OrderList;",
        "Lcom/kubi/flutter/proto/kline/OrderList$b;",
        ">;",
        "Lcom/google/protobuf/MessageLiteOrBuilder;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/kubi/flutter/proto/kline/OrderList;->access$000()Lcom/kubi/flutter/proto/kline/OrderList;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/flutter/proto/kline/OrderList$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kubi/flutter/proto/kline/OrderList$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Iterable;)Lcom/kubi/flutter/proto/kline/OrderList$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/kubi/flutter/proto/kline/OrderItem;",
            ">;)",
            "Lcom/kubi/flutter/proto/kline/OrderList$b;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/flutter/proto/kline/OrderList;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/kubi/flutter/proto/kline/OrderList;->access$700(Lcom/kubi/flutter/proto/kline/OrderList;Ljava/lang/Iterable;)V

    .line 11
    return-object p0
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
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/flutter/proto/kline/OrderItem;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 3
    .line 4
    check-cast v0, Lcom/kubi/flutter/proto/kline/OrderList;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/OrderList;->getItemsList()Ljava/util/List;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
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
.end method

.method public c(Lcom/kubi/flutter/proto/kline/OrderList$OrderType;)Lcom/kubi/flutter/proto/kline/OrderList$b;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->copyOnWrite()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageLite$Builder;->instance:Lcom/google/protobuf/GeneratedMessageLite;

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/flutter/proto/kline/OrderList;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/kubi/flutter/proto/kline/OrderList;->access$200(Lcom/kubi/flutter/proto/kline/OrderList;Lcom/kubi/flutter/proto/kline/OrderList$OrderType;)V

    .line 11
    return-object p0
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
.end method
