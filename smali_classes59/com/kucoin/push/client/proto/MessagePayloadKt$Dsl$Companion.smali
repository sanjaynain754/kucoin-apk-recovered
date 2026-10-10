.class public final Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl$Companion;
.super Ljava/lang/Object;
.source "MessagePayloadKt.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl$Companion;",
        "",
        "<init>",
        "()V",
        "Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;",
        "builder",
        "Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;",
        "_create",
        "(Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;)Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;",
        "network-core-subscribe_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic _create(Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;)Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;
    .locals 2
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .line 1
    .line 2
    const-string v0, "builder"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;-><init>(Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    return-object v0
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
