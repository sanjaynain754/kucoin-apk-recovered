.class public final Lcom/kubi/kumex/BKuMexFetchStartupTask$a;
.super Ljava/lang/Object;
.source "BKuMexFetchStartupTask.kt"

# interfaces
.implements Lcom/kubi/sdk/function/language/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/kumex/BKuMexFetchStartupTask;->initFutures()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "com/kubi/kumex/BKuMexFetchStartupTask$initFutures$2",
        "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;",
        "last",
        "Lcom/kubi/sdk/function/language/LanguageType;",
        "onLanguageChange",
        "",
        "language",
        "KumexLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Lcom/kubi/sdk/function/language/LanguageType;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/kubi/kumex/BKuMexFetchStartupTask$a;->a:Lcom/kubi/sdk/function/language/LanguageType;

    .line 8
    return-void
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
.method public onLanguageChange(Lcom/kubi/sdk/function/language/LanguageType;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "language"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/kumex/BKuMexFetchStartupTask$a;->a:Lcom/kubi/sdk/function/language/LanguageType;

    .line 8
    .line 9
    if-eq v0, p1, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lcom/kubi/kumex/BKuMexFetchStartupTask$a;->a:Lcom/kubi/sdk/function/language/LanguageType;

    .line 12
    .line 13
    sget-object p1, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Lth/d;->h()V

    .line 21
    :cond_0
    return-void
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
