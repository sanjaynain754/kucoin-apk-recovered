.class public Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->a(II)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;


# direct methods
.method public constructor <init>(Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace$a;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

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
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace$a;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->a(Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;)J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    .line 13
    invoke-static {v3}, Lcom/tencent/bugly/proguard/k0;->a(Ljava/lang/Thread;)J

    .line 14
    move-result-wide v3

    .line 15
    .line 16
    iget-object v5, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace$a;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 17
    .line 18
    iget v6, v5, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->b:I

    .line 19
    .line 20
    iget v7, v5, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->c:I

    .line 21
    const/4 v5, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {v0 .. v7}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->nativePrepare(JJZII)V

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
.end method
