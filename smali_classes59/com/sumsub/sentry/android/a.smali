.class public final Lcom/sumsub/sentry/android/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


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


# virtual methods
.method public final a()Z
    .locals 6

    .line 1
    .line 2
    const-string v0, "google_sdk"

    .line 3
    .line 4
    const-string v1, "generic"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    :try_start_0
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x2

    .line 10
    .line 11
    .line 12
    invoke-static {v3, v1, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 13
    move-result v3

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-static {v3, v1, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 21
    move-result v3

    .line 22
    .line 23
    if-nez v3, :cond_2

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    :goto_0
    sget-object v3, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    invoke-static {v3, v1, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 33
    move-result v1

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "unknown"

    .line 39
    .line 40
    .line 41
    invoke-static {v3, v1, v2, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    sget-object v1, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 47
    .line 48
    const-string v3, "goldfish"

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v3, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 52
    move-result v3

    .line 53
    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    .line 57
    const-string/jumbo v3, "ranchu"

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v3, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 61
    move-result v1

    .line 62
    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v0, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 69
    move-result v3

    .line 70
    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    const-string v3, "Emulator"

    .line 74
    .line 75
    .line 76
    invoke-static {v1, v3, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 77
    move-result v3

    .line 78
    .line 79
    if-nez v3, :cond_2

    .line 80
    .line 81
    const-string v3, "Android SDK built for x86"

    .line 82
    .line 83
    .line 84
    invoke-static {v1, v3, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 85
    move-result v1

    .line 86
    .line 87
    if-nez v1, :cond_2

    .line 88
    .line 89
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 90
    .line 91
    const-string v3, "Genymotion"

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v3, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 95
    move-result v1

    .line 96
    .line 97
    if-nez v1, :cond_2

    .line 98
    .line 99
    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    const-string/jumbo v3, "sdk_google"

    .line 103
    .line 104
    .line 105
    invoke-static {v1, v3, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 106
    move-result v3

    .line 107
    .line 108
    if-nez v3, :cond_2

    .line 109
    .line 110
    .line 111
    invoke-static {v1, v0, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 112
    move-result v0

    .line 113
    .line 114
    if-nez v0, :cond_2

    .line 115
    .line 116
    .line 117
    const-string/jumbo v0, "sdk"

    .line 118
    .line 119
    .line 120
    invoke-static {v1, v0, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 121
    move-result v0

    .line 122
    .line 123
    if-nez v0, :cond_2

    .line 124
    .line 125
    .line 126
    const-string/jumbo v0, "sdk_x86"

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v0, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 130
    move-result v0

    .line 131
    .line 132
    if-nez v0, :cond_2

    .line 133
    .line 134
    .line 135
    const-string/jumbo v0, "vbox86p"

    .line 136
    .line 137
    .line 138
    invoke-static {v1, v0, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 139
    move-result v0

    .line 140
    .line 141
    if-nez v0, :cond_2

    .line 142
    .line 143
    const-string v0, "emulator"

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v0, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 147
    move-result v0

    .line 148
    .line 149
    if-nez v0, :cond_2

    .line 150
    .line 151
    .line 152
    const-string/jumbo v0, "simulator"

    .line 153
    .line 154
    .line 155
    invoke-static {v1, v0, v2, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 156
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    if-eqz v0, :cond_1

    .line 159
    goto :goto_1

    .line 160
    :cond_1
    return v2

    .line 161
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 162
    return v0

    .line 163
    .line 164
    :goto_2
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 165
    .line 166
    .line 167
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 168
    move-result-object v1

    .line 169
    .line 170
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    .line 171
    .line 172
    const-string v4, "Error checking whether application is running in an emulator."

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3, v1, v4, v0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 176
    return v2
    .line 177
.end method
