package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.messaging.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, m90084d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFh1mSDK;", "event", "", Constants.MessagePayloadKeys.RAW_DATA, "<init>", "(Lcom/appsflyer/internal/AFh1mSDK;[B)V", "", "afInfoLog", "()V", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFh1mSDK;", "getRevenue", "AFAdRevenueData", "[B", "getMonetizationNetwork"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AFb1sSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @Nullable
    private final byte[] getMonetizationNetwork;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @NotNull
    private final AFh1mSDK getRevenue;

    public AFb1sSDK(@NotNull AFh1mSDK aFh1mSDK, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        this.getRevenue = aFh1mSDK;
        this.getMonetizationNetwork = bArr;
    }

    public final void afInfoLog() throws Throwable {
        try {
            Map map = AFa1hSDK.f6283e;
            Object declaredConstructor = map.get(1269792254);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1hSDK.getMediationNetwork(ExpandableListView.getPackedPositionType(0L) + 87, (char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getTapTimeout() >> 16) + 37)).getDeclaredConstructor(null);
                map.put(1269792254, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            Object[] objArr = {this.getRevenue, this.getMonetizationNetwork};
            Object method = map.get(1632538500);
            if (method == null) {
                method = ((Class) AFa1hSDK.getMediationNetwork(88 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) TextUtils.indexOf("", ""), 37 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))).getMethod("getRevenue", AFh1mSDK.class, byte[].class);
                map.put(1632538500, method);
            }
            ((Method) method).invoke(objNewInstance, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
