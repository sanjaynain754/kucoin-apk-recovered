.class Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$2;
.super Ljava/lang/Object;
.source "SQLiteDBHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;->query(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

.field final synthetic val$sqlStr:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$2;->this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$2;->val$sqlStr:Ljava/lang/String;

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
    .locals 8

    .line 1
    .line 2
    const-string v0, "[]"

    .line 3
    .line 4
    const-string v1, "cursor close error"

    .line 5
    .line 6
    const-string v2, "SQLiteDBHelper"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    :try_start_0
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$2;->this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 13
    move-result-object v4

    .line 14
    .line 15
    iget-object v5, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$2;->val$sqlStr:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$2;->this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

    .line 24
    .line 25
    .line 26
    const-string/jumbo v5, "query returned null cursor"

    .line 27
    .line 28
    const/16 v6, -0x13ef

    .line 29
    .line 30
    .line 31
    invoke-static {v4, v6, v5, v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;->access$100(Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    .line 36
    :goto_0
    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 37
    return-void

    .line 38
    .line 39
    .line 40
    :catch_0
    invoke-static {v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_2

    .line 44
    .line 45
    :cond_0
    :try_start_2
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$2;->this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

    .line 46
    .line 47
    sget-object v5, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->SUCCESS:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 51
    move-result v5

    .line 52
    .line 53
    .line 54
    const-string/jumbo v6, "success"

    .line 55
    .line 56
    iget-object v7, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$2;->this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

    .line 57
    .line 58
    .line 59
    invoke-static {v7, v3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;->access$200(Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;Landroid/database/Cursor;)Ljava/lang/String;

    .line 60
    move-result-object v7

    .line 61
    .line 62
    .line 63
    invoke-static {v4, v5, v6, v7}, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;->access$100(Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;ILjava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    goto :goto_0

    .line 65
    .line 66
    :catch_1
    :try_start_3
    iget-object v4, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper$2;->this$0:Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;

    .line 67
    .line 68
    .line 69
    const-string/jumbo v5, "sql query error"

    .line 70
    .line 71
    const/16 v6, -0x13ee

    .line 72
    .line 73
    .line 74
    invoke-static {v4, v6, v5, v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;->access$100(Lcom/tencent/cloud/tuikit/engine/extension/internal/SQLiteDBHelper;ILjava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 75
    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    .line 79
    :try_start_4
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 80
    :cond_1
    :goto_1
    return-void

    .line 81
    .line 82
    :goto_2
    if-eqz v3, :cond_2

    .line 83
    .line 84
    .line 85
    :try_start_5
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 86
    goto :goto_3

    .line 87
    .line 88
    .line 89
    :catch_2
    invoke-static {v2, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :cond_2
    :goto_3
    throw v0
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
