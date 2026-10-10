.class public final Lcom/kubi/futures/dialog/FutureBonusGetDialog;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "FutureBonusGetDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/dialog/FutureBonusGetDialog$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/futures/dialog/FutureBonusGetDialog;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "trial",
        "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;",
        "getTrial",
        "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;",
        "trial$delegate",
        "Lkotlin/Lazy;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "tradeNow",
        "getResources",
        "Landroid/content/res/Resources;",
        "attachBaseContext",
        "newBase",
        "Landroid/content/Context;",
        "Companion",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFutureBonusGetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FutureBonusGetDialog.kt\ncom/kubi/futures/dialog/FutureBonusGetDialog\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,148:1\n20#2:149\n*S KotlinDebug\n*F\n+ 1 FutureBonusGetDialog.kt\ncom/kubi/futures/dialog/FutureBonusGetDialog\n*L\n99#1:149\n*E\n"
    }
.end annotation


# static fields
.field public static final j:Lcom/kubi/futures/dialog/FutureBonusGetDialog$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final i:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/futures/dialog/FutureBonusGetDialog$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/futures/dialog/FutureBonusGetDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/futures/dialog/FutureBonusGetDialog;->j:Lcom/kubi/futures/dialog/FutureBonusGetDialog$Companion;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/futures/dialog/t;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/kubi/futures/dialog/t;-><init>(Lcom/kubi/futures/dialog/FutureBonusGetDialog;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/futures/dialog/FutureBonusGetDialog;->i:Lkotlin/Lazy;

    .line 15
    return-void
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
.end method

.method public static synthetic G(Lcom/kubi/futures/dialog/FutureBonusGetDialog;Ldm/v;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/dialog/FutureBonusGetDialog;->N(Lcom/kubi/futures/dialog/FutureBonusGetDialog;Ldm/v;)V

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
.end method

.method public static synthetic H(Lcom/kubi/futures/dialog/FutureBonusGetDialog;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/dialog/FutureBonusGetDialog;->M(Lcom/kubi/futures/dialog/FutureBonusGetDialog;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)Lkotlin/Unit;

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
.end method

.method public static synthetic I(Lcom/kubi/futures/dialog/FutureBonusGetDialog;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/FutureBonusGetDialog;->P(Lcom/kubi/futures/dialog/FutureBonusGetDialog;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

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
.end method

.method public static synthetic J(Lcom/kubi/futures/dialog/FutureBonusGetDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/FutureBonusGetDialog;->L(Lcom/kubi/futures/dialog/FutureBonusGetDialog;)Lkotlin/Unit;

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
.end method

.method private final K()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/FutureBonusGetDialog;->i:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    .line 9
    return-object v0
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
.end method

.method public static final L(Lcom/kubi/futures/dialog/FutureBonusGetDialog;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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
.end method

.method public static final M(Lcom/kubi/futures/dialog/FutureBonusGetDialog;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/futures/dialog/FutureBonusGetDialog;->O(Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final N(Lcom/kubi/futures/dialog/FutureBonusGetDialog;Ldm/v;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    move-result p0

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object p0, p1, Ldm/v;->f:Landroid/widget/ImageView;

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 20
    .line 21
    iget-object p0, p1, Ldm/v;->f:Landroid/widget/ImageView;

    .line 22
    .line 23
    const-string v0, "imgClose"

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 30
    .line 31
    iget-object p0, p1, Ldm/v;->f:Landroid/widget/ImageView;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 35
    move-result-object p0

    .line 36
    .line 37
    const/high16 p1, 0x3f800000    # 1.0f

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    const-wide/16 v0, 0xc8

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 47
    move-result-object p0

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 51
    :cond_1
    :goto_0
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public static final P(Lcom/kubi/futures/dialog/FutureBonusGetDialog;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    const-string v0, "data"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    check-cast p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    .line 13
    return-object p0
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
.end method


# virtual methods
.method public final O(Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V
    .locals 27

    .line 1
    .line 2
    sget-object v0, Lyl/h0;->a:Lyl/h0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lyl/h0;->L()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getContractList()Ljava/util/List;

    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v3

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v3

    .line 28
    move-object v4, v3

    .line 29
    .line 30
    check-cast v4, Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v4

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v3, v2

    .line 39
    .line 40
    :goto_0
    check-cast v3, Ljava/lang/String;

    .line 41
    .line 42
    if-nez v3, :cond_2

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v4, v3

    .line 45
    goto :goto_2

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getContractList()Ljava/util/List;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    const/4 v2, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 56
    move-result-object v1

    .line 57
    move-object v2, v1

    .line 58
    .line 59
    check-cast v2, Ljava/lang/String;

    .line 60
    :cond_4
    move-object v4, v2

    .line 61
    .line 62
    :goto_2
    const-class v1, Lbi/g;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    move-result-object v5

    .line 67
    .line 68
    const-string v1, "getName(...)"

    .line 69
    .line 70
    .line 71
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    new-instance v6, Lbi/g;

    .line 74
    .line 75
    if-nez v4, :cond_5

    .line 76
    goto :goto_3

    .line 77
    :cond_5
    move-object v0, v4

    .line 78
    :goto_3
    const/4 v1, 0x1

    .line 79
    .line 80
    .line 81
    invoke-direct {v6, v0, v1}, Lbi/g;-><init>(Ljava/lang/String;Z)V

    .line 82
    const/4 v9, 0x4

    .line 83
    const/4 v10, 0x0

    .line 84
    .line 85
    const-wide/16 v7, 0x0

    .line 86
    .line 87
    .line 88
    invoke-static/range {v5 .. v10}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 89
    .line 90
    if-eqz v4, :cond_7

    .line 91
    .line 92
    .line 93
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 94
    move-result v0

    .line 95
    .line 96
    if-nez v0, :cond_6

    .line 97
    goto :goto_4

    .line 98
    .line 99
    :cond_6
    sget-object v3, Lf00/a;->a:Lf00/a;

    .line 100
    .line 101
    const/16 v13, 0x1fe

    .line 102
    const/4 v14, 0x0

    .line 103
    const/4 v5, 0x0

    .line 104
    const/4 v6, 0x0

    .line 105
    const/4 v7, 0x0

    .line 106
    const/4 v8, 0x0

    .line 107
    const/4 v9, 0x0

    .line 108
    const/4 v10, 0x0

    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    .line 112
    .line 113
    invoke-static/range {v3 .. v14}, Lg00/f$a;->c(Lg00/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 114
    return-void

    .line 115
    .line 116
    :cond_7
    :goto_4
    sget-object v15, Lf00/a;->a:Lf00/a;

    .line 117
    .line 118
    const/16 v25, 0x1ff

    .line 119
    .line 120
    const/16 v26, 0x0

    .line 121
    .line 122
    const/16 v16, 0x0

    .line 123
    .line 124
    const/16 v17, 0x0

    .line 125
    .line 126
    const/16 v18, 0x0

    .line 127
    .line 128
    const/16 v19, 0x0

    .line 129
    .line 130
    const/16 v20, 0x0

    .line 131
    .line 132
    const/16 v21, 0x0

    .line 133
    .line 134
    const/16 v22, 0x0

    .line 135
    .line 136
    const/16 v23, 0x0

    .line 137
    .line 138
    const/16 v24, 0x0

    .line 139
    .line 140
    .line 141
    invoke-static/range {v15 .. v26}, Lg00/f$a;->c(Lg00/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 142
    return-void
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
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "newBase"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/sdk/function/language/a;->a:Lcom/kubi/sdk/function/language/a;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getDelegate()Landroidx/appcompat/app/AppCompatDelegate;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1}, Landroidx/appcompat/app/AppCompatDelegate;->attachBaseContext2(Landroid/content/Context;)Landroid/content/Context;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    const-string v1, "attachBaseContext2(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/function/language/a;->p(Landroid/content/Context;)Landroid/content/Context;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->attachBaseContext(Landroid/content/Context;)V

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "getResources(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const/high16 v2, 0x3f800000    # 1.0f

    .line 16
    .line 17
    iput v2, v1, Landroid/content/res/Configuration;->fontScale:F

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 23
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x6

    .line 5
    .line 6
    const/high16 v3, 0x3f800000    # 1.0f

    .line 7
    .line 8
    .line 9
    invoke-super/range {p0 .. p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 10
    .line 11
    sget v4, Lcom/kubi/kumex/R$layout;->bkumex_dialog_future_bonus_get:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v4}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/kubi/futures/dialog/FutureBonusGetDialog;->K()Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;

    .line 18
    move-result-object v4

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lw00/b;->a(Landroid/app/Activity;)Landroid/view/View;

    .line 22
    move-result-object v5

    .line 23
    .line 24
    .line 25
    invoke-static {v5}, Ldm/v;->a(Landroid/view/View;)Ldm/v;

    .line 26
    move-result-object v5

    .line 27
    .line 28
    const-string v6, "bind(...)"

    .line 29
    .line 30
    .line 31
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    const/4 v6, 0x0

    .line 33
    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v6, v6}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 41
    return-void

    .line 42
    .line 43
    :cond_0
    sget-object v7, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 44
    .line 45
    iget-object v8, v5, Ldm/v;->e:Landroid/view/View;

    .line 46
    .line 47
    const-string v9, "fakeStatusBar"

    .line 48
    .line 49
    .line 50
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, v0, v8}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->f(Landroid/app/Activity;Landroid/view/View;)V

    .line 54
    .line 55
    iget-object v7, v5, Ldm/v;->e:Landroid/view/View;

    .line 56
    .line 57
    .line 58
    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v7}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 62
    .line 63
    iget-object v7, v5, Ldm/v;->g:Lcom/airbnb/lottie/LottieAnimationView;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 67
    move-result-object v8

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 71
    move-result-object v9

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->b()I

    .line 75
    move-result v10

    .line 76
    .line 77
    iput v10, v9, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 81
    move-result-object v9

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->d()I

    .line 85
    move-result v10

    .line 86
    .line 87
    iput v10, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 91
    .line 92
    iget-object v11, v5, Ldm/v;->f:Landroid/widget/ImageView;

    .line 93
    .line 94
    const-string v7, "imgClose"

    .line 95
    .line 96
    .line 97
    invoke-static {v11, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    new-instance v14, Lcom/kubi/futures/dialog/u;

    .line 100
    .line 101
    .line 102
    invoke-direct {v14, v0}, Lcom/kubi/futures/dialog/u;-><init>(Lcom/kubi/futures/dialog/FutureBonusGetDialog;)V

    .line 103
    const/4 v15, 0x1

    .line 104
    .line 105
    const/16 v16, 0x0

    .line 106
    .line 107
    const-wide/16 v12, 0x0

    .line 108
    .line 109
    .line 110
    invoke-static/range {v11 .. v16}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 111
    .line 112
    iget-object v8, v5, Ldm/v;->c:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 113
    .line 114
    const-string v9, "btnTradeNow"

    .line 115
    .line 116
    .line 117
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    new-instance v9, Lcom/kubi/futures/dialog/v;

    .line 120
    .line 121
    .line 122
    invoke-direct {v9, v0, v4}, Lcom/kubi/futures/dialog/v;-><init>(Lcom/kubi/futures/dialog/FutureBonusGetDialog;Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;)V

    .line 123
    .line 124
    const/16 v21, 0x1

    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    const-wide/16 v18, 0x0

    .line 129
    .line 130
    move-object/from16 v17, v8

    .line 131
    .line 132
    move-object/from16 v20, v9

    .line 133
    .line 134
    .line 135
    invoke-static/range {v17 .. v22}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 136
    .line 137
    sget-object v8, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8}, Lcom/kubi/kucoin/utils/r;->l()Z

    .line 141
    move-result v8

    .line 142
    .line 143
    if-eqz v8, :cond_1

    .line 144
    .line 145
    iget-object v8, v5, Ldm/v;->h:Landroid/widget/ImageView;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8, v3}, Landroid/view/View;->setAlpha(F)V

    .line 149
    .line 150
    iget-object v8, v5, Ldm/v;->b:Lcom/kubi/resources/widget/round/widget/RoundImageView;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8, v3}, Landroid/view/View;->setAlpha(F)V

    .line 154
    goto :goto_0

    .line 155
    .line 156
    :cond_1
    iget-object v3, v5, Ldm/v;->h:Landroid/widget/ImageView;

    .line 157
    .line 158
    const/high16 v8, 0x3f000000    # 0.5f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3, v8}, Landroid/view/View;->setAlpha(F)V

    .line 162
    .line 163
    iget-object v3, v5, Ldm/v;->b:Lcom/kubi/resources/widget/round/widget/RoundImageView;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v8}, Landroid/view/View;->setAlpha(F)V

    .line 167
    .line 168
    :goto_0
    new-instance v3, Landroid/animation/AnimatorSet;

    .line 169
    .line 170
    .line 171
    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 172
    .line 173
    iget-object v8, v5, Ldm/v;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 174
    .line 175
    const-string v9, "dialogCtt"

    .line 176
    .line 177
    .line 178
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    new-array v9, v2, [F

    .line 181
    .line 182
    .line 183
    fill-array-data v9, :array_0

    .line 184
    .line 185
    const-string v10, "scaleX"

    .line 186
    .line 187
    .line 188
    invoke-static {v8, v10, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 189
    move-result-object v9

    .line 190
    .line 191
    new-array v2, v2, [F

    .line 192
    .line 193
    .line 194
    fill-array-data v2, :array_1

    .line 195
    .line 196
    const-string v10, "scaleY"

    .line 197
    .line 198
    .line 199
    invoke-static {v8, v10, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 200
    move-result-object v2

    .line 201
    .line 202
    new-array v8, v1, [Landroid/animation/Animator;

    .line 203
    .line 204
    aput-object v9, v8, v6

    .line 205
    const/4 v9, 0x1

    .line 206
    .line 207
    aput-object v2, v8, v9

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3, v8}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 211
    .line 212
    const-wide/16 v8, 0x2f8

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v8, v9}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 216
    .line 217
    .line 218
    const v2, 0x3f051eb8    # 0.52f

    .line 219
    .line 220
    .line 221
    const v8, 0x3f6147ae    # 0.88f

    .line 222
    .line 223
    .line 224
    const v9, 0x3e6b851f    # 0.23f

    .line 225
    .line 226
    .line 227
    const v10, 0x3db851ec    # 0.09f

    .line 228
    .line 229
    .line 230
    invoke-static {v9, v10, v2, v8}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(FFFF)Landroid/view/animation/Interpolator;

    .line 231
    move-result-object v2

    .line 232
    .line 233
    check-cast v2, Landroid/animation/TimeInterpolator;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3, v2}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->start()V

    .line 240
    .line 241
    iget-object v2, v5, Ldm/v;->f:Landroid/widget/ImageView;

    .line 242
    .line 243
    .line 244
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 248
    .line 249
    iget-object v2, v5, Ldm/v;->f:Landroid/widget/ImageView;

    .line 250
    .line 251
    new-instance v3, Lcom/kubi/futures/dialog/w;

    .line 252
    .line 253
    .line 254
    invoke-direct {v3, v0, v5}, Lcom/kubi/futures/dialog/w;-><init>(Lcom/kubi/futures/dialog/FutureBonusGetDialog;Ldm/v;)V

    .line 255
    .line 256
    const-wide/16 v7, 0x190

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v3, v7, v8}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 260
    .line 261
    iget-object v2, v5, Ldm/v;->i:Lcom/kubi/resources/widget/BaseTextView;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getFaceValue()Ljava/math/BigDecimal;

    .line 265
    move-result-object v3

    .line 266
    .line 267
    .line 268
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 269
    move-result-object v7

    .line 270
    .line 271
    sget-object v3, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 275
    move-result-object v3

    .line 276
    .line 277
    .line 278
    invoke-virtual {v4}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCurrency()Ljava/lang/String;

    .line 279
    move-result-object v8

    .line 280
    .line 281
    .line 282
    invoke-static {v8}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    move-result-object v8

    .line 284
    const/4 v9, 0x0

    .line 285
    .line 286
    .line 287
    invoke-static {v3, v8, v6, v1, v9}, Lth/d;->E(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 288
    move-result-object v1

    .line 289
    .line 290
    if-eqz v1, :cond_2

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getProperties()Lcom/kubi/kumex/data/platform/model/PropertyEntity;

    .line 294
    move-result-object v1

    .line 295
    .line 296
    if-eqz v1, :cond_2

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/PropertyEntity;->getShortDisplayPrecision()Ljava/lang/Integer;

    .line 300
    move-result-object v9

    .line 301
    :cond_2
    const/4 v1, 0x4

    .line 302
    .line 303
    .line 304
    invoke-static {v9, v1}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 305
    move-result v9

    .line 306
    .line 307
    const/16 v15, 0x7d

    .line 308
    .line 309
    const/16 v16, 0x0

    .line 310
    const/4 v8, 0x0

    .line 311
    const/4 v10, 0x0

    .line 312
    const/4 v11, 0x0

    .line 313
    const/4 v12, 0x0

    .line 314
    const/4 v13, 0x0

    .line 315
    const/4 v14, 0x0

    .line 316
    .line 317
    .line 318
    invoke-static/range {v7 .. v16}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 319
    move-result-object v1

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 323
    .line 324
    iget-object v1, v5, Ldm/v;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 325
    .line 326
    new-instance v2, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 330
    .line 331
    const/16 v3, 0x20

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v4}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;->getCurrency()Ljava/lang/String;

    .line 338
    move-result-object v3

    .line 339
    .line 340
    .line 341
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    move-result-object v3

    .line 343
    .line 344
    .line 345
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 346
    move-result-object v3

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 353
    move-result-object v2

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 357
    return-void

    .line 358
    nop

    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    :array_0
    .array-data 4
        0x0
        0x3f2b851f    # 0.67f
        0x3dcccccd    # 0.1f
        0x3f866666    # 1.05f
        0x3f7ae148    # 0.98f
        0x3f800000    # 1.0f
    .end array-data

    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    :array_1
    .array-data 4
        0x3e4ccccd    # 0.2f
        0x3f2b851f    # 0.67f
        0x3f7ae148    # 0.98f
        0x3f866666    # 1.05f
        0x3f7ae148    # 0.98f
        0x3f800000    # 1.0f
    .end array-data
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method
