.class public final Lcom/sumsub/sns/internal/ml/facedetector/utils/b;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/ml/facedetector/models/c;Lcom/sumsub/sns/internal/ml/facedetector/models/c;)I
    .locals 0

    .line 1
    iget p1, p1, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->a:F

    iget p0, p0, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->a:F

    .line 2
    invoke-static {p1, p0}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    return p0
.end method

.method public static final a(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 69
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static a(Ljava/util/ArrayList;)Ljava/util/List;
    .locals 17

    move-object/from16 v0, p0

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 4
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 7
    new-instance v4, Lcom/sumsub/sns/internal/ml/facedetector/utils/c;

    invoke-direct {v4}, Lcom/sumsub/sns/internal/ml/facedetector/utils/c;-><init>()V

    new-instance v5, Lcom/sumsub/sns/internal/ml/facedetector/utils/d;

    invoke-direct {v5, v4}, Lcom/sumsub/sns/internal/ml/facedetector/utils/d;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 8
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_a

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 10
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    const/4 v5, 0x0

    .line 12
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sumsub/sns/internal/ml/facedetector/models/c;

    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    move v8, v5

    :goto_1
    if-ge v8, v7, :cond_3

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v8, v8, 0x1

    check-cast v10, Lcom/sumsub/sns/internal/ml/facedetector/models/c;

    .line 14
    iget-object v11, v10, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->b:Landroid/graphics/RectF;

    .line 15
    iget-object v12, v6, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->b:Landroid/graphics/RectF;

    .line 16
    iget v13, v11, Landroid/graphics/RectF;->left:F

    iget v14, v12, Landroid/graphics/RectF;->left:F

    invoke-static {v13, v14}, Ljava/lang/Math;->max(FF)F

    move-result v13

    .line 17
    iget v14, v11, Landroid/graphics/RectF;->top:F

    iget v15, v12, Landroid/graphics/RectF;->top:F

    invoke-static {v14, v15}, Ljava/lang/Math;->max(FF)F

    move-result v14

    .line 18
    iget v15, v11, Landroid/graphics/RectF;->right:F

    iget v5, v12, Landroid/graphics/RectF;->right:F

    invoke-static {v15, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 19
    iget v15, v11, Landroid/graphics/RectF;->bottom:F

    iget v9, v12, Landroid/graphics/RectF;->bottom:F

    invoke-static {v15, v9}, Ljava/lang/Math;->min(FF)F

    move-result v9

    sub-float/2addr v9, v14

    const/4 v14, 0x0

    .line 20
    invoke-static {v14, v9}, Ljava/lang/Math;->max(FF)F

    move-result v9

    sub-float/2addr v5, v13

    .line 21
    invoke-static {v14, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    mul-float/2addr v5, v9

    .line 22
    iget v9, v11, Landroid/graphics/RectF;->right:F

    iget v13, v11, Landroid/graphics/RectF;->left:F

    sub-float/2addr v9, v13

    iget v13, v11, Landroid/graphics/RectF;->bottom:F

    iget v11, v11, Landroid/graphics/RectF;->top:F

    sub-float/2addr v13, v11

    mul-float/2addr v13, v9

    iget v9, v12, Landroid/graphics/RectF;->right:F

    iget v11, v12, Landroid/graphics/RectF;->left:F

    sub-float/2addr v9, v11

    iget v11, v12, Landroid/graphics/RectF;->bottom:F

    iget v12, v12, Landroid/graphics/RectF;->top:F

    sub-float/2addr v11, v12

    mul-float/2addr v11, v9

    add-float/2addr v11, v13

    sub-float/2addr v11, v5

    const/16 v16, 0x0

    cmpl-float v9, v11, v16

    if-lez v9, :cond_1

    div-float v9, v5, v11

    goto :goto_2

    :cond_1
    move/from16 v9, v16

    :goto_2
    const v5, 0x3e99999a    # 0.3f

    cmpl-float v5, v9, v5

    if-lez v5, :cond_2

    .line 23
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 24
    :cond_2
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    const/4 v5, 0x0

    goto :goto_1

    :cond_3
    const/16 v16, 0x0

    .line 25
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_8

    .line 26
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    .line 27
    new-instance v7, Ljava/util/ArrayList;

    .line 28
    iget-object v8, v6, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->c:Ljava/util/ArrayList;

    .line 29
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    iget-object v6, v6, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->c:Ljava/util/ArrayList;

    .line 31
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v6, :cond_4

    .line 32
    new-instance v9, Landroid/graphics/PointF;

    invoke-direct {v9}, Landroid/graphics/PointF;-><init>()V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 33
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    move/from16 v9, v16

    const/4 v8, 0x0

    :cond_5
    if-ge v8, v6, :cond_6

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v8, v8, 0x1

    check-cast v10, Lcom/sumsub/sns/internal/ml/facedetector/models/c;

    .line 34
    iget v11, v10, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->a:F

    add-float/2addr v9, v11

    .line 35
    iget v12, v5, Landroid/graphics/RectF;->top:F

    .line 36
    iget-object v13, v10, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->b:Landroid/graphics/RectF;

    .line 37
    iget v14, v13, Landroid/graphics/RectF;->top:F

    mul-float/2addr v14, v11

    add-float/2addr v14, v12

    iput v14, v5, Landroid/graphics/RectF;->top:F

    .line 38
    iget v12, v5, Landroid/graphics/RectF;->bottom:F

    iget v14, v13, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr v14, v11

    add-float/2addr v14, v12

    iput v14, v5, Landroid/graphics/RectF;->bottom:F

    .line 39
    iget v12, v5, Landroid/graphics/RectF;->left:F

    iget v14, v13, Landroid/graphics/RectF;->left:F

    mul-float/2addr v14, v11

    add-float/2addr v14, v12

    iput v14, v5, Landroid/graphics/RectF;->left:F

    .line 40
    iget v12, v5, Landroid/graphics/RectF;->right:F

    iget v13, v13, Landroid/graphics/RectF;->right:F

    mul-float/2addr v13, v11

    add-float/2addr v13, v12

    iput v13, v5, Landroid/graphics/RectF;->right:F

    .line 41
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_5
    if-ge v12, v11, :cond_5

    .line 42
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/graphics/PointF;

    iget v14, v13, Landroid/graphics/PointF;->x:F

    .line 43
    iget-object v15, v10, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->c:Ljava/util/ArrayList;

    .line 44
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/graphics/PointF;

    iget v15, v15, Landroid/graphics/PointF;->x:F

    move-object/from16 v16, v3

    .line 45
    iget v3, v10, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->a:F

    mul-float/2addr v15, v3

    add-float/2addr v15, v14

    .line 46
    iput v15, v13, Landroid/graphics/PointF;->x:F

    .line 47
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PointF;

    iget v13, v3, Landroid/graphics/PointF;->y:F

    .line 48
    iget-object v14, v10, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->c:Ljava/util/ArrayList;

    .line 49
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/graphics/PointF;

    iget v14, v14, Landroid/graphics/PointF;->y:F

    .line 50
    iget v15, v10, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->a:F

    mul-float/2addr v14, v15

    add-float/2addr v14, v13

    .line 51
    iput v14, v3, Landroid/graphics/PointF;->y:F

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v3, v16

    goto :goto_5

    :cond_6
    move-object/from16 v16, v3

    .line 52
    iget v3, v5, Landroid/graphics/RectF;->top:F

    div-float/2addr v3, v9

    iput v3, v5, Landroid/graphics/RectF;->top:F

    .line 53
    iget v3, v5, Landroid/graphics/RectF;->bottom:F

    div-float/2addr v3, v9

    iput v3, v5, Landroid/graphics/RectF;->bottom:F

    .line 54
    iget v3, v5, Landroid/graphics/RectF;->left:F

    div-float/2addr v3, v9

    iput v3, v5, Landroid/graphics/RectF;->left:F

    .line 55
    iget v3, v5, Landroid/graphics/RectF;->right:F

    div-float/2addr v3, v9

    iput v3, v5, Landroid/graphics/RectF;->right:F

    .line 56
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v3, :cond_7

    .line 57
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/PointF;

    iget v10, v8, Landroid/graphics/PointF;->x:F

    div-float/2addr v10, v9

    iput v10, v8, Landroid/graphics/PointF;->x:F

    .line 58
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/PointF;

    iget v10, v8, Landroid/graphics/PointF;->y:F

    div-float/2addr v10, v9

    iput v10, v8, Landroid/graphics/PointF;->y:F

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    .line 59
    :cond_7
    new-instance v6, Lcom/sumsub/sns/internal/ml/facedetector/models/c;

    .line 60
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v9, v3

    .line 61
    invoke-direct {v6, v9, v5, v7}, Lcom/sumsub/sns/internal/ml/facedetector/models/c;-><init>(FLandroid/graphics/RectF;Ljava/util/ArrayList;)V

    goto :goto_7

    :cond_8
    move-object/from16 v16, v3

    .line 62
    :goto_7
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v4, v3, :cond_9

    goto :goto_8

    .line 64
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 65
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object/from16 v3, v16

    goto/16 :goto_0

    :cond_a
    :goto_8
    return-object v1
.end method

.method public static a(Ljava/util/List;I)Ljava/util/List;
    .locals 2

    .line 66
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 67
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/ml/facedetector/utils/e;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/ml/facedetector/utils/e;-><init>()V

    new-instance v1, Lcom/sumsub/sns/internal/ml/facedetector/utils/f;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/ml/facedetector/utils/f;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->sortWith(Ljava/util/List;Ljava/util/Comparator;)V

    .line 68
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v0, 0x0

    invoke-interface {p0, v0, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/ml/facedetector/models/c;Lcom/sumsub/sns/internal/ml/facedetector/models/c;)I
    .locals 0

    .line 1
    iget p1, p1, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->a:F

    iget p0, p0, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->a:F

    .line 2
    invoke-static {p1, p0}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    return p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 3
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method
