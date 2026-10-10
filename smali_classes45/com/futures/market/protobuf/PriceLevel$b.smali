.class public final Lcom/futures/market/protobuf/PriceLevel$b;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "PriceLevel.java"

# interfaces
.implements Lu7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/futures/market/protobuf/PriceLevel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/futures/market/protobuf/PriceLevel;",
        "Lcom/futures/market/protobuf/PriceLevel$b;",
        ">;",
        "Lu7/a;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/futures/market/protobuf/PriceLevel;->access$000()Lcom/futures/market/protobuf/PriceLevel;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/futures/market/protobuf/PriceLevel$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/futures/market/protobuf/PriceLevel$b;-><init>()V

    return-void
.end method
