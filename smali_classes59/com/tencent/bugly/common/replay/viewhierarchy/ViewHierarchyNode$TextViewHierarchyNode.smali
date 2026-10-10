.class public final Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;
.super Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TextViewHierarchyNode"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;",
        "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;",
        "layout",
        "Lcom/tencent/bugly/common/replay/tool/TextLayout;",
        "dominantColor",
        "",
        "paddingLeft",
        "paddingTop",
        "x",
        "",
        "y",
        "width",
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
        "(Lcom/tencent/bugly/common/replay/tool/TextLayout;Ljava/lang/Integer;IIFFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V",
        "getDominantColor",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getLayout",
        "()Lcom/tencent/bugly/common/replay/tool/TextLayout;",
        "getPaddingLeft",
        "()I",
        "getPaddingTop",
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


# instance fields
.field private final dominantColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final layout:Lcom/tencent/bugly/common/replay/tool/TextLayout;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final paddingLeft:I

.field private final paddingTop:I


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/common/replay/tool/TextLayout;Ljava/lang/Integer;IIFFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V
    .locals 13
    .param p1    # Lcom/tencent/bugly/common/replay/tool/TextLayout;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v12, 0x0

    move-object v0, p0

    move/from16 v1, p5

    move/from16 v2, p6

    move/from16 v3, p7

    move/from16 v4, p8

    move/from16 v5, p9

    move/from16 v6, p10

    move-object/from16 v7, p11

    move/from16 v8, p12

    move/from16 v9, p13

    move/from16 v10, p14

    move-object/from16 v11, p15

    .line 2
    invoke-direct/range {v0 .. v12}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;-><init>(FFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->layout:Lcom/tencent/bugly/common/replay/tool/TextLayout;

    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->dominantColor:Ljava/lang/Integer;

    move/from16 p1, p3

    .line 5
    iput p1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->paddingLeft:I

    move/from16 p1, p4

    .line 6
    iput p1, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->paddingTop:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/bugly/common/replay/tool/TextLayout;Ljava/lang/Integer;IIFFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p16

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move v6, v3

    goto :goto_2

    :cond_2
    move/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    move v7, v3

    goto :goto_3

    :cond_3
    move/from16 v7, p4

    :goto_3
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_4

    move-object v14, v2

    goto :goto_4

    :cond_4
    move-object/from16 v14, p11

    :goto_4
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_5

    move v15, v3

    goto :goto_5

    :cond_5
    move/from16 v15, p12

    :goto_5
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_6

    move/from16 v16, v3

    goto :goto_6

    :cond_6
    move/from16 v16, p13

    :goto_6
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_7

    move/from16 v17, v3

    goto :goto_7

    :cond_7
    move/from16 v17, p14

    :goto_7
    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_8

    move-object/from16 v18, v2

    :goto_8
    move-object/from16 v3, p0

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    move/from16 v13, p10

    goto :goto_9

    :cond_8
    move-object/from16 v18, p15

    goto :goto_8

    .line 1
    :goto_9
    invoke-direct/range {v3 .. v18}, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;-><init>(Lcom/tencent/bugly/common/replay/tool/TextLayout;Ljava/lang/Integer;IIFFIIFILcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;ZZZLandroid/graphics/Rect;)V

    return-void
.end method


# virtual methods
.method public final getDominantColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->dominantColor:Ljava/lang/Integer;

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

.method public final getLayout()Lcom/tencent/bugly/common/replay/tool/TextLayout;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->layout:Lcom/tencent/bugly/common/replay/tool/TextLayout;

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

.method public final getPaddingLeft()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->paddingLeft:I

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

.method public final getPaddingTop()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode$TextViewHierarchyNode;->paddingTop:I

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
