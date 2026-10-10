.class public final Lcom/sumsub/sns/internal/features/domain/mrtd/f;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Lcom/sumsub/sns/internal/features/data/model/common/remote/v0;

.field public f:Z

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lcom/sumsub/sns/internal/features/domain/mrtd/i;

.field public i:I


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/domain/mrtd/i;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->h:Lcom/sumsub/sns/internal/features/domain/mrtd/i;

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
    .locals 8

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->g:Ljava/lang/Object;

    .line 3
    .line 4
    iget p1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->i:I

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    or-int/2addr p1, v0

    .line 8
    .line 9
    iput p1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->i:I

    .line 10
    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/f;->h:Lcom/sumsub/sns/internal/features/domain/mrtd/i;

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v7, p0

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {v0 .. v7}, Lcom/sumsub/sns/internal/features/domain/mrtd/i;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/data/model/common/remote/v0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 22
    move-result-object p1

    .line 23
    return-object p1
    .line 24
    .line 25
.end method
