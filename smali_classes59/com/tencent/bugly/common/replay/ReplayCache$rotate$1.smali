.class final Lcom/tencent/bugly/common/replay/ReplayCache$rotate$1;
.super Lkotlin/jvm/internal/Lambda;
.source "BUGLY"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/common/replay/ReplayCache;->rotate$bugly_pro_release(J)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/tencent/bugly/common/replay/ReplayFrame;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/tencent/bugly/common/replay/ReplayFrame;",
        "invoke",
        "(Lcom/tencent/bugly/common/replay/ReplayFrame;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $screen:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $until:J

.field final synthetic this$0:Lcom/tencent/bugly/common/replay/ReplayCache;


# direct methods
.method public constructor <init>(JLcom/tencent/bugly/common/replay/ReplayCache;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/tencent/bugly/common/replay/ReplayCache;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/tencent/bugly/common/replay/ReplayCache$rotate$1;->$until:J

    .line 3
    .line 4
    iput-object p3, p0, Lcom/tencent/bugly/common/replay/ReplayCache$rotate$1;->this$0:Lcom/tencent/bugly/common/replay/ReplayCache;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/tencent/bugly/common/replay/ReplayCache$rotate$1;->$screen:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 7
    const/4 p1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public final invoke(Lcom/tencent/bugly/common/replay/ReplayFrame;)Ljava/lang/Boolean;
    .locals 4
    .param p1    # Lcom/tencent/bugly/common/replay/ReplayFrame;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/ReplayFrame;->getTimestamp()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/tencent/bugly/common/replay/ReplayCache$rotate$1;->$until:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/ReplayCache$rotate$1;->this$0:Lcom/tencent/bugly/common/replay/ReplayCache;

    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/ReplayFrame;->getScreenshot()Ljava/io/File;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/bugly/common/replay/ReplayCache;->access$deleteFile(Lcom/tencent/bugly/common/replay/ReplayCache;Ljava/io/File;)V

    .line 4
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/common/replay/ReplayCache$rotate$1;->$screen:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-nez v1, :cond_1

    .line 6
    invoke-virtual {p1}, Lcom/tencent/bugly/common/replay/ReplayFrame;->getScreen()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 7
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/tencent/bugly/common/replay/ReplayFrame;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/common/replay/ReplayCache$rotate$1;->invoke(Lcom/tencent/bugly/common/replay/ReplayFrame;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
