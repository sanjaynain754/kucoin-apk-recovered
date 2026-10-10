package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.core.MobileSdk;
import com.sumsub.sns.core.SNSModule;
import com.sumsub.sns.core.data.listener.SNSErrorHandler;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.data.listener.SNSStateChangedHandler;
import com.sumsub.sns.core.data.listener.SNSUrlHandler;
import com.sumsub.sns.core.data.listener.TokenExpirationHandler;
import com.sumsub.sns.core.data.model.SNSInitConfig;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.k0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28468k0 implements MobileSdk {

    /* JADX INFO: renamed from: b */
    public static String f57984b = "";

    /* JADX INFO: renamed from: c */
    public static int f57985c = -1;

    /* JADX INFO: renamed from: d */
    public static String f57986d = "";

    /* JADX INFO: renamed from: f */
    public static boolean f57988f;

    /* JADX INFO: renamed from: h */
    public static boolean f57990h;

    /* JADX INFO: renamed from: j */
    public static Function0 f57992j;

    /* JADX INFO: renamed from: k */
    public static Function0 f57993k;

    /* JADX INFO: renamed from: l */
    public static Function0 f57994l;

    /* JADX INFO: renamed from: m */
    public static Function0 f57995m;

    /* JADX INFO: renamed from: n */
    public static Function0 f57996n;

    /* JADX INFO: renamed from: o */
    public static Function0 f57997o;

    /* JADX INFO: renamed from: p */
    public static Function0 f57998p;

    /* JADX INFO: renamed from: q */
    public static Function0 f57999q;

    /* JADX INFO: renamed from: r */
    public static Function1 f58000r;

    /* JADX INFO: renamed from: s */
    public static Function0 f58001s;

    /* JADX INFO: renamed from: t */
    public static Function0 f58002t;

    /* JADX INFO: renamed from: u */
    public static Function1 f58003u;

    /* JADX INFO: renamed from: v */
    public static Function0 f58004v;

    /* JADX INFO: renamed from: w */
    public static Function0 f58005w;

    /* JADX INFO: renamed from: x */
    public static Function0 f58006x;

    /* JADX INFO: renamed from: a */
    public static final C28468k0 f57983a = new C28468k0();

    /* JADX INFO: renamed from: e */
    public static Locale f57987e = AbstractC28458h.m69337a();

    /* JADX INFO: renamed from: g */
    public static SNSSDKState f57989g = SNSSDKState.Initial.INSTANCE;

    /* JADX INFO: renamed from: i */
    public static final String f57991i = "1.46.0";

    /* JADX INFO: renamed from: y */
    public static final C28465j0 f58007y = new C28465j0();

    @Override // com.sumsub.sns.core.MobileSdk
    public final Integer getAutoCloseOnApproveTimeout() {
        Function0 function0 = f58005w;
        if (function0 != null) {
            return (Integer) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final SNSInitConfig getConf() {
        Function0 function0 = f57992j;
        if (function0 != null) {
            return (SNSInitConfig) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final SNSJsonCustomization getCustomization() {
        Function0 function0 = f57998p;
        if (function0 != null) {
            return (SNSJsonCustomization) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final SNSErrorHandler getErrorHandler() {
        Function0 function0 = f57996n;
        if (function0 != null) {
            return (SNSErrorHandler) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final SNSEventHandler getEventHandler() {
        Function0 function0 = f57997o;
        if (function0 != null) {
            return (SNSEventHandler) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final SNSIconHandler getIconHandler() {
        SNSIconHandler sNSIconHandler;
        Function0 function0 = f58001s;
        return (function0 == null || (sNSIconHandler = (SNSIconHandler) function0.invoke()) == null) ? f58007y : sNSIconHandler;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final SNSInstructionsViewHandler getInstructionsViewHandler() {
        Function0 function0 = f57999q;
        if (function0 != null) {
            return (SNSInstructionsViewHandler) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final Locale getLocale() {
        return f57987e;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final String getPackageName() {
        return f57986d;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final SNSModule getPluggedModule(String str) {
        Function1 function1 = f58000r;
        if (function1 != null) {
            return (SNSModule) function1.invoke(str);
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final Map getPreferredDocumentsDefinitions() {
        Function0 function0 = f58004v;
        if (function0 != null) {
            return (Map) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final Map getSettings() {
        Function0 function0 = f57993k;
        if (function0 != null) {
            return (Map) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final SNSSDKState getState() {
        return f57989g;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final SNSStateChangedHandler getStateChangedHandler() {
        Function0 function0 = f57995m;
        if (function0 != null) {
            return (SNSStateChangedHandler) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final List getSupportItems() {
        Function0 function0 = f58002t;
        if (function0 != null) {
            return (List) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final TokenExpirationHandler getTokenExpirationHandler() {
        Function0 function0 = f57994l;
        if (function0 != null) {
            return (TokenExpirationHandler) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final SNSUrlHandler getUrlHandler() {
        Function0 function0 = f58006x;
        if (function0 != null) {
            return (SNSUrlHandler) function0.invoke();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final String getVersion() {
        return f57991i;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final int getVersionCode() {
        return f57985c;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final String getVersionName() {
        return f57984b;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final boolean isDebug() {
        return f57988f;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final void setSupportItems(List list) {
        Function1 function1 = f58003u;
        if (function1 != null) {
            function1.invoke(list);
        }
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public final boolean isModuleAvailable(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
