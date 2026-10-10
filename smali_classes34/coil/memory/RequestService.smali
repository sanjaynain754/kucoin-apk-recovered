.class public final Lcoil/memory/RequestService;
.super Ljava/lang/Object;
.source "RequestService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil/memory/RequestService$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcoil/memory/RequestService;",
        "",
        "Lb1/g;",
        "logger",
        "<init>",
        "(Lb1/g;)V",
        "Lcoil/memory/HardwareBitmapService;",
        "a",
        "Lcoil/memory/HardwareBitmapService;",
        "hardwareBitmapService",
        "b",
        "Companion",
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
.field public static final b:Lcoil/memory/RequestService$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:[Landroid/graphics/Bitmap$Config;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcoil/memory/HardwareBitmapService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcoil/memory/RequestService$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcoil/memory/RequestService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcoil/memory/RequestService;->b:Lcoil/memory/RequestService$Companion;

    .line 9
    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v1, 0x1a

    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    if-lt v0, v1, :cond_0

    .line 17
    const/4 v0, 0x2

    .line 18
    .line 19
    new-array v0, v0, [Landroid/graphics/Bitmap$Config;

    .line 20
    .line 21
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 22
    .line 23
    aput-object v1, v0, v3

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ls0/d;->a()Landroid/graphics/Bitmap$Config;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    aput-object v1, v0, v2

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    new-array v0, v2, [Landroid/graphics/Bitmap$Config;

    .line 33
    .line 34
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    aput-object v1, v0, v3

    .line 37
    .line 38
    :goto_0
    sput-object v0, Lcoil/memory/RequestService;->c:[Landroid/graphics/Bitmap$Config;

    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
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
.end method

.method public constructor <init>(Lb1/g;)V
    .locals 0
    .param p1    # Lb1/g;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object p1, Lcoil/memory/HardwareBitmapService;->a:Lcoil/memory/HardwareBitmapService$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcoil/memory/HardwareBitmapService$Companion;->invoke()Lcoil/memory/HardwareBitmapService;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iput-object p1, p0, Lcoil/memory/RequestService;->a:Lcoil/memory/HardwareBitmapService;

    .line 12
    return-void
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
