package wb0;

import androidx.annotation.OptIn;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.annotations.FrameworkAPI;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;

/* JADX INFO: renamed from: wb0.b */
/* JADX INFO: compiled from: JSCallInvokerResolver.java */
/* JADX INFO: loaded from: classes59.dex */
public class C45787b {
    @OptIn(markerClass = {FrameworkAPI.class})
    /* JADX INFO: renamed from: a */
    public static CallInvokerHolderImpl m101114a(ReactApplicationContext reactApplicationContext) {
        try {
            try {
                return (CallInvokerHolderImpl) reactApplicationContext.getClass().getMethod("getJSCallInvokerHolder", new Class[0]).invoke(reactApplicationContext, new Object[0]);
            } catch (Exception e11) {
                throw new RuntimeException("Failed to get JSCallInvokerHolder", e11);
            }
        } catch (Exception unused) {
            Object objInvoke = reactApplicationContext.getClass().getMethod("getCatalystInstance", new Class[0]).invoke(reactApplicationContext, new Object[0]);
            return (CallInvokerHolderImpl) objInvoke.getClass().getMethod("getJSCallInvokerHolder", new Class[0]).invoke(objInvoke, new Object[0]);
        }
    }
}
