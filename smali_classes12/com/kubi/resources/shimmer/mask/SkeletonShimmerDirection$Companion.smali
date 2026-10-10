.class public final Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection$Companion;
.super Ljava/lang/Object;
.source "SkeletonShimmerDirection.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection$Companion;",
        "",
        "<init>",
        "()V",
        "valueOf",
        "Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;",
        "stableId",
        "",
        "LComponent_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSkeletonShimmerDirection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkeletonShimmerDirection.kt\ncom/kubi/resources/shimmer/mask/SkeletonShimmerDirection$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,21:1\n1310#2,2:22\n*S KotlinDebug\n*F\n+ 1 SkeletonShimmerDirection.kt\ncom/kubi/resources/shimmer/mask/SkeletonShimmerDirection$Companion\n*L\n18#1:22,2\n*E\n"
    }
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
    invoke-direct {p0}, Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final valueOf(I)Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;->values()[Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;

    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    :goto_0
    if-ge v2, v1, :cond_1

    .line 9
    .line 10
    aget-object v3, v0, v2

    .line 11
    .line 12
    .line 13
    invoke-static {v3}, Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;->access$getStableId$p(Lcom/kubi/resources/shimmer/mask/SkeletonShimmerDirection;)I

    .line 14
    move-result v4

    .line 15
    .line 16
    if-ne v4, p1, :cond_0

    .line 17
    return-object v3

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 p1, 0x0

    .line 22
    return-object p1
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
    .line 44
    .line 45
.end method
