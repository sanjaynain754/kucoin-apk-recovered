.class public final Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config$Companion;
.super Ljava/lang/Object;
.source "GiftAbstractPathAnimator.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config$Companion;",
        "",
        "<init>",
        "()V",
        "fromTypeArray",
        "Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;",
        "typedArray",
        "Landroid/content/res/TypedArray;",
        "x",
        "",
        "y",
        "pointX",
        "",
        "heartWidth",
        "heartHeight",
        "isRTL",
        "",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
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
    invoke-direct {p0}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config$Companion;-><init>()V

    return-void
.end method

.method public static synthetic fromTypeArray$default(Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config$Companion;Landroid/content/res/TypedArray;FFIIIZILjava/lang/Object;)Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;
    .locals 9

    .line 1
    .line 2
    and-int/lit8 v0, p8, 0x40

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v8, v0

    .line 7
    :goto_0
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move v3, p2

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    move v6, p5

    .line 13
    move v7, p6

    .line 14
    goto :goto_1

    .line 15
    .line 16
    :cond_0
    move/from16 v8, p7

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :goto_1
    invoke-virtual/range {v1 .. v8}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config$Companion;->fromTypeArray(Landroid/content/res/TypedArray;FFIIIZ)Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 21
    move-result-object p0

    .line 22
    return-object p0
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
.end method


# virtual methods
.method public final fromTypeArray(Landroid/content/res/TypedArray;FFIIIZ)Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;
    .locals 3
    .param p1    # Landroid/content/res/TypedArray;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "typedArray"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    sget v2, Lcom/trtc/uikit/livekit/R$styleable;->LiveKitGiftHeartLayout_initX:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 20
    move-result p2

    .line 21
    float-to-int p2, p2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->r(I)V

    .line 25
    .line 26
    sget p2, Lcom/trtc/uikit/livekit/R$styleable;->LiveKitGiftHeartLayout_initY:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 30
    move-result p2

    .line 31
    float-to-int p2, p2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p2}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->s(I)V

    .line 35
    .line 36
    sget p2, Lcom/trtc/uikit/livekit/R$styleable;->LiveKitGiftHeartLayout_xRand:I

    .line 37
    .line 38
    sget p3, Lcom/trtc/uikit/livekit/R$dimen;->gift_heart_anim_bezier_x_rand:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 42
    move-result p3

    .line 43
    int-to-float p3, p3

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 47
    move-result p2

    .line 48
    float-to-int p2, p2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p2}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->v(I)V

    .line 52
    .line 53
    sget p2, Lcom/trtc/uikit/livekit/R$styleable;->LiveKitGiftHeartLayout_animLength:I

    .line 54
    .line 55
    sget p3, Lcom/trtc/uikit/livekit/R$dimen;->gift_heart_anim_length:I

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 59
    move-result p3

    .line 60
    int-to-float p3, p3

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 64
    move-result p2

    .line 65
    float-to-int p2, p2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p2}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->m(I)V

    .line 69
    .line 70
    sget p2, Lcom/trtc/uikit/livekit/R$styleable;->LiveKitGiftHeartLayout_animLengthRand:I

    .line 71
    .line 72
    sget p3, Lcom/trtc/uikit/livekit/R$dimen;->gift_heart_anim_length_rand:I

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 76
    move-result p3

    .line 77
    int-to-float p3, p3

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 81
    move-result p2

    .line 82
    float-to-int p2, p2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p2}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->n(I)V

    .line 86
    .line 87
    sget p2, Lcom/trtc/uikit/livekit/R$styleable;->LiveKitGiftHeartLayout_bezierFactor:I

    .line 88
    .line 89
    sget p3, Lcom/trtc/uikit/livekit/R$integer;->gift_heart_anim_bezier_factor:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getInteger(I)I

    .line 93
    move-result p3

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 97
    move-result p2

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, p2}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->o(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p4}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->u(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p5}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->q(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p6}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->p(I)V

    .line 110
    .line 111
    sget p2, Lcom/trtc/uikit/livekit/R$styleable;->LiveKitGiftHeartLayout_anim_duration:I

    .line 112
    .line 113
    sget p3, Lcom/trtc/uikit/livekit/R$integer;->gift_heart_anim_duration:I

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getInteger(I)I

    .line 117
    move-result p3

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 121
    move-result p1

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->l(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p7}, Lcom/trtc/uikit/livekit/component/gift/view/like/GiftAbstractPathAnimator$Config;->t(Z)V

    .line 128
    return-object v0
.end method
