package com.kubi.p110rn.npmimpl;

import android.net.Uri;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RnWebTrackImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0002¨\u0006\n"}, m90084d2 = {"Lcom/kubi/rn/npmimpl/RnWebTrackImpl;", "", "<init>", "()V", "reportWebLoad", "", "eventId", "", "data", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnWebTrackImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnWebTrackImpl.kt\ncom/kubi/rn/npmimpl/RnWebTrackImpl\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,29:1\n29#2:30\n*S KotlinDebug\n*F\n+ 1 RnWebTrackImpl.kt\ncom/kubi/rn/npmimpl/RnWebTrackImpl\n*L\n17#1:30\n*E\n"})
public final class RnWebTrackImpl {
    private final void reportWebLoad(String eventId, Map<String, ? extends Object> data) throws JSONException {
        Uri uri;
        String host;
        Object obj = data.get("url");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || (host = (uri = Uri.parse(str)).getHost()) == null) {
            return;
        }
        String encodedPath = uri.getEncodedPath();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", eventId);
        jSONObject.put("url", str);
        jSONObject.put("host", host);
        jSONObject.put("path", encodedPath);
        C43852m.m96605q(NpmConst.RN_FIREBASE_EVENT, jSONObject);
    }
}
