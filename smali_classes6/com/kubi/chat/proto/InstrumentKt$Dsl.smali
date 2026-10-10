.class public final Lcom/kubi/chat/proto/InstrumentKt$Dsl;
.super Ljava/lang/Object;
.source "InstrumentKt.kt"


# annotations
.annotation build Lcom/google/protobuf/kotlin/ProtoDslMarker;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/chat/proto/InstrumentKt$Dsl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0011B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "com/kubi/chat/proto/InstrumentKt$Dsl",
        "",
        "Lcom/kubi/chat/proto/ImProtocol$Instrument$a;",
        "_builder",
        "<init>",
        "(Lcom/kubi/chat/proto/ImProtocol$Instrument$a;)V",
        "Lcom/kubi/chat/proto/ImProtocol$Instrument;",
        "a",
        "()Lcom/kubi/chat/proto/ImProtocol$Instrument;",
        "Lcom/kubi/chat/proto/ImProtocol$Instrument$a;",
        "Lcom/kubi/chat/proto/ImProtocol$InstrumentType;",
        "value",
        "getType",
        "()Lcom/kubi/chat/proto/ImProtocol$InstrumentType;",
        "b",
        "(Lcom/kubi/chat/proto/ImProtocol$InstrumentType;)V",
        "type",
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
.field public static final b:Lcom/kubi/chat/proto/InstrumentKt$Dsl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/kubi/chat/proto/ImProtocol$Instrument$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/chat/proto/InstrumentKt$Dsl$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/chat/proto/InstrumentKt$Dsl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/chat/proto/InstrumentKt$Dsl;->b:Lcom/kubi/chat/proto/InstrumentKt$Dsl$Companion;

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
.end method

.method public constructor <init>(Lcom/kubi/chat/proto/ImProtocol$Instrument$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/chat/proto/InstrumentKt$Dsl;->a:Lcom/kubi/chat/proto/ImProtocol$Instrument$a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/chat/proto/ImProtocol$Instrument$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kubi/chat/proto/InstrumentKt$Dsl;-><init>(Lcom/kubi/chat/proto/ImProtocol$Instrument$a;)V

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/kubi/chat/proto/ImProtocol$Instrument;
    .locals 2
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/chat/proto/InstrumentKt$Dsl;->a:Lcom/kubi/chat/proto/ImProtocol$Instrument$a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "_builder.build()"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    check-cast v0, Lcom/kubi/chat/proto/ImProtocol$Instrument;

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
.end method

.method public final b(Lcom/kubi/chat/proto/ImProtocol$InstrumentType;)V
    .locals 1
    .param p1    # Lcom/kubi/chat/proto/ImProtocol$InstrumentType;
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
    iget-object v0, p0, Lcom/kubi/chat/proto/InstrumentKt$Dsl;->a:Lcom/kubi/chat/proto/ImProtocol$Instrument$a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/kubi/chat/proto/ImProtocol$Instrument$a;->a(Lcom/kubi/chat/proto/ImProtocol$InstrumentType;)Lcom/kubi/chat/proto/ImProtocol$Instrument$a;

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
