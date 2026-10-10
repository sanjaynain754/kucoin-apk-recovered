.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public a:[B

.field public b:Lcom/sumsub/sns/internal/core/domain/facedetector/o;

.field public c:Lxg0/a;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/Integer;

.field public h:Ljava/lang/Integer;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/Integer;

.field public l:Ljava/lang/Integer;

.field public m:Lcom/sumsub/sns/internal/features/data/model/prooface/l;

.field public n:Lcom/sumsub/sns/internal/features/data/model/prooface/c;

.field public o:I

.field public p:J

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;

.field public s:I


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->r:Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

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
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->q:Ljava/lang/Object;

    .line 3
    .line 4
    iget p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->s:I

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    or-int/2addr p1, v0

    .line 8
    .line 9
    iput p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->s:I

    .line 10
    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/F0;->r:Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v5, p0

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/G0;->a(Landroid/graphics/Bitmap;Landroid/util/Size;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/prooface/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 20
    move-result-object p1

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
.end method
