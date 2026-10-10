package p566qn;

import android.content.Context;
import android.os.Bundle;
import com.jumio.sdk.JumioSDK;
import com.kubi.kyc.vendor.jumio.p095ui.JumioKubiActivity;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import kn.C41076a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qn.a */
/* JADX INFO: compiled from: JumioDetector.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0090\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2`\u0010\r\u001a\\\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00050\u000eH\u0007J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00182\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0019Rv\u0010\r\u001a^\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/JumioDetector;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", InterfaceC33826o0.f71244p, "", "dataCenter", "needNFC", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "isSuccess", "Landroid/os/Bundle;", "data", "errorMsg", "code", "needPermissionGranted", "getMissingPermissions", "", "(Landroid/content/Context;)[Ljava/lang/String;", "getCallback", "()Lkotlin/jvm/functions/Function4;", "setCallback", "(Lkotlin/jvm/functions/Function4;)V", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43791a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43791a f96834a = new C43791a();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static Function4<? super Boolean, ? super Bundle, ? super String, ? super String, Unit> f96835b;

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m96436c(@NotNull Context context, @Nullable String str, @Nullable String str2, boolean z11, @NotNull Function4<? super Boolean, ? super Bundle, ? super String, ? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (str == null || str.length() == 0) {
            C41076a.f91293a.m90059a("-200001");
            Boolean bool = Boolean.FALSE;
            Bundle EMPTY = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            C43792b c43792b = C43792b.f96836a;
            callback.invoke(bool, EMPTY, c43792b.m96443c().getFirst(), c43792b.m96443c().getSecond());
            return;
        }
        if (str2 == null || str2.length() == 0) {
            C41076a.f91293a.m90059a("-200010");
            Boolean bool2 = Boolean.FALSE;
            Bundle EMPTY2 = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            C43792b c43792b2 = C43792b.f96836a;
            callback.invoke(bool2, EMPTY2, c43792b2.m96442b().getFirst(), c43792b2.m96442b().getSecond());
            return;
        }
        JumioSDK.Companion companion = JumioSDK.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (!companion.isSupportedPlatform(applicationContext)) {
            C41076a.f91293a.m90059a("-200011");
            Boolean bool3 = Boolean.FALSE;
            Bundle EMPTY3 = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY3, "EMPTY");
            C43792b c43792b3 = C43792b.f96836a;
            callback.invoke(bool3, EMPTY3, c43792b3.m96441a().getFirst(), c43792b3.m96441a().getSecond());
            return;
        }
        C43793c.m96452c("启动Jumio流程:token=" + str + ", dataCenter=" + str2);
        f96835b = callback;
        JumioKubiActivity.f31596A.start(context, str, str2, z11);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m96437d(Context context, String str, String str2, boolean z11, Function4 function4, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        m96436c(context, str, str2, z11, function4);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Function4<Boolean, Bundle, String, String, Unit> m96438a() {
        return f96835b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String[] m96439b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return JumioSDK.INSTANCE.getMissingPermissions(context);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m96440e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String[] strArrM96439b = m96439b(context);
        if (!JumioSDK.INSTANCE.hasAllRequiredPermissions(context)) {
            if (!(strArrM96439b.length == 0)) {
                return true;
            }
        }
        return false;
    }
}
