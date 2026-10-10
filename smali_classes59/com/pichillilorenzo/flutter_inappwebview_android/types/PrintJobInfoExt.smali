.class public Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private attributes:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;

.field private copies:I

.field private creationTime:J

.field private label:Ljava/lang/String;

.field private numberOfPages:Ljava/lang/Integer;

.field private printerId:Ljava/lang/String;

.field private state:I


# direct methods
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

.method public static fromPrintJobInfo(Landroid/print/PrintJobInfo;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    :cond_0
    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getState()I

    .line 13
    move-result v2

    .line 14
    .line 15
    iput v2, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->state:I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getCopies()I

    .line 19
    move-result v2

    .line 20
    .line 21
    iput v2, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->copies:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getPages()[Landroid/print/PageRange;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getPages()[Landroid/print/PageRange;

    .line 31
    move-result-object v2

    .line 32
    array-length v2, v2

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    move-result-object v2

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v2, v0

    .line 39
    .line 40
    :goto_0
    iput-object v2, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->numberOfPages:Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getCreationTime()J

    .line 44
    move-result-wide v2

    .line 45
    .line 46
    iput-wide v2, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->creationTime:J

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getLabel()Ljava/lang/String;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    iput-object v2, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->label:Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getPrinterId()Landroid/print/PrinterId;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getPrinterId()Landroid/print/PrinterId;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/print/PrinterId;->getLocalId()Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    :cond_2
    iput-object v0, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->printerId:Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/print/PrintJobInfo;->getAttributes()Landroid/print/PrintAttributes;

    .line 72
    move-result-object p0

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->fromPrintAttributes(Landroid/print/PrintAttributes;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;

    .line 76
    move-result-object p0

    .line 77
    .line 78
    iput-object p0, v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->attributes:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;

    .line 79
    return-object v1
    .line 80
    .line 81
.end method


# virtual methods
.method public toMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->state:I

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    const-string/jumbo v2, "state"

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    iget v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->copies:I

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    const-string v2, "copies"

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->numberOfPages:Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    const-string/jumbo v2, "numberOfPages"

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    iget-wide v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->creationTime:J

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    const-string v2, "creationTime"

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->label:Ljava/lang/String;

    .line 50
    .line 51
    const-string v2, "label"

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    new-instance v1, Ljava/util/HashMap;

    .line 57
    .line 58
    .line 59
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 60
    .line 61
    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->printerId:Ljava/lang/String;

    .line 62
    .line 63
    const-string v3, "id"

    .line 64
    .line 65
    .line 66
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    const-string/jumbo v2, "printer"

    .line 70
    .line 71
    .line 72
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintJobInfoExt;->attributes:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;

    .line 75
    .line 76
    if-eqz v1, :cond_0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PrintAttributesExt;->toMap()Ljava/util/Map;

    .line 80
    move-result-object v1

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    const/4 v1, 0x0

    .line 83
    .line 84
    :goto_0
    const-string v2, "attributes"

    .line 85
    .line 86
    .line 87
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    return-object v0
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
