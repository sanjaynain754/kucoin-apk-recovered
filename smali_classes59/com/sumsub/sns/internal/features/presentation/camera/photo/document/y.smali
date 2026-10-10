.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;
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

.method public static a(Lcom/sumsub/sns/internal/features/domain/documents/M;)Lcom/sumsub/sns/core/presentation/base/I;
    .locals 10

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->u:Lcom/sumsub/sns/internal/ff/core/a;

    .line 2
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;->R:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->a:Z

    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 6
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    .line 7
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->c:Ljava/util/List;

    .line 8
    iget-boolean v4, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->d:Z

    .line 9
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->e:Ljava/lang/String;

    .line 10
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->g:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    .line 11
    iget-boolean v7, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->f:Z

    .line 12
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->h:Ljava/lang/String;

    .line 13
    invoke-static/range {v1 .. v8}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m;->a(ZLcom/sumsub/sns/internal/features/data/model/common/X;Ljava/util/List;ZLjava/lang/String;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;ZLjava/lang/String;)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;

    move-result-object p0

    return-object p0

    .line 14
    :cond_0
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->a:Z

    .line 15
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 16
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    .line 17
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->c:Ljava/util/List;

    .line 18
    iget-boolean v3, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->d:Z

    .line 19
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->e:Ljava/lang/String;

    .line 20
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->g:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    .line 21
    iget-boolean v6, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->f:Z

    .line 22
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->h:Ljava/lang/String;

    .line 23
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 24
    iget-boolean v9, p0, Lcom/sumsub/sns/internal/features/domain/documents/M;->i:Z

    .line 25
    invoke-static/range {v0 .. v9}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;->a(ZLcom/sumsub/sns/internal/features/data/model/common/X;Ljava/util/List;ZLjava/lang/String;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;ZLjava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/Document;Z)Lcom/sumsub/sns/core/presentation/base/I;

    move-result-object p0

    return-object p0
.end method

.method public static a(ZLcom/sumsub/sns/internal/features/data/model/common/X;Ljava/util/List;ZLjava/lang/String;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;ZLjava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/Document;Z)Lcom/sumsub/sns/core/presentation/base/I;
    .locals 3

    .line 26
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->u:Lcom/sumsub/sns/internal/ff/core/a;

    .line 27
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 28
    sget-object p8, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;->R:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p0 .. p7}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/m;->a(ZLcom/sumsub/sns/internal/features/data/model/common/X;Ljava/util/List;ZLjava/lang/String;Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;ZLjava/lang/String;)Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/K;

    move-result-object p0

    return-object p0

    .line 29
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;-><init>()V

    .line 30
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 31
    const-string v2, "EXTRA_IS_SEAMLESS"

    invoke-virtual {v1, v2, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 32
    iget-object p0, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 33
    const-string p1, "EXTRA_DOCUMENT_TYPE"

    invoke-virtual {v1, p1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    new-instance p0, Ljava/util/ArrayList;

    const/16 p1, 0xa

    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    .line 36
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 37
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->getValue()Ljava/lang/String;

    move-result-object p2

    .line 38
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 39
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 40
    const-string p0, "EXTRA_DOCUMENT_SIDES"

    invoke-virtual {v1, p0, p1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    if-nez p3, :cond_3

    .line 41
    sget-object p0, Lcom/sumsub/sns/internal/ff/a;->p:Lcom/sumsub/sns/internal/ff/core/a;

    .line 42
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 43
    :goto_2
    const-string p1, "EXTRA_GALLERY_AVAILABLE"

    invoke-virtual {v1, p1, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    if-eqz p5, :cond_4

    .line 44
    invoke-virtual {p5}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;->getValue()Ljava/lang/String;

    move-result-object p0

    goto :goto_3

    :cond_4
    const/4 p0, 0x0

    :goto_3
    const-string p1, "EXTRA_PREFER_AUTO_CAPTURE"

    invoke-virtual {v1, p1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const-string p0, "EXTRA_IS_RETAKE"

    invoke-virtual {v1, p0, p6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    if-eqz p4, :cond_5

    .line 46
    const-string p0, "EXTRA_ONLY_ID_DOC"

    invoke-virtual {v1, p0, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    if-eqz p7, :cond_6

    .line 47
    const-string p0, "EXTRA_COUNTRY_CODE"

    invoke-virtual {v1, p0, p7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    if-eqz p8, :cond_7

    .line 48
    const-string p0, "EXTRA_DOCUMENT"

    invoke-virtual {v1, p0, p8}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 49
    :cond_7
    const-string p0, "EXTRA_ALLOW_IN_PLACE_UPLOAD"

    invoke-virtual {v1, p0, p9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 50
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method
