.class public final Lkotlinx/serialization/internal/r0;
.super Lkotlinx/serialization/internal/h2;
.source "InlineClassDescriptor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0096\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lkotlinx/serialization/internal/r0;",
        "Lkotlinx/serialization/internal/h2;",
        "",
        "name",
        "Lkotlinx/serialization/internal/m0;",
        "generatedSerializer",
        "<init>",
        "(Ljava/lang/String;Lkotlinx/serialization/internal/m0;)V",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "m",
        "Z",
        "isInline",
        "()Z",
        "kotlinx-serialization-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInlineClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n+ 2 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,44:1\n111#2,10:45\n*S KotlinDebug\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n*L\n22#1:45,10\n*E\n"
    }
.end annotation


# instance fields
.field public final m:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlinx/serialization/internal/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlinx/serialization/internal/m0<",
            "*>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "name"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "generatedSerializer"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x1

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2, v0}, Lkotlinx/serialization/internal/h2;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/m0;I)V

    .line 15
    .line 16
    iput-boolean v0, p0, Lkotlinx/serialization/internal/r0;->m:Z

    .line 17
    return-void
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


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lkotlinx/serialization/internal/r0;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-interface {p0}, Lvg0/f;->h()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    move-object v3, p1

    .line 16
    .line 17
    check-cast v3, Lvg0/f;

    .line 18
    .line 19
    .line 20
    invoke-interface {v3}, Lvg0/f;->h()Ljava/lang/String;

    .line 21
    move-result-object v4

    .line 22
    .line 23
    .line 24
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    return v2

    .line 29
    .line 30
    :cond_2
    check-cast p1, Lkotlinx/serialization/internal/r0;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lkotlinx/serialization/internal/r0;->isInline()Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_7

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lkotlinx/serialization/internal/h2;->t()[Lvg0/f;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lkotlinx/serialization/internal/h2;->t()[Lvg0/f;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 48
    move-result p1

    .line 49
    .line 50
    if-eqz p1, :cond_7

    .line 51
    .line 52
    .line 53
    invoke-interface {p0}, Lvg0/f;->e()I

    .line 54
    move-result p1

    .line 55
    .line 56
    .line 57
    invoke-interface {v3}, Lvg0/f;->e()I

    .line 58
    move-result v1

    .line 59
    .line 60
    if-eq p1, v1, :cond_3

    .line 61
    return v2

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-interface {p0}, Lvg0/f;->e()I

    .line 65
    move-result p1

    .line 66
    move v1, v2

    .line 67
    .line 68
    :goto_0
    if-ge v1, p1, :cond_6

    .line 69
    .line 70
    .line 71
    invoke-interface {p0, v1}, Lvg0/f;->d(I)Lvg0/f;

    .line 72
    move-result-object v4

    .line 73
    .line 74
    .line 75
    invoke-interface {v4}, Lvg0/f;->h()Ljava/lang/String;

    .line 76
    move-result-object v4

    .line 77
    .line 78
    .line 79
    invoke-interface {v3, v1}, Lvg0/f;->d(I)Lvg0/f;

    .line 80
    move-result-object v5

    .line 81
    .line 82
    .line 83
    invoke-interface {v5}, Lvg0/f;->h()Ljava/lang/String;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    .line 87
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    move-result v4

    .line 89
    .line 90
    if-nez v4, :cond_4

    .line 91
    return v2

    .line 92
    .line 93
    .line 94
    :cond_4
    invoke-interface {p0, v1}, Lvg0/f;->d(I)Lvg0/f;

    .line 95
    move-result-object v4

    .line 96
    .line 97
    .line 98
    invoke-interface {v4}, Lvg0/f;->getKind()Lvg0/n;

    .line 99
    move-result-object v4

    .line 100
    .line 101
    .line 102
    invoke-interface {v3, v1}, Lvg0/f;->d(I)Lvg0/f;

    .line 103
    move-result-object v5

    .line 104
    .line 105
    .line 106
    invoke-interface {v5}, Lvg0/f;->getKind()Lvg0/n;

    .line 107
    move-result-object v5

    .line 108
    .line 109
    .line 110
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    move-result v4

    .line 112
    .line 113
    if-nez v4, :cond_5

    .line 114
    return v2

    .line 115
    .line 116
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 117
    goto :goto_0

    .line 118
    :cond_6
    return v0

    .line 119
    :cond_7
    return v2
    .line 120
.end method

.method public hashCode()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lkotlinx/serialization/internal/h2;->hashCode()I

    .line 4
    move-result v0

    .line 5
    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    return v0
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
.end method

.method public isInline()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lkotlinx/serialization/internal/r0;->m:Z

    .line 3
    return v0
    .line 4
    .line 5
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
.end method
