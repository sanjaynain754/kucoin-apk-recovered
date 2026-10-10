.class public final Lshark/LeakTrace$GcRootType$Companion;
.super Ljava/lang/Object;
.source "LeakTrace.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lshark/LeakTrace$GcRootType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lshark/LeakTrace$GcRootType$Companion;",
        "",
        "<init>",
        "()V",
        "Lshark/d;",
        "gcRoot",
        "Lshark/LeakTrace$GcRootType;",
        "fromGcRoot",
        "(Lshark/d;)Lshark/LeakTrace$GcRootType;",
        "shark"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lshark/LeakTrace$GcRootType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromGcRoot(Lshark/d;)Lshark/LeakTrace$GcRootType;
    .locals 3
    .param p1    # Lshark/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lshark/d$e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object p1, Lshark/LeakTrace$GcRootType;->JNI_GLOBAL:Lshark/LeakTrace$GcRootType;

    .line 7
    return-object p1

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, Lshark/d$f;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    sget-object p1, Lshark/LeakTrace$GcRootType;->JNI_LOCAL:Lshark/LeakTrace$GcRootType;

    .line 14
    return-object p1

    .line 15
    .line 16
    :cond_1
    instance-of v0, p1, Lshark/d$d;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    sget-object p1, Lshark/LeakTrace$GcRootType;->JAVA_FRAME:Lshark/LeakTrace$GcRootType;

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_2
    instance-of v0, p1, Lshark/d$i;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    sget-object p1, Lshark/LeakTrace$GcRootType;->NATIVE_STACK:Lshark/LeakTrace$GcRootType;

    .line 28
    return-object p1

    .line 29
    .line 30
    :cond_3
    instance-of v0, p1, Lshark/d$k;

    .line 31
    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    sget-object p1, Lshark/LeakTrace$GcRootType;->STICKY_CLASS:Lshark/LeakTrace$GcRootType;

    .line 35
    return-object p1

    .line 36
    .line 37
    :cond_4
    instance-of v0, p1, Lshark/d$l;

    .line 38
    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    sget-object p1, Lshark/LeakTrace$GcRootType;->THREAD_BLOCK:Lshark/LeakTrace$GcRootType;

    .line 42
    return-object p1

    .line 43
    .line 44
    :cond_5
    instance-of v0, p1, Lshark/d$h;

    .line 45
    .line 46
    if-eqz v0, :cond_6

    .line 47
    .line 48
    sget-object p1, Lshark/LeakTrace$GcRootType;->MONITOR_USED:Lshark/LeakTrace$GcRootType;

    .line 49
    return-object p1

    .line 50
    .line 51
    :cond_6
    instance-of v0, p1, Lshark/d$m;

    .line 52
    .line 53
    if-eqz v0, :cond_7

    .line 54
    .line 55
    sget-object p1, Lshark/LeakTrace$GcRootType;->THREAD_OBJECT:Lshark/LeakTrace$GcRootType;

    .line 56
    return-object p1

    .line 57
    .line 58
    :cond_7
    instance-of v0, p1, Lshark/d$g;

    .line 59
    .line 60
    if-eqz v0, :cond_8

    .line 61
    .line 62
    sget-object p1, Lshark/LeakTrace$GcRootType;->JNI_MONITOR:Lshark/LeakTrace$GcRootType;

    .line 63
    return-object p1

    .line 64
    .line 65
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    const-string v2, "Unexpected gc root "

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    throw v0
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
