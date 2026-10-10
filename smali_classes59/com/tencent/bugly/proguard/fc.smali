.class public Lcom/tencent/bugly/proguard/fc;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final f:Ljava/lang/String; = "max_pss_"

.field public static final g:Ljava/lang/String; = "max_vss_"

.field public static final h:Ljava/lang/String; = "max_java_heap_"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public c:J

.field public d:J

.field public e:J


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/fc;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 8
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    .line 9
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    .line 10
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    .line 11
    iget-object v0, p1, Lcom/tencent/bugly/proguard/fc;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/fc;->a:Ljava/lang/String;

    .line 12
    iget-object v0, p1, Lcom/tencent/bugly/proguard/fc;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/fc;->b:Ljava/lang/String;

    .line 13
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/fc;->c:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    .line 14
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/fc;->d:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    .line 15
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/fc;->e:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    .line 3
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    .line 4
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/proguard/fc;->a:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lcom/tencent/bugly/proguard/fc;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    return-wide v0
.end method

.method public a(JJJ)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    .line 3
    iput-wide p3, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    .line 4
    iput-wide p5, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    return-void
.end method

.method public a(Landroid/content/SharedPreferences$Editor;)V
    .locals 3

    .line 5
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fc;->d()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 6
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fc;->f()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 7
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fc;->b()Ljava/lang/String;

    move-result-object v0

    iget-wide v1, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method public a(Landroid/content/SharedPreferences$Editor;JJJ)V
    .locals 2

    .line 11
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    cmp-long v0, p2, v0

    if-lez v0, :cond_0

    .line 12
    iput-wide p2, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    .line 13
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fc;->d()Ljava/lang/String;

    move-result-object p2

    iget-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    invoke-interface {p1, p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 14
    :cond_0
    iget-wide p2, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    cmp-long p2, p4, p2

    if-lez p2, :cond_1

    .line 15
    iput-wide p4, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    .line 16
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fc;->f()Ljava/lang/String;

    move-result-object p2

    iget-wide p3, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    invoke-interface {p1, p2, p3, p4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 17
    :cond_1
    iget-wide p2, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    cmp-long p2, p6, p2

    if-lez p2, :cond_2

    .line 18
    iput-wide p6, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    .line 19
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fc;->b()Ljava/lang/String;

    move-result-object p2

    iget-wide p3, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    invoke-interface {p1, p2, p3, p4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    :cond_2
    return-void
.end method

.method public a(Landroid/content/SharedPreferences;)V
    .locals 5

    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fc;->d()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fc;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    .line 10
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fc;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/bugly/proguard/fc;->a:Ljava/lang/String;

    .line 21
    const-string/jumbo v2, "pss"

    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 22
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/bugly/proguard/fc;->a:Ljava/lang/String;

    .line 24
    const-string/jumbo v2, "vss"

    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 25
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/bugly/proguard/fc;->a:Ljava/lang/String;

    .line 27
    const-string v2, "java_heap"

    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 28
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/bugly/proguard/fc;->a:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "max_java_heap_"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/bugly/proguard/fc;->b:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    return-object v0
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

.method public c()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    .line 3
    return-wide v0
    .line 4
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

.method public final d()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/bugly/proguard/fc;->a:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "max_pss_"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/bugly/proguard/fc;->b:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    return-object v0
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

.method public e()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    .line 3
    return-wide v0
    .line 4
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

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/tencent/bugly/proguard/fc;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/tencent/bugly/proguard/fc;

    .line 13
    .line 14
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    .line 15
    .line 16
    iget-wide v5, p1, Lcom/tencent/bugly/proguard/fc;->c:J

    .line 17
    .line 18
    cmp-long v1, v3, v5

    .line 19
    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    .line 23
    .line 24
    iget-wide v5, p1, Lcom/tencent/bugly/proguard/fc;->d:J

    .line 25
    .line 26
    cmp-long v1, v3, v5

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    .line 31
    .line 32
    iget-wide v5, p1, Lcom/tencent/bugly/proguard/fc;->e:J

    .line 33
    .line 34
    cmp-long v1, v3, v5

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Lcom/tencent/bugly/proguard/fc;->a:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p1, Lcom/tencent/bugly/proguard/fc;->a:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 44
    move-result v1

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    iget-object v1, p0, Lcom/tencent/bugly/proguard/fc;->b:Ljava/lang/String;

    .line 49
    .line 50
    iget-object p1, p1, Lcom/tencent/bugly/proguard/fc;->b:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 54
    move-result p1

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    return v0

    .line 58
    :cond_2
    return v2
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
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/bugly/proguard/fc;->a:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "max_vss_"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/bugly/proguard/fc;->b:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object v0

    .line 25
    return-object v0
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

.method public g()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->c:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->d:J

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/fc;->e:J

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-lez v0, :cond_0

    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
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
.end method
