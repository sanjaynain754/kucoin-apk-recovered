.class public final Lcom/sumsub/sns/internal/core/presentation/common/e;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic i:[Lkotlin/reflect/KProperty;


# instance fields
.field public final e:Lkotlin/jvm/functions/Function1;

.field public final f:Ljava/lang/String;

.field public final g:Lcom/sumsub/sns/internal/core/presentation/common/m;

.field public h:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "getPendingRequest()Lcom/sumsub/sns/internal/features/domain/documents/GalleryRequest;"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/core/presentation/common/e;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v3, "pendingRequest"

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 16
    .line 17
    aput-object v0, v2, v1

    .line 18
    .line 19
    sput-object v2, Lcom/sumsub/sns/internal/core/presentation/common/e;->i:[Lkotlin/reflect/KProperty;

    .line 20
    return-void
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
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/core/presentation/common/t;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 6
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-direct {p0, v0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 7
    const-string p1, "GalleryPicker"

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->f:Ljava/lang/String;

    .line 8
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/common/m;

    const-string v0, "PENDING_GALLERY_REQUEST"

    const-class v1, Lcom/sumsub/sns/internal/features/domain/documents/s;

    invoke-direct {p1, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/m;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 9
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->g:Lcom/sumsub/sns/internal/core/presentation/common/m;

    .line 10
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 2
    const-string p1, "GalleryPicker"

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->f:Ljava/lang/String;

    .line 3
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/common/m;

    const-string v0, "PENDING_GALLERY_REQUEST"

    const-class v1, Lcom/sumsub/sns/internal/features/domain/documents/s;

    invoke-direct {p1, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/m;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    .line 4
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->g:Lcom/sumsub/sns/internal/core/presentation/common/m;

    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/common/e;Landroid/net/Uri;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->g:Lcom/sumsub/sns/internal/core/presentation/common/m;

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/common/e;->i:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v3, v1, v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 4
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 5
    iget-object v5, v0, Lcom/sumsub/sns/internal/core/presentation/common/m;->a:Ljava/lang/String;

    .line 6
    invoke-virtual {p0, v5}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 7
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/common/m;->b:Ljava/lang/Class;

    .line 8
    iget-object v6, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 9
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v6

    .line 10
    invoke-static {v3, v5, v0, v6}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v4

    .line 11
    :goto_0
    check-cast v0, Lcom/sumsub/sns/internal/features/domain/documents/s;

    if-nez v0, :cond_1

    goto :goto_1

    .line 12
    :cond_1
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->g:Lcom/sumsub/sns/internal/core/presentation/common/m;

    aget-object v1, v1, v2

    .line 13
    iget-object v1, v3, Lcom/sumsub/sns/internal/core/presentation/common/m;->a:Ljava/lang/String;

    .line 14
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 15
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 16
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 17
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_2
    if-nez p1, :cond_3

    :goto_1
    return-void

    .line 18
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object v1

    .line 19
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v5

    .line 20
    new-instance v8, Lcom/sumsub/sns/internal/core/presentation/common/c;

    invoke-direct {v8, p0, p1, v0, v4}, Lcom/sumsub/sns/internal/core/presentation/common/c;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/e;Landroid/net/Uri;Lcom/sumsub/sns/internal/features/domain/documents/s;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p4

    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/common/d;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/common/d;

    iget v2, v1, Lcom/sumsub/sns/internal/core/presentation/common/d;->d:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/sumsub/sns/internal/core/presentation/common/d;->d:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/common/d;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lcom/sumsub/sns/internal/core/presentation/common/d;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v0, v1, Lcom/sumsub/sns/internal/core/presentation/common/d;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 39
    iget v4, v1, Lcom/sumsub/sns/internal/core/presentation/common/d;->d:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/common/d;->a:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v17, v1

    move-object v1, v0

    move-object/from16 v0, v17

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 40
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v4, 0x0

    const/4 v7, 0x2

    const-string v8, "file"

    invoke-static {v0, v8, v4, v7, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-ne v0, v5, :cond_3

    .line 41
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v10, p3

    goto :goto_2

    :cond_3
    move-object/from16 v0, p3

    .line 42
    iput-object v0, v1, Lcom/sumsub/sns/internal/core/presentation/common/d;->a:Ljava/lang/String;

    iput v5, v1, Lcom/sumsub/sns/internal/core/presentation/common/d;->d:I

    .line 43
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v4

    new-instance v5, Lcom/sumsub/sns/internal/core/common/e;

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    invoke-direct {v5, v7, v8, v6}, Lcom/sumsub/sns/internal/core/common/e;-><init>(Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    invoke-static {v4, v5, v1}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    return-object v3

    .line 44
    :cond_4
    :goto_1
    check-cast v1, Ljava/lang/String;

    move-object v10, v0

    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_6

    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_5

    move-object v11, v0

    goto :goto_3

    :cond_5
    move-object v11, v6

    :goto_3
    if-eqz v11, :cond_6

    .line 46
    new-instance v8, Ljava/io/File;

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-string v12, "file://"

    const-string v13, ""

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 47
    new-instance v7, Lcom/sumsub/sns/internal/features/data/model/common/T;

    const/4 v14, 0x0

    const/16 v15, 0x2e0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v8

    invoke-direct/range {v7 .. v15}, Lcom/sumsub/sns/internal/features/data/model/common/T;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/lang/Boolean;Lcom/sumsub/sns/internal/features/data/model/common/S;I)V

    return-object v7

    :cond_6
    return-object v6
.end method

.method public final a(Lcom/sumsub/sns/internal/features/domain/documents/s;)V
    .locals 8

    .line 21
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->g:Lcom/sumsub/sns/internal/core/presentation/common/m;

    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/common/e;->i:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 22
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/common/m;->a:Ljava/lang/String;

    .line 23
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 25
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 26
    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 27
    :cond_0
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/domain/documents/s;->c:[Ljava/lang/String;

    .line 28
    array-length v1, v0

    move v3, v2

    :goto_0
    const/4 v4, 0x0

    if-ge v3, v1, :cond_2

    aget-object v5, v0, v3

    .line 29
    const-string v6, "image"

    const/4 v7, 0x2

    invoke-static {v5, v6, v2, v7, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 30
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->SystemDocumentPicker:Lcom/sumsub/sns/internal/core/analytics/Screen;

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->SystemImagePicker:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 31
    :goto_1
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->h:Landroidx/activity/result/ActivityResultLauncher;

    if-eqz v3, :cond_3

    invoke-virtual {v3, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 32
    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 33
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/documents/s;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 34
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 35
    invoke-virtual {v0, v1, p1, v4}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Popup;)Lcom/sumsub/sns/internal/core/analytics/g;

    move-result-object p1

    .line 36
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/NavigationAction;->Opened:Lcom/sumsub/sns/internal/core/analytics/NavigationAction;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p1, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 38
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    :cond_3
    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->f:Ljava/lang/String;

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
    .locals 5

    .line 1
    .line 2
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$OpenDocument;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$OpenDocument;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/common/b0;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/core/presentation/common/b0;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/e;)V

    .line 11
    .line 12
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/activity/ComponentActivity;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    const-string v3, "GALLERY_PICKER"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3, v4, v0, v1}, Landroidx/activity/result/ActivityResultRegistry;->register(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 39
    return-void
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

.method public final m()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/e;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
