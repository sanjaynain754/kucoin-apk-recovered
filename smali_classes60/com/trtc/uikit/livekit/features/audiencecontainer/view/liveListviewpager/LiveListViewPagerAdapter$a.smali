.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$a;
.super Ljava/lang/Object;
.source "LiveListViewPagerAdapter.kt"

# interfaces
.implements Lde0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0005H\u0016\u00a8\u0006\r"
    }
    d2 = {
        "com/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$fetchData$1",
        "Lcom/trtc/uikit/livekit/features/audiencecontainer/AudienceContainerViewDefine$LiveListCallback;",
        "onSuccess",
        "",
        "cursor",
        "",
        "liveInfoList",
        "",
        "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;",
        "onError",
        "code",
        "",
        "message",
        "tuilivekit_googleRelease"
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
.field public final synthetic a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;

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
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "message"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;->g()Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    const-string v2, "fetchLiveList failed,errorCode:"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string p1, ",message:"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;

    .line 40
    const/4 p2, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;->j(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;Z)V

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
.end method

.method public onSuccess(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "cursor"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "liveInfoList"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object p1, Lee0/a;->a:Lee0/a;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lee0/a;->e()Lkotlinx/coroutines/flow/n;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    check-cast p1, Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    move-result p1

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;->h(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;)Ljava/util/List;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 38
    move-result p1

    .line 39
    .line 40
    iget-object v0, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;->h(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;)Ljava/util/List;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;

    .line 50
    .line 51
    .line 52
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;->h(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;)Ljava/util/List;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 57
    move-result v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeInserted(II)V

    .line 61
    .line 62
    :cond_0
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;

    .line 63
    const/4 p2, 0x1

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;->i(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;Z)V

    .line 67
    .line 68
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter$a;->a:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;

    .line 69
    const/4 p2, 0x0

    .line 70
    .line 71
    .line 72
    invoke-static {p1, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;->j(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/liveListviewpager/LiveListViewPagerAdapter;Z)V

    .line 73
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
.end method
