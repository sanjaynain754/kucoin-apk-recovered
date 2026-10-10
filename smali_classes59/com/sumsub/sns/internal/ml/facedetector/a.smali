.class public final Lcom/sumsub/sns/internal/ml/facedetector/a;
.super Lcom/sumsub/sns/internal/ml/core/h;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final g:Lcom/sumsub/sns/internal/ml/facedetector/models/f;

.field public h:[[[F

.field public i:[[[F

.field public j:Ljava/util/ArrayList;

.field public k:Lcom/sumsub/sns/internal/ml/facedetector/models/h;

.field public l:Lcom/sumsub/sns/internal/ml/facedetector/utils/b;

.field public final m:Lcom/sumsub/sns/internal/ml/core/a;

.field public final n:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/sumsub/sns/internal/ml/facedetector/models/f;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "MlSolution.TfFaceDetection"

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/sumsub/sns/internal/ml/core/h;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->g:Lcom/sumsub/sns/internal/ml/facedetector/models/f;

    .line 8
    .line 9
    new-instance p2, Lcom/sumsub/sns/internal/ml/core/a;

    .line 10
    .line 11
    .line 12
    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/ml/core/a;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    iput-object p2, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->m:Lcom/sumsub/sns/internal/ml/core/a;

    .line 15
    .line 16
    const-string p1, "Face detector"

    .line 17
    .line 18
    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->n:Ljava/lang/String;

    .line 19
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    .line 1
    move-object/from16 v1, p1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 2
    iget-object v2, v0, Lcom/sumsub/sns/internal/ml/facedetector/a;->l:Lcom/sumsub/sns/internal/ml/facedetector/utils/b;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    .line 3
    :cond_0
    new-instance v4, Landroid/util/Size;

    .line 4
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    .line 5
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 6
    invoke-direct {v4, v5, v1}, Landroid/util/Size;-><init>(II)V

    .line 7
    iget-object v1, v0, Lcom/sumsub/sns/internal/ml/facedetector/a;->k:Lcom/sumsub/sns/internal/ml/facedetector/models/h;

    if-nez v1, :cond_1

    move-object v1, v3

    .line 8
    :cond_1
    iget-object v5, v0, Lcom/sumsub/sns/internal/ml/facedetector/a;->i:[[[F

    if-nez v5, :cond_2

    move-object v5, v3

    .line 9
    :cond_2
    iget-object v6, v0, Lcom/sumsub/sns/internal/ml/facedetector/a;->h:[[[F

    if-nez v6, :cond_3

    move-object v6, v3

    .line 10
    :cond_3
    iget-object v7, v0, Lcom/sumsub/sns/internal/ml/facedetector/a;->j:Ljava/util/ArrayList;

    if-nez v7, :cond_4

    goto :goto_0

    :cond_4
    move-object v3, v7

    .line 11
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    array-length v2, v6

    const/4 v7, 0x1

    if-ne v2, v7, :cond_15

    const/4 v2, 0x0

    .line 13
    aget-object v8, v6, v2

    array-length v9, v8

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v10, 0x380

    if-ne v9, v10, :cond_15

    .line 15
    aget-object v8, v8, v2

    array-length v8, v8

    const/16 v9, 0x10

    if-ne v8, v9, :cond_15

    .line 16
    array-length v8, v5

    if-ne v8, v7, :cond_14

    .line 17
    aget-object v8, v5, v2

    array-length v11, v8

    if-ne v11, v10, :cond_14

    .line 18
    aget-object v8, v8, v2

    array-length v8, v8

    if-ne v8, v7, :cond_14

    .line 19
    iget v8, v1, Lcom/sumsub/sns/internal/ml/facedetector/models/h;->b:I

    const/4 v11, -0x1

    if-gtz v8, :cond_6

    if-ne v8, v11, :cond_5

    goto :goto_1

    .line 20
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "MaxNumberOfFaces must be greater than 0 or -1"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 21
    :cond_6
    :goto_1
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    move v12, v2

    :goto_2
    if-ge v12, v10, :cond_a

    .line 22
    aget-object v14, v5, v2

    aget-object v14, v14, v12

    aget v14, v14, v2

    move/from16 p2, v12

    float-to-double v11, v14

    const-wide/high16 v15, -0x3fa7000000000000L    # -100.0

    cmpg-double v11, v11, v15

    move v12, v14

    const/high16 p3, 0x3f800000    # 1.0f

    const-wide/high16 v13, 0x4059000000000000L    # 100.0

    if-gez v11, :cond_7

    double-to-float v11, v13

    neg-float v11, v11

    move v12, v11

    :cond_7
    move v15, v2

    move-object v11, v3

    float-to-double v2, v12

    cmpl-double v2, v2, v13

    if-lez v2, :cond_8

    double-to-float v12, v13

    :cond_8
    float-to-double v2, v12

    neg-double v2, v2

    .line 23
    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    move-result-wide v2

    double-to-float v2, v2

    add-float v2, v2, p3

    div-float v13, p3, v2

    const/4 v2, 0x1

    cmpl-float v3, v13, v2

    if-lez v3, :cond_9

    goto :goto_3

    :cond_9
    move v13, v2

    .line 24
    :goto_3
    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, p2, 0x1

    move-object v3, v11

    move v2, v15

    const/4 v11, -0x1

    goto :goto_2

    :cond_a
    move v15, v2

    move-object v11, v3

    const/high16 p3, 0x3f800000    # 1.0f

    .line 25
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move v3, v15

    :goto_4
    if-ge v3, v10, :cond_e

    .line 26
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    float-to-double v12, v5

    move-object v5, v11

    .line 27
    iget-wide v10, v1, Lcom/sumsub/sns/internal/ml/facedetector/models/h;->a:D

    cmpg-double v10, v12, v10

    if-gez v10, :cond_b

    move/from16 v16, v7

    goto/16 :goto_7

    .line 28
    :cond_b
    aget-object v10, v6, v15

    .line 29
    new-array v11, v9, [F

    .line 30
    aget-object v12, v10, v3

    aget v13, v12, v15

    .line 31
    aget v14, v12, v7

    move/from16 v16, v7

    const/4 v7, 0x2

    .line 32
    aget v17, v12, v7

    const/16 v18, 0x3

    .line 33
    aget v12, v12, v18

    const/high16 v19, 0x43000000    # 128.0f

    div-float v13, v13, v19

    .line 34
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v9, v20

    check-cast v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;

    .line 35
    iget v9, v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;->c:F

    mul-float/2addr v13, v9

    .line 36
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;

    .line 37
    iget v9, v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;->a:F

    add-float/2addr v13, v9

    div-float v14, v14, v19

    .line 38
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;

    .line 39
    iget v9, v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;->d:F

    mul-float/2addr v14, v9

    .line 40
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;

    .line 41
    iget v9, v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;->b:F

    add-float/2addr v14, v9

    div-float v12, v12, v19

    .line 42
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;

    .line 43
    iget v9, v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;->d:F

    mul-float/2addr v12, v9

    div-float v17, v17, v19

    .line 44
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;

    .line 45
    iget v9, v9, Lcom/sumsub/sns/internal/ml/facedetector/models/a;->c:F

    mul-float v17, v17, v9

    int-to-float v9, v7

    div-float/2addr v12, v9

    sub-float v20, v14, v12

    div-float v17, v17, v9

    sub-float v9, v13, v17

    add-float/2addr v14, v12

    add-float v13, v13, v17

    .line 46
    aput v20, v11, v15

    .line 47
    aput v9, v11, v16

    .line 48
    aput v14, v11, v7

    .line 49
    aput v13, v11, v18

    move v9, v15

    :goto_5
    const/4 v12, 0x6

    if-ge v9, v12, :cond_c

    mul-int/lit8 v12, v9, 0x2

    add-int/lit8 v13, v12, 0x4

    .line 50
    aget-object v14, v10, v3

    aget v17, v14, v13

    add-int/lit8 v12, v12, 0x5

    .line 51
    aget v14, v14, v12

    div-float v17, v17, v19

    .line 52
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    move/from16 v21, v7

    move-object/from16 v7, v20

    check-cast v7, Lcom/sumsub/sns/internal/ml/facedetector/models/a;

    .line 53
    iget v7, v7, Lcom/sumsub/sns/internal/ml/facedetector/models/a;->c:F

    mul-float v17, v17, v7

    .line 54
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sumsub/sns/internal/ml/facedetector/models/a;

    .line 55
    iget v7, v7, Lcom/sumsub/sns/internal/ml/facedetector/models/a;->a:F

    add-float v17, v17, v7

    .line 56
    aput v17, v11, v13

    div-float v14, v14, v19

    .line 57
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sumsub/sns/internal/ml/facedetector/models/a;

    .line 58
    iget v7, v7, Lcom/sumsub/sns/internal/ml/facedetector/models/a;->d:F

    mul-float/2addr v14, v7

    .line 59
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sumsub/sns/internal/ml/facedetector/models/a;

    .line 60
    iget v7, v7, Lcom/sumsub/sns/internal/ml/facedetector/models/a;->b:F

    add-float/2addr v14, v7

    .line 61
    aput v14, v11, v12

    add-int/lit8 v9, v9, 0x1

    move/from16 v7, v21

    goto :goto_5

    :cond_c
    move/from16 v21, v7

    .line 62
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    .line 63
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x4

    :goto_6
    const/16 v12, 0xf

    if-ge v10, v12, :cond_d

    .line 64
    new-instance v12, Landroid/graphics/PointF;

    aget v13, v11, v10

    add-int/lit8 v14, v10, 0x1

    aget v14, v11, v14

    invoke-direct {v12, v13, v14}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x2

    goto :goto_6

    .line 65
    :cond_d
    new-instance v10, Lcom/sumsub/sns/internal/ml/facedetector/models/c;

    .line 66
    new-instance v12, Landroid/graphics/RectF;

    aget v13, v11, v16

    aget v14, v11, v15

    aget v15, v11, v18

    aget v11, v11, v21

    invoke-direct {v12, v13, v14, v15, v11}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 67
    invoke-direct {v10, v7, v12, v9}, Lcom/sumsub/sns/internal/ml/facedetector/models/c;-><init>(FLandroid/graphics/RectF;Ljava/util/ArrayList;)V

    .line 68
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_7
    add-int/lit8 v3, v3, 0x1

    move-object v11, v5

    move/from16 v7, v16

    const/16 v9, 0x10

    const/16 v10, 0x380

    const/4 v15, 0x0

    goto/16 :goto_4

    .line 69
    :cond_e
    invoke-static {v2}, Lcom/sumsub/sns/internal/ml/facedetector/utils/b;->a(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v2

    .line 70
    iget v1, v1, Lcom/sumsub/sns/internal/ml/facedetector/models/h;->b:I

    const/4 v3, -0x1

    if-eq v1, v3, :cond_f

    .line 71
    invoke-static {v2, v1}, Lcom/sumsub/sns/internal/ml/facedetector/utils/b;->a(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    .line 72
    :cond_f
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v3

    if-ne v1, v3, :cond_10

    goto/16 :goto_a

    .line 73
    :cond_10
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v3

    const/high16 v5, 0x40000000    # 2.0f

    const/4 v6, 0x0

    if-ge v1, v3, :cond_11

    .line 74
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v1, v3

    sub-float v13, p3, v1

    div-float/2addr v13, v5

    .line 75
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v1, v3

    move v3, v1

    move/from16 v1, p3

    goto :goto_8

    .line 76
    :cond_11
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v1, v3

    sub-float v13, p3, v1

    div-float/2addr v13, v5

    .line 77
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v1, v3

    move v3, v13

    move v13, v6

    move v6, v3

    move/from16 v3, p3

    .line 78
    :goto_8
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/internal/ml/facedetector/models/c;

    .line 79
    iget-object v7, v5, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->b:Landroid/graphics/RectF;

    .line 80
    iget v8, v7, Landroid/graphics/RectF;->left:F

    sub-float/2addr v8, v13

    mul-float/2addr v8, v3

    .line 81
    iput v8, v7, Landroid/graphics/RectF;->left:F

    .line 82
    iget v8, v7, Landroid/graphics/RectF;->right:F

    sub-float/2addr v8, v13

    mul-float/2addr v8, v3

    .line 83
    iput v8, v7, Landroid/graphics/RectF;->right:F

    .line 84
    iget v8, v7, Landroid/graphics/RectF;->top:F

    sub-float/2addr v8, v6

    mul-float/2addr v8, v1

    .line 85
    iput v8, v7, Landroid/graphics/RectF;->top:F

    .line 86
    iget v8, v7, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v8, v6

    mul-float/2addr v8, v1

    .line 87
    iput v8, v7, Landroid/graphics/RectF;->bottom:F

    .line 88
    iget-object v7, v5, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->c:Ljava/util/ArrayList;

    .line 89
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_9
    if-ge v8, v7, :cond_12

    .line 90
    iget-object v9, v5, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->c:Ljava/util/ArrayList;

    .line 91
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/graphics/PointF;

    iget v10, v9, Landroid/graphics/PointF;->x:F

    sub-float/2addr v10, v13

    iput v10, v9, Landroid/graphics/PointF;->x:F

    .line 92
    iget-object v9, v5, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->c:Ljava/util/ArrayList;

    .line 93
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/graphics/PointF;

    iget v10, v9, Landroid/graphics/PointF;->x:F

    mul-float/2addr v10, v3

    iput v10, v9, Landroid/graphics/PointF;->x:F

    .line 94
    iget-object v9, v5, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->c:Ljava/util/ArrayList;

    .line 95
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/graphics/PointF;

    iget v10, v9, Landroid/graphics/PointF;->y:F

    sub-float/2addr v10, v6

    iput v10, v9, Landroid/graphics/PointF;->y:F

    .line 96
    iget-object v9, v5, Lcom/sumsub/sns/internal/ml/facedetector/models/c;->c:Ljava/util/ArrayList;

    .line 97
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/graphics/PointF;

    iget v10, v9, Landroid/graphics/PointF;->y:F

    mul-float/2addr v10, v1

    iput v10, v9, Landroid/graphics/PointF;->y:F

    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    .line 98
    :cond_13
    :goto_a
    new-instance v1, Lcom/sumsub/sns/internal/ml/facedetector/models/g;

    invoke-direct {v1, v2}, Lcom/sumsub/sns/internal/ml/facedetector/models/g;-><init>(Ljava/util/List;)V

    return-object v1

    .line 99
    :cond_14
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "RawScores dimensions is not correct"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 100
    :cond_15
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "RawBoxes dimensions is not correct"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final a(Lorg/tensorflow/lite/InterpreterApi;)V
    .locals 10

    const/4 v0, 0x0

    .line 122
    invoke-interface {p1, v0}, Lorg/tensorflow/lite/InterpreterApi;->getOutputTensor(I)Lorg/tensorflow/lite/Tensor;

    move-result-object v1

    invoke-interface {v1}, Lorg/tensorflow/lite/Tensor;->shape()[I

    move-result-object v1

    .line 123
    aget v2, v1, v0

    new-array v3, v2, [[[F

    move v4, v0

    :goto_0
    const/4 v5, 0x2

    const/4 v6, 0x1

    if-ge v4, v2, :cond_1

    .line 124
    aget v6, v1, v6

    new-array v7, v6, [[F

    move v8, v0

    :goto_1
    if-ge v8, v6, :cond_0

    .line 125
    aget v9, v1, v5

    new-array v9, v9, [F

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 126
    :cond_0
    aput-object v7, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 127
    :cond_1
    iput-object v3, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->h:[[[F

    .line 128
    invoke-interface {p1, v6}, Lorg/tensorflow/lite/InterpreterApi;->getOutputTensor(I)Lorg/tensorflow/lite/Tensor;

    move-result-object p1

    invoke-interface {p1}, Lorg/tensorflow/lite/Tensor;->shape()[I

    move-result-object p1

    .line 129
    aget v1, p1, v0

    .line 130
    new-array v2, v1, [[[F

    move v3, v0

    :goto_2
    if-ge v3, v1, :cond_3

    .line 131
    aget v4, p1, v6

    new-array v7, v4, [[F

    move v8, v0

    :goto_3
    if-ge v8, v4, :cond_2

    .line 132
    aget v9, p1, v5

    new-array v9, v9, [F

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 133
    :cond_2
    aput-object v7, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 134
    :cond_3
    iput-object v2, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->i:[[[F

    .line 135
    new-instance p1, Lcom/sumsub/sns/internal/ml/facedetector/models/b;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/ml/facedetector/models/b;-><init>()V

    invoke-static {p1}, Lcom/sumsub/sns/internal/ml/facedetector/utils/a;->a(Lcom/sumsub/sns/internal/ml/facedetector/models/b;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->j:Ljava/util/ArrayList;

    .line 136
    new-instance p1, Lcom/sumsub/sns/internal/ml/facedetector/models/h;

    .line 137
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->g:Lcom/sumsub/sns/internal/ml/facedetector/models/f;

    .line 138
    iget v1, v0, Lcom/sumsub/sns/internal/ml/facedetector/models/f;->a:F

    float-to-double v1, v1

    .line 139
    iget v0, v0, Lcom/sumsub/sns/internal/ml/facedetector/models/f;->b:I

    .line 140
    invoke-direct {p1, v1, v2, v0}, Lcom/sumsub/sns/internal/ml/facedetector/models/h;-><init>(DI)V

    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->k:Lcom/sumsub/sns/internal/ml/facedetector/models/h;

    .line 141
    new-instance p1, Lcom/sumsub/sns/internal/ml/facedetector/utils/b;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/ml/facedetector/utils/b;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->l:Lcom/sumsub/sns/internal/ml/facedetector/utils/b;

    return-void
.end method

.method public final a(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5

    .line 101
    check-cast p1, Landroid/graphics/Bitmap;

    .line 102
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 103
    new-instance v1, Lcom/sumsub/sns/internal/ml/core/pipeline/b;

    invoke-direct {v1, v0, v0}, Lcom/sumsub/sns/internal/ml/core/pipeline/b;-><init>(II)V

    .line 104
    new-instance v0, Lcom/sumsub/sns/internal/ml/facedetector/pipeline/a;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/ml/facedetector/pipeline/a;-><init>()V

    .line 105
    invoke-virtual {v1, p1}, Lcom/sumsub/sns/internal/ml/core/pipeline/core/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/16 v1, 0x80

    const/4 v2, 0x0

    .line 106
    :try_start_0
    move-object v3, p1

    check-cast v3, Landroid/graphics/Bitmap;

    .line 107
    invoke-static {v3, v1, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 108
    :catch_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Runtime;->gc()V

    const-wide/16 v3, 0x64

    .line 109
    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 110
    invoke-static {}, Ljava/lang/System;->runFinalization()V

    .line 111
    check-cast p1, Landroid/graphics/Bitmap;

    .line 112
    invoke-static {p1, v1, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 113
    :goto_0
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/ml/core/pipeline/core/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 114
    check-cast p1, Lcom/sumsub/sns/internal/ml/core/buffer/a;

    .line 115
    iget-object v0, p1, Lcom/sumsub/sns/internal/ml/core/buffer/a;->b:[I

    .line 116
    array-length v1, v0

    const/4 v3, 0x1

    :goto_1
    if-ge v2, v1, :cond_0

    aget v4, v0, v2

    mul-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 117
    :cond_0
    sget-object v0, Lorg/tensorflow/lite/DataType;->FLOAT32:Lorg/tensorflow/lite/DataType;

    invoke-virtual {v0}, Lorg/tensorflow/lite/DataType;->byteSize()I

    move-result v0

    mul-int/2addr v0, v3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 118
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 119
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v1

    iget-object p1, p1, Lcom/sumsub/sns/internal/ml/core/buffer/a;->a:[F

    invoke-virtual {v1, p1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 120
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 121
    :catch_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final b()Lcom/sumsub/sns/internal/ml/core/c;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->m:Lcom/sumsub/sns/internal/ml/core/a;

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

.method public final c()Ljava/util/Map;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    move-result-object v0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->h:[[[F

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    move-object v1, v2

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    iget-object v3, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->i:[[[F

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v2, v3

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 38
    move-result-object v0

    .line 39
    return-object v0
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
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/ml/facedetector/a;->n:Ljava/lang/String;

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
