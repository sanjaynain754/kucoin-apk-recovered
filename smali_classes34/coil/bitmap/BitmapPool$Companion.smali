.class public final Lcoil/bitmap/BitmapPool$Companion;
.super Ljava/lang/Object;
.source "BitmapPool.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil/bitmap/BitmapPool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002\u00a2\u0006\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcoil/bitmap/BitmapPool$Companion;",
        "",
        "()V",
        "invoke",
        "Lcoil/bitmap/BitmapPool;",
        "maxSize",
        "",
        "create",
        "coil-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic a:Lcoil/bitmap/BitmapPool$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcoil/bitmap/BitmapPool$Companion;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcoil/bitmap/BitmapPool$Companion;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcoil/bitmap/BitmapPool$Companion;->a:Lcoil/bitmap/BitmapPool$Companion;

    .line 8
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public final create(I)Lcoil/bitmap/BitmapPool;
    .locals 7
    .annotation build Lkotlin/jvm/JvmName;
        name = "create"
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    new-instance p1, Ls0/b;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1}, Ls0/b;-><init>()V

    .line 8
    return-object p1

    .line 9
    .line 10
    :cond_0
    new-instance v0, Lcoil/bitmap/RealBitmapPool;

    .line 11
    .line 12
    const/16 v5, 0xe

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move v1, p1

    .line 18
    .line 19
    .line 20
    invoke-direct/range {v0 .. v6}, Lcoil/bitmap/RealBitmapPool;-><init>(ILjava/util/Set;Lcoil/bitmap/BitmapPoolStrategy;Lb1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    return-object v0
    .line 22
    .line 23
.end method
