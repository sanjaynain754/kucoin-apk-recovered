package com.kubi.monitor.metrics.impl;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import br.InterfaceC4645a;
import com.kubi.monitor.metrics.bean.CollectorData;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33627eb;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p840zq.C46908e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: CpuCollector.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/monitor/metrics/impl/CpuCollector;", "Lbr/a;", "<init>", "()V", "Lcom/kubi/monitor/metrics/bean/CollectorData;", "b", "()Lcom/kubi/monitor/metrics/bean/CollectorData;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()I", "", "d", "()F", "e", "f", "", "line", "c", "(Ljava/lang/String;)I", "I", C33556b3.f69038e2, "Ljava/io/RandomAccessFile;", "Ljava/io/RandomAccessFile;", "mProcessAppFile", "mProcessFile", "", "Ljava/lang/Long;", "mLastCpuTime", "mLastAppCpuTime", "Companion", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class CpuCollector implements InterfaceC4645a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int pid = Process.myPid();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public RandomAccessFile mProcessAppFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public RandomAccessFile mProcessFile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Long mLastCpuTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Long mLastAppCpuTime;

    @Override // br.InterfaceC4645a
    /* JADX INFO: renamed from: a */
    public int mo4592a() {
        return 1;
    }

    @Override // br.InterfaceC4645a
    @NotNull
    /* JADX INFO: renamed from: b */
    public CollectorData mo4593b() {
        CollectorData collectorDataAcquire = C46908e.f104773a.m103324k().acquire();
        if (collectorDataAcquire == null) {
            collectorDataAcquire = new CollectorData(1);
        }
        long jM42490d = (long) m42490d();
        collectorDataAcquire.m42486g(jM42490d, ((long) 100) - jM42490d);
        collectorDataAcquire.m42488i(1);
        C44128b.m97259c("MetricsManager", Intrinsics.stringPlus("cpu data ", collectorDataAcquire));
        return collectorDataAcquire;
    }

    /* JADX INFO: renamed from: c */
    public final int m42489c(String line) {
        if (!StringsKt.contains$default((CharSequence) line, (CharSequence) "CPU", false, 2, (Object) null)) {
            return -1;
        }
        Object[] array = new Regex("\\s+").split(line, 0).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (StringsKt.contains$default((CharSequence) strArr[i11], (CharSequence) "CPU", false, 2, (Object) null)) {
                return i11;
            }
            i11 = i12;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final float m42490d() {
        return Build.VERSION.SDK_INT >= 26 ? m42491e() : m42492f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX INFO: renamed from: e */
    public final float m42491e() throws Throwable {
        Process process = null;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec("top -n 1");
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    int i11 = -1;
                    while (true) {
                        ?? line = bufferedReader.readLine();
                        objectRef.element = line;
                        if (line == 0) {
                            processExec.destroy();
                            return 0.0f;
                        }
                        T string = line == 0 ? 0 : StringsKt.trim((CharSequence) line).toString();
                        objectRef.element = string;
                        if (!TextUtils.isEmpty((CharSequence) string)) {
                            T t11 = objectRef.element;
                            Intrinsics.checkNotNull(t11);
                            int iM42489c = m42489c((String) t11);
                            if (iM42489c != -1) {
                                i11 = iM42489c;
                            } else {
                                T t12 = objectRef.element;
                                Intrinsics.checkNotNull(t12);
                                if (StringsKt.startsWith$default((String) t12, String.valueOf(this.pid), false, 2, (Object) null) && i11 != -1) {
                                    T t13 = objectRef.element;
                                    Intrinsics.checkNotNull(t13);
                                    Object[] array = new Regex("\\s+").split((CharSequence) t13, 0).toArray(new String[0]);
                                    if (array == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                    }
                                    String[] strArr = (String[]) array;
                                    if (strArr.length > i11) {
                                        String strSubstring = strArr[i11];
                                        if (StringsKt.endsWith$default(strSubstring, "%", false, 2, (Object) null)) {
                                            strSubstring = strSubstring.substring(0, StringsKt.lastIndexOf$default((CharSequence) strSubstring, "%", 0, false, 6, (Object) null));
                                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        float f11 = Float.parseFloat(strSubstring) / Runtime.getRuntime().availableProcessors();
                                        processExec.destroy();
                                        return f11;
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    process = processExec;
                    C44128b.m97266j("MetricsManager", Intrinsics.stringPlus("getCpuUsageForHigherVersion ", e.getMessage()));
                    if (process == null) {
                        return 0.0f;
                    }
                    process.destroy();
                    return 0.0f;
                } catch (Throwable th2) {
                    th = th2;
                    process = processExec;
                    if (process != null) {
                        process.destroy();
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final float m42492f() {
        try {
            RandomAccessFile randomAccessFile = this.mProcessFile;
            if (randomAccessFile == null || this.mProcessAppFile == null) {
                this.mProcessFile = new RandomAccessFile("/proc/stat", "r");
                this.mProcessAppFile = new RandomAccessFile("/proc/" + this.pid + "/stat", "r");
            } else {
                Intrinsics.checkNotNull(randomAccessFile);
                randomAccessFile.seek(0L);
                RandomAccessFile randomAccessFile2 = this.mProcessAppFile;
                Intrinsics.checkNotNull(randomAccessFile2);
                randomAccessFile2.seek(0L);
            }
            RandomAccessFile randomAccessFile3 = this.mProcessFile;
            Intrinsics.checkNotNull(randomAccessFile3);
            String procStatString = randomAccessFile3.readLine();
            RandomAccessFile randomAccessFile4 = this.mProcessAppFile;
            Intrinsics.checkNotNull(randomAccessFile4);
            String appStatString = randomAccessFile4.readLine();
            Intrinsics.checkNotNullExpressionValue(procStatString, "procStatString");
            Object[] array = new Regex(C33627eb.f69716f).split(procStatString, 0).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            Intrinsics.checkNotNullExpressionValue(appStatString, "appStatString");
            Object[] array2 = new Regex(C33627eb.f69716f).split(appStatString, 0).toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr2 = (String[]) array2;
            long j11 = Long.parseLong(strArr[2]) + Long.parseLong(strArr[3]) + Long.parseLong(strArr[4]) + Long.parseLong(strArr[5]) + Long.parseLong(strArr[6]) + Long.parseLong(strArr[7]) + Long.parseLong(strArr[8]);
            long j12 = Long.parseLong(strArr2[13]) + Long.parseLong(strArr2[14]);
            if (this.mLastCpuTime == null && this.mLastAppCpuTime == null) {
                this.mLastCpuTime = Long.valueOf(j11);
                this.mLastAppCpuTime = Long.valueOf(j12);
                return 0.0f;
            }
            Long l11 = this.mLastAppCpuTime;
            Intrinsics.checkNotNull(l11);
            float fLongValue = j12 - l11.longValue();
            Long l12 = this.mLastCpuTime;
            Intrinsics.checkNotNull(l12);
            float fLongValue2 = (fLongValue / (j11 - l12.longValue())) * 100.0f;
            this.mLastCpuTime = Long.valueOf(j11);
            this.mLastAppCpuTime = Long.valueOf(j12);
            return fLongValue2;
        } catch (Exception e11) {
            C44128b.m97266j("MetricsManager", Intrinsics.stringPlus("getCpuUsageForLowerVersion ", e11.getMessage()));
            return 0.0f;
        }
    }
}
