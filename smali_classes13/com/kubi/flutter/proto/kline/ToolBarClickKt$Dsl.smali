.class public final Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl;
.super Ljava/lang/Object;
.source "ToolBarClickKt.kt"


# annotations
.annotation build Lcom/google/protobuf/kotlin/ProtoDslMarker;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl;",
        "",
        "_builder",
        "Lcom/kubi/flutter/proto/kline/ToolBarClick$Builder;",
        "<init>",
        "(Lcom/kubi/flutter/proto/kline/ToolBarClick$Builder;)V",
        "_build",
        "Lcom/kubi/flutter/proto/kline/ToolBarClick;",
        "value",
        "Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;",
        "type",
        "getType",
        "()Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;",
        "setType",
        "(Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;)V",
        "clearType",
        "",
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
.field public static final b:Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/kubi/flutter/proto/kline/ToolBarClick$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl$Companion;

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

.method public constructor <init>(Lcom/kubi/flutter/proto/kline/ToolBarClick$b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl;->a:Lcom/kubi/flutter/proto/kline/ToolBarClick$b;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/flutter/proto/kline/ToolBarClick$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl;-><init>(Lcom/kubi/flutter/proto/kline/ToolBarClick$b;)V

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/kubi/flutter/proto/kline/ToolBarClick;
    .locals 2
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl;->a:Lcom/kubi/flutter/proto/kline/ToolBarClick$b;

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
    check-cast v0, Lcom/kubi/flutter/proto/kline/ToolBarClick;

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

.method public final b(Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;)V
    .locals 1
    .param p1    # Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmName;
        name = "setType"
    .end annotation

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/flutter/proto/kline/ToolBarClickKt$Dsl;->a:Lcom/kubi/flutter/proto/kline/ToolBarClick$b;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/proto/kline/ToolBarClick$b;->a(Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;)Lcom/kubi/flutter/proto/kline/ToolBarClick$b;

    .line 11
    return-void
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
