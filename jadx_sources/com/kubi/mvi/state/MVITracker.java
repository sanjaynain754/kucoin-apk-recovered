package com.kubi.mvi.state;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.monitor.TechnologyEvent;
import com.kubi.mvi.common.C19240b;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.common.MviExKt;
import com.kubi.otc.entity.OtcAd;
import com.kubi.p110rn.Constants;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MVITracker.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/mvi/state/MVITracker;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final class MVITracker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: MVITracker.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u000fJ%\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u0007*\u00020\u001e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001f\u0010 J0\u0010$\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00070!¢\u0006\u0002\b\"H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010'¨\u0006*"}, m90084d2 = {"Lcom/kubi/mvi/state/MVITracker$Companion;", "", "<init>", "()V", "", "businessType", "intentName", "", "trackStartHandleIntent", "(Ljava/lang/String;Ljava/lang/String;)V", "", TypedValues.TransitionType.S_DURATION, "", "throwable", "trackEndHandleIntent", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Throwable;)V", "", "openLog", "stateName", "trackStartHandleState", "(Ljava/lang/String;ZLjava/lang/String;)V", "trackEndHandleState", "trackEndRenderUI", "(Ljava/lang/String;Ljava/lang/String;J)V", "isStateEvent", "eventName", "trackEventStart", "(ZLjava/lang/String;Ljava/lang/String;)V", "trackEventEnd", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;", "b", "(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "CODE_CANCEL", "Ljava/lang/String;", "CODE_FAIL", "CODE_SUCCESS", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMVITracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MVITracker.kt\ncom/kubi/mvi/state/MVITracker$Companion\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,186:1\n167#2,4:187\n175#2,4:191\n*S KotlinDebug\n*F\n+ 1 MVITracker.kt\ncom/kubi/mvi/state/MVITracker$Companion\n*L\n161#1:187,4\n163#1:191,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void trackEndHandleIntent$default(Companion companion, String str, String str2, long j11, Throwable th2, int i11, Object obj) throws JSONException {
            if ((i11 & 8) != 0) {
                th2 = null;
            }
            companion.trackEndHandleIntent(str, str2, j11, th2);
        }

        public static /* synthetic */ void trackEndHandleState$default(Companion companion, String str, String str2, long j11, Throwable th2, int i11, Object obj) throws JSONException {
            if ((i11 & 8) != 0) {
                th2 = null;
            }
            companion.trackEndHandleState(str, str2, j11, th2);
        }

        public static /* synthetic */ void trackEventEnd$default(Companion companion, boolean z11, String str, String str2, Throwable th2, int i11, Object obj) throws JSONException {
            if ((i11 & 2) != 0) {
                str = "";
            }
            if ((i11 & 8) != 0) {
                th2 = null;
            }
            companion.trackEventEnd(z11, str, str2, th2);
        }

        public static /* synthetic */ void trackEventStart$default(Companion companion, boolean z11, String str, String str2, int i11, Object obj) throws JSONException {
            if ((i11 & 2) != 0) {
                str = "";
            }
            companion.trackEventStart(z11, str, str2);
        }

        /* JADX INFO: renamed from: a */
        public final void m42559a(String businessType, Function1<? super TechnologyEvent.EventParametersBuilder, Unit> block) throws JSONException {
            C19240b.m42527b("mvi_event_tracker", businessType, C19241c.f35620a.m42528a(), null, false, block, 24, null);
        }

        /* JADX INFO: renamed from: b */
        public final void m42560b(TechnologyEvent.EventParametersBuilder eventParametersBuilder, Throwable th2) {
            if (th2 == null) {
                eventParametersBuilder.m42393d("code", "200");
                eventParametersBuilder.m42394e("success", true);
                return;
            }
            eventParametersBuilder.m42394e("success", false);
            eventParametersBuilder.m42393d("error_message", C27041f.m66668h(th2.getMessage()));
            boolean zM42516l = MviExKt.m42516l(th2);
            if (zM42516l) {
                eventParametersBuilder.m42393d("code", OtcAd.KYC_NOT_PASS);
            }
            if (zM42516l) {
                return;
            }
            eventParametersBuilder.m42393d("code", "-2");
        }

        public final void trackEndHandleIntent(@NotNull String businessType, @NotNull final String intentName, final long duration, @Nullable final Throwable throwable) throws JSONException {
            Intrinsics.checkNotNullParameter(businessType, "businessType");
            Intrinsics.checkNotNullParameter(intentName, "intentName");
            m42559a(businessType, new Function1<TechnologyEvent.EventParametersBuilder, Unit>() { // from class: com.kubi.mvi.state.MVITracker$Companion$trackEndHandleIntent$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TechnologyEvent.EventParametersBuilder eventParametersBuilder) {
                    invoke2(eventParametersBuilder);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TechnologyEvent.EventParametersBuilder track) {
                    Intrinsics.checkNotNullParameter(track, "$this$track");
                    track.m42393d("type", "intent_end");
                    track.m42392c(TypedValues.TransitionType.S_DURATION, duration);
                    track.m42393d(FirebaseAnalytics.Param.METHOD, intentName);
                    MVITracker.INSTANCE.m42560b(track, throwable);
                }
            });
        }

        public final void trackEndHandleState(@NotNull String businessType, @NotNull final String stateName, final long duration, @Nullable final Throwable throwable) throws JSONException {
            Intrinsics.checkNotNullParameter(businessType, "businessType");
            Intrinsics.checkNotNullParameter(stateName, "stateName");
            m42559a(businessType, new Function1<TechnologyEvent.EventParametersBuilder, Unit>() { // from class: com.kubi.mvi.state.MVITracker$Companion$trackEndHandleState$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TechnologyEvent.EventParametersBuilder eventParametersBuilder) {
                    invoke2(eventParametersBuilder);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TechnologyEvent.EventParametersBuilder track) {
                    Intrinsics.checkNotNullParameter(track, "$this$track");
                    track.m42393d("type", "state_handle_end");
                    track.m42394e("success", true);
                    track.m42393d(FirebaseAnalytics.Param.METHOD, stateName);
                    track.m42392c(TypedValues.TransitionType.S_DURATION, duration);
                    MVITracker.INSTANCE.m42560b(track, throwable);
                }
            });
        }

        public final void trackEndRenderUI(@NotNull String businessType, @NotNull final String stateName, final long duration) throws JSONException {
            Intrinsics.checkNotNullParameter(businessType, "businessType");
            Intrinsics.checkNotNullParameter(stateName, "stateName");
            m42559a(businessType, new Function1<TechnologyEvent.EventParametersBuilder, Unit>() { // from class: com.kubi.mvi.state.MVITracker$Companion$trackEndRenderUI$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TechnologyEvent.EventParametersBuilder eventParametersBuilder) {
                    invoke2(eventParametersBuilder);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TechnologyEvent.EventParametersBuilder track) {
                    Intrinsics.checkNotNullParameter(track, "$this$track");
                    track.m42393d("type", "state_render_end");
                    track.m42394e("success", true);
                    track.m42393d(FirebaseAnalytics.Param.METHOD, stateName);
                    track.m42392c(TypedValues.TransitionType.S_DURATION, duration);
                }
            });
        }

        public final void trackEventEnd(final boolean isStateEvent, @NotNull String businessType, @NotNull final String eventName, @Nullable final Throwable throwable) throws JSONException {
            Intrinsics.checkNotNullParameter(businessType, "businessType");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            m42559a(businessType, new Function1<TechnologyEvent.EventParametersBuilder, Unit>() { // from class: com.kubi.mvi.state.MVITracker$Companion$trackEventEnd$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TechnologyEvent.EventParametersBuilder eventParametersBuilder) {
                    invoke2(eventParametersBuilder);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TechnologyEvent.EventParametersBuilder track) {
                    Intrinsics.checkNotNullParameter(track, "$this$track");
                    if (isStateEvent) {
                        track.m42393d("type", "state_event_end");
                    } else {
                        track.m42393d("type", "event_end");
                    }
                    track.m42393d(FirebaseAnalytics.Param.METHOD, eventName);
                    MVITracker.INSTANCE.m42560b(track, throwable);
                }
            });
        }

        public final void trackEventStart(final boolean isStateEvent, @NotNull String businessType, @NotNull final String eventName) throws JSONException {
            Intrinsics.checkNotNullParameter(businessType, "businessType");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            m42559a(businessType, new Function1<TechnologyEvent.EventParametersBuilder, Unit>() { // from class: com.kubi.mvi.state.MVITracker$Companion$trackEventStart$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TechnologyEvent.EventParametersBuilder eventParametersBuilder) {
                    invoke2(eventParametersBuilder);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TechnologyEvent.EventParametersBuilder track) {
                    Intrinsics.checkNotNullParameter(track, "$this$track");
                    if (isStateEvent) {
                        track.m42393d("type", "state_event_start");
                    } else {
                        track.m42393d("type", "event_start");
                    }
                    track.m42393d(FirebaseAnalytics.Param.METHOD, eventName);
                }
            });
        }

        public final void trackStartHandleIntent(@NotNull final String businessType, @NotNull final String intentName) throws JSONException {
            Intrinsics.checkNotNullParameter(businessType, "businessType");
            Intrinsics.checkNotNullParameter(intentName, "intentName");
            m42559a(businessType, new Function1<TechnologyEvent.EventParametersBuilder, Unit>() { // from class: com.kubi.mvi.state.MVITracker$Companion$trackStartHandleIntent$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TechnologyEvent.EventParametersBuilder eventParametersBuilder) {
                    invoke2(eventParametersBuilder);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TechnologyEvent.EventParametersBuilder track) {
                    Intrinsics.checkNotNullParameter(track, "$this$track");
                    track.m42393d("type", "intent_start");
                    track.m42393d(FirebaseAnalytics.Param.METHOD, intentName);
                    track.m42393d(Constants.BIZ, businessType);
                }
            });
        }

        public final void trackStartHandleState(@NotNull String businessType, boolean openLog, @NotNull final String stateName) throws JSONException {
            Intrinsics.checkNotNullParameter(businessType, "businessType");
            Intrinsics.checkNotNullParameter(stateName, "stateName");
            m42559a(businessType, new Function1<TechnologyEvent.EventParametersBuilder, Unit>() { // from class: com.kubi.mvi.state.MVITracker$Companion$trackStartHandleState$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TechnologyEvent.EventParametersBuilder eventParametersBuilder) {
                    invoke2(eventParametersBuilder);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TechnologyEvent.EventParametersBuilder track) {
                    Intrinsics.checkNotNullParameter(track, "$this$track");
                    track.m42393d("type", "state_handle_start");
                    track.m42393d(FirebaseAnalytics.Param.METHOD, stateName);
                }
            });
        }
    }
}
