.class public final Lcom/sumsub/sns/internal/features/presentation/videoident/chat/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Ltvi/webrtc/VideoProcessor;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public b:Lkotlin/jvm/functions/Function0;

.field public c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/chat/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method
