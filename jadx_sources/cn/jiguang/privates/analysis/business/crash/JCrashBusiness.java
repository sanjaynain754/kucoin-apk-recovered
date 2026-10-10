package cn.jiguang.privates.analysis.business.crash;

import android.content.Context;
import cn.jiguang.privates.analysis.api.Event;
import cn.jiguang.privates.analysis.business.event.JEventBusiness;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.tencent.bugly.proguard.C33812n7;
import com.tencent.bugly.proguard.C33844oi;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes34.dex */
public class JCrashBusiness implements Thread.UncaughtExceptionHandler {
    private static final String TAG = "JCrashBusiness";
    private static volatile JCrashBusiness instance;
    private Thread.UncaughtExceptionHandler defaultCrashHandler = null;
    private boolean isCrashEnable = false;
    private Context context = null;

    public static JCrashBusiness getInstance() {
        if (instance == null) {
            synchronized (JCrashBusiness.class) {
                instance = new JCrashBusiness();
            }
        }
        return instance;
    }

    private String getThrowableStackTrace(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void startCrashHandler(Context context) {
        this.context = context;
        this.isCrashEnable = true;
        if (this.defaultCrashHandler == null) {
            this.defaultCrashHandler = Thread.getDefaultUncaughtExceptionHandler();
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public void stopCrashHandler(Context context) {
        this.context = context;
        this.isCrashEnable = false;
        this.defaultCrashHandler = null;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        if (this.context == null) {
            return;
        }
        if (this.isCrashEnable) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String throwableStackTrace = getThrowableStackTrace(th2);
            String throwableMessage = getThrowableMessage(th2);
            Event event = new Event(JAnalysisConstants.TYPE_CRASH);
            event.putExtraAttr("crashtime", Long.valueOf(jCurrentTimeMillis));
            event.putExtraAttr(C33812n7.f71061t, throwableStackTrace);
            event.putExtraAttr("message", throwableMessage);
            JEventBusiness.getInstance().onEvent(this.context, event);
            try {
                Thread.sleep(200L);
            } catch (Exception unused) {
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.defaultCrashHandler;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }

    private String getThrowableMessage(Throwable th2) {
        String string = th2.toString();
        try {
            String[] strArrSplit = string.split(C33844oi.f71346o);
            if (strArrSplit.length > 1) {
                for (int length = strArrSplit.length - 1; length >= 0; length--) {
                    if (!strArrSplit[length].endsWith("Exception") && !strArrSplit[length].endsWith("Error")) {
                    }
                    return strArrSplit[length];
                }
                return string;
            }
            return string;
        } catch (NullPointerException | PatternSyntaxException unused) {
            return string;
        }
    }

    public void init(Context context) {
        startCrashHandler(context);
    }
}
