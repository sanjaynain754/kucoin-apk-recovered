.class Lcom/tencent/imsdk/manager/LibraryDownloader$1;
.super Ljava/lang/Object;
.source "LibraryDownloader.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/imsdk/manager/LibraryDownloader;->downloadLibrary(Landroid/content/Context;Lcom/tencent/imsdk/common/IMCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

.field final synthetic val$callback:Lcom/tencent/imsdk/common/IMCallback;


# direct methods
.method public constructor <init>(Lcom/tencent/imsdk/manager/LibraryDownloader;Lcom/tencent/imsdk/common/IMCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->val$callback:Lcom/tencent/imsdk/common/IMCallback;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$100(Lcom/tencent/imsdk/manager/LibraryDownloader;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->val$callback:Lcom/tencent/imsdk/common/IMCallback;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    iget-object v0, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$200(Lcom/tencent/imsdk/manager/LibraryDownloader;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 23
    const/4 v1, 0x1

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$202(Lcom/tencent/imsdk/manager/LibraryDownloader;Z)Z

    .line 27
    .line 28
    iget-object v0, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$300(Lcom/tencent/imsdk/manager/LibraryDownloader;)I

    .line 32
    move-result v0

    .line 33
    .line 34
    const-string v1, "SUCCESS"

    .line 35
    const/4 v2, 0x0

    .line 36
    .line 37
    const-string v3, "LibraryDownloader"

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const-string v0, "check library md5 success and load library success"

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    iget-object v0, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v2, v1}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$400(Lcom/tencent/imsdk/manager/LibraryDownloader;ILjava/lang/String;)V

    .line 50
    return-void

    .line 51
    .line 52
    :cond_1
    iget-object v0, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$500(Lcom/tencent/imsdk/manager/LibraryDownloader;)Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lcom/tencent/imsdk/common/SystemUtil;->deleteDirectory(Ljava/lang/String;)Z

    .line 60
    .line 61
    iget-object v0, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$500(Lcom/tencent/imsdk/manager/LibraryDownloader;)Ljava/lang/String;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lcom/tencent/imsdk/common/SystemUtil;->createDirectory(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    const-string/jumbo v0, "start download library"

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    iget-object v0, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 77
    .line 78
    const-string v4, "imsdk-plus-9.0.7667.aar"

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v4}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$600(Lcom/tencent/imsdk/manager/LibraryDownloader;Ljava/lang/String;)Z

    .line 82
    move-result v0

    .line 83
    .line 84
    if-nez v0, :cond_2

    .line 85
    .line 86
    const-string v0, "download library failed"

    .line 87
    .line 88
    .line 89
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    iget-object v1, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 92
    .line 93
    const/16 v2, 0x65

    .line 94
    .line 95
    .line 96
    invoke-static {v1, v2, v0}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$400(Lcom/tencent/imsdk/manager/LibraryDownloader;ILjava/lang/String;)V

    .line 97
    return-void

    .line 98
    .line 99
    :cond_2
    const-string v0, "download library success"

    .line 100
    .line 101
    .line 102
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    .line 104
    iget-object v0, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v4}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$700(Lcom/tencent/imsdk/manager/LibraryDownloader;Ljava/lang/String;)Z

    .line 108
    move-result v0

    .line 109
    .line 110
    if-nez v0, :cond_3

    .line 111
    .line 112
    .line 113
    const-string/jumbo v0, "uncompress library failed"

    .line 114
    .line 115
    .line 116
    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    iget-object v1, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 119
    .line 120
    const/16 v2, 0x66

    .line 121
    .line 122
    .line 123
    invoke-static {v1, v2, v0}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$400(Lcom/tencent/imsdk/manager/LibraryDownloader;ILjava/lang/String;)V

    .line 124
    return-void

    .line 125
    .line 126
    .line 127
    :cond_3
    const-string/jumbo v0, "uncompress library success"

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    .line 132
    iget-object v0, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$300(Lcom/tencent/imsdk/manager/LibraryDownloader;)I

    .line 136
    move-result v0

    .line 137
    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    const/16 v1, 0x67

    .line 141
    .line 142
    if-ne v0, v1, :cond_4

    .line 143
    .line 144
    const-string v1, "check library md5 failed"

    .line 145
    goto :goto_0

    .line 146
    .line 147
    :cond_4
    const-string v1, "load library failed"

    .line 148
    .line 149
    .line 150
    :goto_0
    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    iget-object v2, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 153
    .line 154
    .line 155
    invoke-static {v2, v0, v1}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$400(Lcom/tencent/imsdk/manager/LibraryDownloader;ILjava/lang/String;)V

    .line 156
    return-void

    .line 157
    .line 158
    :cond_5
    const-string v0, "load library success"

    .line 159
    .line 160
    .line 161
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    .line 163
    iget-object v0, p0, Lcom/tencent/imsdk/manager/LibraryDownloader$1;->this$0:Lcom/tencent/imsdk/manager/LibraryDownloader;

    .line 164
    .line 165
    .line 166
    invoke-static {v0, v2, v1}, Lcom/tencent/imsdk/manager/LibraryDownloader;->access$400(Lcom/tencent/imsdk/manager/LibraryDownloader;ILjava/lang/String;)V

    .line 167
    return-void
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
