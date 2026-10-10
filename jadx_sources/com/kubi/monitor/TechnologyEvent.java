package com.kubi.monitor;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.common.constants.JCommonConstants;
import com.blankj.utilcode.util.NetworkUtils;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p569qq.C43848i;
import p642tq.InterfaceC45064g;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TechnologyEvent.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/monitor/TechnologyEvent;", "", "<init>", "()V", "", "name", "", "b", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", ReportDataTable.COLUMN_PARAMS, "c", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;", "builder", "d", "(Ljava/lang/String;Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)V", "values", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V", "EventParametersBuilder", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class TechnologyEvent {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final TechnologyEvent f35482a = new TechnologyEvent();

    /* JADX INFO: compiled from: TechnologyEvent.kt */
    @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u0019\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;", "", "<init>", "()V", "Lkotlin/Pair;", "Landroid/os/Bundle;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lkotlin/Pair;", "", "key", "value", "", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "", "c", "(Ljava/lang/String;J)V", "", "b", "(Ljava/lang/String;I)V", "", "e", "(Ljava/lang/String;Z)V", "g", "", "f", "(Ljava/lang/String;D)V", "Lkotlin/Pair;", "bundles", "Companion", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class EventParametersBuilder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Pair<Bundle, Bundle> bundles;

        /* JADX INFO: compiled from: TechnologyEvent.kt */
        @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;", "", "()V", "acquire", "Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            @JvmStatic
            @NotNull
            public final EventParametersBuilder acquire() {
                return new EventParametersBuilder(null);
            }
        }

        public /* synthetic */ EventParametersBuilder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public EventParametersBuilder() {
            this.bundles = new Pair<>(new Bundle(), new Bundle());
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Pair<Bundle, Bundle> m42390a() {
            return this.bundles;
        }

        /* JADX INFO: renamed from: b */
        public final void m42391b(@NotNull String key, int value) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.bundles.getFirst().putString(key, String.valueOf(value));
        }

        /* JADX INFO: renamed from: c */
        public final void m42392c(@NotNull String key, long value) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.bundles.getFirst().putString(key, String.valueOf(value));
        }

        /* JADX INFO: renamed from: d */
        public final void m42393d(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Bundle first = this.bundles.getFirst();
            if (value.length() > 100) {
                value = value.substring(0, 100);
                Intrinsics.checkNotNullExpressionValue(value, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            first.putString(key, value);
        }

        /* JADX INFO: renamed from: e */
        public final void m42394e(@NotNull String key, boolean value) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.bundles.getFirst().putString(key, String.valueOf(value));
        }

        /* JADX INFO: renamed from: f */
        public final void m42395f(@NotNull String key, double value) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.bundles.getSecond().putDouble(key, value);
        }

        /* JADX INFO: renamed from: g */
        public final void m42396g(@NotNull String key, long value) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.bundles.getSecond().putDouble(key, value);
        }
    }

    /* JADX INFO: renamed from: com.kubi.monitor.TechnologyEvent$a */
    /* JADX INFO: compiled from: TechnologyEvent.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b*\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b*\u00020\u0004¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/monitor/TechnologyEvent$a;", "", "<init>", "()V", "Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;", "", "b", "(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)V", "", "", "c", "(Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)Ljava/util/Map;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class C19216a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C19216a f35485a = new C19216a();

        /* JADX INFO: renamed from: com.kubi.monitor.TechnologyEvent$a$a */
        /* JADX INFO: compiled from: TechnologyEvent.kt */
        @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NetworkUtils.NetworkType.values().length];
                iArr[NetworkUtils.NetworkType.NETWORK_ETHERNET.ordinal()] = 1;
                iArr[NetworkUtils.NetworkType.NETWORK_2G.ordinal()] = 2;
                iArr[NetworkUtils.NetworkType.NETWORK_3G.ordinal()] = 3;
                iArr[NetworkUtils.NetworkType.NETWORK_4G.ordinal()] = 4;
                iArr[NetworkUtils.NetworkType.NETWORK_5G.ordinal()] = 5;
                iArr[NetworkUtils.NetworkType.NETWORK_WIFI.ordinal()] = 6;
                iArr[NetworkUtils.NetworkType.NETWORK_NO.ordinal()] = 7;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @JvmStatic
        @SuppressLint({"MissingPermission"})
        /* JADX INFO: renamed from: b */
        public static final void m42397b(@NotNull EventParametersBuilder eventParametersBuilder) {
            String str;
            Intrinsics.checkNotNullParameter(eventParametersBuilder, "<this>");
            try {
                NetworkUtils.NetworkType networkTypeM6057e = NetworkUtils.m6057e();
                switch (networkTypeM6057e == null ? -1 : a.$EnumSwitchMapping$0[networkTypeM6057e.ordinal()]) {
                    case 1:
                        str = "ethernet";
                        break;
                    case 2:
                        str = JCommonConstants.Network.NAME_2G;
                        break;
                    case 3:
                        str = JCommonConstants.Network.NAME_3G;
                        break;
                    case 4:
                        str = JCommonConstants.Network.NAME_4G;
                        break;
                    case 5:
                        str = JCommonConstants.Network.NAME_5G;
                        break;
                    case 6:
                        str = "wifi";
                        break;
                    case 7:
                        str = "not_available";
                        break;
                    default:
                        str = "unknown";
                        break;
                }
                eventParametersBuilder.m42393d("network_state", str);
            } catch (Throwable unused) {
                eventParametersBuilder.m42393d("network_state", "unknown");
            }
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, Number> m42398a(@NotNull EventParametersBuilder eventParametersBuilder) {
            Intrinsics.checkNotNullParameter(eventParametersBuilder, "<this>");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Bundle second = eventParametersBuilder.m42390a().getSecond();
            Set<String> setKeySet = second.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "dimensionMap.keySet()");
            for (String key : setKeySet) {
                Object obj = second.get(key);
                if (obj != null && (obj instanceof Number)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    linkedHashMap.put(key, obj);
                }
            }
            return linkedHashMap;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Map<String, Object> m42399c(@NotNull EventParametersBuilder eventParametersBuilder) {
            Intrinsics.checkNotNullParameter(eventParametersBuilder, "<this>");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Bundle first = eventParametersBuilder.m42390a().getFirst();
            Set<String> setKeySet = first.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "metricMap.keySet()");
            for (String key : setKeySet) {
                Object obj = first.get(key);
                if (obj != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    linkedHashMap.put(key, obj);
                }
            }
            return linkedHashMap;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m42386b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        f35482a.m42389a(name, new Bundle(), new Bundle());
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "使用EventParametersBuilder", replaceWith = @ReplaceWith(expression = "FireBaseTracker.track(name){ dimensions() }", imports = {"com.kubi.monitor.firebase.FireBaseTracker"}))
    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m42387c(@NotNull String name, @NotNull Bundle params) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(params, "params");
        f35482a.m42389a(name, params, new Bundle());
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m42388d(@NotNull String name, @NotNull EventParametersBuilder builder) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Pair<Bundle, Bundle> pairM42390a = builder.m42390a();
        f35482a.m42389a(name, pairM42390a.getFirst(), pairM42390a.getSecond());
    }

    /* JADX INFO: renamed from: a */
    public final void m42389a(String name, Bundle params, Bundle values) {
        Iterator<InterfaceC45064g> it = C43848i.f96913a.m96586e().mo32844f().iterator();
        while (it.hasNext()) {
            it.next().mo42442a(name, params, values);
        }
    }
}
