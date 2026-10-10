.class public final Lcom/spot/market/protobuf/Level2Entry$b;
.super Lcom/google/protobuf/GeneratedMessageLite$Builder;
.source "Level2Entry.java"

# interfaces
.implements Lnb0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/spot/market/protobuf/Level2Entry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageLite$Builder<",
        "Lcom/spot/market/protobuf/Level2Entry;",
        "Lcom/spot/market/protobuf/Level2Entry$b;",
        ">;",
        "Lnb0/a;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, Lcom/spot/market/protobuf/Level2Entry;->access$000()Lcom/spot/market/protobuf/Level2Entry;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/spot/market/protobuf/Level2Entry$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/spot/market/protobuf/Level2Entry$b;-><init>()V

    return-void
.end method
