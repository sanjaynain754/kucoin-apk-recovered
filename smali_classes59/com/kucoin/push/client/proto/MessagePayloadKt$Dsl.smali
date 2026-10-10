.class public final Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;
.super Ljava/lang/Object;
.source "MessagePayloadKt.kt"


# annotations
.annotation build Lcom/google/protobuf/kotlin/ProtoDslMarker;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00082\u00020\u0001:\u0001\tB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "com/kucoin/push/client/proto/MessagePayloadKt$Dsl",
        "",
        "Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;",
        "_builder",
        "<init>",
        "(Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;)V",
        "a",
        "Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;",
        "b",
        "Companion",
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


# static fields
.field public static final b:Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;->b:Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl$Companion;

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
.end method

.method public constructor <init>(Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;->a:Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;-><init>(Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;)V

    return-void
.end method
