.class public final Lcom/kubi/app/bizcontrol/a;
.super Ljava/lang/Object;
.source "BizControlDurationSettings.kt"

# interfaces
.implements Lcom/kubi/monitor/duration/IDurationRuleSetting;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/kubi/app/bizcontrol/BizControlDurationSettings;",
        "Lcom/kubi/monitor/duration/IDurationRuleSetting;",
        "<init>",
        "()V",
        "getRules",
        "",
        "Lcom/kubi/monitor/duration/DurationRule;",
        "LBizControl_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBizControlDurationSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizControlDurationSettings.kt\ncom/kubi/app/bizcontrol/BizControlDurationSettings\n+ 2 DurationRule.kt\ncom/kubi/monitor/duration/DurationRule$Companion\n*L\n1#1,31:1\n37#2:32\n*S KotlinDebug\n*F\n+ 1 BizControlDurationSettings.kt\ncom/kubi/app/bizcontrol/BizControlDurationSettings\n*L\n22#1:32\n*E\n"
    }
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
.method public getRules()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/monitor/duration/DurationRule;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/monitor/duration/DurationRule;->f:Lcom/kubi/monitor/duration/DurationRule$Companion;

    .line 3
    .line 4
    new-instance v0, Lcom/kubi/monitor/duration/DurationRule$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0}, Lcom/kubi/monitor/duration/DurationRule$a;-><init>()V

    .line 8
    .line 9
    const-string v1, "EVENT_BIZ_CONTROL_LOAD"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->i(Ljava/lang/String;)V

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/monitor/duration/DurationCate;->page_load:Lcom/kubi/monitor/duration/DurationCate;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->h(Lcom/kubi/monitor/duration/DurationCate;)V

    .line 18
    .line 19
    const-string v1, "page_load_start"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->k(Ljava/lang/String;)V

    .line 23
    .line 24
    const-string v1, "page_load_end"

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/kubi/monitor/duration/DurationRule$a;->g(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/kubi/monitor/duration/DurationRule$a;->a()Lcom/kubi/monitor/duration/DurationRule;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 39
    move-result-object v0

    .line 40
    return-object v0
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
.end method
