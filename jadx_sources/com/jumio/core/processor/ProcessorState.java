package com.jumio.core.processor;

import com.jumio.commons.camera.ImageMetadata;
import com.jumio.commons.camera.MeteringConfig;
import com.jumio.commons.camera.Size;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorState;", "", "Ready", "HoldStill", "CoolDown", "RequestMetering", "TakePicture", "Skip", "Processing", "Finished", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface ProcessorState {

    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorState$CoolDown;", "Lcom/jumio/core/processor/ProcessorState;", "time", "", "<init>", "(J)V", "getTime", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CoolDown implements ProcessorState {
        private final long time;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CoolDown) && this.time == ((CoolDown) other).time;
        }

        public static /* synthetic */ CoolDown copy$default(CoolDown coolDown, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = coolDown.time;
            }
            return coolDown.copy(j11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        @NotNull
        public final CoolDown copy(long time) {
            return new CoolDown(time);
        }

        public final long getTime() {
            return this.time;
        }

        public int hashCode() {
            return Long.hashCode(this.time);
        }

        @NotNull
        public String toString() {
            return "CoolDown(time=" + this.time + ')';
        }

        public CoolDown(long j11) {
            this.time = j11;
        }
    }

    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorState$Finished;", "Lcom/jumio/core/processor/ProcessorState;", "batchId", "", DbParams.KEY_CHANNEL_RESULT, "", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getBatchId", "()Ljava/lang/String;", "getResult", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Finished implements ProcessorState {

        @Nullable
        private final String batchId;

        @Nullable
        private final Object result;

        /* JADX WARN: Multi-variable type inference failed */
        public Finished() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Finished)) {
                return false;
            }
            Finished finished = (Finished) other;
            return Intrinsics.areEqual(this.batchId, finished.batchId) && Intrinsics.areEqual(this.result, finished.result);
        }

        public Finished(@Nullable String str, @Nullable Object obj) {
            this.batchId = str;
            this.result = obj;
        }

        public static /* synthetic */ Finished copy$default(Finished finished, String str, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                str = finished.batchId;
            }
            if ((i11 & 2) != 0) {
                obj = finished.result;
            }
            return finished.copy(str, obj);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBatchId() {
            return this.batchId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        @NotNull
        public final Finished copy(@Nullable String batchId, @Nullable Object result) {
            return new Finished(batchId, result);
        }

        @Nullable
        public final String getBatchId() {
            return this.batchId;
        }

        @Nullable
        public final Object getResult() {
            return this.result;
        }

        public int hashCode() {
            String str = this.batchId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Object obj = this.result;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Finished(batchId=" + this.batchId + ", result=" + this.result + ')';
        }

        public /* synthetic */ Finished(String str, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : obj);
        }
    }

    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorState$HoldStill;", "Lcom/jumio/core/processor/ProcessorState;", "time", "", "<init>", "(J)V", "getTime", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class HoldStill implements ProcessorState {
        private final long time;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HoldStill) && this.time == ((HoldStill) other).time;
        }

        public static /* synthetic */ HoldStill copy$default(HoldStill holdStill, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = holdStill.time;
            }
            return holdStill.copy(j11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        @NotNull
        public final HoldStill copy(long time) {
            return new HoldStill(time);
        }

        public final long getTime() {
            return this.time;
        }

        public int hashCode() {
            return Long.hashCode(this.time);
        }

        @NotNull
        public String toString() {
            return "HoldStill(time=" + this.time + ')';
        }

        public HoldStill(long j11) {
            this.time = j11;
        }
    }

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorState$Processing;", "Lcom/jumio/core/processor/ProcessorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Processing implements ProcessorState {

        @NotNull
        public static final Processing INSTANCE = new Processing();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Processing);
        }

        @NotNull
        public String toString() {
            return "Processing";
        }

        private Processing() {
        }

        public int hashCode() {
            return -1123681750;
        }
    }

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorState$Ready;", "Lcom/jumio/core/processor/ProcessorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Ready implements ProcessorState {

        @NotNull
        public static final Ready INSTANCE = new Ready();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Ready);
        }

        @NotNull
        public String toString() {
            return "Ready";
        }

        private Ready() {
        }

        public int hashCode() {
            return 1794063404;
        }
    }

    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorState$RequestMetering;", "Lcom/jumio/core/processor/ProcessorState;", "meteringConfig", "Lcom/jumio/commons/camera/MeteringConfig;", "<init>", "(Lcom/jumio/commons/camera/MeteringConfig;)V", "getMeteringConfig", "()Lcom/jumio/commons/camera/MeteringConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RequestMetering implements ProcessorState {

        @NotNull
        private final MeteringConfig meteringConfig;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequestMetering) && Intrinsics.areEqual(this.meteringConfig, ((RequestMetering) other).meteringConfig);
        }

        public RequestMetering(@NotNull MeteringConfig meteringConfig) {
            Intrinsics.checkNotNullParameter(meteringConfig, "meteringConfig");
            this.meteringConfig = meteringConfig;
        }

        public static /* synthetic */ RequestMetering copy$default(RequestMetering requestMetering, MeteringConfig meteringConfig, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                meteringConfig = requestMetering.meteringConfig;
            }
            return requestMetering.copy(meteringConfig);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final MeteringConfig getMeteringConfig() {
            return this.meteringConfig;
        }

        @NotNull
        public final RequestMetering copy(@NotNull MeteringConfig meteringConfig) {
            Intrinsics.checkNotNullParameter(meteringConfig, "meteringConfig");
            return new RequestMetering(meteringConfig);
        }

        @NotNull
        public final MeteringConfig getMeteringConfig() {
            return this.meteringConfig;
        }

        public int hashCode() {
            return this.meteringConfig.hashCode();
        }

        @NotNull
        public String toString() {
            return "RequestMetering(meteringConfig=" + this.meteringConfig + ')';
        }
    }

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorState$Skip;", "Lcom/jumio/core/processor/ProcessorState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Skip implements ProcessorState {

        @NotNull
        public static final Skip INSTANCE = new Skip();

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Skip);
        }

        @NotNull
        public String toString() {
            return "Skip";
        }

        private Skip() {
        }

        public int hashCode() {
            return -80638506;
        }
    }

    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/jumio/core/processor/ProcessorState$TakePicture;", "Lcom/jumio/core/processor/ProcessorState;", "batchId", "", "imageMetadata", "Lcom/jumio/commons/camera/ImageMetadata;", "outputSize", "Lcom/jumio/commons/camera/Size;", "<init>", "(Ljava/lang/String;Lcom/jumio/commons/camera/ImageMetadata;Lcom/jumio/commons/camera/Size;)V", "getBatchId", "()Ljava/lang/String;", "getImageMetadata", "()Lcom/jumio/commons/camera/ImageMetadata;", "getOutputSize", "()Lcom/jumio/commons/camera/Size;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class TakePicture implements ProcessorState {

        @Nullable
        private final String batchId;

        @Nullable
        private final ImageMetadata imageMetadata;

        @Nullable
        private final Size outputSize;

        public TakePicture() {
            this(null, null, null, 7, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TakePicture)) {
                return false;
            }
            TakePicture takePicture = (TakePicture) other;
            return Intrinsics.areEqual(this.batchId, takePicture.batchId) && Intrinsics.areEqual(this.imageMetadata, takePicture.imageMetadata) && Intrinsics.areEqual(this.outputSize, takePicture.outputSize);
        }

        public TakePicture(@Nullable String str, @Nullable ImageMetadata imageMetadata, @Nullable Size size) {
            this.batchId = str;
            this.imageMetadata = imageMetadata;
            this.outputSize = size;
        }

        public static /* synthetic */ TakePicture copy$default(TakePicture takePicture, String str, ImageMetadata imageMetadata, Size size, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = takePicture.batchId;
            }
            if ((i11 & 2) != 0) {
                imageMetadata = takePicture.imageMetadata;
            }
            if ((i11 & 4) != 0) {
                size = takePicture.outputSize;
            }
            return takePicture.copy(str, imageMetadata, size);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBatchId() {
            return this.batchId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ImageMetadata getImageMetadata() {
            return this.imageMetadata;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Size getOutputSize() {
            return this.outputSize;
        }

        @NotNull
        public final TakePicture copy(@Nullable String batchId, @Nullable ImageMetadata imageMetadata, @Nullable Size outputSize) {
            return new TakePicture(batchId, imageMetadata, outputSize);
        }

        @Nullable
        public final String getBatchId() {
            return this.batchId;
        }

        @Nullable
        public final ImageMetadata getImageMetadata() {
            return this.imageMetadata;
        }

        @Nullable
        public final Size getOutputSize() {
            return this.outputSize;
        }

        public int hashCode() {
            String str = this.batchId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ImageMetadata imageMetadata = this.imageMetadata;
            int iHashCode2 = (iHashCode + (imageMetadata == null ? 0 : imageMetadata.hashCode())) * 31;
            Size size = this.outputSize;
            return iHashCode2 + (size != null ? size.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TakePicture(batchId=" + this.batchId + ", imageMetadata=" + this.imageMetadata + ", outputSize=" + this.outputSize + ')';
        }

        public /* synthetic */ TakePicture(String str, ImageMetadata imageMetadata, Size size, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : imageMetadata, (i11 & 4) != 0 ? null : size);
        }
    }
}
