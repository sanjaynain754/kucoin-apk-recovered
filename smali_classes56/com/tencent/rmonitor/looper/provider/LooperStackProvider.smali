.class public interface abstract Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0008\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH&J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000cH&\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;",
        "",
        "Ljava/lang/Thread;",
        "thread",
        "Lcom/tencent/bugly/proguard/qa;",
        "lagParam",
        "Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;",
        "callback",
        "",
        "prepare",
        "",
        "stop",
        "",
        "startTime",
        "dispatchStart",
        "endTime",
        "duration",
        "dispatchEnd",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# virtual methods
.method public abstract dispatchEnd(JJ)V
.end method

.method public abstract dispatchStart(J)V
.end method

.method public abstract prepare(Ljava/lang/Thread;Lcom/tencent/bugly/proguard/qa;Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;)Z
    .param p1    # Ljava/lang/Thread;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/bugly/proguard/qa;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract stop()V
.end method
