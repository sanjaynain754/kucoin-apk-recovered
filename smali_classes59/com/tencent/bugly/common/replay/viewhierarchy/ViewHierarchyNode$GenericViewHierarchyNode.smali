.class public final Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;
.super Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GenericViewHierarchyNode"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
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


# direct methods
.method public constructor <init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V
    .locals 13
    .param p7    # Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v12, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    .line 2
    invoke-direct/range {v0 .. v12}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;-><init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p13, p12, 0x40

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move-object p7, v0

    :cond_0
    and-int/lit16 p13, p12, 0x80

    const/4 v1, 0x0

    if-eqz p13, :cond_1

    move p8, v1

    :cond_1
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_2

    move p9, v1

    :cond_2
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_3

    move p10, v1

    :cond_3
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_4

    move-object p12, v0

    :goto_0
    move p11, p10

    move p10, p9

    move p9, p8

    move-object p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p12, p11

    goto :goto_0

    .line 1
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$GenericViewHierarchyNode;-><init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V

    return-void
.end method
