.class public final Lcom/tencent/liteav/videoproducer/capture/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/util/List;Lcom/tencent/liteav/base/util/l;II)Lcom/tencent/liteav/base/util/Size;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/liteav/base/util/Size;",
            ">;",
            "Lcom/tencent/liteav/base/util/l;",
            "II)",
            "Lcom/tencent/liteav/base/util/Size;"
        }
    .end annotation

    move-object/from16 v0, p1

    .line 1
    new-instance v1, Lcom/tencent/liteav/base/util/Size;

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-direct {v1, v2, v3}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "preview wanted: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " cameraRotation:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "CameraSupervisor"

    invoke-static {v3, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p0, :cond_0

    .line 3
    const-string v0, "findBestMatchedPreviewSize getPreviewSizes null"

    invoke-static {v3, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    .line 4
    :cond_0
    sget-object v2, Lcom/tencent/liteav/base/util/l;->b:Lcom/tencent/liteav/base/util/l;

    if-eq v0, v2, :cond_1

    sget-object v2, Lcom/tencent/liteav/base/util/l;->d:Lcom/tencent/liteav/base/util/l;

    if-ne v0, v2, :cond_2

    .line 5
    :cond_1
    invoke-virtual {v1}, Lcom/tencent/liteav/base/util/Size;->swap()V

    .line 6
    :cond_2
    invoke-virtual {v1}, Lcom/tencent/liteav/base/util/Size;->aspectRatio()D

    move-result-wide v4

    .line 7
    new-instance v0, Lcom/tencent/liteav/base/util/Size;

    const/16 v2, 0x280

    invoke-direct {v0, v2, v2}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    .line 8
    iget v2, v1, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v6, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    if-gt v2, v6, :cond_3

    iget v7, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    iget v8, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    if-gt v7, v8, :cond_3

    .line 9
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/base/util/Size;->set(Lcom/tencent/liteav/base/util/Size;)V

    goto :goto_0

    .line 10
    :cond_3
    iget v7, v1, Lcom/tencent/liteav/base/util/Size;->height:I

    if-le v2, v7, :cond_4

    mul-int/2addr v6, v7

    .line 11
    div-int/2addr v6, v2

    iput v6, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    goto :goto_0

    .line 12
    :cond_4
    iget v6, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    mul-int/2addr v6, v2

    div-int/2addr v6, v7

    iput v6, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    .line 13
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const-wide v8, 0x7fffffffffffffffL

    move-wide v10, v8

    :cond_5
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/tencent/liteav/base/util/Size;

    .line 16
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, ", "

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    iget v13, v12, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v14, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    if-lt v13, v14, :cond_7

    iget v13, v12, Lcom/tencent/liteav/base/util/Size;->height:I

    iget v14, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    if-ge v13, v14, :cond_6

    goto :goto_2

    .line 18
    :cond_6
    invoke-virtual {v12}, Lcom/tencent/liteav/base/util/Size;->aspectRatio()D

    move-result-wide v13

    sub-double/2addr v13, v4

    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    move-result-wide v13

    const-wide/high16 v15, 0x4024000000000000L    # 10.0

    mul-double/2addr v13, v15

    invoke-static {v13, v14}, Ljava/lang/Math;->round(D)J

    move-result-wide v13

    goto :goto_3

    :cond_7
    :goto_2
    move-wide v13, v8

    :goto_3
    cmp-long v15, v13, v10

    if-gez v15, :cond_8

    .line 19
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 20
    invoke-interface {v2, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-wide v10, v13

    goto :goto_1

    :cond_8
    if-nez v15, :cond_5

    .line 21
    invoke-interface {v2, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 22
    :cond_9
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v6, "support preview size list: "

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-static {}, Lcom/tencent/liteav/videoproducer/capture/d;->a()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v0, 0x0

    .line 24
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/liteav/base/util/Size;

    .line 25
    invoke-virtual {v1}, Lcom/tencent/liteav/base/util/Size;->getArea()I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    .line 26
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-wide v6, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :cond_a
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/tencent/liteav/base/util/Size;

    .line 27
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string/jumbo v10, "size in same buck "

    invoke-virtual {v10, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    invoke-virtual {v8}, Lcom/tencent/liteav/base/util/Size;->aspectRatio()D

    move-result-wide v9

    cmpl-double v9, v4, v9

    if-lez v9, :cond_b

    .line 29
    iget v9, v8, Lcom/tencent/liteav/base/util/Size;->width:I

    mul-int/2addr v9, v9

    mul-int/lit16 v9, v9, 0x3e8

    int-to-double v9, v9

    div-double/2addr v9, v4

    goto :goto_5

    :cond_b
    iget v9, v8, Lcom/tencent/liteav/base/util/Size;->height:I

    mul-int/2addr v9, v9

    int-to-double v9, v9

    mul-double/2addr v9, v4

    const-wide v11, 0x408f400000000000L    # 1000.0

    mul-double/2addr v9, v11

    :goto_5
    int-to-double v11, v1

    div-double v13, v9, v11

    const-wide v15, 0x3feccccccccccccdL    # 0.9

    cmpl-double v13, v13, v15

    if-ltz v13, :cond_a

    sub-double/2addr v9, v11

    .line 30
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    move-result-wide v11

    cmpg-double v11, v11, v6

    if-gez v11, :cond_a

    .line 31
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    move-object v0, v8

    goto :goto_4

    .line 32
    :cond_c
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "best match preview size "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    new-instance v1, Lcom/tencent/liteav/base/util/Size;

    iget v2, v0, Lcom/tencent/liteav/base/util/Size;->width:I

    iget v0, v0, Lcom/tencent/liteav/base/util/Size;->height:I

    invoke-direct {v1, v2, v0}, Lcom/tencent/liteav/base/util/Size;-><init>(II)V

    return-object v1
.end method

.method public static a([Lcom/tencent/liteav/videoproducer/a/a;IZ)Lcom/tencent/liteav/videoproducer/a/a;
    .locals 7

    const/4 v0, 0x0

    if-eqz p0, :cond_9

    .line 34
    array-length v1, p0

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 35
    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p0, v3

    .line 36
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "supported fps range: "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "CameraSupervisor"

    invoke-static {v5, v4}, Lcom/tencent/liteav/base/util/LiteavLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-nez p2, :cond_4

    .line 37
    invoke-static {}, Lcom/tencent/liteav/videoproducer/capture/e;->a()Ljava/util/Comparator;

    move-result-object p2

    invoke-static {p0, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 38
    array-length p2, p0

    :goto_1
    if-ge v2, p2, :cond_3

    aget-object v1, p0, v2

    .line 39
    iget v3, v1, Lcom/tencent/liteav/videoproducer/a/a;->a:I

    if-lt v3, p1, :cond_2

    return-object v1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-object v0

    .line 40
    :cond_4
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 41
    array-length v1, p0

    move v3, v2

    :goto_2
    if-ge v3, v1, :cond_6

    aget-object v4, p0, v3

    .line 42
    iget v5, v4, Lcom/tencent/liteav/videoproducer/a/a;->a:I

    .line 43
    iget v6, v4, Lcom/tencent/liteav/videoproducer/a/a;->b:I

    if-ge v5, v6, :cond_5

    .line 44
    invoke-interface {p2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 45
    :cond_6
    new-array p0, v2, [Lcom/tencent/liteav/videoproducer/a/a;

    invoke-interface {p2, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lcom/tencent/liteav/videoproducer/a/a;

    .line 46
    invoke-static {}, Lcom/tencent/liteav/videoproducer/capture/f;->a()Ljava/util/Comparator;

    move-result-object p2

    invoke-static {p0, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 47
    array-length p2, p0

    :goto_3
    if-ge v2, p2, :cond_8

    aget-object v1, p0, v2

    .line 48
    iget v3, v1, Lcom/tencent/liteav/videoproducer/a/a;->b:I

    if-gt p1, v3, :cond_7

    return-object v1

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 49
    :cond_8
    array-length p1, p0

    if-lez p1, :cond_9

    array-length p1, p0

    add-int/lit8 p1, p1, -0x1

    aget-object p0, p0, p1

    return-object p0

    :cond_9
    :goto_4
    return-object v0
.end method
