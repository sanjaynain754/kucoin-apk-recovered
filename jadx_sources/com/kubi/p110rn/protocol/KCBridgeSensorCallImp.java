package com.kubi.p110rn.protocol;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.p110rn.exception.RNException;
import com.kubi.sdk.protocol.ProtocolException;
import com.sensorsdata.abtest.OnABTestReceivedData;
import com.sensorsdata.abtest.SensorsABTest;
import com.tencent.qcloud.tuicore.TUIConstants;
import e00.InterfaceC37015g;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCBridgeSensorCallImp.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0016J>\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00102\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0016JV\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u00122(\u0010\f\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0016J>\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0016JA\u0010\u0015\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00162\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002H\u00162\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u0001H\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0002¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/rn/protocol/KCBridgeSensorCallImp;", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeSensorCall;", "<init>", "()V", "fastFetchBoolTest", "", "ctx", "Landroid/content/Context;", "keyName", "", "defaultValue", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "fastFetchIntegerTest", "", "fastFetchJsonTest", "", "", "fastFetchStringTest", "fastFetchTest", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCBridgeSensorCallImp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCBridgeSensorCallImp.kt\ncom/kubi/rn/protocol/KCBridgeSensorCallImp\n+ 2 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n*L\n1#1,69:1\n45#2,2:70\n*S KotlinDebug\n*F\n+ 1 KCBridgeSensorCallImp.kt\ncom/kubi/rn/protocol/KCBridgeSensorCallImp\n*L\n66#1:70,2\n*E\n"})
public final class KCBridgeSensorCallImp implements InterfaceC37015g {
    private final <T> void fastFetchTest(String keyName, T defaultValue, final Function2<? super T, ? super ProtocolException, Unit> callback) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            SensorsABTest.shareInstance().fastFetchABTest(keyName, defaultValue, new OnABTestReceivedData() { // from class: com.kubi.rn.protocol.e
                @Override // com.sensorsdata.abtest.OnABTestReceivedData
                public final void onResult(Object obj) {
                    callback.invoke(obj, null);
                }
            });
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            callback.invoke(null, new ProtocolException("-1000", thM103847exceptionOrNullimpl, null, false, 12, null));
            C43846g.m96568c(new RNException(thM103847exceptionOrNullimpl, RNConstantKt.RN_CATEGORY, false, null, 8, null), null, 2, null);
        }
    }

    @Override // e00.InterfaceC37015g
    public void fastFetchBoolTest(@NotNull Context ctx, @NotNull String keyName, boolean defaultValue, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fastFetchTest(keyName, Boolean.valueOf(defaultValue), callback);
    }

    @Override // e00.InterfaceC37015g
    public void fastFetchIntegerTest(@NotNull Context ctx, @NotNull String keyName, long defaultValue, @NotNull Function2<? super Long, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fastFetchTest(keyName, Long.valueOf(defaultValue), callback);
    }

    @Override // e00.InterfaceC37015g
    public void fastFetchJsonTest(@NotNull Context ctx, @NotNull String keyName, @NotNull Map<String, ? extends Object> defaultValue, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fastFetchTest(keyName, defaultValue, callback);
    }

    @Override // e00.InterfaceC37015g
    public void fastFetchStringTest(@NotNull Context ctx, @NotNull String keyName, @NotNull String defaultValue, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fastFetchTest(keyName, defaultValue, callback);
    }
}
