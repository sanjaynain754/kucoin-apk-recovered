.class public interface abstract Lcom/sumsub/sns/internal/features/data/repository/sumsubid/i;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\nJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u000cJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u000cJ\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u000c\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/data/repository/sumsubid/i;",
        "",
        "Lcom/sumsub/sns/internal/features/data/model/sumsubid/B;",
        "email",
        "Lcom/sumsub/sns/internal/features/data/model/sumsubid/F;",
        "a",
        "(Lcom/sumsub/sns/internal/features/data/model/sumsubid/B;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/sumsub/sns/internal/features/data/model/sumsubid/p;",
        "body",
        "Lcom/sumsub/sns/internal/features/data/model/sumsubid/m;",
        "(Lcom/sumsub/sns/internal/features/data/model/sumsubid/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/sumsub/sns/internal/features/data/model/sumsubid/y;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lretrofit2/Response;",
        "Lcom/sumsub/sns/internal/features/data/model/sumsubid/d;",
        "b",
        "Lcom/sumsub/sns/internal/features/data/model/sumsubid/I;",
        "Lcom/sumsub/sns/internal/features/data/model/common/remote/I;",
        "(Lcom/sumsub/sns/internal/features/data/model/sumsubid/I;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "c",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Lcom/sumsub/sns/internal/features/data/model/sumsubid/B;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/sumsub/sns/internal/features/data/model/sumsubid/B;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sumsub/sns/internal/features/data/model/sumsubid/B;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sumsub/sns/internal/features/data/model/sumsubid/F;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "resources/snsId/sdk/profile/auth"
    .end annotation
.end method

.method public abstract a(Lcom/sumsub/sns/internal/features/data/model/sumsubid/I;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/sumsub/sns/internal/features/data/model/sumsubid/I;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sumsub/sns/internal/features/data/model/sumsubid/I;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sumsub/sns/internal/features/data/model/common/remote/I;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "resources/snsId/sdk/profile/reuse"
    .end annotation
.end method

.method public abstract a(Lcom/sumsub/sns/internal/features/data/model/sumsubid/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/sumsub/sns/internal/features/data/model/sumsubid/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sumsub/sns/internal/features/data/model/sumsubid/p;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sumsub/sns/internal/features/data/model/sumsubid/m;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "resources/snsId/sdk/profile/auth/confirm"
    .end annotation
.end method

.method public abstract a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sumsub/sns/internal/features/data/model/sumsubid/y;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "resources/snsId/sdk/profile/reuse/preview"
    .end annotation
.end method

.method public abstract b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lretrofit2/Response<",
            "Lcom/sumsub/sns/internal/features/data/model/sumsubid/d;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "resources/snsId/sdk/profile/oauthCode"
    .end annotation
.end method

.method public abstract c(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/PUT;
        value = "resources/snsId/sdk/profile/agreement/accept"
    .end annotation
.end method
