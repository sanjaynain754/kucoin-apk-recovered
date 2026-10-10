package jumio.core;

import com.jumio.core.api.BackendManager;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: jumio.core.i */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C40672i extends FunctionReferenceImpl implements Function0 {
    public C40672i(BackendManager backendManager) {
        super(0, backendManager, BackendManager.class, "determineKeyPinning", "determineKeyPinning()Z", 0);
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(BackendManager.access$determineKeyPinning((BackendManager) this.receiver));
    }
}
