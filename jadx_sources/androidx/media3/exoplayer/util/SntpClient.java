package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class SntpClient {
    public static final String DEFAULT_NTP_HOST = "time.android.com";
    public static final int DEFAULT_TIMEOUT_MS = 1000;
    private static final int MAX_RETRY_COUNT = 10;
    private static final int NTP_LEAP_NOSYNC = 3;
    private static final int NTP_MODE_BROADCAST = 5;
    private static final int NTP_MODE_CLIENT = 3;
    private static final int NTP_MODE_SERVER = 4;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_STRATUM_DEATH = 0;
    private static final int NTP_STRATUM_MAX = 15;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    private static final int ORIGINATE_TIME_OFFSET = 24;
    private static final int RECEIVE_TIME_OFFSET = 32;
    private static final int TRANSMIT_TIME_OFFSET = 40;

    @GuardedBy("valueLock")
    private static long elapsedRealtimeOffsetMs = 0;

    @GuardedBy("valueLock")
    private static boolean isInitialized = false;

    @GuardedBy("valueLock")
    private static long lastUpdateElapsedRealtime = -9223372036854775807L;

    @GuardedBy("valueLock")
    private static long maxElapsedTimeUntilUpdateMs = -9223372036854775807L;

    @GuardedBy("valueLock")
    private static String ntpHost = "time.android.com";

    @GuardedBy("valueLock")
    private static int timeoutMs = 1000;
    private static final Object loaderLock = new Object();
    private static final Object valueLock = new Object();

    public interface InitializationCallback {
        void onInitializationFailed(IOException iOException);

        void onInitialized();
    }

    public static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {

        @Nullable
        private final InitializationCallback callback;

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(Loader.Loadable loadable, long j11, long j12) {
            if (this.callback != null) {
                if (SntpClient.isInitialized()) {
                    this.callback.onInitialized();
                } else {
                    this.callback.onInitializationFailed(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(Loader.Loadable loadable, long j11, long j12, IOException iOException, int i11) {
            InitializationCallback initializationCallback = this.callback;
            if (initializationCallback != null) {
                initializationCallback.onInitializationFailed(iOException);
            }
            return Loader.DONT_RETRY;
        }

        public NtpTimeCallback(@Nullable InitializationCallback initializationCallback) {
            this.callback = initializationCallback;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(Loader.Loadable loadable, long j11, long j12, boolean z11) {
        }
    }

    private static void checkValidServerReply(byte b11, byte b12, int i11, long j11) throws IOException {
        if (b11 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b12 != 4 && b12 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b12));
        }
        if (i11 != 0 && i11 <= 15) {
            if (j11 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i11);
        }
    }

    public static final class NtpTimeLoadable implements Loader.Loadable {
        private NtpTimeLoadable() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void load() throws IOException {
            synchronized (SntpClient.loaderLock) {
                synchronized (SntpClient.valueLock) {
                    if (!SntpClient.isInitialized) {
                        long jLoadNtpTimeOffsetMs = SntpClient.loadNtpTimeOffsetMs();
                        synchronized (SntpClient.valueLock) {
                            long unused = SntpClient.lastUpdateElapsedRealtime = SystemClock.elapsedRealtime();
                            long unused2 = SntpClient.elapsedRealtimeOffsetMs = jLoadNtpTimeOffsetMs;
                            boolean unused3 = SntpClient.isInitialized = true;
                        }
                    }
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        public void cancelLoad() {
        }
    }

    public static long getElapsedRealtimeOffsetMs() {
        long j11;
        synchronized (valueLock) {
            try {
                j11 = isInitialized ? elapsedRealtimeOffsetMs : C2711C.TIME_UNSET;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }

    public static long getMaxElapsedTimeUntilUpdateMs() {
        long j11;
        synchronized (valueLock) {
            j11 = maxElapsedTimeUntilUpdateMs;
        }
        return j11;
    }

    public static String getNtpHost() {
        String str;
        synchronized (valueLock) {
            str = ntpHost;
        }
        return str;
    }

    public static int getTimeoutMs() {
        int i11;
        synchronized (valueLock) {
            i11 = timeoutMs;
        }
        return i11;
    }

    public static boolean isInitialized() {
        boolean z11;
        synchronized (valueLock) {
            try {
                if (lastUpdateElapsedRealtime != C2711C.TIME_UNSET && maxElapsedTimeUntilUpdateMs != C2711C.TIME_UNSET) {
                    isInitialized = isInitialized && SystemClock.elapsedRealtime() - lastUpdateElapsedRealtime < maxElapsedTimeUntilUpdateMs;
                }
                z11 = isInitialized;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long loadNtpTimeOffsetMs() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(getTimeoutMs());
            InetAddress[] allByName = InetAddress.getAllByName(getNtpHost());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i11], 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                writeTimestamp(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j11 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b11 = bArr[0];
                    int i13 = bArr[1] & 255;
                    long timestamp = readTimestamp(bArr, 24);
                    long timestamp2 = readTimestamp(bArr, 32);
                    long timestamp3 = readTimestamp(bArr, 40);
                    checkValidServerReply((byte) ((b11 >> 6) & 3), (byte) (b11 & 7), i13, timestamp3);
                    long j12 = (j11 + (((timestamp2 - timestamp) + (timestamp3 - j11)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j12;
                } catch (SocketTimeoutException e11) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e11;
                    } else {
                        socketTimeoutException.addSuppressed(e11);
                    }
                    int i14 = i12 + 1;
                    if (i12 >= 10) {
                        throw ((SocketTimeoutException) Assertions.checkNotNull(socketTimeoutException));
                    }
                    i11++;
                    i12 = i14;
                }
            }
            throw ((SocketTimeoutException) Assertions.checkNotNull(socketTimeoutException));
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    private static long read32(byte[] bArr, int i11) {
        int i12 = bArr[i11];
        int i13 = bArr[i11 + 1];
        int i14 = bArr[i11 + 2];
        int i15 = bArr[i11 + 3];
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        if ((i15 & 128) == 128) {
            i15 = (i15 & 127) + 128;
        }
        return (((long) i12) << 24) + (((long) i13) << 16) + (((long) i14) << 8) + ((long) i15);
    }

    public static void setMaxElapsedTimeUntilUpdateMs(long j11) {
        synchronized (valueLock) {
            maxElapsedTimeUntilUpdateMs = j11;
        }
    }

    public static void setNtpHost(String str) {
        synchronized (valueLock) {
            try {
                if (!ntpHost.equals(str)) {
                    ntpHost = str;
                    isInitialized = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setTimeoutMs(int i11) {
        synchronized (valueLock) {
            try {
                if (timeoutMs != i11) {
                    timeoutMs = i11;
                    isInitialized = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void writeTimestamp(byte[] bArr, int i11, long j11) {
        if (j11 == 0) {
            Arrays.fill(bArr, i11, i11 + 8, (byte) 0);
            return;
        }
        long j12 = j11 / 1000;
        long j13 = j11 - (j12 * 1000);
        long j14 = j12 + OFFSET_1900_TO_1970;
        bArr[i11] = (byte) (j14 >> 24);
        bArr[i11 + 1] = (byte) (j14 >> 16);
        bArr[i11 + 2] = (byte) (j14 >> 8);
        bArr[i11 + 3] = (byte) j14;
        long j15 = (j13 * 4294967296L) / 1000;
        bArr[i11 + 4] = (byte) (j15 >> 24);
        bArr[i11 + 5] = (byte) (j15 >> 16);
        bArr[i11 + 6] = (byte) (j15 >> 8);
        bArr[i11 + 7] = (byte) (Math.random() * 255.0d);
    }

    private SntpClient() {
    }

    public static void initialize(@Nullable Loader loader, @Nullable InitializationCallback initializationCallback) {
        if (isInitialized()) {
            if (initializationCallback != null) {
                initializationCallback.onInitialized();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.startLoading(new NtpTimeLoadable(), new NtpTimeCallback(initializationCallback), 1);
        }
    }

    private static long readTimestamp(byte[] bArr, int i11) {
        long j11 = read32(bArr, i11);
        long j12 = read32(bArr, i11 + 4);
        if (j11 == 0 && j12 == 0) {
            return 0L;
        }
        return ((j11 - OFFSET_1900_TO_1970) * 1000) + ((j12 * 1000) / 4294967296L);
    }
}
