.class public final Lio/trtc/tuikit/atomicxcore/impl/conversation/J;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# instance fields
.field public a:Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;

.field public b:Ljava/util/List;

.field public c:Lkotlin/jvm/internal/Ref$LongRef;

.field public synthetic d:Ljava/lang/Object;

.field public e:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

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
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->d:Ljava/lang/Object;

    .line 3
    .line 4
    iget p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->e:I

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    or-int/2addr p1, v0

    .line 8
    .line 9
    iput p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->e:I

    .line 10
    const/4 p1, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p0}, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
