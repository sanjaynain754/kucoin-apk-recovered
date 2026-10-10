.class public final Lcom/sumsub/sns/core/presentation/base/K0;
.super Lkotlin/coroutines/AbstractCoroutineContextElement;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/coroutines/CoroutineExceptionHandler;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/core/presentation/base/M0;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;Lcom/sumsub/sns/core/presentation/base/M0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p2, p0, Lcom/sumsub/sns/core/presentation/base/K0;->a:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lkotlin/coroutines/AbstractCoroutineContextElement;-><init>(Lkotlin/coroutines/CoroutineContext$Key;)V

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
.method public final handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/K0;->a:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 11
    .line 12
    const-string v1, "Prepare error"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1, v1, p2}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/base/K0;->a:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/M0;->onPrepareError()V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/sumsub/sns/core/presentation/base/K0;->a:Lcom/sumsub/sns/core/presentation/base/M0;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/C;->getDocumentType()Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    const/4 v4, 0x4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    move-object v1, p2

    .line 31
    .line 32
    .line 33
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    .line 34
    return-void
    .line 35
    .line 36
    .line 37
.end method
