.class public final Lio/github/crow_misia/libyuv/PlanePrimitive$Companion;
.super Ljava/lang/Object;
.source "PlanePrimitive.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/crow_misia/libyuv/PlanePrimitive;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007H\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/github/crow_misia/libyuv/PlanePrimitive$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lio/github/crow_misia/libyuv/PlanePrimitive;",
        "rowStride",
        "",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "bufferSize",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
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
    invoke-direct {p0}, Lio/github/crow_misia/libyuv/PlanePrimitive$Companion;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lio/github/crow_misia/libyuv/PlanePrimitive$Companion;ILjava/nio/ByteBuffer;IILjava/lang/Object;)Lio/github/crow_misia/libyuv/PlanePrimitive;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p4, p4, 0x4

    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    .line 8
    move-result p3

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/github/crow_misia/libyuv/PlanePrimitive$Companion;->create(ILjava/nio/ByteBuffer;I)Lio/github/crow_misia/libyuv/PlanePrimitive;

    .line 12
    move-result-object p0

    .line 13
    return-object p0
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
.end method


# virtual methods
.method public final create(ILjava/nio/ByteBuffer;)Lio/github/crow_misia/libyuv/PlanePrimitive;
    .locals 7
    .param p2    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lio/github/crow_misia/libyuv/PlanePrimitive$Companion;->create$default(Lio/github/crow_misia/libyuv/PlanePrimitive$Companion;ILjava/nio/ByteBuffer;IILjava/lang/Object;)Lio/github/crow_misia/libyuv/PlanePrimitive;

    move-result-object p1

    return-object p1
.end method

.method public final create(ILjava/nio/ByteBuffer;I)Lio/github/crow_misia/libyuv/PlanePrimitive;
    .locals 2
    .param p2    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lio/github/crow_misia/libyuv/PlanePrimitive;

    .line 3
    invoke-static {p1}, Lze0/p;->a(I)I

    move-result p1

    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, p2, p3, v1}, Lio/github/crow_misia/libyuv/PlanePrimitive;-><init>(ILjava/nio/ByteBuffer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
