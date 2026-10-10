.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field public final a:Landroid/app/Activity;

.field public final b:Lkotlin/jvm/functions/Function0;

.field public c:Landroid/hardware/SensorManager;

.field public d:Landroid/hardware/Sensor;

.field public e:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;

.field public f:F


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->a:Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->b:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    .line 10
    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 11
    .line 12
    iput p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->f:F

    .line 13
    return-void
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
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->a:Landroid/app/Activity;

    const-string/jumbo v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->c:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_0

    const/4 v1, 0x5

    .line 2
    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->d:Landroid/hardware/Sensor;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;)V
    .locals 3

    .line 3
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->f:F

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ScreenBrightnessController: changeScreenBrightness: illumination: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 5
    iget v1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;->a:I

    .line 6
    const-string/jumbo v2, "screen_brightness_mode"

    invoke-static {v0, v2, v1}, Landroid/provider/Settings$System;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 8
    iget v1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;->b:I

    .line 9
    const-string/jumbo v2, "screen_brightness"

    invoke-static {v0, v2, v1}, Landroid/provider/Settings$System;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 11
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;->b:I

    int-to-float p1, p1

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr p1, v1

    .line 12
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 13
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->c:Landroid/hardware/SensorManager;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->b:Lkotlin/jvm/functions/Function0;

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->a(Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;)V

    .line 29
    const/4 v0, 0x0

    .line 30
    .line 31
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;

    .line 32
    :cond_1
    return-void
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

.method public final c()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->c:Landroid/hardware/SensorManager;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->d:Landroid/hardware/Sensor;

    .line 7
    const/4 v2, 0x3

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final d()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;

    .line 3
    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->f:F

    .line 7
    .line 8
    const/high16 v1, 0x41200000    # 10.0f

    .line 9
    .line 10
    cmpg-float v0, v0, v1

    .line 11
    .line 12
    if-gez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->b:Lkotlin/jvm/functions/Function0;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->a:Landroid/app/Activity;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    const-string/jumbo v1, "screen_brightness_mode"

    .line 36
    const/4 v2, -0x1

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 40
    move-result v0

    .line 41
    .line 42
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->a:Landroid/app/Activity;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    const-string/jumbo v3, "screen_brightness"

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v3, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 53
    move-result v1

    .line 54
    .line 55
    if-eq v0, v2, :cond_1

    .line 56
    .line 57
    if-ne v1, v2, :cond_0

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;-><init>(II)V

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 66
    .line 67
    :goto_1
    iput-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->e:Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;

    .line 68
    .line 69
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;

    .line 70
    const/4 v1, 0x0

    .line 71
    .line 72
    const/16 v2, 0xff

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;-><init>(II)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->a(Lcom/sumsub/sns/internal/features/presentation/prooface/utils/e;)V

    .line 79
    :cond_2
    return-void
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

.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "ScreenBrightnessController: onAccuracyChanged: sensor: "

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string p1, ", accuracy: "

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 1

    .line 1
    .line 2
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    aget p1, p1, v0

    .line 6
    .line 7
    iput p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->f:F

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/f;->d()V

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
.end method
