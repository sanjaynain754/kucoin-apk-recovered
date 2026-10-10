.class final Lcom/kubi/network/socket/WebSocketClient$connect$1;
.super Lkotlin/jvm/internal/Lambda;
.source "WebSocketClient.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/network/socket/WebSocketClient;->connect()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/kubi/network/api/model/NetworkMessage<",
        "*>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/kubi/network/api/model/NetworkMessage;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kubi/network/socket/WebSocketClient;


# direct methods
.method public constructor <init>(Lcom/kubi/network/socket/WebSocketClient;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/network/socket/WebSocketClient$connect$1;->this$0:Lcom/kubi/network/socket/WebSocketClient;

    .line 3
    const/4 p1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/kubi/network/api/model/NetworkMessage;

    invoke-virtual {p0, p1}, Lcom/kubi/network/socket/WebSocketClient$connect$1;->invoke(Lcom/kubi/network/api/model/NetworkMessage;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/kubi/network/api/model/NetworkMessage;)V
    .locals 1
    .param p1    # Lcom/kubi/network/api/model/NetworkMessage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/network/api/model/NetworkMessage<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kubi/network/socket/WebSocketClient$connect$1;->this$0:Lcom/kubi/network/socket/WebSocketClient;

    invoke-static {v0}, Lcom/kubi/network/socket/WebSocketClient;->i(Lcom/kubi/network/socket/WebSocketClient;)Lcom/kubi/network/socket/bus/MessageBus;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kubi/network/socket/bus/MessageBus;->c(Lcom/kubi/network/api/model/NetworkMessage;)V

    return-void
.end method
