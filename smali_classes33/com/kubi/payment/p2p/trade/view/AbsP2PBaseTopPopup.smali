.class public abstract Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;
.super Ljava/lang/Object;
.source "AbsP2PBaseTopPopup.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008&\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\u0017\u001a\u00020\u00082\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u000cJ\u0006\u0010\u001b\u001a\u00020\u0008J\u0014\u0010\u001c\u001a\u00020\u00082\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007J\u0010\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u000cH\u0002J\u0006\u0010\u001e\u001a\u00020\u0013J\u0008\u0010\u001f\u001a\u00020 H\'J\u0010\u0010!\u001a\u00020\u00082\u0006\u0010\"\u001a\u00020\u0013H&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\u000c0\u000c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006$"
    }
    d2 = {
        "Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "dismissListener",
        "Lkotlin/Function0;",
        "",
        "popupWindow",
        "Lcom/kubi/resources/widget/BackgroundDarkPopupWindow;",
        "contentView",
        "Landroid/view/View;",
        "kotlin.jvm.PlatformType",
        "getContentView",
        "()Landroid/view/View;",
        "contentView$delegate",
        "Lkotlin/Lazy;",
        "contentViewHolder",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "getContentViewHolder",
        "()Lio/chad/library/adapter/base/BaseViewHolder;",
        "contentViewHolder$delegate",
        "showPopup",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "dependView",
        "dismiss",
        "setOnDismissListener",
        "checkPopup",
        "getViewHolder",
        "getLayout",
        "",
        "initView",
        "viewHolder",
        "Companion",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAbsP2PBaseTopPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsP2PBaseTopPopup.kt\ncom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,117:1\n48#2,2:118\n*S KotlinDebug\n*F\n+ 1 AbsP2PBaseTopPopup.kt\ncom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup\n*L\n54#1:118,2\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:Lcom/kubi/resources/widget/f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final d:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->f:Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup$Companion;

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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->a:Landroid/content/Context;

    .line 11
    .line 12
    new-instance p1, Lgu/c;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, p0}, Lgu/c;-><init>(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->d:Lkotlin/Lazy;

    .line 22
    .line 23
    new-instance p1, Lgu/d;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1, p0}, Lgu/d;-><init>(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    iput-object p1, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->e:Lkotlin/Lazy;

    .line 33
    return-void
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
.end method

.method public static synthetic a(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->f(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)V

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
.end method

.method public static synthetic b(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->j(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)Lkotlin/Unit;

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
.end method

.method public static synthetic c(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)Landroid/view/View;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->h(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)Landroid/view/View;

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
.end method

.method public static synthetic d(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)Lio/chad/library/adapter/base/BaseViewHolder;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->g(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)Lio/chad/library/adapter/base/BaseViewHolder;

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
.end method

.method public static final f(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->b:Lkotlin/jvm/functions/Function0;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 8
    :cond_0
    return-void
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
.end method

.method public static final g(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)Lio/chad/library/adapter/base/BaseViewHolder;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lio/chad/library/adapter/base/BaseViewHolder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->k()Landroid/view/View;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lio/chad/library/adapter/base/BaseViewHolder;-><init>(Landroid/view/View;)V

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
.end method

.method public static final h(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)Landroid/view/View;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->a:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->m()I

    .line 10
    move-result p0

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
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
.end method

.method public static final j(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->c:Lcom/kubi/resources/widget/f;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/resources/widget/f;->dismiss()V

    .line 8
    .line 9
    :cond_0
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
.end method


# virtual methods
.method public final e(Landroid/view/View;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->c:Lcom/kubi/resources/widget/f;

    .line 3
    .line 4
    if-nez v0, :cond_4

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->l()Lio/chad/library/adapter/base/BaseViewHolder;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->o(Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 12
    .line 13
    new-instance v0, Lcom/kubi/resources/widget/f;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->k()Landroid/view/View;

    .line 17
    move-result-object v1

    .line 18
    const/4 v2, -0x1

    .line 19
    const/4 v3, -0x2

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1, v2, v3}, Lcom/kubi/resources/widget/f;-><init>(Landroid/view/View;II)V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->c:Lcom/kubi/resources/widget/f;

    .line 25
    .line 26
    new-instance v1, Lgu/b;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, p0}, Lgu/b;-><init>(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->c:Lcom/kubi/resources/widget/f;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    const/4 v1, 0x1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->c:Lcom/kubi/resources/widget/f;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 47
    .line 48
    .line 49
    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    :cond_1
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->c:Lcom/kubi/resources/widget/f;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    .line 59
    const v1, 0x3e99999a    # 0.3f

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/f;->q(F)V

    .line 63
    .line 64
    :cond_2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->c:Lcom/kubi/resources/widget/f;

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/kubi/resources/widget/f;->n()V

    .line 70
    .line 71
    :cond_3
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->c:Lcom/kubi/resources/widget/f;

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/f;->h(Landroid/view/View;)V

    .line 77
    :cond_4
    return-void
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
.end method

.method public final i()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->c:Lcom/kubi/resources/widget/f;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Lgu/a;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0}, Lgu/a;-><init>(Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/kubi/utils/x0;->d(Lkotlin/jvm/functions/Function0;)V

    .line 29
    :cond_1
    return-void
    .line 30
    .line 31
.end method

.method public final k()Landroid/view/View;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->d:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

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
.end method

.method public final l()Lio/chad/library/adapter/base/BaseViewHolder;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->e:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lio/chad/library/adapter/base/BaseViewHolder;

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
.end method

.method public abstract m()I
    .annotation build Landroidx/annotation/LayoutRes;
    .end annotation
.end method

.method public final n()Lio/chad/library/adapter/base/BaseViewHolder;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->l()Lio/chad/library/adapter/base/BaseViewHolder;

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
.end method

.method public abstract o(Lio/chad/library/adapter/base/BaseViewHolder;)V
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public final p(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "dismiss"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->b:Lkotlin/jvm/functions/Function0;

    .line 8
    return-void
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
.end method

.method public final q(Landroidx/fragment/app/FragmentActivity;Landroid/view/View;)V
    .locals 6
    .param p1    # Landroidx/fragment/app/FragmentActivity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    if-eqz p2, :cond_2

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-nez p1, :cond_2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 20
    move-result p1

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    goto :goto_2

    .line 24
    .line 25
    .line 26
    :cond_0
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->e(Landroid/view/View;)V

    .line 27
    .line 28
    iget-object p1, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->c:Lcom/kubi/resources/widget/f;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Lcom/kubi/resources/widget/f;->h(Landroid/view/View;)V

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto :goto_1

    .line 38
    .line 39
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;->c:Lcom/kubi/resources/widget/f;

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    const/4 v0, 0x0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2, v0, v0}, Lcom/kubi/resources/widget/f;->showAsDropDown(Landroid/view/View;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    return-void

    .line 47
    .line 48
    .line 49
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    new-instance v0, Lcom/kubi/otc/exception/OtcMessage;

    .line 57
    const/4 v4, 0x4

    .line 58
    const/4 v5, 0x0

    .line 59
    .line 60
    const-string v1, "showPopup\uff1aexception"

    .line 61
    const/4 v3, 0x0

    .line 62
    .line 63
    .line 64
    invoke-direct/range {v0 .. v5}, Lcom/kubi/otc/exception/OtcMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    const/4 p1, 0x2

    .line 66
    const/4 p2, 0x0

    .line 67
    .line 68
    .line 69
    invoke-static {v0, p2, p1, p2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 70
    :cond_2
    :goto_2
    return-void
    .line 71
    .line 72
    .line 73
.end method
