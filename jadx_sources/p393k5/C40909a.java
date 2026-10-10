package p393k5;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;

/* JADX INFO: renamed from: k5.a */
/* JADX INFO: compiled from: HermesExecutorFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40909a implements JavaScriptExecutorFactory {

    /* JADX INFO: renamed from: a */
    public boolean f90982a;

    /* JADX INFO: renamed from: b */
    public String f90983b;

    public C40909a() {
        this(null);
    }

    public C40909a(C40910b c40910b) {
        this.f90982a = true;
        this.f90983b = "";
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        return new HermesExecutor(null, this.f90982a, this.f90983b);
    }

    public String toString() {
        return "JSIExecutor+HermesRuntime";
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        HermesSamplingProfiler.dumpSampledTraceToFile(str);
        HermesSamplingProfiler.disable();
    }
}
