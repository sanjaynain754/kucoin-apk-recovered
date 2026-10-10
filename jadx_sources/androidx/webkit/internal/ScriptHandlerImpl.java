package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.ScriptHandler;
import eh0.C37184a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: loaded from: classes34.dex */
public class ScriptHandlerImpl implements ScriptHandler {
    private final ScriptHandlerBoundaryInterface mBoundaryInterface;

    @NonNull
    public static ScriptHandlerImpl toScriptHandler(@NonNull InvocationHandler invocationHandler) {
        return new ScriptHandlerImpl((ScriptHandlerBoundaryInterface) C37184a.m83171a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    @Override // androidx.webkit.ScriptHandler
    public void remove() {
        this.mBoundaryInterface.remove();
    }

    private ScriptHandlerImpl(@NonNull ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.mBoundaryInterface = scriptHandlerBoundaryInterface;
    }
}
