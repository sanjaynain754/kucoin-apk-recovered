.class public final Lcom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$b;
.super Ljava/lang/Object;
.source "BuyCryptoCurrencyDialog.kt"

# interfaces
.implements Lcom/kubi/kucoin/view/IndexBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog;->w4(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0008\u0010\u0008\u001a\u00020\u0003H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$listenSideBar$1",
        "Lcom/kubi/kucoin/view/IndexBar$OnIndexPressListener;",
        "onIndexChange",
        "",
        "index",
        "",
        "text",
        "",
        "onMotionEventEnd",
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
        "SMAP\nBuyCryptoCurrencyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$listenSideBar$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n360#2,7:183\n*S KotlinDebug\n*F\n+ 1 BuyCryptoCurrencyDialog.kt\ncom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$listenSideBar$1\n*L\n163#1:183,7\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Landroidx/recyclerview/widget/LinearLayoutManager;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroidx/recyclerview/widget/LinearLayoutManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;",
            ">;",
            "Landroidx/recyclerview/widget/LinearLayoutManager;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$b;->a:Ljava/util/List;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$b;->b:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 5

    .line 1
    .line 2
    const-string p1, "text"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$b;->a:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x0

    .line 13
    move v1, v0

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v2

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;->getCanIndex()Ljava/lang/Boolean;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    move-result v3

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;->getTitle()Ljava/lang/String;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Lkotlin/text/StringsKt;->first(Ljava/lang/CharSequence;)C

    .line 47
    move-result v2

    .line 48
    .line 49
    .line 50
    invoke-static {p2}, Lkotlin/text/StringsKt;->first(Ljava/lang/CharSequence;)C

    .line 51
    move-result v3

    .line 52
    .line 53
    if-ne v2, v3, :cond_0

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v1, -0x1

    .line 59
    .line 60
    :goto_1
    if-ltz v1, :cond_2

    .line 61
    .line 62
    iget-object p1, p0, Lcom/kubi/payment/fasttradev2/buy/BuyCryptoCurrencyDialog$b;->b:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 63
    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->scrollToPositionWithOffset(II)V

    .line 68
    :cond_2
    return-void
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
