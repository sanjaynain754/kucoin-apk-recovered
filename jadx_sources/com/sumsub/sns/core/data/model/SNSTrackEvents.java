package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41801c2;
import kotlinx.serialization.internal.C41876r2;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import tg0.C44947b;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001aR.\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u0010+\u001a\u0004\b2\u0010\u001f¨\u00066"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "", "", "activity", "ts", "", "payload", "", "alwaysSend", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "", "seen0", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/r2;)V", "self", "Lwg0/b;", "output", "Lvg0/f;", "serialDesc", "", "write$Self$idensic_mobile_sdk_aar_defaultRelease", "(Lcom/sumsub/sns/core/data/model/SNSTrackEvents;Lwg0/b;Lvg0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivity", "getActivity$annotations", "()V", "getTs", "getTs$annotations", "Ljava/util/Map;", "getPayload", "getPayload$annotations", "Z", "getAlwaysSend", "getAlwaysSend$annotations", "Companion", "$serializer", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@InterfaceC44962o
public final /* data */ class SNSTrackEvents {

    @NotNull
    private final String activity;
    private final boolean alwaysSend;

    @Nullable
    private final Map<String, Object> payload;

    @Nullable
    private final String ts;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    private static final Lazy<InterfaceC44951d<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.core.data.model.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSTrackEvents._childSerializers$_anonymous_();
        }
    })};

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/SNSTrackEvents$Companion;", "", "<init>", "()V", "Ltg0/d;", "Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "serializer", "()Ltg0/d;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC44951d<SNSTrackEvents> serializer() {
            return SNSTrackEvents$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SNSTrackEvents(int i11, String str, String str2, Map map, C41876r2 c41876r2) {
        if (1 != (i11 & 1)) {
            C41801c2.m91514a(i11, 1, SNSTrackEvents$$serializer.INSTANCE.getDescriptor());
        }
        this.activity = str;
        if ((i11 & 2) == 0) {
            this.ts = null;
        } else {
            this.ts = str2;
        }
        if ((i11 & 4) == 0) {
            this.payload = null;
        } else {
            this.payload = map;
        }
        this.alwaysSend = false;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSTrackEvents)) {
            return false;
        }
        SNSTrackEvents sNSTrackEvents = (SNSTrackEvents) other;
        return Intrinsics.areEqual(this.activity, sNSTrackEvents.activity) && Intrinsics.areEqual(this.ts, sNSTrackEvents.ts) && Intrinsics.areEqual(this.payload, sNSTrackEvents.payload) && this.alwaysSend == sNSTrackEvents.alwaysSend;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC44951d _childSerializers$_anonymous_() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SNSTrackEvents copy$default(SNSTrackEvents sNSTrackEvents, String str, String str2, Map map, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sNSTrackEvents.activity;
        }
        if ((i11 & 2) != 0) {
            str2 = sNSTrackEvents.ts;
        }
        if ((i11 & 4) != 0) {
            map = sNSTrackEvents.payload;
        }
        if ((i11 & 8) != 0) {
            z11 = sNSTrackEvents.alwaysSend;
        }
        return sNSTrackEvents.copy(str, str2, map, z11);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$idensic_mobile_sdk_aar_defaultRelease(SNSTrackEvents self, InterfaceC45829b output, InterfaceC45533f serialDesc) {
        Lazy<InterfaceC44951d<Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.activity);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ts != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, C41897w2.f92051a, self.ts);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.payload == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.payload);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivity() {
        return this.activity;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTs() {
        return this.ts;
    }

    @Nullable
    public final Map<String, Object> component3() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAlwaysSend() {
        return this.alwaysSend;
    }

    @NotNull
    public final SNSTrackEvents copy(@NotNull String activity, @Nullable String ts2, @Nullable Map<String, ? extends Object> payload, boolean alwaysSend) {
        return new SNSTrackEvents(activity, ts2, payload, alwaysSend);
    }

    @NotNull
    public final String getActivity() {
        return this.activity;
    }

    public final boolean getAlwaysSend() {
        return this.alwaysSend;
    }

    @Nullable
    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    @Nullable
    public final String getTs() {
        return this.ts;
    }

    public int hashCode() {
        int iHashCode = this.activity.hashCode() * 31;
        String str = this.ts;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.payload;
        return Boolean.hashCode(this.alwaysSend) + ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "SNSTrackEvents(activity=" + this.activity + ", ts=" + this.ts + ", payload=" + this.payload + ", alwaysSend=" + this.alwaysSend + ")";
    }

    public SNSTrackEvents(@NotNull String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map, boolean z11) {
        this.activity = str;
        this.ts = str2;
        this.payload = map;
        this.alwaysSend = z11;
    }

    public /* synthetic */ SNSTrackEvents(String str, String str2, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? false : z11);
    }

    public static /* synthetic */ void getActivity$annotations() {
    }

    public static /* synthetic */ void getAlwaysSend$annotations() {
    }

    public static /* synthetic */ void getPayload$annotations() {
    }

    public static /* synthetic */ void getTs$annotations() {
    }
}
