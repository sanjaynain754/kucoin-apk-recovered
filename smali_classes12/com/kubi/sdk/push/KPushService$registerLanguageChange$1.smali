.class public final Lcom/kubi/sdk/push/KPushService$registerLanguageChange$1;
.super Ljava/lang/Object;
.source "KPushService.kt"

# interfaces
.implements Lcom/kubi/sdk/function/language/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/sdk/push/KPushService;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/kubi/sdk/push/KPushService$registerLanguageChange$1",
        "Lcom/kubi/sdk/function/language/MultiLanguageManager$OnLanguageChangeListener;",
        "onLanguageChange",
        "",
        "language",
        "Lcom/kubi/sdk/function/language/LanguageType;",
        "LJiGuang_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
    .line 6
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
.method public onLanguageChange(Lcom/kubi/sdk/function/language/LanguageType;)V
    .locals 6

    .line 1
    .line 2
    const-string v0, "language"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p1, Lcom/kubi/sdk/push/PushManger;->a:Lcom/kubi/sdk/push/PushManger;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/sdk/push/PushManger;->g()Lkotlinx/coroutines/m0;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    new-instance v3, Lcom/kubi/sdk/push/KPushService$registerLanguageChange$1$onLanguageChange$1;

    .line 14
    const/4 p1, 0x0

    .line 15
    .line 16
    .line 17
    invoke-direct {v3, p1}, Lcom/kubi/sdk/push/KPushService$registerLanguageChange$1$onLanguageChange$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 18
    const/4 v4, 0x3

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 25
    return-void
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
