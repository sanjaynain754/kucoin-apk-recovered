.class public final Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;
.super Lcom/kubi/resources/dialog/DialogFragmentHelper;
.source "AirdropPositionPnlDetailsDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 22\u00020\u0001:\u00012B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0017\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001eH\u0002J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u001eH\u0002J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\u001eH\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*H\u0002J\u0014\u0010+\u001a\u00020**\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020,R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001d\u0010\u000c\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u00063"
    }
    d2 = {
        "Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
        "<init>",
        "()V",
        "entity",
        "Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;",
        "getEntity",
        "()Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;",
        "entity$delegate",
        "Lkotlin/Lazy;",
        "initType",
        "",
        "viewBinding",
        "Lcom/kubi/kumex/databinding/BkumexDialogAirdropPnlBinding;",
        "getViewBinding",
        "()Lcom/kubi/kumex/databinding/BkumexDialogAirdropPnlBinding;",
        "viewBinding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onViewCreated",
        "",
        "view",
        "getPositionPeriodTime",
        "",
        "positionPeriod",
        "",
        "(Ljava/lang/Long;)Ljava/lang/String;",
        "getSideDesc",
        "side",
        "getSideTextColor",
        "getSideBackgroundColor",
        "getMarginDesc",
        "marginMode",
        "gotoShare",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "createBitmap",
        "Landroid/content/Context;",
        "param",
        "Lcom/kubi/futures/trade/welfare/airdrop/AirdropShareParam;",
        "formatReferralCode",
        "Lcom/kubi/utils/StyledText;",
        "context",
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
        "SMAP\nAirdropPositionPnlDetailsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirdropPositionPnlDetailsDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,311:1\n143#2,20:312\n*S KotlinDebug\n*F\n+ 1 AirdropPositionPnlDetailsDialog.kt\ncom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog\n*L\n72#1:312,20\n*E\n"
    }
.end annotation


# static fields
.field public static final s0:Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic t0:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final q0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r0:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogAirdropPnlBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;

    .line 8
    .line 9
    const-string v4, "viewBinding"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    sput-object v1, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->t0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->s0:Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog$Companion;

    .line 32
    return-void
    .line 33
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/futures/trade/welfare/airdrop/y;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/welfare/airdrop/y;-><init>(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->q0:Lkotlin/Lazy;

    .line 15
    .line 16
    sget-object v0, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog$special$$inlined$viewBindingFragment$default$1;->INSTANCE:Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog$special$$inlined$viewBindingFragment$default$1;

    .line 17
    .line 18
    new-instance v1, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog$special$$inlined$viewBindingFragment$default$2;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog$special$$inlined$viewBindingFragment$default$2;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->r0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static final A4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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

.method public static synthetic j4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;)Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->o4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;)Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;

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

.method public static synthetic k4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->A4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;Landroid/view/View;)Lkotlin/Unit;

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

.method public static synthetic l4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->z4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;Landroid/view/View;)Lkotlin/Unit;

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

.method public static synthetic m4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static/range {p0 .. p11}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->y4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)Lkotlin/Unit;

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
.end method

.method public static final o4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;)Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string v0, "data"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
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

.method public static final y4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View;)Lkotlin/Unit;
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "it"

    .line 5
    .line 6
    move-object/from16 v2, p11

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getSide()Ljava/lang/String;

    .line 16
    move-result-object v5

    .line 17
    .line 18
    sget v1, Lcom/kubi/kumex/R$string;->kumex_airdrop_card_title:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 22
    move-result-object v8

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getProfit()Ljava/math/BigDecimal;

    .line 26
    move-result-object v12

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getProfitRate()Ljava/math/BigDecimal;

    .line 30
    move-result-object v14

    .line 31
    .line 32
    new-instance v2, Lcom/kubi/futures/trade/welfare/airdrop/o0;

    .line 33
    .line 34
    move-object/from16 v3, p2

    .line 35
    .line 36
    move-object/from16 v4, p3

    .line 37
    .line 38
    move-object/from16 v6, p4

    .line 39
    .line 40
    move-object/from16 v7, p5

    .line 41
    .line 42
    move-object/from16 v9, p6

    .line 43
    .line 44
    move-object/from16 v10, p7

    .line 45
    .line 46
    move-object/from16 v11, p8

    .line 47
    .line 48
    move-object/from16 v13, p9

    .line 49
    .line 50
    move-object/from16 v15, p10

    .line 51
    .line 52
    .line 53
    invoke-direct/range {v2 .. v15}, Lcom/kubi/futures/trade/welfare/airdrop/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    const-string v3, "requireContext(...)"

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->n4(Landroid/content/Context;Lcom/kubi/futures/trade/welfare/airdrop/o0;)Landroid/graphics/Bitmap;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->x4(Landroid/graphics/Bitmap;)V

    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 72
    return-object v0
.end method

.method public static final z4(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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


# virtual methods
.method public N3()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, -0xb

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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final n4(Landroid/content/Context;Lcom/kubi/futures/trade/welfare/airdrop/o0;)Landroid/graphics/Bitmap;
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const/16 v6, 0xc

    .line 7
    const/4 v7, 0x0

    .line 8
    .line 9
    const-string v2, "B6futures"

    .line 10
    .line 11
    const-string v3, "AirDropPositionCloseShare"

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v2 .. v7}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->b()I

    .line 20
    move-result v2

    .line 21
    .line 22
    const/16 v3, 0x30

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/core/c;->b(Landroid/content/Context;I)I

    .line 26
    move-result v3

    .line 27
    sub-int/2addr v2, v3

    .line 28
    .line 29
    mul-int/lit16 v3, v2, 0x696

    .line 30
    int-to-float v3, v3

    .line 31
    .line 32
    .line 33
    const v4, 0x448ca000    # 1125.0f

    .line 34
    div-float/2addr v3, v4

    .line 35
    float-to-int v3, v3

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    sget v5, Lcom/kubi/kumex/R$layout;->bkumex_fragment_share_airdrop_pnl:I

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v7, 0x0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v5, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 47
    move-result-object v4

    .line 48
    .line 49
    sget v5, Lcom/kubi/kumex/R$id;->tvContract:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    check-cast v5, Landroid/widget/TextView;

    .line 56
    .line 57
    sget v8, Lcom/kubi/kumex/R$id;->side:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 61
    move-result-object v8

    .line 62
    .line 63
    check-cast v8, Landroid/widget/TextView;

    .line 64
    .line 65
    sget v9, Lcom/kubi/kumex/R$id;->pnl_desc:I

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    move-result-object v9

    .line 70
    .line 71
    check-cast v9, Landroid/widget/TextView;

    .line 72
    .line 73
    sget v10, Lcom/kubi/kumex/R$id;->marginMode:I

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 77
    move-result-object v10

    .line 78
    .line 79
    check-cast v10, Landroid/widget/TextView;

    .line 80
    .line 81
    sget v11, Lcom/kubi/kumex/R$id;->leverage:I

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 85
    move-result-object v11

    .line 86
    .line 87
    check-cast v11, Landroid/widget/TextView;

    .line 88
    .line 89
    sget v12, Lcom/kubi/kumex/R$id;->trialTag:I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 93
    move-result-object v12

    .line 94
    .line 95
    check-cast v12, Landroid/widget/TextView;

    .line 96
    .line 97
    sget v13, Lcom/kubi/kumex/R$id;->airdropMarginValue:I

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 101
    move-result-object v13

    .line 102
    .line 103
    check-cast v13, Landroid/widget/TextView;

    .line 104
    .line 105
    sget v14, Lcom/kubi/kumex/R$id;->airdropTimeValue:I

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 109
    move-result-object v14

    .line 110
    .line 111
    check-cast v14, Landroid/widget/TextView;

    .line 112
    .line 113
    sget v15, Lcom/kubi/kumex/R$id;->airdropPnlValue:I

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 117
    move-result-object v15

    .line 118
    .line 119
    check-cast v15, Landroid/widget/TextView;

    .line 120
    .line 121
    sget v6, Lcom/kubi/kumex/R$id;->airdropPnlRateValue:I

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 125
    move-result-object v6

    .line 126
    .line 127
    check-cast v6, Landroid/widget/TextView;

    .line 128
    .line 129
    sget v7, Lcom/kubi/kumex/R$id;->referralCode:I

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 133
    move-result-object v7

    .line 134
    .line 135
    check-cast v7, Landroid/widget/TextView;

    .line 136
    .line 137
    move/from16 v17, v2

    .line 138
    .line 139
    sget v2, Lcom/kubi/kumex/R$id;->airdropWithDrawAmountValue:I

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 143
    move-result-object v2

    .line 144
    .line 145
    check-cast v2, Landroid/widget/TextView;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->k()Ljava/lang/String;

    .line 149
    move-result-object v18

    .line 150
    .line 151
    sget-object v19, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 152
    .line 153
    move/from16 v20, v3

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v19 .. v19}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 157
    move-result-object v3

    .line 158
    .line 159
    move-object/from16 v19, v4

    .line 160
    .line 161
    .line 162
    invoke-static/range {v18 .. v18}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    move-result-object v4

    .line 164
    .line 165
    move-object/from16 v21, v2

    .line 166
    const/4 v2, 0x2

    .line 167
    .line 168
    move-object/from16 v16, v6

    .line 169
    .line 170
    move-object/from16 v22, v7

    .line 171
    const/4 v6, 0x0

    .line 172
    const/4 v7, 0x0

    .line 173
    .line 174
    .line 175
    invoke-static {v3, v4, v6, v2, v7}, Lth/d;->O(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 176
    move-result-object v2

    .line 177
    .line 178
    if-eqz v2, :cond_0

    .line 179
    .line 180
    sget-object v3, Lcom/kubi/futures/a;->a:Lcom/kubi/futures/a;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v2}, Lcom/kubi/futures/a;->e(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Lcom/kubi/utils/v0;

    .line 184
    move-result-object v2

    .line 185
    .line 186
    if-eqz v2, :cond_0

    .line 187
    goto :goto_0

    .line 188
    .line 189
    :cond_0
    move-object/from16 v2, v18

    .line 190
    .line 191
    :goto_0
    sget v3, Lcom/kubi/kumex/R$string;->airdrop_pnl_share_desc:I

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 195
    move-result-object v3

    .line 196
    .line 197
    .line 198
    invoke-virtual {v9, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    .line 200
    sget-object v3, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 201
    .line 202
    .line 203
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 204
    .line 205
    new-instance v4, Lkotlin/Pair;

    .line 206
    .line 207
    sget-object v6, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 208
    .line 209
    new-instance v7, Landroid/text/style/ForegroundColorSpan;

    .line 210
    .line 211
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 212
    .line 213
    move-object/from16 v23, v15

    .line 214
    .line 215
    sget v15, Lcom/kubi/kumex/R$color;->illustrationGreen:I

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, v15}, Lcom/kubi/utils/c;->a(I)I

    .line 219
    move-result v1

    .line 220
    .line 221
    .line 222
    invoke-direct {v7, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 223
    .line 224
    .line 225
    invoke-direct {v4, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 229
    move-result-object v1

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, v9, v1}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->j()Ljava/lang/String;

    .line 239
    move-result-object v1

    .line 240
    .line 241
    .line 242
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->q4()Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;

    .line 246
    move-result-object v1

    .line 247
    .line 248
    if-eqz v1, :cond_1

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getSide()Ljava/lang/String;

    .line 252
    move-result-object v1

    .line 253
    goto :goto_1

    .line 254
    :cond_1
    const/4 v1, 0x0

    .line 255
    .line 256
    .line 257
    :goto_1
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    move-result-object v1

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v1}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->t4(Ljava/lang/String;)I

    .line 262
    move-result v1

    .line 263
    .line 264
    .line 265
    invoke-virtual {v8, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->q4()Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;

    .line 269
    move-result-object v1

    .line 270
    .line 271
    if-eqz v1, :cond_2

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getSide()Ljava/lang/String;

    .line 275
    move-result-object v6

    .line 276
    goto :goto_2

    .line 277
    :cond_2
    const/4 v6, 0x0

    .line 278
    .line 279
    .line 280
    :goto_2
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    move-result-object v1

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v1}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->v4(Ljava/lang/String;)I

    .line 285
    move-result v1

    .line 286
    .line 287
    .line 288
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->i()Ljava/lang/String;

    .line 292
    move-result-object v1

    .line 293
    .line 294
    .line 295
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->h()Ljava/lang/String;

    .line 299
    move-result-object v1

    .line 300
    .line 301
    .line 302
    invoke-virtual {v11, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->l()Ljava/lang/String;

    .line 306
    move-result-object v1

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->a()Ljava/lang/String;

    .line 313
    move-result-object v1

    .line 314
    .line 315
    .line 316
    invoke-virtual {v13, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->f()Ljava/lang/String;

    .line 320
    move-result-object v1

    .line 321
    .line 322
    .line 323
    invoke-virtual {v14, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->e()Ljava/lang/String;

    .line 327
    move-result-object v1

    .line 328
    .line 329
    move-object/from16 v15, v23

    .line 330
    .line 331
    .line 332
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->d()Ljava/lang/String;

    .line 336
    move-result-object v1

    .line 337
    .line 338
    move-object/from16 v6, v16

    .line 339
    .line 340
    .line 341
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {p0 .. p1}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->p4(Landroid/content/Context;)Lcom/kubi/utils/v0;

    .line 345
    move-result-object v1

    .line 346
    .line 347
    move-object/from16 v7, v22

    .line 348
    .line 349
    .line 350
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->g()Ljava/lang/String;

    .line 354
    move-result-object v1

    .line 355
    .line 356
    move-object/from16 v2, v21

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 363
    move-result-object v1

    .line 364
    .line 365
    const-string v2, "requireContext(...)"

    .line 366
    .line 367
    .line 368
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->b()Ljava/math/BigDecimal;

    .line 372
    move-result-object v3

    .line 373
    .line 374
    if-nez v3, :cond_3

    .line 375
    .line 376
    sget-object v3, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 377
    .line 378
    :cond_3
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 382
    move-result v3

    .line 383
    const/4 v5, 0x1

    .line 384
    .line 385
    if-lez v3, :cond_4

    .line 386
    move v3, v5

    .line 387
    goto :goto_3

    .line 388
    :cond_4
    const/4 v3, 0x0

    .line 389
    .line 390
    .line 391
    :goto_3
    invoke-static {v1, v3}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 392
    move-result v1

    .line 393
    .line 394
    .line 395
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 399
    move-result-object v1

    .line 400
    .line 401
    .line 402
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/futures/trade/welfare/airdrop/o0;->c()Ljava/math/BigDecimal;

    .line 406
    move-result-object v2

    .line 407
    .line 408
    if-nez v2, :cond_5

    .line 409
    move-object v2, v4

    .line 410
    .line 411
    .line 412
    :cond_5
    invoke-virtual {v2, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 413
    move-result v2

    .line 414
    .line 415
    if-lez v2, :cond_6

    .line 416
    move v7, v5

    .line 417
    goto :goto_4

    .line 418
    :cond_6
    const/4 v7, 0x0

    .line 419
    .line 420
    .line 421
    :goto_4
    invoke-static {v1, v7}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 422
    move-result v1

    .line 423
    .line 424
    .line 425
    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 426
    .line 427
    .line 428
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 429
    .line 430
    move/from16 v2, v17

    .line 431
    .line 432
    move-object/from16 v3, v19

    .line 433
    .line 434
    move/from16 v1, v20

    .line 435
    .line 436
    .line 437
    invoke-static {v3, v2, v1}, Lcom/kubi/kumex/utils/ViewExKt;->q(Landroid/view/View;II)Landroid/graphics/Bitmap;

    .line 438
    move-result-object v1

    .line 439
    return-object v1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string p3, "inflater"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget p3, Lcom/kubi/kumex/R$layout;->bkumex_dialog_airdrop_pnl:I

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 25
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    const-string v0, "view"

    .line 5
    .line 6
    move-object/from16 v2, p1

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super/range {p0 .. p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->w4()Ldm/e;

    .line 16
    move-result-object v12

    .line 17
    .line 18
    if-nez v12, :cond_0

    .line 19
    return-void

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v1}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->q4()Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 29
    return-void

    .line 30
    .line 31
    :cond_1
    const/16 v7, 0xc

    .line 32
    const/4 v8, 0x0

    .line 33
    .line 34
    const-string v3, "B6futures"

    .line 35
    .line 36
    const-string v4, "AirDropPositionClose"

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static/range {v3 .. v8}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getSymbol()Ljava/lang/String;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    sget-object v0, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    move-result-object v4

    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v6, 0x2

    .line 58
    const/4 v7, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v4, v5, v6, v7}, Lth/d;->O(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->getSettleCurrency()Ljava/lang/String;

    .line 68
    move-result-object v4

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-object v4, v7

    .line 71
    .line 72
    :goto_0
    if-eqz v0, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Lfm/b;->m(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 76
    move-result v6

    .line 77
    :cond_3
    move v15, v6

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    sget-object v6, Lcom/kubi/futures/a;->a:Lcom/kubi/futures/a;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v0}, Lcom/kubi/futures/a;->e(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Lcom/kubi/utils/v0;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    move-object v0, v3

    .line 90
    .line 91
    .line 92
    :goto_1
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getSide()Ljava/lang/String;

    .line 93
    move-result-object v6

    .line 94
    .line 95
    .line 96
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    move-result-object v6

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v6}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->u4(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    move-result-object v6

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getMarginMode()Ljava/lang/String;

    .line 105
    move-result-object v8

    .line 106
    .line 107
    .line 108
    invoke-static {v8}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    move-result-object v8

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v8}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->r4(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    move-result-object v8

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getLeverage()Ljava/math/BigDecimal;

    .line 117
    move-result-object v9

    .line 118
    .line 119
    .line 120
    invoke-static {v9, v5}, Lcom/kubi/kumex/utils/k0;->c(Ljava/math/BigDecimal;Z)Ljava/lang/String;

    .line 121
    move-result-object v9

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getAirdropPositionMargin()Ljava/math/BigDecimal;

    .line 125
    move-result-object v13

    .line 126
    .line 127
    if-eqz v13, :cond_5

    .line 128
    .line 129
    const/16 v21, 0x79

    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    const/4 v14, 0x0

    .line 133
    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    const/16 v19, 0x0

    .line 141
    .line 142
    const/16 v20, 0x0

    .line 143
    .line 144
    .line 145
    invoke-static/range {v13 .. v22}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 146
    move-result-object v10

    .line 147
    .line 148
    move-object/from16 v16, v10

    .line 149
    goto :goto_2

    .line 150
    .line 151
    :cond_5
    move-object/from16 v16, v7

    .line 152
    .line 153
    .line 154
    :goto_2
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    move-result-object v17

    .line 156
    .line 157
    const/16 v20, 0x4

    .line 158
    .line 159
    const/16 v21, 0x0

    .line 160
    .line 161
    const/16 v18, 0x1

    .line 162
    .line 163
    const/16 v19, 0x0

    .line 164
    .line 165
    .line 166
    invoke-static/range {v16 .. v21}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 167
    move-result-object v10

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getPositionPeriod()Ljava/lang/Long;

    .line 171
    move-result-object v11

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v11}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->s4(Ljava/lang/Long;)Ljava/lang/String;

    .line 175
    move-result-object v11

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getProfit()Ljava/math/BigDecimal;

    .line 179
    move-result-object v13

    .line 180
    .line 181
    if-eqz v13, :cond_6

    .line 182
    .line 183
    const/16 v21, 0x79

    .line 184
    .line 185
    const/16 v22, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    .line 188
    const/16 v16, 0x1

    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    const/16 v18, 0x0

    .line 193
    .line 194
    const/16 v19, 0x0

    .line 195
    .line 196
    const/16 v20, 0x0

    .line 197
    .line 198
    .line 199
    invoke-static/range {v13 .. v22}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 200
    move-result-object v13

    .line 201
    .line 202
    move-object/from16 v16, v13

    .line 203
    goto :goto_3

    .line 204
    .line 205
    :cond_6
    move-object/from16 v16, v7

    .line 206
    .line 207
    .line 208
    :goto_3
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    move-result-object v17

    .line 210
    .line 211
    const/16 v20, 0x4

    .line 212
    .line 213
    const/16 v21, 0x0

    .line 214
    .line 215
    const/16 v18, 0x1

    .line 216
    .line 217
    const/16 v19, 0x0

    .line 218
    .line 219
    .line 220
    invoke-static/range {v16 .. v21}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 221
    move-result-object v13

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getProfitRate()Ljava/math/BigDecimal;

    .line 225
    move-result-object v14

    .line 226
    .line 227
    if-nez v14, :cond_7

    .line 228
    .line 229
    sget-object v14, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 230
    .line 231
    :cond_7
    move-object/from16 v16, v14

    .line 232
    .line 233
    if-eqz v16, :cond_8

    .line 234
    .line 235
    const/16 v23, 0x37

    .line 236
    .line 237
    const/16 v24, 0x0

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const/16 v18, 0x0

    .line 242
    .line 243
    const/16 v19, 0x0

    .line 244
    .line 245
    const/16 v20, 0x1

    .line 246
    .line 247
    const/16 v21, 0x0

    .line 248
    .line 249
    const/16 v22, 0x0

    .line 250
    .line 251
    .line 252
    invoke-static/range {v16 .. v24}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 253
    move-result-object v14

    .line 254
    .line 255
    :goto_4
    move-object/from16 v5, v16

    .line 256
    .line 257
    move-object/from16 v16, v13

    .line 258
    goto :goto_5

    .line 259
    :cond_8
    move-object v14, v7

    .line 260
    goto :goto_4

    .line 261
    .line 262
    .line 263
    :goto_5
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getWithdrawAmount()Ljava/math/BigDecimal;

    .line 264
    move-result-object v13

    .line 265
    .line 266
    if-eqz v13, :cond_9

    .line 267
    .line 268
    const/16 v21, 0x79

    .line 269
    .line 270
    const/16 v22, 0x0

    .line 271
    move-object v7, v14

    .line 272
    const/4 v14, 0x0

    .line 273
    .line 274
    move-object/from16 v17, v16

    .line 275
    .line 276
    const/16 v16, 0x1

    .line 277
    .line 278
    move-object/from16 v18, v17

    .line 279
    .line 280
    const/16 v17, 0x0

    .line 281
    .line 282
    move-object/from16 v19, v18

    .line 283
    .line 284
    const/16 v18, 0x0

    .line 285
    .line 286
    move-object/from16 v20, v19

    .line 287
    .line 288
    const/16 v19, 0x0

    .line 289
    .line 290
    move-object/from16 v23, v20

    .line 291
    .line 292
    const/16 v20, 0x0

    .line 293
    .line 294
    .line 295
    invoke-static/range {v13 .. v22}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 296
    move-result-object v13

    .line 297
    move-object v14, v7

    .line 298
    move-object v15, v13

    .line 299
    .line 300
    move-object/from16 v13, v23

    .line 301
    goto :goto_6

    .line 302
    .line 303
    :cond_9
    move-object/from16 v13, v16

    .line 304
    move-object v15, v7

    .line 305
    .line 306
    .line 307
    :goto_6
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    move-result-object v16

    .line 309
    .line 310
    const/16 v19, 0x4

    .line 311
    .line 312
    const/16 v20, 0x0

    .line 313
    .line 314
    const/16 v17, 0x1

    .line 315
    .line 316
    const/16 v18, 0x0

    .line 317
    .line 318
    .line 319
    invoke-static/range {v15 .. v20}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 320
    move-result-object v4

    .line 321
    .line 322
    iget-object v7, v12, Ldm/e;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    .line 327
    iget-object v0, v12, Ldm/e;->p:Lcom/kubi/resources/widget/KcTradeRateView;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 331
    .line 332
    iget-object v0, v12, Ldm/e;->p:Lcom/kubi/resources/widget/KcTradeRateView;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getSide()Ljava/lang/String;

    .line 336
    move-result-object v7

    .line 337
    .line 338
    .line 339
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    move-result-object v7

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1, v7}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->t4(Ljava/lang/String;)I

    .line 344
    move-result v7

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v7}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 348
    .line 349
    iget-object v0, v12, Ldm/e;->p:Lcom/kubi/resources/widget/KcTradeRateView;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getSide()Ljava/lang/String;

    .line 353
    move-result-object v7

    .line 354
    .line 355
    .line 356
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    move-result-object v7

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1, v7}, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->v4(Ljava/lang/String;)I

    .line 361
    move-result v7

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v7}, Lcom/kubi/resources/widget/KcTradeRateView;->setTextColor(I)V

    .line 365
    .line 366
    iget-object v0, v12, Ldm/e;->o:Lcom/kubi/resources/widget/BaseTextView;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    .line 371
    iget-object v0, v12, Ldm/e;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    .line 376
    iget-object v0, v12, Ldm/e;->q:Lcom/kubi/resources/widget/BaseTextView;

    .line 377
    .line 378
    sget v7, Lcom/kubi/kumex/R$string;->kumex_airdrop_card_title:I

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 382
    move-result-object v7

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 386
    .line 387
    iget-object v0, v12, Ldm/e;->c:Lcom/kubi/resources/widget/BaseTextView;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 391
    .line 392
    iget-object v0, v12, Ldm/e;->i:Lcom/kubi/resources/widget/BaseTextView;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 396
    .line 397
    iget-object v0, v12, Ldm/e;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    .line 402
    iget-object v0, v12, Ldm/e;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 406
    .line 407
    iget-object v0, v12, Ldm/e;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 411
    move-result-object v7

    .line 412
    .line 413
    const-string v15, "requireContext(...)"

    .line 414
    .line 415
    .line 416
    invoke-static {v7, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;->getProfit()Ljava/math/BigDecimal;

    .line 420
    move-result-object v16

    .line 421
    .line 422
    if-nez v16, :cond_a

    .line 423
    .line 424
    sget-object v16, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 425
    .line 426
    :cond_a
    move-object/from16 p2, v2

    .line 427
    .line 428
    move-object/from16 v1, v16

    .line 429
    .line 430
    sget-object v2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 434
    move-result v1

    .line 435
    .line 436
    const/16 v16, 0x1

    .line 437
    .line 438
    if-lez v1, :cond_b

    .line 439
    .line 440
    move/from16 v1, v16

    .line 441
    goto :goto_7

    .line 442
    :cond_b
    const/4 v1, 0x0

    .line 443
    .line 444
    .line 445
    :goto_7
    invoke-static {v7, v1}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 446
    move-result v1

    .line 447
    .line 448
    .line 449
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 450
    .line 451
    iget-object v0, v12, Ldm/e;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 455
    move-result-object v1

    .line 456
    .line 457
    .line 458
    invoke-static {v1, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v5, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 462
    move-result v2

    .line 463
    .line 464
    if-lez v2, :cond_c

    .line 465
    .line 466
    move/from16 v5, v16

    .line 467
    goto :goto_8

    .line 468
    :cond_c
    const/4 v5, 0x0

    .line 469
    .line 470
    .line 471
    :goto_8
    invoke-static {v1, v5}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 472
    move-result v1

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 476
    .line 477
    iget-object v0, v12, Ldm/e;->k:Lcom/kubi/resources/widget/BaseTextView;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 481
    .line 482
    iget-object v15, v12, Ldm/e;->t:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 483
    .line 484
    const-string v0, "tvRightBtn"

    .line 485
    .line 486
    .line 487
    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    .line 489
    new-instance v0, Lcom/kubi/futures/trade/welfare/airdrop/z;

    .line 490
    .line 491
    move-object/from16 v1, p0

    .line 492
    .line 493
    move-object/from16 v2, p2

    .line 494
    move-object v5, v8

    .line 495
    move-object v7, v10

    .line 496
    move-object v8, v11

    .line 497
    move-object v10, v14

    .line 498
    move-object v11, v4

    .line 499
    move-object v4, v6

    .line 500
    move-object v6, v9

    .line 501
    move-object v9, v13

    .line 502
    .line 503
    .line 504
    invoke-direct/range {v0 .. v11}, Lcom/kubi/futures/trade/welfare/airdrop/z;-><init>(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    invoke-static {v15, v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->f(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 508
    .line 509
    iget-object v0, v12, Ldm/e;->m:Landroid/widget/ImageView;

    .line 510
    .line 511
    const-string v2, "ivClose"

    .line 512
    .line 513
    .line 514
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 515
    .line 516
    new-instance v2, Lcom/kubi/futures/trade/welfare/airdrop/a0;

    .line 517
    .line 518
    .line 519
    invoke-direct {v2, v1}, Lcom/kubi/futures/trade/welfare/airdrop/a0;-><init>(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;)V

    .line 520
    .line 521
    .line 522
    invoke-static {v0, v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->f(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 523
    .line 524
    iget-object v0, v12, Ldm/e;->s:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 525
    .line 526
    const-string v2, "tvLeftBtn"

    .line 527
    .line 528
    .line 529
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 530
    .line 531
    new-instance v2, Lcom/kubi/futures/trade/welfare/airdrop/b0;

    .line 532
    .line 533
    .line 534
    invoke-direct {v2, v1}, Lcom/kubi/futures/trade/welfare/airdrop/b0;-><init>(Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;)V

    .line 535
    .line 536
    .line 537
    invoke-static {v0, v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->f(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 538
    return-void
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
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
.end method

.method public final p4(Landroid/content/Context;)Lcom/kubi/utils/v0;
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/share/api/IShareService;->a:Lcom/kubi/share/api/IShareService$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/share/api/IShareService$Companion;->get()Lcom/kubi/share/api/IShareService;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lcom/kubi/share/api/IShareService;->e()Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    sget v0, Lcom/kubi/kumex/R$string;->share_rcode:I

    .line 18
    .line 19
    .line 20
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    const-string v0, "getString(...)"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    new-instance v0, Lcom/kubi/utils/v0;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0}, Lcom/kubi/utils/v0;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 39
    const/4 v5, 0x6

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    .line 46
    move-result v2

    .line 47
    .line 48
    if-gez v2, :cond_0

    .line 49
    const/4 v2, 0x0

    .line 50
    .line 51
    :cond_0
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    sget v4, Lcom/kubi/kumex/R$color;->c_text_white:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getColor(I)I

    .line 61
    move-result p1

    .line 62
    .line 63
    .line 64
    invoke-direct {v3, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 68
    move-result p1

    .line 69
    .line 70
    const/16 v1, 0x21

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3, v2, p1, v1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 74
    return-object v0
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
.end method

.method public final q4()Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->q0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/kumex/data/platform/model/FuturesAirdropProfitEntity;

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

.method public final r4(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "CROSS"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    sget p1, Lcom/kubi/kumex/R$string;->kumex_cross_position:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 18
    return-object p1

    .line 19
    .line 20
    :cond_0
    sget p1, Lcom/kubi/kumex/R$string;->kumex_isolate_position:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 28
    return-object p1
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final s4(Ljava/lang/Long;)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    const-wide/16 v0, 0x1

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Lcom/kubi/utils/extensions/d;->m(Ljava/lang/Long;J)J

    .line 6
    move-result-wide v0

    .line 7
    long-to-double v0, v0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide v2, 0x40ac200000000000L    # 3600.0

    .line 13
    div-double/2addr v0, v2

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 17
    move-result-wide v0

    .line 18
    double-to-long v0, v0

    .line 19
    .line 20
    const-wide/16 v2, 0x18

    .line 21
    .line 22
    cmp-long p1, v0, v2

    .line 23
    .line 24
    if-ltz p1, :cond_0

    .line 25
    long-to-double v0, v0

    .line 26
    .line 27
    const-wide/high16 v2, 0x4038000000000000L    # 24.0

    .line 28
    div-double/2addr v0, v2

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 32
    move-result-wide v0

    .line 33
    double-to-long v0, v0

    .line 34
    .line 35
    sget p1, Lcom/kubi/kumex/R$string;->margin_coupons_period_days:I

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 51
    return-object p1

    .line 52
    .line 53
    :cond_0
    sget p1, Lcom/kubi/kumex/R$string;->kumex_distance_settlement_hour_stub:I

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 61
    move-result-object v0

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 69
    return-object p1
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
.end method

.method public final t4(Ljava/lang/String;)I
    .locals 1

    .line 1
    .line 2
    const-string v0, "buy"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    sget p1, Lcom/kubi/kumex/R$color;->primary8:I

    .line 11
    return p1

    .line 12
    .line 13
    :cond_0
    sget p1, Lcom/kubi/kumex/R$color;->brandRed8:I

    .line 14
    return p1
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

.method public final u4(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "buy"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    sget p1, Lcom/kubi/kumex/R$string;->contract_long:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 18
    return-object p1

    .line 19
    .line 20
    :cond_0
    sget p1, Lcom/kubi/kumex/R$string;->contract_short:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 28
    return-object p1
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final v4(Ljava/lang/String;)I
    .locals 1

    .line 1
    .line 2
    const-string v0, "buy"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    sget v0, Lcom/kubi/kumex/R$color;->primary:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/content/Context;->getColor(I)I

    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    sget v0, Lcom/kubi/kumex/R$color;->brandGreen:I

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/content/Context;->getColor(I)I

    .line 29
    move-result p1

    .line 30
    return p1
    .line 31
    .line 32
.end method

.method public final w4()Ldm/e;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->r0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/futures/trade/welfare/airdrop/AirdropPositionPnlDetailsDialog;->t0:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/a;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ldm/e;

    .line 14
    return-object v0
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

.method public final x4(Landroid/graphics/Bitmap;)V
    .locals 15

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/share/api/IShareService;->a:Lcom/kubi/share/api/IShareService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/share/api/IShareService$Companion;->get()Lcom/kubi/share/api/IShareService;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    new-instance v2, Lcom/kubi/share/api/ImageShareParam;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/share/api/IShareService$Companion;->get()Lcom/kubi/share/api/IShareService;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v3, "f_p_share"

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v3}, Lcom/kubi/share/api/IShareService;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object v6

    .line 19
    .line 20
    const/16 v13, 0x3f0

    .line 21
    const/4 v14, 0x0

    .line 22
    .line 23
    const-string v3, "f_p_share"

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v11, 0x0

    .line 30
    const/4 v12, 0x0

    .line 31
    .line 32
    move-object/from16 v4, p1

    .line 33
    .line 34
    .line 35
    invoke-direct/range {v2 .. v14}, Lcom/kubi/share/api/ImageShareParam;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;ZLjava/lang/String;ZLjava/lang/String;Lcom/kubi/share/api/CustomDisplay;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    const/4 v0, 0x0

    .line 37
    const/4 v3, 0x2

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2, v0, v3, v0}, Lcom/kubi/share/api/IShareService;->c(Lcom/kubi/share/api/IShareService;Lcom/kubi/share/api/ShareParam;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 41
    return-void
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
.end method
