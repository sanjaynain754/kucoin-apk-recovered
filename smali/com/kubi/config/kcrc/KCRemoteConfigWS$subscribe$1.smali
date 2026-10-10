.class final Lcom/kubi/config/kcrc/KCRemoteConfigWS$subscribe$1;
.super Lkotlin/jvm/internal/Lambda;
.source "KCRemoteConfigWS.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/config/kcrc/KCRemoteConfigWS;->i(Lcom/kubi/config/Config;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/kubi/network/websocket/model/Message;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/kubi/network/websocket/model/Message;",
        "invoke",
        "(Lcom/kubi/network/websocket/model/Message;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kubi/config/kcrc/KCRemoteConfigWS;


# direct methods
.method public constructor <init>(Lcom/kubi/config/kcrc/KCRemoteConfigWS;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/config/kcrc/KCRemoteConfigWS$subscribe$1;->this$0:Lcom/kubi/config/kcrc/KCRemoteConfigWS;

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
.end method


# virtual methods
.method public final invoke(Lcom/kubi/network/websocket/model/Message;)Ljava/lang/Boolean;
    .locals 2
    .param p1    # Lcom/kubi/network/websocket/model/Message;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getSource()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "socket"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/kubi/network/websocket/model/Message;->getTopic()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/kubi/config/kcrc/KCRemoteConfigWS$subscribe$1;->this$0:Lcom/kubi/config/kcrc/KCRemoteConfigWS;

    invoke-static {v0}, Lcom/kubi/config/kcrc/KCRemoteConfigWS;->f(Lcom/kubi/config/kcrc/KCRemoteConfigWS;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/kubi/network/websocket/model/Message;

    invoke-virtual {p0, p1}, Lcom/kubi/config/kcrc/KCRemoteConfigWS$subscribe$1;->invoke(Lcom/kubi/network/websocket/model/Message;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
