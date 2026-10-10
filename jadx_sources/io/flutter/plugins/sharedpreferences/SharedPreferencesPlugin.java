package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.p021ts.TsExtractor;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001dJ \u0010\u001e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010 \u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u0010\"\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010#\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160$2\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J \u0010%\u001a\u00020\r2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J,\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020)0(2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001f\u0010*\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010+J\u001f\u0010,\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010-J\u001f\u0010.\u001a\u0004\u0018\u00010!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010/J\u001a\u00100\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u00101\u001a\u0004\u0018\u0001022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J \u00103\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u00104\u001a\b\u0012\u0004\u0012\u00020\u00160$2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J*\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020)0(2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010$H\u0082@¢\u0006\u0002\u00106J\u001a\u00107\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u000309\u0018\u000108H\u0082@¢\u0006\u0002\u0010:J\u001c\u0010;\u001a\u0004\u0018\u00010)2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u000309H\u0082@¢\u0006\u0002\u0010<R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m90084d2 = {"Lio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesAsyncApi;", "<init>", "()V", "listEncoder", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;", "(Lio/flutter/plugins/sharedpreferences/SharedPreferencesListEncoder;)V", "context", "Landroid/content/Context;", "backend", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesBackend;", "setUp", "", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "onAttachedToEngine", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "setBool", "key", "", "value", "", "options", "Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;", "setString", "dataStoreSetString", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setInt", "", "setDouble", "", "setEncodedStringList", "setDeprecatedStringList", "", "clear", "allowList", "getAll", "", "", "getInt", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Long;", "getBool", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Boolean;", "getDouble", "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/SharedPreferencesPigeonOptions;)Ljava/lang/Double;", "getString", "getStringList", "Lio/flutter/plugins/sharedpreferences/StringListResult;", "getPlatformEncodedStringList", "getKeys", "getPrefs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAllKeys", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValueByKey", "(Landroidx/datastore/preferences/core/Preferences$Key;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_preferences_android_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSharedPreferencesPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,520:1\n808#2,11:521\n1863#2,2:532\n53#3:534\n55#3:538\n53#3:539\n55#3:543\n50#4:535\n55#4:537\n50#4:540\n55#4:542\n107#5:536\n107#5:541\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin\n*L\n237#1:521,11\n257#1:532,2\n270#1:534\n270#1:538\n275#1:539\n275#1:543\n270#1:535\n270#1:537\n275#1:540\n275#1:542\n270#1:536\n275#1:541\n*E\n"})
public final class SharedPreferencesPlugin implements FlutterPlugin, SharedPreferencesAsyncApi {

    @Nullable
    private SharedPreferencesBackend backend;
    private Context context;

    @NotNull
    private SharedPreferencesListEncoder listEncoder;

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Landroidx/datastore/preferences/core/Preferences;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Landroidx/datastore/preferences/core/Preferences;"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {134}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C388811 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Preferences>, Object> {
        final /* synthetic */ List<String> $allowList;
        int label;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        @SourceDebugExtension({"SMAP\nSharedPreferencesPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$clear$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,520:1\n1863#2,2:521\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$clear$1$1\n*L\n136#1:521,2\n*E\n"})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<String> $allowList;
            /* synthetic */ Object L$0;
            int label;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<String> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$allowList = list;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowList, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                    List<String> list = this.$allowList;
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            mutablePreferences.remove(PreferencesKeys.booleanKey((String) it.next()));
                        }
                    } else {
                        mutablePreferences.clear();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388811(List<String> list, Continuation<? super C388811> continuation) {
            super(2, continuation);
            this.$allowList = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedPreferencesPlugin.this.new C388811(this.$allowList, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Preferences> continuation) {
            return ((C388811) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Context context = SharedPreferencesPlugin.this.context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$allowList, null);
            this.label = 1;
            Object objEdit = PreferencesKt.edit(sharedPreferencesDataStore, anonymousClass1, this);
            if (objEdit == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objEdit;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C388822 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ Preferences.Key<String> $stringKey;
        final /* synthetic */ String $value;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C388822) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388822(Preferences.Key<String> key, String str, Continuation<? super C388822> continuation) {
            super(2, continuation);
            this.$stringKey = key;
            this.$value = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C388822 c388822 = new C388822(this.$stringKey, this.$value, continuation);
            c388822.L$0 = obj;
            return c388822;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ((MutablePreferences) this.L$0).set(this.$stringKey, this.$value);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)Ljava/util/Map;"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {150}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C388831 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Map<String, ? extends Object>>, Object> {
        final /* synthetic */ List<String> $allowList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388831(List<String> list, Continuation<? super C388831> continuation) {
            super(2, continuation);
            this.$allowList = list;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedPreferencesPlugin.this.new C388831(this.$allowList, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Map<String, ? extends Object>> continuation) {
            return ((C388831) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
            List<String> list = this.$allowList;
            this.label = 1;
            Object prefs = sharedPreferencesPlugin.getPrefs(list, this);
            if (prefs == coroutine_suspended) {
                return coroutine_suspended;
            }
            return prefs;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {174}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSharedPreferencesPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getBool$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,520:1\n53#2:521\n55#2:525\n50#3:522\n55#3:524\n107#4:523\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getBool$1\n*L\n172#1:521\n172#1:525\n172#1:522\n172#1:524\n172#1:523\n*E\n"})
    public static final class C388841 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ Ref.ObjectRef<Boolean> $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388841(String str, SharedPreferencesPlugin sharedPreferencesPlugin, Ref.ObjectRef<Boolean> objectRef, Continuation<? super C388841> continuation) {
            super(2, continuation);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = objectRef;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C388841(this.$key, this.this$0, this.$value, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C388841) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<Boolean> objectRef;
            T t11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    objectRef = (Ref.ObjectRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    t11 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                final Preferences.Key<Boolean> keyBooleanKey = PreferencesKeys.booleanKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                final InterfaceC41634e<Preferences> data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                InterfaceC41634e<Boolean> interfaceC41634e = new InterfaceC41634e<Boolean>() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {2, 1, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getBool$1\n*L\n1#1,222:1\n54#2:223\n172#3:224\n*E\n"})
                    public static final class C388852<T> implements InterfaceC41635f {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC41635f $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C388852.this.emit(null, this);
                            }
                        }

                        public C388852(InterfaceC41635f interfaceC41635f, Preferences.Key key) {
                            this.$this_unsafeFlow = interfaceC41635f;
                            this.$preferencesKey$inlined = key;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        @Nullable
                        public final Object emit(Object obj, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = anonymousClass1.label;
                            if (i12 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC41635f interfaceC41635f = this.$this_unsafeFlow;
                                Object obj3 = ((Preferences) obj).get(this.$preferencesKey$inlined);
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i12 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC41634e
                    @Nullable
                    public Object collect(@NotNull InterfaceC41635f<? super Boolean> interfaceC41635f, @NotNull Continuation continuation) {
                        Object objCollect = data.collect(new C388852(interfaceC41635f, keyBooleanKey), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Ref.ObjectRef<Boolean> objectRef2 = this.$value;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objM90884H = C41636g.m90884H(interfaceC41634e, this);
                if (objM90884H == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t11 = objM90884H;
            }
            objectRef.element = t11;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {TsExtractor.TS_PACKET_SIZE}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSharedPreferencesPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getDouble$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,520:1\n53#2:521\n55#2:525\n50#3:522\n55#3:524\n107#4:523\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getDouble$1\n*L\n184#1:521\n184#1:525\n184#1:522\n184#1:524\n184#1:523\n*E\n"})
    public static final class C388861 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ Ref.ObjectRef<Double> $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388861(String str, SharedPreferencesPlugin sharedPreferencesPlugin, Ref.ObjectRef<Double> objectRef, Continuation<? super C388861> continuation) {
            super(2, continuation);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = objectRef;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C388861(this.$key, this.this$0, this.$value, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C388861) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<Double> objectRef;
            T t11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    objectRef = (Ref.ObjectRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    t11 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                final Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                final InterfaceC41634e<Preferences> data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                final SharedPreferencesPlugin sharedPreferencesPlugin = this.this$0;
                InterfaceC41634e<Double> interfaceC41634e = new InterfaceC41634e<Double>() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {2, 1, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getDouble$1\n*L\n1#1,222:1\n54#2:223\n185#3:224\n*E\n"})
                    public static final class C388872<T> implements InterfaceC41635f {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC41635f $this_unsafeFlow;
                        final /* synthetic */ SharedPreferencesPlugin this$0;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1$invokeSuspend$$inlined$map$1$2", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C388872.this.emit(null, this);
                            }
                        }

                        public C388872(InterfaceC41635f interfaceC41635f, Preferences.Key key, SharedPreferencesPlugin sharedPreferencesPlugin) {
                            this.$this_unsafeFlow = interfaceC41635f;
                            this.$preferencesKey$inlined = key;
                            this.this$0 = sharedPreferencesPlugin;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        @Nullable
                        public final Object emit(Object obj, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = anonymousClass1.label;
                            if (i12 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC41635f interfaceC41635f = this.$this_unsafeFlow;
                                Double d11 = (Double) SharedPreferencesPluginKt.transformPref(((Preferences) obj).get(this.$preferencesKey$inlined), this.this$0.listEncoder);
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(d11, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i12 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC41634e
                    @Nullable
                    public Object collect(@NotNull InterfaceC41635f<? super Double> interfaceC41635f, @NotNull Continuation continuation) {
                        Object objCollect = data.collect(new C388872(interfaceC41635f, keyStringKey, sharedPreferencesPlugin), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Ref.ObjectRef<Double> objectRef2 = this.$value;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objM90884H = C41636g.m90884H(interfaceC41634e, this);
                if (objM90884H == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t11 = objM90884H;
            }
            objectRef.element = t11;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {160}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSharedPreferencesPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getInt$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,520:1\n53#2:521\n55#2:525\n50#3:522\n55#3:524\n107#4:523\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getInt$1\n*L\n159#1:521\n159#1:525\n159#1:522\n159#1:524\n159#1:523\n*E\n"})
    public static final class C388881 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ Ref.ObjectRef<Long> $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388881(String str, SharedPreferencesPlugin sharedPreferencesPlugin, Ref.ObjectRef<Long> objectRef, Continuation<? super C388881> continuation) {
            super(2, continuation);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = objectRef;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C388881(this.$key, this.this$0, this.$value, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C388881) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<Long> objectRef;
            T t11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    objectRef = (Ref.ObjectRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    t11 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                final Preferences.Key<Long> keyLongKey = PreferencesKeys.longKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                final InterfaceC41634e<Preferences> data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                InterfaceC41634e<Long> interfaceC41634e = new InterfaceC41634e<Long>() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {2, 1, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getInt$1\n*L\n1#1,222:1\n54#2:223\n159#3:224\n*E\n"})
                    public static final class C388892<T> implements InterfaceC41635f {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC41635f $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1$invokeSuspend$$inlined$map$1$2", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C388892.this.emit(null, this);
                            }
                        }

                        public C388892(InterfaceC41635f interfaceC41635f, Preferences.Key key) {
                            this.$this_unsafeFlow = interfaceC41635f;
                            this.$preferencesKey$inlined = key;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        @Nullable
                        public final Object emit(Object obj, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = anonymousClass1.label;
                            if (i12 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC41635f interfaceC41635f = this.$this_unsafeFlow;
                                Object obj3 = ((Preferences) obj).get(this.$preferencesKey$inlined);
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i12 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC41634e
                    @Nullable
                    public Object collect(@NotNull InterfaceC41635f<? super Long> interfaceC41635f, @NotNull Continuation continuation) {
                        Object objCollect = data.collect(new C388892(interfaceC41635f, keyLongKey), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Ref.ObjectRef<Long> objectRef2 = this.$value;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objM90884H = C41636g.m90884H(interfaceC41634e, this);
                if (objM90884H == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t11 = objM90884H;
            }
            objectRef.element = t11;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getPrefs$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", m90122f = "SharedPreferencesPlugin.kt", m90123i = {0, 0, 0, 1, 1, 1, 1}, m90124l = {256, 258}, m90125m = "getPrefs", m90126n = {"this", "allowSet", "filteredMap", "this", "allowSet", "filteredMap", "key"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4"})
    public static final class C388901 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C388901(Continuation<? super C388901> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedPreferencesPlugin.this.getPrefs(null, this);
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {201}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nSharedPreferencesPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getString$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,520:1\n53#2:521\n55#2:525\n50#3:522\n55#3:524\n107#4:523\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getString$1\n*L\n199#1:521\n199#1:525\n199#1:522\n199#1:524\n199#1:523\n*E\n"})
    public static final class C388911 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ Ref.ObjectRef<String> $value;
        Object L$0;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388911(String str, SharedPreferencesPlugin sharedPreferencesPlugin, Ref.ObjectRef<String> objectRef, Continuation<? super C388911> continuation) {
            super(2, continuation);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = objectRef;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C388911(this.$key, this.this$0, this.$value, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C388911) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<String> objectRef;
            T t11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    objectRef = (Ref.ObjectRef) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    t11 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                final Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                final InterfaceC41634e<Preferences> data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
                InterfaceC41634e<String> interfaceC41634e = new InterfaceC41634e<String>() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {2, 1, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin$getString$1\n*L\n1#1,222:1\n54#2:223\n199#3:224\n*E\n"})
                    public static final class C388922<T> implements InterfaceC41635f {
                        final /* synthetic */ Preferences.Key $preferencesKey$inlined;
                        final /* synthetic */ InterfaceC41635f $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getString$1$invokeSuspend$$inlined$map$1$2", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C388922.this.emit(null, this);
                            }
                        }

                        public C388922(InterfaceC41635f interfaceC41635f, Preferences.Key key) {
                            this.$this_unsafeFlow = interfaceC41635f;
                            this.$preferencesKey$inlined = key;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        @Nullable
                        public final Object emit(Object obj, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = anonymousClass1.label;
                            if (i12 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC41635f interfaceC41635f = this.$this_unsafeFlow;
                                Object obj3 = ((Preferences) obj).get(this.$preferencesKey$inlined);
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i12 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC41634e
                    @Nullable
                    public Object collect(@NotNull InterfaceC41635f<? super String> interfaceC41635f, @NotNull Continuation continuation) {
                        Object objCollect = data.collect(new C388922(interfaceC41635f, keyStringKey), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Ref.ObjectRef<String> objectRef2 = this.$value;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objM90884H = C41636g.m90884H(interfaceC41634e, this);
                if (objM90884H == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef = objectRef2;
                t11 = objM90884H;
            }
            objectRef.element = t11;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {81}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C388951 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ boolean $value;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            final /* synthetic */ Preferences.Key<Boolean> $boolKey;
            final /* synthetic */ boolean $value;
            /* synthetic */ Object L$0;
            int label;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Preferences.Key<Boolean> key, boolean z11, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$boolKey = key;
                this.$value = z11;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$boolKey, this.$value, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((MutablePreferences) this.L$0).set(this.$boolKey, Boxing.boxBoolean(this.$value));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388951(String str, SharedPreferencesPlugin sharedPreferencesPlugin, boolean z11, Continuation<? super C388951> continuation) {
            super(2, continuation);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = z11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C388951(this.$key, this.this$0, this.$value, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C388951) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Preferences.Key<Boolean> keyBooleanKey = PreferencesKeys.booleanKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(keyBooleanKey, this.$value, null);
                this.label = 1;
                if (PreferencesKt.edit(sharedPreferencesDataStore, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDeprecatedStringList$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDeprecatedStringList$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {128}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C388961 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $valueString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388961(String str, String str2, Continuation<? super C388961> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$valueString = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedPreferencesPlugin.this.new C388961(this.$key, this.$valueString, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C388961) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$valueString;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {107}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C388971 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ double $value;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            final /* synthetic */ Preferences.Key<Double> $doubleKey;
            final /* synthetic */ double $value;
            /* synthetic */ Object L$0;
            int label;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Preferences.Key<Double> key, double d11, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$doubleKey = key;
                this.$value = d11;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$doubleKey, this.$value, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((MutablePreferences) this.L$0).set(this.$doubleKey, Boxing.boxDouble(this.$value));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388971(String str, SharedPreferencesPlugin sharedPreferencesPlugin, double d11, Continuation<? super C388971> continuation) {
            super(2, continuation);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = d11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C388971(this.$key, this.this$0, this.$value, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C388971) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Preferences.Key<Double> keyDoubleKey = PreferencesKeys.doubleKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(keyDoubleKey, this.$value, null);
                this.label = 1;
                if (PreferencesKt.edit(sharedPreferencesDataStore, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setEncodedStringList$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setEncodedStringList$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {117}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C388981 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388981(String str, String str2, Continuation<? super C388981> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$value = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedPreferencesPlugin.this.new C388981(this.$key, this.$value, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C388981) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$value;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {99}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C388991 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ long $value;
        int label;
        final /* synthetic */ SharedPreferencesPlugin this$0;

        /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setInt$1$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
            final /* synthetic */ Preferences.Key<Long> $intKey;
            final /* synthetic */ long $value;
            /* synthetic */ Object L$0;
            int label;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Preferences.Key<Long> key, long j11, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$intKey = key;
                this.$value = j11;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$intKey, this.$value, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((MutablePreferences) this.L$0).set(this.$intKey, Boxing.boxLong(this.$value));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C388991(String str, SharedPreferencesPlugin sharedPreferencesPlugin, long j11, Continuation<? super C388991> continuation) {
            super(2, continuation);
            this.$key = str;
            this.this$0 = sharedPreferencesPlugin;
            this.$value = j11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C388991(this.$key, this.this$0, this.$value, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C388991) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Preferences.Key<Long> keyLongKey = PreferencesKeys.longKey(this.$key);
                Context context = this.this$0.context;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                }
                DataStore<Preferences> sharedPreferencesDataStore = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(keyLongKey, this.$value, null);
                this.label = 1;
                if (PreferencesKt.edit(sharedPreferencesDataStore, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1 */
    /* JADX INFO: compiled from: SharedPreferencesPlugin.kt */
    /* JADX INFO: loaded from: classes60.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
    @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {87}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C389001 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C389001(String str, String str2, Continuation<? super C389001> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$value = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SharedPreferencesPlugin.this.new C389001(this.$key, this.$value, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C389001) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SharedPreferencesPlugin sharedPreferencesPlugin = SharedPreferencesPlugin.this;
                String str = this.$key;
                String str2 = this.$value;
                this.label = 1;
                if (sharedPreferencesPlugin.dataStoreSetString(str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public SharedPreferencesPlugin() {
        this.listEncoder = new ListEncoder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a3 -> B:33:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPrefs(List<String> list, Continuation<? super Map<String, ? extends Object>> continuation) {
        C388901 c388901;
        Set set;
        Map linkedHashMap;
        SharedPreferencesPlugin sharedPreferencesPlugin;
        Set set2;
        SharedPreferencesPlugin sharedPreferencesPlugin2;
        Map map;
        Iterator it;
        Preferences.Key<?> key;
        Object objTransformPref;
        if (continuation instanceof C388901) {
            c388901 = (C388901) continuation;
            int i11 = c388901.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c388901.label = i11 - Integer.MIN_VALUE;
            } else {
                c388901 = new C388901(continuation);
            }
        } else {
            c388901 = new C388901(continuation);
        }
        Object allKeys = c388901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c388901.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(allKeys);
            set = list != null ? CollectionsKt.toSet(list) : null;
            linkedHashMap = new LinkedHashMap();
            c388901.L$0 = this;
            c388901.L$1 = set;
            c388901.L$2 = linkedHashMap;
            c388901.label = 1;
            allKeys = readAllKeys(c388901);
            if (allKeys != coroutine_suspended) {
                sharedPreferencesPlugin = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            linkedHashMap = (Map) c388901.L$2;
            set = (Set) c388901.L$1;
            sharedPreferencesPlugin = (SharedPreferencesPlugin) c388901.L$0;
            ResultKt.throwOnFailure(allKeys);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            key = (Preferences.Key) c388901.L$4;
            it = (Iterator) c388901.L$3;
            map = (Map) c388901.L$2;
            set2 = (Set) c388901.L$1;
            sharedPreferencesPlugin2 = (SharedPreferencesPlugin) c388901.L$0;
            ResultKt.throwOnFailure(allKeys);
        }
        if (SharedPreferencesPluginKt.preferencesFilter(key.toString(), allKeys, set2) && (objTransformPref = SharedPreferencesPluginKt.transformPref(allKeys, sharedPreferencesPlugin2.listEncoder)) != null) {
            map.put(key.toString(), objTransformPref);
        }
        if (it.hasNext()) {
            return map;
        }
        key = (Preferences.Key) it.next();
        c388901.L$0 = sharedPreferencesPlugin2;
        c388901.L$1 = set2;
        c388901.L$2 = map;
        c388901.L$3 = it;
        c388901.L$4 = key;
        c388901.label = 2;
        allKeys = sharedPreferencesPlugin2.getValueByKey(key, c388901);
        Set set3 = (Set) allKeys;
        if (set3 == null) {
            return linkedHashMap;
        }
        set2 = set;
        sharedPreferencesPlugin2 = sharedPreferencesPlugin;
        map = linkedHashMap;
        it = set3.iterator();
        if (it.hasNext()) {
            return map;
        }
        key = (Preferences.Key) it.next();
        c388901.L$0 = sharedPreferencesPlugin2;
        c388901.L$1 = set2;
        c388901.L$2 = map;
        c388901.L$3 = it;
        c388901.L$4 = key;
        c388901.label = 2;
        allKeys = sharedPreferencesPlugin2.getValueByKey(key, c388901);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getValueByKey(final Preferences.Key<?> key, Continuation<Object> continuation) {
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        final InterfaceC41634e<Preferences> data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
        return C41636g.m90884H(new InterfaceC41634e<Object>() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1

            /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {2, 1, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin\n*L\n1#1,222:1\n54#2:223\n275#3:224\n*E\n"})
            public static final class C388932<T> implements InterfaceC41635f {
                final /* synthetic */ Preferences.Key $key$inlined;
                final /* synthetic */ InterfaceC41635f $this_unsafeFlow;

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getValueByKey$$inlined$map$1$2", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C388932.this.emit(null, this);
                    }
                }

                public C388932(InterfaceC41635f interfaceC41635f, Preferences.Key key) {
                    this.$this_unsafeFlow = interfaceC41635f;
                    this.$key$inlined = key;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.$this_unsafeFlow;
                        Object obj3 = ((Preferences) obj).get(this.$key$inlined);
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(obj3, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            @Nullable
            public Object collect(@NotNull InterfaceC41635f<? super Object> interfaceC41635f, @NotNull Continuation continuation2) {
                Object objCollect = data.collect(new C388932(interfaceC41635f, key), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readAllKeys(Continuation<? super Set<? extends Preferences.Key<?>>> continuation) {
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        final InterfaceC41634e<Preferences> data = SharedPreferencesPluginKt.getSharedPreferencesDataStore(context).getData();
        return C41636g.m90884H(new InterfaceC41634e<Set<? extends Preferences.Key<?>>>() { // from class: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1

            /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {2, 1, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SharedPreferencesPlugin.kt\nio/flutter/plugins/sharedpreferences/SharedPreferencesPlugin\n*L\n1#1,222:1\n54#2:223\n270#3:224\n*E\n"})
            public static final class C388942<T> implements InterfaceC41635f {
                final /* synthetic */ InterfaceC41635f $this_unsafeFlow;

                /* JADX INFO: renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$readAllKeys$$inlined$map$1$2", m90122f = "SharedPreferencesPlugin.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C388942.this.emit(null, this);
                    }
                }

                public C388942(InterfaceC41635f interfaceC41635f) {
                    this.$this_unsafeFlow = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.$this_unsafeFlow;
                        Set<Preferences.Key<?>> setKeySet = ((Preferences) obj).asMap().keySet();
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(setKeySet, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            @Nullable
            public Object collect(@NotNull InterfaceC41635f<? super Set<? extends Preferences.Key<?>>> interfaceC41635f, @NotNull Continuation continuation2) {
                Object objCollect = data.collect(new C388942(interfaceC41635f), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, continuation);
    }

    private final void setUp(BinaryMessenger messenger, Context context) {
        this.context = context;
        try {
            SharedPreferencesAsyncApi.INSTANCE.setUp(messenger, this, "data_store");
            this.backend = new SharedPreferencesBackend(messenger, context, this.listEncoder);
        } catch (Exception e11) {
            Log.e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesPlugin", e11);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        setUp(binaryMessenger, applicationContext);
        new LegacySharedPreferencesPlugin().onAttachedToEngine(binding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NotNull FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        SharedPreferencesAsyncApi.Companion companion = SharedPreferencesAsyncApi.INSTANCE;
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        Intrinsics.checkNotNullExpressionValue(binaryMessenger, "getBinaryMessenger(...)");
        companion.setUp(binaryMessenger, null, "data_store");
        SharedPreferencesBackend sharedPreferencesBackend = this.backend;
        if (sharedPreferencesBackend != null) {
            sharedPreferencesBackend.tearDown();
        }
        this.backend = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public SharedPreferencesPlugin(@NotNull SharedPreferencesListEncoder listEncoder) {
        this();
        Intrinsics.checkNotNullParameter(listEncoder, "listEncoder");
        this.listEncoder = listEncoder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object dataStoreSetString(String str, String str2, Continuation<? super Unit> continuation) {
        Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(str);
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        Object objEdit = PreferencesKt.edit(SharedPreferencesPluginKt.getSharedPreferencesDataStore(context), new C388822(keyStringKey, str2, null), continuation);
        if (objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objEdit;
        }
        return Unit.INSTANCE;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void clear(@Nullable List<String> allowList, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(options, "options");
        C41690i.m91067b(null, new C388811(allowList, null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @NotNull
    public Map<String, Object> getAll(@Nullable List<String> allowList, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return (Map) C41690i.m91067b(null, new C388831(allowList, null), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public Boolean getBool(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C41690i.m91067b(null, new C388841(key, this, objectRef, null), 1, null);
        return (Boolean) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public Double getDouble(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C41690i.m91067b(null, new C388861(key, this, objectRef, null), 1, null);
        return (Double) objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public Long getInt(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C41690i.m91067b(null, new C388881(key, this, objectRef, null), 1, null);
        return (Long) objectRef.element;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @NotNull
    public List<String> getKeys(@Nullable List<String> allowList, @NotNull SharedPreferencesPigeonOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return CollectionsKt.toList(((Map) C41690i.m91067b(null, new SharedPreferencesPlugin$getKeys$prefs$1(this, allowList, null), 1, null)).keySet());
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public List<String> getPlatformEncodedStringList(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        List list;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        String string = getString(key, options);
        ArrayList arrayList = null;
        if (string != null && !StringsKt.startsWith$default(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, (Object) null) && StringsKt.startsWith$default(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, (Object) null) && (list = (List) SharedPreferencesPluginKt.transformPref(string, this.listEncoder)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public String getString(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C41690i.m91067b(null, new C388911(key, this, objectRef, null), 1, null);
        return (String) objectRef.element;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Nullable
    public StringListResult getStringList(@NotNull String key, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        String string = getString(key, options);
        if (string == null) {
            return null;
        }
        if (StringsKt.startsWith$default(string, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false, 2, (Object) null)) {
            return new StringListResult(string, StringListLookupResultType.JSON_ENCODED);
        }
        if (StringsKt.startsWith$default(string, SharedPreferencesPluginKt.LIST_PREFIX, false, 2, (Object) null)) {
            return new StringListResult(null, StringListLookupResultType.PLATFORM_ENCODED);
        }
        return new StringListResult(null, StringListLookupResultType.UNEXPECTED_STRING);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setBool(@NotNull String key, boolean value, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        C41690i.m91067b(null, new C388951(key, this, value, null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    @Deprecated(message = "This is just for testing, use `setEncodedStringList`")
    public void setDeprecatedStringList(@NotNull String key, @NotNull List<String> value, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        C41690i.m91067b(null, new C388961(key, SharedPreferencesPluginKt.LIST_PREFIX + this.listEncoder.encode(value), null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDouble(@NotNull String key, double value, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        C41690i.m91067b(null, new C388971(key, this, value, null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setEncodedStringList(@NotNull String key, @NotNull String value, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        C41690i.m91067b(null, new C388981(key, value, null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setInt(@NotNull String key, long value, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        C41690i.m91067b(null, new C388991(key, this, value, null), 1, null);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setString(@NotNull String key, @NotNull String value, @NotNull SharedPreferencesPigeonOptions options) throws InterruptedException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(options, "options");
        C41690i.m91067b(null, new C389001(key, value, null), 1, null);
    }
}
