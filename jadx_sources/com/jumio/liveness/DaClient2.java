package com.jumio.liveness;

import android.hardware.SensorEvent;
import android.media.Image;
import android.util.Log;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ReplaceWith;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: DaClient2.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 -2\u00060\u0001j\u0002`\u0002:\u0005+,-./B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0007\u001a\u00020\bH\u0086 J\t\u0010\t\u001a\u00020\bH\u0086 J\t\u0010\n\u001a\u00020\u000bH\u0086 J\u0013\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086 J\u0011\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086 J\u0011\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004H\u0086 J@\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u001bH\u0086 ¢\u0006\u0002\u0010\u001fJP\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c0\u001bH\u0086 ¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020&J \u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J8\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0019H\u0007J\t\u0010(\u001a\u00020\bH\u0096 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, m90084d2 = {"Lcom/jumio/liveness/DaClient2;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "ptr", "", "<init>", "(J)V", "start", "", InterfaceC33730j9.f70350a, "isBusy", "", "setEventHandler", "eventHandler", "Lcom/jumio/liveness/DaClient2$EventHandler;", "sendEvent", "event", "Lcom/jumio/liveness/DaClient2$Event;", "sendNativeEvent", "nativeEventPtr", "sendFrame", "timestamp", "image", "Landroid/media/Image;", "rotation", "", JAnalysisConstants.EVENT_ATTRIBUTES, "", "Lkotlin/Pair;", "", "", "(JLandroid/media/Image;I[Lkotlin/Pair;)V", "sendFrameNV21", "", "width", "height", "(J[BIII[Lkotlin/Pair;)V", "sendSensorEvent", "Landroid/hardware/SensorEvent;", "iso", "close", "isClosed", "()Z", "EventHandler", "Config", "Companion", "EventView", "Event", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDaClient2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DaClient2.kt\ncom/jumio/liveness/DaClient2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
public final class DaClient2 implements AutoCloseable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final String TAG = "DaClient2";
    private final long ptr;

    /* JADX INFO: compiled from: DaClient2.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0006\u001a\u00020\u0007H\u0083 J\u0013\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/jumio/liveness/DaClient2$Companion;", "", "<init>", "()V", "TAG", "", "loadType", "", "create", "Lcom/jumio/liveness/DaClient2;", "config", "Lcom/jumio/liveness/DaClient2$Config;", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void loadType() {
            DaClient2.loadType();
        }

        @JvmStatic
        @Nullable
        public final DaClient2 create(@NotNull Config config) {
            return DaClient2.create(config);
        }
    }

    /* JADX INFO: compiled from: DaClient2.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/liveness/DaClient2$Config;", "", "mode", "", "assetFileBuffer", "Ljava/nio/ByteBuffer;", "overrideConfig", "<init>", "(Ljava/lang/String;Ljava/nio/ByteBuffer;Ljava/lang/String;)V", "getMode", "()Ljava/lang/String;", "getAssetFileBuffer", "()Ljava/nio/ByteBuffer;", "getOverrideConfig", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final /* data */ class Config {

        @Nullable
        private final ByteBuffer assetFileBuffer;

        @NotNull
        private final String mode;

        @Nullable
        private final String overrideConfig;

        public Config(@NotNull String mode, @Nullable ByteBuffer byteBuffer, @Nullable String str) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.mode = mode;
            this.assetFileBuffer = byteBuffer;
            this.overrideConfig = str;
            if (byteBuffer != null && !byteBuffer.isDirect()) {
                throw new IllegalArgumentException("Asset file buffer must be allocated as direct");
            }
            if (byteBuffer == null && str == null) {
                throw new IllegalArgumentException("assetFileBuffer or overrideConfig must be set");
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.areEqual(this.mode, config.mode) && Intrinsics.areEqual(this.assetFileBuffer, config.assetFileBuffer) && Intrinsics.areEqual(this.overrideConfig, config.overrideConfig);
        }

        public static /* synthetic */ Config copy$default(Config config, String str, ByteBuffer byteBuffer, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = config.mode;
            }
            if ((i11 & 2) != 0) {
                byteBuffer = config.assetFileBuffer;
            }
            if ((i11 & 4) != 0) {
                str2 = config.overrideConfig;
            }
            return config.copy(str, byteBuffer, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ByteBuffer getAssetFileBuffer() {
            return this.assetFileBuffer;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOverrideConfig() {
            return this.overrideConfig;
        }

        @NotNull
        public final Config copy(@NotNull String mode, @Nullable ByteBuffer assetFileBuffer, @Nullable String overrideConfig) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            return new Config(mode, assetFileBuffer, overrideConfig);
        }

        @Nullable
        public final ByteBuffer getAssetFileBuffer() {
            return this.assetFileBuffer;
        }

        @NotNull
        public final String getMode() {
            return this.mode;
        }

        @Nullable
        public final String getOverrideConfig() {
            return this.overrideConfig;
        }

        public int hashCode() {
            int iHashCode = this.mode.hashCode() * 31;
            ByteBuffer byteBuffer = this.assetFileBuffer;
            int iHashCode2 = (iHashCode + (byteBuffer == null ? 0 : byteBuffer.hashCode())) * 31;
            String str = this.overrideConfig;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Config(mode=" + this.mode + ", assetFileBuffer=" + this.assetFileBuffer + ", overrideConfig=" + this.overrideConfig + ')';
        }

        public /* synthetic */ Config(String str, ByteBuffer byteBuffer, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : byteBuffer, (i11 & 4) != 0 ? null : str2);
        }
    }

    /* JADX INFO: compiled from: DaClient2.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b0\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b0\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m90084d2 = {"Lcom/jumio/liveness/DaClient2$Event;", "", "name", "", "timestamp", "", JAnalysisConstants.EVENT_ATTRIBUTES, "", "Lkotlin/Pair;", "<init>", "(Ljava/lang/String;J[Lkotlin/Pair;)V", "eventView", "Lcom/jumio/liveness/DaClient2$EventView;", "(Lcom/jumio/liveness/DaClient2$EventView;)V", "getName", "()Ljava/lang/String;", "getTimestamp", "()J", "getAttributes", "()[Lkotlin/Pair;", "[Lkotlin/Pair;", "get", "toString", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDaClient2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DaClient2.kt\ncom/jumio/liveness/DaClient2$Event\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,142:1\n1557#2:143\n1628#2,3:144\n37#3:147\n36#3,3:148\n1310#4,2:151\n13467#4,3:153\n*S KotlinDebug\n*F\n+ 1 DaClient2.kt\ncom/jumio/liveness/DaClient2$Event\n*L\n108#1:143\n108#1:144,3\n118#1:147\n118#1:148,3\n122#1:151,2\n128#1:153,3\n*E\n"})
    public static final class Event {

        @NotNull
        private final Pair<String, Object>[] attributes;

        @NotNull
        private final String name;
        private final long timestamp;

        public Event(@NotNull String name, long j11, @NotNull Pair<String, Object>[] attributes) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            this.name = name;
            this.timestamp = j11;
            this.attributes = attributes;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x001f  */
        /* JADX WARN: Code duplicated, block: B:13:0x0024 A[RETURN] */
        @Nullable
        public final Object get(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            for (Pair<String, Object> pair : this.attributes) {
                if (Intrinsics.areEqual(pair.getFirst(), name)) {
                    if (pair != null) {
                        return pair.getSecond();
                    }
                    return null;
                }
            }
            pair = null;
            if (pair != null) {
                return pair.getSecond();
            }
            return null;
        }

        @NotNull
        public final Pair<String, Object>[] getAttributes() {
            return this.attributes;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[' + this.timestamp + "] " + this.name + ": ");
            Pair<String, Object>[] pairArr = this.attributes;
            int length = pairArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                Pair<String, Object> pair = pairArr[i11];
                int i13 = i12 + 1;
                String strComponent1 = pair.component1();
                Object objComponent2 = pair.component2();
                if (i12 != 0) {
                    sb2.append(", ");
                }
                if (objComponent2 instanceof String) {
                    sb2.append(strComponent1 + " = " + ((String) objComponent2));
                } else if (objComponent2 instanceof ByteBuffer) {
                    sb2.append(strComponent1 + " = ByteBuffer[" + ((ByteBuffer) objComponent2).capacity() + ']');
                } else {
                    sb2.append(strComponent1 + " = " + objComponent2);
                }
                i11++;
                i12 = i13;
            }
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.nio.ByteBuffer] */
        public Event(@NotNull EventView eventView) {
            Intrinsics.checkNotNullParameter(eventView, "eventView");
            String name = eventView.getName();
            long timestamp = eventView.getTimestamp();
            IntRange intRangeUntil = RangesKt.until(0, eventView.getAttributeCount());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                String attributeName = eventView.getAttributeName(iNextInt);
                Object attributeValueString = eventView.getAttributeValueString(iNextInt);
                if (attributeValueString == 0) {
                    ByteBuffer attributeValueDataView = eventView.getAttributeValueDataView(iNextInt);
                    Intrinsics.checkNotNull(attributeValueDataView);
                    attributeValueString = ByteBuffer.allocateDirect(attributeValueDataView.capacity());
                    attributeValueString.put(attributeValueDataView);
                    attributeValueString.flip();
                }
                arrayList.add(new Pair(attributeName, attributeValueString));
            }
            this(name, timestamp, (Pair[]) arrayList.toArray(new Pair[0]));
        }
    }

    /* JADX INFO: compiled from: DaClient2.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m90084d2 = {"Lcom/jumio/liveness/DaClient2$EventHandler;", "", "onResponse", "", "eventView", "Lcom/jumio/liveness/DaClient2$EventView;", "onEventForForwarding", "nativeEventPtr", "", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public interface EventHandler {
        void onEventForForwarding(long nativeEventPtr);

        void onResponse(@NotNull EventView eventView);
    }

    /* JADX INFO: compiled from: DaClient2.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0086 J\t\u0010\b\u001a\u00020\u0003H\u0086 J\t\u0010\t\u001a\u00020\nH\u0086 J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\nH\u0086 J\u0013\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\nH\u0086 J\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\nH\u0086 J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/jumio/liveness/DaClient2$EventView;", "", "ptr", "", "<init>", "(J)V", "getName", "", "getTimestamp", "getAttributeCount", "", "getAttributeName", "index", "getAttributeValueString", "getAttributeValueDataView", "Ljava/nio/ByteBuffer;", "copy", "Lcom/jumio/liveness/DaClient2$Event;", "Companion", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class EventView {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        private final long ptr;

        /* JADX INFO: compiled from: DaClient2.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0083 ¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/liveness/DaClient2$EventView$Companion;", "", "<init>", "()V", "loadType", "", "dasdk_withoutAssetsRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            @JvmStatic
            public final void loadType() {
                EventView.loadType();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public static final native void loadType();

        public final native int getAttributeCount();

        @NotNull
        public final native String getAttributeName(int index);

        @Nullable
        public final native ByteBuffer getAttributeValueDataView(int index);

        @Nullable
        public final native String getAttributeValueString(int index);

        @NotNull
        public final native String getName();

        public final native long getTimestamp();

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            companion.loadType();
        }

        @NotNull
        public final Event copy() {
            return new Event(this);
        }

        public EventView(long j11) {
            this.ptr = j11;
        }
    }

    @JvmStatic
    @Nullable
    public static final native DaClient2 create(@NotNull Config config);

    /* JADX INFO: Access modifiers changed from: private */
    @JvmStatic
    public static final native void loadType();

    @Override // java.lang.AutoCloseable
    public native void close();

    public final native boolean isBusy();

    public final native void sendEvent(@NotNull Event event);

    @Deprecated(message = "Use the method that sends attributes instead", replaceWith = @ReplaceWith(expression = "sendFrame(timestamp, image, rotation, emptyArray())", imports = {}))
    public final void sendFrame(long timestamp, @NotNull Image image, int rotation) {
        Intrinsics.checkNotNullParameter(image, "image");
        sendFrame(timestamp, image, rotation, new Pair[0]);
    }

    public final native void sendFrame(long timestamp, @NotNull Image image, int rotation, @NotNull Pair<String, Object>[] attributes);

    @Deprecated(message = "Use the method that sends attributes instead", replaceWith = @ReplaceWith(expression = "sendFrameNV21(timestamp, image, width, height, rotation, arrayOf(\"iso\" to iso.toString()))", imports = {}))
    public final void sendFrameNV21(long timestamp, @NotNull byte[] image, int width, int height, int rotation, int iso) {
        Intrinsics.checkNotNullParameter(image, "image");
        sendFrameNV21(timestamp, image, width, height, rotation, new Pair[]{TuplesKt.m90091to("iso", String.valueOf(iso))});
    }

    public final native void sendFrameNV21(long timestamp, @NotNull byte[] image, int width, int height, int rotation, @NotNull Pair<String, Object>[] attributes);

    public final native void sendNativeEvent(long nativeEventPtr);

    public final native void setEventHandler(@Nullable EventHandler eventHandler);

    public final native void start();

    public final native void stop();

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        companion.loadType();
    }

    public final boolean isClosed() {
        return this.ptr == 0;
    }

    public final void sendSensorEvent(long timestamp, @NotNull SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Event daClient2Event = HelpersKt.toDaClient2Event(event, timestamp);
        if (daClient2Event != null) {
            sendEvent(daClient2Event);
            return;
        }
        Log.w(TAG, "Unsupported sensor event: " + event.sensor.getStringType());
    }

    private DaClient2(long j11) {
        this.ptr = j11;
    }
}
