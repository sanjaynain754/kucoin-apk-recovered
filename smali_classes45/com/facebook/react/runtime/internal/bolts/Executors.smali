.class public final Lcom/facebook/react/runtime/internal/bolts/Executors;
.super Ljava/lang/Object;
.source "Executors.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/internal/bolts/Executors$ImmediateExecutor;,
        Lcom/facebook/react/runtime/internal/bolts/Executors$UIThreadExecutor;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\u0008B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/facebook/react/runtime/internal/bolts/Executors;",
        "",
        "<init>",
        "()V",
        "UI_THREAD",
        "Ljava/util/concurrent/Executor;",
        "IMMEDIATE",
        "UIThreadExecutor",
        "ImmediateExecutor",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final IMMEDIATE:Ljava/util/concurrent/Executor;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/facebook/react/runtime/internal/bolts/Executors;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final UI_THREAD:Ljava/util/concurrent/Executor;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/runtime/internal/bolts/Executors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/runtime/internal/bolts/Executors;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/runtime/internal/bolts/Executors;->INSTANCE:Lcom/facebook/react/runtime/internal/bolts/Executors;

    .line 8
    .line 9
    new-instance v0, Lcom/facebook/react/runtime/internal/bolts/Executors$UIThreadExecutor;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/facebook/react/runtime/internal/bolts/Executors$UIThreadExecutor;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/facebook/react/runtime/internal/bolts/Executors;->UI_THREAD:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    new-instance v0, Lcom/facebook/react/runtime/internal/bolts/Executors$ImmediateExecutor;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/facebook/react/runtime/internal/bolts/Executors$ImmediateExecutor;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lcom/facebook/react/runtime/internal/bolts/Executors;->IMMEDIATE:Ljava/util/concurrent/Executor;

    .line 22
    return-void
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
.end method

.method private constructor <init>()V
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
.end method
