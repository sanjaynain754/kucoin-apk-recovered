.class public final Lcom/kubi/futures/trade/welfare/history/WelfareHistoryFragment$a;
.super Lww/b;
.source "WelfareHistoryFragment.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/futures/trade/welfare/history/WelfareHistoryFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
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
        "com/kubi/futures/trade/welfare/history/WelfareHistoryFragment$onViewCreated$1",
        "Lcom/kubi/resources/widget/flyco/listener/OnTabSelectListener;",
        "onTabSelect",
        "",
        "position",
        "",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lww/b;-><init>()V

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
.end method


# virtual methods
.method public b(I)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lww/b;->b(I)V

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    const-string p1, "couponHistory"

    .line 11
    :goto_0
    move-object v1, p1

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_0
    const-string p1, "bonusHistory"

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_1
    const-string p1, "airdropHistory"

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :goto_1
    const/16 v4, 0xc

    .line 21
    const/4 v5, 0x0

    .line 22
    .line 23
    const-string v0, "B11FuturesBonus"

    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    .line 27
    .line 28
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 29
    return-void
    .line 30
    .line 31
    .line 32
.end method
