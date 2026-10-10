.class public Lcom/tencent/bugly/proguard/if$b;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/if;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/String;

.field public c:Ljava/lang/reflect/Field;

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/tencent/bugly/proguard/if$b;->c:Ljava/lang/reflect/Field;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/if$b;->d:Z

    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/proguard/if$b;->a:Ljava/lang/Class;

    .line 6
    iput-object p2, p0, Lcom/tencent/bugly/proguard/if$b;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/String;Lcom/tencent/bugly/proguard/if$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tencent/bugly/proguard/if$b;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/if$b;->c:Ljava/lang/reflect/Field;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/if$b;->d:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/if$b;->a:Ljava/lang/Class;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/tencent/bugly/proguard/if$b;->b:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    iput-object v1, p0, Lcom/tencent/bugly/proguard/if$b;->c:Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    .line 26
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/tencent/bugly/proguard/if$b;->b:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    const-string v4, "RMonitor_util_ReflectUtil"

    .line 35
    .line 36
    .line 37
    filled-new-array {v4, v3, v1}, [Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 42
    .line 43
    :goto_0
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/if$b;->d:Z

    .line 44
    .line 45
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/if$b;->c:Ljava/lang/reflect/Field;

    .line 46
    return-object v0
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
