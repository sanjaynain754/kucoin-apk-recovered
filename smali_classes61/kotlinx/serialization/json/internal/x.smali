.class public final Lkotlinx/serialization/json/internal/x;
.super Ljava/lang/Object;
.source "Composers.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlinx/serialization/json/internal/InternalJsonWriter;",
        "sb",
        "Lxg0/a;",
        "json",
        "Lkotlinx/serialization/json/internal/n;",
        "a",
        "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lxg0/a;)Lkotlinx/serialization/json/internal/n;",
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


# direct methods
.method public static final a(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lxg0/a;)Lkotlinx/serialization/json/internal/n;
    .locals 1
    .param p0    # Lkotlinx/serialization/json/internal/InternalJsonWriter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxg0/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "sb"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "json"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lxg0/a;->e()Lxg0/f;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lxg0/f;->m()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v0, Lkotlinx/serialization/json/internal/w;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lkotlinx/serialization/json/internal/w;-><init>(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lxg0/a;)V

    .line 26
    return-object v0

    .line 27
    .line 28
    :cond_0
    new-instance p1, Lkotlinx/serialization/json/internal/n;

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, p0}, Lkotlinx/serialization/json/internal/n;-><init>(Lkotlinx/serialization/json/internal/InternalJsonWriter;)V

    .line 32
    return-object p1
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
