package kotlinx.serialization.json.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vg0.AbstractC45541n;
import vg0.AbstractC45542o;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;
import xg0.C46169d0;
import xg0.InterfaceC46188w;
import xg0.InterfaceC46189x;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.d0 */
/* JADX INFO: compiled from: JsonNamesMap.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a-\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\",\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u0006$"}, m90084d2 = {"Lvg0/f;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "", "", "", "b", "(Lvg0/f;Lxg0/a;)Ljava/util/Map;", "descriptor", "e", "(Lxg0/a;Lvg0/f;)Ljava/util/Map;", "index", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lvg0/f;Lxg0/a;I)Ljava/lang/String;", "Lxg0/x;", "m", "(Lvg0/f;Lxg0/a;)Lxg0/x;", "name", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lvg0/f;Lxg0/a;Ljava/lang/String;)I", "", "d", "(Lxg0/a;Lvg0/f;)Z", "i", "suffix", "j", "(Lvg0/f;Lxg0/a;Ljava/lang/String;Ljava/lang/String;)I", "Lkotlinx/serialization/json/internal/z$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/serialization/json/internal/z$a;", "g", "()Lkotlinx/serialization/json/internal/z$a;", "JsonDeserializationNamesKey", "", "getJsonSerializationNamesKey", "JsonSerializationNamesKey", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsonNamesMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n808#2,11:153\n13409#3,2:164\n1#4:166\n*S KotlinDebug\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n*L\n35#1:153,11\n35#1:164,2\n*E\n"})
public final class C41920d0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41963z.a<Map<String, Integer>> f92097a = new C41963z.a<>();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C41963z.a<String[]> f92098b = new C41963z.a<>();

    /* JADX INFO: renamed from: b */
    public static final Map<String, Integer> m91898b(InterfaceC45533f interfaceC45533f, AbstractC46162a abstractC46162a) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zM91900d = m91900d(abstractC46162a, interfaceC45533f);
        m91909m(interfaceC45533f, abstractC46162a);
        int elementsCount = interfaceC45533f.getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            List<Annotation> listMo91528g = interfaceC45533f.mo91528g(i11);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo91528g) {
                if (obj instanceof InterfaceC46188w) {
                    arrayList.add(obj);
                }
            }
            InterfaceC46188w interfaceC46188w = (InterfaceC46188w) CollectionsKt.singleOrNull((List) arrayList);
            if (interfaceC46188w != null && (strArrNames = interfaceC46188w.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zM91900d) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    }
                    m91899c(linkedHashMap, interfaceC45533f, lowerCase2, i11);
                }
            }
            if (zM91900d) {
                lowerCase = interfaceC45533f.mo91527f(i11).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                m91899c(linkedHashMap, interfaceC45533f, lowerCase, i11);
            }
        }
        return linkedHashMap.isEmpty() ? MapsKt.emptyMap() : linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Map<String, Integer> m91901e(@NotNull final AbstractC46162a abstractC46162a, @NotNull final InterfaceC45533f descriptor) {
        Intrinsics.checkNotNullParameter(abstractC46162a, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (Map) C46169d0.m101785a(abstractC46162a).m92023b(descriptor, f92097a, new Function0() { // from class: kotlinx.serialization.json.internal.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C41920d0.m91902f(descriptor, abstractC46162a);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final C41963z.a<Map<String, Integer>> m91903g() {
        return f92097a;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m91904h(@NotNull InterfaceC45533f interfaceC45533f, @NotNull AbstractC46162a json, int i11) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        m91909m(interfaceC45533f, json);
        return interfaceC45533f.mo91527f(i11);
    }

    /* JADX INFO: renamed from: i */
    public static final int m91905i(@NotNull InterfaceC45533f interfaceC45533f, @NotNull AbstractC46162a json, @NotNull String name) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        if (m91900d(json, interfaceC45533f)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return m91908l(interfaceC45533f, json, lowerCase);
        }
        m91909m(interfaceC45533f, json);
        int iMo91524c = interfaceC45533f.mo91524c(name);
        return (iMo91524c == -3 && json.getConfiguration().getUseAlternativeNames()) ? m91908l(interfaceC45533f, json, name) : iMo91524c;
    }

    /* JADX INFO: renamed from: j */
    public static final int m91906j(@NotNull InterfaceC45533f interfaceC45533f, @NotNull AbstractC46162a json, @NotNull String name, @NotNull String suffix) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int iM91905i = m91905i(interfaceC45533f, json, name);
        if (iM91905i != -3) {
            return iM91905i;
        }
        throw new SerializationException(interfaceC45533f.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m91907k(InterfaceC45533f interfaceC45533f, AbstractC46162a abstractC46162a, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return m91906j(interfaceC45533f, abstractC46162a, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static final InterfaceC46189x m91909m(@NotNull InterfaceC45533f interfaceC45533f, @NotNull AbstractC46162a json) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.areEqual(interfaceC45533f.getKind(), AbstractC45542o.a.f102630a)) {
            json.getConfiguration().m101797l();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m91899c(Map<String, Integer> map, InterfaceC45533f interfaceC45533f, String str, int i11) {
        String str2;
        if (Intrinsics.areEqual(interfaceC45533f.getKind(), AbstractC45541n.b.f102629a)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i11));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + interfaceC45533f.mo91527f(i11) + " is already one of the names for " + str2 + ' ' + interfaceC45533f.mo91527f(((Number) MapsKt.getValue(map, str)).intValue()) + " in " + interfaceC45533f);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m91900d(AbstractC46162a abstractC46162a, InterfaceC45533f interfaceC45533f) {
        if (abstractC46162a.getConfiguration().getDecodeEnumsCaseInsensitive() && Intrinsics.areEqual(interfaceC45533f.getKind(), AbstractC45541n.b.f102629a)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final Map m91902f(InterfaceC45533f interfaceC45533f, AbstractC46162a abstractC46162a) {
        return m91898b(interfaceC45533f, abstractC46162a);
    }

    /* JADX INFO: renamed from: l */
    public static final int m91908l(InterfaceC45533f interfaceC45533f, AbstractC46162a abstractC46162a, String str) {
        Integer num = m91901e(abstractC46162a, interfaceC45533f).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }
}
