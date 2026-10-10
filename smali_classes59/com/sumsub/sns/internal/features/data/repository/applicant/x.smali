.class public final Lcom/sumsub/sns/internal/features/data/repository/applicant/x;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/io/File;

.field public c:Ljava/lang/String;

.field public d:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

.field public e:Ljava/util/Map;

.field public f:Lcom/sumsub/sns/internal/features/data/model/common/X;

.field public g:Lcom/sumsub/sns/internal/features/data/utils/a;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lcom/sumsub/sns/internal/features/data/repository/applicant/z;

.field public j:I


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->i:Lcom/sumsub/sns/internal/features/data/repository/applicant/z;

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
    .locals 9

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->h:Ljava/lang/Object;

    .line 3
    .line 4
    iget p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->j:I

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    or-int/2addr p1, v0

    .line 8
    .line 9
    iput p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->j:I

    .line 10
    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->i:Lcom/sumsub/sns/internal/features/data/repository/applicant/z;

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v8, p0

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {v0 .. v8}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/utils/a;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    return-object p1
    .line 25
.end method
