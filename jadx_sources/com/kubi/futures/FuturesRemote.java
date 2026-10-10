package com.kubi.futures;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.j, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FuturesRemote.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\bJ\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u001b\u0010\u0012\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0013\u0010\nR\u001b\u0010\u0015\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0016\u0010\nR\u001b\u0010\u0018\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0019\u0010\nR\u001b\u0010\u001b\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001c\u0010\nR\u001b\u0010\u001f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b \u0010\n¨\u0006$"}, m90084d2 = {"Lcom/kubi/futures/FuturesRemote;", "", "<init>", "()V", "BATCH_LEVERAGE_ENTRY_VISIBILITY", "", "USE_NEW_STYLE_NUM_INPUT", "closeAllPositionSwitch", "", "getCloseAllPositionSwitch", "()Z", "closeAllPositionSwitch$delegate", "Lkotlin/Lazy;", "ignoreTradePwdSwitch", "getIgnoreTradePwdSwitch", "ignoreTradePwdSwitch$delegate", "isInputFilterEnabled", "isIgnoreTradePwdSwitch", "useNewFuturesContainer", "getUseNewFuturesContainer", "useNewFuturesContainer$delegate", "showOptionsInNewFuturesContainer", "getShowOptionsInNewFuturesContainer", "showOptionsInNewFuturesContainer$delegate", "needReleaseOptionEngine", "getNeedReleaseOptionEngine", "needReleaseOptionEngine$delegate", "modifyEnable", "getModifyEnable", "modifyEnable$delegate", "isModifyEnable", "twapOrderEnabled", "getTwapOrderEnabled", "twapOrderEnabled$delegate", "getBatchLeverageEntryVisibility", "Lcom/kubi/futures/BatchLeverageEntryVisibility;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesRemote.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesRemote.kt\ncom/kubi/futures/FuturesRemote\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,99:1\n35#2,4:100\n39#2:106\n35#2,4:107\n39#2:113\n35#2,4:114\n39#2:120\n35#2,4:121\n39#2:127\n35#2,4:128\n39#2:134\n35#2,4:135\n39#2:141\n35#2,4:142\n39#2:148\n35#2,4:149\n39#2:155\n35#2,4:156\n39#2:162\n44#3,2:104\n44#3,2:111\n44#3,2:118\n44#3,2:125\n44#3,2:132\n44#3,2:139\n44#3,2:146\n44#3,2:153\n44#3,2:160\n*S KotlinDebug\n*F\n+ 1 FuturesRemote.kt\ncom/kubi/futures/FuturesRemote\n*L\n51#1:100,4\n51#1:106\n97#1:107,4\n97#1:113\n37#1:114,4\n37#1:120\n47#1:121,4\n47#1:127\n60#1:128,4\n60#1:134\n67#1:135,4\n67#1:141\n76#1:142,4\n76#1:148\n80#1:149,4\n80#1:155\n89#1:156,4\n89#1:162\n51#1:104,2\n97#1:111,2\n37#1:118,2\n47#1:125,2\n60#1:132,2\n67#1:139,2\n76#1:146,2\n80#1:153,2\n89#1:160,2\n*E\n"})
public final class FuturesRemote {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FuturesRemote f23108a = new FuturesRemote();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f23109b = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FuturesRemote.m25636h());
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy f23110c = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FuturesRemote.m25637q());
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Lazy f23111d = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FuturesRemote.m25642y());
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy f23112e = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FuturesRemote.m25640w());
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Lazy f23113f = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FuturesRemote.m25639v());
        }
    });

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final Lazy f23114g = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FuturesRemote.m25638u());
        }
    });

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Lazy f23115h = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FuturesRemote.m25641x());
        }
    });

    /* JADX INFO: renamed from: com.kubi.futures.j$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.j$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class b extends TypeToken<String> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.j$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class c extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.j$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class d extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.j$e */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class e extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.j$f */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class f extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.j$g */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class g extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.j$h */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class h extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.futures.j$i */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class i extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m25636h() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kumex_close_all_positions_switch", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m25637q() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new c().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("ignoreTradePwdSwitch", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m25638u() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new e().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("futures_modify_order_enable", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m25639v() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new f().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("copy_trading_krn_engine_deinit", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m25640w() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new g().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_futures_new_container_support_options", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m25641x() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new h().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("futures_twap_order_enabled", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m25642y() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new i().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kumex_use_new_futures_container", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final BatchLeverageEntryVisibility m25643i() {
        Object objM20457a;
        BatchLeverageEntryVisibility.Companion companion = BatchLeverageEntryVisibility.INSTANCE;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new b().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_futures_batch_leverage_entry_visibility", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return companion.fromRemoteValue((String) objM20457a);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m25644j() {
        return ((Boolean) f23109b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m25645k() {
        return ((Boolean) f23110c.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m25646l() {
        return ((Boolean) f23114g.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m25647m() {
        return ((Boolean) f23113f.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m25648n() {
        return ((Boolean) f23112e.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m25649o() {
        return ((Boolean) f23115h.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m25650p() {
        return ((Boolean) f23111d.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m25652s() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kc_futures_input_filter_enabled", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m25651r() {
        return m25645k();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m25653t() {
        return m25646l();
    }
}
