.class Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/datavisor/vangogh/storage/local/DVJS2Native;->initToken(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/datavisor/vangogh/storage/local/DVJS2Native;


# direct methods
.method public constructor <init>(Lcom/datavisor/vangogh/storage/local/DVJS2Native;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;->b:Lcom/datavisor/vangogh/storage/local/DVJS2Native;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;->a:Ljava/lang/String;

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method


# virtual methods
.method public onResult(Ljava/lang/String;I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;->b:Lcom/datavisor/vangogh/storage/local/DVJS2Native;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/datavisor/vangogh/storage/local/DVJS2Native;->access$100(Lcom/datavisor/vangogh/storage/local/DVJS2Native;)Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    const-string v1, "H6i37Q=="

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/datavisorobfus/y0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    .line 24
    move-result v1

    .line 25
    .line 26
    const-string v2, ""

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    move-object v0, v2

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-static {p1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    .line 33
    move-result v1

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    move-object p1, v2

    .line 37
    .line 38
    :cond_1
    if-eqz p2, :cond_2

    .line 39
    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    const-string v2, "Native Error Code: "

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    :cond_2
    iget-object p2, p0, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;->a:Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    filled-new-array {p1, v0, v2, p2}, [Ljava/lang/Object;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    .line 64
    const-string/jumbo p2, "window.dvEdgeRapahel_GetNativeToken(\'%s\', \'%s\', \'%s\', %s);"

    .line 65
    .line 66
    .line 67
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    move-result-object p1

    .line 69
    .line 70
    new-instance p2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string/jumbo v0, "strJSCommand initToken Case: "

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    move-result-object p2

    .line 87
    .line 88
    .line 89
    invoke-static {p2}, Lcom/datavisorobfus/f0;->a(Ljava/lang/String;)V

    .line 90
    .line 91
    iget-object p2, p0, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;->b:Lcom/datavisor/vangogh/storage/local/DVJS2Native;

    .line 92
    .line 93
    .line 94
    invoke-static {p2}, Lcom/datavisor/vangogh/storage/local/DVJS2Native;->access$000(Lcom/datavisor/vangogh/storage/local/DVJS2Native;)Landroid/webkit/WebView;

    .line 95
    move-result-object p2

    .line 96
    .line 97
    new-instance v0, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b$a;

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, p0, p1}, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b$a;-><init>(Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 104
    return-void
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
.end method
