.class public final Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;
.super Lcom/kubi/payment/precheck/PreCheckRequest;
.source "PreCheckRequest.kt"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/payment/precheck/PreCheckRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BuyPreCheckRequest"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;",
        "Lcom/kubi/payment/precheck/PreCheckRequest;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "versionCheckRequest",
        "Lcom/kubi/payment/data/entities/VersionCheck$Request;",
        "needCheckTradingPassword",
        "",
        "needCheckEmail",
        "needCheckPhone",
        "<init>",
        "(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;ZZZ)V",
        "getNeedCheckTradingPassword",
        "()Z",
        "getNeedCheckEmail",
        "getNeedCheckPhone",
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
.field private final needCheckEmail:Z

.field private final needCheckPhone:Z

.field private final needCheckTradingPassword:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;ZZZ)V
    .locals 1
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/payment/data/entities/VersionCheck$Request;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/payment/precheck/PreCheckRequest;-><init>(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-boolean p3, p0, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;->needCheckTradingPassword:Z

    .line 4
    iput-boolean p4, p0, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;->needCheckEmail:Z

    .line 5
    iput-boolean p5, p0, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;->needCheckPhone:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    const/4 p7, 0x0

    if-eqz p2, :cond_1

    move v3, p7

    goto :goto_0

    :cond_1
    move v3, p3

    :goto_0
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    move v4, p7

    goto :goto_1

    :cond_2
    move v4, p4

    :goto_1
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    move v5, p7

    :goto_2
    move-object v0, p0

    move-object v1, p1

    goto :goto_3

    :cond_3
    move v5, p5

    goto :goto_2

    .line 1
    :goto_3
    invoke-direct/range {v0 .. v5}, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;-><init>(Landroidx/fragment/app/FragmentManager;Lcom/kubi/payment/data/entities/VersionCheck$Request;ZZZ)V

    return-void
.end method


# virtual methods
.method public final getNeedCheckEmail()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;->needCheckEmail:Z

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
.end method

.method public final getNeedCheckPhone()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;->needCheckPhone:Z

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
.end method

.method public final getNeedCheckTradingPassword()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/payment/precheck/PreCheckRequest$BuyPreCheckRequest;->needCheckTradingPassword:Z

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
.end method
