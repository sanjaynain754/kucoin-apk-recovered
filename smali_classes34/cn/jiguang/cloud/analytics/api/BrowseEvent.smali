.class public Lcn/jiguang/cloud/analytics/api/BrowseEvent;
.super Lcn/jiguang/privates/analysis/api/Event;
.source "BrowseEvent.java"


# static fields
.field private static final CUSTOM_SIZE:I = 0x4

.field private static final TAG:Ljava/lang/String; = "BrowseEvent"


# instance fields
.field private browseDuration:F

.field private browseId:Ljava/lang/String;

.field private browseName:Ljava/lang/String;

.field private browseType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "custom_browse"

    invoke-direct {p0, v0}, Lcn/jiguang/privates/analysis/api/Event;-><init>(Ljava/lang/String;)V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseId:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseName:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseType:Ljava/lang/String;

    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseDuration:F

    .line 6
    const-string v1, "browse_content_id"

    invoke-super {p0, v1, v0}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 7
    const-string v0, "browse_name"

    iget-object v1, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseName:Ljava/lang/String;

    invoke-super {p0, v0, v1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 8
    const-string v0, "browse_type"

    iget-object v1, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseType:Ljava/lang/String;

    invoke-super {p0, v0, v1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 9
    iget v0, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseDuration:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "browse_duration"

    invoke-super {p0, v1, v0}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .line 10
    const-string v0, "custom_browse"

    invoke-direct {p0, v0}, Lcn/jiguang/privates/analysis/api/Event;-><init>(Ljava/lang/String;)V

    .line 11
    iput-object p1, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseId:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseName:Ljava/lang/String;

    .line 13
    iput-object p3, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseType:Ljava/lang/String;

    long-to-float p2, p4

    .line 14
    iput p2, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseDuration:F

    .line 15
    const-string p2, "browse_content_id"

    invoke-super {p0, p2, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 16
    const-string p1, "browse_name"

    iget-object p2, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseName:Ljava/lang/String;

    invoke-super {p0, p1, p2}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 17
    const-string p1, "browse_type"

    iget-object p2, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseType:Ljava/lang/String;

    invoke-super {p0, p1, p2}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 18
    iget p1, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseDuration:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const-string p2, "browse_duration"

    invoke-super {p0, p2, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    return-void
.end method


# virtual methods
.method public addExtMap(Ljava/util/Map;)Lcn/jiguang/privates/analysis/api/Event;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcn/jiguang/privates/analysis/api/Event;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ljava/util/Map$Entry;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    move-result v1

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    check-cast v1, Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    const/4 v2, -0x1

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 47
    move-result v3

    .line 48
    .line 49
    .line 50
    sparse-switch v3, :sswitch_data_0

    .line 51
    goto :goto_1

    .line 52
    .line 53
    :sswitch_0
    const-string v3, "browse_type"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    move-result v1

    .line 58
    .line 59
    if-nez v1, :cond_1

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const/4 v2, 0x3

    .line 62
    goto :goto_1

    .line 63
    .line 64
    :sswitch_1
    const-string v3, "browse_name"

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    move-result v1

    .line 69
    .line 70
    if-nez v1, :cond_2

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/4 v2, 0x2

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :sswitch_2
    const-string v3, "browse_duration"

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    move-result v1

    .line 80
    .line 81
    if-nez v1, :cond_3

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    const/4 v2, 0x1

    .line 84
    goto :goto_1

    .line 85
    .line 86
    :sswitch_3
    const-string v3, "browse_content_id"

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    move-result v1

    .line 91
    .line 92
    if-nez v1, :cond_4

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    const/4 v2, 0x0

    .line 95
    .line 96
    .line 97
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    check-cast v1, Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v1, v0}, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/cloud/analytics/api/BrowseEvent;

    .line 111
    goto :goto_0

    .line 112
    .line 113
    :pswitch_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    const-string v2, "key ["

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    check-cast v0, Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    const-string v0, "] is invalid"

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    const-string v1, "BrowseEvent"

    .line 142
    .line 143
    .line 144
    invoke-static {v1, v0}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    :cond_5
    return-object p0

    .line 148
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x39332c8a -> :sswitch_3
        -0x347a6c57 -> :sswitch_2
        -0x2f32ece0 -> :sswitch_1
        -0x2f2fd831 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
.end method

.method public addKeyValue(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/cloud/analytics/api/BrowseEvent;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/cloud/analytics/api/BrowseEvent;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public getBrowseDuration()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseDuration:F

    .line 3
    return v0
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
    .line 18
.end method

.method public getBrowseId()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseId:Ljava/lang/String;

    .line 3
    return-object v0
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
    .line 18
.end method

.method public getBrowseName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseName:Ljava/lang/String;

    .line 3
    return-object v0
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
    .line 18
.end method

.method public getBrowseType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseType:Ljava/lang/String;

    .line 3
    return-object v0
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
    .line 18
.end method

.method public putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/cloud/analytics/api/BrowseEvent;
    .locals 3

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "BrowseEvent"

    const/4 v1, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "browse_type"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v2, "browse_name"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v2, "browse_duration"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v2, "browse_content_id"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 4
    iget-object v1, p0, Lcn/jiguang/privates/analysis/api/Event;->extraAttrMap:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    const/16 v2, 0x32

    if-lt v1, v2, :cond_5

    .line 5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "can\'t put ["

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "], browse event extraAttrMap size can\'t be no more than "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    .line 6
    :cond_5
    invoke-super {p0, p1, p2}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    move-result-object p1

    check-cast p1, Lcn/jiguang/cloud/analytics/api/BrowseEvent;

    return-object p1

    .line 7
    :pswitch_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "key ["

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] is invalid"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x39332c8a -> :sswitch_3
        -0x347a6c57 -> :sswitch_2
        -0x2f32ece0 -> :sswitch_1
        -0x2f2fd831 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/cloud/analytics/api/BrowseEvent;

    move-result-object p1

    return-object p1
.end method

.method public setBrowseDuration(F)Lcn/jiguang/cloud/analytics/api/BrowseEvent;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcn/jiguang/privates/analysis/utils/JAnalyticsHelper;->isValidValue(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseDuration:F

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    const-string v0, "browse_duration"

    .line 19
    .line 20
    .line 21
    invoke-super {p0, v0, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 22
    :cond_0
    return-object p0
    .line 23
.end method

.method public setBrowseId(Ljava/lang/String;)Lcn/jiguang/cloud/analytics/api/BrowseEvent;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/analysis/utils/JAnalyticsHelper;->isValidValue(Ljava/lang/Object;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseId:Ljava/lang/String;

    .line 9
    .line 10
    const-string v0, "browse_content_id"

    .line 11
    .line 12
    .line 13
    invoke-super {p0, v0, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 14
    :cond_0
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setBrowseName(Ljava/lang/String;)Lcn/jiguang/cloud/analytics/api/BrowseEvent;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/analysis/utils/JAnalyticsHelper;->isValidValue(Ljava/lang/Object;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseName:Ljava/lang/String;

    .line 9
    .line 10
    const-string v0, "browse_name"

    .line 11
    .line 12
    .line 13
    invoke-super {p0, v0, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 14
    :cond_0
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setBrowseType(Ljava/lang/String;)Lcn/jiguang/cloud/analytics/api/BrowseEvent;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/analysis/utils/JAnalyticsHelper;->isValidValue(Ljava/lang/Object;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->browseType:Ljava/lang/String;

    .line 9
    .line 10
    const-string v0, "browse_type"

    .line 11
    .line 12
    .line 13
    invoke-super {p0, v0, p1}, Lcn/jiguang/privates/analysis/api/Event;->putExtraAttr(Ljava/lang/String;Ljava/lang/Object;)Lcn/jiguang/privates/analysis/api/Event;

    .line 14
    :cond_0
    return-object p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public setExtMap(Ljava/util/Map;)Lcn/jiguang/privates/analysis/api/Event;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcn/jiguang/privates/analysis/api/Event;"
        }
    .end annotation

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    :goto_0
    return-object p0

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0}, Lcn/jiguang/privates/analysis/api/Event;->getExtraAttrMap()Ljava/util/Map;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_6

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_6

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_6

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    check-cast v1, Ljava/util/Map$Entry;

    .line 43
    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    check-cast v2, Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    const/4 v3, -0x1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 56
    move-result v4

    .line 57
    .line 58
    .line 59
    sparse-switch v4, :sswitch_data_0

    .line 60
    goto :goto_2

    .line 61
    .line 62
    :sswitch_0
    const-string v4, "browse_type"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    move-result v2

    .line 67
    .line 68
    if-nez v2, :cond_2

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    const/4 v3, 0x3

    .line 71
    goto :goto_2

    .line 72
    .line 73
    :sswitch_1
    const-string v4, "browse_name"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    move-result v2

    .line 78
    .line 79
    if-nez v2, :cond_3

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    const/4 v3, 0x2

    .line 82
    goto :goto_2

    .line 83
    .line 84
    :sswitch_2
    const-string v4, "browse_duration"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    move-result v2

    .line 89
    .line 90
    if-nez v2, :cond_4

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    const/4 v3, 0x1

    .line 93
    goto :goto_2

    .line 94
    .line 95
    :sswitch_3
    const-string v4, "browse_content_id"

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    move-result v2

    .line 100
    .line 101
    if-nez v2, :cond_5

    .line 102
    goto :goto_2

    .line 103
    :cond_5
    const/4 v3, 0x0

    .line 104
    .line 105
    .line 106
    :goto_2
    packed-switch v3, :pswitch_data_0

    .line 107
    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 110
    goto :goto_1

    .line 111
    .line 112
    :pswitch_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    const-string v3, "key ["

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    check-cast v1, Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    const-string v1, "] is invalid"

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    move-result-object v1

    .line 139
    .line 140
    const-string v2, "BrowseEvent"

    .line 141
    .line 142
    .line 143
    invoke-static {v2, v1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    goto :goto_1

    .line 145
    .line 146
    .line 147
    :cond_6
    invoke-virtual {p0, p1}, Lcn/jiguang/cloud/analytics/api/BrowseEvent;->addExtMap(Ljava/util/Map;)Lcn/jiguang/privates/analysis/api/Event;

    .line 148
    return-object p0

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
    :sswitch_data_0
    .sparse-switch
        -0x39332c8a -> :sswitch_3
        -0x347a6c57 -> :sswitch_2
        -0x2f32ece0 -> :sswitch_1
        -0x2f2fd831 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
.end method
