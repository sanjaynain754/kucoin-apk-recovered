.class Lio/flutter/FlutterInjector$Builder$NamedThreadFactory;
.super Ljava/lang/Object;
.source "FlutterInjector.java"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/FlutterInjector$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "NamedThreadFactory"
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/FlutterInjector$Builder;

.field private threadId:I


# direct methods
.method private constructor <init>(Lio/flutter/FlutterInjector$Builder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/FlutterInjector$Builder$NamedThreadFactory;->this$0:Lio/flutter/FlutterInjector$Builder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lio/flutter/FlutterInjector$Builder$NamedThreadFactory;->threadId:I

    return-void
.end method

.method public synthetic constructor <init>(Lio/flutter/FlutterInjector$Builder;Lio/flutter/FlutterInjector$1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lio/flutter/FlutterInjector$Builder$NamedThreadFactory;-><init>(Lio/flutter/FlutterInjector$Builder;)V

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/Thread;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    const-string v1, "flutter-worker-"

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    iget v1, p0, Lio/flutter/FlutterInjector$Builder$NamedThreadFactory;->threadId:I

    .line 18
    .line 19
    add-int/lit8 v2, v1, 0x1

    .line 20
    .line 21
    iput v2, p0, Lio/flutter/FlutterInjector$Builder$NamedThreadFactory;->threadId:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 32
    return-object v0
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
.end method
