package uf0;

import java.util.logging.Level;
import java.util.logging.Logger;
import tf0.C44940a;
import vf0.AbstractC45525b;

/* JADX INFO: renamed from: uf0.t */
/* JADX INFO: compiled from: Tracing.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45231t {

    /* JADX INFO: renamed from: a */
    public static final Logger f101765a = Logger.getLogger(C45231t.class.getName());

    /* JADX INFO: renamed from: b */
    public static final AbstractC45226o f101766b = m99945c(AbstractC45226o.class.getClassLoader());

    /* JADX INFO: renamed from: a */
    public static AbstractC45525b m99943a() {
        return f101766b.mo99923a();
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC45229r m99944b() {
        return f101766b.mo99924b();
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC45226o m99945c(ClassLoader classLoader) {
        try {
            return (AbstractC45226o) C44940a.m99387a(Class.forName("io.opentelemetry.opencensusshim.OpenTelemetryTraceComponentImpl", true, classLoader), AbstractC45226o.class);
        } catch (ClassNotFoundException e11) {
            f101765a.log(Level.FINE, "Couldn't load full implementation for OpenTelemetry TraceComponent, now trying to load original implementation.", (Throwable) e11);
            try {
                return (AbstractC45226o) C44940a.m99387a(Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, classLoader), AbstractC45226o.class);
            } catch (ClassNotFoundException e12) {
                f101765a.log(Level.FINE, "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", (Throwable) e12);
                try {
                    return (AbstractC45226o) C44940a.m99387a(Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, classLoader), AbstractC45226o.class);
                } catch (ClassNotFoundException e13) {
                    f101765a.log(Level.FINE, "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", (Throwable) e13);
                    return AbstractC45226o.m99922c();
                }
            }
        }
    }
}
