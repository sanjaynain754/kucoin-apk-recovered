package com.sumsub.sns.core.data.listener;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.sumsub.sns.core.data.model.SNSTrackEvents;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41876r2;
import kotlinx.serialization.internal.C41897w2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import tg0.C44947b;
import tg0.C44960m;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001b2\u00020\u0001:\u0011\u001c\u001d\u001e\u001f !\"#$%&'()*+\u001bB)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\r,-./012345678¨\u00069"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent;", "", "", "eventType", "", "payload", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/r2;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/r2;)V", "self", "Lwg0/b;", "output", "Lvg0/f;", "serialDesc", "", "write$Self", "(Lcom/sumsub/sns/core/data/listener/SNSEvent;Lwg0/b;Lvg0/f;)V", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;", "Companion", "SNSEventAnalytics", "SNSEventApplicantLoaded", "SNSEventStepInitiated", "SNSEventStepCompleted", "UserStartedVerification", "CountrySelected", "DocumentTypeSelected", "PhotoDeclined", "PhotoAccepted", "SupportItemClicked", "ApplicantDataUpdated", "ShowMoreGuidance", "VerificationStarted", "EventParams", "ViewItem", "EventType", "Lcom/sumsub/sns/core/data/listener/SNSEvent$ApplicantDataUpdated;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$CountrySelected;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$DocumentTypeSelected;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$PhotoAccepted;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$PhotoDeclined;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventAnalytics;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventApplicantLoaded;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepCompleted;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepInitiated;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$ShowMoreGuidance;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$SupportItemClicked;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$UserStartedVerification;", "Lcom/sumsub/sns/core/data/listener/SNSEvent$VerificationStarted;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@InterfaceC44962o
public abstract class SNSEvent {

    @NotNull
    private static final Lazy<InterfaceC44951d<Object>> $cachedSerializer$delegate;

    @JvmField
    @NotNull
    private static final Lazy<InterfaceC44951d<Object>>[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String eventType;

    @Nullable
    private final Map<String, Object> payload;

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$ApplicantDataUpdated;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "values", "", "", "<init>", "(Ljava/util/List;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class ApplicantDataUpdated extends SNSEvent {
        public ApplicantDataUpdated(@NotNull List<String> list) {
            super("ApplicantDataUpdated", MapsKt.mapOf(TuplesKt.m90091to(EventParams.Value.getValue(), list)), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$Companion;", "", "<init>", "()V", "Ltg0/d;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "serializer", "()Ltg0/d;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC44951d get$cachedSerializer() {
            return (InterfaceC44951d) SNSEvent.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final InterfaceC44951d<SNSEvent> serializer() {
            return get$cachedSerializer();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$CountrySelected;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "byUser", "", "<init>", "(Ljava/lang/String;Z)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class CountrySelected extends SNSEvent {
        public CountrySelected(@NotNull String str, boolean z11) {
            super("CountrySelected", MapsKt.mapOf(TuplesKt.m90091to(EventParams.CountryCode.getValue(), str), TuplesKt.m90091to(EventParams.ByUser.getValue(), Boolean.valueOf(z11))), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$DocumentTypeSelected;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "documentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class DocumentTypeSelected extends SNSEvent {
        public DocumentTypeSelected(@NotNull String str, @NotNull String str2) {
            super("ItemClicked", MapsKt.mapOf(TuplesKt.m90091to(EventParams.ViewItem.getValue(), "DocumentType"), TuplesKt.m90091to(EventParams.CountryCode.getValue(), str), TuplesKt.m90091to(EventParams.DocumentType.getValue(), str2)), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$EventParams;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IdDocSetType", "IsCancelled", "LevelName", "CountryCode", "DocumentType", "ByUser", "Type", "Value", "ViewItem", "ApplicantId", "ActionId", "EventPayload", "EventName", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum EventParams {
        IdDocSetType("idDocSetType"),
        IsCancelled("isCancelled"),
        LevelName("levelName"),
        CountryCode("CountryCode"),
        DocumentType("DocumentType"),
        ByUser("ByUser"),
        Type("Type"),
        Value("Value"),
        ViewItem("ViewItem"),
        ApplicantId("applicantId"),
        ActionId(TUIConstants.TUIChat.INPUT_MORE_ACTION_ID),
        EventPayload("eventPayload"),
        EventName("eventName");

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        private final String value;

        @NotNull
        public static EnumEntries<EventParams> getEntries() {
            return $ENTRIES;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        EventParams(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$EventType;", "", "<init>", "(Ljava/lang/String;I)V", "Analytics", "StepInitiated", "StepCompleted", "CountrySelected", "ApplicantLoaded", "ApplicantDataUpdated", "ItemClicked", "VerificationStarted", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum EventType {
        Analytics,
        StepInitiated,
        StepCompleted,
        CountrySelected,
        ApplicantLoaded,
        ApplicantDataUpdated,
        ItemClicked,
        VerificationStarted;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<EventType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$PhotoAccepted;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "idDocSetType", "", "<init>", "(Ljava/lang/String;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class PhotoAccepted extends SNSEvent {
        public PhotoAccepted(@NotNull String str) {
            super("ItemClicked", MapsKt.mapOf(TuplesKt.m90091to(EventParams.ViewItem.getValue(), "PhotoAccepted"), TuplesKt.m90091to(EventParams.IdDocSetType.getValue(), str)), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$PhotoDeclined;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "idDocSetType", "", "<init>", "(Ljava/lang/String;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class PhotoDeclined extends SNSEvent {
        public PhotoDeclined(@NotNull String str) {
            super("ItemClicked", MapsKt.mapOf(TuplesKt.m90091to(EventParams.ViewItem.getValue(), "RetakePhoto"), TuplesKt.m90091to(EventParams.IdDocSetType.getValue(), str)), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventAnalytics;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "event", "Lcom/sumsub/sns/core/data/model/SNSTrackEvents;", "<init>", "(Lcom/sumsub/sns/core/data/model/SNSTrackEvents;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class SNSEventAnalytics extends SNSEvent {
        /* JADX WARN: Illegal instructions before constructor call */
        public SNSEventAnalytics(@NotNull SNSTrackEvents sNSTrackEvents) {
            String value = EventParams.EventPayload.getValue();
            Map<String, Object> payload = sNSTrackEvents.getPayload();
            super("Analytics", MapsKt.mapOf(TuplesKt.m90091to(value, payload == null ? MapsKt.emptyMap() : payload), TuplesKt.m90091to(EventParams.EventName.getValue(), sNSTrackEvents.getActivity())), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventApplicantLoaded;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "applicantId", "", TUIConstants.TUIChat.INPUT_MORE_ACTION_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class SNSEventApplicantLoaded extends SNSEvent {
        public SNSEventApplicantLoaded(@NotNull String str, @NotNull String str2) {
            super("ApplicantLoaded", MapsKt.mapOf(TuplesKt.m90091to(EventParams.ApplicantId.getValue(), str), TuplesKt.m90091to(EventParams.ActionId.getValue(), str2)), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepInitiated;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "applicantId", "", "idDocSetType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class SNSEventStepInitiated extends SNSEvent {
        public SNSEventStepInitiated(@NotNull String str, @NotNull String str2) {
            super("StepInitiated", MapsKt.mapOf(TuplesKt.m90091to(EventParams.ApplicantId.getValue(), str), TuplesKt.m90091to(EventParams.IdDocSetType.getValue(), str2)), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$ShowMoreGuidance;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class ShowMoreGuidance extends SNSEvent {

        @NotNull
        public static final ShowMoreGuidance INSTANCE = new ShowMoreGuidance();

        private ShowMoreGuidance() {
            super("ItemClicked", MapsKt.mapOf(TuplesKt.m90091to(EventParams.ViewItem.getValue(), "MoreGuidance")), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$SupportItemClicked;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "type", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class SupportItemClicked extends SNSEvent {
        public SupportItemClicked(@NotNull String str, @NotNull String str2) {
            super("ItemClicked", MapsKt.mapOf(TuplesKt.m90091to(EventParams.ViewItem.getValue(), "SupportItem"), TuplesKt.m90091to(EventParams.Type.getValue(), str), TuplesKt.m90091to(EventParams.Value.getValue(), str2)), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$UserStartedVerification;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class UserStartedVerification extends SNSEvent {

        @NotNull
        public static final UserStartedVerification INSTANCE = new UserStartedVerification();

        private UserStartedVerification() {
            super("ItemClicked", MapsKt.mapOf(TuplesKt.m90091to(EventParams.ViewItem.getValue(), "Continue")), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$VerificationStarted;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "applicantId", "", "<init>", "(Ljava/lang/String;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class VerificationStarted extends SNSEvent {
        public VerificationStarted(@NotNull String str) {
            super("VerificationStarted", MapsKt.mapOf(TuplesKt.m90091to(EventParams.ApplicantId.getValue(), str)), null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$ViewItem;", "", "<init>", "(Ljava/lang/String;I)V", "Continue", "SupportItem", "MoreGuidance", "RetakePhoto", "PhotoAccepted", "DocumentType", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public enum ViewItem {
        Continue,
        SupportItem,
        MoreGuidance,
        RetakePhoto,
        PhotoAccepted,
        DocumentType;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<ViewItem> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ SNSEvent(String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map);
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepCompleted;", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "applicantId", "", "idDocSetType", "isCancelled", "", "levelName", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSNSEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSEventHandler.kt\ncom/sumsub/sns/core/data/listener/SNSEvent$SNSEventStepCompleted\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
    public static final class SNSEventStepCompleted extends SNSEvent {
        /* JADX WARN: Illegal instructions before constructor call */
        public SNSEventStepCompleted(@NotNull String str, @NotNull String str2, boolean z11, @Nullable String str3) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put(EventParams.ApplicantId.getValue(), str);
            mapCreateMapBuilder.put(EventParams.IdDocSetType.getValue(), str2);
            mapCreateMapBuilder.put(EventParams.IsCancelled.getValue(), Boolean.valueOf(z11));
            if (str3 != null) {
                mapCreateMapBuilder.put(EventParams.LevelName.getValue(), str3);
            }
            Unit unit = Unit.INSTANCE;
            super("StepCompleted", MapsKt.build(mapCreateMapBuilder), null);
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.core.data.listener.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSEvent._childSerializers$_anonymous_();
            }
        })};
        $cachedSerializer$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.sumsub.sns.core.data.listener.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SNSEvent._init_$_anonymous_$0();
            }
        });
    }

    public /* synthetic */ SNSEvent(int i11, String str, Map map, C41876r2 c41876r2) {
        this.eventType = str;
        if ((i11 & 2) == 0) {
            this.payload = null;
        } else {
            this.payload = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC44951d _childSerializers$_anonymous_() {
        return new C41790a1(C41897w2.f92051a, new C44947b(Reflection.getOrCreateKotlinClass(Object.class), null, new InterfaceC44951d[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC44951d _init_$_anonymous_$0() {
        return new C44960m("com.sumsub.sns.core.data.listener.SNSEvent", Reflection.getOrCreateKotlinClass(SNSEvent.class), new KClass[0], new InterfaceC44951d[0], new Annotation[0]);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(SNSEvent self, InterfaceC45829b output, InterfaceC45533f serialDesc) {
        Lazy<InterfaceC44951d<Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.eventType);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.payload == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.payload);
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @Nullable
    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    private SNSEvent(String str, Map<String, ? extends Object> map) {
        this.eventType = str;
        this.payload = map;
    }

    public /* synthetic */ SNSEvent(String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : map, null);
    }
}
