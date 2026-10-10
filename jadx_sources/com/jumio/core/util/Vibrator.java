package com.jumio.core.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import com.jumio.core.interfaces.VibratorInterface;
import org.jetbrains.annotations.NotNull;
import p822z6.C46710d;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/util/Vibrator;", "Lcom/jumio/core/interfaces/VibratorInterface;", "<init>", "()V", "vibrate", "", "context", "Landroid/content/Context;", "milliseconds", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Vibrator implements VibratorInterface {
    @Override // com.jumio.core.interfaces.VibratorInterface
    @SuppressLint({"MissingPermission"})
    public void vibrate(@NotNull Context context, long milliseconds) {
        android.os.Vibrator defaultVibrator;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 31) {
                Object systemService = context.getSystemService("vibrator_manager");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
                defaultVibrator = C46710d.m102955a(systemService).getDefaultVibrator();
            } else {
                Object systemService2 = context.getSystemService("vibrator");
                Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                defaultVibrator = (android.os.Vibrator) systemService2;
            }
            Intrinsics.checkNotNull(defaultVibrator);
            if (i11 >= 26) {
                defaultVibrator.vibrate(VibrationEffect.createOneShot(milliseconds, -1));
            } else {
                defaultVibrator.vibrate(milliseconds);
            }
        } catch (Exception unused) {
        }
    }
}
