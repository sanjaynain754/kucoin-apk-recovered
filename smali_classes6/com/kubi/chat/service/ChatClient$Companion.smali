.class public final Lcom/kubi/chat/service/ChatClient$Companion;
.super Ljava/lang/Object;
.source "ChatClient.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/chat/service/ChatClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0018\u0010\u000c\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/kubi/chat/service/ChatClient$Companion;",
        "",
        "<init>",
        "()V",
        "Ltb/b;",
        "config",
        "",
        "init",
        "(Ltb/b;)V",
        "Lcom/kubi/chat/service/ChatClient;",
        "get",
        "()Lcom/kubi/chat/service/ChatClient;",
        "instance",
        "Lcom/kubi/chat/service/ChatClient;",
        "ImSDK_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
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
    invoke-direct {p0}, Lcom/kubi/chat/service/ChatClient$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Lcom/kubi/chat/service/ChatClient;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/chat/service/ChatClient;->b()Lcom/kubi/chat/service/ChatClient;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public final init(Ltb/b;)V
    .locals 1
    .param p1    # Ltb/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "config"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/kubi/chat/service/ChatClient;->b()Lcom/kubi/chat/service/ChatClient;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    new-instance v0, Lcom/kubi/chat/service/ChatClient;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p1}, Lcom/kubi/chat/service/ChatClient;-><init>(Ltb/b;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/kubi/chat/service/ChatClient;->d(Lcom/kubi/chat/service/ChatClient;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lcom/kubi/chat/service/ChatClient;->b()Lcom/kubi/chat/service/ChatClient;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    :goto_0
    return-void

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {p1}, Lcom/kubi/chat/service/ChatClient;->c(Lcom/kubi/chat/service/ChatClient;)V

    .line 31
    return-void
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
.end method
