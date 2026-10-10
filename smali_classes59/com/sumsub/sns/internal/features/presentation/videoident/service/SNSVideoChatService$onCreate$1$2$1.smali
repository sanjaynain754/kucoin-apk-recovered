.class final Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService$onCreate$1$2$1;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService$onCreate$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService$onCreate$1$2$1;->this$0:Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService;

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
.end method


# virtual methods
.method public final emit(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService$onCreate$1$2$1;->this$0:Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService;

    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService;->access$handleChatState(Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService;Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;)V

    .line 3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;

    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/videoident/service/SNSVideoChatService$onCreate$1$2$1;->emit(Lcom/sumsub/sns/internal/features/presentation/videoident/chat/SNSVideoChatState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
