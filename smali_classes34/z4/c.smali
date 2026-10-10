.class public final Lz4/c;
.super Ljava/lang/Object;
.source "FpsCompressorInfo.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J1\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0011\u0010\r\u001a\u00020\u000c*\u00020\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lz4/c;",
        "",
        "",
        "maxFpsLimit",
        "<init>",
        "(I)V",
        "durationMs",
        "frameCount",
        "targetFps",
        "",
        "a",
        "(III)Ljava/util/Map;",
        "",
        "b",
        "(I)F",
        "I",
        "animated-drawable_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFpsCompressorInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FpsCompressorInfo.kt\ncom/facebook/fresco/animation/bitmap/preparation/loadframe/FpsCompressorInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,113:1\n1279#2,2:114\n1293#2,4:116\n216#3,2:120\n*S KotlinDebug\n*F\n+ 1 FpsCompressorInfo.kt\ncom/facebook/fresco/animation/bitmap/preparation/loadframe/FpsCompressorInfo\n*L\n44#1:114,2\n44#1:116,4\n67#1:120,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lz4/c;->a:I

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
.end method


# virtual methods
.method public final a(III)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {p3, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 5
    move-result p3

    .line 6
    .line 7
    iget v0, p0, Lz4/c;->a:I

    .line 8
    .line 9
    .line 10
    invoke-static {p3, v0}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    .line 11
    move-result p3

    .line 12
    int-to-float p3, p3

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lz4/c;->b(I)F

    .line 16
    move-result p1

    .line 17
    mul-float/2addr p3, p1

    .line 18
    const/4 p1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-static {p3, p1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 22
    move-result p1

    .line 23
    int-to-float p3, p2

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p3}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    .line 27
    move-result p1

    .line 28
    div-float/2addr p3, p1

    .line 29
    const/4 p1, 0x0

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    const/16 v1, 0xa

    .line 38
    .line 39
    .line 40
    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 41
    move-result v1

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 45
    move-result v1

    .line 46
    .line 47
    const/16 v2, 0x10

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 51
    move-result v1

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    move-result-object p2

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    move-result v1

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    move-result-object v1

    .line 69
    move-object v2, v1

    .line 70
    .line 71
    check-cast v2, Ljava/lang/Number;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 75
    move-result v2

    .line 76
    int-to-float v3, v2

    .line 77
    rem-float/2addr v3, p3

    .line 78
    float-to-int v3, v3

    .line 79
    .line 80
    if-nez v3, :cond_0

    .line 81
    move p1, v2

    .line 82
    .line 83
    .line 84
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    .line 88
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    return-object v0
    .line 91
    .line 92
    .line 93
.end method

.method public final b(I)F
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    .line 3
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 4
    div-float/2addr p1, v0

    .line 5
    return p1
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
    .line 22
    .line 23
.end method
