.class public Lcom/tencent/bugly/proguard/z6;
.super Lcom/tencent/bugly/proguard/a1;
.source "BUGLY"


# static fields
.field public static final b:Ljava/lang/String; = "com.android.internal.policy.PhoneWindow"

.field public static final c:Ljava/lang/String; = "com.android.internal.policy.impl.PhoneWindow"

.field public static final d:Ljava/lang/String; = "com.android.internal.policy.HwPhoneWindow"

.field public static final e:Ljava/lang/String; = "android.view.SurfaceView"

.field public static final f:Ljava/lang/String; = "android.app.Activity"

.field public static final g:Ljava/lang/String; = "android.app.Dialog"

.field public static final h:Ljava/lang/String; = "mWindow"

.field public static final i:Ljava/lang/String; = "mTitle"


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
    const-string/jumbo v0, "window"

    return-object v0
.end method

.method public a(Lcom/tencent/bugly/proguard/c6;)Ljava/util/Map;
    .locals 6
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
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 4
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 5
    const-string v0, "com.android.internal.policy.PhoneWindow"

    invoke-virtual {p0, p1, v5, v0}, Lcom/tencent/bugly/proguard/z6;->a(Lcom/tencent/bugly/proguard/c6;Ljava/util/Map;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 6
    const-string v0, "com.android.internal.policy.impl.PhoneWindow"

    invoke-virtual {p0, p1, v5, v0}, Lcom/tencent/bugly/proguard/z6;->a(Lcom/tencent/bugly/proguard/c6;Ljava/util/Map;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 7
    const-string v0, "com.android.internal.policy.HwPhoneWindow"

    invoke-virtual {p0, p1, v5, v0}, Lcom/tencent/bugly/proguard/z6;->a(Lcom/tencent/bugly/proguard/c6;Ljava/util/Map;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 8
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/c6;->a()Lshark/i;

    move-result-object v1

    const-string v3, "android.app.Activity"

    const-string v4, "mWindow"

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/bugly/proguard/z6;->a(Lshark/i;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 9
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/c6;->a()Lshark/i;

    move-result-object v1

    const-string v3, "android.app.Dialog"

    const-string v4, "mWindow"

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/bugly/proguard/z6;->a(Lshark/i;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 10
    invoke-virtual {p0, p1, v5}, Lcom/tencent/bugly/proguard/z6;->a(Lcom/tencent/bugly/proguard/c6;Ljava/util/Map;)V

    .line 11
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 12
    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 13
    invoke-virtual {p0, p1, v2}, Lcom/tencent/bugly/proguard/y0;->a(Ljava/util/Map;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, Lcom/tencent/bugly/proguard/c6;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/z6;->a(Lcom/tencent/bugly/proguard/c6;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/tencent/bugly/proguard/c6;Ljava/util/Map;Ljava/lang/String;)Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/c6;",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 14
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/c6;->a()Lshark/i;

    move-result-object p1

    invoke-interface {p1, p3}, Lshark/i;->b(Ljava/lang/String;)Lshark/HeapObject$HeapClass;

    move-result-object p1

    .line 15
    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    if-nez p1, :cond_0

    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p1}, Lshark/HeapObject$HeapClass;->o()Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lshark/HeapObject$HeapInstance;

    .line 19
    const-string v1, "mTitle"

    invoke-static {v0, v1}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getStringField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-virtual {v0}, Lshark/HeapObject$HeapInstance;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "/title("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    invoke-virtual {v0}, Lshark/HeapObject$HeapInstance;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    return-object p3
.end method

.method public final a(Lcom/tencent/bugly/proguard/c6;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/proguard/c6;",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/c6;->a()Lshark/i;

    move-result-object p1

    const-string v0, "android.view.SurfaceView"

    invoke-interface {p1, v0}, Lshark/i;->b(Ljava/lang/String;)Lshark/HeapObject$HeapClass;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {p1}, Lshark/HeapObject$HeapClass;->o()Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lshark/HeapObject$HeapInstance;

    .line 26
    invoke-virtual {v0}, Lshark/HeapObject$HeapInstance;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lshark/HeapObject$HeapInstance;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final a(Lshark/i;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lshark/i;",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-interface {p1, p3}, Lshark/i;->b(Ljava/lang/String;)Lshark/HeapObject$HeapClass;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {p1}, Lshark/HeapObject$HeapClass;->o()Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 29
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lshark/HeapObject$HeapInstance;

    .line 31
    invoke-static {v0, p3, p4}, Lcom/tencent/rmonitor/fd/utils/SharkUtil;->getInstanceField(Lshark/HeapObject$HeapInstance;Ljava/lang/String;Ljava/lang/String;)Lshark/HeapObject$HeapInstance;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 32
    invoke-virtual {v1}, Lshark/HeapObject$HeapInstance;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 33
    invoke-virtual {v1}, Lshark/HeapObject$HeapInstance;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 34
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lshark/HeapObject$HeapInstance;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 36
    invoke-virtual {v1}, Lshark/HeapObject$HeapInstance;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p5, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
