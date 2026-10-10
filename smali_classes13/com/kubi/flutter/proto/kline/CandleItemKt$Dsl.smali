.class public final Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;
.super Ljava/lang/Object;
.source "CandleItemKt.kt"


# annotations
.annotation build Lcom/google/protobuf/kotlin/ProtoDslMarker;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0018\u0008\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010\'\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0008\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0008\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0019\u0010\u0014\"\u0004\u0008\u001a\u0010\u0016R$\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0008\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001d\u0010\u0014\"\u0004\u0008\u001e\u0010\u0016R$\u0010 \u001a\u00020\u00112\u0006\u0010\u0008\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008!\u0010\u0014\"\u0004\u0008\"\u0010\u0016R$\u0010$\u001a\u00020\u00112\u0006\u0010\u0008\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008%\u0010\u0014\"\u0004\u0008&\u0010\u0016\u00a8\u0006)"
    }
    d2 = {
        "Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;",
        "",
        "_builder",
        "Lcom/kubi/flutter/proto/kline/CandleItem$Builder;",
        "<init>",
        "(Lcom/kubi/flutter/proto/kline/CandleItem$Builder;)V",
        "_build",
        "Lcom/kubi/flutter/proto/kline/CandleItem;",
        "value",
        "",
        "time",
        "getTime",
        "()J",
        "setTime",
        "(J)V",
        "clearTime",
        "",
        "",
        "open",
        "getOpen",
        "()D",
        "setOpen",
        "(D)V",
        "clearOpen",
        "close",
        "getClose",
        "setClose",
        "clearClose",
        "high",
        "getHigh",
        "setHigh",
        "clearHigh",
        "low",
        "getLow",
        "setLow",
        "clearLow",
        "volume",
        "getVolume",
        "setVolume",
        "clearVolume",
        "Companion",
        "LKLineWidget_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/kubi/flutter/proto/kline/CandleItem$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl$Companion;

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
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>(Lcom/kubi/flutter/proto/kline/CandleItem$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->a:Lcom/kubi/flutter/proto/kline/CandleItem$b;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/flutter/proto/kline/CandleItem$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;-><init>(Lcom/kubi/flutter/proto/kline/CandleItem$b;)V

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/kubi/flutter/proto/kline/CandleItem;
    .locals 2
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->a:Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "build(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast v0, Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 14
    return-object v0
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

.method public final b(D)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "setClose"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->a:Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/kubi/flutter/proto/kline/CandleItem$b;->a(D)Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 6
    return-void
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
.end method

.method public final c(D)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "setHigh"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->a:Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/kubi/flutter/proto/kline/CandleItem$b;->b(D)Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 6
    return-void
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
.end method

.method public final d(D)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "setLow"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->a:Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/kubi/flutter/proto/kline/CandleItem$b;->c(D)Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 6
    return-void
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
.end method

.method public final e(D)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "setOpen"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->a:Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/kubi/flutter/proto/kline/CandleItem$b;->d(D)Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 6
    return-void
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
.end method

.method public final f(J)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "setTime"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->a:Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/kubi/flutter/proto/kline/CandleItem$b;->e(J)Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 6
    return-void
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
.end method

.method public final g(D)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmName;
        name = "setVolume"
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;->a:Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/kubi/flutter/proto/kline/CandleItem$b;->f(D)Lcom/kubi/flutter/proto/kline/CandleItem$b;

    .line 6
    return-void
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
.end method
