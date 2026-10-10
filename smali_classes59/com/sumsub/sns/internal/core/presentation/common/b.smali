.class public final Lcom/sumsub/sns/internal/core/presentation/common/b;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic l:[Lkotlin/reflect/KProperty;


# instance fields
.field public final e:Lcom/sumsub/sns/internal/features/domain/A;

.field public final f:Lkotlin/jvm/functions/Function1;

.field public final g:Ljava/lang/String;

.field public final h:Lcom/sumsub/sns/internal/core/presentation/camera/a;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/common/e;

.field public final j:Lcom/sumsub/sns/internal/core/presentation/common/m;

.field public final k:Lcom/sumsub/sns/internal/core/presentation/common/m;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/core/presentation/common/b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "pendingRequest"

    .line 6
    .line 7
    const-string v2, "getPendingRequest()Landroid/os/Parcelable;"

    .line 8
    const/4 v3, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "pendingResult"

    .line 16
    .line 17
    const-string v4, "getPendingResult()Lcom/sumsub/sns/internal/features/data/model/common/DocumentPickerResult;"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x2

    .line 23
    .line 24
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 25
    .line 26
    aput-object v1, v2, v3

    .line 27
    const/4 v1, 0x1

    .line 28
    .line 29
    aput-object v0, v2, v1

    .line 30
    .line 31
    sput-object v2, Lcom/sumsub/sns/internal/core/presentation/common/b;->l:[Lkotlin/reflect/KProperty;

    .line 32
    return-void
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
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;Lcom/sumsub/sns/internal/features/domain/A;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 5
    .line 6
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->e:Lcom/sumsub/sns/internal/features/domain/A;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->f:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    const-string p1, "DocPickerWithPreview"

    .line 11
    .line 12
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->g:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/camera/a;

    .line 15
    .line 16
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/common/y;

    .line 17
    .line 18
    .line 19
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/core/presentation/common/y;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/b;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, p0, p2}, Lcom/sumsub/sns/internal/core/presentation/camera/a;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/b;Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->h:Lcom/sumsub/sns/internal/core/presentation/camera/a;

    .line 25
    .line 26
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/common/e;

    .line 27
    .line 28
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/common/z;

    .line 29
    .line 30
    .line 31
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/core/presentation/common/z;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/b;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, p0, p2}, Lcom/sumsub/sns/internal/core/presentation/common/e;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/t;Lkotlin/jvm/functions/Function1;)V

    .line 35
    .line 36
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->i:Lcom/sumsub/sns/internal/core/presentation/common/e;

    .line 37
    .line 38
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/common/m;

    .line 39
    .line 40
    const-string p2, "PENDING_DOCUMENT_PICKER_REQUEST"

    .line 41
    .line 42
    const-class p3, Landroid/os/Parcelable;

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/common/m;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 46
    .line 47
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->j:Lcom/sumsub/sns/internal/core/presentation/common/m;

    .line 48
    .line 49
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/common/m;

    .line 50
    .line 51
    const-string p2, "PENDING_DOCUMENT_PICKER_RESULT"

    .line 52
    .line 53
    const-class p3, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, p2, p3}, Lcom/sumsub/sns/internal/core/presentation/common/m;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 57
    .line 58
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->k:Lcom/sumsub/sns/internal/core/presentation/common/m;

    .line 59
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/common/b;Lcom/sumsub/sns/internal/features/data/model/common/T;)Lkotlin/Unit;
    .locals 8

    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->k:Lcom/sumsub/sns/internal/core/presentation/common/m;

    .line 9
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/common/b;->l:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/common/m;->a:Ljava/lang/String;

    .line 11
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 13
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-nez p1, :cond_0

    if-eqz v1, :cond_1

    .line 14
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    .line 15
    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 16
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 17
    sget p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->U:I

    .line 18
    new-instance p0, Lcom/sumsub/sns/internal/features/domain/documents/D;

    .line 19
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 20
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->i:Z

    const/4 v1, 0x0

    .line 21
    invoke-direct {p0, v0, p1, v1}, Lcom/sumsub/sns/internal/features/domain/documents/D;-><init>(Ljava/io/File;ZLjava/lang/Integer;)V

    .line 22
    invoke-virtual {v2}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    move-result-object p1

    .line 23
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;-><init>()V

    .line 24
    const-string v1, "image_data"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    .line 25
    const-string v1, "doc_set_type"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    filled-new-array {p0, p1}, [Lkotlin/Pair;

    move-result-object p0

    .line 26
    invoke-static {p0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 27
    const-string p0, "REQUEST_PHOTO_VIEWER"

    invoke-virtual {v0, p0}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 28
    const-string v4, "SNSSimpleDocumentViewerFragment"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 29
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/common/b;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 12

    .line 30
    const-string/jumbo p1, "result_data"

    const-class v0, Lcom/sumsub/sns/internal/features/domain/documents/K;

    const/4 v1, 0x0

    invoke-static {p2, p1, v0, v1}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    move-result-object p1

    .line 31
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/documents/K;

    .line 32
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/domain/documents/J;

    const/4 v0, 0x1

    if-eqz p2, :cond_4

    check-cast p1, Lcom/sumsub/sns/internal/features/domain/documents/J;

    .line 33
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/documents/J;->b:Ljava/lang/Integer;

    .line 34
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/b;->a(Landroid/os/Parcelable;)V

    .line 35
    iget-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->k:Lcom/sumsub/sns/internal/core/presentation/common/m;

    sget-object v2, Lcom/sumsub/sns/internal/core/presentation/common/b;->l:[Lkotlin/reflect/KProperty;

    aget-object v3, v2, v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 37
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 38
    iget-object v1, p2, Lcom/sumsub/sns/internal/core/presentation/common/m;->a:Ljava/lang/String;

    .line 39
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 40
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/common/m;->b:Ljava/lang/Class;

    .line 41
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 42
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v4

    .line 43
    invoke-static {v3, v1, p2, v4}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    move-result-object v1

    .line 44
    :cond_0
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/T;

    if-nez v1, :cond_1

    goto/16 :goto_0

    .line 45
    :cond_1
    iget-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->k:Lcom/sumsub/sns/internal/core/presentation/common/m;

    aget-object v0, v2, v0

    .line 46
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/common/m;->a:Ljava/lang/String;

    .line 47
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 48
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 49
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 50
    invoke-virtual {v0, p2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 51
    :cond_2
    iget-object p2, v1, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    if-eqz p2, :cond_3

    if-eqz p1, :cond_3

    .line 52
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->e:Lcom/sumsub/sns/internal/features/domain/A;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1, p2}, Lcom/sumsub/sns/internal/features/domain/A;->a(ILjava/io/File;)V

    .line 53
    :cond_3
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->f:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 54
    :cond_4
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/domain/documents/H;

    if-eqz p1, :cond_8

    .line 55
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->k:Lcom/sumsub/sns/internal/core/presentation/common/m;

    sget-object p2, Lcom/sumsub/sns/internal/core/presentation/common/b;->l:[Lkotlin/reflect/KProperty;

    aget-object v0, p2, v0

    .line 56
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/common/m;->a:Ljava/lang/String;

    .line 57
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 58
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 59
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 60
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 61
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->j:Lcom/sumsub/sns/internal/core/presentation/common/m;

    const/4 v0, 0x0

    aget-object p2, p2, v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    iget-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 63
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 64
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/common/m;->a:Ljava/lang/String;

    .line 65
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 66
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/common/m;->b:Ljava/lang/Class;

    .line 67
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 68
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    .line 69
    invoke-static {p2, v0, p1, v1}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    move-result-object v1

    .line 70
    :cond_6
    instance-of p1, v1, Lcom/sumsub/sns/internal/features/domain/documents/s;

    if-eqz p1, :cond_7

    check-cast v1, Lcom/sumsub/sns/internal/features/domain/documents/s;

    .line 71
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/b;->a(Landroid/os/Parcelable;)V

    .line 72
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->i:Lcom/sumsub/sns/internal/core/presentation/common/e;

    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/e;->a(Lcom/sumsub/sns/internal/features/domain/documents/s;)V

    return-void

    .line 73
    :cond_7
    instance-of p1, v1, Lcom/sumsub/sns/internal/features/domain/documents/M;

    if-eqz p1, :cond_9

    check-cast v1, Lcom/sumsub/sns/internal/features/domain/documents/M;

    .line 74
    iget-boolean v3, v1, Lcom/sumsub/sns/internal/features/domain/documents/M;->a:Z

    iget-object v4, v1, Lcom/sumsub/sns/internal/features/domain/documents/M;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    iget-object v5, v1, Lcom/sumsub/sns/internal/features/domain/documents/M;->c:Ljava/util/List;

    iget-boolean v6, v1, Lcom/sumsub/sns/internal/features/domain/documents/M;->d:Z

    iget-object v7, v1, Lcom/sumsub/sns/internal/features/domain/documents/M;->e:Ljava/lang/String;

    iget-object v9, v1, Lcom/sumsub/sns/internal/features/domain/documents/M;->g:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;

    iget-object v10, v1, Lcom/sumsub/sns/internal/features/domain/documents/M;->h:Ljava/lang/String;

    iget-boolean v11, v1, Lcom/sumsub/sns/internal/features/domain/documents/M;->i:Z

    .line 75
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/documents/M;

    const/4 v8, 0x1

    invoke-direct/range {v2 .. v11}, Lcom/sumsub/sns/internal/features/domain/documents/M;-><init>(ZLcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/util/List;ZLjava/lang/String;ZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;Ljava/lang/String;Z)V

    .line 76
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/core/presentation/common/b;->a(Landroid/os/Parcelable;)V

    .line 77
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->h:Lcom/sumsub/sns/internal/core/presentation/camera/a;

    .line 78
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 79
    sget-object p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;->o:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/y;->a(Lcom/sumsub/sns/internal/features/domain/documents/M;)Lcom/sumsub/sns/core/presentation/base/I;

    move-result-object p0

    .line 80
    const-string p1, "REQUEST_CAMERA_PICKER"

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    move-result-object v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    .line 81
    const-string v5, "SNSPhotoDocumentPickerFragment2"

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    .line 82
    :cond_8
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/b;->a(Landroid/os/Parcelable;)V

    .line 83
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->k:Lcom/sumsub/sns/internal/core/presentation/common/m;

    sget-object p2, Lcom/sumsub/sns/internal/core/presentation/common/b;->l:[Lkotlin/reflect/KProperty;

    aget-object p2, p2, v0

    .line 84
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/common/m;->a:Ljava/lang/String;

    .line 85
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 86
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_9

    .line 88
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_9
    :goto_0
    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/core/presentation/common/b;Lcom/sumsub/sns/internal/features/data/model/common/T;)Lkotlin/Unit;
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->k:Lcom/sumsub/sns/internal/core/presentation/common/m;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/common/b;->l:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/common/m;->a:Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_0
    if-eqz v1, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 33
    .line 34
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 35
    .line 36
    sget p0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;->U:I

    .line 37
    .line 38
    new-instance p0, Lcom/sumsub/sns/internal/features/domain/documents/D;

    .line 39
    .line 40
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 41
    .line 42
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->i:Z

    .line 43
    const/4 v1, 0x0

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, v0, p1, v1}, Lcom/sumsub/sns/internal/features/domain/documents/D;-><init>(Ljava/io/File;ZLjava/lang/Integer;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/simplepreview/f;-><init>()V

    .line 56
    .line 57
    const-string v1, "image_data"

    .line 58
    .line 59
    .line 60
    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 61
    move-result-object p0

    .line 62
    .line 63
    const-string v1, "doc_set_type"

    .line 64
    .line 65
    .line 66
    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    .line 70
    filled-new-array {p0, p1}, [Lkotlin/Pair;

    .line 71
    move-result-object p0

    .line 72
    .line 73
    .line 74
    invoke-static {p0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 75
    move-result-object p0

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 79
    .line 80
    const-string p0, "REQUEST_PHOTO_VIEWER"

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p0}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    .line 84
    move-result-object v3

    .line 85
    const/4 v6, 0x4

    .line 86
    const/4 v7, 0x0

    .line 87
    .line 88
    const-string v4, "SNSSimpleDocumentViewerFragment"

    .line 89
    const/4 v5, 0x0

    .line 90
    .line 91
    .line 92
    invoke-static/range {v2 .. v7}, Lcom/sumsub/sns/core/presentation/base/l;->navigateTo$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 95
    return-object p0
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
.method public final a(Landroid/os/Parcelable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->j:Lcom/sumsub/sns/internal/core/presentation/common/m;

    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/common/b;->l:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 2
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/common/m;->a:Ljava/lang/String;

    .line 3
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 5
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-nez p1, :cond_0

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_1
    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/b;->g:Ljava/lang/String;

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

.method public final l()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/common/a0;

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/core/presentation/common/a0;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/b;)V

    .line 22
    .line 23
    const-string v3, "REQUEST_PHOTO_VIEWER"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3, v1, v2}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 27
    return-void
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
.end method
