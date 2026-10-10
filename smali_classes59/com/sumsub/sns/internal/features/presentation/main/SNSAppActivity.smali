.class public final Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;
.super Lcom/sumsub/sns/core/presentation/base/f;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/common/u0;
.implements Lcom/sumsub/sns/internal/core/common/w0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/f;",
        "Lcom/sumsub/sns/internal/core/common/u0;",
        "Lcom/sumsub/sns/internal/core/common/w0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;",
        "Lcom/sumsub/sns/core/presentation/base/f;",
        "Lcom/sumsub/sns/internal/features/presentation/main/f2;",
        "Lcom/sumsub/sns/internal/features/presentation/main/i2;",
        "Lcom/sumsub/sns/internal/core/common/u0;",
        "Lcom/sumsub/sns/internal/core/common/w0;",
        "<init>",
        "()V",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSAppActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSAppActivity.kt\ncom/sumsub/sns/internal/features/presentation/main/SNSAppActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n+ 6 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,691:1\n75#2,13:692\n32#3,8:705\n28#3,12:714\n1#4:713\n29#5:726\n27#6,4:727\n*S KotlinDebug\n*F\n+ 1 SNSAppActivity.kt\ncom/sumsub/sns/internal/features/presentation/main/SNSAppActivity\n*L\n90#1:692,13\n382#1:705,8\n653#1:714,12\n673#1:726\n158#1:727,4\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic j:I


# instance fields
.field public final e:Landroidx/lifecycle/ViewModelLazy;

.field public f:Lcom/sumsub/sns/core/widget/SNSProgressView;

.field public final g:Lcom/sumsub/sns/internal/core/common/m0;

.field public final h:Lcom/sumsub/sns/internal/features/presentation/main/e;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/f;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/o2;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/main/o2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;)V

    .line 9
    .line 10
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 11
    .line 12
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/main/s0;

    .line 19
    .line 20
    .line 21
    invoke-direct {v3, p0}, Lcom/sumsub/sns/internal/features/presentation/main/s0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;)V

    .line 22
    .line 23
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/main/t0;

    .line 24
    .line 25
    .line 26
    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/features/presentation/main/t0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 30
    .line 31
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    .line 32
    .line 33
    new-instance v0, Lcom/sumsub/sns/internal/core/common/m0;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/common/m0;-><init>()V

    .line 37
    .line 38
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->g:Lcom/sumsub/sns/internal/core/common/m0;

    .line 39
    .line 40
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/e;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/u0;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/main/u0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/e;-><init>(Landroidx/fragment/app/FragmentManager;Lcom/sumsub/sns/internal/features/presentation/main/u0;)V

    .line 53
    .line 54
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->h:Lcom/sumsub/sns/internal/features/presentation/main/e;

    .line 55
    return-void
    .line 56
    .line 57
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    .line 92
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/ServerDrivenNavigationConfiguration;->INSTANCE:Lcom/sumsub/sns/internal/features/presentation/ServerDrivenNavigationConfiguration;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/ServerDrivenNavigationConfiguration;->isEnabled$idensic_mobile_sdk_aar_defaultRelease()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/b2;

    .line 94
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/f;->a:Lkotlin/Lazy;

    .line 95
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/core/domain/h;

    .line 96
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/main/b2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Lcom/sumsub/sns/internal/core/domain/h;)V

    return-object v0

    .line 97
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/d2;

    .line 98
    iget-object v1, p0, Lcom/sumsub/sns/core/presentation/base/f;->a:Lkotlin/Lazy;

    .line 99
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/core/domain/h;

    .line 100
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/main/d2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Lcom/sumsub/sns/internal/core/domain/h;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;)Lkotlin/Unit;
    .locals 0

    .line 88
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    .line 89
    invoke-virtual {p0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 90
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/NetworkManager$NetworkType;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->b(Ljava/lang/String;)V

    .line 91
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V
    .locals 2

    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 v0, p4, 0x4

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_2

    move p3, v1

    .line 287
    :cond_2
    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Landroidx/fragment/app/Fragment;Ljava/lang/String;ZZ)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 382
    const-string p1, "geo_fallback_document"

    const-class v0, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    const/4 v1, 0x0

    invoke-static {p2, p1, v0, v1}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    move-result-object p1

    .line 383
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    if-eqz p1, :cond_0

    .line 384
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/poa/g;

    invoke-direct {p2}, Lcom/sumsub/sns/internal/features/presentation/poa/g;-><init>()V

    .line 385
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "ARGS_DOCUMENT"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {p2, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    const/16 v0, 0xc

    .line 386
    const-string v1, "SNSPoaFragmentV2"

    invoke-static {p0, p2, v1, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 387
    :cond_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    .line 388
    invoke-virtual {p1}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 389
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->e()V

    .line 390
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    const/4 p2, 0x1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->isStateSaved()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 391
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1, v1, p2}, Landroidx/fragment/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    .line 392
    :cond_2
    :goto_0
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 393
    invoke-virtual {p0, p2, p2}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(ZZ)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    sget-object p1, Lcom/sumsub/sns/core/presentation/base/l;->Companion:Lcom/sumsub/sns/core/presentation/base/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lcom/sumsub/sns/core/presentation/base/h;->a(Landroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 3
    sget p2, Lcom/sumsub/sns/R$id;->sns_container:I

    .line 4
    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object p1

    instance-of p2, p1, Lcom/sumsub/sns/core/presentation/base/l;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/sumsub/sns/core/presentation/base/l;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/intro/j;

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->isStateSaved()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    .line 8
    :cond_2
    :goto_1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    const/4 p1, 0x1

    .line 9
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->c(Z)V

    return-void

    .line 10
    :cond_3
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    .line 11
    invoke-virtual {p0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->c(Z)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V
    .locals 10

    .line 298
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShowFragment, tag = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 299
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 300
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 301
    const-string v2, "SNSAppViewModel"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 302
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {v0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    const/4 v1, 0x0

    .line 303
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->e(Z)V

    .line 304
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v4

    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    move-result-object v0

    invoke-virtual {v0}, Lkotlinx/coroutines/e2;->getImmediate()Lkotlinx/coroutines/e2;

    move-result-object v5

    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/main/q0;

    invoke-direct {v7, p0, p2, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/main/q0;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Ljava/lang/String;Landroidx/fragment/app/Fragment;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Landroidx/fragment/app/Fragment;Ljava/lang/String;ZZ)V
    .locals 4

    .line 288
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReplaceFragment, tag = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 289
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 290
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 291
    const-string v2, "SNSAppViewModel"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 292
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 293
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    .line 294
    sget v1, Lcom/sumsub/sns/R$id;->sns_container:I

    invoke-virtual {v0, v1, p1, p2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    if-eqz p4, :cond_0

    .line 295
    invoke-virtual {v0, p2}, Landroidx/fragment/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    :cond_0
    if-eqz p3, :cond_1

    .line 296
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void

    .line 297
    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    return-void
.end method

.method public final a(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 5

    .line 305
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 306
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 307
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 308
    const-string v2, "SNSAppViewModel"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 309
    instance-of v0, p1, Lcom/sumsub/sns/core/presentation/base/m;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/core/presentation/base/m;

    .line 310
    iget-object v1, v0, Lcom/sumsub/sns/core/presentation/base/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 311
    iget-object v2, v0, Lcom/sumsub/sns/core/presentation/base/m;->b:Ljava/lang/String;

    .line 312
    iget-object v4, v0, Lcom/sumsub/sns/core/presentation/base/m;->c:Ljava/lang/CharSequence;

    .line 313
    iget-object v0, v0, Lcom/sumsub/sns/core/presentation/base/m;->d:Ljava/lang/String;

    .line 314
    invoke-virtual {p0, v1, v2, v4, v0}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)V

    .line 315
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/Y;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/Y;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V

    return-void

    .line 316
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/k;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->h:Lcom/sumsub/sns/internal/features/presentation/main/e;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/e;->a:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    .line 318
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/k;->a:Lcom/sumsub/sns/internal/features/presentation/main/j;

    .line 319
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/main/h;

    if-eqz v1, :cond_4

    .line 320
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/e;->a:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    .line 321
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 322
    instance-of v2, v1, Lcom/sumsub/sns/core/presentation/base/l;

    if-eqz v2, :cond_3

    check-cast v1, Lcom/sumsub/sns/core/presentation/base/l;

    goto :goto_1

    :cond_3
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_2

    move-object v2, p1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/main/h;

    .line 323
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/main/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 324
    invoke-virtual {v1, v2}, Lcom/sumsub/sns/core/presentation/base/l;->onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    goto :goto_0

    .line 325
    :cond_4
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/main/i;

    if-eqz v1, :cond_7

    .line 326
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/e;->a:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    .line 327
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 328
    instance-of v2, v1, Lcom/sumsub/sns/core/presentation/base/l;

    if-eqz v2, :cond_6

    check-cast v1, Lcom/sumsub/sns/core/presentation/base/l;

    goto :goto_3

    :cond_6
    move-object v1, v3

    :goto_3
    if-eqz v1, :cond_5

    move-object v2, p1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/main/i;

    .line 329
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/main/i;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 330
    invoke-virtual {v1, v2}, Lcom/sumsub/sns/core/presentation/base/l;->onErrorCancelled(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    goto :goto_2

    :cond_7
    if-nez p1, :cond_8

    goto :goto_5

    .line 331
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 332
    :cond_9
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/g;

    if-eqz v0, :cond_a

    .line 333
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/f;->a:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/domain/h;

    .line 334
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/domain/h;->a()V

    .line 335
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 336
    :cond_a
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/Z;

    if-eqz v0, :cond_b

    .line 337
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/Z;

    .line 338
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/Z;->a:Lcom/sumsub/sns/internal/core/presentation/intro/g;

    .line 339
    iget-boolean v1, p1, Lcom/sumsub/sns/internal/features/presentation/main/Z;->b:Z

    .line 340
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/Z;->c:Ljava/util/Map;

    .line 341
    invoke-virtual {p0, v0, v1, p1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/core/presentation/intro/g;ZLjava/util/Map;)V

    return-void

    .line 342
    :cond_b
    instance-of v0, p1, Lcom/sumsub/sns/core/presentation/base/n;

    if-eqz v0, :cond_c

    check-cast p1, Lcom/sumsub/sns/core/presentation/base/n;

    .line 343
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/n;->a:Lcom/sumsub/sns/internal/core/common/w;

    .line 344
    invoke-virtual {p0, p1, v3}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Long;)V

    return-void

    .line 345
    :cond_c
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/f;

    if-eqz v0, :cond_e

    .line 346
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    .line 347
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/f;

    .line 348
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/main/f;->c:Ljava/lang/String;

    .line 349
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 350
    iget-boolean v3, p1, Lcom/sumsub/sns/internal/features/presentation/main/f;->a:Z

    if-eqz v3, :cond_d

    const/4 v3, -0x1

    goto :goto_4

    :cond_d
    const/4 v3, 0x0

    .line 351
    :goto_4
    const-string v4, "fragment_result_key"

    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 352
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/f;->b:Landroid/os/Parcelable;

    .line 353
    const-string/jumbo v3, "payload"

    invoke-virtual {v2, v3, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 354
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 355
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentManager;->setFragmentResult(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_e
    :goto_5
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Long;)V
    .locals 3

    if-eqz p2, :cond_0

    .line 31
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {v0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 32
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(Lcom/sumsub/sns/internal/core/common/w;J)V

    return-void

    .line 33
    :cond_0
    instance-of p2, p1, Lcom/sumsub/sns/internal/core/common/u;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_7

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->getBackStackEntryCount()I

    move-result p1

    if-lez p1, :cond_3

    .line 35
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->isStateSaved()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->getBackStackEntryCount()I

    move-result p1

    if-ne p1, v2, :cond_2

    .line 37
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p1}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 38
    invoke-virtual {p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(ZZ)V

    .line 39
    :cond_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p1}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 40
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->e(Z)V

    .line 41
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    return-void

    .line 42
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p1}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    .line 44
    sget v2, Lcom/sumsub/sns/R$id;->sns_container:I

    .line 45
    invoke-virtual {p2, v2}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object p2

    instance-of v2, p2, Lcom/sumsub/sns/core/presentation/base/l;

    if-eqz v2, :cond_4

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/core/presentation/base/l;

    :cond_4
    if-eqz v0, :cond_5

    .line 46
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/l;->onCancelResult()Lcom/sumsub/sns/core/data/model/SNSCompletionResult;

    move-result-object p2

    if-nez p2, :cond_6

    .line 47
    :cond_5
    sget-object p2, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 48
    :cond_6
    invoke-virtual {p1, p2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    return-void

    .line 49
    :cond_7
    instance-of p2, p1, Lcom/sumsub/sns/internal/core/common/s;

    if-eqz p2, :cond_a

    .line 50
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p1}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 51
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->e()V

    .line 52
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->isStateSaved()Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_1

    .line 53
    :cond_8
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1, v0, v2}, Landroidx/fragment/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    .line 54
    :cond_9
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p1}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 55
    invoke-virtual {p1, v2, v2}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(ZZ)V

    return-void

    .line 56
    :cond_a
    instance-of p2, p1, Lcom/sumsub/sns/internal/core/common/t;

    if-eqz p2, :cond_10

    .line 57
    check-cast p1, Lcom/sumsub/sns/internal/core/common/t;

    .line 58
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/core/common/t;->b:Z

    if-eqz p1, :cond_d

    .line 59
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_c

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_c

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->isStateSaved()Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_2

    .line 60
    :cond_b
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1, v0, v2}, Landroidx/fragment/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    .line 61
    :cond_c
    :goto_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p1}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 62
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/main/i2;->c:[Lkotlin/reflect/KProperty;

    .line 63
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->d(Z)V

    return-void

    .line 64
    :cond_d
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p1}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 65
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->e()V

    .line 66
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_f

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_f

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->isStateSaved()Z

    move-result p1

    if-eqz p1, :cond_e

    goto :goto_3

    .line 67
    :cond_e
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1, v0, v2}, Landroidx/fragment/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    .line 68
    :cond_f
    :goto_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p1}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 69
    invoke-virtual {p1, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(ZZ)V

    return-void

    .line 70
    :cond_10
    instance-of p2, p1, Lcom/sumsub/sns/internal/core/common/v;

    if-eqz p2, :cond_14

    .line 71
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p2}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 72
    check-cast p1, Lcom/sumsub/sns/internal/core/common/v;

    .line 73
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/common/v;->b:Lcom/sumsub/sns/core/data/model/SNSCompletionResult;

    if-nez p1, :cond_13

    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    .line 75
    sget v2, Lcom/sumsub/sns/R$id;->sns_container:I

    .line 76
    invoke-virtual {p1, v2}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    move-result-object p1

    instance-of v2, p1, Lcom/sumsub/sns/core/presentation/base/l;

    if-eqz v2, :cond_11

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/core/presentation/base/l;

    :cond_11
    if-eqz v0, :cond_12

    .line 77
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/l;->onCancelResult()Lcom/sumsub/sns/core/data/model/SNSCompletionResult;

    move-result-object p1

    if-nez p1, :cond_13

    .line 78
    :cond_12
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 79
    :cond_13
    invoke-virtual {p2, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    return-void

    .line 80
    :cond_14
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/intro/g;ZLjava/util/Map;)V
    .locals 6

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "showInstructions: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 102
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 103
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 104
    const-string v2, "SNSAppViewModel"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 105
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/intro/j;->c:Lcom/sumsub/sns/internal/features/presentation/intro/d;

    .line 106
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->a:Ljava/lang/String;

    .line 107
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->b:Ljava/lang/String;

    .line 108
    iget-object v3, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->c:Ljava/lang/String;

    .line 109
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->d:Ljava/lang/String;

    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/intro/j;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/intro/j;-><init>()V

    .line 112
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 113
    const-string/jumbo v5, "sns_param_step"

    invoke-virtual {v4, v5, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    const-string/jumbo v1, "sns_param_document_type"

    invoke-virtual {v4, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    const-string/jumbo v1, "sns_param_scene"

    invoke-virtual {v4, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const-string/jumbo v1, "sns_param_country_code"

    invoke-virtual {v4, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const-string/jumbo p1, "sns_param_cancel_on_back"

    invoke-virtual {v4, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 118
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, p3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const-string/jumbo p2, "sns_param_analytics_payload"

    invoke-virtual {v4, p2, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 119
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 120
    const-string p1, "instructions_request_key_internal"

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->forResult(Ljava/lang/String;)Lcom/sumsub/sns/core/presentation/base/l;

    move-result-object p1

    const/4 p2, 0x0

    const/16 p3, 0xc

    .line 121
    const-string v0, "SNSIntroScreenFragment"

    invoke-static {p0, p1, v0, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/A2;)V
    .locals 4

    .line 356
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Show NFC reading screen "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 357
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 358
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 359
    const-string v2, "SNSAppViewModel"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 360
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const/4 v1, 0x1

    const-string v2, "SNSMRTDReadFragment"

    invoke-virtual {v0, v2, v1}, Landroidx/fragment/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    .line 361
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;-><init>()V

    .line 362
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 363
    const-string v3, "ARGS_MRTD_DOCUMENT"

    invoke-virtual {v1, v3, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 364
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    const/4 p1, 0x0

    const/16 v1, 0xc

    .line 365
    invoke-static {p0, v0, v2, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/X;)V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {v0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 82
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)V

    .line 83
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->isStateSaved()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    .line 85
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    invoke-virtual {p1}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 86
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/main/i2;->c:[Lkotlin/reflect/KProperty;

    const/4 v0, 0x0

    .line 87
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->d(Z)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/k0;->h:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->c()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    instance-of v1, v1, Lcom/sumsub/sns/core/data/model/SNSNeedRestartSDKException;

    if-nez v1, :cond_1

    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Restored without callbacks, ignoring error: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 4
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 5
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 6
    const-string p3, "SNSAppActivity"

    invoke-virtual {p2, p3, p1, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    if-eqz p1, :cond_4

    .line 7
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/l0;->c()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v1, Lcom/sumsub/sns/internal/core/common/F0;->a:Ljava/util/Map;

    .line 8
    instance-of v1, v0, Lcom/sumsub/sns/core/data/model/SNSException;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/sumsub/sns/core/data/model/SNSException;

    goto :goto_2

    .line 9
    :cond_2
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_3

    new-instance v1, Lcom/sumsub/sns/core/data/model/SNSException$Network;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/core/data/model/SNSException$Network;-><init>(Ljava/lang/Throwable;)V

    :goto_1
    move-object v0, v1

    goto :goto_2

    .line 10
    :cond_3
    new-instance v1, Lcom/sumsub/sns/core/data/model/SNSException$Internal;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/core/data/model/SNSException$Internal;-><init>(Ljava/lang/Throwable;)V

    goto :goto_1

    .line 11
    :goto_2
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/F0;->a(Lcom/sumsub/sns/core/data/model/SNSException;)V

    .line 12
    :cond_4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->h:Lcom/sumsub/sns/internal/features/presentation/main/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_8

    .line 13
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/k0;

    if-eqz v1, :cond_5

    sget p2, Lcom/sumsub/sns/internal/features/presentation/error/e;->U:I

    .line 14
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/k0;

    .line 15
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/k0;->a:Ljava/lang/String;

    .line 16
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/error/e;

    invoke-direct {p2}, Lcom/sumsub/sns/internal/features/presentation/error/e;-><init>()V

    .line 17
    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    .line 18
    const-string v1, "arg_message"

    invoke-virtual {p4, v1, p1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 19
    const-string p1, "arg_button"

    invoke-virtual {p4, p1, p3}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 20
    invoke-virtual {p2, p4}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 21
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/e;->a:Landroidx/fragment/app/FragmentManager;

    const-string p3, "SNSErrorDialog"

    invoke-virtual {p2, p1, p3}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void

    .line 22
    :cond_5
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/e;->b:Lcom/sumsub/sns/internal/features/presentation/main/u0;

    .line 23
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/error/n;->f:Lcom/sumsub/sns/internal/features/presentation/error/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/error/n;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/error/n;-><init>()V

    .line 25
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 26
    const-string v2, "arg_error"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    if-eqz p2, :cond_6

    .line 27
    const-string p1, "arg_iddocsettype"

    invoke-virtual {v1, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    if-eqz p4, :cond_7

    .line 28
    const-string p1, "arg_request_key"

    invoke-virtual {v1, p1, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    :cond_7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 30
    const-string p1, "ErrorFragment"

    invoke-virtual {p3, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/u0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/main/Y;)V
    .locals 12

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Navigate to: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 123
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 124
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 125
    const-string v2, "SNSAppViewModel"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/X;

    const/16 v1, 0xc

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 127
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment;->Companion:Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$Companion;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/X;

    .line 128
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/X;->c:Ljava/util/List;

    .line 129
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/SNSVideoIdentFragment$Companion;->create(Ljava/util/List;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    .line 130
    const-string v0, "SNSVideoIdentFragment"

    invoke-static {p0, p1, v0, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 131
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/I;

    const-string v4, "ARGS_DOCUMENT"

    if-eqz v0, :cond_1

    .line 132
    sget v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;->U:I

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/I;

    .line 133
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/I;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 134
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/identity/l;-><init>()V

    .line 135
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 136
    const-string p1, "SNSPreviewIdentityDocumentFragment"

    invoke-static {p0, v0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 137
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/O;

    if-eqz v0, :cond_2

    .line 138
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;->k:Lcom/sumsub/sns/internal/features/presentation/preview/selfie/a;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/O;

    .line 139
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/O;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/selfie/g;-><init>()V

    .line 142
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 143
    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 144
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 145
    const-string p1, "PreviewSelfieFragment"

    invoke-static {p0, v0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 146
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/o;

    if-eqz v0, :cond_3

    .line 147
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;->f:Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/b;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/o;

    .line 148
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/o;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/applicantdata/h;-><init>()V

    .line 151
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 152
    const-string p1, "SNSApplicantDataDocumentFragment"

    invoke-static {p0, v0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 153
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/M;

    const-string v5, "SNSPreviewCommonDocumentFragment"

    if-eqz v0, :cond_4

    .line 154
    sget v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/common/f;->U:I

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/M;

    .line 155
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/M;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 156
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/common/f;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/common/f;-><init>()V

    .line 157
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 158
    invoke-static {p0, v0, v5, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 159
    :cond_4
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/K;

    if-eqz v0, :cond_5

    .line 160
    sget v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/common/f;->U:I

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/K;

    .line 161
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/K;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 162
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/common/f;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/common/f;-><init>()V

    .line 163
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 164
    invoke-static {p0, v0, v5, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 165
    :cond_5
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/Q;

    if-eqz v0, :cond_7

    .line 166
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->W:Lcom/sumsub/sns/internal/ff/core/a;

    .line 167
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 168
    sget v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;->U:I

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/Q;

    .line 169
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/Q;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 170
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/poa/f;-><init>()V

    .line 171
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 172
    const-string p1, "SNSProofOfAddressFragment"

    invoke-static {p0, v0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 173
    :cond_6
    sget v0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->V:I

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/Q;

    .line 174
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/Q;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 175
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/poa/g;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/poa/g;-><init>()V

    .line 176
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 177
    const-string p1, "SNSPoaFragmentV2"

    invoke-static {p0, v0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 178
    :cond_7
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/G;

    if-eqz v0, :cond_8

    .line 179
    sget v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/h;->U:I

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/G;

    .line 180
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/G;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 181
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/h;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/h;-><init>()V

    .line 182
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 183
    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 184
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 185
    const-string p1, "SNSPaymentMethodSelectorFragment"

    invoke-static {p0, v0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 186
    :cond_8
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/C;

    if-eqz v0, :cond_9

    .line 187
    sget v0, Lcom/sumsub/sns/internal/features/presentation/geo/g;->U:I

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/C;

    .line 188
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/C;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 189
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/g;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/geo/g;-><init>()V

    .line 190
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 191
    const-string p1, "SNSGeoFragment"

    invoke-static {p0, v0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 192
    :cond_9
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/u;

    const-string v5, "SNSVerificationStepFragment"

    const-string v6, "ValidationIdentifier"

    const-string v7, "VerificationStepHostFragment"

    const-string v8, "VerificationEmbedded"

    const-string v9, "VerificationType"

    const-string v10, "SendPhoneCodeImmediately"

    const/16 v11, 0x8

    if-eqz v0, :cond_b

    .line 193
    sget-object p1, Lcom/sumsub/sns/internal/ff/a;->i:Lcom/sumsub/sns/internal/ff/core/a;

    .line 194
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result p1

    if-eqz p1, :cond_a

    .line 195
    sget p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;->U:I

    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->EMAIL:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 196
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;-><init>()V

    .line 197
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 198
    invoke-virtual {v1, v9, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 199
    invoke-virtual {v1, v8, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 200
    invoke-virtual {v1, v10, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 201
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 202
    invoke-static {p0, v0, v7, v2, v11}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 203
    :cond_a
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->p:Lcom/sumsub/sns/internal/features/presentation/verification/e;

    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->EMAIL:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 204
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/verification/p;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/verification/p;-><init>()V

    .line 206
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 207
    invoke-virtual {v1, v6, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 208
    invoke-virtual {v1, v10, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 209
    invoke-virtual {p1, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 210
    invoke-static {p0, p1, v5, v2, v11}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 211
    :cond_b
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/w;

    if-eqz v0, :cond_d

    .line 212
    sget-object p1, Lcom/sumsub/sns/internal/ff/a;->i:Lcom/sumsub/sns/internal/ff/core/a;

    .line 213
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result p1

    if-eqz p1, :cond_c

    .line 214
    sget p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;->U:I

    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->PHONE:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 215
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;-><init>()V

    .line 216
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 217
    invoke-virtual {v1, v9, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 218
    invoke-virtual {v1, v8, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 219
    invoke-virtual {v1, v10, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 220
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 221
    invoke-static {p0, v0, v7, v2, v11}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 222
    :cond_c
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/verification/p;->p:Lcom/sumsub/sns/internal/features/presentation/verification/e;

    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->PHONE:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 223
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/verification/p;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/verification/p;-><init>()V

    .line 225
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 226
    invoke-virtual {v1, v6, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 227
    invoke-virtual {v1, v10, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 228
    invoke-virtual {p1, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 229
    invoke-static {p0, p1, v5, v2, v11}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 230
    :cond_d
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/T;

    if-eqz v0, :cond_e

    .line 231
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment;->d:Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment$Companion;

    .line 232
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/T;

    .line 233
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/main/T;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 234
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    .line 235
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 236
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/T;->d:Ljava/lang/String;

    .line 237
    invoke-virtual {v0, v1, p1}, Lcom/sumsub/sns/internal/features/presentation/questionnaire/SNSQuestionnaireFragment$Companion;->newInstance(Ljava/lang/String;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    .line 238
    const-string v0, "SNSQuestionnaireFragment2"

    invoke-static {p0, p1, v0, v2, v11}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 239
    :cond_e
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/q;

    const/4 v5, 0x1

    if-eqz v0, :cond_11

    .line 240
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v0, "SNSApplicantStatusFragment"

    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    if-eqz p1, :cond_10

    .line 241
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_18

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_18

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->isStateSaved()Z

    move-result p1

    if-eqz p1, :cond_f

    goto/16 :goto_1

    .line 242
    :cond_f
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1, v3, v5}, Landroidx/fragment/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    return-void

    .line 243
    :cond_10
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/status/m;->o:Lcom/sumsub/sns/internal/features/presentation/status/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/status/m;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/status/m;-><init>()V

    const/4 v1, 0x4

    .line 245
    invoke-static {p0, p1, v0, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 246
    :cond_11
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/E;

    const/16 v6, 0xe

    if-eqz v0, :cond_13

    .line 247
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->T:Lcom/sumsub/sns/internal/ff/core/a;

    .line 248
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v0

    if-nez v0, :cond_12

    .line 249
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment;->j:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment$Companion;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/E;

    .line 250
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/E;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 251
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSLiveness3dFaceFragment$Companion;->newInstance(Lcom/sumsub/sns/internal/features/data/model/common/X;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    goto :goto_0

    .line 252
    :cond_12
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment;->p:Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment$Companion;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/E;

    .line 253
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/E;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 254
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/SNSDefaultLiveness3dFaceFragment$Companion;->newInstance(Lcom/sumsub/sns/internal/features/data/model/common/X;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    .line 255
    :goto_0
    invoke-static {p0, p1, v3, v2, v6}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 256
    :cond_13
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/A;

    if-eqz v0, :cond_14

    .line 257
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;->v:Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/c;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/A;

    .line 258
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/A;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 259
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/m;-><init>()V

    .line 261
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 262
    const-string p1, "SNSEkycFragment"

    invoke-static {p0, v0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 263
    :cond_14
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/y;

    if-eqz v0, :cond_15

    .line 264
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/esign/h;->g:Lcom/sumsub/sns/internal/features/presentation/esign/b;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/y;

    .line 265
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/y;->c:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 266
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/h;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/esign/h;-><init>()V

    .line 268
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 269
    const-string v4, "ARG_DOCUMENT"

    invoke-virtual {v3, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 270
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 271
    const-string p1, "SNSESignFragment"

    invoke-static {p0, v0, p1, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 272
    :cond_15
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/m;

    if-eqz v0, :cond_16

    .line 273
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/consent/f;

    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/presentation/consent/f;-><init>()V

    .line 274
    const-string v0, "SNSConsentFragment"

    invoke-static {p0, p1, v0, v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 275
    :cond_16
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/main/s;->c:Lcom/sumsub/sns/internal/features/presentation/main/s;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 276
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_18

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-nez p1, :cond_18

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->isStateSaved()Z

    move-result p1

    if-eqz p1, :cond_17

    goto :goto_1

    .line 277
    :cond_17
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1, v3, v5}, Landroidx/fragment/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    :cond_18
    :goto_1
    return-void

    .line 278
    :cond_19
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/V;

    if-eqz v0, :cond_1a

    .line 279
    sget v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;->U:I

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/V;

    .line 280
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/main/V;->c:Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;

    .line 281
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/restrictions/n;-><init>()V

    .line 282
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 283
    const-string v4, "arg_initial_state"

    invoke-virtual {v1, v4, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 284
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 285
    invoke-static {p0, v0, v3, v2, v6}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;Landroidx/fragment/app/Fragment;Ljava/lang/String;ZI)V

    return-void

    .line 286
    :cond_1a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "SNSAppViewModel"

    if-eqz p2, :cond_0

    .line 366
    :try_start_0
    sget-object p2, Lcom/sumsub/sns/core/SNSMobileSDK;->INSTANCE:Lcom/sumsub/sns/core/SNSMobileSDK;

    invoke-virtual {p2}, Lcom/sumsub/sns/core/SNSMobileSDK;->getUrlHandler()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p2, p0, p1}, Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;->onUrl(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p2

    const/4 v2, 0x1

    if-ne p2, v2, :cond_0

    .line 367
    const-string p2, "handled by host application"

    .line 368
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 369
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 370
    invoke-virtual {v2, v1, p2, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :catch_0
    move-exception p2

    goto :goto_0

    .line 371
    :cond_0
    const-string p2, "handle url using system default behaviour"

    .line 372
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 373
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 374
    invoke-virtual {v2, v1, p2, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 375
    new-instance p2, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 376
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 377
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 378
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t open deep link "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 379
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 380
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 381
    invoke-virtual {v0, v1, p1, p2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/content/res/Configuration;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 14
    .line 15
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->e:Ljava/util/Locale;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->attachBaseContext(Landroid/content/Context;)V

    .line 26
    .line 27
    const-string v0, "com.sumsub.sns.dynamicfeature.BuildConfig"

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/N0;->a(Ljava/lang/String;)Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    sget-object v0, Lcom/sumsub/sns/dynamicfeature/SNSDynamicFeatureInstaller;->INSTANCE:Lcom/sumsub/sns/dynamicfeature/SNSDynamicFeatureInstaller;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/dynamicfeature/SNSDynamicFeatureInstaller;->installActivity(Landroid/content/Context;)V

    .line 39
    :cond_0
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
.end method

.method public final b()V
    .locals 3

    .line 13
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->g:Lcom/sumsub/sns/internal/core/common/m0;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/p2;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/main/p2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/internal/core/common/m0;->a(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final onBackPressed()V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 5
    .line 6
    const-string v1, "SNSAppActivity"

    .line 7
    .line 8
    .line 9
    const-string/jumbo v2, "onBackPressed()"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    sget v1, Lcom/sumsub/sns/R$id;->sns_container:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    instance-of v2, v0, Lcom/sumsub/sns/core/presentation/base/l;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    check-cast v0, Lcom/sumsub/sns/core/presentation/base/l;

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v0, v3

    .line 32
    :goto_0
    const/4 v2, 0x0

    .line 33
    .line 34
    if-nez v0, :cond_4

    .line 35
    .line 36
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    instance-of v4, v1, Lcom/sumsub/sns/core/presentation/base/l;

    .line 53
    .line 54
    if-eqz v4, :cond_1

    .line 55
    move-object v3, v1

    .line 56
    .line 57
    check-cast v3, Lcom/sumsub/sns/core/presentation/base/l;

    .line 58
    .line 59
    :cond_1
    if-eqz v3, :cond_2

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Lcom/sumsub/sns/core/presentation/base/l;->onCancelResult()Lcom/sumsub/sns/core/data/model/SNSCompletionResult;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    :cond_2
    sget-object v1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    .line 71
    return-void

    .line 72
    .line 73
    :cond_4
    sget-object v1, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/presentation/base/l;->onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 77
    move-result v0

    .line 78
    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getBackStackEntryCount()I

    .line 87
    move-result v0

    .line 88
    const/4 v1, 0x1

    .line 89
    .line 90
    if-ne v0, v1, :cond_5

    .line 91
    .line 92
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(ZZ)V

    .line 102
    goto :goto_1

    .line 103
    :cond_5
    move v1, v2

    .line 104
    .line 105
    :goto_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->e:Landroidx/lifecycle/ViewModelLazy;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Landroidx/lifecycle/ViewModelLazy;->getValue()Ljava/lang/Object;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v2}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->e(Z)V

    .line 115
    .line 116
    if-nez v1, :cond_6

    .line 117
    .line 118
    .line 119
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 120
    :cond_6
    return-void
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
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/f;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    sget-object p1, Lcom/sumsub/sns/core/SNSMobileSDK;->INSTANCE:Lcom/sumsub/sns/core/SNSMobileSDK;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/sumsub/sns/core/SNSMobileSDK;->toString()Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 14
    .line 15
    const-string v1, "SNSAppViewModel"

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    sget p1, Lcom/sumsub/sns/R$id;->sns_progress:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    check-cast p1, Lcom/sumsub/sns/core/widget/SNSProgressView;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->f:Lcom/sumsub/sns/core/widget/SNSProgressView;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/q2;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/main/q2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;)V

    .line 39
    .line 40
    const-string v1, "geo_request_fallback"

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/r2;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/main/r2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;)V

    .line 53
    .line 54
    const-string v1, "instructions_request_key_internal"

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/FragmentManager;->setFragmentResultListener(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/fragment/app/FragmentResultListener;)V

    .line 58
    return-void
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
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget v1, Lcom/sumsub/sns/R$id;->sns_container:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    instance-of v1, v0, Lcom/sumsub/sns/core/presentation/base/l;

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, Lcom/sumsub/sns/core/presentation/base/l;

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v2

    .line 20
    .line 21
    :goto_0
    instance-of v1, v0, Lcom/sumsub/sns/internal/core/common/M0;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    move-object v2, v0

    .line 25
    .line 26
    check-cast v2, Lcom/sumsub/sns/internal/core/common/M0;

    .line 27
    .line 28
    :cond_1
    if-eqz v2, :cond_2

    .line 29
    .line 30
    .line 31
    invoke-interface {v2, p1, p2}, Lcom/sumsub/sns/internal/core/common/M0;->onKeyDown(ILandroid/view/KeyEvent;)Ljava/lang/Boolean;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    move-result p1

    .line 39
    return p1

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 43
    move-result p1

    .line 44
    return p1
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

.method public final onPause()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/f;->onPause()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->g:Lcom/sumsub/sns/internal/core/common/m0;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/m0;->a()V

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
.end method

.method public final onResume()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/f;->onResume()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->b()V

    .line 7
    return-void
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
