package com.tencent.imsdk.common;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.imsdk.manager.BaseManager;
import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes59.dex */
public class CpuUsageMeasurer {
    private static final String TAG = "CpuUsageMeasurer";
    private static final long UPDATE_INTERVAL = TimeUnit.SECONDS.toMillis(2);
    private RandomAccessFile mProcessStatFile;
    private RandomAccessFile mSystemStatFile;
    private long mLastUpdateTime = 0;
    private float mLastAppCpuTimeUsed = 0.0f;
    private float mLastAppCpuUsage = 0.0f;
    private long mTotalCpuTime = 0;
    private long mIdleCpuTime = 0;
    private float mLastSysCpuUsage = 0.0f;
    private final long mClockClkInHz = BaseManager.getInstance().getClockTickInHz();
    private final int mProcessorCount = Runtime.getRuntime().availableProcessors();

    private static String[] readFirstLineAndSplit(RandomAccessFile randomAccessFile) {
        String line;
        if (randomAccessFile == null) {
            return null;
        }
        try {
            randomAccessFile.seek(0L);
            line = randomAccessFile.readLine();
        } catch (IOException e11) {
            IMLog.m75914e(TAG, "read line failed. " + e11.getMessage());
            line = null;
        }
        if (TextUtils.isEmpty(line)) {
            return null;
        }
        return line.split("\\s+");
    }

    public int[] getCpuUsage() {
        int[] iArr;
        synchronized (this) {
            try {
                if (BaseManager.getInstance().getTimeTick() - this.mLastUpdateTime >= UPDATE_INTERVAL) {
                    updateCpuUsage();
                }
                iArr = new int[]{(int) (this.mLastAppCpuUsage * 10.0f), (int) (this.mLastSysCpuUsage * 10.0f)};
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iArr;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void updateCpuUsage() {
        long timeTick;
        long j11;
        String[] firstLineAndSplit = readFirstLineAndSplit(this.mProcessStatFile);
        if (firstLineAndSplit == null || firstLineAndSplit.length < 52) {
            return;
        }
        long j12 = (long) (((((Long.parseLong(firstLineAndSplit[13]) + Long.parseLong(firstLineAndSplit[14])) + Long.parseLong(firstLineAndSplit[15])) + Long.parseLong(firstLineAndSplit[16])) * 1000.0f) / this.mClockClkInHz);
        String[] firstLineAndSplit2 = readFirstLineAndSplit(this.mSystemStatFile);
        if (firstLineAndSplit2 == null || firstLineAndSplit2.length < 8) {
            timeTick = BaseManager.getInstance().getTimeTick() * ((long) this.mProcessorCount);
            j11 = timeTick;
        } else {
            long j13 = Long.parseLong(firstLineAndSplit2[1]) + Long.parseLong(firstLineAndSplit2[2]) + Long.parseLong(firstLineAndSplit2[3]) + Long.parseLong(firstLineAndSplit2[4]) + Long.parseLong(firstLineAndSplit2[5]) + Long.parseLong(firstLineAndSplit2[6]) + Long.parseLong(firstLineAndSplit2[7]);
            long j14 = Long.parseLong(firstLineAndSplit2[4]) + Long.parseLong(firstLineAndSplit2[5]);
            float f11 = j13 * 1000.0f;
            long j15 = this.mClockClkInHz;
            timeTick = (long) (f11 / j15);
            j11 = (long) ((j14 * 1000.0f) / j15);
        }
        long j16 = timeTick - this.mTotalCpuTime;
        float f12 = j12;
        float f13 = j16;
        this.mLastAppCpuUsage = ((f12 - this.mLastAppCpuTimeUsed) * 100.0f) / f13;
        this.mLastSysCpuUsage = ((j16 - (j11 - this.mIdleCpuTime)) * 100.0f) / f13;
        this.mLastAppCpuTimeUsed = f12;
        this.mIdleCpuTime = j11;
        this.mTotalCpuTime = timeTick;
        this.mLastUpdateTime = BaseManager.getInstance().getTimeTick();
    }

    public CpuUsageMeasurer() {
        try {
            this.mProcessStatFile = new RandomAccessFile(String.format(Locale.ENGLISH, "/proc/%d/stat", Integer.valueOf(Process.myPid())), "r");
        } catch (IOException e11) {
            IMLog.m75914e(TAG, "open /proc/[PID]/stat failed. " + e11.getMessage());
        }
        try {
            this.mSystemStatFile = new RandomAccessFile("/proc/stat", "r");
        } catch (IOException unused) {
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        closeQuietly(this.mProcessStatFile);
        closeQuietly(this.mSystemStatFile);
        IMLog.m75915i(TAG, "measurer is released");
    }
}
