.class public final Lcom/kubi/clean/service/j;
.super Ljava/lang/Object;
.source "AutoCleanService.kt"

# interfaces
.implements Lcom/kubi/clean/api/service/IAutoCleanService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0012\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0012\u0010\u0013\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016J\u0008\u0010\u0017\u001a\u00020\u000cH\u0016J\u0008\u0010\u0018\u001a\u00020\u000cH\u0016J\u0010\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/kubi/clean/service/AutoCleanService;",
        "Lcom/kubi/clean/api/service/IAutoCleanService;",
        "<init>",
        "()V",
        "showNotice",
        "Lkotlin/Result;",
        "Lcom/kubi/clean/api/entity/AutoCleanDialogResult;",
        "config",
        "Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;",
        "showNotice-YNEx5aM",
        "(Lcom/kubi/clean/api/entity/AutoCleanNoticeRequestConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "dismissAutoLimitView",
        "",
        "container",
        "Landroid/view/ViewGroup;",
        "queryLimitMessage",
        "",
        "",
        "Lcom/kubi/clean/api/entity/IPLimitConfig;",
        "bizTypeList",
        "",
        "Lcom/kubi/clean/api/entity/AutoCleanBizType;",
        "([Lcom/kubi/clean/api/entity/AutoCleanBizType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "bindEvent",
        "refreshTopMsg",
        "onMainTabChanged",
        "mainTabPage",
        "Lcom/kubi/clean/api/constant/MainTabPage;",
        "AutoCleanUserLib_googleRelease"
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
.end method


# virtual methods
.method public a()V
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "\u63a5\u6536\u5230\u5237\u65b0\u4e8b\u4ef6"

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lwb/a;->a(Ljava/lang/String;)V

    .line 7
    const/4 v5, 0x6

    .line 8
    const/4 v6, 0x0

    .line 9
    .line 10
    const-string v1, "event_refresh_top_msg"

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v1 .. v6}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public b()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/clean/service/g;->a:Lcom/kubi/clean/service/g;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/clean/service/g;->e()V

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
.end method

.method public c(Lcom/kubi/clean/api/constant/MainTabPage;)V
    .locals 1
    .param p1    # Lcom/kubi/clean/api/constant/MainTabPage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "mainTabPage"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/clean/service/g;->a:Lcom/kubi/clean/service/g;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/kubi/clean/service/g;->m(Lcom/kubi/clean/api/constant/MainTabPage;)V

    .line 11
    return-void
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
.end method

.method public d(Landroid/view/ViewGroup;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/clean/service/g;->a:Lcom/kubi/clean/service/g;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/kubi/clean/service/g;->j(Landroid/view/ViewGroup;)V

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
.end method

.method public e([Lcom/kubi/clean/api/entity/AutoCleanBizType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1    # [Lcom/kubi/clean/api/entity/AutoCleanBizType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/kubi/clean/api/entity/AutoCleanBizType;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/kubi/clean/api/entity/IPLimitConfig;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/clean/service/g;->a:Lcom/kubi/clean/service/g;

    .line 3
    array-length v1, p1

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, [Lcom/kubi/clean/api/entity/AutoCleanBizType;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lcom/kubi/clean/service/g;->k([Lcom/kubi/clean/api/entity/AutoCleanBizType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 13
    move-result-object p1

    .line 14
    return-object p1
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
.end method
