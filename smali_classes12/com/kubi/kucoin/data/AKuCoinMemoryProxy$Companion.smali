.class public final Lcom/kubi/kucoin/data/AKuCoinMemoryProxy$Companion;
.super Ljava/lang/Object;
.source "AKuCoinMemoryProxy.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/kucoin/data/AKuCoinMemoryProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0008\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kubi/kucoin/data/AKuCoinMemoryProxy$Companion;",
        "",
        "<init>",
        "()V",
        "instance",
        "Lcom/kubi/kucoin/data/AKuCoinMemoryProxy;",
        "create",
        "",
        "getInstance",
        "LAppNet_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAKuCoinMemoryProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AKuCoinMemoryProxy.kt\ncom/kubi/kucoin/data/AKuCoinMemoryProxy$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"
    }
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
    invoke-direct {p0}, Lcom/kubi/kucoin/data/AKuCoinMemoryProxy$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/data/AKuCoinMemoryProxy;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/kucoin/data/AKuCoinMemoryProxy;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/kubi/kucoin/data/AKuCoinMemoryProxy;->i(Lcom/kubi/kucoin/data/AKuCoinMemoryProxy;)V

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final getInstance()Lcom/kubi/kucoin/data/AKuCoinMemoryProxy;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kucoin/data/AKuCoinMemoryProxy;->h()Lcom/kubi/kucoin/data/AKuCoinMemoryProxy;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-object v0

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v1, "\u8bf7\u5148\u521d\u59cb\u5316\u540e\uff0c\u5728\u4f7f\u7528MemoryProxy\uff01\uff01\uff01"

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    throw v0
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
.end method
