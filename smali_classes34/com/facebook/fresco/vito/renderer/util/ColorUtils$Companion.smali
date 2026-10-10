.class public final Lcom/facebook/fresco/vito/renderer/util/ColorUtils$Companion;
.super Ljava/lang/Object;
.source "ColorUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "com/facebook/fresco/vito/renderer/util/ColorUtils$Companion",
        "",
        "<init>",
        "()V",
        "",
        "color",
        "alpha",
        "multiplyColorAlpha",
        "(II)I",
        "renderer_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
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
    invoke-direct {p0}, Lcom/facebook/fresco/vito/renderer/util/ColorUtils$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final multiplyColorAlpha(II)I
    .locals 2

    .line 1
    .line 2
    .line 3
    const v0, 0xffffff

    .line 4
    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    const/16 v1, 0xff

    .line 8
    .line 9
    if-eq p2, v1, :cond_0

    .line 10
    .line 11
    shr-int/lit8 v1, p2, 0x7

    .line 12
    add-int/2addr p2, v1

    .line 13
    .line 14
    ushr-int/lit8 v1, p1, 0x18

    .line 15
    mul-int/2addr v1, p2

    .line 16
    .line 17
    shr-int/lit8 p2, v1, 0x8

    .line 18
    .line 19
    shl-int/lit8 p2, p2, 0x18

    .line 20
    and-int/2addr p1, v0

    .line 21
    or-int/2addr p1, p2

    .line 22
    :cond_0
    return p1

    .line 23
    :cond_1
    and-int/2addr p1, v0

    .line 24
    return p1
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
.end method
