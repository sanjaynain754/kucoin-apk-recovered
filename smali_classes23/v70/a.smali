.class public final Lv70/a;
.super Ljava/lang/Object;
.source "UtilsIssue.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001f\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a#\u0010\u000f\u001a\u00020\u00042\n\u0010\u000c\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0011H\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "",
        "e",
        "",
        "source",
        "",
        "a",
        "(Ljava/lang/Throwable;Ljava/lang/String;)V",
        "msg",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "ignore",
        "Lcom/kubi/utils/exception/DowngradeCode;",
        "code",
        "c",
        "(Ljava/lang/Exception;Lcom/kubi/utils/exception/DowngradeCode;)V",
        "Lcom/kubi/utils/exception/GsonCode;",
        "d",
        "(Ljava/lang/Throwable;Lcom/kubi/utils/exception/GsonCode;)V",
        "Utils_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 8
    .param p0    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .line 1
    .line 2
    const-string v0, "e"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "source"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    new-instance v1, Lcom/kubi/utils/exception/UtilsException;

    .line 14
    .line 15
    const/16 v6, 0x8

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v2, p0

    .line 20
    move-object v3, p1

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v1 .. v7}, Lcom/kubi/utils/exception/UtilsException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    const/4 p0, 0x0

    .line 25
    const/4 p1, 0x2

    .line 26
    .line 27
    .line 28
    invoke-static {v1, p0, p1, p0}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 29
    return-void
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

.method public static final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "msg"

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "source"

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    new-instance v1, Lcom/kubi/utils/exception/UtilsMessage;

    .line 15
    const/4 v5, 0x4

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v2, p0

    .line 19
    move-object v3, p1

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v1 .. v6}, Lcom/kubi/utils/exception/UtilsMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    const/4 p0, 0x0

    .line 24
    const/4 p1, 0x2

    .line 25
    .line 26
    .line 27
    invoke-static {v1, p0, p1, p0}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 28
    return-void
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

.method public static final c(Ljava/lang/Exception;Lcom/kubi/utils/exception/DowngradeCode;)V
    .locals 8
    .param p0    # Ljava/lang/Exception;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/kubi/utils/exception/DowngradeCode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "ignore"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "code"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v1, Lcom/kubi/utils/exception/DowngradeException;

    .line 13
    .line 14
    const/16 v6, 0x8

    .line 15
    const/4 v7, 0x0

    .line 16
    .line 17
    const-string v3, "downgrade"

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    move-object v2, p0

    .line 21
    .line 22
    .line 23
    invoke-direct/range {v1 .. v7}, Lcom/kubi/utils/exception/DowngradeException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    const/4 p0, 0x0

    .line 25
    const/4 v0, 0x2

    .line 26
    .line 27
    .line 28
    invoke-static {v1, p0, v0, p0}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 29
    .line 30
    sget-object p0, Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;->CATE_DOWNGRADE:Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 34
    move-result p1

    .line 35
    .line 36
    .line 37
    invoke-static {p0, p1}, Lqq/h;->d(Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;I)V

    .line 38
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public static final d(Ljava/lang/Throwable;Lcom/kubi/utils/exception/GsonCode;)V
    .locals 8
    .param p0    # Ljava/lang/Throwable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/kubi/utils/exception/GsonCode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .line 1
    .line 2
    const-string v0, "ignore"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "code"

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "GsonConvert"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, p0}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    sget-object v0, Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;->CATE_GSON:Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 21
    move-result p1

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p1}, Lqq/h;->d(Lcom/kubi/sdk/constant/monitor/KunlunTechEventEnum;I)V

    .line 25
    .line 26
    new-instance v1, Lcom/kubi/utils/exception/JsonConvertException;

    .line 27
    .line 28
    const/16 v6, 0x8

    .line 29
    const/4 v7, 0x0

    .line 30
    .line 31
    const-string v3, "GsonConvert"

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    move-object v2, p0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/utils/exception/JsonConvertException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 p0, 0x0

    .line 39
    const/4 p1, 0x2

    .line 40
    .line 41
    .line 42
    invoke-static {v1, p0, p1, p0}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    return-void
    .line 44
    .line 45
.end method
