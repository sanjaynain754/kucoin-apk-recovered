.class public final Lcom/tencent/bugly/proguard/cb;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/cb$b;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "Bugly.LocationHooker"

.field public static b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/cb$b;",
            ">;"
        }
    .end annotation
.end field

.field public static c:Z

.field public static d:Lcom/tencent/bugly/proguard/ug$b;

.field public static e:Lcom/tencent/bugly/proguard/ug;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/cb;->b:Ljava/util/List;

    .line 8
    .line 9
    new-instance v0, Lcom/tencent/bugly/proguard/cb$a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/cb$a;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/bugly/proguard/cb;->d:Lcom/tencent/bugly/proguard/ug$b;

    .line 15
    .line 16
    new-instance v1, Lcom/tencent/bugly/proguard/ug;

    .line 17
    .line 18
    const-string v2, "location"

    .line 19
    .line 20
    const-string v3, "android.location.ILocationManager"

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, v3, v0}, Lcom/tencent/bugly/proguard/ug;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/ug$b;)V

    .line 24
    .line 25
    sput-object v1, Lcom/tencent/bugly/proguard/cb;->e:Lcom/tencent/bugly/proguard/ug;

    .line 26
    return-void
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

.method public constructor <init>()V
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
.end method

.method public static a()V
    .locals 3

    .line 5
    sget-boolean v0, Lcom/tencent/bugly/proguard/cb;->c:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/cb;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 7
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/cb;->e:Lcom/tencent/bugly/proguard/ug;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ug;->a()Z

    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Bugly.LocationHooker"

    const-string v2, "checkHook hookRet:%b"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 9
    sput-boolean v0, Lcom/tencent/bugly/proguard/cb;->c:Z

    return-void
.end method

.method public static declared-synchronized a(Lcom/tencent/bugly/proguard/cb$b;)V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/cb;

    monitor-enter v0

    if-nez p0, :cond_0

    monitor-exit v0

    return-void

    .line 2
    :cond_0
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/cb;->b:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    .line 3
    :cond_1
    :try_start_1
    sget-object v1, Lcom/tencent/bugly/proguard/cb;->b:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/cb;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static synthetic a([Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/cb;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public static b()V
    .locals 3

    .line 4
    sget-boolean v0, Lcom/tencent/bugly/proguard/cb;->c:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/cb;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 6
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/cb;->e:Lcom/tencent/bugly/proguard/ug;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ug;->b()Z

    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Bugly.LocationHooker"

    const-string v2, "checkUnHook unHookRet:%b"

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 8
    sput-boolean v0, Lcom/tencent/bugly/proguard/cb;->c:Z

    return-void
.end method

.method public static declared-synchronized b(Lcom/tencent/bugly/proguard/cb$b;)V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/cb;

    monitor-enter v0

    if-nez p0, :cond_0

    monitor-exit v0

    return-void

    .line 2
    :cond_0
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/cb;->b:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/cb;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static synthetic b([Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/cb;->c([Ljava/lang/Object;)V

    return-void
.end method

.method public static declared-synchronized c()V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/cb;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/cb;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 2
    invoke-static {}, Lcom/tencent/bugly/proguard/cb;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static c([Ljava/lang/Object;)V
    .locals 5

    if-eqz p0, :cond_1

    .line 3
    array-length v0, p0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    const/4 v0, 0x0

    .line 4
    aget-object v2, p0, v0

    if-eqz v2, :cond_0

    .line 5
    sget-object v1, Lcom/tencent/bugly/proguard/cb;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/cb$b;

    .line 6
    aget-object v3, p0, v0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Lcom/tencent/bugly/proguard/cb$b;->a(ILandroid/app/PendingIntent;)V

    goto :goto_0

    .line 7
    :cond_0
    array-length v2, p0

    if-le v2, v1, :cond_1

    aget-object v2, p0, v1

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "android.app.PendingIntent"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 8
    sget-object v2, Lcom/tencent/bugly/proguard/cb;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/proguard/cb$b;

    .line 9
    aget-object v4, p0, v1

    check-cast v4, Landroid/app/PendingIntent;

    invoke-interface {v3, v0, v4}, Lcom/tencent/bugly/proguard/cb$b;->a(ILandroid/app/PendingIntent;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static d([Ljava/lang/Object;)V
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    new-instance v1, Lcom/tencent/bugly/proguard/bb;

    .line 4
    .line 5
    .line 6
    invoke-direct {v1}, Lcom/tencent/bugly/proguard/bb;-><init>()V

    .line 7
    .line 8
    const-wide/16 v2, -0x1

    .line 9
    .line 10
    const/high16 v4, -0x40800000    # -1.0f

    .line 11
    .line 12
    if-eqz p0, :cond_3

    .line 13
    array-length v5, p0

    .line 14
    const/4 v6, 0x0

    .line 15
    move v7, v6

    .line 16
    .line 17
    :goto_0
    if-ge v7, v5, :cond_1

    .line 18
    .line 19
    aget-object v8, p0, v7

    .line 20
    .line 21
    if-eqz v8, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    move-result-object v9

    .line 26
    .line 27
    .line 28
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    move-result-object v9

    .line 30
    .line 31
    const-string v10, "android.location.LocationRequest"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    move-result v9

    .line 36
    .line 37
    if-eqz v9, :cond_0

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    move-result-object v9

    .line 42
    .line 43
    const-string v10, "getFastestInterval"

    .line 44
    .line 45
    new-array v11, v6, [Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v9, v10, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 49
    move-result-object v9

    .line 50
    .line 51
    .line 52
    invoke-virtual {v9, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 53
    .line 54
    new-array v10, v6, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v9, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    move-result-object v9

    .line 59
    .line 60
    check-cast v9, Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 64
    move-result-wide v2

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    move-result-object v9

    .line 69
    .line 70
    const-string v10, "getSmallestDisplacement"

    .line 71
    .line 72
    new-array v11, v6, [Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v9, v10, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    move-result-object v9

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 80
    .line 81
    new-array v10, v6, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v9, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    move-result-object v8

    .line 86
    .line 87
    check-cast v8, Ljava/lang/Float;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 91
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v8

    .line 94
    .line 95
    new-array v9, v6, [Ljava/lang/Object;

    .line 96
    .line 97
    const-string v10, "Bugly.LocationHooker"

    .line 98
    .line 99
    const-string v11, ""

    .line 100
    .line 101
    .line 102
    invoke-static {v10, v8, v11, v9}, Lcom/tencent/bugly/proguard/pb;->a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    :cond_0
    :goto_1
    add-int/2addr v7, v0

    .line 104
    goto :goto_0

    .line 105
    :cond_1
    array-length v5, p0

    .line 106
    .line 107
    if-le v5, v0, :cond_2

    .line 108
    .line 109
    aget-object v5, p0, v0

    .line 110
    .line 111
    if-eqz v5, :cond_2

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    move-result-object v5

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 119
    move-result-object v5

    .line 120
    .line 121
    const-string v6, "android.location.LocationManager$LocationListenerTransport"

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    move-result v5

    .line 126
    .line 127
    if-eqz v5, :cond_2

    .line 128
    .line 129
    aget-object v0, p0, v0

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 133
    move-result v0

    .line 134
    .line 135
    iput v0, v1, Lcom/tencent/bugly/proguard/bb;->k:I

    .line 136
    :cond_2
    array-length v0, p0

    .line 137
    const/4 v5, 0x2

    .line 138
    .line 139
    if-le v0, v5, :cond_3

    .line 140
    .line 141
    aget-object v0, p0, v5

    .line 142
    .line 143
    if-eqz v0, :cond_3

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    const-string v6, "android.app.PendingIntent"

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    move-result v0

    .line 158
    .line 159
    if-eqz v0, :cond_3

    .line 160
    .line 161
    aget-object p0, p0, v5

    .line 162
    .line 163
    check-cast p0, Landroid/app/PendingIntent;

    .line 164
    .line 165
    iput-object p0, v1, Lcom/tencent/bugly/proguard/bb;->j:Landroid/app/PendingIntent;

    .line 166
    .line 167
    :cond_3
    iget-object p0, v1, Lcom/tencent/bugly/proguard/bb;->j:Landroid/app/PendingIntent;

    .line 168
    .line 169
    if-nez p0, :cond_4

    .line 170
    .line 171
    iget p0, v1, Lcom/tencent/bugly/proguard/bb;->k:I

    .line 172
    .line 173
    if-eqz p0, :cond_5

    .line 174
    .line 175
    :cond_4
    sget-object p0, Lcom/tencent/bugly/proguard/cb;->b:Ljava/util/List;

    .line 176
    .line 177
    .line 178
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 179
    move-result-object p0

    .line 180
    .line 181
    .line 182
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    move-result v0

    .line 184
    .line 185
    if-eqz v0, :cond_5

    .line 186
    .line 187
    .line 188
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    check-cast v0, Lcom/tencent/bugly/proguard/cb$b;

    .line 192
    .line 193
    .line 194
    invoke-interface {v0, v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/cb$b;->a(Lcom/tencent/bugly/proguard/bb;JF)V

    .line 195
    goto :goto_2

    .line 196
    :cond_5
    return-void
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
