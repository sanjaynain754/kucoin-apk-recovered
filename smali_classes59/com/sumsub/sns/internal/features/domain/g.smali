.class public final Lcom/sumsub/sns/internal/features/domain/g;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public a:Ljava/io/Serializable;

.field public b:Ljava/lang/Object;

.field public c:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public d:Lcom/sumsub/sns/internal/features/data/model/common/h;

.field public e:Ljava/lang/String;

.field public f:Ljava/io/Serializable;

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lcom/sumsub/sns/internal/features/domain/h;

.field public i:I


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/domain/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/g;->h:Lcom/sumsub/sns/internal/features/domain/h;

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
    .locals 1

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/g;->g:Ljava/lang/Object;

    .line 3
    .line 4
    iget p1, p0, Lcom/sumsub/sns/internal/features/domain/g;->i:I

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    or-int/2addr p1, v0

    .line 8
    .line 9
    iput p1, p0, Lcom/sumsub/sns/internal/features/domain/g;->i:I

    .line 10
    .line 11
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/domain/g;->h:Lcom/sumsub/sns/internal/features/domain/h;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0, v0, p0}, Lcom/sumsub/sns/internal/features/domain/h;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
