.class public final Lcom/tencent/rmonitor/base/db/table/LinkDataTable;
.super Lcom/tencent/rmonitor/base/db/BaseTable;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/base/db/table/LinkDataTable$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B\u0019\u0008\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0012B\u0011\u0008\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0013J\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\"\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/tencent/rmonitor/base/db/table/LinkDataTable;",
        "Lcom/tencent/rmonitor/base/db/BaseTable;",
        "Landroid/database/sqlite/SQLiteDatabase;",
        "dataBase",
        "Lkotlin/Function0;",
        "",
        "block",
        "insert",
        "",
        "search",
        "Lcom/tencent/bugly/proguard/x0;",
        "baseDBParam",
        "Lcom/tencent/bugly/proguard/x0;",
        "Lcom/tencent/bugly/proguard/va;",
        "linkData",
        "Lcom/tencent/bugly/proguard/va;",
        "<init>",
        "()V",
        "(Lcom/tencent/bugly/proguard/x0;Lcom/tencent/bugly/proguard/va;)V",
        "(Lcom/tencent/bugly/proguard/x0;)V",
        "Companion",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field private static final COLUMN_APP_VERSION:Ljava/lang/String; = "app_version"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_BASE_TYPE:Ljava/lang/String; = "base_type"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_CLIENT_IDENTIFY:Ljava/lang/String; = "client_identify"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_EVENT_TIME:Ljava/lang/String; = "event_time"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_ID:Ljava/lang/String; = "_id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_LAUNCH_ID:Ljava/lang/String; = "launch_id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_PROCESS_LAUNCH_ID:Ljava/lang/String; = "process_launch_id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_PROCESS_NAME:Ljava/lang/String; = "process_name"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_PRODUCT_ID:Ljava/lang/String; = "product_id"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_RESERVED:Ljava/lang/String; = "reserved"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_SDK_VERSION:Ljava/lang/String; = "sdk_version"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_SUB_TYPE:Ljava/lang/String; = "sub_type"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final COLUMN_UIN:Ljava/lang/String; = "uin"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final CREATE_LINK_DATA:Ljava/lang/String; = "CREATE TABLE link_data (_id INTEGER PRIMARY KEY AUTOINCREMENT,product_id TEXT,process_name TEXT,app_version TEXT,sdk_version TEXT,launch_id TEXT,process_launch_id TEXT,uin TEXT,base_type TEXT,sub_type TEXT,client_identify TEXT,reserved TEXT,status TINYINT,event_time BIGINT,occur_time BIGINT);"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lcom/tencent/rmonitor/base/db/table/LinkDataTable$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TABLE_LINK_DATA:Ljava/lang/String; = "link_data"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "RMonitor_table_LinkDataTable"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private baseDBParam:Lcom/tencent/bugly/proguard/x0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private linkData:Lcom/tencent/bugly/proguard/va;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/rmonitor/base/db/table/LinkDataTable$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->Companion:Lcom/tencent/rmonitor/base/db/table/LinkDataTable$Companion;

    .line 9
    .line 10
    new-instance v0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;-><init>()V

    .line 14
    return-void
    .line 15
    .line 16
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "link_data"

    const-string v1, "CREATE TABLE link_data (_id INTEGER PRIMARY KEY AUTOINCREMENT,product_id TEXT,process_name TEXT,app_version TEXT,sdk_version TEXT,launch_id TEXT,process_launch_id TEXT,uin TEXT,base_type TEXT,sub_type TEXT,client_identify TEXT,reserved TEXT,status TINYINT,event_time BIGINT,occur_time BIGINT);"

    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/base/db/BaseTable;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/x0;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/x0;-><init>()V

    iput-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->baseDBParam:Lcom/tencent/bugly/proguard/x0;

    .line 3
    new-instance v0, Lcom/tencent/bugly/proguard/va;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/va;-><init>()V

    iput-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->linkData:Lcom/tencent/bugly/proguard/va;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/x0;)V
    .locals 1
    .param p1    # Lcom/tencent/bugly/proguard/x0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "baseDBParam"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->baseDBParam:Lcom/tencent/bugly/proguard/x0;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/x0;Lcom/tencent/bugly/proguard/va;)V
    .locals 1
    .param p1    # Lcom/tencent/bugly/proguard/x0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/bugly/proguard/va;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "baseDBParam"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->baseDBParam:Lcom/tencent/bugly/proguard/x0;

    .line 6
    iput-object p2, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->linkData:Lcom/tencent/bugly/proguard/va;

    return-void
.end method


# virtual methods
.method public insert(Landroid/database/sqlite/SQLiteDatabase;Lkotlin/jvm/functions/Function0;)I
    .locals 2
    .param p1    # Landroid/database/sqlite/SQLiteDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "dataBase"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "block"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance p2, Landroid/content/ContentValues;

    .line 13
    .line 14
    .line 15
    invoke-direct {p2}, Landroid/content/ContentValues;-><init>()V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->baseDBParam:Lcom/tencent/bugly/proguard/x0;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/tencent/bugly/proguard/x0;->b:Ljava/lang/String;

    .line 20
    .line 21
    const-string v1, "process_name"

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->baseDBParam:Lcom/tencent/bugly/proguard/x0;

    .line 27
    .line 28
    iget-object v0, v0, Lcom/tencent/bugly/proguard/x0;->a:Ljava/lang/String;

    .line 29
    .line 30
    const-string v1, "product_id"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->baseDBParam:Lcom/tencent/bugly/proguard/x0;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/tencent/bugly/proguard/x0;->c:Ljava/lang/String;

    .line 38
    .line 39
    const-string v1, "app_version"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->baseDBParam:Lcom/tencent/bugly/proguard/x0;

    .line 45
    .line 46
    iget-object v0, v0, Lcom/tencent/bugly/proguard/x0;->d:Ljava/lang/String;

    .line 47
    .line 48
    const-string v1, "sdk_version"

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->baseDBParam:Lcom/tencent/bugly/proguard/x0;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/tencent/bugly/proguard/x0;->g:Ljava/lang/String;

    .line 56
    .line 57
    const-string v1, "uin"

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->linkData:Lcom/tencent/bugly/proguard/va;

    .line 63
    .line 64
    iget-object v0, v0, Lcom/tencent/bugly/proguard/va;->c:Ljava/lang/String;

    .line 65
    .line 66
    const-string v1, "launch_id"

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->linkData:Lcom/tencent/bugly/proguard/va;

    .line 72
    .line 73
    iget-object v0, v0, Lcom/tencent/bugly/proguard/va;->d:Ljava/lang/String;

    .line 74
    .line 75
    const-string v1, "process_launch_id"

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->linkData:Lcom/tencent/bugly/proguard/va;

    .line 81
    .line 82
    iget-object v0, v0, Lcom/tencent/bugly/proguard/va;->a:Ljava/lang/String;

    .line 83
    .line 84
    const-string v1, "base_type"

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->linkData:Lcom/tencent/bugly/proguard/va;

    .line 90
    .line 91
    iget-object v0, v0, Lcom/tencent/bugly/proguard/va;->b:Ljava/lang/String;

    .line 92
    .line 93
    const-string v1, "sub_type"

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->linkData:Lcom/tencent/bugly/proguard/va;

    .line 99
    .line 100
    iget-object v0, v0, Lcom/tencent/bugly/proguard/va;->e:Ljava/lang/String;

    .line 101
    .line 102
    const-string v1, "client_identify"

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    const-string v0, "reserved"

    .line 108
    .line 109
    const-string v1, ""

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    sget-object v0, Lcom/tencent/rmonitor/base/db/DBDataStatus;->TO_SEND:Lcom/tencent/rmonitor/base/db/DBDataStatus;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/db/DBDataStatus;->getValue()I

    .line 118
    move-result v0

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    move-result-object v0

    .line 123
    .line 124
    const-string v1, "status"

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 128
    .line 129
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->linkData:Lcom/tencent/bugly/proguard/va;

    .line 130
    .line 131
    iget-wide v0, v0, Lcom/tencent/bugly/proguard/va;->f:J

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    const-string v1, "event_time"

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 141
    .line 142
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->linkData:Lcom/tencent/bugly/proguard/va;

    .line 143
    .line 144
    iget-wide v0, v0, Lcom/tencent/bugly/proguard/va;->g:J

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 148
    move-result-object v0

    .line 149
    .line 150
    const-string v1, "occur_time"

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 154
    .line 155
    const-string v0, "link_data"

    .line 156
    const/4 v1, 0x0

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v0, v1, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 160
    move-result-wide p1

    .line 161
    long-to-int p1, p1

    .line 162
    return p1
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
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public search(Landroid/database/sqlite/SQLiteDatabase;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 11
    .param p1    # Landroid/database/sqlite/SQLiteDatabase;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "dataBase"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "block"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    check-cast p2, Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 27
    move-result p2

    .line 28
    .line 29
    const-string v5, "process_name=? and product_id=? and process_launch_id=?"

    .line 30
    .line 31
    iget-object v0, p0, Lcom/tencent/rmonitor/base/db/table/LinkDataTable;->baseDBParam:Lcom/tencent/bugly/proguard/x0;

    .line 32
    .line 33
    iget-object v2, v0, Lcom/tencent/bugly/proguard/x0;->b:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, v0, Lcom/tencent/bugly/proguard/x0;->a:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/tencent/bugly/proguard/x0;->f:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    filled-new-array {v2, v3, v0}, [Ljava/lang/String;

    .line 41
    move-result-object v6

    .line 42
    .line 43
    const-string v9, "occur_time DESC"

    .line 44
    const/4 v0, 0x0

    .line 45
    .line 46
    if-lez p2, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 50
    move-result-object p2

    .line 51
    move-object v10, p2

    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    :cond_0
    move-object v10, v0

    .line 58
    .line 59
    :goto_0
    const-string v3, "link_data"

    .line 60
    const/4 v4, 0x0

    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v8, 0x0

    .line 63
    move-object v2, p1

    .line 64
    .line 65
    .line 66
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 67
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    .line 72
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->isAfterLast()Z

    .line 76
    move-result p2

    .line 77
    .line 78
    if-nez p2, :cond_1

    .line 79
    .line 80
    new-instance p2, Lcom/tencent/bugly/proguard/va;

    .line 81
    .line 82
    .line 83
    invoke-direct {p2}, Lcom/tencent/bugly/proguard/va;-><init>()V

    .line 84
    .line 85
    const-string v2, "launch_id"

    .line 86
    .line 87
    .line 88
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 89
    move-result v2

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 93
    move-result-object v2

    .line 94
    .line 95
    iput-object v2, p2, Lcom/tencent/bugly/proguard/va;->c:Ljava/lang/String;

    .line 96
    .line 97
    const-string v2, "process_launch_id"

    .line 98
    .line 99
    .line 100
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 101
    move-result v2

    .line 102
    .line 103
    .line 104
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 105
    move-result-object v2

    .line 106
    .line 107
    iput-object v2, p2, Lcom/tencent/bugly/proguard/va;->d:Ljava/lang/String;

    .line 108
    .line 109
    const-string v2, "base_type"

    .line 110
    .line 111
    .line 112
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 113
    move-result v2

    .line 114
    .line 115
    .line 116
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    iput-object v2, p2, Lcom/tencent/bugly/proguard/va;->a:Ljava/lang/String;

    .line 120
    .line 121
    const-string v2, "sub_type"

    .line 122
    .line 123
    .line 124
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 125
    move-result v2

    .line 126
    .line 127
    .line 128
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 129
    move-result-object v2

    .line 130
    .line 131
    iput-object v2, p2, Lcom/tencent/bugly/proguard/va;->b:Ljava/lang/String;

    .line 132
    .line 133
    const-string v2, "client_identify"

    .line 134
    .line 135
    .line 136
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 137
    move-result v2

    .line 138
    .line 139
    .line 140
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 141
    move-result-object v2

    .line 142
    .line 143
    iput-object v2, p2, Lcom/tencent/bugly/proguard/va;->e:Ljava/lang/String;

    .line 144
    .line 145
    const-string v2, "event_time"

    .line 146
    .line 147
    .line 148
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 149
    move-result v2

    .line 150
    .line 151
    .line 152
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 153
    move-result-wide v2

    .line 154
    .line 155
    iput-wide v2, p2, Lcom/tencent/bugly/proguard/va;->f:J

    .line 156
    .line 157
    const-string v2, "occur_time"

    .line 158
    .line 159
    .line 160
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 161
    move-result v2

    .line 162
    .line 163
    .line 164
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 165
    move-result-wide v2

    .line 166
    .line 167
    iput-wide v2, p2, Lcom/tencent/bugly/proguard/va;->g:J

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 174
    goto :goto_1

    .line 175
    :catchall_1
    move-exception v0

    .line 176
    move-object p2, v0

    .line 177
    goto :goto_2

    .line 178
    .line 179
    :cond_1
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 180
    .line 181
    .line 182
    :try_start_2
    invoke-static {p1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 183
    return-object v1

    .line 184
    :goto_2
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 185
    :catchall_2
    move-exception v0

    .line 186
    .line 187
    .line 188
    :try_start_4
    invoke-static {p1, p2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 189
    throw v0

    .line 190
    .line 191
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 192
    .line 193
    const-string p2, "null cannot be cast to non-null type kotlin.Int"

    .line 194
    .line 195
    .line 196
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 197
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 198
    .line 199
    :goto_3
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 200
    .line 201
    const-string v0, "RMonitor_table_LinkDataTable"

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 205
    :cond_3
    return-object v1
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
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method
