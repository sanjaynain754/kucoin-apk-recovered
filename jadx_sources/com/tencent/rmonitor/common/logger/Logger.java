package com.tencent.rmonitor.common.logger;

import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.jumio.commons.log.LogUtils;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.bugly.proguard.C33536a4;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u00013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0016¢\u0006\u0002\u0010$J!\u0010%\u001a\u00020!2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0016¢\u0006\u0002\u0010$J$\u0010&\u001a\u00020!2\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010(\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010*J\u001a\u0010&\u001a\u00020!2\b\u0010'\u001a\u0004\u0018\u00010\u00062\b\u0010)\u001a\u0004\u0018\u00010*J\u0010\u0010+\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010*J!\u0010,\u001a\u00020!2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0016¢\u0006\u0002\u0010$J)\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u00102\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0002¢\u0006\u0002\u0010/J\u000e\u00100\u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\nJ!\u00101\u001a\u00020!2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0016¢\u0006\u0002\u0010$J!\u00102\u001a\u00020!2\u0012\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060#\"\u00020\u0006H\u0016¢\u0006\u0002\u0010$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/tencent/rmonitor/common/logger/Logger;", "Lcom/tencent/rmonitor/common/logger/ILoger;", "()V", "DEFAULT_PROXY", "Lcom/tencent/rmonitor/common/logger/ILogProxy;", "TAG", "", "debug", "", "intLevel", "", "getIntLevel", "()I", "setIntLevel", "(I)V", FirebaseAnalytics.Param.LEVEL, "Lcom/tencent/rmonitor/common/logger/LogState;", "logLevel", "getLogLevel", "()Lcom/tencent/rmonitor/common/logger/LogState;", "setLogLevel", "(Lcom/tencent/rmonitor/common/logger/LogState;)V", "value", "logProxy", "getLogProxy", "()Lcom/tencent/rmonitor/common/logger/ILogProxy;", "setLogProxy", "(Lcom/tencent/rmonitor/common/logger/ILogProxy;)V", "logTimeFormatter", "Ljava/lang/ThreadLocal;", "Ljava/text/SimpleDateFormat;", "verbos", "d", "", "args", "", "([Ljava/lang/String;)V", "e", "exception", "tag", "msg", "throwable", "", "getThrowableMessage", "i", "logInner", "logState", "(Lcom/tencent/rmonitor/common/logger/LogState;[Ljava/lang/String;)V", "resetLogLevel", "v", "w", "DefaultLogProxy", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class Logger implements ILoger {

    @NotNull
    private static final ILogProxy DEFAULT_PROXY;

    @NotNull
    public static final Logger INSTANCE = new Logger();

    @NotNull
    private static final String TAG = "RMonitor_common_Logger";

    @JvmField
    public static boolean debug;
    private static int intLevel;

    @NotNull
    private static LogState logLevel;

    @Nullable
    private static ILogProxy logProxy;

    @NotNull
    private static ThreadLocal<SimpleDateFormat> logTimeFormatter;

    @JvmField
    public static boolean verbos;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0018\"\u00020\rH\u0016¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J \u0010\u001e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\rH\u0002J\b\u0010!\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/tencent/rmonitor/common/logger/Logger$DefaultLogProxy;", "Lcom/tencent/rmonitor/common/logger/ILogProxy;", "()V", "flushing", "", "lastTimeMillis", "", "logFile", "Ljava/io/File;", "logQueueSize", "", "readQueue", "Ljava/util/concurrent/BlockingQueue;", "", "sb", "Ljava/lang/StringBuffer;", "workQueue1", "workQueue2", "writerQueue", "doLog", "", "state", "Lcom/tencent/rmonitor/common/logger/LogState;", "args", "", "(Lcom/tencent/rmonitor/common/logger/LogState;[Ljava/lang/String;)V", "flush", "logInfo", "preWriteLogFile", "swapQueue", "switchState", "tag", "msg", "writeLogFile", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class DefaultLogProxy implements ILogProxy {
        private volatile boolean flushing;
        private long lastTimeMillis;

        @Nullable
        private File logFile;

        @NotNull
        private BlockingQueue<String> readQueue;

        @NotNull
        private final BlockingQueue<String> workQueue1;

        @NotNull
        private final BlockingQueue<String> workQueue2;

        @NotNull
        private BlockingQueue<String> writerQueue;
        private final int logQueueSize = 1024;

        @NotNull
        private final StringBuffer sb = new StringBuffer(2048);

        private final void swapQueue() {
            synchronized (this) {
                try {
                    BlockingQueue<String> blockingQueue = this.workQueue1;
                    if (blockingQueue == this.writerQueue) {
                        this.writerQueue = this.workQueue2;
                        this.readQueue = blockingQueue;
                    } else {
                        this.writerQueue = blockingQueue;
                        this.readQueue = this.workQueue2;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: compiled from: BUGLY */
        @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LogState.values().length];
                iArr[LogState.VERBOS.ordinal()] = 1;
                iArr[LogState.DEBUG.ordinal()] = 2;
                iArr[LogState.INFO.ordinal()] = 3;
                iArr[LogState.WARN.ordinal()] = 4;
                iArr[LogState.ERROR.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private final boolean preWriteLogFile() {
            if (this.flushing) {
                return false;
            }
            try {
                String externalStorageState = Environment.getExternalStorageState();
                if (Intrinsics.areEqual(externalStorageState, "mounted")) {
                    return true;
                }
                Intrinsics.areEqual(externalStorageState, "mounted_ro");
            } catch (Exception e11) {
                String message = e11.getMessage();
                if (message == null) {
                    message = "";
                }
                Log.e(Logger.TAG, message);
            }
            this.writerQueue.clear();
            Log.e(Logger.TAG, "sdcard could not write");
            return false;
        }

        private final String switchState(LogState state, String tag, String msg) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i11 == 1) {
                Log.v(tag, msg);
                return "    VERBOS/";
            }
            if (i11 == 2) {
                Log.d(tag, msg);
                return "    DEBUG/";
            }
            if (i11 == 3) {
                Log.i(tag, msg);
                return "    INFO/";
            }
            if (i11 == 4) {
                Log.w(tag, msg);
                return "    WARN/";
            }
            if (i11 != 5) {
                return "";
            }
            Log.e(tag, msg);
            return "    ERROR/";
        }

        private final void writeLogFile() {
            new Handler(ThreadManager.INSTANCE.getLogAndErrorThreadLooper()).post(new Runnable() { // from class: ec0.a
                @Override // java.lang.Runnable
                public final void run() {
                    Logger.DefaultLogProxy.m103828writeLogFile$lambda6(this.f82405b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: writeLogFile$lambda-6, reason: not valid java name */
        public static final void m103828writeLogFile$lambda6(DefaultLogProxy this$0) {
            String strPoll;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            synchronized (this$0) {
                try {
                    if (this$0.preWriteLogFile()) {
                        File file = new File(FileUtil.INSTANCE.getRootPath() + "/Log");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        this$0.flushing = true;
                        do {
                            strPoll = this$0.writerQueue.poll();
                            if (strPoll != null) {
                                this$0.sb.append(strPoll + LogUtils.NEW_LINE);
                            }
                        } while (strPoll != null);
                        if (this$0.sb.length() > 0) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - this$0.lastTimeMillis > C33536a4.f68797g) {
                                this$0.logFile = new File(file, "Bugly_" + new SimpleDateFormat("MM.dd.HH", Locale.US).format(Long.valueOf(jCurrentTimeMillis)) + ".log");
                            }
                            try {
                                File file2 = this$0.logFile;
                                if (file2 != null) {
                                    if (!file2.exists()) {
                                        file2.createNewFile();
                                    }
                                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2, true));
                                    try {
                                        bufferedWriter.write(this$0.sb.toString());
                                        bufferedWriter.flush();
                                        Unit unit = Unit.INSTANCE;
                                        CloseableKt.closeFinally(bufferedWriter, null);
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            CloseableKt.closeFinally(bufferedWriter, th2);
                                            throw th3;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                Log.e(Logger.TAG, Logger.INSTANCE.getThrowableMessage(th4));
                            }
                            this$0.lastTimeMillis = jCurrentTimeMillis;
                        }
                        StringBuffer stringBuffer = this$0.sb;
                        stringBuffer.delete(0, stringBuffer.length());
                        this$0.flushing = false;
                        Unit unit2 = Unit.INSTANCE;
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
        }

        @Override // com.tencent.rmonitor.common.logger.ILogProxy
        public void doLog(@NotNull LogState state, @NotNull String... args) {
            String str;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(args, "args");
            if (Logger.INSTANCE.getLogLevel().compareTo(state) < 0 || args.length == 0 || (str = args[0]) == null) {
                return;
            }
            if (args.length <= 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(256);
            int length = args.length;
            for (int i11 = 1; i11 < length; i11++) {
                sb2.append(args[i11]);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "logS.toString()");
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) Logger.logTimeFormatter.get();
            String str2 = simpleDateFormat != null ? simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())) : null;
            String strSwitchState = switchState(state, str, string);
            sb2.delete(0, sb2.length());
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            sb2.append(strSwitchState);
            sb2.append(str);
            sb2.append(":    ");
            sb2.append(string);
            try {
                String string2 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "logS.toString()");
                flush(string2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        @Override // com.tencent.rmonitor.common.logger.ILogProxy
        public void flush(@NotNull String logInfo) {
            Intrinsics.checkNotNullParameter(logInfo, "logInfo");
            if (this.readQueue.offer(logInfo)) {
                return;
            }
            swapQueue();
            this.readQueue.offer(logInfo);
            synchronized (this) {
                writeLogFile();
                Unit unit = Unit.INSTANCE;
            }
        }

        public DefaultLogProxy() {
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1024);
            this.workQueue1 = linkedBlockingQueue;
            LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue(1024);
            this.workQueue2 = linkedBlockingQueue2;
            this.readQueue = linkedBlockingQueue;
            this.writerQueue = linkedBlockingQueue2;
        }
    }

    public final void exception(@Nullable String tag, @Nullable Throwable throwable) {
        if (tag == null || throwable == null) {
            return;
        }
        mo77131e(tag, getThrowableMessage(throwable));
    }

    static {
        DefaultLogProxy defaultLogProxy = new DefaultLogProxy();
        DEFAULT_PROXY = defaultLogProxy;
        logTimeFormatter = new ThreadLocal<SimpleDateFormat>() { // from class: com.tencent.rmonitor.common.logger.Logger$logTimeFormatter$1
            @Override // java.lang.ThreadLocal
            @NotNull
            public SimpleDateFormat initialValue() {
                return new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
            }
        };
        LogState logState = LogState.WARN;
        intLevel = logState.getValue();
        logLevel = logState;
        logProxy = defaultLogProxy;
    }

    private final void logInner(LogState logState, String... args) {
        ILogProxy logProxy2;
        if (logLevel.compareTo(logState) < 0 || (logProxy2 = getLogProxy()) == null) {
            return;
        }
        logProxy2.doLog(logState, (String[]) Arrays.copyOf(args, args.length));
    }

    @Override // com.tencent.rmonitor.common.logger.ILoger
    /* JADX INFO: renamed from: d */
    public void mo77130d(@NotNull String... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        logInner(LogState.DEBUG, (String[]) Arrays.copyOf(args, args.length));
    }

    @Override // com.tencent.rmonitor.common.logger.ILoger
    /* JADX INFO: renamed from: e */
    public void mo77131e(@NotNull String... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        logInner(LogState.ERROR, (String[]) Arrays.copyOf(args, args.length));
    }

    public final void exception(@Nullable String tag, @Nullable String msg, @Nullable Throwable throwable) {
        if (tag == null || throwable == null) {
            return;
        }
        if (msg == null) {
            msg = "";
        }
        mo77131e(tag, msg, getThrowableMessage(throwable));
    }

    public final int getIntLevel() {
        return intLevel;
    }

    @NotNull
    public final LogState getLogLevel() {
        return logLevel;
    }

    @Nullable
    public final ILogProxy getLogProxy() {
        ILogProxy iLogProxy = logProxy;
        return iLogProxy == null ? DEFAULT_PROXY : iLogProxy;
    }

    @NotNull
    public final String getThrowableMessage(@Nullable Throwable throwable) {
        if (throwable == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sw.toString()");
        return string;
    }

    @Override // com.tencent.rmonitor.common.logger.ILoger
    /* JADX INFO: renamed from: i */
    public void mo77132i(@NotNull String... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        logInner(LogState.INFO, (String[]) Arrays.copyOf(args, args.length));
    }

    public final void resetLogLevel(int level) {
        LogState byValue = LogState.INSTANCE.getByValue(level);
        if (byValue == null) {
            byValue = LogState.OFF;
        }
        setLogLevel(byValue);
    }

    public final void setIntLevel(int i11) {
        intLevel = i11;
    }

    public final void setLogLevel(@NotNull LogState level) {
        Intrinsics.checkNotNullParameter(level, "level");
        logLevel = level;
        int value = level.getValue();
        intLevel = value;
        debug = value >= LogState.DEBUG.getValue();
        verbos = intLevel >= LogState.VERBOS.getValue();
    }

    public final void setLogProxy(@Nullable ILogProxy iLogProxy) {
        synchronized (INSTANCE.getClass()) {
            logProxy = iLogProxy;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.tencent.rmonitor.common.logger.ILoger
    /* JADX INFO: renamed from: v */
    public void mo77133v(@NotNull String... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        logInner(LogState.VERBOS, (String[]) Arrays.copyOf(args, args.length));
    }

    @Override // com.tencent.rmonitor.common.logger.ILoger
    /* JADX INFO: renamed from: w */
    public void mo77134w(@NotNull String... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        logInner(LogState.WARN, (String[]) Arrays.copyOf(args, args.length));
    }

    private Logger() {
    }
}
