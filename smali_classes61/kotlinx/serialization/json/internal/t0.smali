.class public final Lkotlinx/serialization/json/internal/t0;
.super Ljava/lang/Object;
.source "StreamingJsonEncoder.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\"\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\u0003\"\u0018\u0010\u0008\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\"\u0018\u0010\t\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "",
        "Lvg0/f;",
        "a",
        "Ljava/util/Set;",
        "unsignedNumberDescriptors",
        "",
        "b",
        "(Lvg0/f;)Z",
        "isUnsignedNumber",
        "isUnquotedLiteral",
        "kotlinx-serialization-json"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lvg0/f;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lkotlin/UInt;->Companion:Lkotlin/UInt$Companion;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lug0/a;->serializer(Lkotlin/UInt$Companion;)Ltg0/d;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ltg0/d;->getDescriptor()Lvg0/f;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sget-object v1, Lkotlin/ULong;->Companion:Lkotlin/ULong$Companion;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lug0/a;->serializer(Lkotlin/ULong$Companion;)Ltg0/d;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Ltg0/d;->getDescriptor()Lvg0/f;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    sget-object v2, Lkotlin/UByte;->Companion:Lkotlin/UByte$Companion;

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Lug0/a;->serializer(Lkotlin/UByte$Companion;)Ltg0/d;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-interface {v2}, Ltg0/d;->getDescriptor()Lvg0/f;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    sget-object v3, Lkotlin/UShort;->Companion:Lkotlin/UShort$Companion;

    .line 33
    .line 34
    .line 35
    invoke-static {v3}, Lug0/a;->serializer(Lkotlin/UShort$Companion;)Ltg0/d;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    invoke-interface {v3}, Ltg0/d;->getDescriptor()Lvg0/f;

    .line 40
    move-result-object v3

    .line 41
    const/4 v4, 0x4

    .line 42
    .line 43
    new-array v4, v4, [Lvg0/f;

    .line 44
    const/4 v5, 0x0

    .line 45
    .line 46
    aput-object v0, v4, v5

    .line 47
    const/4 v0, 0x1

    .line 48
    .line 49
    aput-object v1, v4, v0

    .line 50
    const/4 v0, 0x2

    .line 51
    .line 52
    aput-object v2, v4, v0

    .line 53
    const/4 v0, 0x3

    .line 54
    .line 55
    aput-object v3, v4, v0

    .line 56
    .line 57
    .line 58
    invoke-static {v4}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    sput-object v0, Lkotlinx/serialization/json/internal/t0;->a:Ljava/util/Set;

    .line 62
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public static final a(Lvg0/f;)Z
    .locals 1
    .param p0    # Lvg0/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Lvg0/f;->isInline()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lxg0/i;->m()Lvg0/f;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result p0

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static final b(Lvg0/f;)Z
    .locals 1
    .param p0    # Lvg0/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Lvg0/f;->isInline()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lkotlinx/serialization/json/internal/t0;->a:Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 17
    move-result p0

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
