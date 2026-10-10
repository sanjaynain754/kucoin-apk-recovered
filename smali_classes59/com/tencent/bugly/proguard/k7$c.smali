.class public Lcom/tencent/bugly/proguard/k7$c;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/k7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lcom/tencent/bugly/proguard/k7;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/k7;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k7$c;->a:Lcom/tencent/bugly/proguard/k7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/bugly/proguard/k7;Lcom/tencent/bugly/proguard/k7$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/k7$c;-><init>(Lcom/tencent/bugly/proguard/k7;)V

    return-void
.end method


# virtual methods
.method public finalize()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 4
    .line 5
    sget-object v0, Lcom/tencent/bugly/proguard/k7$d;->a:Lcom/tencent/bugly/proguard/k7;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k7;->c()V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k7$c;->a:Lcom/tencent/bugly/proguard/k7;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    new-instance v2, Lcom/tencent/bugly/proguard/k7$c;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/tencent/bugly/proguard/k7$c;->a:Lcom/tencent/bugly/proguard/k7;

    .line 17
    .line 18
    .line 19
    invoke-direct {v2, v3}, Lcom/tencent/bugly/proguard/k7$c;-><init>(Lcom/tencent/bugly/proguard/k7;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    iput-object v1, v0, Lcom/tencent/bugly/proguard/k7;->a:Ljava/lang/ref/WeakReference;

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
.end method
