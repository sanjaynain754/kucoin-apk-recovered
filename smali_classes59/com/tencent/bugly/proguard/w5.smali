.class public Lcom/tencent/bugly/proguard/w5;
.super Lcom/tencent/bugly/proguard/a1;
.source "BUGLY"


# static fields
.field public static final b:Ljava/lang/String; = "RMonitor_FdLeak_FdCursorAnalyzer"

.field public static final c:Ljava/lang/String; = "android.database.CursorWindow"

.field public static final d:Ljava/lang/String; = "android.database.sqlite.SQLiteCursor"

.field public static final e:Ljava/lang/String; = "android.database.AbstractWindowedCursor"

.field public static final f:Ljava/lang/String; = "mWindow"

.field public static final g:Ljava/lang/String; = "mName"

.field public static final h:Ljava/lang/String; = "mEditTable"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/a1;-><init>()V

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
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 2
    const-string v0, "cursor"

    return-object v0
.end method

.method public a(Lcom/tencent/bugly/proguard/c6;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/c6;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/c6;->a()Lshark/i;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/proguard/w5;->a(Lshark/i;Ljava/util/Map;)Ljava/util/Set;

    move-result-object v1

    .line 5
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/w5;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lcom/tencent/bugly/proguard/c6;->a(Ljava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, Lcom/tencent/bugly/proguard/c6;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/w5;->a(Lcom/tencent/bugly/proguard/c6;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lshark/i;Ljava/util/Map;)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lshark/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 6
    const-string v0, "android.database.sqlite.SQLiteCursor"

    invoke-interface {p1, v0}, Lshark/i;->b(Ljava/lang/String;)Lshark/HeapObject$HeapClass;

    move-result-object p1

    .line 7
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    if-nez p1, :cond_0

    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p1}, Lshark/HeapObject$HeapClass;->o()Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 9
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 10
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lshark/HeapObject$HeapInstance;

    .line 11
    const-string v3, "mEditTable"

    invoke-static {v2, v0, v3}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getStringField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 12
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 13
    const-string v3, "default_table"

    .line 14
    :cond_2
    const-string v4, "android.database.AbstractWindowedCursor"

    const-string v5, "mWindow"

    invoke-static {v2, v4, v5}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getInstanceField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;Ljava/lang/String;)Lshark/HeapObject$HeapInstance;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 15
    const-string v4, "android.database.CursorWindow"

    const-string v5, "mName"

    invoke-static {v2, v4, v5}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getStringField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 16
    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "%s/table:%s"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 17
    invoke-virtual {p0, p2, v3}, Lcom/tencent/bugly/proguard/y0;->a(Ljava/util/Map;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v2}, Lshark/HeapObject$HeapInstance;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    return-object v1
.end method
