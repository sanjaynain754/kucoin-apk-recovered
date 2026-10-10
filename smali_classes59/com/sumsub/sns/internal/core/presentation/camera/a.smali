.class public final Lcom/sumsub/sns/internal/core/presentation/camera/a;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final e:Lkotlin/jvm/functions/Function1;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/presentation/common/b;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/camera/a;->e:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    const-string p1, "CameraPicker"

    .line 10
    .line 11
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/camera/a;->f:Ljava/lang/String;

    .line 12
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/camera/a;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    .line 2
    sget-object p1, Lcom/sumsub/sns/core/presentation/base/l;->Companion:Lcom/sumsub/sns/core/presentation/base/h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Lcom/sumsub/sns/core/presentation/base/h;->a(Landroid/os/Bundle;)Z

    .line 9
    move-result p1

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_0
    const-string p1, "DOCUMENT_RESULT"

    .line 15
    .line 16
    const-class v0, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {p2, p1, v0, v1}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 24
    .line 25
    const-string v0, "DOCUMENT_RESULTS"

    .line 26
    .line 27
    const-class v2, Lcom/sumsub/sns/internal/features/data/model/common/J;

    .line 28
    .line 29
    .line 30
    invoke-static {p2, v0, v2, v1}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/J;

    .line 34
    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/J;->a:Ljava/util/List;

    .line 38
    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 43
    move-result-object p2

    .line 44
    .line 45
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 46
    .line 47
    if-nez p2, :cond_1

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object p1, p2

    .line 50
    .line 51
    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    .line 52
    .line 53
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/a;->e:Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    :cond_3
    :goto_1
    return-void
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


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/camera/a;->f:Ljava/lang/String;

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
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/camera/y;

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/core/presentation/camera/y;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/a;)V

    .line 22
    .line 23
    const-string v3, "REQUEST_CAMERA_PICKER"

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
