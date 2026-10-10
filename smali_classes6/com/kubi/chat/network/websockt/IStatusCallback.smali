.class public interface abstract Lcom/kubi/chat/network/websockt/IStatusCallback;
.super Ljava/lang/Object;
.source "ChatSocketExecutor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/chat/network/websockt/IStatusCallback$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008f\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/chat/network/websockt/IStatusCallback;",
        "",
        "",
        "onConnected",
        "()V",
        "onDisconnect",
        "a",
        "Companion",
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


# static fields
.field public static final a:Lcom/kubi/chat/network/websockt/IStatusCallback$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/chat/network/websockt/IStatusCallback$Companion;->a:Lcom/kubi/chat/network/websockt/IStatusCallback$Companion;

    .line 3
    .line 4
    sput-object v0, Lcom/kubi/chat/network/websockt/IStatusCallback;->a:Lcom/kubi/chat/network/websockt/IStatusCallback$Companion;

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


# virtual methods
.method public abstract onConnected()V
.end method

.method public abstract onDisconnect()V
.end method
