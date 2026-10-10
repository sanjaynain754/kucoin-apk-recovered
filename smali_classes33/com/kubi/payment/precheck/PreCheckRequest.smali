.class public abstract Lcom/kubi/payment/precheck/PreCheckRequest;
.super Ljava/lang/Object;
.source "PreCheckRequest.kt"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;,
        Lcom/kubi/payment/precheck/PreCheckRequest$P2PSellPreCheckRequest;,
        Lcom/kubi/payment/precheck/PreCheckRequest$SellPreCheckRequest;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\u000c\r\u000eB\u001d\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u0002\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/kubi/payment/precheck/PreCheckRequest;",
        "",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "versionCheckRequest",
        "Lcom/kubi/payment/data/entities/VersionCheck$Request;",
        "<init>",
        "(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;)V",
        "getFragmentManager",
        "()Landroidx/fragment/app/FragmentManager;",
        "getVersionCheckRequest",
        "()Lcom/kubi/payment/data/entities/VersionCheck$Request;",
        "BuyPreCheckRequest",
        "SellPreCheckRequest",
        "P2PSellPreCheckRequest",
        "Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;",
        "Lcom/kubi/payment/precheck/PreCheckRequest$SellPreCheckRequest;",
        "PaymentLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final fragmentManager:Landroidx/fragment/app/FragmentManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final versionCheckRequest:Lcom/kubi/payment/data/entities/VersionCheck$Request;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/payment/precheck/PreCheckRequest;->fragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 4
    iput-object p2, p0, Lcom/kubi/payment/precheck/PreCheckRequest;->versionCheckRequest:Lcom/kubi/payment/data/entities/VersionCheck$Request;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    move-object p2, p4

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p4}, Lcom/kubi/payment/precheck/PreCheckRequest;-><init>(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kubi/payment/precheck/PreCheckRequest;-><init>(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;)V

    return-void
.end method


# virtual methods
.method public final getFragmentManager()Landroidx/fragment/app/FragmentManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/precheck/PreCheckRequest;->fragmentManager:Landroidx/fragment/app/FragmentManager;

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
.end method

.method public final getVersionCheckRequest()Lcom/kubi/payment/data/entities/VersionCheck$Request;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/precheck/PreCheckRequest;->versionCheckRequest:Lcom/kubi/payment/data/entities/VersionCheck$Request;

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
.end method
