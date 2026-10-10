.class public final Lcom/kubi/welfare/WelfareInviteFragment;
.super Lcom/kubi/sdk/base/ui/BasePagingFragment;
.source "WelfareInviteFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/sdk/base/ui/BasePagingFragment<",
        "Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u001c\u001a\u00020\u001dH\u0014J\u0008\u0010\u001e\u001a\u00020\u001dH\u0014J\u001c\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\"2\u0008\u0010#\u001a\u0004\u0018\u00010\u0002H\u0014J$\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020&0%2\u0006\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u001dH\u0014J\u0008\u0010)\u001a\u00020 H\u0016J\u001a\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020,2\u0008\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0008\u0010/\u001a\u00020 H\u0002J\u0008\u00100\u001a\u00020\u001dH\u0014J\u0008\u00101\u001a\u00020\u001dH\u0014J\u0008\u00102\u001a\u00020 H\u0002J\u0008\u00103\u001a\u00020 H\u0002J\u0008\u00104\u001a\u00020 H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\u00080\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\r\u001a\u0004\u0008\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u00065"
    }
    d2 = {
        "Lcom/kubi/welfare/WelfareInviteFragment;",
        "Lcom/kubi/sdk/base/ui/BasePagingFragment;",
        "Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;",
        "<init>",
        "()V",
        "mHeaderView",
        "Lcom/kubi/welfare/view/WelfareHeaderView;",
        "assetApi",
        "Lcom/kubi/welfare/api/remote/WelfareApi;",
        "kotlin.jvm.PlatformType",
        "getAssetApi",
        "()Lcom/kubi/welfare/api/remote/WelfareApi;",
        "assetApi$delegate",
        "Lkotlin/Lazy;",
        "invitation",
        "Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;",
        "getInvitation",
        "()Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;",
        "invitation$delegate",
        "<set-?>",
        "",
        "canDraw",
        "getCanDraw",
        "()Z",
        "setCanDraw",
        "(Z)V",
        "canDraw$delegate",
        "Lkotlin/properties/ReadWriteProperty;",
        "getLayout",
        "",
        "getItemLayout",
        "bindDataToView",
        "",
        "helper",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "item",
        "getDataLoader",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BasePageEntity;",
        "pageIndex",
        "pageSize",
        "refreshData",
        "onViewCreated",
        "view",
        "Landroid/view/View;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "initHeader",
        "getEmptyFooterText",
        "getEmptyFooterIcon",
        "doDraw",
        "onDrawSuccess",
        "getRemainNum",
        "WelfareLib_googleRelease"
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
        "SMAP\nWelfareInviteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareInviteFragment.kt\ncom/kubi/welfare/WelfareInviteFragment\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,182:1\n33#2,3:183\n*S KotlinDebug\n*F\n+ 1 WelfareInviteFragment.kt\ncom/kubi/welfare/WelfareInviteFragment\n*L\n57#1:183,3\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic d0:[Lkotlin/reflect/KProperty;
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
.field public Z:Lcom/kubi/welfare/view/WelfareHeaderView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final a0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c0:Lkotlin/properties/ReadWriteProperty;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getCanDraw()Z"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/welfare/WelfareInviteFragment;

    .line 8
    .line 9
    const-string v4, "canDraw"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

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
    sput-object v1, Lcom/kubi/welfare/WelfareInviteFragment;->d0:[Lkotlin/reflect/KProperty;

    .line 24
    return-void
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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lk80/d;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lk80/d;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/welfare/WelfareInviteFragment;->a0:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lk80/e;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lk80/e;-><init>(Lcom/kubi/welfare/WelfareInviteFragment;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/welfare/WelfareInviteFragment;->b0:Lkotlin/Lazy;

    .line 26
    .line 27
    sget-object v0, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 28
    .line 29
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 30
    .line 31
    new-instance v1, Lcom/kubi/welfare/WelfareInviteFragment$a;

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, v0, p0}, Lcom/kubi/welfare/WelfareInviteFragment$a;-><init>(Ljava/lang/Object;Lcom/kubi/welfare/WelfareInviteFragment;)V

    .line 35
    .line 36
    iput-object v1, p0, Lcom/kubi/welfare/WelfareInviteFragment;->c0:Lkotlin/properties/ReadWriteProperty;

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
.end method

.method public static synthetic H3(Lcom/kubi/welfare/WelfareInviteFragment;Lcom/kubi/welfare/api/entity/RemainAwardNumEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/welfare/WelfareInviteFragment;->W3(Lcom/kubi/welfare/WelfareInviteFragment;Lcom/kubi/welfare/api/entity/RemainAwardNumEntity;)V

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
.end method

.method public static synthetic I3()Ll80/a;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/welfare/WelfareInviteFragment;->O3()Ll80/a;

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
.end method

.method public static synthetic J3(Lcom/kubi/welfare/WelfareInviteFragment;Lcom/kubi/welfare/api/entity/WelfareInfoEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/welfare/WelfareInviteFragment;->Y3(Lcom/kubi/welfare/WelfareInviteFragment;Lcom/kubi/welfare/api/entity/WelfareInfoEntity;)V

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
.end method

.method public static synthetic K3(Lcom/kubi/welfare/WelfareInviteFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/welfare/WelfareInviteFragment;->R3(Lcom/kubi/welfare/WelfareInviteFragment;Ljava/lang/Object;)V

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
.end method

.method public static synthetic L3(Lcom/kubi/welfare/WelfareInviteFragment;)Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->Z3(Lcom/kubi/welfare/WelfareInviteFragment;)Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;

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
.end method

.method public static synthetic M3(Lcom/kubi/welfare/WelfareInviteFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->b4(Lcom/kubi/welfare/WelfareInviteFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic N3(Lcom/kubi/welfare/WelfareInviteFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->c4(Lcom/kubi/welfare/WelfareInviteFragment;)Lkotlin/Unit;

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
.end method

.method private static final O3()Ll80/a;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->b()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Ll80/a;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Ll80/a;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public static final R3(Lcom/kubi/welfare/WelfareInviteFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->a4()V

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
.end method

.method private final S3()Ll80/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/welfare/WelfareInviteFragment;->a0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ll80/a;

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
.end method

.method public static final W3(Lcom/kubi/welfare/WelfareInviteFragment;Lcom/kubi/welfare/api/entity/RemainAwardNumEntity;)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/welfare/api/entity/RemainAwardNumEntity;->getInvitationAwardCount()Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    move-result v0

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    const/4 p1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lcom/kubi/welfare/WelfareInviteFragment;->d4(Z)V

    .line 20
    .line 21
    sget v0, Lcom/kubi/welfare/R$id;->btn_draw:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->findViewById(I)Landroid/view/View;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    check-cast p0, Landroid/widget/Button;

    .line 28
    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 32
    .line 33
    sget v1, Lcom/kubi/welfare/R$string;->withdrawal_all:I

    .line 34
    .line 35
    new-array p1, p1, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, p1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    return-void

    .line 44
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/kubi/welfare/WelfareInviteFragment;->d4(Z)V

    .line 48
    .line 49
    sget v0, Lcom/kubi/welfare/R$id;->btn_draw:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->findViewById(I)Landroid/view/View;

    .line 53
    move-result-object p0

    .line 54
    .line 55
    check-cast p0, Landroid/widget/Button;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 60
    .line 61
    sget v1, Lcom/kubi/welfare/R$string;->withdrawal_all_stub:I

    .line 62
    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/kubi/welfare/api/entity/RemainAwardNumEntity;->getInvitationAwardCount()Ljava/lang/Integer;

    .line 67
    move-result-object p1

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/4 p1, 0x0

    .line 70
    .line 71
    .line 72
    :goto_1
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1, p1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    :cond_3
    return-void
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
.end method

.method private final X3()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/welfare/WelfareInviteFragment;->Z:Lcom/kubi/welfare/view/WelfareHeaderView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/kubi/welfare/view/WelfareHeaderView;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/OldBaseFragment;->mContext:Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    const-string/jumbo v2, "mContext"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lcom/kubi/welfare/view/WelfareHeaderView;-><init>(Landroid/content/Context;I)V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/kubi/welfare/WelfareInviteFragment;->Z:Lcom/kubi/welfare/view/WelfareHeaderView;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/kubi/sdk/base/ui/BasePagingFragment;->W:Lio/chad/library/adapter/base/BaseQuickAdapter;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->addHeaderView(Landroid/view/View;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->U3()Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Lcom/kubi/welfare/WelfareInviteFragment;->Z:Lcom/kubi/welfare/view/WelfareHeaderView;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->U3()Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/kubi/welfare/view/WelfareHeaderView;->setData(Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;)V

    .line 43
    :cond_1
    return-void

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-direct {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->S3()Ll80/a;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ll80/a;->d()Lio/reactivex/Observable;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    new-instance v1, Lk80/j;

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, p0}, Lk80/j;-><init>(Lcom/kubi/welfare/WelfareInviteFragment;)V

    .line 65
    .line 66
    new-instance v2, Lcom/kubi/sdk/util/c1;

    .line 67
    .line 68
    .line 69
    invoke-direct {v2, p0}, Lcom/kubi/sdk/util/c1;-><init>(Lcom/kubi/sdk/base/ui/g;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->addSubscription(Lio/reactivex/disposables/Disposable;)V

    .line 77
    return-void
    .line 78
    .line 79
    .line 80
.end method

.method public static final Y3(Lcom/kubi/welfare/WelfareInviteFragment;Lcom/kubi/welfare/api/entity/WelfareInfoEntity;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/welfare/api/entity/WelfareInfoEntity;->getIncomeResponse()Ljava/util/Map;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-string v0, "INVITATION_REWARD"

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    .line 20
    :goto_0
    iget-object p0, p0, Lcom/kubi/welfare/WelfareInviteFragment;->Z:Lcom/kubi/welfare/view/WelfareHeaderView;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/kubi/welfare/view/WelfareHeaderView;->setData(Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;)V

    .line 26
    :cond_1
    return-void
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
.end method

.method public static final Z3(Lcom/kubi/welfare/WelfareInviteFragment;)Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;
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
    invoke-static {p0, v0}, Lcom/kubi/router/utils/RouteExKt;->V(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;

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
.end method

.method public static final b4(Lcom/kubi/welfare/WelfareInviteFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->Q3()V

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
.end method

.method public static final c4(Lcom/kubi/welfare/WelfareInviteFragment;)Lkotlin/Unit;
    .locals 9

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
    new-instance v2, Lcom/kubi/share/api/TextShareParam;

    .line 9
    .line 10
    const/16 v7, 0xe

    .line 11
    const/4 v8, 0x0

    .line 12
    .line 13
    const-string v3, "KCS_b_share"

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct/range {v2 .. v8}, Lcom/kubi/share/api/TextShareParam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    sget v3, Lcom/kubi/welfare/R$string;->share_content_tips:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 25
    move-result-object p0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p0}, Lcom/kubi/share/api/TextShareParam;->setContent(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/kubi/share/api/IShareService$Companion;->get()Lcom/kubi/share/api/IShareService;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    const-string v0, "KCS_b_share"

    .line 35
    .line 36
    .line 37
    invoke-interface {p0, v0}, Lcom/kubi/share/api/IShareService;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object p0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p0}, Lcom/kubi/share/api/TextShareParam;->setLinkUrl(Ljava/lang/String;)V

    .line 42
    const/4 p0, 0x0

    .line 43
    const/4 v0, 0x2

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2, p0, v0, p0}, Lcom/kubi/share/api/IShareService;->c(Lcom/kubi/share/api/IShareService;Lcom/kubi/share/api/ShareParam;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 49
    return-object p0
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
.end method


# virtual methods
.method public F3()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->F3()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->X3()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->V3()V

    .line 10
    return-void
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
.end method

.method public P3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;)V
    .locals 18
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    sget-object v2, Lgf/n;->a:Lgf/n;

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;->getCurrency()Ljava/lang/String;

    .line 13
    move-result-object v4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v4, v3

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object v4

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v4}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    if-eqz p2, :cond_3

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;->getStatus()Ljava/lang/Integer;

    .line 29
    move-result-object v4

    .line 30
    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 35
    move-result v4

    .line 36
    .line 37
    sget-object v5, Lcom/kubi/welfare/DrawStatus;->Companion:Lcom/kubi/welfare/DrawStatus$Companion;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, v4}, Lcom/kubi/welfare/DrawStatus$Companion;->valueOfInt(I)Lcom/kubi/welfare/DrawStatus;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    if-nez v4, :cond_1

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_1
    if-eqz v1, :cond_2

    .line 47
    .line 48
    sget v5, Lcom/kubi/welfare/R$id;->tv_status:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Lcom/kubi/welfare/DrawStatus;->getStr()I

    .line 52
    move-result v6

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 56
    move-result-object v6

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 60
    .line 61
    :cond_2
    if-eqz v1, :cond_3

    .line 62
    .line 63
    sget v5, Lcom/kubi/welfare/R$id;->tv_status:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/kubi/welfare/DrawStatus;->getColor()I

    .line 67
    move-result v4

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v4}, Lcom/kubi/sdk/BaseFragment;->getColorRes(I)I

    .line 71
    move-result v4

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, v5, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 75
    .line 76
    :cond_3
    :goto_1
    if-eqz v1, :cond_6

    .line 77
    .line 78
    sget v4, Lcom/kubi/welfare/R$id;->tv_coin_name:I

    .line 79
    .line 80
    new-instance v5, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinInfoEntity;->getCurrency()Ljava/lang/String;

    .line 89
    move-result-object v6

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    move-object v6, v3

    .line 92
    .line 93
    .line 94
    :goto_2
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    move-result-object v6

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const/16 v6, 0x28

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    if-eqz p2, :cond_5

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;->getReason()Ljava/lang/String;

    .line 109
    move-result-object v6

    .line 110
    goto :goto_3

    .line 111
    :cond_5
    move-object v6, v3

    .line 112
    .line 113
    .line 114
    :goto_3
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    move-result-object v6

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const/16 v6, 0x29

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    move-result-object v5

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v4, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 131
    .line 132
    :cond_6
    if-eqz v1, :cond_8

    .line 133
    .line 134
    sget v4, Lcom/kubi/welfare/R$id;->tv_amount_1:I

    .line 135
    .line 136
    if-eqz p2, :cond_7

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;->getCount()Ljava/lang/Integer;

    .line 140
    move-result-object v5

    .line 141
    goto :goto_4

    .line 142
    :cond_7
    move-object v5, v3

    .line 143
    .line 144
    .line 145
    :goto_4
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 146
    move-result v5

    .line 147
    .line 148
    .line 149
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 150
    move-result-object v5

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v4, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 154
    .line 155
    :cond_8
    if-eqz v1, :cond_b

    .line 156
    .line 157
    sget v4, Lcom/kubi/welfare/R$id;->tv_amount_2:I

    .line 158
    .line 159
    if-eqz p2, :cond_9

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;->getAmount()Ljava/math/BigDecimal;

    .line 163
    move-result-object v5

    .line 164
    goto :goto_5

    .line 165
    :cond_9
    move-object v5, v3

    .line 166
    .line 167
    .line 168
    :goto_5
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 169
    move-result-wide v6

    .line 170
    .line 171
    if-eqz v2, :cond_a

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 175
    move-result-object v5

    .line 176
    goto :goto_6

    .line 177
    :cond_a
    move-object v5, v3

    .line 178
    .line 179
    .line 180
    :goto_6
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    move-result-object v8

    .line 182
    .line 183
    const/16 v15, 0x7e

    .line 184
    .line 185
    const/16 v16, 0x0

    .line 186
    const/4 v9, 0x0

    .line 187
    const/4 v10, 0x0

    .line 188
    const/4 v11, 0x0

    .line 189
    const/4 v12, 0x0

    .line 190
    const/4 v13, 0x0

    .line 191
    const/4 v14, 0x0

    .line 192
    .line 193
    .line 194
    invoke-static/range {v6 .. v16}, Lgf/i;->j(DLjava/lang/String;Ljava/math/RoundingMode;ZZZZLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 195
    move-result-object v5

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v4, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 199
    .line 200
    :cond_b
    if-eqz v1, :cond_e

    .line 201
    .line 202
    sget v4, Lcom/kubi/welfare/R$id;->tv_price_2:I

    .line 203
    .line 204
    if-eqz p2, :cond_c

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;->getAmount()Ljava/math/BigDecimal;

    .line 208
    move-result-object v5

    .line 209
    goto :goto_7

    .line 210
    :cond_c
    move-object v5, v3

    .line 211
    .line 212
    .line 213
    :goto_7
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 214
    move-result-wide v5

    .line 215
    .line 216
    if-eqz v2, :cond_d

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 220
    move-result-object v2

    .line 221
    goto :goto_8

    .line 222
    :cond_d
    move-object v2, v3

    .line 223
    .line 224
    .line 225
    :goto_8
    invoke-static {v5, v6, v2}, Lkf/a;->m(DLjava/lang/String;)D

    .line 226
    move-result-wide v7

    .line 227
    .line 228
    const/16 v16, 0x7f

    .line 229
    .line 230
    const/16 v17, 0x0

    .line 231
    const/4 v9, 0x0

    .line 232
    const/4 v10, 0x0

    .line 233
    const/4 v11, 0x0

    .line 234
    const/4 v12, 0x0

    .line 235
    const/4 v13, 0x0

    .line 236
    const/4 v14, 0x0

    .line 237
    const/4 v15, 0x0

    .line 238
    .line 239
    .line 240
    invoke-static/range {v7 .. v17}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 241
    move-result-object v2

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v4, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 245
    .line 246
    :cond_e
    if-eqz v1, :cond_10

    .line 247
    .line 248
    sget v2, Lcom/kubi/welfare/R$id;->tv_amount_3:I

    .line 249
    .line 250
    if-eqz p2, :cond_f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {p2 .. p2}, Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;->getRewardDate()Ljava/lang/Long;

    .line 254
    move-result-object v3

    .line 255
    .line 256
    .line 257
    :cond_f
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->l(Ljava/lang/Long;)J

    .line 258
    move-result-wide v3

    .line 259
    .line 260
    .line 261
    invoke-static {v3, v4}, Lcom/kubi/utils/TimeUtils;->i(J)Ljava/lang/String;

    .line 262
    move-result-object v3

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v2, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 266
    :cond_10
    return-void
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
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
.end method

.method public final Q3()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->T3()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showDialogLoading()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->S3()Ll80/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ll80/a;->g()Lio/reactivex/Observable;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    new-instance v1, Lk80/i;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, p0}, Lk80/i;-><init>(Lcom/kubi/welfare/WelfareInviteFragment;)V

    .line 32
    .line 33
    new-instance v2, Lcom/kubi/sdk/util/c1;

    .line 34
    .line 35
    .line 36
    invoke-direct {v2, p0}, Lcom/kubi/sdk/util/c1;-><init>(Lcom/kubi/sdk/base/ui/g;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->addSubscription(Lio/reactivex/disposables/Disposable;)V

    .line 44
    return-void
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
.end method

.method public final T3()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/welfare/WelfareInviteFragment;->c0:Lkotlin/properties/ReadWriteProperty;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/welfare/WelfareInviteFragment;->d0:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    move-result v0

    .line 18
    return v0
    .line 19
    .line 20
.end method

.method public final U3()Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/welfare/WelfareInviteFragment;->b0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/welfare/api/entity/WelfareInfoEntity$WelfareDetailEntity;

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
.end method

.method public final V3()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->S3()Ll80/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ll80/a;->a()Lio/reactivex/Observable;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    new-instance v1, Lk80/h;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p0}, Lk80/h;-><init>(Lcom/kubi/welfare/WelfareInviteFragment;)V

    .line 22
    .line 23
    new-instance v2, Lcom/kubi/sdk/util/c1;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, p0}, Lcom/kubi/sdk/util/c1;-><init>(Lcom/kubi/sdk/base/ui/g;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->addSubscription(Lio/reactivex/disposables/Disposable;)V

    .line 34
    return-void
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
.end method

.method public final a4()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcom/kubi/welfare/WelfareInviteFragment;->d4(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->hideDialogLoading()V

    .line 8
    .line 9
    sget v0, Lcom/kubi/welfare/R$string;->withdrawal_all_success:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->showToast(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->F3()V

    .line 20
    return-void
.end method

.method public final d4(Z)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/welfare/WelfareInviteFragment;->c0:Lkotlin/properties/ReadWriteProperty;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/welfare/WelfareInviteFragment;->d0:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

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
.end method

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/welfare/R$layout;->kucoin_fragment_invite_record:I

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
.end method

.method public bridge synthetic o3(Lio/chad/library/adapter/base/BaseViewHolder;Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/welfare/WelfareInviteFragment;->P3(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;)V

    .line 6
    return-void
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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6
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
    .line 3
    const-string/jumbo v0, "view"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2}, Lcom/kubi/sdk/base/ui/BasePagingFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 10
    .line 11
    sget p1, Lcom/kubi/welfare/R$id;->m_swipe_recycler_view:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/BaseFragment;->findViewById(I)Landroid/view/View;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    check-cast p1, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/resources/widget/SwipeRefreshRecyclerView;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 38
    .line 39
    :cond_0
    sget p1, Lcom/kubi/welfare/R$id;->btn_draw:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/BaseFragment;->findViewById(I)Landroid/view/View;

    .line 43
    move-result-object p1

    .line 44
    move-object v0, p1

    .line 45
    .line 46
    check-cast v0, Landroid/widget/Button;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    new-instance v3, Lk80/f;

    .line 51
    .line 52
    .line 53
    invoke-direct {v3, p0}, Lk80/f;-><init>(Lcom/kubi/welfare/WelfareInviteFragment;)V

    .line 54
    const/4 v4, 0x1

    .line 55
    const/4 v5, 0x0

    .line 56
    .line 57
    const-wide/16 v1, 0x0

    .line 58
    .line 59
    .line 60
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->V3()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getTitleBar()Lcom/kubi/sdk/widget/TitleBar;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    sget p2, Lcom/kubi/welfare/R$string;->invite_bonus:I

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 73
    move-result-object p2

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lcom/kubi/sdk/widget/TitleBar;->setTitle(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->getTitleBar()Lcom/kubi/sdk/widget/TitleBar;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/kubi/sdk/widget/TitleBar;->getRightOneIcon()Landroid/widget/ImageView;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    sget p1, Lcom/kubi/welfare/R$drawable;->kucoin_icon_share_mirrored:I

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 90
    .line 91
    new-instance v3, Lk80/g;

    .line 92
    .line 93
    .line 94
    invoke-direct {v3, p0}, Lk80/g;-><init>(Lcom/kubi/welfare/WelfareInviteFragment;)V

    .line 95
    const/4 v4, 0x1

    .line 96
    const/4 v5, 0x0

    .line 97
    .line 98
    const-wide/16 v1, 0x0

    .line 99
    .line 100
    .line 101
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 102
    return-void
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
.end method

.method public r3(II)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BasePageEntity<",
            "Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/welfare/WelfareInviteFragment;->S3()Ll80/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Ll80/a;->e(II)Lio/reactivex/Observable;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    const-string p2, "compose(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    return-object p1
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
.end method

.method public s3()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/welfare/R$drawable;->ic2_common_empty:I

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
.end method

.method public t3()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/welfare/R$string;->no_award:I

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
.end method

.method public x3()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/welfare/R$layout;->kucoin_item_invite_record:I

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
.end method
