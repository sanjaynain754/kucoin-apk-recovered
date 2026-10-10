.class public Lcom/tencent/bugly/proguard/ug;
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
        Lcom/tencent/bugly/proguard/ug$b;,
        Lcom/tencent/bugly/proguard/ug$a;
    }
.end annotation


# static fields
.field public static final f:Ljava/lang/String; = "Bugly.SystemServiceBinderHooker"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/tencent/bugly/proguard/ug$b;

.field public d:Landroid/os/IBinder;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public e:Landroid/os/IBinder;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/ug$b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ug;->a:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/tencent/bugly/proguard/ug;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/tencent/bugly/proguard/ug;->c:Lcom/tencent/bugly/proguard/ug$b;

    .line 10
    return-void
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
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public a()Z
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ug;->a:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ug;->b:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "doHook: serviceName:%s, serviceClsName:%s"

    .line 11
    .line 12
    const-string v2, "Bugly.SystemServiceBinderHooker"

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v1, v0}, Lcom/tencent/bugly/proguard/pb;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/ug$a;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ug;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/tencent/bugly/proguard/ug;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v4, p0, Lcom/tencent/bugly/proguard/ug;->c:Lcom/tencent/bugly/proguard/ug$b;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1, v3, v4}, Lcom/tencent/bugly/proguard/ug$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/ug$b;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ug$a;->a()Landroid/os/IBinder;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    const-string v3, "android.os.ServiceManager"

    .line 33
    .line 34
    .line 35
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    const-string/jumbo v4, "sCache"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 43
    move-result-object v3

    .line 44
    const/4 v4, 0x1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 48
    const/4 v5, 0x0

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    move-result-object v3

    .line 53
    .line 54
    check-cast v3, Ljava/util/Map;

    .line 55
    .line 56
    iget-object v5, p0, Lcom/tencent/bugly/proguard/ug;->a:Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-interface {v3, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v1, p0, Lcom/tencent/bugly/proguard/ug;->e:Landroid/os/IBinder;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/tencent/bugly/proguard/ug$a;->a:Landroid/os/IBinder;

    .line 64
    .line 65
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ug;->d:Landroid/os/IBinder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    return v4

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v3, "#doHook exp: "

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    move-result-object v0

    .line 86
    const/4 v1, 0x0

    .line 87
    .line 88
    new-array v3, v1, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    invoke-static {v2, v0, v3}, Lcom/tencent/bugly/proguard/pb;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return v1
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public b()Z
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ug;->d:Landroid/os/IBinder;

    .line 3
    .line 4
    const-string v1, "Bugly.SystemServiceBinderHooker"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-array v0, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v3, "#doUnHook mOriginServiceBinder null"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v3, v0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    return v2

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ug;->e:Landroid/os/IBinder;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    new-array v0, v2, [Ljava/lang/Object;

    .line 22
    .line 23
    const-string v3, "#doUnHook mDelegateServiceBinder null"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v3, v0}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    return v2

    .line 28
    .line 29
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ug;->a:Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ug$a;->a(Ljava/lang/String;)Landroid/os/IBinder;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    iget-object v3, p0, Lcom/tencent/bugly/proguard/ug;->e:Landroid/os/IBinder;

    .line 36
    .line 37
    if-eq v3, v0, :cond_2

    .line 38
    .line 39
    const-string v0, "#doUnHook mDelegateServiceBinder != currentBinder"

    .line 40
    .line 41
    new-array v3, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v0, v3}, Lcom/tencent/bugly/proguard/pb;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    return v2

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_2
    const-string v0, "android.os.ServiceManager"

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    const-string/jumbo v3, "sCache"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 60
    move-result-object v0

    .line 61
    const/4 v3, 0x1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 65
    const/4 v4, 0x0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    check-cast v0, Ljava/util/Map;

    .line 72
    .line 73
    iget-object v4, p0, Lcom/tencent/bugly/proguard/ug;->a:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v5, p0, Lcom/tencent/bugly/proguard/ug;->d:Landroid/os/IBinder;

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    return v3

    .line 80
    .line 81
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v4, "#doUnHook exp: "

    .line 84
    .line 85
    .line 86
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    new-array v3, v2, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v0, v3}, Lcom/tencent/bugly/proguard/pb;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    return v2
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
