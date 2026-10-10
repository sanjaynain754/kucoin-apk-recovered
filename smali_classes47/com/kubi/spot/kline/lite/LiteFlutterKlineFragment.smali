.class public final Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;
.super Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment;
.source "LiteFlutterKlineFragment.kt"

# interfaces
.implements Lcom/kubi/sdk/o2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;,
        Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 12\u00020\u00012\u00020\u0002:\u000212B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0016\u0010$\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u000bJ\u0008\u0010&\u001a\u00020\'H\u0002J\u0015\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.H\u0000\u00a2\u0006\u0002\u00080R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0005\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\t\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00168TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010,\u00a8\u00063"
    }
    d2 = {
        "Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;",
        "Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment;",
        "Lcom/kubi/sdk/IKlineFragment;",
        "<init>",
        "()V",
        "isKuCoinSource",
        "",
        "()Z",
        "isKuCoinSource$delegate",
        "Lkotlin/Lazy;",
        "precision",
        "",
        "getPrecision",
        "()I",
        "precision$delegate",
        "isLine",
        "kLineInteractor",
        "Lcom/kubi/spot/kline/lite/LiteKLineInteractor;",
        "getKLineInteractor",
        "()Lcom/kubi/spot/kline/lite/LiteKLineInteractor;",
        "kLineInteractor$delegate",
        "initParam",
        "Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;",
        "getInitParam",
        "()Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;",
        "interactor",
        "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;",
        "getInteractor",
        "()Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;",
        "onDataFirstLoaded",
        "",
        "onViewCreated",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "checkType",
        "type",
        "buildSelectPadConfig",
        "Lcom/kubi/flutter/proto/kline/SelectPadConfig;",
        "previous",
        "Lcom/kubi/flutter/proto/kline/CandleItem;",
        "firstClose",
        "",
        "Ljava/lang/Double;",
        "priceFlow",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$PriceItem;",
        "priceFlow$SpotLib_googleRelease",
        "Companion",
        "PriceItem",
        "SpotLib_googleRelease"
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
        "SMAP\nLiteFlutterKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteFlutterKlineFragment.kt\ncom/kubi/spot/kline/lite/LiteFlutterKlineFragment\n+ 2 SelectPadConfigKt.kt\ncom/kubi/flutter/proto/kline/SelectPadConfigKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,216:1\n8#2:217\n1#3:218\n49#4:219\n51#4:223\n46#5:220\n51#5:222\n105#6:221\n*S KotlinDebug\n*F\n+ 1 LiteFlutterKlineFragment.kt\ncom/kubi/spot/kline/lite/LiteFlutterKlineFragment\n*L\n145#1:217\n145#1:218\n167#1:219\n167#1:223\n167#1:220\n167#1:222\n167#1:221\n*E\n"
    }
.end annotation


# static fields
.field public static final e0:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final Y:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final Z:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public a0:Z

.field public final b0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c0:Lcom/kubi/flutter/proto/kline/CandleItem;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d0:Ljava/lang/Double;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->e0:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;

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
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/spot/kline/lite/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/kubi/spot/kline/lite/a;-><init>(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->Y:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/spot/kline/lite/b;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/kubi/spot/kline/lite/b;-><init>(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->Z:Lkotlin/Lazy;

    .line 26
    .line 27
    new-instance v0, Lcom/kubi/spot/kline/lite/c;

    .line 28
    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/kubi/spot/kline/lite/c;-><init>(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    iput-object v0, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->b0:Lkotlin/Lazy;

    .line 37
    return-void
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
.end method

.method public static final A3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)Z
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
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 12
    move-result p0

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-static {p0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 22
    move-result p0

    .line 23
    return p0
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
.end method

.method public static final B3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)Lcom/kubi/spot/kline/lite/LiteKLineInteractor;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/spot/kline/lite/LiteKLineInteractor;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->z3()Z

    .line 6
    move-result p0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/kubi/spot/kline/lite/LiteKLineInteractor;-><init>(Z)V

    .line 10
    return-object v0
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
.end method

.method public static final C3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)I
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
    const-string v0, "data_4"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    move-result p0

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    :goto_0
    const/4 v0, 0x3

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 23
    move-result p0

    .line 24
    return p0
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
.end method

.method private final getPrecision()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->Z:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Number;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 12
    move-result v0

    .line 13
    return v0
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
.end method

.method public static synthetic p3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->C3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)I

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static synthetic q3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)Lcom/kubi/spot/kline/lite/LiteKLineInteractor;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->B3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)Lcom/kubi/spot/kline/lite/LiteKLineInteractor;

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
.end method

.method public static synthetic r3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->A3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final synthetic s3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)Ljava/lang/Double;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->d0:Ljava/lang/Double;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic t3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)Lcom/kubi/flutter/proto/kline/CandleItem;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->c0:Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic u3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;Ljava/lang/Double;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->d0:Ljava/lang/Double;

    .line 3
    return-void
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
.end method

.method public static final synthetic v3(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;Lcom/kubi/flutter/proto/kline/CandleItem;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->c0:Lcom/kubi/flutter/proto/kline/CandleItem;

    .line 3
    return-void
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
.end method


# virtual methods
.method public final D3()Lkotlinx/coroutines/flow/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->y3()Lcom/kubi/spot/kline/lite/LiteKLineInteractor;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/spot/kline/lite/LiteKLineInteractor;->E()Lkotlinx/coroutines/channels/d;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->X(Lkotlinx/coroutines/channels/o;)Lkotlinx/coroutines/flow/e;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    new-instance v1, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v0, p0}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$priceFlow$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/e;Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;)V

    .line 18
    return-object v1
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
.end method

.method public k3()Lcom/kubi/flutter/widget/kline/KLineViewController$a;
    .locals 20
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v3, "data_1"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v1, v2

    .line 22
    .line 23
    :goto_0
    sget-object v3, Lgf/b0;->a:Lgf/b0;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Lgf/b0;->i()Z

    .line 27
    move-result v4

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v4}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    iput-boolean v1, v0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->a0:Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const-string v4, "data_2"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 45
    move-result v1

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    move-result-object v1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move-object v1, v2

    .line 52
    .line 53
    .line 54
    :goto_1
    invoke-virtual {v3}, Lgf/b0;->e()I

    .line 55
    move-result v4

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v4}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 59
    move-result v1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    const-string v5, "data_3"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 71
    move-result v4

    .line 72
    .line 73
    .line 74
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    move-result-object v4

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    move-object v4, v2

    .line 78
    .line 79
    .line 80
    :goto_2
    invoke-virtual {v3}, Lgf/b0;->c()I

    .line 81
    move-result v3

    .line 82
    .line 83
    .line 84
    invoke-static {v4, v3}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 85
    move-result v3

    .line 86
    .line 87
    iget-boolean v4, v0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->a0:Z

    .line 88
    .line 89
    if-eqz v4, :cond_3

    .line 90
    .line 91
    sget-object v3, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->e0:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, v1}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;->toLiteLineType(I)Lcom/kubi/flutter/widget/kline/KLineType;

    .line 95
    move-result-object v1

    .line 96
    :goto_3
    move-object v6, v1

    .line 97
    goto :goto_4

    .line 98
    .line 99
    :cond_3
    sget-object v1, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->e0:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v3}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;->toLiteCandleType(I)Lcom/kubi/flutter/widget/kline/KLineType;

    .line 103
    move-result-object v1

    .line 104
    goto :goto_3

    .line 105
    .line 106
    .line 107
    :goto_4
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 108
    move-result-object v1

    .line 109
    .line 110
    if-eqz v1, :cond_4

    .line 111
    .line 112
    const-string v2, "symbol"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    .line 119
    :cond_4
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    move-result-object v4

    .line 121
    .line 122
    .line 123
    invoke-direct {v0}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->getPrecision()I

    .line 124
    move-result v5

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 128
    move-result-object v8

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 132
    move-result-object v9

    .line 133
    .line 134
    iget-boolean v10, v0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->a0:Z

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->w3()Lcom/kubi/flutter/proto/kline/SelectPadConfig;

    .line 138
    move-result-object v11

    .line 139
    .line 140
    new-instance v3, Lcom/kubi/flutter/widget/kline/KLineViewController$a;

    .line 141
    .line 142
    const/16 v18, 0x3f00

    .line 143
    .line 144
    const/16 v19, 0x0

    .line 145
    .line 146
    const-string v7, "lite"

    .line 147
    const/4 v12, 0x0

    .line 148
    const/4 v13, 0x0

    .line 149
    const/4 v14, 0x0

    .line 150
    const/4 v15, 0x0

    .line 151
    .line 152
    const/16 v16, 0x0

    .line 153
    .line 154
    const/16 v17, 0x0

    .line 155
    .line 156
    .line 157
    invoke-direct/range {v3 .. v19}, Lcom/kubi/flutter/widget/kline/KLineViewController$a;-><init>(Ljava/lang/String;ILcom/kubi/flutter/widget/kline/KLineType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLcom/kubi/flutter/proto/kline/SelectPadConfig;Lcom/kubi/flutter/proto/kline/VolumeConfig;Ljava/lang/String;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 158
    return-object v3
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
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
.end method

.method public l3()Lcom/kubi/flutter/widget/kline/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->y3()Lcom/kubi/spot/kline/lite/LiteKLineInteractor;

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
.end method

.method public m3()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lgf/b0;->a:Lgf/b0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lgf/b0;->i()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "BrokenLine"

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    const-string v1, "Candle"

    .line 14
    .line 15
    :goto_0
    sget-object v2, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->e0:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lgf/b0;->i()Z

    .line 19
    move-result v0

    .line 20
    .line 21
    .line 22
    invoke-static {v2, v0}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;->access$getTrackParam(Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;Z)Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v2, "data"

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    const-string v2, "B5CoinPage"

    .line 36
    .line 37
    const-string v3, "1"

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v1, v3, v0}, Lqq/m;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
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
    const-string v0, "view"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

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
.end method

.method public final w3()Lcom/kubi/flutter/proto/kline/SelectPadConfig;
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/flutter/proto/kline/SelectPadConfigKt$Dsl;->b:Lcom/kubi/flutter/proto/kline/SelectPadConfigKt$Dsl$Companion;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/kubi/flutter/proto/kline/SelectPadConfig;->newBuilder()Lcom/kubi/flutter/proto/kline/SelectPadConfig$c;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "newBuilder(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/SelectPadConfigKt$Dsl$Companion;->_create(Lcom/kubi/flutter/proto/kline/SelectPadConfig$c;)Lcom/kubi/flutter/proto/kline/SelectPadConfigKt$Dsl;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iget-boolean v1, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->a0:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget-object v1, Lcom/kubi/flutter/proto/kline/SelectPadViewMode;->NONE_PAD:Lcom/kubi/flutter/proto/kline/SelectPadViewMode;

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    sget-object v1, Lcom/kubi/flutter/proto/kline/SelectPadViewMode;->TOP_PAD:Lcom/kubi/flutter/proto/kline/SelectPadViewMode;

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {v0, v1}, Lcom/kubi/flutter/proto/kline/SelectPadConfigKt$Dsl;->d(Lcom/kubi/flutter/proto/kline/SelectPadViewMode;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/SelectPadConfigKt$Dsl;->c()Lcom/google/protobuf/kotlin/DslList;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    sget-object v2, Lcom/kubi/flutter/proto/kline/SelectPadItemType;->OPEN_DATA:Lcom/kubi/flutter/proto/kline/SelectPadItemType;

    .line 34
    .line 35
    sget-object v3, Lcom/kubi/flutter/proto/kline/SelectPadItemType;->HIGH_DATA:Lcom/kubi/flutter/proto/kline/SelectPadItemType;

    .line 36
    .line 37
    sget-object v4, Lcom/kubi/flutter/proto/kline/SelectPadItemType;->LOW_DATA:Lcom/kubi/flutter/proto/kline/SelectPadItemType;

    .line 38
    .line 39
    sget-object v5, Lcom/kubi/flutter/proto/kline/SelectPadItemType;->CLOSE_DATA:Lcom/kubi/flutter/proto/kline/SelectPadItemType;

    .line 40
    .line 41
    sget-object v6, Lcom/kubi/flutter/proto/kline/SelectPadItemType;->CHANGE_RATIO_DATA:Lcom/kubi/flutter/proto/kline/SelectPadItemType;

    .line 42
    .line 43
    sget-object v7, Lcom/kubi/flutter/proto/kline/SelectPadItemType;->AMPLITUDE_DATA:Lcom/kubi/flutter/proto/kline/SelectPadItemType;

    .line 44
    .line 45
    .line 46
    filled-new-array/range {v2 .. v7}, [Lcom/kubi/flutter/proto/kline/SelectPadItemType;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, Lcom/kubi/flutter/proto/kline/SelectPadConfigKt$Dsl;->b(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/kubi/flutter/proto/kline/SelectPadConfigKt$Dsl;->a()Lcom/kubi/flutter/proto/kline/SelectPadConfig;

    .line 58
    move-result-object v0

    .line 59
    return-object v0
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
.end method

.method public final x3(ZI)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->e0:Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p2}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;->toLiteLineType(I)Lcom/kubi/flutter/widget/kline/KLineType;

    .line 8
    move-result-object p2

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0, p2}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;->toLiteCandleType(I)Lcom/kubi/flutter/widget/kline/KLineType;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment;->j3()Lcom/kubi/flutter/widget/kline/KLineViewController;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p2, p1}, Lcom/kubi/flutter/widget/kline/KLineViewController;->A(Lcom/kubi/flutter/widget/kline/KLineType;Z)V

    .line 23
    .line 24
    :cond_1
    iget-boolean p2, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->a0:Z

    .line 25
    .line 26
    if-eq p2, p1, :cond_2

    .line 27
    .line 28
    iput-boolean p1, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->a0:Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment;->j3()Lcom/kubi/flutter/widget/kline/KLineViewController;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->w3()Lcom/kubi/flutter/proto/kline/SelectPadConfig;

    .line 38
    move-result-object p2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Lcom/kubi/flutter/widget/kline/KLineViewController;->v(Lcom/kubi/flutter/proto/kline/SelectPadConfig;)V

    .line 42
    :cond_2
    return-void
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
.end method

.method public final y3()Lcom/kubi/spot/kline/lite/LiteKLineInteractor;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->b0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/spot/kline/lite/LiteKLineInteractor;

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
.end method

.method public final z3()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;->Y:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    move-result v0

    .line 13
    return v0
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
.end method
