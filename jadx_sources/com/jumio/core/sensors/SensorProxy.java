package com.jumio.core.sensors;

import android.content.Context;
import android.hardware.SensorEvent;
import com.jumio.core.sensors.SensorProxy;
import com.jumio.sdk.credentials.JumioCredential;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jumio.core.C40535G3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B&\u0012\u001d\u0010\u0002\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\b\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0006J7\u0010\u0014\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00060\u0003J\u0006\u0010\u0019\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u0017J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m90084d2 = {"Lcom/jumio/core/sensors/SensorProxy;", "", "collectSensors", "Lkotlin/Function1;", "", "Lcom/jumio/core/sensors/SensorInterface;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "sensors", "onProxyEventCallback", "Landroid/hardware/SensorEvent;", "Lkotlin/ParameterName;", "name", "event", "start", "context", "Landroid/content/Context;", InterfaceC33730j9.f70350a, "setCallback", "sensorTypes", "", "Lcom/jumio/core/sensors/SensorType;", TUIConstants.TUIChat.CALL_BACK, "reset", "firstOrNull", "type", "collectResult", "Lcom/jumio/core/sensors/SensorDataResult;", "activeCredential", "Lcom/jumio/sdk/credentials/JumioCredential;", "sensorSamplingTime", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSensorProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensorProxy.kt\ncom/jumio/core/sensors/SensorProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1#2:77\n1863#3,2:78\n1863#3,2:80\n1863#3,2:82\n1863#3,2:84\n295#3,2:86\n1557#3:88\n1628#3,3:89\n*S KotlinDebug\n*F\n+ 1 SensorProxy.kt\ncom/jumio/core/sensors/SensorProxy\n*L\n19#1:78,2\n29#1:80,2\n41#1:82,2\n55#1:84,2\n61#1:86,2\n72#1:88\n72#1:89,3\n*E\n"})
public final class SensorProxy {

    /* JADX INFO: renamed from: a */
    public final ArrayList f14572a;

    /* JADX INFO: renamed from: b */
    public Function1 f14573b;

    @Nullable
    public final synchronized C40535G3 collectResult(@NotNull JumioCredential activeCredential, int i11) {
        try {
            Intrinsics.checkNotNullParameter(activeCredential, "activeCredential");
            if (this.f14572a.isEmpty()) {
                return null;
            }
            SensorInterface sensorInterface = (SensorInterface) CollectionsKt.firstOrNull((List) this.f14572a);
            long f14560d = sensorInterface != null ? sensorInterface.getF14560d() : 0L;
            String str = activeCredential.getF14676b().f14197a;
            ArrayList arrayList = this.f14572a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((SensorInterface) it.next()).getResult());
            }
            return new C40535G3(f14560d, str, i11, arrayList2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    public final synchronized SensorInterface firstOrNull(@NotNull SensorType type) {
        Object next;
        try {
            Intrinsics.checkNotNullParameter(type, "type");
            Iterator it = this.f14572a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((SensorInterface) next).getF14557a() != type);
        } catch (Throwable th2) {
            throw th2;
        }
        return (SensorInterface) next;
    }

    public final synchronized void reset() {
        if (!this.f14572a.isEmpty()) {
            Iterator it = this.f14572a.iterator();
            while (it.hasNext()) {
                ((SensorInterface) it.next()).resetAllData();
            }
        }
    }

    public final synchronized void setCallback(@NotNull List<? extends SensorType> sensorTypes, @NotNull Function1<? super SensorEvent, Unit> callback) {
        Intrinsics.checkNotNullParameter(sensorTypes, "sensorTypes");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.f14572a.isEmpty()) {
            this.f14573b = callback;
            for (SensorInterface sensorInterface : this.f14572a) {
                if (sensorTypes.contains(sensorInterface.getF14557a())) {
                    sensorInterface.setEventCallback(new Function1() { // from class: w9.b
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SensorProxy.m14596a(this.f103191b, (SensorEvent) obj);
                        }
                    });
                }
            }
        }
    }

    public final synchronized void start(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f14572a.isEmpty()) {
            Iterator it = this.f14572a.iterator();
            while (it.hasNext()) {
                ((SensorInterface) it.next()).start(context);
            }
        }
    }

    public final synchronized void stop() {
        if (!this.f14572a.isEmpty()) {
            Iterator it = this.f14572a.iterator();
            while (it.hasNext()) {
                ((SensorInterface) it.next()).stop();
            }
        }
    }

    public SensorProxy(@NotNull Function1<? super List<SensorInterface>, Unit> collectSensors) {
        Intrinsics.checkNotNullParameter(collectSensors, "collectSensors");
        ArrayList arrayList = new ArrayList();
        collectSensors.invoke(arrayList);
        this.f14572a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14596a(SensorProxy sensorProxy, SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Function1 function1 = sensorProxy.f14573b;
        if (function1 != null) {
            function1.invoke(event);
        }
        return Unit.INSTANCE;
    }
}
