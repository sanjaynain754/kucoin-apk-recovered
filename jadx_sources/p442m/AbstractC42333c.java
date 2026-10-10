package p442m;

import androidx.annotation.NonNull;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: m.c */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC42333c {

    /* JADX INFO: renamed from: a */
    public static Thread.UncaughtExceptionHandler f93847a;

    /* JADX INFO: renamed from: m.c$a */
    public class a implements Thread.UncaughtExceptionHandler {
        public a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th2.printStackTrace(printWriter);
            String string = stringWriter.toString();
            printWriter.close();
            AbstractC42333c.this.mo83483d(string);
            if (AbstractC42333c.f93847a != null) {
                AbstractC42333c.f93847a.uncaughtException(thread, th2);
            }
            AbstractC42333c.this.m92891b();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo83483d(String str);

    /* JADX INFO: renamed from: e */
    public void m92893e() {
        Thread.setDefaultUncaughtExceptionHandler(f93847a);
    }

    /* JADX INFO: renamed from: c */
    public void m92892c() {
        f93847a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new a());
    }

    /* JADX INFO: renamed from: b */
    public void m92891b() {
    }
}
