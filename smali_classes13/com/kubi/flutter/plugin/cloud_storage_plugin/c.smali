.class public final Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;
.super Ljava/lang/Object;
.source "GoogleDriveHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ1\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;",
        "",
        "Lcom/google/api/services/drive/Drive;",
        "drive",
        "<init>",
        "(Lcom/google/api/services/drive/Drive;)V",
        "Lcom/google/api/services/drive/model/FileList;",
        "a",
        "()Lcom/google/api/services/drive/model/FileList;",
        "",
        "fileId",
        "b",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lcom/google/api/services/drive/model/File;",
        "dirFile",
        "jsonFile",
        "key",
        "newContent",
        "",
        "c",
        "(Lcom/google/api/services/drive/model/File;Lcom/google/api/services/drive/model/File;Ljava/lang/String;Ljava/lang/String;)Z",
        "Lcom/google/api/services/drive/Drive;",
        "cloud_storage_plugin_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGoogleDriveHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleDriveHelper.kt\ncom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/api/services/drive/Drive;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/api/services/drive/Drive;)V
    .locals 1
    .param p1    # Lcom/google/api/services/drive/Drive;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "drive"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;->a:Lcom/google/api/services/drive/Drive;

    .line 11
    return-void
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
.end method


# virtual methods
.method public final a()Lcom/google/api/services/drive/model/FileList;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;->a:Lcom/google/api/services/drive/Drive;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/api/services/drive/Drive;->files()Lcom/google/api/services/drive/Drive$Files;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/api/services/drive/Drive$Files;->list()Lcom/google/api/services/drive/Drive$Files$List;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    const-string v1, "appDataFolder"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/google/api/services/drive/Drive$Files$List;->setSpaces(Ljava/lang/String;)Lcom/google/api/services/drive/Drive$Files$List;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/api/client/googleapis/services/AbstractGoogleClientRequest;->execute()Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Lcom/google/api/services/drive/model/FileList;
    :try_end_0
    .catch Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    return-object v0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    .line 26
    sget-object v1, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a:Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;

    .line 27
    .line 28
    const-string v2, "CloudStoragePlugin"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 32
    :catch_0
    const/4 v0, 0x0

    .line 33
    return-object v0
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    const-string v1, "fileId"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    :try_start_0
    iget-object v2, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;->a:Lcom/google/api/services/drive/Drive;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/google/api/services/drive/Drive;->files()Lcom/google/api/services/drive/Drive$Files;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Lcom/google/api/services/drive/Drive$Files;->get(Ljava/lang/String;)Lcom/google/api/services/drive/Drive$Files$Get;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/google/api/services/drive/Drive$Files$Get;->executeMediaAsInputStream()Ljava/io/InputStream;

    .line 22
    move-result-object p1
    :try_end_0
    .catch Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 23
    .line 24
    :try_start_1
    new-instance v2, Ljava/io/BufferedReader;

    .line 25
    .line 26
    new-instance v3, Ljava/io/InputStreamReader;

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    .line 34
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 40
    .line 41
    .line 42
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 46
    move-result-object v4

    .line 47
    .line 48
    iput-object v4, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 49
    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v1

    .line 56
    goto :goto_2

    .line 57
    :catch_0
    :goto_1
    move-object v1, p1

    .line 58
    goto :goto_3

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    const-string v3, "toString(...)"

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    sget-object v0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a:Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p1}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->b(Ljava/io/Closeable;)V

    .line 75
    .line 76
    :cond_1
    sget-object p1, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a:Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v2}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->b(Ljava/io/Closeable;)V

    .line 80
    return-object v1

    .line 81
    :catchall_1
    move-exception v2

    .line 82
    move-object v5, v2

    .line 83
    move-object v2, v1

    .line 84
    move-object v1, v5

    .line 85
    goto :goto_2

    .line 86
    :catch_1
    move-object v2, v1

    .line 87
    goto :goto_1

    .line 88
    :catchall_2
    move-exception p1

    .line 89
    move-object v2, v1

    .line 90
    move-object v1, p1

    .line 91
    move-object p1, v2

    .line 92
    goto :goto_2

    .line 93
    :catch_2
    move-object v2, v1

    .line 94
    goto :goto_3

    .line 95
    .line 96
    :goto_2
    :try_start_3
    sget-object v3, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a:Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;

    .line 97
    .line 98
    const-string v4, "CloudStoragePlugin"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v1, v4}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 102
    .line 103
    if-eqz p1, :cond_2

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, p1}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->b(Ljava/io/Closeable;)V

    .line 107
    .line 108
    :cond_2
    if-eqz v2, :cond_3

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v2}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->b(Ljava/io/Closeable;)V

    .line 112
    :cond_3
    return-object v0

    .line 113
    :catchall_3
    move-exception v0

    .line 114
    .line 115
    if-eqz p1, :cond_4

    .line 116
    .line 117
    sget-object v1, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a:Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, p1}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->b(Ljava/io/Closeable;)V

    .line 121
    .line 122
    :cond_4
    if-eqz v2, :cond_5

    .line 123
    .line 124
    sget-object p1, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a:Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v2}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->b(Ljava/io/Closeable;)V

    .line 128
    :cond_5
    throw v0

    .line 129
    .line 130
    :goto_3
    if-eqz v1, :cond_6

    .line 131
    .line 132
    sget-object p1, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a:Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v1}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->b(Ljava/io/Closeable;)V

    .line 136
    .line 137
    :cond_6
    if-eqz v2, :cond_7

    .line 138
    .line 139
    sget-object p1, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a:Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v2}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->b(Ljava/io/Closeable;)V

    .line 143
    :cond_7
    return-object v0
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
.end method

.method public final c(Lcom/google/api/services/drive/model/File;Lcom/google/api/services/drive/model/File;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3
    .param p1    # Lcom/google/api/services/drive/model/File;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/google/api/services/drive/model/File;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "newContent"

    .line 8
    .line 9
    .line 10
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p1}, Lcom/google/api/services/drive/model/File;->getId()Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;->a:Lcom/google/api/services/drive/Drive;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/google/api/services/drive/Drive;->files()Lcom/google/api/services/drive/Drive$Files;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    new-instance v1, Lcom/google/api/services/drive/model/File;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1}, Lcom/google/api/services/drive/model/File;-><init>()V

    .line 33
    .line 34
    const-string v2, "appDataFolder"

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lcom/google/api/services/drive/model/File;->setParents(Ljava/util/List;)Lcom/google/api/services/drive/model/File;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    const-string v2, "application/vnd.google-apps.folder"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lcom/google/api/services/drive/model/File;->setMimeType(Ljava/lang/String;)Lcom/google/api/services/drive/model/File;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    const-string v2, "KCStorageBackups"

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lcom/google/api/services/drive/model/File;->setName(Ljava/lang/String;)Lcom/google/api/services/drive/model/File;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v1}, Lcom/google/api/services/drive/Drive$Files;->create(Lcom/google/api/services/drive/model/File;)Lcom/google/api/services/drive/Drive$Files$Create;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/google/api/client/googleapis/services/AbstractGoogleClientRequest;->execute()Ljava/lang/Object;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    check-cast p1, Lcom/google/api/services/drive/model/File;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/google/api/services/drive/model/File;->getId()Ljava/lang/String;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string p3, ".json"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    move-result-object p3
    :try_end_0
    .catch Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    const-string v1, "application/json"

    .line 88
    .line 89
    if-eqz p2, :cond_1

    .line 90
    .line 91
    .line 92
    :try_start_1
    invoke-virtual {p2}, Lcom/google/api/services/drive/model/File;->getId()Ljava/lang/String;

    .line 93
    move-result-object p1

    .line 94
    goto :goto_1

    .line 95
    .line 96
    :cond_1
    new-instance p2, Lcom/google/api/services/drive/model/File;

    .line 97
    .line 98
    .line 99
    invoke-direct {p2}, Lcom/google/api/services/drive/model/File;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2, p1}, Lcom/google/api/services/drive/model/File;->setParents(Ljava/util/List;)Lcom/google/api/services/drive/model/File;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v1}, Lcom/google/api/services/drive/model/File;->setMimeType(Ljava/lang/String;)Lcom/google/api/services/drive/model/File;

    .line 111
    move-result-object p1

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p3}, Lcom/google/api/services/drive/model/File;->setName(Ljava/lang/String;)Lcom/google/api/services/drive/model/File;

    .line 115
    move-result-object p1

    .line 116
    .line 117
    iget-object p2, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;->a:Lcom/google/api/services/drive/Drive;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/google/api/services/drive/Drive;->files()Lcom/google/api/services/drive/Drive$Files;

    .line 121
    move-result-object p2

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, p1}, Lcom/google/api/services/drive/Drive$Files;->create(Lcom/google/api/services/drive/model/File;)Lcom/google/api/services/drive/Drive$Files$Create;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/google/api/client/googleapis/services/AbstractGoogleClientRequest;->execute()Ljava/lang/Object;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    check-cast p1, Lcom/google/api/services/drive/model/File;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/google/api/services/drive/model/File;->getId()Ljava/lang/String;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    :goto_1
    const-string p2, "createOrUpdateContent"

    .line 138
    .line 139
    .line 140
    invoke-static {p2}, Lro/b;->i(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v1, p4}, Lcom/google/api/client/http/ByteArrayContent;->fromString(Ljava/lang/String;Ljava/lang/String;)Lcom/google/api/client/http/ByteArrayContent;

    .line 144
    move-result-object p2

    .line 145
    .line 146
    iget-object p4, p0, Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;->a:Lcom/google/api/services/drive/Drive;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p4}, Lcom/google/api/services/drive/Drive;->files()Lcom/google/api/services/drive/Drive$Files;

    .line 150
    move-result-object p4

    .line 151
    .line 152
    new-instance v1, Lcom/google/api/services/drive/model/File;

    .line 153
    .line 154
    .line 155
    invoke-direct {v1}, Lcom/google/api/services/drive/model/File;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, p3}, Lcom/google/api/services/drive/model/File;->setName(Ljava/lang/String;)Lcom/google/api/services/drive/model/File;

    .line 159
    move-result-object p3

    .line 160
    .line 161
    .line 162
    invoke-virtual {p4, p1, p3, p2}, Lcom/google/api/services/drive/Drive$Files;->update(Ljava/lang/String;Lcom/google/api/services/drive/model/File;Lcom/google/api/client/http/AbstractInputStreamContent;)Lcom/google/api/services/drive/Drive$Files$Update;

    .line 163
    move-result-object p1

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/google/api/client/googleapis/services/AbstractGoogleClientRequest;->execute()Ljava/lang/Object;
    :try_end_1
    .catch Lcom/google/api/client/googleapis/extensions/android/gms/auth/UserRecoverableAuthIOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 167
    const/4 p1, 0x1

    .line 168
    return p1

    .line 169
    .line 170
    :goto_2
    sget-object p2, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a:Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;

    .line 171
    .line 172
    const-string p3, "CloudStoragePlugin"

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, p1, p3}, Lcom/kubi/flutter/plugin/cloud_storage_plugin/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 176
    :catch_0
    return v0
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
.end method
