package p263fg;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: fg.c */
/* JADX INFO: compiled from: HttpExternalCodec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lfg/c;", "Lfg/a;", "<init>", "()V", "Lokhttp3/Response;", "obj", "", "", "", "c", "(Lokhttp3/Response;)Ljava/util/Map;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHttpExternalCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpExternalCodec.kt\ncom/kubi/flutter/network/codec/HttpExternalCodec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n1863#2,2:22\n*S KotlinDebug\n*F\n+ 1 HttpExternalCodec.kt\ncom/kubi/flutter/network/codec/HttpExternalCodec\n*L\n15#1:22,2\n*E\n"})
public final class C37454c extends AbstractC37452a {
    @Override // p263fg.InterfaceC37457f
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> mo84246b(@NotNull Response obj) {
        byte[] bArrBytes;
        Intrinsics.checkNotNullParameter(obj, "obj");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(obj.code()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Pair<? extends String, ? extends String> pair : obj.headers()) {
            linkedHashMap2.put(pair.getFirst(), pair.getSecond());
        }
        Unit unit = Unit.INSTANCE;
        linkedHashMap.put("headers", linkedHashMap2);
        ResponseBody responseBodyBody = obj.body();
        if (responseBodyBody != null && (bArrBytes = responseBodyBody.bytes()) != null) {
            linkedHashMap.put(TtmlNode.TAG_BODY, bArrBytes);
        }
        return linkedHashMap;
    }
}
