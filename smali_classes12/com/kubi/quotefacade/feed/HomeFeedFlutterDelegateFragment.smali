.class public final Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;
.super Lcom/kubi/sdk/flutter/ui/FlutterDelegateLifecycleFragment;
.source "HomeFeedFlutterDelegateFragment.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\u0008\u0010\u0010\u001a\u00020\u000bH\u0002J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u0016J\u0008\u0010\u0014\u001a\u00020\u000fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;",
        "Lcom/kubi/sdk/flutter/ui/FlutterDelegateLifecycleFragment;",
        "<init>",
        "()V",
        "feedChannel",
        "Lcom/kubi/quotefacade/feed/FeedHandlerChannel;",
        "getFeedChannel",
        "()Lcom/kubi/quotefacade/feed/FeedHandlerChannel;",
        "feedChannel$delegate",
        "Lkotlin/Lazy;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "getTextureMode",
        "",
        "bindEvent",
        "onViewCreated",
        "view",
        "Landroid/view/View;",
        "isLegalState",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeFeedFlutterDelegateFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFeedFlutterDelegateFragment.kt\ncom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,67:1\n76#2,7:68\n153#2,7:75\n76#2,7:82\n81#2,2:89\n153#2,7:91\n76#2,7:98\n*S KotlinDebug\n*F\n+ 1 HomeFeedFlutterDelegateFragment.kt\ncom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment\n*L\n28#1:68,7\n33#1:75,7\n38#1:82,7\n43#1:89,2\n48#1:91,7\n53#1:98,7\n*E\n"
    }
.end annotation


# instance fields
.field public final Y:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/flutter/ui/FlutterDelegateLifecycleFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/quotefacade/feed/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/kubi/quotefacade/feed/a;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;->Y:Lkotlin/Lazy;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static synthetic n3()Lcom/kubi/quotefacade/feed/FeedHandlerChannel;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;->r3()Lcom/kubi/quotefacade/feed/FeedHandlerChannel;

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
.end method

.method public static final synthetic o3(Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;)Lcom/kubi/quotefacade/feed/FeedHandlerChannel;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;->s3()Lcom/kubi/quotefacade/feed/FeedHandlerChannel;

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
.end method

.method public static final synthetic p3(Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;->t3()Z

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
.end method

.method private final q3()V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/event/api/b;->a:Lcom/kubi/event/api/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    const-string v2, "com.kubi.home.feed.QuoteEvent:home_feed_tab_change"

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 14
    move-result v1

    .line 15
    .line 16
    :cond_0
    new-instance v1, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$default$1;

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2, v3, p0}, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$default$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;)V

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 28
    move-result v1

    .line 29
    .line 30
    const-string v4, "com.kubi.home.feed.QuoteEvent:home_tab_jump_page_top"

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 36
    move-result v1

    .line 37
    .line 38
    :cond_1
    new-instance v1, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$default$2;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, v4, v3, p0}, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$default$2;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 48
    move-result v1

    .line 49
    .line 50
    const-string v4, "com.kubi.home.feed.QuoteEvent:home_feed_visible_height_change"

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 56
    move-result v1

    .line 57
    .line 58
    :cond_2
    new-instance v1, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$default$3;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v4, v3, p0}, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$default$3;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 68
    move-result v1

    .line 69
    .line 70
    const-string v4, "com.kubi.home.feed.QuoteEvent:home_feed_on_top"

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 76
    move-result v1

    .line 77
    .line 78
    :cond_3
    new-instance v1, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$1;

    .line 79
    .line 80
    .line 81
    invoke-direct {v1, v4, v3, p0}, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;)V

    .line 82
    const/4 v4, 0x1

    .line 83
    .line 84
    .line 85
    invoke-static {p0, v4, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 89
    move-result v1

    .line 90
    .line 91
    const-string v4, "com.kubi.home.feed.QuoteEvent:fake_tab_change"

    .line 92
    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    .line 96
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 97
    move-result v1

    .line 98
    .line 99
    :cond_4
    new-instance v1, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$default$4;

    .line 100
    .line 101
    .line 102
    invoke-direct {v1, v4, v3, p0}, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$default$4;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 109
    move-result v0

    .line 110
    .line 111
    const-string v1, "com.kubi.home.feed.QuoteEvent:home_feed_native_scroll_vertical_speed"

    .line 112
    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    .line 116
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 117
    move-result v0

    .line 118
    .line 119
    :cond_5
    new-instance v0, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$default$5;

    .line 120
    .line 121
    .line 122
    invoke-direct {v0, v1, v3, p0}, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment$bindEvent$$inlined$bindFlowEvent$default$5;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;)V

    .line 123
    .line 124
    .line 125
    invoke-static {p0, v2, v0}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 126
    return-void
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
.end method

.method public static final r3()Lcom/kubi/quotefacade/feed/FeedHandlerChannel;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/feed/FeedHandlerChannel;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/quotefacade/feed/FeedHandlerChannel;-><init>()V

    .line 6
    return-object v0
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
.end method


# virtual methods
.method public l3()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;->q3()V

    .line 7
    return-void
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
    invoke-super {p0, p1, p2}, Lcom/kubi/sdk/flutter/ui/FlutterDelegateFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/sdk/flutter/ui/FlutterDelegateFragment;->k3()Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;->s3()Lcom/kubi/quotefacade/feed/FeedHandlerChannel;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->h(Lcom/kubi/sdk/flutter/delegate/t;)V

    .line 20
    return-void
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
.end method

.method public final s3()Lcom/kubi/quotefacade/feed/FeedHandlerChannel;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/feed/HomeFeedFlutterDelegateFragment;->Y:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/quotefacade/feed/FeedHandlerChannel;

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
.end method

.method public final t3()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isRemoving()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
