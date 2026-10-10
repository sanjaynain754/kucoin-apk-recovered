package com.google.firebase.sessions.settings;

import android.util.Log;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RemoteSettings.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m90084d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m90122f = "RemoteSettings.kt", m90123i = {0, 0, 0, 1, 1, 2}, m90124l = {125, 128, 131, 133, 134, 136}, m90125m = "invokeSuspend", m90126n = {"sessionSamplingRate", "sessionTimeoutSeconds", "cacheDuration", "sessionSamplingRate", "cacheDuration", "cacheDuration"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
@SourceDebugExtension({"SMAP\nRemoteSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings$updateSettings$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
public final class RemoteSettings$updateSettings$2$1 extends SuspendLambda implements Function2<JSONObject, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, Continuation<? super RemoteSettings$updateSettings$2$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteSettings;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, continuation);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull JSONObject jSONObject, @Nullable Continuation<? super Unit> continuation) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0119 A[PHI: r0 r1
      0x0119: PHI (r0v9 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r0v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v11 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:44:0x00fc, B:46:0x0115, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r1v11 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r1v6 kotlin.jvm.internal.Ref$ObjectRef)
      (r1v6 kotlin.jvm.internal.Ref$ObjectRef)
      (r1v15 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:44:0x00fc, B:46:0x0115, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x011f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139 A[PHI: r0
      0x0139: PHI (r0v12 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r0v9 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v9 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v16 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:49:0x011d, B:51:0x0136, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:59:0x015c  */
    /* JADX WARN: Code duplicated, block: B:61:0x015f  */
    /* JADX WARN: Code duplicated, block: B:64:0x017c  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        if (r13.updateSessionCacheDuration(r0, r12) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0197, code lost:
    
        if (r13.updateSessionCacheUpdatedTime(r0, r12) == r4) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
        Ref.ObjectRef objectRef;
        Boolean bool;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        SettingsCache settingsCache;
        Integer num;
        SettingsCache settingsCache2;
        Double d11;
        Unit unit;
        SettingsCache settingsCache3;
        Integer numBoxInt;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                JSONObject jSONObject = (JSONObject) this.L$0;
                Log.d(RemoteSettings.TAG, "Fetched settings: " + jSONObject);
                Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                if (jSONObject.has("app_quality")) {
                    Object obj2 = jSONObject.get("app_quality");
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            if (jSONObject2.has("sampling_rate")) {
                                objectRef6.element = (Double) jSONObject2.get("sampling_rate");
                            }
                            if (jSONObject2.has("session_timeout_seconds")) {
                                objectRef.element = (Integer) jSONObject2.get("session_timeout_seconds");
                            }
                            if (jSONObject2.has("cache_duration")) {
                                objectRef7.element = (Integer) jSONObject2.get("cache_duration");
                            }
                        } catch (JSONException e11) {
                            e = e11;
                            Log.e(RemoteSettings.TAG, "Error parsing the configs remotely fetched: ", e);
                        }
                    } catch (JSONException e12) {
                        e = e12;
                        bool = null;
                    }
                    break;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    SettingsCache settingsCache4 = this.this$0.getSettingsCache();
                    this.L$0 = objectRef6;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef7;
                    this.label = 1;
                    if (settingsCache4.updateSettingsEnabled(bool, this) != coroutine_suspended) {
                        objectRef4 = objectRef6;
                        objectRef5 = objectRef;
                        objectRef3 = objectRef7;
                        objectRef = objectRef5;
                        objectRef2 = objectRef4;
                        if (((Integer) objectRef.element) != null) {
                            settingsCache = this.this$0.getSettingsCache();
                            num = (Integer) objectRef.element;
                            this.L$0 = objectRef2;
                            this.L$1 = objectRef3;
                            this.L$2 = null;
                            this.label = 2;
                            if (settingsCache.updateSessionRestartTimeout(num, this) != coroutine_suspended) {
                                if (((Double) objectRef2.element) != null) {
                                    settingsCache2 = this.this$0.getSettingsCache();
                                    d11 = (Double) objectRef2.element;
                                    this.L$0 = objectRef3;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 3;
                                    if (settingsCache2.updateSamplingRate(d11, this) != coroutine_suspended) {
                                        if (((Integer) objectRef3.element) != null) {
                                            unit = null;
                                            if (unit != null) {
                                                SettingsCache settingsCache5 = this.this$0.getSettingsCache();
                                                Long lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.label = 6;
                                            } else {
                                                settingsCache3 = this.this$0.getSettingsCache();
                                                numBoxInt = Boxing.boxInt(86400);
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.label = 5;
                                                if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                                    SettingsCache settingsCache6 = this.this$0.getSettingsCache();
                                                    Long lBoxLong2 = Boxing.boxLong(System.currentTimeMillis());
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.label = 6;
                                                }
                                            }
                                        } else {
                                            SettingsCache settingsCache7 = this.this$0.getSettingsCache();
                                            Integer num2 = (Integer) objectRef3.element;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 4;
                                        }
                                    }
                                } else if (((Integer) objectRef3.element) != null) {
                                    unit = null;
                                    if (unit != null) {
                                        SettingsCache settingsCache8 = this.this$0.getSettingsCache();
                                        Long lBoxLong3 = Boxing.boxLong(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    } else {
                                        settingsCache3 = this.this$0.getSettingsCache();
                                        numBoxInt = Boxing.boxInt(86400);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 5;
                                        if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                            SettingsCache settingsCache9 = this.this$0.getSettingsCache();
                                            Long lBoxLong4 = Boxing.boxLong(System.currentTimeMillis());
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 6;
                                        }
                                    }
                                } else {
                                    SettingsCache settingsCache10 = this.this$0.getSettingsCache();
                                    Integer num3 = (Integer) objectRef3.element;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 4;
                                }
                            }
                        } else if (((Double) objectRef2.element) != null) {
                            settingsCache2 = this.this$0.getSettingsCache();
                            d11 = (Double) objectRef2.element;
                            this.L$0 = objectRef3;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            if (settingsCache2.updateSamplingRate(d11, this) != coroutine_suspended) {
                                if (((Integer) objectRef3.element) != null) {
                                    unit = null;
                                    if (unit != null) {
                                        SettingsCache settingsCache11 = this.this$0.getSettingsCache();
                                        Long lBoxLong5 = Boxing.boxLong(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    } else {
                                        settingsCache3 = this.this$0.getSettingsCache();
                                        numBoxInt = Boxing.boxInt(86400);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 5;
                                        if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                            SettingsCache settingsCache12 = this.this$0.getSettingsCache();
                                            Long lBoxLong6 = Boxing.boxLong(System.currentTimeMillis());
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 6;
                                        }
                                    }
                                } else {
                                    SettingsCache settingsCache13 = this.this$0.getSettingsCache();
                                    Integer num4 = (Integer) objectRef3.element;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 4;
                                }
                            }
                        } else if (((Integer) objectRef3.element) != null) {
                            unit = null;
                            if (unit != null) {
                                SettingsCache settingsCache14 = this.this$0.getSettingsCache();
                                Long lBoxLong7 = Boxing.boxLong(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            } else {
                                settingsCache3 = this.this$0.getSettingsCache();
                                numBoxInt = Boxing.boxInt(86400);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 5;
                                if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                    SettingsCache settingsCache15 = this.this$0.getSettingsCache();
                                    Long lBoxLong8 = Boxing.boxLong(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                }
                            }
                        } else {
                            SettingsCache settingsCache16 = this.this$0.getSettingsCache();
                            Integer num5 = (Integer) objectRef3.element;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                        }
                    }
                    break;
                } else {
                    objectRef2 = objectRef6;
                    objectRef3 = objectRef7;
                    if (((Integer) objectRef.element) != null) {
                        settingsCache = this.this$0.getSettingsCache();
                        num = (Integer) objectRef.element;
                        this.L$0 = objectRef2;
                        this.L$1 = objectRef3;
                        this.L$2 = null;
                        this.label = 2;
                        if (settingsCache.updateSessionRestartTimeout(num, this) != coroutine_suspended) {
                            if (((Double) objectRef2.element) != null) {
                                settingsCache2 = this.this$0.getSettingsCache();
                                d11 = (Double) objectRef2.element;
                                this.L$0 = objectRef3;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 3;
                                if (settingsCache2.updateSamplingRate(d11, this) != coroutine_suspended) {
                                    if (((Integer) objectRef3.element) != null) {
                                        unit = null;
                                        if (unit != null) {
                                            SettingsCache settingsCache17 = this.this$0.getSettingsCache();
                                            Long lBoxLong9 = Boxing.boxLong(System.currentTimeMillis());
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 6;
                                        } else {
                                            settingsCache3 = this.this$0.getSettingsCache();
                                            numBoxInt = Boxing.boxInt(86400);
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 5;
                                            if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                                SettingsCache settingsCache18 = this.this$0.getSettingsCache();
                                                Long lBoxLong10 = Boxing.boxLong(System.currentTimeMillis());
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.label = 6;
                                            }
                                        }
                                    } else {
                                        SettingsCache settingsCache19 = this.this$0.getSettingsCache();
                                        Integer num6 = (Integer) objectRef3.element;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 4;
                                    }
                                }
                            } else if (((Integer) objectRef3.element) != null) {
                                unit = null;
                                if (unit != null) {
                                    SettingsCache settingsCache110 = this.this$0.getSettingsCache();
                                    Long lBoxLong11 = Boxing.boxLong(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                } else {
                                    settingsCache3 = this.this$0.getSettingsCache();
                                    numBoxInt = Boxing.boxInt(86400);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 5;
                                    if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                        SettingsCache settingsCache111 = this.this$0.getSettingsCache();
                                        Long lBoxLong12 = Boxing.boxLong(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    }
                                }
                            } else {
                                SettingsCache settingsCache112 = this.this$0.getSettingsCache();
                                Integer num7 = (Integer) objectRef3.element;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 4;
                            }
                        }
                    } else if (((Double) objectRef2.element) != null) {
                        settingsCache2 = this.this$0.getSettingsCache();
                        d11 = (Double) objectRef2.element;
                        this.L$0 = objectRef3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        if (settingsCache2.updateSamplingRate(d11, this) != coroutine_suspended) {
                            if (((Integer) objectRef3.element) != null) {
                                unit = null;
                                if (unit != null) {
                                    SettingsCache settingsCache113 = this.this$0.getSettingsCache();
                                    Long lBoxLong13 = Boxing.boxLong(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                } else {
                                    settingsCache3 = this.this$0.getSettingsCache();
                                    numBoxInt = Boxing.boxInt(86400);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 5;
                                    if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                        SettingsCache settingsCache114 = this.this$0.getSettingsCache();
                                        Long lBoxLong14 = Boxing.boxLong(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    }
                                }
                            } else {
                                SettingsCache settingsCache115 = this.this$0.getSettingsCache();
                                Integer num8 = (Integer) objectRef3.element;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 4;
                            }
                        }
                    } else if (((Integer) objectRef3.element) != null) {
                        unit = null;
                        if (unit != null) {
                            SettingsCache settingsCache116 = this.this$0.getSettingsCache();
                            Long lBoxLong15 = Boxing.boxLong(System.currentTimeMillis());
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                        } else {
                            settingsCache3 = this.this$0.getSettingsCache();
                            numBoxInt = Boxing.boxInt(86400);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                SettingsCache settingsCache117 = this.this$0.getSettingsCache();
                                Long lBoxLong16 = Boxing.boxLong(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            }
                        }
                    } else {
                        SettingsCache settingsCache118 = this.this$0.getSettingsCache();
                        Integer num9 = (Integer) objectRef3.element;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                    }
                    break;
                }
                return coroutine_suspended;
            case 1:
                objectRef3 = (Ref.ObjectRef) this.L$2;
                objectRef5 = (Ref.ObjectRef) this.L$1;
                objectRef4 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                objectRef = objectRef5;
                objectRef2 = objectRef4;
                if (((Integer) objectRef.element) != null) {
                    settingsCache = this.this$0.getSettingsCache();
                    num = (Integer) objectRef.element;
                    this.L$0 = objectRef2;
                    this.L$1 = objectRef3;
                    this.L$2 = null;
                    this.label = 2;
                    if (settingsCache.updateSessionRestartTimeout(num, this) != coroutine_suspended) {
                        if (((Double) objectRef2.element) != null) {
                            settingsCache2 = this.this$0.getSettingsCache();
                            d11 = (Double) objectRef2.element;
                            this.L$0 = objectRef3;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            if (settingsCache2.updateSamplingRate(d11, this) != coroutine_suspended) {
                                if (((Integer) objectRef3.element) != null) {
                                    unit = null;
                                    if (unit != null) {
                                        SettingsCache settingsCache119 = this.this$0.getSettingsCache();
                                        Long lBoxLong17 = Boxing.boxLong(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    } else {
                                        settingsCache3 = this.this$0.getSettingsCache();
                                        numBoxInt = Boxing.boxInt(86400);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 5;
                                        if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                            SettingsCache settingsCache1110 = this.this$0.getSettingsCache();
                                            Long lBoxLong18 = Boxing.boxLong(System.currentTimeMillis());
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 6;
                                        }
                                    }
                                } else {
                                    SettingsCache settingsCache1111 = this.this$0.getSettingsCache();
                                    Integer num10 = (Integer) objectRef3.element;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 4;
                                }
                            }
                        } else if (((Integer) objectRef3.element) != null) {
                            unit = null;
                            if (unit != null) {
                                SettingsCache settingsCache1112 = this.this$0.getSettingsCache();
                                Long lBoxLong19 = Boxing.boxLong(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            } else {
                                settingsCache3 = this.this$0.getSettingsCache();
                                numBoxInt = Boxing.boxInt(86400);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 5;
                                if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                    SettingsCache settingsCache1113 = this.this$0.getSettingsCache();
                                    Long lBoxLong110 = Boxing.boxLong(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                }
                            }
                        } else {
                            SettingsCache settingsCache1114 = this.this$0.getSettingsCache();
                            Integer num11 = (Integer) objectRef3.element;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                        }
                    }
                    break;
                } else {
                    if (((Double) objectRef2.element) != null) {
                        settingsCache2 = this.this$0.getSettingsCache();
                        d11 = (Double) objectRef2.element;
                        this.L$0 = objectRef3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        if (settingsCache2.updateSamplingRate(d11, this) != coroutine_suspended) {
                            if (((Integer) objectRef3.element) != null) {
                                unit = null;
                                if (unit != null) {
                                    SettingsCache settingsCache1115 = this.this$0.getSettingsCache();
                                    Long lBoxLong111 = Boxing.boxLong(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                } else {
                                    settingsCache3 = this.this$0.getSettingsCache();
                                    numBoxInt = Boxing.boxInt(86400);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 5;
                                    if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                        SettingsCache settingsCache1116 = this.this$0.getSettingsCache();
                                        Long lBoxLong112 = Boxing.boxLong(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    }
                                }
                            } else {
                                SettingsCache settingsCache1117 = this.this$0.getSettingsCache();
                                Integer num12 = (Integer) objectRef3.element;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 4;
                            }
                        }
                    } else if (((Integer) objectRef3.element) != null) {
                        unit = null;
                        if (unit != null) {
                            SettingsCache settingsCache1118 = this.this$0.getSettingsCache();
                            Long lBoxLong113 = Boxing.boxLong(System.currentTimeMillis());
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                        } else {
                            settingsCache3 = this.this$0.getSettingsCache();
                            numBoxInt = Boxing.boxInt(86400);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                SettingsCache settingsCache1119 = this.this$0.getSettingsCache();
                                Long lBoxLong114 = Boxing.boxLong(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            }
                        }
                    } else {
                        SettingsCache settingsCache11110 = this.this$0.getSettingsCache();
                        Integer num13 = (Integer) objectRef3.element;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                    }
                    break;
                }
                return coroutine_suspended;
            case 2:
                objectRef3 = (Ref.ObjectRef) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Double) objectRef2.element) != null) {
                    settingsCache2 = this.this$0.getSettingsCache();
                    d11 = (Double) objectRef2.element;
                    this.L$0 = objectRef3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (settingsCache2.updateSamplingRate(d11, this) != coroutine_suspended) {
                        if (((Integer) objectRef3.element) != null) {
                            unit = null;
                            if (unit != null) {
                                SettingsCache settingsCache11111 = this.this$0.getSettingsCache();
                                Long lBoxLong115 = Boxing.boxLong(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            } else {
                                settingsCache3 = this.this$0.getSettingsCache();
                                numBoxInt = Boxing.boxInt(86400);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 5;
                                if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                    SettingsCache settingsCache11112 = this.this$0.getSettingsCache();
                                    Long lBoxLong116 = Boxing.boxLong(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                }
                            }
                        } else {
                            SettingsCache settingsCache11113 = this.this$0.getSettingsCache();
                            Integer num14 = (Integer) objectRef3.element;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                        }
                    }
                    break;
                } else {
                    if (((Integer) objectRef3.element) != null) {
                        unit = null;
                        if (unit != null) {
                            SettingsCache settingsCache11114 = this.this$0.getSettingsCache();
                            Long lBoxLong117 = Boxing.boxLong(System.currentTimeMillis());
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                        } else {
                            settingsCache3 = this.this$0.getSettingsCache();
                            numBoxInt = Boxing.boxInt(86400);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                                SettingsCache settingsCache11115 = this.this$0.getSettingsCache();
                                Long lBoxLong118 = Boxing.boxLong(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            }
                        }
                    } else {
                        SettingsCache settingsCache11116 = this.this$0.getSettingsCache();
                        Integer num15 = (Integer) objectRef3.element;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                    }
                    break;
                }
                return coroutine_suspended;
            case 3:
                objectRef3 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Integer) objectRef3.element) != null) {
                    SettingsCache settingsCache11117 = this.this$0.getSettingsCache();
                    Integer num16 = (Integer) objectRef3.element;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    break;
                } else {
                    unit = null;
                    if (unit != null) {
                        SettingsCache settingsCache11118 = this.this$0.getSettingsCache();
                        Long lBoxLong119 = Boxing.boxLong(System.currentTimeMillis());
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 6;
                    } else {
                        settingsCache3 = this.this$0.getSettingsCache();
                        numBoxInt = Boxing.boxInt(86400);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                            SettingsCache settingsCache11119 = this.this$0.getSettingsCache();
                            Long lBoxLong1110 = Boxing.boxLong(System.currentTimeMillis());
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                        }
                    }
                    break;
                }
                return coroutine_suspended;
            case 4:
                ResultKt.throwOnFailure(obj);
                unit = Unit.INSTANCE;
                if (unit != null) {
                    settingsCache3 = this.this$0.getSettingsCache();
                    numBoxInt = Boxing.boxInt(86400);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (settingsCache3.updateSessionCacheDuration(numBoxInt, this) != coroutine_suspended) {
                        SettingsCache settingsCache111110 = this.this$0.getSettingsCache();
                        Long lBoxLong1111 = Boxing.boxLong(System.currentTimeMillis());
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 6;
                    }
                    break;
                } else {
                    SettingsCache settingsCache111111 = this.this$0.getSettingsCache();
                    Long lBoxLong1112 = Boxing.boxLong(System.currentTimeMillis());
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 6;
                    break;
                }
                return coroutine_suspended;
            case 5:
                ResultKt.throwOnFailure(obj);
                SettingsCache settingsCache111112 = this.this$0.getSettingsCache();
                Long lBoxLong1113 = Boxing.boxLong(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                break;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
