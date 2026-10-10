.class public final Lcom/kubi/quotefacade/HomeMarketFragment$b;
.super Lww/b;
.source "HomeMarketFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/quotefacade/HomeMarketFragment;->O3(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/quotefacade/HomeMarketFragment$initViewPager$1",
        "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;",
        "onTabSelect",
        "",
        "position",
        "",
        "QuoteFacadeLib_googleRelease"
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
.field public final synthetic a:Lcom/kubi/quotefacade/HomeMarketFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/quotefacade/HomeMarketFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/quotefacade/HomeMarketFragment$b;->a:Lcom/kubi/quotefacade/HomeMarketFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lww/b;-><init>()V

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
.method public b(I)V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment$b;->a:Lcom/kubi/quotefacade/HomeMarketFragment;

    .line 3
    .line 4
    sget v1, Lcom/kubi/quotefacade/R$string;->discover_emotion_chance:I

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/kubi/quotefacade/HomeMarketFragment;->z3(Lcom/kubi/quotefacade/HomeMarketFragment;I)I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eq p1, v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/quotefacade/HomeMarketFragment$b;->a:Lcom/kubi/quotefacade/HomeMarketFragment;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/kubi/quotefacade/HomeMarketFragment;->x3(Lcom/kubi/quotefacade/HomeMarketFragment;)Ljava/util/List;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    check-cast p1, Lcom/kubi/quotefacade/entity/PageInfo;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/PageInfo;->getTabChangedLocationId()Ljava/lang/String;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    move-object v2, p1

    .line 35
    goto :goto_2

    .line 36
    .line 37
    :cond_1
    :goto_1
    const-string p1, ""

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :goto_2
    const/16 v4, 0x8

    .line 41
    const/4 v5, 0x0

    .line 42
    .line 43
    const-string v0, "B5Markets"

    .line 44
    .line 45
    const-string v1, "TopNav"

    .line 46
    const/4 v3, 0x0

    .line 47
    .line 48
    .line 49
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 50
    :cond_2
    return-void
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
