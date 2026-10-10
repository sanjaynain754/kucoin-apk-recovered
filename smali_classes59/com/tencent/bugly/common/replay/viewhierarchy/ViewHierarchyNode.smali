.class public abstract Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;,
        Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;,
        Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;,
        Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;,
        Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 32\u00020\u0001:\u000534567Bm\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000H\u0002J\u000e\u0010,\u001a\u00020\u000c2\u0006\u0010*\u001a\u00020\u0000J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000cJ\u001a\u00100\u001a\u00020.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000c02R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0019R\u001a\u0010\r\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001b\u0082\u0001\u000389:\u00a8\u0006;"
    }
    d2 = {
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
        "",
        "x",
        "",
        "y",
        "width",
        "",
        "height",
        "elevation",
        "distance",
        "parent",
        "shouldMask",
        "",
        "isImportantForContentCapture",
        "isVisible",
        "visibleRect",
        "Landroid/graphics/Rect;",
        "(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V",
        "children",
        "",
        "getChildren",
        "()Ljava/util/List;",
        "setChildren",
        "(Ljava/util/List;)V",
        "getDistance",
        "()I",
        "getElevation",
        "()F",
        "getHeight",
        "()Z",
        "setImportantForContentCapture",
        "(Z)V",
        "getParent",
        "()Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
        "getShouldMask",
        "getVisibleRect",
        "()Landroid/graphics/Rect;",
        "getWidth",
        "getX",
        "getY",
        "findLCA",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;",
        "node",
        "otherNode",
        "isObscured",
        "setImportantForCaptureToAncestors",
        "",
        "isImportant",
        "traverse",
        "callback",
        "Lkotlin/Function1;",
        "Companion",
        "GenericViewHierarchyNode",
        "ImageViewHierarchyNode",
        "LCAResult",
        "TextViewHierarchyNode",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$ImageViewHierarchyNode;",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final BUGLY_UNMASK_TAG:Ljava/lang/String; = "bugly-unmask"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private children:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final distance:I

.field private final elevation:F

.field private final height:I

.field private isImportantForContentCapture:Z

.field private final isVisible:Z

.field private final parent:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final shouldMask:Z

.field private final visibleRect:Landroid/graphics/Rect;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final width:I

.field private final x:F

.field private final y:F


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->Companion:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private constructor <init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->x:F

    .line 4
    iput p2, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->y:F

    .line 5
    iput p3, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->width:I

    .line 6
    iput p4, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->height:I

    .line 7
    iput p5, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->elevation:F

    .line 8
    iput p6, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->distance:I

    .line 9
    iput-object p7, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->parent:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 10
    iput-boolean p8, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->shouldMask:Z

    .line 11
    iput-boolean p9, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->isImportantForContentCapture:Z

    .line 12
    iput-boolean p10, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->isVisible:Z

    .line 13
    iput-object p11, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->visibleRect:Landroid/graphics/Rect;

    return-void
.end method

.method public synthetic constructor <init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v10, v2

    goto :goto_0

    :cond_0
    move-object/from16 v10, p7

    :goto_0
    and-int/lit16 v1, v0, 0x80

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    move v11, v3

    goto :goto_1

    :cond_1
    move/from16 v11, p8

    :goto_1
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_2

    move v12, v3

    goto :goto_2

    :cond_2
    move/from16 v12, p9

    :goto_2
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    move v13, v3

    goto :goto_3

    :cond_3
    move/from16 v13, p10

    :goto_3
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_4

    move-object v14, v2

    goto :goto_4

    :cond_4
    move-object/from16 v14, p11

    :goto_4
    const/4 v15, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    .line 14
    invoke-direct/range {v3 .. v15}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;-><init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;-><init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V

    return-void
.end method

.method public static final synthetic access$findLCA(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->findLCA(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method private final findLCA(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    move-object v0, p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    .line 12
    .line 13
    :goto_0
    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v2

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    move-object v2, p0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object v2, v1

    .line 20
    .line 21
    :goto_1
    iget-object v3, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->children:Ljava/util/List;

    .line 22
    .line 23
    if-eqz v3, :cond_5

    .line 24
    .line 25
    .line 26
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    move-result v4

    .line 35
    .line 36
    if-eqz v4, :cond_5

    .line 37
    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    check-cast v4, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 43
    .line 44
    .line 45
    invoke-direct {v4, p1, p2}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->findLCA(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;->getLca()Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 50
    move-result-object v6

    .line 51
    .line 52
    if-eqz v6, :cond_3

    .line 53
    return-object v5

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-virtual {v5}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;->getNodeSubtree()Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 57
    move-result-object v6

    .line 58
    .line 59
    if-eqz v6, :cond_4

    .line 60
    move-object v0, v4

    .line 61
    .line 62
    .line 63
    :cond_4
    invoke-virtual {v5}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;->getOtherNodeSubtree()Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 64
    move-result-object v5

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    move-object v2, v4

    .line 68
    goto :goto_2

    .line 69
    .line 70
    :cond_5
    if-eqz v0, :cond_6

    .line 71
    .line 72
    if-eqz v2, :cond_6

    .line 73
    move-object v1, p0

    .line 74
    .line 75
    :cond_6
    new-instance p1, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;

    .line 76
    .line 77
    .line 78
    invoke-direct {p1, v1, v0, v2}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$LCAResult;-><init>(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)V

    .line 79
    return-object p1
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
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method


# virtual methods
.method public final getChildren()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->children:Ljava/util/List;

    .line 3
    return-object v0
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
.end method

.method public final getDistance()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->distance:I

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
.end method

.method public final getElevation()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->elevation:F

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
.end method

.method public final getHeight()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->height:I

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
.end method

.method public final getParent()Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->parent:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 3
    return-object v0
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
.end method

.method public final getShouldMask()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->shouldMask:Z

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
.end method

.method public final getVisibleRect()Landroid/graphics/Rect;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->visibleRect:Landroid/graphics/Rect;

    .line 3
    return-object v0
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
.end method

.method public final getWidth()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->width:I

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
.end method

.method public final getX()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->x:F

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
.end method

.method public final getY()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->y:F

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
.end method

.method public final isImportantForContentCapture()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->isImportantForContentCapture:Z

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
.end method

.method public final isObscured(Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)Z
    .locals 2
    .param p1    # Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "node"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->parent:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p1, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->visibleRect:Landroid/graphics/Rect;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    .line 18
    :cond_0
    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 22
    .line 23
    new-instance v1, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, v0, p1, p0}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$isObscured$2;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->traverse(Lkotlin/jvm/functions/Function1;)V

    .line 30
    .line 31
    iget-boolean p1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 32
    return p1

    .line 33
    .line 34
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string v0, "This method should be called on the root node of the view hierarchy."

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    throw p1
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
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final isVisible()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->isVisible:Z

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
.end method

.method public final setChildren(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->children:Ljava/util/List;

    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final setImportantForCaptureToAncestors(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->parent:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 3
    .line 4
    :goto_0
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean p1, v0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->isImportantForContentCapture:Z

    .line 7
    .line 8
    iget-object v0, v0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->parent:Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-void
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
    .line 24
    .line 25
.end method

.method public final setImportantForContentCapture(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->isImportantForContentCapture:Z

    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final traverse(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "callback"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->children:Ljava/util/List;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    check-cast v1, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;->traverse(Lkotlin/jvm/functions/Function1;)V

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
.end method
