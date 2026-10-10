.class public final Lshark/s$a;
.super Ljava/lang/Object;
.source "RandomAccessSource.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lshark/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# direct methods
.method public static a(Lshark/s;)Lokio/BufferedSource;
    .locals 1
    .param p0    # Lshark/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lshark/s$a$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lshark/s$a$a;-><init>(Lshark/s;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    const-string v0, "Okio.buffer(object : Sou\u2026 bytesRead\n      }\n    })"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    return-object p0
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
