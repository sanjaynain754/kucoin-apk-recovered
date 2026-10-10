.class public final Lcom/kubi/assets/autoearn/AutoEarnCloseDialog$initEfforts$1$1$a;
.super Ljava/lang/Object;
.source "AutoEarnCloseDialog.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/assets/autoearn/AutoEarnCloseDialog$initEfforts$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAutoEarnCloseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoEarnCloseDialog.kt\ncom/kubi/assets/autoearn/AutoEarnCloseDialog$initEfforts$1$1$1\n+ 2 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n*L\n1#1,102:1\n48#2,2:103\n*S KotlinDebug\n*F\n+ 1 AutoEarnCloseDialog.kt\ncom/kubi/assets/autoearn/AutoEarnCloseDialog$initEfforts$1$1$1\n*L\n78#1:103,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/kubi/assets/autoearn/AutoEarnCloseDialog;


# direct methods
.method public constructor <init>(Lcom/kubi/assets/autoearn/AutoEarnCloseDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/autoearn/AutoEarnCloseDialog$initEfforts$1$1$a;->b:Lcom/kubi/assets/autoearn/AutoEarnCloseDialog;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method


# virtual methods
.method public final a(Lcom/kubi/assets/autoearn/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/assets/autoearn/f;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of p2, p1, Lcom/kubi/assets/autoearn/f$b;

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/kubi/assets/autoearn/AutoEarnCloseDialog$initEfforts$1$1$a;->b:Lcom/kubi/assets/autoearn/AutoEarnCloseDialog;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    instance-of p2, p1, Lcom/kubi/assets/autoearn/f$a;

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    check-cast p1, Lcom/kubi/assets/autoearn/f$a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/assets/autoearn/f$a;->a()Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    const/4 p2, 0x0

    .line 22
    .line 23
    new-array p2, p2, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p2}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    iget-object p1, p0, Lcom/kubi/assets/autoearn/AutoEarnCloseDialog$initEfforts$1$1$a;->b:Lcom/kubi/assets/autoearn/AutoEarnCloseDialog;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_1
    new-instance v0, Lcom/kubi/assets/exception/AssetsMessage;

    .line 35
    const/4 v4, 0x4

    .line 36
    const/4 v5, 0x0

    .line 37
    .line 38
    const-string v1, "AutoEarnCloseDialog \u5173\u95ed\u72b6\u6001\u9519\u8bef"

    .line 39
    .line 40
    const-string v2, "AutoEarnCloseDialog"

    .line 41
    const/4 v3, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v0 .. v5}, Lcom/kubi/assets/exception/AssetsMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    const/4 p1, 0x2

    .line 46
    const/4 p2, 0x0

    .line 47
    .line 48
    .line 49
    invoke-static {v0, p2, p1, p2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 50
    .line 51
    iget-object p1, p0, Lcom/kubi/assets/autoearn/AutoEarnCloseDialog$initEfforts$1$1$a;->b:Lcom/kubi/assets/autoearn/AutoEarnCloseDialog;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 55
    .line 56
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 57
    return-object p1
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/kubi/assets/autoearn/f;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/autoearn/AutoEarnCloseDialog$initEfforts$1$1$a;->a(Lcom/kubi/assets/autoearn/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method
