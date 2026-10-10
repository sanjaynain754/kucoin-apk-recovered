package com.sumsub.sns.internal.features.presentation.prooface.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.domain.facedetector.C28559e;
import com.sumsub.sns.internal.features.presentation.prooface.C31984A1;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.utils.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32266c {

    /* JADX INFO: renamed from: a */
    public final C28559e f65725a;

    /* JADX INFO: renamed from: b */
    public final C31984A1 f65726b;

    /* JADX INFO: renamed from: c */
    public final Handler f65727c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public final void m71077a(final ImageProxy imageProxy, Function1 function1) {
        try {
            function1.invoke(m71076a(this.f65725a.f58118c, new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.utils.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C32266c.m71074a(imageProxy);
                }
            }));
        } catch (Throwable th2) {
            this.f65726b.f65025a.m71017a(th2);
            imageProxy.close();
        }
    }

    public C32266c(C28559e c28559e, C31984A1 c31984a1) {
        this.f65725a = c28559e;
        this.f65726b = c31984a1;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71074a(ImageProxy imageProxy) {
        imageProxy.close();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public final Function0 m71076a(final long j11, final Function0 function0) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new Function0() { // from class: com.sumsub.sns.internal.features.presentation.prooface.utils.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C32266c.m71073a(jElapsedRealtime, j11, function0, this);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71073a(long j11, long j12, final Function0 function0, C32266c c32266c) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j11;
        if (jElapsedRealtime >= j12) {
            function0.invoke();
        } else {
            c32266c.f65727c.postDelayed(new Runnable() { // from class: com.sumsub.sns.internal.features.presentation.prooface.utils.i
                @Override // java.lang.Runnable
                public final void run() {
                    C32266c.m71075a(function0);
                }
            }, j12 - jElapsedRealtime);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m71075a(Function0 function0) {
        function0.invoke();
    }
}
