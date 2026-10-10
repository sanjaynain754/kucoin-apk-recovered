.class public final Lcom/kubi/assets/options/main/OptionsAssetMainFragment;
.super Lcom/kubi/mvi/state/BaseStateFragment;
.source "OptionsAssetMainFragment.kt"

# interfaces
.implements Lcom/kubi/assets/AssetV2Fragment$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/options/main/OptionsAssetMainFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/BaseStateFragment<",
        "Lcom/kubi/assets/options/main/OptionsAssetMainContract$UiIntent;",
        "Lcom/kubi/assets/options/main/OptionsAssetMainContract$UIState;",
        "Lcom/kubi/assets/options/main/d;",
        ">;",
        "Lcom/kubi/assets/AssetV2Fragment$a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001fB\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\u0017\u001a\u00020\u0018H\u0014J\u0008\u0010\u0019\u001a\u00020\u001aH\u0014J\u0008\u0010\u001b\u001a\u00020\u001aH\u0016J\u0012\u0010\u001c\u001a\u00020\u001a2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\t8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u000c\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006 "
    }
    d2 = {
        "Lcom/kubi/assets/options/main/OptionsAssetMainFragment;",
        "Lcom/kubi/mvi/state/BaseStateFragment;",
        "Lcom/kubi/assets/options/main/OptionsAssetMainContract$UiIntent;",
        "Lcom/kubi/assets/options/main/OptionsAssetMainContract$UIState;",
        "Lcom/kubi/assets/options/main/OptionsAssetMainViewModel;",
        "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;",
        "<init>",
        "()V",
        "vmClass",
        "Lkotlin/reflect/KClass;",
        "getVmClass",
        "()Lkotlin/reflect/KClass;",
        "optionsOpenFragment",
        "Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;",
        "getOptionsOpenFragment",
        "()Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;",
        "optionsOpenFragment$delegate",
        "Lkotlin/Lazy;",
        "optionsAssetsFragment",
        "Lcom/kubi/assets/options/AssetOptionsFragment;",
        "getOptionsAssetsFragment",
        "()Lcom/kubi/assets/options/AssetOptionsFragment;",
        "optionsAssetsFragment$delegate",
        "getLayout",
        "",
        "bindState",
        "",
        "onShow",
        "onAssetsGet",
        "myAssetEntity",
        "Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
        "Companion",
        "AssetsCenterLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final W:Lcom/kubi/assets/options/main/OptionsAssetMainFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final U:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final V:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/options/main/OptionsAssetMainFragment$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/assets/options/main/OptionsAssetMainFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/assets/options/main/OptionsAssetMainFragment;->W:Lcom/kubi/assets/options/main/OptionsAssetMainFragment$Companion;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/BaseStateFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/assets/options/main/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/assets/options/main/a;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/assets/options/main/OptionsAssetMainFragment;->U:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/assets/options/main/b;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/kubi/assets/options/main/b;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/assets/options/main/OptionsAssetMainFragment;->V:Lkotlin/Lazy;

    .line 26
    return-void
    .line 27
.end method

.method public static synthetic m3()Lcom/kubi/assets/options/AssetOptionsFragment;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/options/main/OptionsAssetMainFragment;->s3()Lcom/kubi/assets/options/AssetOptionsFragment;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic n3()Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/options/main/OptionsAssetMainFragment;->t3()Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final synthetic o3(Lcom/kubi/assets/options/main/OptionsAssetMainFragment;)Lcom/kubi/assets/options/AssetOptionsFragment;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/options/main/OptionsAssetMainFragment;->q3()Lcom/kubi/assets/options/AssetOptionsFragment;

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
.end method

.method public static final synthetic p3(Lcom/kubi/assets/options/main/OptionsAssetMainFragment;)Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/options/main/OptionsAssetMainFragment;->r3()Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;

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
.end method

.method public static final s3()Lcom/kubi/assets/options/AssetOptionsFragment;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/options/AssetOptionsFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/options/AssetOptionsFragment;-><init>()V

    .line 6
    return-object v0
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
.end method

.method public static final t3()Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;-><init>()V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public bindState()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/assets/options/main/OptionsAssetMainFragment$bindState$1;->INSTANCE:Lcom/kubi/assets/options/main/OptionsAssetMainFragment$bindState$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/assets/options/main/OptionsAssetMainFragment$bindState$2;

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/options/main/OptionsAssetMainFragment$bindState$2;-><init>(Lcom/kubi/assets/options/main/OptionsAssetMainFragment;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V

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
.end method

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$layout;->asset_options_main_fragment_layout:I

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
.end method

.method public getVmClass()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "Lcom/kubi/assets/options/main/d;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/kubi/assets/options/main/d;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public onShow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/state/BaseStateFragment;->onShow()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/assets/options/main/OptionsAssetMainContract$UiIntent$RefreshOpenStatus;->INSTANCE:Lcom/kubi/assets/options/main/OptionsAssetMainContract$UiIntent$RefreshOpenStatus;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

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
.end method

.method public final q3()Lcom/kubi/assets/options/AssetOptionsFragment;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/options/main/OptionsAssetMainFragment;->V:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/options/AssetOptionsFragment;

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
.end method

.method public r2(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V
    .locals 2
    .param p1    # Lcom/kubi/assets/entity/AssetV2OverviewEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->isShowing()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget v1, Lcom/kubi/assets/R$id;->asset_options_container_fragment_layout:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    instance-of v1, v0, Lcom/kubi/assets/AssetV2Fragment$a;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    check-cast v0, Lcom/kubi/assets/AssetV2Fragment$a;

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, p1}, Lcom/kubi/assets/AssetV2Fragment$a;->r2(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 35
    :cond_1
    :goto_0
    return-void
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public final r3()Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/options/main/OptionsAssetMainFragment;->U:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/options/openaccount/OptionsOpenFragment;

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
.end method
