package yf0;

import io.opencensus.trace.Span;
import java.util.logging.Level;
import java.util.logging.Logger;
import tf0.C44940a;
import uf0.InterfaceC45219h;
import uf0.InterfaceC45220i;

/* JADX INFO: renamed from: yf0.b */
/* JADX INFO: compiled from: ContextHandleUtils.java */
/* JADX INFO: loaded from: classes60.dex */
public class C46487b {

    /* JADX INFO: renamed from: a */
    public static final Logger f104248a = Logger.getLogger(C46487b.class.getName());

    /* JADX INFO: renamed from: b */
    public static final InterfaceC45220i f104249b = m102559c(InterfaceC45220i.class.getClassLoader());

    /* JADX INFO: renamed from: a */
    public static InterfaceC45219h m102557a() {
        return f104249b.mo99907b();
    }

    /* JADX INFO: renamed from: b */
    public static Span m102558b(InterfaceC45219h interfaceC45219h) {
        return f104249b.mo99906a(interfaceC45219h);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC45220i m102559c(ClassLoader classLoader) {
        try {
            return (InterfaceC45220i) C44940a.m99387a(Class.forName("io.opentelemetry.opencensusshim.OpenTelemetryContextManager", true, classLoader), InterfaceC45220i.class);
        } catch (ClassNotFoundException e11) {
            f104248a.log(Level.FINE, "Couldn't load full implementation for OpenTelemetry context manager, now loading original implementation.", (Throwable) e11);
            return new C46488c();
        }
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC45219h m102560d(InterfaceC45219h interfaceC45219h, Span span) {
        return f104249b.mo99908c(interfaceC45219h, span);
    }
}
