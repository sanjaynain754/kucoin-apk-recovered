.class public final Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment$b;
.super Ljava/lang/Object;
.source "SearchCoinFragment.kt"

# interfaces
.implements Lcom/kubi/kucoin/view/IndexBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;->o4()V
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
        "com/kubi/assets/search/depositandwithdraw/SearchCoinFragment$listenSideBar$1",
        "Lcom/kubi/kucoin/view/IndexBar$OnIndexPressListener;",
        "onIndexChange",
        "",
        "index",
        "",
        "text",
        "",
        "onMotionEventEnd",
        "AssetsCenterLib_googleRelease"
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
.field public final synthetic a:Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment$b;->a:Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(ILjava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    const-string p1, "text"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    const-string v0, "onIndexChange:"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    const-string v0, "new_search"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 31
    move-result p1

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    return-void

    .line 35
    .line 36
    :cond_0
    iget-object p1, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment$b;->a:Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;

    .line 37
    .line 38
    new-instance v0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetPositionForSection;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;->G3(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;)Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, v1, p2}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent$GetPositionForSection;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;->I3(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinFragment;Lcom/kubi/assets/search/depositandwithdraw/SearchCoinContract$UiIntent;)V

    .line 53
    return-void
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
.end method
